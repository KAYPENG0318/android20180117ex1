package com.wanna.android20180117ex1.data;

import java.util.ArrayList;

/**
 * Created by Student on 2018/1/17.
 */

public class StudentScoreDAO {
    public ArrayList<Student> mylist;
    public StudentScoreDAO(){
        mylist = new ArrayList<>();
    }
    public void add(Student s){
        mylist.add(s);
    }
    public ArrayList<Student> getList(){
        return mylist;
    }
    public Student getStudent(int id){
        for(Student s : mylist)
        {
            if(s.id == id)
            {
                return s;
            }
        }
        return null;
    }
    public boolean updata(Student s)
    {
        for(Student t : mylist)
        {
            if(t.id== s.id)
            {
                t.name=s.name;
                t.score=s.score;
                return true;
            }
        }
        return  false;
    }
    public boolean delete(int id)
    {
        for(int i=0;i<mylist.size();i++)
        {
            if(mylist.get(i).id==id)
            {
                mylist.remove(i);
                return true;
            }
        }
        return false;
    }

}
