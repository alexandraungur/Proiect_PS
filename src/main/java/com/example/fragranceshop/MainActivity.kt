package com.example.fragranceshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Product>
    lateinit var imageId: Array<Int>
    lateinit var titles: Array<String>
    lateinit var brands: Array<String>
    lateinit var quantities: Array<String>
    lateinit var prices: Array<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        imageId = arrayOf(
            R.drawable.myway,
            R.drawable.olympea,
            R.drawable.linterdit,
            R.drawable.joy,
            R.drawable.si,
            R.drawable.invictus,
            R.drawable.sauvage,
            R.drawable.aquadigio,
            R.drawable.million

        )

        titles = arrayOf(
            "My Way",
            "Olympea",
            "L'Interdit",
            "Joy",
            "Si",
            "Invictus",
            "Sauvage",
            "Aqua di Gio",
            "One Million"
        )
        brands = arrayOf(
            "GIORGIO ARMANI",
            "PACO RABANNE",
            "GIVENCHY",
            "DIOR",
            "GIORGIO ARMANI",
            "PACO RABANNE",
            "DIOR",
            "GIORGIO ARMANI",
            "PACO RABANNE"
        )

        quantities = arrayOf(
            "90ml",
            "80ml",
            "80ml",
            "90ml",
            "100ml",
            "100ml",
            "100ml",
            "100ml",
            "200ml"
        )

        prices = arrayOf(
            550,
            550,
            600,
            530,
            600,
            500,
            480,
            650,
            580
        )

        newRecyclerView = findViewById(R.id.mRecyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Product>()
        getUserdata()


    }

    private fun getUserdata() {
        for (i in imageId.indices) {
            val product = Product(titles[i], brands[i], prices[i], quantities[i], imageId[i])
            newArrayList.add(product)
        }

        newRecyclerView.adapter = PAdapter(newArrayList)


    }

}