package com.anhvu.handwallet

import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){

    abstract fun bind()
    abstract fun unbind()
}