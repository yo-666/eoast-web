package com.example.mapper;

import com.example.entity.Applicant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApplicantMapper {
    /*
    查所有
    {tableName}表名
     */
    List<Applicant> getAll(String tableName);

    /*
    按部门查询
    {tableName}表名
    {choice}部门 1-电子部；2-计算机部；3-多媒体办公中心
    */
    List<Applicant> getByApartment(String tableName, String choice);

    /*
    报名1 & 报名2
    各参数与[招新]表对应
     */
    void addApplicant1(String tableName, String id, String name, String performance, String sex);

    void addApplicant2(String tableName,String id,String email, String tell, String choice1, String choice2, String message);

    /*
    删除记录
    {tableName}表名
    {key_}表中唯一标识
     */
    void deleteApplicant(String tableName, int key_);

    /*
    导入初试成绩1 电子部成绩
    {tableName}表名
    {key_}表中唯一标识
    {firstGrade1}初试成绩1
     */
    void updateFirstGrade1(String tableName, int key_, int firstGrade1);

    /*
    导入初试成绩2 计算机部成绩
    {tableName}表名
    {key_}表中唯一标识
    {firstGrade2}初试成绩2
     */
    void updateFirstGrade2(String tableName, int key_, int firstGrade2);

    /*
    导入初试成绩3 多媒体办公中心成绩
    {tableName}表名
    {key_}表中唯一标识
    {firstGrade3}初试成绩3
     */
    void updateFirstGrade3(String tableName, int key_, int firstGrade3);

    /*
    导入复试成绩1 电子部成绩
    {tableName}表名
    {key_}表中唯一标识
    {retrialGrade1}复试成绩1
     */
    void updateRetrialGrade1(String tableName, int key_, int retrialGrade1);

    /*
    导入复试成绩2 计算机部成绩
    {tableName}表名
    {key_}表中唯一标识
    {retrialGrade2}复试成绩2
     */
    void updateRetrialGrade2(String tableName, int key_, int retrialGrade2);

    /*
    导入复试成绩3 多媒体办公中心成绩
    {tableName}表名
    {key_}表中唯一标识
    {retrialGrade3}复试成绩3
     */
    void updateRetrialGrade3(String tableName, int key_, int retrialGrade3);

    /*
    导入复试评价1 电子部
    {tableName}表名
    {key_}表中唯一标识
    {retrialAppraise1}复试评价1
     */
    void updateRetrialAppraise1(String tableName, int key_, String retrialAppraise1);

    /*
    导入复试评价2 计算机部
    {tableName}表名
    {key_}表中唯一标识
    {retrialAppraise2}复试评价2
    */
    void updateRetrialAppraise2(String tableName, int key_, String retrialAppraise2);

    /*
    导入复试评价3 多媒体办公中心
    {tableName}表名
    {key_}表中唯一标识
    {retrialAppraise3}复试评价3
    */
    void updateRetrialAppraise3(String tableName, int key_, String retrialAppraise3);

    /*
    确定部门录取1 电子部
    {tableName}表名
    {key_}表中唯一标识
    {index}录取分级 1-确定录取；2-确定不录取；3-待定
     */
    void updateAdmit1(String tableName, int key_, int index);

    /*
    确定部门录取2 计算机部
    {tableName}表名
    {key_}表中唯一标识
    {index}录取分级 1-确定录取；2-确定不录取；3-待定
     */
    void updateAdmit2(String tableName, int key_, int index);

    /*
    确定部门录取3 多媒体办公中心
    {tableName}表名
    {key_}表中唯一标识
    {index}录取分级 1-确定录取；2-确定不录取；3-待定
     */
    void updateAdmit3(String tableName, int key_, int index);

    /*
    部门优先考虑1 电子部
    {tableName}表名
    {key_}表中唯一标识
    {index}优先考虑分级 1-挺想要的；2-也不是非要不可
     */
    void updatePriority1(String tableName, int key_, int index);

    /*
    部门优先考虑2 计算机部
    {tableName}表名
    {key_}表中唯一标识
    {index}优先考虑分级 1-挺想要的；2-也不是非要不可
     */
    void updatePriority2(String tableName, int key_, int index);

    /*
    部门优先考虑3 多媒体办公中心
    {tableName}表名
    {key_}表中唯一标识
    {index}优先考虑分级 1-挺想要的；2-也不是非要不可
     */
    void updatePriority3(String tableName, int key_, int index);

    /*
    最终录取1 电子部
    {tableName}表名
    {key_}表中唯一标识
     */
    void updateFinalAdmit1(String tableName, int key_);

    /*
    最终录取2 计算机部
    {tableName}表名
    {key_}表中唯一标识
     */
    void updateFinalAdmit2(String tableName, int key_);

    /*
    最终录取3 多媒体办公中心
    {tableName}表名
    {key_}表中唯一标识
     */
    void updateFinalAdmit3(String tableName, int key_);

}
