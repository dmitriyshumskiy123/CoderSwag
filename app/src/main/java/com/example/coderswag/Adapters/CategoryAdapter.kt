package com.example.coderswag.Adapters

import android.content.Context
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Category
import com.example.coderswag.R

class CategoryAdapter (context: Context, categories: List<Category>) : BaseAdapter(){

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View

        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        //now we have inflated the view, which is called categoryView, from the xml-file, called category_list_item
        //по-русски: мы заполнили вьюшку из хмл-файла
        val categoryImage : ImageView = categoryView.findViewById(R.id.categoryName)
        val categoryName : TextView = categoryView.findViewById(R.id.categoryName)

        val category = categories[position]

        val resourceID = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceID)
        categoryName.text = category.title
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        //basicly this's the methot that defines unique id for each row, but in this app we don't need it
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

}