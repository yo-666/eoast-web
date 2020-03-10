package com.example.conrtoller;


import com.example.entity.Member;
import com.example.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Member")
public class MemberController {

    @Autowired
    MemberService memberService;

    /*
    改专业
    {tableName}表名
    {performance}专业
    {key_}表中唯一标识
    */
    @RequestMapping("/updatePerformance")
    void updatePerformance(String tableName, String performance, int key_) {
        memberService.updatePerformance(tableName, performance, key_);
    }

    /*
    改职务
    {tableName}表名
    {position}职务
    {key_}表中唯一标识
     */
    @RequestMapping("/updatePosition")
    void updatePosition(String tableName, String position, int key_) {
        memberService.updatePosition(tableName, position, key_);
    }

    /*
    改部门
    {tableName}表名
    {apartment}部门
    {key_}表中唯一标识
    */
    @RequestMapping("/updateApartment")
    void updateApartment(String tableName, String apartment, int key_) {
        memberService.updateApartment(tableName, apartment, key_);
    }

    /*
    查找所有
    {tableName}表名
     */
    @RequestMapping("/getAll")
    List<Member> getAll(String tableName) {
        return memberService.getAll(tableName);
    }

    /*
    按部门查询
    {tableName}表名
    {choice}部门 1-电子部；2-计算机部；3-多媒体办公中心
    */
    @RequestMapping("/getByApartment")
    List<Member> getByApartment(String tableName, String choice) {
        return memberService.getByApartment(tableName, choice);
    }

    /*
    导入人员名单
    {tableName}表名
    表中对应各项

    void addMember(String sourceName, String objectName) {
        memberService.addMember(sourceName,objectName);
    }
    @RequestMapping("/addMember1")
    void addMember1(String sourceTable,String objectTable) {
        memberService.addMember1(sourceTable,objectTable);
    }*/

    /*
    创建[社员]并从[招新]中导入记录1 电子部
    {sourceName}源表名
    {objectName}目标表名
    */
    @RequestMapping("/addMember1")
    void addMember1(String sourceTable, String objectTable) {
        memberService.addMember1(sourceTable, objectTable);
    }

    /*
    创建[社员]并从[招新]中导入记录2 计算机部
    {sourceName}源表名
    {objectName}目标表名
    */
    @RequestMapping("/addMember2")
    void addMember2(String sourceTable, String objectTable){
        memberService.addMember2(sourceTable, objectTable);
    }

    /*
    创建[社员]并从[招新]中导入记录3 多媒体办公中心
    {sourceName}源表名
    {objectName}目标表名
    */
    @RequestMapping("/addMember3")
    void addMember3(String sourceTable, String objectTable){
        memberService.addMember3(sourceTable, objectTable);
    }

    /*
    添加默认值1 电子部
    {tableName}表名
     */
    @RequestMapping("/updateAptAndPst1")
    public void updateAptAndPst1(String tableName){
        memberService.updateAptAndPst1(tableName);
    }

    /*
    添加默认值1 电子部
    {tableName}表名
     */
    @RequestMapping("/updateAptAndPst2")
    public void updateAptAndPst2(String tableName){
        memberService.updateAptAndPst2(tableName);
    }

    /*
    添加默认值1 电子部
    {tableName}表名
     */
    @RequestMapping("/updateAptAndPst3")
    public void updateAptAndPst3(String tableName){
        memberService.updateAptAndPst3(tableName);
    }

}
