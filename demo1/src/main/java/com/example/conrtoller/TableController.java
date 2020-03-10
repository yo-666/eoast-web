package com.example.conrtoller;

import com.example.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Table")
public class TableController {

    @Autowired
    TableService tableService;

    /*
    创建表
    {tableName}表名
     */
    @RequestMapping(value = "/creatTable1")
    public void creatTable1(String tableName){
        tableService.creatTable1(tableName);
    }

    /*
    创建表2 memberXXXX
    {tableName}表名
     */
    @RequestMapping(value = "/creatTable2")
    public void creatTable2(String tableName){
        tableService.creatTable2(tableName);
    }

    /*
    删除表
    {tableName}表名
     */
    @RequestMapping(value = "/deleteTable")
    public void deleteTable(String tableName){
        tableService.deleteTable(tableName);
    }


}
