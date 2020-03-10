package com.example.service;

import com.example.mapper.TableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableService {

    @Autowired
    TableMapper tableMapper;

    /*
    创建表1 applicantXXXX
    {tableName}表名
     */
    public void creatTable1(String tableName){
        tableMapper.creatTable1(tableName);
    }

    /*
    创建表2 memberXXXX
    {tableName}表名
     */
    public void creatTable2(String tableName){
        tableMapper.creatTable2(tableName);
    }

    /*
    删除表
    {tableName}表名
     */
    public void deleteTable(String tableName){
        tableMapper.deleteTable(tableName);
    }
}
