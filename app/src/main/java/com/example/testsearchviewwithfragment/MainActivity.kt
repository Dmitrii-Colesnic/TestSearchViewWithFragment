package com.example.testsearchviewwithfragment

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var menu: Menu? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.toolbar);
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_back_arrow)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        this.menu = menu
        menuInflater.inflate(R.menu.search_menu, menu)

        val searchItem = menu?.findItem(R.id.search)
        val searchView = searchItem?.actionView as SearchView

        val expandListener = object : MenuItem.OnActionExpandListener {
            override fun onMenuItemActionCollapse(item: MenuItem): Boolean {
                // Do something when action item collapses
                return true // Return true to collapse action view
            }

            override fun onMenuItemActionExpand(item: MenuItem): Boolean {
                item.title = "Search"
                return true // Return true to expand action view
            }
        }

        searchItem.setOnActionExpandListener(expandListener)

//        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
//            override fun onQueryTextSubmit(query: String): Boolean {
//
//                return false
//            }
//
//            override fun onQueryTextChange(newText: String): Boolean {
//
//                return false
//            }
//        })

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
            if (item.itemId == R.id.search){
                Toast.makeText(this, "Search pressed", Toast.LENGTH_SHORT).show()
//                menu?.getItem(1)?.isVisible = false
                return true
            } else if (item.itemId == R.id.calendar) {
                Toast.makeText(this, "Calendar pressed", Toast.LENGTH_SHORT).show()
                return true
            }

        return super.onOptionsItemSelected(item)
    }

}