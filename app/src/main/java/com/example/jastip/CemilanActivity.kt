package com.example.jastip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jastip.data.DataCemilan
import com.example.jastip.model.ModelCemilan

class CemilanActivity : AppCompatActivity() {
//
//    var list: ArrayList<ModelCemilan> = arrayListOf()
//    var rvCemilan : RecyclerView = findViewById(R.id.rv_cemilan)

    private lateinit var rvCemilan: RecyclerView
    private var list: ArrayList<ModelCemilan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cemilan)

        rvCemilan = findViewById(R.id.rv_cemilan)
        rvCemilan.setHasFixedSize(true)

        list.addAll(DataCemilan.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvCemilan.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = CemilanAdapter(list)
        rvCemilan.adapter = listHeroAdapter
    }
}