package com.example.myapplication;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    //서버 URL 설정(php 파일 연동)
    final static private String URL = "C:\\wamp64\\www\\Register.php";
    private Map<String, String> map;
    //private Map<String, String>parameters;

    public RegisterRequest(String UserID, String UserPwd, String UserName,Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("ID", UserID);
        map.put("PW", UserPwd);
        map.put("name", UserName);
    }

    @Override
    protected Map<String, String>getParams() throws AuthFailureError {
        return map;
    }
}