package com.example.kotlinspringbootarchunitsample.infra

import com.example.kotlinspringbootarchunitsample.domain.Customer
import org.springframework.stereotype.Repository

interface CustomerRepository {
    fun add(firstName: String, lastName: String)
}

@Repository
class CustomerRepositoryImpl: CustomerRepository {
    override fun add(firstName: String, lastName: String) {
        TODO("Not yet implemented")
        // NOTE: 何かしらの処理で、ドメイン層から Customer を参照したと想定する
        val customer = Customer("repositoryFirstName", "repositoryLastName")
    }
}
