package com.example.tata_surya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), planetAdapter.adapterInterface {

    private lateinit var recyclerView: RecyclerView
    private var listData: ArrayList<dataClassPlanet> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Daily Planet"

        recyclerView = findViewById(R.id.rv_planet)
        listData.addAll(dataPlanet.listData)

        showRecycler()
    }

    private fun showRecycler() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val listDataAdapter = planetAdapter(listData, this)
        recyclerView.adapter = listDataAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(menuSelect: Int){
        when (menuSelect){
            R.id.to_about->{
                startActivity((Intent(this@MainActivity, about::class.java)))
            }
        }
    }

    override fun onItemClicked(list: dataClassPlanet) {
        val intent: Intent = Intent(this, detail::class.java)
        intent.putExtra(detail.EXTRA_NAME, list.name)
        intent.putExtra(detail.EXTRA_DETAIL, list.detail)
        intent.putExtra(detail.EXTRA_IMAGE, list.foto)

        startActivity(intent)
    }
}