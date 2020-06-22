package com.example.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.store.model.Storage;
import com.example.store.dao.StorageMapper;
@Service
public class StorageService{

    @Autowired
    private StorageMapper storageMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return storageMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Storage record) {
        return storageMapper.insert(record);
    }

    
    public int insertSelective(Storage record) {
        return storageMapper.insertSelective(record);
    }

    
    public Storage selectByPrimaryKey(Long id) {
        return storageMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Storage record) {
        return storageMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Storage record) {
        return storageMapper.updateByPrimaryKey(record);
    }

}
