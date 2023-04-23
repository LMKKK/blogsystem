package com.liumingkai.service;

import com.github.pagehelper.PageInfo;
import com.liumingkai.model.domain.Article;

import java.util.List;

public interface IArticleService {
    // 分页查询文章列表
    public PageInfo<Article> selectArticleWithPage(Integer page, Integer count);

    // 统计前10的热度文章信息
    public List<Article> getHeatArticles();// 根据文章id查询单个文章详情
    public Article selectArticleWithId(Integer id);
    // 发布文章
    public void publish(Article article);
    // 根据主键更新文章
    public void updateArticleWithId(Article article);

    // 删除文章
    void deleteArticleWithId(int id);
}