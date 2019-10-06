package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("Shirts", "shirtimage"),
        Category("Hoodies", "hoodieimage"),
        Category("Hats", "hatimage"),
        Category("Digital", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devsloopes Graphic Beannie", "$18", "hat01"),
        Product("Devsloopes Hat Black", "$20", "hat02"),
        Product("Devsloopes Hat White", "$18", "hat03"),
        Product("Devsloopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("Devsloops Hoodie Gray", "$28", "hoodie01"),
        Product("Devsloops Hoodie Red", "$32", "hoodie02"),
        Product("Devsloops Gray Hoodie", "$28", "hoodie03"),
        Product("Devsloops Black Hoodie", "$32", "hoodie04")
    )

    val shirts = listOf(
        Product("Devsloops Shirt Black", "$18", "shirt01"),
        Product("Devsloops Shirt Light Gray", "$20", "shirt02"),
        Product("Devsloops Shirt Red", "$22", "shirt03"),
        Product("Devsloops Hustle", "$22", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )
}