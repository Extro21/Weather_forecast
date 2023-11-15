package com.practicum.weather_forecast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.practicum.weather_forecast.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    private val adapter = WeatherAdapter()
    private val imageWeatherList = listOf(R.drawable.cloudy, R.drawable.sunny)
   // private val weekList = listOf("Пн","Вт","Ср","Чт","Пт","Сб","Вс")
   // private val weatherList : ArrayList<Weather>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()


      val sec = 1
      val sec2 = 1
      val sec23 = 1
      val sec236 = 1

      val test11 = 1
      val test111 = 1
      val test12 = 1
      val test13 = 1
      val test14 = 1
      val test15 = 1




    }


    private fun init(){
        binding.apply {
            rcView.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL,false )
            rcView.adapter = adapter
            var temperature = 0




            for(element in WeekEnum.values()){
                temperature = Random.nextInt(-20, 30)
                val weather = Weather(element.week, imageWeatherList[(0..1).random()], temperature.toString())
                adapter.addWeather(weather)

            }



//                temperature = Random.nextInt(-20, 30)
//                val weather = Weather(weekList[1], imageWeatherList[(0..1).random()], temperature.toString())
//                adapter.addWeather(weather)


        }
    }

}