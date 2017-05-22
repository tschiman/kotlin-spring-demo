package com.tim.schimandle.kotlinspringdemo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by tschi on 5/21/2017.
 */

@Entity
data class Book (
        @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long?,
        var title: String,
        var author: String
)