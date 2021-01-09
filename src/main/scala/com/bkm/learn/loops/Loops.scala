package com.bkm.learn.loops

object Loops extends App {

}

class ForToLoop {
    def invoke(): Unit = {
        print("1 to 5: ")
        for (i <- 1 to 5) {
            print(s"$i ")
        }
    }
}

class ForUntilLoop {
    def invoke(): Unit = {
        print("1 unit 5: ")
        for (i <- 1 until 3) {
            print(s"$i ")
        }
    }
}

class ForWithConditionalLoop {
    def invoke(): Unit = {
        print("even numbers 1 to 10: ")
        for (i <- 1 to 10 if i%2 == 0) {
            print(s"$i ")
        }
    }
}

class ForYieldLoop {
    def invoke(): Unit = {
        print("for yield: ")
        val list = for {
            i <- 1 to 10
            if i % 2 == 0
        } yield i
        print(list)
    }
}

class WhileLoop {
    def invoke(): Unit = {
        var i = 0
        while (i < 10) {
            print(s"$i ")
            i += 1
        }
    }
}

class DoWhileLoop {
    def invoke(): Unit = {
        var i = 0
        do {
            print(s"$i ")
            i += 1
        } while (i < 10)
    }
}
