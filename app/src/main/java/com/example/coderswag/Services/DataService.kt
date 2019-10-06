package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product
import kotlin.time.measureTime

object DataService {
    val categories = listOf(
        Category("Shirts", "shirtimage"),
        Category("Hoodies", "hoodieimage"),
        Category("Hats", "hatimage"),
        Category("Digital", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devsloopes Graphic Beannie", "$18", "hat1"),
        Product("Devsloopes Hat Black", "$20", "hat2"),
        Product("Devsloopes Hat White", "$18", "hat3"),
        Product("Devsloopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devsloops Hoodie Gray", "$28", "hoodie1"),
        Product("Devsloops Hoodie Red", "$32", "hoodie2"),
        Product("Devsloops Gray Hoodie", "$28", "hoodie3"),
        Product("Devsloops Black Hoodie", "$32", "hoodie4")
    )

    val shirts = listOf(
        Product("Devsloops Shirt Black", "$18", "shirt1"),
        Product("Devsloops Shirt Light Gray", "$20", "shirt2"),
        Product("Devsloops Shirt Red", "$22", "shirt3"),
        Product("Devsloops Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product> {
        return when(category) {
            "Shirts" -> shirts
            "Hats" -> hats
            "Hoodies" -> hoodies
            else -> digitalGood
        }
    }
    
}