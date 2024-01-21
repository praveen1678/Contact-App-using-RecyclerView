package com.example.recyclerview

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Model.User
import com.example.recyclerview.adapter.MyAdapter




class MainActivity(val context: Context) : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val userDataList = Dummydata()
        val adapter=MyAdapter(this, userDataList)
        recyclerView.adapter=adapter
    }

    private fun Dummydata(): List<User> {
        val userList = mutableListOf<User>()
        userList.add(User("Aarya", R.drawable.image1,  "8979668877"))
        userList.add(User( "Johnika", R.drawable.image2,  "8955338844"))
        userList.add(User( "Emma", R.drawable.image3,  "9987488110"))
        userList.add(User( "Kriti", R.drawable.image4,  "8000668800"))
        userList.add(User( "Daniel", R.drawable.image5,  "9999668877"))
        userList.add(User("Mitchel", R.drawable.image6,  "4586971200"))
        userList.add(User( "Robert", R.drawable.image7,  "0561284800"))
        userList.add(User( "Shivesh", R.drawable.image8,  "1236589800"))
        userList.add(User("Isabella", R.drawable.image9, "990101123"))
        userList.add(User( "james", R.drawable.image10,  "2832040099"))
        return userList
    }
}


