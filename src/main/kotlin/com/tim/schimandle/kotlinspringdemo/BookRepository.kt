package com.tim.schimandle.kotlinspringdemo

import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by tschi on 5/21/2017.
 */
interface BookRepository : JpaRepository<Book, Long>