package com.example.roomdemo_cz.database;

import androidx.room.*;

import java.util.List;

/**
 * DAO
 *
 * 对数据库表的增删改查
 *
 * */
@Dao
public interface StudentDao
{
    @Insert
    void insertStudent(Student student);

    @Delete
    void deleteStudent(Student student);

    @Update
    void updateStudent(Student student);

    @Query("SELECT * FROM student")
    List<Student> getStudentList();

    @Query("SELECT * FROM student WHERE id = :id")
    Student getStudentById(int id);
}