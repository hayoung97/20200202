package com.example.sbs.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.sbs.demo.dto.Article;

@Mapper
public interface ArticleDao2 {
	
	public List<Article> getAllArticles();
	public void insertArticle(Article a);
	public void updateArticle(int id, String title, String body);
	public void deleteArticle(int id);
}
