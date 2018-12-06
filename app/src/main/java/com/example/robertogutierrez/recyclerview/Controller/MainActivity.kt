package com.example.robertogutierrez.recyclerview.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import com.example.robertogutierrez.recyclerview.Adapters.CategoryAdapter
import com.example.robertogutierrez.recyclerview.Adapters.CategoryReciclerAdapter
import com.example.robertogutierrez.recyclerview.Models.Category
import com.example.robertogutierrez.recyclerview.R
import com.example.robertogutierrez.recyclerview.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryReciclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.setupCategoryListView()
    }

    fun setupCategoryListView() {
        adapter = CategoryReciclerAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

    }
}
