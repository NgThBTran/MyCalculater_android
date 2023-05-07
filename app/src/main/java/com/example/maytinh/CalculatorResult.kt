package com.example.maytinh

class CalculatorResult() : java.io.Serializable {
    private var result: String=""
    private var time: String=""
    constructor(result: String, time: String) : this(){
        this.result =result
        this.time = time
    }
}