package com.example.service;

import com.example.entity.Applicant;
import com.example.mapper.ApplicantMapper;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    ApplicantMapper applicantMapper;

    /*
   查所有
   {tableName}表名
    */
    public List<Applicant> getAll(String tableName) {
        return applicantMapper.getAll(tableName);
    }

    /*
    按部门查询
    {tableName}表名
    {choice}部门 1-电子部；2-计算机部；3-多媒体办公中心
    */
    public List<Applicant> getByApartment(String tableName, String choice) {
        return applicantMapper.getByApartment(tableName, choice);
    }

    /*
    报名
    各参数与[招新]表对应
     */
    public void addApplicant1(String tableName, String id, String name, String performance, String sex) {
        applicantMapper.addApplicant1(tableName, id, name, performance, sex);
    }

    public void addApplicant2(String tableName,String id,String email, String tell, String choice1, String choice2, String message) {
        applicantMapper.addApplicant2(tableName,id,email,tell,choice1,choice2,message);
    }


    /*
    删除记录
    {tableName}表名
    {key_}表中唯一标识
     */
    public void deleteApplicant(String tableName, int key_) {
        applicantMapper.deleteApplicant(tableName, key_);
    }

    /*
    导入初试成绩1
    {tableName}表名
    {key_}表中唯一标识
    {firstGrade1}初试成绩1
     */
    public void updateFirstGrade1(String tableName, int key_, int firstGrade1) {
        applicantMapper.updateFirstGrade1(tableName, key_, firstGrade1);
    }

    /*
   导入初试成绩2 计算机部成绩
   {tableName}表名
   {key_}表中唯一标识
   {firstGrade2}初试成绩2
    */
    public void updateFirstGrade2(String tableName, int key_, int firstGrade2) {
        applicantMapper.updateFirstGrade2(tableName, key_, firstGrade2);
    }

    /*
    导入初试成绩3 多媒体办公中心成绩
    {tableName}表名
    {key_}表中唯一标识
    {firstGrade3}初试成绩3
     */
    public void updateFirstGrade3(String tableName, int key_, int firstGrade3) {
        applicantMapper.updateFirstGrade3(tableName, key_, firstGrade3);
    }

    /*
    导入复试成绩1 电子部成绩
    {tableName}表名
    {key_}表中唯一标识
    {retrialGrade1}复试成绩1
     */
    public void updateRetrialGrade1(String tableName, int key_, int retrialGrade1) {
        applicantMapper.updateRetrialGrade1(tableName, key_, retrialGrade1);
    }

    /*
    导入复试成绩2 计算机部成绩
    {tableName}表名
    {key_}表中唯一标识
    {retrialGrade2}复试成绩2
     */
    public void updateRetrialGrade2(String tableName, int key_, int retrialGrade2) {
        applicantMapper.updateRetrialGrade2(tableName, key_, retrialGrade2);
    }

    /*
    导入复试成绩3 多媒体办公中心成绩
    {tableName}表名
    {key_}表中唯一标识
    {retrialGrade3}复试成绩3
     */
    public void updateRetrialGrade3(String tableName, int key_, int retrialGrade3) {
        applicantMapper.updateRetrialGrade3(tableName, key_, retrialGrade3);
    }

    /*
   导入复试评价1 电子部
   {tableName}表名
   {key_}表中唯一标识
   {retrialAppraise1}复试评价1
    */
    public void updateRetrialAppraise1(String tableName, int key_, String retrialAppraise1) {
        applicantMapper.updateRetrialAppraise1(tableName, key_, retrialAppraise1);
    }

    /*
    导入复试评价2 计算机部
    {tableName}表名
    {key_}表中唯一标识
    {retrialAppraise2}复试评价2
    */
    public void updateRetrialAppraise2(String tableName, int key_, String retrialAppraise2) {
        applicantMapper.updateRetrialAppraise2(tableName, key_, retrialAppraise2);
    }

    /*
    导入复试评价3 多媒体办公中心
    {tableName}表名
    {key_}表中唯一标识
    {retrialAppraise3}复试评价3
    */
    public void updateRetrialAppraise3(String tableName, int key_, String retrialAppraise3) {
        applicantMapper.updateRetrialAppraise3(tableName, key_, retrialAppraise3);
    }

    /*
    确定部门录取1 电子部
    {tableName}表名
    {key_}表中唯一标识
    {index}录取分级 1-确定录取；2-确定不录取；3-待定
     */
    public void updateAdmit1(String tableName, int key_, int index) {
        applicantMapper.updateAdmit1(tableName, key_, index);
    }

    /*
    确定部门录取2 计算机部
    {tableName}表名
    {key_}表中唯一标识
    {index}录取分级 1-确定录取；2-确定不录取；3-待定
     */
    public void updateAdmit2(String tableName, int key_, int index) {
        applicantMapper.updateAdmit2(tableName, key_, index);
    }

    /*
    确定部门录取3 多媒体办公中心
    {tableName}表名
    {key_}表中唯一标识
    {index}录取分级 1-确定录取；2-确定不录取；3-待定
     */
    public void updateAdmit3(String tableName, int key_, int index) {
        applicantMapper.updateAdmit3(tableName, key_, index);
    }

    /*
    部门优先考虑1 电子部
    {tableName}表名
    {key_}表中唯一标识
    {index}优先考虑分级 1-挺想要的；2-也不是非要不可
     */
    public void updatePriority1(String tableName, int key_, int index) {
        applicantMapper.updatePriority1(tableName, key_, index);
    }

    /*
    部门优先考虑2 计算机部
    {tableName}表名
    {key_}表中唯一标识
    {index}优先考虑分级 1-挺想要的；2-也不是非要不可
     */
    public void updatePriority2(String tableName, int key_, int index) {
        applicantMapper.updatePriority2(tableName, key_, index);
    }

    /*
    部门优先考虑3 多媒体办公中心
    {tableName}表名
    {key_}表中唯一标识
    {index}优先考虑分级 1-挺想要的；2-也不是非要不可
     */
    public void updatePriority3(String tableName, int key_, int index) {
        applicantMapper.updatePriority3(tableName, key_, index);
    }

    /*
    最终录取1 电子部
    {tableName}表名
    {key_}表中唯一标识
    {index}最终录取标志 1
     */
    public void updateFinalAdmit1(String tableName, int key_) {
        applicantMapper.updateFinalAdmit1(tableName, key_);
    }

    /*
    最终录取2 计算机部
    {tableName}表名
    {key_}表中唯一标识
    {index}最终录取标志 1
     */
    public void updateFinalAdmit2(String tableName, int key_) {
        applicantMapper.updateFinalAdmit2(tableName, key_);
    }

    /*
    最终录取3 多媒体办公中心
    {tableName}表名
    {key_}表中唯一标识
    {index}最终录取标志 1
    */
    public void updateFinalAdmit3(String tableName, int key_) {
        applicantMapper.updateFinalAdmit3(tableName, key_);
    }

}
