package com.example.kotlinspringbootarchunitsample.usecase

import com.example.kotlinspringbootarchunitsample.domain.Customer
import com.example.kotlinspringbootarchunitsample.infra.CustomerRepository
import org.springframework.stereotype.Service

interface CustomerUseCase {
    fun insertCustomer(firstName: String, lastName: String)
}

@Service
class CustomerUseCaseImpl(val customerRepository: CustomerRepository) : CustomerUseCase {
    override fun insertCustomer(firstName: String, lastName: String) {
        TODO("Not yet implemented")
        // NOTE: 何かしらの処理で、ドメイン層の Customer を参照したとする
        val customer = Customer("usecaseFirstName", "usecaseLastName")
    }
}
