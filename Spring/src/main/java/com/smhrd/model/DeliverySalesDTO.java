package com.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// => lombok
@Data // getter, setter 연결 Annotation
@AllArgsConstructor // 생성자 메소드를 연결하기 위한 Annotation
@NoArgsConstructor // 기본 생성자 메소드를 연결하기 위한 Annotation
public class DeliverySalesDTO {
    private String 구;
    private String 업종코드;
    private String 업종이름;
    private String 성별;
    private String 검색업종;    
    private String y23_12;
    private String y24_01;
    private String y24_02;
    private String y24_03;
    private String y24_04;
    private String y24_05;
    private String y24_06;
    private String y24_07;
    private String y24_08;
    private String y24_09;
    private String y24_10;
    private String y24_11;
    private String y24_12;
}