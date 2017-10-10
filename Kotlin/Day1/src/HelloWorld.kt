//1。基本语法

package foo



fun  sum(a: Int,b:  Int):   Int {

    return a + b
}

//只有一个表达式作为函数体，可以自推导返回值
fun  sum2(a: Int,b: Int) = a + b

fun  printSum(a: Int,b: Int) {

    println("sum of $a and $b is ${a+b}")

}


//定义局部变量



fun  basenass(){
    //定义常量
    val ab : Int = 1
    val b = 2

    //定义变量
    var x = 5
    x += 1

    /*
    * */

    //使用字符串模版
    var a  = 1
    val s1 = "a is $a"

    a = 2

    val  s2 = "${s1.replace("is","was")},but now is $a"


}




