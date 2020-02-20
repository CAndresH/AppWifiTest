package com.example.kotlinprimera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView3.text="sdfsdfsdf"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var selectedOption=""

        when(item.itemId){
            R.id.config -> selectedOption="PrimerMenu";
            R.id.config2->selectedOption="SegundoMenu";

        }
        Toast.makeText(this, "Menu selected" + selectedOption, Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }
}
