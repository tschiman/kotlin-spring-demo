package com.tim.schimandle.kotlinspringdemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * Created by tschi on 5/21/2017.
 */

@RestController
@RequestMapping("/books")
class BookController @Autowired constructor(val bookService: BookService) {
    @GetMapping
    fun getBooks(@RequestParam(required = false, defaultValue = "0") id: Long): List<Book> {
        if (id == 0L) return bookService.getBooks()
        else return Collections.singletonList(bookService.getBook(id))
    }

    @PostMapping
    fun createBook(@RequestParam title: String, @RequestParam author: String): Book {
        return bookService.createBook(title, author)
    }
}
