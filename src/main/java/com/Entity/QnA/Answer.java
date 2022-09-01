package com.Entity.QnA;


import com.Entity.BaseTime.BaseTimeEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    @JoinColumn
    private Question question;


}
