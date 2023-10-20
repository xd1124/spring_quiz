package com.quiz.lesson03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.quiz.lesson03.domain.RealEstate;

@Repository
public interface RealEstateMapper {
	public RealEstate selectRealEstateById(int id);
	
	public List<RealEstate> selectRealEstateByRentPrice(
			@Param("rentPrice123") int rentPrice);
	
	public List<RealEstate> selectRealEstateByAreaPrice(
			@Param("area11") int area,
			@Param("price22") int price);
	
	// Q2 insert
	public int insertRealEstate(RealEstate realEstate);
	
	public int insertRealEstateAsField(
			@Param("realtorId") int realtorId,
			@Param("address1") String address,
			@Param("area2") int area,
			@Param("type3") String type,
			@Param("price4") int price,
			@Param("rentPrice5") Integer rentPrice
			);
	
	// Q3 update
	public int updateRealEstateById(
			@Param("id") int id,
			@Param("type") String type,
			@Param("price") int price
			);
	
	// Q4 delete
	public int deleteRealEstateById(
			@Param("id") int id);
}


