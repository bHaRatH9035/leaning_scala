package com.bkm.learn.conditionals

object Conditionals extends App {
    val ifCondition: IfCondition = new IfCondition()
    ifCondition.invoke(10)

    val ifElseCondition: IfElseCondition = new IfElseCondition()
    ifElseCondition.invoke(10)

    val ifElseIfCondition: IfElseIfCondition = new IfElseIfCondition()
}

class IfCondition {
    def invoke(value: Int): Unit = {
        if (value > 10) {
            println(s"Value: $value is greater than 10")
        }
    }
}

class IfElseCondition {
    def invoke(value: Int): Unit = {
        if (value > 10) {
            println(s"Value: $value is greater than 10")
        } else {
            println(s"Value: $value is lesser than 10")
        }
    }
}

class IfElseIfCondition {
    def invoke(value: Int): Unit = {
        if (value > 10) {
            println(s"Value: $value is greater than 10")
        } else if (value == 10) {
            println(s"Value: $value is equal to 10")
        } else {
            println(s"Value: $value is lesser than 10")
        }
    }
}

class BasicPatternMatch {
    def invoke(): Unit = {
        val i = 10
        val isEven = i%2 match {
            case 0 => "even number"
            case _ => "odd number"
        }
        print(isEven)
    }

    def invokeTypeMatch(): Unit = {
        val i: Any = 10
        val valType = i match {
            case v: Int => s"Int $v"
            case v: String => s"String $v"
            case v: Long => s"Long $v"
            case v: Short => s"Short $v"
            case v: Double => s"Double $v"
            case v: Float => s"Float $v"
            case v: Boolean => s"Boolean $v"
            case v: Unit => s"Unit $v"
            case v: Char => s"Char $v"
            case v => s"unknown $v"
        }
        print(s"val_type: $valType")
    }
}


