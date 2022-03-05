package com.allana.food_recipe_app.data.base.arch

import android.util.Log
import androidx.lifecycle.ViewModel

class BaseViewModelImpl : ViewModel(), BaseContract.BaseViewModel {
    override fun logResponse(msg: String?) {
        Log.d(BaseViewModelImpl::class.java.simpleName, msg.orEmpty())
    }
}