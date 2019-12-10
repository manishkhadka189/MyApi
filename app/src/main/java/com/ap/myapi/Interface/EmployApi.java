package com.ap.myapi.Interface;

import com.ap.myapi.model.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EmployApi {

   @GET("employees")
   Call<List<Employee>> getAllEmployee();

}
