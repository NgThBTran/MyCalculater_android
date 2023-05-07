package com.example.maytinh

class CalculatorResult() : java.io.Serializable {
    var result: String=""
    var time: String=""
    constructor(result: String, time: String) : this(){
        this.result =result
        this.time = time
    }
}