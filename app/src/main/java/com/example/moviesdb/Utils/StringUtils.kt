package com.example.moviesdb.Utils

import java.util.*

class StringUtils {

    companion object{

        fun formatHoursAndMinutes(totalMinutes: Int): String {
            var minutes = Integer.toString(totalMinutes % 60)
            minutes = if (minutes.length == 1) "0$minutes" else minutes
            return (totalMinutes / 60).toString() + " Hours " + minutes+" Minutes"
        }
    }




}