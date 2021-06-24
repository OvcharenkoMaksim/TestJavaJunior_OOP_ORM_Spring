package com.ksk578;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class RequestSubmissionTest {
    //тестовый метод для проверки работы класса по выводу ответа от БД пользователю

    LinkedHashMap<Integer,Responseline> mapResponce = new LinkedHashMap <> ();

    @Before
    public void getMapResponceTest () {
        Responseline responseline = new Responseline ( "creationDate", "systName", "document",
                "globStatus", "systNameGlobStatus", "svr", "organization",
                "globStat", "lokStat", "globVersion", "lockVersion",
                "databaseID", "globalID", "orgID", "docID");
        mapResponce.put(81, responseline);
    }

    @Test
    public void presentingRequestScreenTest () throws SQLException, IOException, ClassNotFoundException {
        Connect connectMock = Mockito.mock(Connect.class);
        FieldsView fieldsViewMock = Mockito.mock(FieldsView.class);
        // тестовые данные stend = "TSE-TEST" и значение 1 или 2 для переменной long a
        String stend = "Проверка";
        long a = 2;
        //заглушки
        Mockito.when(connectMock.databaseSelection()).thenReturn(stend);
        Mockito.when(connectMock.getMapResponce ()).thenReturn(mapResponce);
        //управление поведением
        Mockito.when(fieldsViewMock.view ()).thenReturn(a);
        RequestSubmission requestSubmission = new RequestSubmission();
        //тестирование методов класса RequestSubmission
        requestSubmission.setConnect(connectMock);
        requestSubmission.setFieldsView(fieldsViewMock);
        requestSubmission.presentingRequestScreen();

    }
}