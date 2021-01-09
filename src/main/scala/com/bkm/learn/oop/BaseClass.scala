package com.bkm.learn.oop

import com.bkm.learn.utils.Utils

class BaseClass(name: String, age: Int) {
    val _name: String = name
    val _age: Int = age

    private val privateString: String = s"private string NAME: [${_name}] AGE: [${_age}]"
    protected val protectedString: String = s"protected string NAME: [${_name}] AGE: [${_age}]"

    protected def getProtectedString: String = protectedString

    def getPublicString(str: String) = s"[$_name] [$_age] [$str]"

    def test(): Unit = {
        Utils.AnonymousFunc
    }
}
