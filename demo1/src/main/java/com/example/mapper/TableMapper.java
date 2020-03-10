package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TableMapper {

    /*
    创建表1 applicantXXXX
    {tableName}表名
     */
    void creatTable1(String tableName);

    /*
    创建表2 memberXXXX
    {tableName}表名
     */
    void creatTable2(String tableName);

    /*
    删除表
    {tableName}表名
     */
    void deleteTable(String tableName);

}
