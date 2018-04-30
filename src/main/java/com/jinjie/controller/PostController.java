package com.jinjie.controller;

import com.jinjie.bean.Post;
import com.jinjie.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    public PostService postService;

    @RequestMapping(value = "/post", method = RequestMethod.GET)
    @ResponseBody
    public List<Post> postItems() {
        List<Post> posts = postService.postList();
        return posts;
    }
}
