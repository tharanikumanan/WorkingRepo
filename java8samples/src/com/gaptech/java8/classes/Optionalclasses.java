package com.gaptech.java8.classes;

import com.gaptech.java8.beans.Article;
import com.gaptech.java8.services.ArticleService;

public class Optionalclasses {
	
	static ArticleService articleService = new ArticleService();
	
public static void main(String[] args)
{
	Article article =articleService.getBookInfo("DUMMY");
	System.out.println("ID:"+article.getBookId()+"  NAME:"+article.getBookName()+" BookType:"+article.getBookType());

}

}
