package com.example.sbs.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sbs.demo.dao.ArticleDao2;
import com.example.sbs.demo.dto.Article;

@Controller
public class ArticleController {

	@Autowired
	ArticleDao2 dao2;
	
	@RequestMapping("getArticles")
	String getArticle(Model model) {
		//dao2.getAllArticles()
		
		List<Article> article = dao2.getAllArticles();
		model.addAttribute("article", article);
		return "list";
		
	}
	
	@RequestMapping("addArticle")
	@ResponseBody
	String addArticle() {
		
		Article a = new Article();
		a.setTitle("제목1");
		a.setBody("내용1");
		
		dao2.insertArticle(a);
		
		return "게시물이 추가되었습니다.";
	}
	
	@RequestMapping("editArticle")
	@ResponseBody
	String editArticle() {
		
		int targetId = 1;
		String title = "변경된 제목";
		String body = "변경된 내용";
		
		dao2.updateArticle(targetId, title, body);
		
		return "게시물이 변경되었습니다.";
	}
	
	@RequestMapping("removeArticle")
	@ResponseBody
	String removeArticle() {
		
		int targetId = 5;
		
		dao2.deleteArticle(targetId);
		
		return "게시물이 삭제되었습니다.";
	}
}
