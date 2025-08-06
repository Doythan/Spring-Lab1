package com.mtcoding.boardprojectdemo.domain.board;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@Table(name = "board_tb")
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;

    public Board(Integer id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
