package com.refinaldy.newbibit.dummydata

object ReksadanaData{

    private val investmentManager = arrayOf(
        "Sucorinvest Money Market Fund",
        "BNI AM Dana Syariah",
        "Syariah Obligasi",
        "Saham Syariah"
    )

    private val oneYearReturn = arrayOf(
        "7.6%",
        "8.7%",
        "10.5%",
        "14%"
    )

    private val aum = arrayOf(
        "4.5B",
        "2B",
        "1B",
        "5B"
    )

    val listData: ArrayList<Reksadana>
        get() {
            val list:ArrayList<Reksadana> = arrayListOf<Reksadana>()
            for (i:Int in investmentManager.indices){
                val reksadana = Reksadana()
                reksadana.investmentManager = investmentManager[i]
                reksadana.oneYearReturn = oneYearReturn[i]
                reksadana.aum = aum[i]
            }

            return list
        }


}