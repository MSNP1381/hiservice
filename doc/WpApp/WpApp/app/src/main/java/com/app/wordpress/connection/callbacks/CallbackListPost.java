package com.app.wordpress.connection.callbacks;

import java.util.ArrayList;
import java.util.List;

import com.app.wordpress.model.Post;

public class CallbackListPost {

    public String status = "";
    public int count = -1;
    public int count_total = -1;
    public int pages = -1;
    public List<Post> posts = new ArrayList<>();
}
