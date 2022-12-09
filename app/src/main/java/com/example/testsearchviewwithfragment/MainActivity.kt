package com.example.testsearchviewwithfragment


import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = this.javaClass.canonicalName
        Log.d("omCreate", "We Create now $name")

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = ""
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back_arrow)

        supportFragmentManager.beginTransaction().add(R.id.addFragment, SearchFragment()).commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu, menu)

//        val searchItem = menu?.findItem(R.id.search)
//        val searchView = searchItem?.actionView as? SearchView

//        val manager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
//        searchView?.setSearchableInfo(manager.getSearchableInfo(componentName))

//        searchView?.queryHint = "Search a transaction";
//
//        searchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
//            override fun onQueryTextSubmit(query: String): Boolean {
//                return false
//            }
//
//            override fun onQueryTextChange(newText: String): Boolean {
//                return true
//            }
//        })
//
//        searchItem?.setOnActionExpandListener(object : MenuItem.OnActionExpandListener {
//            override fun onMenuItemActionCollapse(item: MenuItem): Boolean {
//                menu.getItem(1)?.isVisible = true
//                return true // Return true to collapse action view
//            }
//
//            override fun onMenuItemActionExpand(item: MenuItem): Boolean {
//                menu.getItem(1)?.isVisible = false
//                return true // Return true to expand action view
//            }
//        })

        return super.onCreateOptionsMenu(menu)
    }

}