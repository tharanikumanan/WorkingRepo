package com.gaptech.java8.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import com.gaptech.java8.beans.Article;
import com.gaptech.java8.beans.BookType;

public class ArticleService {
	
	ArrayList<Article> articles = new ArrayList<Article>(Arrays.asList(new Article("1","JAVA",BookType.TECHNOLOGY),new Article("2", "Dummy", BookType.FUN)));
	
	public Article getBookInfo(String bookName)
	{
		Optional<String> bookNameNullCheck = Optional.ofNullable(bookName);
		
		if(bookNameNullCheck.isPresent())
		{
			return articles.stream().filter(e->e.getBookName().equalsIgnoreCase(bookName)).findAny().get();
		}
			 
		return null;
		
	}

}
