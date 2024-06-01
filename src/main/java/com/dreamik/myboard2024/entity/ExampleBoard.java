package com.dreamik.myboard2024.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="test_board_jpa")
public class ExampleBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String title;
    @Column(length = 30, nullable = false)
    private String writer;
    @Column
    private LocalDateTime createdDate;
}
