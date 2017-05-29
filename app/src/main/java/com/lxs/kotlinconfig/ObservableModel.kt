package com.lxs.kotlinconfig

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.lxs.kotlinconfig.BR

/**
 * Created by Administrator on 2017/5/29.
 */

class ObservableModel : BaseObservable() {

    @get:Bindable
    var txt: String? = null
        set(txt) {
            field = txt
            notifyPropertyChanged(BR.txt)
        }
}
