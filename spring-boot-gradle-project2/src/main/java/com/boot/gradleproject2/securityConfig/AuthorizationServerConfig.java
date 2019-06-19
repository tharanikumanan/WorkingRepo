/**
 * 
 */
package com.boot.gradleproject2.securityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.approval.UserApprovalHandler;
import org.springframework.security.oauth2.provider.token.TokenStore;


/**
 * @author tkumana
 *
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
	
	private static String REALM="MY_OAUTH_REALM";
	 
	@Autowired
	private TokenStore tokenstore;
	
	@Autowired
	private UserApprovalHandler userApproverHandler;
	
	 @Autowired
	 @Qualifier("authenticationManagerBean")
	 private AuthenticationManager authenticationManager;

	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
		security.realm(REALM+"/client");
	}

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory().withClient("MY_TRUSTED_CLIENT").authorizedGrantTypes("password","authorization_token","referesh_token","implicit").authorities("ROLE_CLIENT","ROLE_TRUSTED_CLIENT").scopes("read","write","trust").secret("secret").accessTokenValiditySeconds(120).refreshTokenValiditySeconds(1200);
		
	}

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.tokenStore(tokenstore).userApprovalHandler(userApproverHandler).authenticationManager(authenticationManager);
		
	}
	

}
