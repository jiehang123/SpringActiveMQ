package com.jinjie.service;

import com.jinjie.bean.Post;

import java.util.List;

public interface PostService {
    public List<Post> postList();
    public void deletePost();
}
