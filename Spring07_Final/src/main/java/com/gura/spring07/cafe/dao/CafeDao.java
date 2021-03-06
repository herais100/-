package com.gura.spring07.cafe.dao;

import java.util.List;

import com.gura.spring07.cafe.dto.CafeDto;

public interface CafeDao {
	public int getCount(CafeDto dto);
	public List<CafeDto> getList(CafeDto dto);
	public void insert(CafeDto dto);
	public CafeDto getData(CafeDto dto);
	public void addViewCount(int num);
	public void delete(int num);
	public CafeDto getData(int num);
	public void update(CafeDto dto);
}

















