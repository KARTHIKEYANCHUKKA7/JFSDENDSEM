package com.klef.jfsd.exam.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.klef.jfsd.exam.model.Comment;

@Service
public class CommentServiceImpl implements CommentService {

    private static final String COMMENTS_API_URL = "https://jsonplaceholder.typicode.com/comments";

   

	@Override
	public List<Comment> getAllComments() {
		 RestTemplate restTemplate = new RestTemplate();
	        Comment[] comments = restTemplate.getForObject(COMMENTS_API_URL, Comment[].class);
	        return Arrays.asList(comments);
	    }
}
