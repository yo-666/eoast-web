package com.example.conrtoller;

import com.example.entity.Applicant;
import com.example.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Applicant")
public class ApplicantController {

    @Autowired
    ApplicantService applicantService;

    /*
    查所有
    {tableName}表名
    */
    @RequestMapping(value = "/getAll")
    public List<Applicant> getAll(String tableName) {
        return applicantService.getAll(tableName);
    }

    /*
    按部门查询
    {tableName}表名
    {choice}部门 1-电子部；2-计算机部；3-多媒体办公中心
    */
    @RequestMapping(value = "/getByApartment")
    public List<Applicant> getByApartment(String tableName, String choice) {
        return applicantService.getByApartment(tableName, choice);
    }

    /*
    报名
    各参数与[招新]表对应
     */
    @RequestMapping(value = "/addApplicant1")
    public void addApplicant1(String tableName, String id, String name, String performance, String sex) {
        applicantService.addApplicant1(tableName, id, name, performance, sex);
    }

    @RequestMapping(value = "/addApplicant2")
    public void addApplicant2(String tableName,String id,String email, String tell, String choice1, String choice2, String message) {
        applicantService.addApplicant2(tableName,id,email, tell, choice1, choice2, message);
    }

    /*
    删除记录
    {tableName}表名
    {key_}表中唯一标识
     */
    @RequestMapping(value = "deleteApplicant")
    public void deleteApplicant(String tableName, int key_) {
        applicantService.deleteApplicant(tableName, key_);
    }

    /*
    导入初试成绩1
    {tableName}表名
    {key_}表中唯一标识
    {firstGrade1}初试成绩1
     */
    @RequestMapping(value = "/updateFirstGrade1")
    public void updateFirstGrade1(String tableName, int key_, int firstGrade1) {
        applicantService.updateFirstGrade1(tableName, key_, firstGrade1);
    }

    /*
    导入初试成绩2 计算机部成绩
    {tableName}表名
    {key_}表中唯一标识
    {firstGrade2}初试成绩2
    */
    @RequestMapping(value = "/updateFirstGrade2")
    public void updateFirstGrade2(String tableName, int key_, int firstGrade2) {
        applicantService.updateFirstGrade2(tableName, key_, firstGrade2);
    }

    /*
    导入初试成绩3 多媒体办公中心成绩
    {tableName}表名
    {key_}表中唯一标识
    {firstGrade3}初试成绩3
     */
    @RequestMapping(value = "/updateFirstGrade3")
    public void updateFirstGrade3(String tableName, int key_, int firstGrade3) {
        applicantService.updateFirstGrade3(tableName, key_, firstGrade3);
    }

    /*
    导入复试成绩1 电子部成绩
    {tableName}表名
    {key_}表中唯一标识
    {retrialGrade1}复试成绩1
     */
    @RequestMapping(value = "/updateRetrialGrade1")
    public void updateRetrialGrade1(String tableName, int key_, int retrialGrade1) {
        applicantService.updateRetrialGrade1(tableName, key_, retrialGrade1);
    }

    /*
    导入复试成绩2 计算机部成绩
    {tableName}表名
    {key_}表中唯一标识
    {retrialGrade2}复试成绩2
     */
    @RequestMapping(value = "/updateRetrialGrade2")
    public void updateRetrialGrade2(String tableName, int key_, int retrialGrade2) {
        applicantService.updateRetrialGrade2(tableName, key_, retrialGrade2);
    }

    /*
    导入复试成绩3 多媒体办公中心成绩
    {tableName}表名
    {key_}表中唯一标识
    {retrialGrade3}复试成绩3
     */
    @RequestMapping(value = "/updateRetrialGrade3")
    public void updateRetrialGrade3(String tableName, int key_, int retrialGrade3) {
        applicantService.updateRetrialGrade3(tableName, key_, retrialGrade3);
    }

    /*
   导入复试评价1 电子部
   {tableName}表名
   {key_}表中唯一标识
   {retrialAppraise1}复试评价1
    */
    @RequestMapping(value = "/updateRetrialAppraise1")
    public void updateRetrialAppraise1(String tableName, int key_, String retrialAppraise1) {
        applicantService.updateRetrialAppraise1(tableName, key_, retrialAppraise1);
    }

