package com.example.hilt_dagger2

import android.util.Log
import javax.inject.Inject


const val TAG = "HiltDagger2"

class UserRepository@Inject constructor(val loggerService: LoggerService){

     fun saveUSer(email: String, password: String): Unit {

         loggerService.log("User saved in DataBase")
     }

}