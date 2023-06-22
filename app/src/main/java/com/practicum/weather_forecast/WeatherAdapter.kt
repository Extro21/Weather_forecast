package com.practicum.weather_forecast

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.practicum.weather_forecast.databinding.WeatherItemBinding

class WeatherAdapter : RecyclerView.Adapter<WeatherAdapter.WeatherHolder>() {
    val weatherList = ArrayList<Weather>()

    class WeatherHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = WeatherItemBinding.bind(item)

        fun bind(weather: Weather) = with(binding) {
            imageWeather.setImageResource(weather.imageWeather)
            textTemperature.text = weather.temperature
            textViewWeek.text = weather.day
            if(weather.temperature.toInt() > 0){
                cardVc.setBackgroundColor(R.color.black)
            } else {
                cardVc.setBackgroundColor(R.color.purple_200)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.weather_item, parent, false)
        return WeatherHolder(view)
    }

    override fun onBindViewHolder(holder: WeatherHolder, position: Int) {
        holder.bind(weatherList[position])
    }

    override fun getItemCount(): Int {
        return weatherList.size
    }

    fun addWeatherList(weathers: List<Weather>) {
        weatherList.addAll(weathers)

    }

    fun addWeather(weather: Weather){
        weatherList.add(weather)
        notifyDataSetChanged()
    }
}