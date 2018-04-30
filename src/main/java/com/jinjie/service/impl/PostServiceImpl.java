package com.jinjie.service.impl;

import com.jinjie.bean.Post;
import com.jinjie.dao.PostDao;
import com.jinjie.dao.impl.PostDaoImpl;
import com.jinjie.service.PostService;

import java.util.List;

public class PostServiceImpl implements PostService {

    private PostDao postDao;

    @Override
    public List<Post> postList() {
        return postDao.queryPost();
    }

    @Override
    public void deletePost() {

    }

    public void setPostDao(PostDaoImpl postDao) {
        this.postDao = postDao;
    }
}
