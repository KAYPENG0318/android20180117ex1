package com.wanna.android20180117ex1.data;

import java.util.ArrayList;

/**
 * Created by Student on 2018/1/18.
 */

public interface StudentDAO {
    public boolean add(Student s);
    public ArrayList<Student> getList();
    public Student getStudent(int id);
    public boolean updata(Student s);
    public boolean delete(int id);



}
