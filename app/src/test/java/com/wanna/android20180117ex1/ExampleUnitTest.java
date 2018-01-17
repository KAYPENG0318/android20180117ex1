package com.wanna.android20180117ex1;

import com.wanna.android20180117ex1.data.Student;
import com.wanna.android20180117ex1.data.StudentScoreDAO;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void test_add_data() throws Exception{
        StudentScoreDAO dao = new StudentScoreDAO();//在此的StudentScoreDAO是抓取StudentScoreDAO的StudentScoreDAO class 做測試
        dao.add(new Student(1,"Kay",85));
        dao.add(new Student(2,"Woo",90));
        assertEquals(2,dao.getList().size()); //size測試是否有2筆資料
    }
    @Test
    public void test_add_data2() throws Exception{
        StudentScoreDAO dao = new StudentScoreDAO();
        dao.add(new Student(1,"Kay",85));
        dao.add(new Student(2,"Woo",90));
        assertEquals(90,dao.getList().get(1).score);//.get(1).score，測試第2筆資料分數是否為90
    }
    @Test
    public void test_getS() throws Exception{
        StudentScoreDAO dao = new StudentScoreDAO();
        dao.add(new Student(1,"Kay",85));
        dao.add(new Student(2,"Woo",90));
        assertEquals(90,dao.getStudent(2).score);
    }
    @Test
    public void test_UpdataS() throws Exception{
        StudentScoreDAO dao = new StudentScoreDAO();
        dao.add(new Student(1,"Kay",85));
        dao.add(new Student(2,"Woo",90));
        dao.updata(new Student(2,"Jin",100));
        assertEquals("Jin",dao.getStudent(2).name);
    }
    @Test
    public void test_DeleteS() throws Exception{
        StudentScoreDAO dao = new StudentScoreDAO();
        dao.add(new Student(1,"Kay",85));
        dao.add(new Student(2,"Woo",90));
        dao.delete(1);
        assertEquals(1,dao.getList().size());
    }
    @Test
    public void test_DeleteS2() throws Exception{
        StudentScoreDAO dao = new StudentScoreDAO();
        dao.add(new Student(1,"Kay",85));
        dao.add(new Student(2,"Woo",90));
        dao.delete(1);
        assertEquals(2,dao.getList().get(0).id);
    }


    @Test
    public void test1() throws Exception{
        MyTest t = new MyTest();//在此的MyTest 是抓取MyTest的MyTest class 做測試
        assertEquals(8, t.getAdd(2,6));
    }
}