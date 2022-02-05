package com.rob.daggerapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var appComponent: AppComponent
    @Inject
    lateinit var university: University
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appComponent = DaggerAppComponent.create()
        val education = appComponent.education()
        appComponent.inject(this)
        education.checkUniversity().priceOfStudy()
    }
}