package com.lxs.kotlinconfig

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.lxs.kotlinconfig.databinding.DatabindingKotlinBinding

/**
 * Created by Administrator on 2017/5/29.
 */

class DataBindingKotlin : AppCompatActivity() {

    var observableModel: ObservableModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val observableBinding: DatabindingKotlinBinding = DataBindingUtil.setContentView<DatabindingKotlinBinding>(this, R.layout.databinding_kotlin)
        observableModel = ObservableModel()
        observableModel?.txt = "默认值";
        observableBinding.observableModel = observableModel
        observableBinding.observableListener = ObservableListener()
    }

    inner class ObservableListener {
        fun onClick(view: View) {
            observableModel?.txt = "点击改变";
//            observableModel!!.txt = "点击改变";
        }
    }
}