    /*
    导入复试评价2 计算机部
    {tableName}表名
    {key_}表中唯一标识
    {retrialAppraise2}复试评价2
    */
    @RequestMapping(value = "/updateRetrialAppraise2")
    public void updateRetrialAppraise2(String tableName, int key_, String retrialAppraise2) {
        applicantService.updateRetrialAppraise2(tableName, key_, retrialAppraise2);
    }

    /*
    导入复试评价3 多媒体办公中心
    {tableName}表名
    {key_}表中唯一标识
    {retrialAppraise3}复试评价3
    */
    @RequestMapping(value = "/updateRetrialAppraise3")
    public void updateRetrialAppraise3(String tableName, int key_, String retrialAppraise3) {
        applicantService.updateRetrialAppraise3(tableName, key_, retrialAppraise3);
    }

    /*
    确定部门录取1 电子部
    {tableName}表名
    {key_}表中唯一标识
    {index}录取分级 1-确定录取；2-确定不录取；3-待定
     */
    @RequestMapping(value = "/updateAdmit1")
    public void updateAdmit1(String tableName, int key_, int index) {
        applicantService.updateAdmit1(tableName, key_, index);
    }

    /*
    确定部门录取2 计算机部
    {tableName}表名
    {key_}表中唯一标识
    {index}录取分级 1-确定录取；2-确定不录取；3-待定
     */
    @RequestMapping(value = "/updateAdmit2")
    public void updateAdmit2(String tableName, int key_, int index) {
        applicantService.updateAdmit2(tableName, key_, index);
    }

    /*
    确定部门录取3 多媒体办公中心
    {tableName}表名
    {key_}表中唯一标识
    {index}录取分级 1-确定录取；2-确定不录取；3-待定
     */
    @RequestMapping(value = "/updateAdmit3")
    public void updateAdmit3(String tableName, int key_, int index) {
        applicantService.updateAdmit3(tableName, key_, index);
    }

    /*
    部门优先考虑1 电子部
    {tableName}表名
    {key_}表中唯一标识
    {index}优先考虑分级 1-挺想要的；2-也不是非要不可
     */
    @RequestMapping(value = "/updatePriority1")
    public void updatePriority1(String tableName, int key_, int index) {
        applicantService.updatePriority1(tableName, key_, index);
    }

    /*
    部门优先考虑2 计算机部
    {tableName}表名
    {key_}表中唯一标识
    {index}优先考虑分级 1-挺想要的；2-也不是非要不可
     */
    @RequestMapping(value = "/updatePriority2")
    public void updatePriority2(String tableName, int key_, int index) {
        applicantService.updatePriority2(tableName, key_, index);
    }

    /*
    部门优先考虑3 多媒体办公中心
    {tableName}表名
    {key_}表中唯一标识
    {index}优先考虑分级 1-挺想要的；2-也不是非要不可
     */
    @RequestMapping(value = "/updatePriority3")
    public void updatePriority3(String tableName, int key_, int index) {
        applicantService.updatePriority3(tableName, key_, index);
    }

    /*
    最终录取1 电子部
    {tableName}表名
    {key_}表中唯一标识
    {index}最终录取标志 1
     */
    @RequestMapping(value = "/updateFinalAdmit1")
    public void updateFinalAdmit1(String tableName, int key_) {
        applicantService.updateFinalAdmit1(tableName, key_);
    }

    /*
    最终录取2 计算机部
    {tableName}表名
    {key_}表中唯一标识
    {index}最终录取标志 1
     */
    @RequestMapping(value = "/updateFinalAdmit2")
    public void updateFinalAdmit2(String tableName, int key_) {
        applicantService.updateFinalAdmit2(tableName, key_);
    }

    /*
    最终录取3 多媒体办公中心
    {tableName}表名
    {key_}表中唯一标识
    {index}最终录取标志 1
     */
    @RequestMapping(value = "/updateFinalAdmit3")
    public void updateFinalAdmit3(String tableName, int key_) {
        applicantService.updateFinalAdmit3(tableName, key_);
    }
}
