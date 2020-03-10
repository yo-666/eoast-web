package com.example.mapper;

import com.example.entity.Member;
import org.apache.ibatis.annotations.Mapper;

import javax.xml.ws.Service;
import java.util.List;

@Mapper
public interface MemberMapper {

    /*
    改专业
    {tableName}表名
    {performance}专业
    {key_}表中唯一标识
    */
    void updatePerformance(String tableName, String performance, int key_);

    /*
    改职务
    {tableName}表名
    {position}职务
    {key_}表中唯一标识
    */
    void updatePosition(String tableName, String position, int key_);

    /*
    改部门
    {tableName}表名
    {apartment}部门
    {key_}表中唯一标识
    */
    void updateApartment(String tableName, String apartment, int key_);

    /*
    查找所有
    {tableName}表名
     */
    List<Member> getAll(String tableName);

    /*
    按部门查询
    {tableName}表名
    {choice}部门 1-电子部；2-计算机部；3-多媒体办公中心
    */
    List<Member> getByApartment(String tableName, String choice);

    /*
    创建[社员]并从[招新]中导入记录1 电子部
    {sourceName}源表名
    {objectName}目标表名
    */
    void addMember1(String sourceTable, String objectTable);

    /*
    创建[社员]并从[招新]中导入记录2 计算机部
    {sourceName}源表名
    {objectName}目标表名
    */
    void addMember2(String sourceTable, String objectTable);

    /*
    创建[社员]并从[招新]中导入记录3 多媒体办公中心
    {sourceName}源表名
    {objectName}目标表名
    */
    void addMember3(String sourceTable, String objectTable);

    /*
    添加默认值1 电子部
    {tableName}表名
     */
    void updateAptAndPst1(String tableName);

    /*
    添加默认值1 电子部
    {tableName}表名
     */
    void updateAptAndPst2(String tableName);

    /*
    添加默认值1 电子部
    {tableName}表名
     */
    void updateAptAndPst3(String tableName);


}
