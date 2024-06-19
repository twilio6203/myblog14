package com.myblog.myblog13.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
@Data


public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private  String title;
    private  String description;
    private  String content;
}
