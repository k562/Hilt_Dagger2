package com.example.hilt_dagger2

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


@HiltAndroidApp
class Userapplication : Application() {



    override fun onCreate() {
        super.onCreate()

    }
}