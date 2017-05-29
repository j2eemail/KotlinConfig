package com.lxs.kotlinconfig;

/**
 * Created by Administrator on 2017/5/29.
 */

public class Document {

//Kotlin提供以下代表数字的内置类型
//类型      位宽
//Double      64
//Float       32
//Long        64
//Int         32
//Short       16
//Byte        8

//Kotlin支持二进制(0b开头)十六进制(ox开头)但不支持八进制。

//Kotlin支持数字下划线
//val oneMillion = 1_000_000
//val creditCardNumber = 1234_5678_9012_3456L
//val socialSecurityNumber = 999_99_9999L
//val hexBytes = 0xFF_EC_DE_5E
//val bytes = 0b11010010_01101001_10010100_10010010

//Kotlin中按位操作
//shl(bits)   左移运算符（Java <<）
//shr(bits)   右移运算符（Java >>）
//ushr(bits)  无符号右移，忽略符号位，空位都以0补齐（Java >>>）
//and(bits)   按位和
//or(bits)    按位或
//xor(bits)   按位xor
//inv()       逐位倒置

// Kotlin中自带非空检查如要为空val s:String? = null;

// Kotlin中支持的转义字符\t，\b，\n，\r，\'，\"，\\和\$。要编码任何其他字符，请使用Unicode转义序列语法：'\uFF00'

// Kotlin中引入类对象this@类名

//Kotlin中运算符重载
//一元前缀运算符
//+a	a.unaryPlus()
//-a	a.unaryMinus()
//!a	a.not()

//递增和递减
//a++	a.inc()
//a--	a.dec()

//算术运算符
//a + b	a.plus(b)
//a - b	a.minus(b)
//a * b	a.times(b)
//a / b	a.div(b)
//a % b	a.rem(b)，a.mod(b)（已弃用）
//a..b	a.rangeTo(b)
//a in b	b.contains(a)
//a !in b	!b.contains(a)

//索引访问操作符 方括号转换为调用get和set适当数量的参数。
//a[i]	a.get(i)
//a[i, j]	a.get(i, j)
//a[i_1, ..., i_n]	a.get(i_1, ..., i_n)
//a[i] = b	a.set(i, b)
//a[i, j] = b	a.set(i, j, b)
//a[i_1, ..., i_n] = b	a.set(i_1, ..., i_n, b)

//自身运算
//a += b	a.plusAssign(b)
//a -= b	a.minusAssign(b)
//a *= b	a.timesAssign(b)
//a /= b	a.divAssign(b)
//a %= b	a.modAssign(b)
//
//等于非等于
//a == b	a?.equals(b) ?: (b === null)
//a != b	!(a?.equals(b) ?: (b === null))

// 比较运算符
//a > b	a.compareTo(b) > 0
//a < b	a.compareTo(b) < 0
//a >= b	a.compareTo(b) >= 0
//a <= b	a.compareTo(b) <= 0

//集合类
//val items = listOf("item1", "item2", "item3")
//val items:MutableList<String> = mutableListOf("item1", "item2", "item3");
//遍历
//for (item in items) {
//    println(item)
//}
//for (index in items.indices) {
//    println("item at $index is ${items[index]}")
//}
//val set = setOf("item1", "item2", "item3");
//val set:MutableSet<String> = mutableSetOf("item1", "item2", "item3");
//val map = mapOf("a" to 1, "b" to 2, "c" to 3)
//val map = mutableMapOf<String,Int>("a" to 1, "b" to 2, "c" to 3)
//for ((k, v) in map) {
//    println("$k -> $v")
//}

//for (i in 1..4 step 2) 正序从1到4步长为2 step无时默认为1
//for (i in 4 downTo 1 step 2) 倒序从4到1步长为2
//for (i in 1 until 10)不包含上限

//println控制台输出

}
