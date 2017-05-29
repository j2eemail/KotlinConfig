package com.lxs.kotlinconfig

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.default_kotlin.*;

/**
 * Created by Administrator on 2017/5/28.
 */
class DefaultKotlin : AppCompatActivity() {

    val str = "kotlin";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.default_kotlin)
        val a: Int = 1 // `立即赋值
        val b = 2   // 推断“int”类型
        val c: Int  //当没有初始化构造器时，需要类型
        c = 3       //延期分配
        val s = "a is $a";
        println(s)
        //list及其遍历
        val items = listOf("apple", "banana", "kiwi")
        for (item in items) {
            println(item)
        }
        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }
        //mape及其遍历
        val map = mapOf("a" to 1, "b" to 2, "c" to 3)
        for ((k, v) in map) {
            println("$k -> $v")
        }


    }

    fun outputTextView1(view: View) {
        toast(default_kotlin_txt.text);
    }

    fun outputTextView2(view: View) {
        toast("${default_kotlin_txt.text}\t${str}");

//        toast(stringAppend(default_kotlin_txt.text.toString(),str));
    }

    //    fun stringAppend(s1: String, s2: String):String{
//        return s1+s2;
//    }
    fun stringAppend(s1: String, s2: String) = s1 + s2 //返回字符串s1+s2

    fun toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(applicationContext, message, duration).show()
    }
}