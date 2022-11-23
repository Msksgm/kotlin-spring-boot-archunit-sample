package com.example.kotlinspringbootarchunitsample.presentation

import com.example.kotlinspringbootarchunitsample.usecase.CustomerUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(val customerUseCase: CustomerUseCase) {
    @PostMapping("/customers")
    fun insert(): String {
        return """
            {
                "message": "success"
            }
        """.trimIndent()
    }
}
