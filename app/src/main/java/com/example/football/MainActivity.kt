package com.example.football

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.football.model.Football
import com.example.football.network.RetrofitClient
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var textView2: TextView
    private lateinit var textView3: TextView
    private lateinit var textView4: TextView
    private lateinit var textView5: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.areaName)
        textView2 = findViewById(R.id.areaCode)
        textView3 = findViewById(R.id.countr)
        textView4 = findViewById(R.id.parentId)
        textView5 = findViewById(R.id.parentId)

        val jsonString = """
            {
                "childAreas": [
                    {
                        "id": 2001,
                        "name": "Africa",
                        "countryCode": "AFR",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2010,
                        "name": "Arameans Suryoye",
                        "countryCode": "ARS",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2014,
                        "name": "Asia",
                        "countryCode": "ASI",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2064,
                        "name": "Darfur",
                        "countryCode": "DAR",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2077,
                        "name": "Europe",
                        "countryCode": "EUR",
                        "flag": "https://crests.football-data.org/EUR.svg",
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2159,
                        "name": "N/C America",
                        "countryCode": "NCA",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2166,
                        "name": "NF-Board",
                        "countryCode": "NFB",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2174,
                        "name": "Occitania",
                        "countryCode": "OCC",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2175,
                        "name": "Oceania",
                        "countryCode": "OCE",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2177,
                        "name": "Padania",
                        "countryCode": "PAD",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2188,
                        "name": "Provence",
                        "countryCode": "PRO",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2191,
                        "name": "Raetia",
                        "countryCode": "RAE",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2202,
                        "name": "Sápmi",
                        "countryCode": "SAP",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2220,
                        "name": "South America",
                        "countryCode": "SAM",
                        "flag": "https://crests.football-data.org/CLI.svg",
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2222,
                        "name": "Southern Cameroon",
                        "countryCode": "SCM",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2238,
                        "name": "Tamil Eelam",
                        "countryCode": "TEL",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2251,
                        "name": "Two Sicilies",
                        "countryCode": "TSI",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    },
                    {
                        "id": 2265,
                        "name": "West Indies",
                        "countryCode": "WIN",
                        "flag": null,
                        "parentAreaId": 2267,
                        "parentArea": "World"
                    }
                ]
            }
        """.trimIndent()

        val gson = Gson()
        val childAreasResponse = gson.fromJson(jsonString, Football::class.java)

        textView.text = childAreasResponse.childAreas.joinToString("\n") { it.name }
        textView2.text = childAreasResponse.childAreas.joinToString("\n") { it.id.toString() }
        textView3.text = childAreasResponse.childAreas.joinToString("\n") { it.countryCode}
        textView4.text = childAreasResponse.childAreas.joinToString("\n") { it.parentAreaId.toString()}
        textView5.text = childAreasResponse.childAreas.joinToString("\n") { it.parentArea}
    }
}