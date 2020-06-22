package com.example.store.dao;

import com.example.store.model.Storage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StorageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Storage record);

    int insertSelective(Storage record);

    Storage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Storage record);

    int updateByPrimaryKey(Storage record);
}