package com.example.equipmanager.common.ext

import android.app.Activity
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

fun <T : ViewDataBinding> Activity.setContentWithBind(@LayoutRes layoutId: Int): T {
    return DataBindingUtil.setContentView(this, layoutId)
}