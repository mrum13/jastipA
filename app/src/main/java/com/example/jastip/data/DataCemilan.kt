package com.example.jastip.data

import com.example.jastip.R
import com.example.jastip.model.ModelCemilan

object DataCemilan {

    private val cemilanNames = arrayOf(
        "Kuping Gajah berwarna",
        "Ahmad Yani",
        "Sutomo",
        "Gatot Soebroto",
        "Ki Hadjar Dewantarai",
        "Mohammad Hatta",
        "Soedirman",
        "Soekarno",
        "Soepomo",
        "Tan Malaka")

    private val cemilanSub = arrayOf(
        "Strawberry,coklat,vanila",
        "Ahmad Yani",
        "Sutomo",
        "Gatot Soebroto",
        "Ki Hadjar Dewantarai",
        "Mohammad Hatta",
        "Soedirman",
        "Soekarno",
        "Soepomo",
        "Tan Malaka"
    )

    private val cemilanHarga = arrayOf(
        "Rp. 30.000",
        "Ahmad Yani",
        "Sutomo",
        "Gatot Soebroto",
        "Ki Hadjar Dewantarai",
        "Mohammad Hatta",
        "Soedirman",
        "Soekarno",
        "Soepomo",
        "Tan Malaka"
    )

    private val cemilanImages = intArrayOf(
        R.drawable.kuping_gajah,
        R.drawable.kuping_gajah,
        R.drawable.kuping_gajah,
        R.drawable.kuping_gajah,
        R.drawable.kuping_gajah,
        R.drawable.kuping_gajah,
        R.drawable.kuping_gajah,
        R.drawable.kuping_gajah,
        R.drawable.kuping_gajah,
        R.drawable.kuping_gajah,)

    val listData: ArrayList<ModelCemilan>
        get() {
            val list = arrayListOf<ModelCemilan>()
            for (position in cemilanNames.indices) {
                val data = ModelCemilan()
                data.cemilanName = cemilanNames[position]
                data.cemilanSub = cemilanSub[position]
                data.cemilanHarga = cemilanHarga[position]
                data.cemilanPhoto = cemilanImages[position]
                list.add(data)
            }
            return list
        }
}