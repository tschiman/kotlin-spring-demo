package com.tim.schimandle.kotlinspringdemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by tschi on 5/21/2017.
 */

@Service
class BookService @Autowired constructor(val bookRepository: BookRepository) {
    fun getBooks(): List<Book> {
        return bookRepository.findAll()
    }

    fun getBook(id: Long): Book {
        return bookRepository.findOne(id)
    }

    fun createBook(title: String, author: String): Book {
        return bookRepository.save(Book(null, title, author))
    }
}