package com.mini.cindy.ciciapplication.db;


import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

/**
 * @author : cici.chen
 * @date: 2022/1/12
 * description : 日志上报数据库
 */
@Dao
public interface ReportDao {

    @Query("SELECT * FROM reports")
    List<ReportBean> loadAll();



    //@Query("SELECT * FROM (SELECT * FROM reports t ORDER BY t.reportid desc ) a where rownum<=1 order by rownum desc")
    @Query("select *  from reports order by reportid asc limit 1")
    ReportBean load();


    @Insert
    void insertAll(ReportBean... rb);




    @Delete
    void delete(ReportBean rb);

}
