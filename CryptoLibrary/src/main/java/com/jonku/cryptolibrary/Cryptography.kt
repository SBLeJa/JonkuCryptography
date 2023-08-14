package com.jonku.cryptolibrary

object Cryptography {

    fun Encrypt(str: String) : String {

        var retVal : String = ""
        for (i in str.reversed().indices) {
            retVal += str.reversed()[i]
        }
        return retVal
    }

    fun Decrypt(str: String) : String {

        var retVal : String = ""
        for (i in str.reversed().indices) {
            retVal += str.reversed()[i]
        }
        return retVal
    }

}