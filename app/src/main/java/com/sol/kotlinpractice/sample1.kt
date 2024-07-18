package com.sol.kotlinpractice

fun main(){
    // 3. String Template
    val name = "sol"
    val lastname = "lim"
    // 변수 출력을 하고싶다면 $ 를 사용할 수 있다
    // 띄어쓰기가 필요하지만 그냥 변수면 {} 안에 써주는걸 습관 들이자
    // 만약 $가 쓰고 싶다면 \$ 이렇게쓰면 달러표시 문자자체로 쓸수있다
    println("my name is ${lastname + name}")
    ckNum(1)
}
// 4. 조건식
fun maxBy(a : Int, b: Int) : Int{
    if(a>b){
        return a
    }else{
        return b
    }
}
// 코틀린식 조건식(코틀린은 삼항 연산자가 없다)
fun maxBy2(a : Int, b: Int) = if (a>b) a else b
// 약간 switch 문법 형식
fun ckNum(score : Int){
    when(score){
        0 -> println("0이다")
        1 -> println("1이다")
        2,3 -> println("2나3이다")
        // else -> println("다른 숫자다") else 생략가능
    }
    var b = when(score){ // 리턴처럼 사용도 가능, 이럴때는 else 필수
        1->1
        2->2
        else -> 3
    }
    when(score){
        in 90..100 -> println("A등급") // 범위를 나타낼때 in a..b 를 쓴다
        in 10..80 -> println("B등급") // 범위를 나타낼때 in a..b 를 쓴다
        else -> println("ㅋㅋ")
    }

}

// 1. 함수
// Unit = void : 리턴형이 없을때
fun helloWorld() : Unit{ // 없어도 무방(Unit만) 나머지는 무조건 필수
    println("HelloWorld!")
}
// 매개변수 쓰는법? 변수명 : 변수타입 : Int 이거 리턴타입 지정 필수
// 코틀린은 변수명을 먼저, 변수 타입을 다음에
fun add( a : Int, b: Int) : Int {
    return a+b
}

// 1. val VS var
fun hi(){
    val a : Int = 10 // val = 변하지 않는 상수값
    var b : Int = 9 // var = 변할수 있는 값
    b = 100 // 재할당 가능, a는 불가능

    /*
    * 자바에서 String name; 하고 바로 선언 안해줄때가 있던것처럼
    * 그렇게 하면 코틀린에서는 var name : String 이런식으로 타입은 지정 해줘야한다
    *     * */

    val c = 100 // int 생략 가능
    var d = 100

    var name : String = "sol" //(String 생략가능)
}

// Expression : 값을 만들어내는거 vs Statement : 특정 작업을 수행하는거(코틀린의 모든함수는 Expression / 자바의 void는 Statement)
// 5. Array VS list
// Array는 기본적으로 크기 고정(처음에 할당)
/*
* List 1) List : 수정불가능 2)MutableList : 수정가능(arrayList)
* */
fun array(){
    val arr = arrayOf(1,2,3) // arrayOf : array초기화
    val list = listOf(1,2,3)
    val arr2 = arrayOf(1, "a", 2 , "b") // 여러 타입 저장 가능
    // array는 값 변경 가능
    arr[0] = 4
    // list 는 값 변경 불가능 list[0] = 4 (x) list는 interface인데 get 메소드는 있지만 set메소드는 없다.

    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}