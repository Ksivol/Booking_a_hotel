package com.ksivol_project.booking_a_hotel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var iv1:ImageView
    private lateinit var iv2:ImageView
    private lateinit var iv3:ImageView
    private lateinit var iv4:ImageView

    private lateinit var viewPage2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPage2 = findViewById(R.id.view_pager2)
        iv1 = findViewById(R.id.iv1)
        iv2 = findViewById(R.id.iv2)
        iv3 = findViewById(R.id.iv3)
        iv4 = findViewById(R.id.iv4)

        val images= listOf(R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4)
        val adapter = ViewPagerAdapter(images)
        viewPage2.adapter = adapter

        viewPage2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                changeColor()
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }

            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
                changeColor()
            }

        })

    }

    fun changeColor(){
        when(viewPage2.currentItem){
            0->
            {
                iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.active))
                iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.grey))
                iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.grey))
                iv4.setBackgroundColor(applicationContext.resources.getColor(R.color.grey))
            }
            1->
            {
                iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.grey))
                iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.active))
                iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.grey))
                iv4.setBackgroundColor(applicationContext.resources.getColor(R.color.grey))
            }
            2->
            {
                iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.grey))
                iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.grey))
                iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.active))
                iv4.setBackgroundColor(applicationContext.resources.getColor(R.color.grey))
            }
            3->
            {
                iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.grey))
                iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.grey))
                iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.grey))
                iv4.setBackgroundColor(applicationContext.resources.getColor(R.color.active))
            }
        }
    }
}