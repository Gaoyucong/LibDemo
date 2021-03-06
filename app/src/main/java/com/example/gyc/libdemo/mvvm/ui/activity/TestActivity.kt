package com.example.gyc.libdemo.mvvm.ui.activity

import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.gyc.libdemo.R
import com.example.gyc.libdemo.base.BaseActivity
import com.example.gyc.libdemo.mvvm.viewmodel.TestViewModel
import kotlinx.android.synthetic.main.activity_main.*


class TestActivity : BaseActivity<TestViewModel>() {
    override fun setViewModel(): Class<TestViewModel> {
        return TestViewModel::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        baseViewModel.getTask().observe(this, Observer { t ->
            tv.text = t
        })
    }
}
