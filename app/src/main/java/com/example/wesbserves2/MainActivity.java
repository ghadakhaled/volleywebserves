package com.example.wesbserves2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    TextView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = findViewById(R.id.tv_main_text);

        getDataFromServer();
    }



    String GET_DATA_URL = "https://api.myjson.com/bins/kp9wz";// name file to get employee

    private void getDataFromServer () {

        RequestQueue Queue = Volley.newRequestQueue(this); // Dy sabta
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, GET_DATA_URL, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response)
            {



            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        Queue.add(jsonObjectRequest);














//
//
//        String GET_DATA_URL = "https://api.myjson.com/bins/kp9wz";// name file to get employee
//
//        private void getDataFromServer () {
//
//            RequestQueue Queue = Volley.newRequestQueue(this); // Dy sabta
//            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, GET_DATA_URL, null, new Response.Listener<JSONObject>() {
//                @Override
//                public void onResponse(JSONObject response) {
//                    try {
//                        JSONArray jsonArray = response.getJSONArray("employees");
//                        for (int i = 0; i < jsonArray.length(); i++) {
//                            JSONObject f = jsonArray.getJSONObject(i);
//                            String firstname = f.getString("firstname");
//                            v.append(firstname);
//                        }
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }, new Response.ErrorListener() {
//                @Override
//                public void onErrorResponse(VolleyError error) {
//
//                }
//            });
//
//            Queue.add(jsonObjectRequest);


//        String GET_DATA_URL = "https://api.myjson.com/bins/8iyqg";// Array of object
//    private void getDataFromServer() {
//        JsonArrayRequest arrayRequest = new JsonArrayRequest(Request.Method.GET, GET_DATA_URL, null, new Response.Listener<JSONArray>() {
//            @Override
//            public void onResponse(JSONArray response) {
//                for (int i = 0; i < response.length(); i++) {
//                    try {
//                        JSONObject jsonObject = response.getJSONObject(i);
//                        v.setText(jsonObject.getString("username"));
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        v.setText(error.toString());
//
//                    }
//                });
//
//    }
        }

    }
