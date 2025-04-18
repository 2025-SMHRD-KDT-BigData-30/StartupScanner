package com.smhrd.db;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.model.KakaoDTO;

@Mapper
public interface CCMapper {
	public KakaoDTO checkAcount(String id);
	public KakaoDTO join(String id, String name);
}
