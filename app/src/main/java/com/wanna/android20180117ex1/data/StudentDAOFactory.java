package com.wanna.android20180117ex1.data;

import android.content.Context;

/**
 * Created by Student on 2018/1/18.
 */

public class StudentDAOFactory {
    public static StudentDAO getDAOInstance(Context context,DBType dbType)
    {
        switch(dbType)
        {
            case MEMORY:
                return  new StudentScoreDAO();
            case FILE:
                return  new StudentFileDAO(context);
            case DB:
                return  new StudentDAOBImpl(context);
            case CLOUD:
                return  new StudentCloudDAO(context);
        }
        return  null;
    }
}
