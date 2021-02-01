package com.refinaldy.newbibit.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.refinaldy.newbibit.R
import com.refinaldy.newbibit.sheet_fragment.BuyFragment
import kotlinx.android.synthetic.main.activity_detail_reksadana.*

class DetailReksadanaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_reksadana)

        val buyFragment = BuyFragment()

        btn_buy_detail.setOnClickListener{
            buyFragment.show(supportFragmentManager, "BottomSheetDialog")
        }
        btn_buy_detail.isClickable = true
        btn_buy_detail.setBackgroundResource(R.color.btn_active)



    }

}