package com.example.service;

import com.example.entity.Member;
import com.example.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    MemberMapper memberMapper;


    /*
    改专业
    {tableName}表名
    {performance}专业
    {key_}表中唯一标识
    */
    public void updatePerformance(String tableName, String performance, int key_) {
        memberMapper.updatePerformance(tableName, performance, key_);
    }

    /*
    改职务
    {tableName}表名
    {position}职务
    {key_}表中唯一标识
     */
    public void updatePosition(String tableName, String position, int key_) {
        memberMapper.updatePosition(tableName, position, key_);
    }

    /*
    改部门
    {tableName}表名
    {apartment}部门
    {key_}表中唯一标识
    */
    public void updateApartment(String tableName, String apartment, int key_) {
        memberMapper.updateApartment(tableName, apartment, key_);
    }

    /*
    查找所有
    {tableName}表名
     */
    public List<Member> getAll(String tableName) {
        return memberMapper.getAll(tableName);
    }

    /*
    按部门查询
    {tableName}表名
    {choice}部门 1-电子部；2-计算机部；3-多媒体办公中心
    */
    public List<Member> getByApartment(String tableName, String choice) {
        return memberMapper.getByApartment(tableName, choice);
    }

    /*
    创建[社员]并从[招新]中导入记录1 电子部
    {sourceName}源表名
    {objectName}目标表名
    */
    public void addMember1(String sourceTable, String objectTable) {
        memberMapper.addMember1(sourceTable, objectTable);
    }

    /*
    创建[社员]并从[招新]中导入记录2 计算机部
    {sourceName}源表名
    {objectName}目标表名
    */
    public void addMember2(String sourceTable, String objectTable){
        memberMapper.addMember2(sourceTable, objectTable);
    }

    /*
    创建[社员]并从[招新]中导入记录3 多媒体办公中心
    {sourceName}源表名
    {objectName}目标表名
    */
    public void addMember3(String sourceTable, String objectTable){
        memberMapper.addMember3(sourceTable, objectTable);
    }

    /*
    添加默认值1 电子部
    {tableName}表名
     */
    public void updateAptAndPst1(String tableName){
        memberMapper.updateAptAndPst1(tableName);
    }

    /*
    添加默认值1 电子部
    {tableName}表名
     */
    public void updateAptAndPst2(String tableName){
        memberMapper.updateAptAndPst2(tableName);
    }

    /*
    添加默认值1 电子部
    {tableName}表名
     */
    public void updateAptAndPst3(String tableName){
        memberMapper.updateAptAndPst3(tableName);
    }

}
