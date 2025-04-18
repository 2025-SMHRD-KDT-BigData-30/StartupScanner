package com.smhrd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.db.DataMapper;
import com.smhrd.model.CommercialSalesDTO;
import com.smhrd.model.DeliverySalesDTO;

@RestController
@CrossOrigin
public class GraphController {

    @Autowired
    DataMapper mapper;

    @GetMapping("/getComData")
    public CommercialSalesDTO getComData(
            @RequestParam String dong,
            @RequestParam String cate
    ) {
        // 상가 데이터 로드
        CommercialSalesDTO 상가 = mapper.load상가Data(dong, cate);

        System.out.println(상가);
        
        return 상가; // 상가 데이터 반환
    }

    @GetMapping("/getDelDataM")
    public DeliverySalesDTO getDelDataM(
            @RequestParam String dong,
            @RequestParam String cate
    ) {
        // 배달 데이터 로드
        DeliverySalesDTO 배달M = mapper.load배달DataM(dong, cate);

        System.out.println(배달M);
        
        return 배달M; // 배달 데이터 반환
    }
    
    @GetMapping("/getDelDataF")
    public DeliverySalesDTO getDelDataF(
    		@RequestParam String dong,
    		@RequestParam String cate
    		) {
    	// 배달 데이터 로드
    	DeliverySalesDTO 배달F = mapper.load배달DataF(dong, cate);
    	
    	System.out.println(배달F);
    	
    	return 배달F; // 배달 데이터 반환
    }

}
