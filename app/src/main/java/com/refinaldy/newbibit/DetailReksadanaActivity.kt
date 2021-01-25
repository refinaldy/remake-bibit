package com.refinaldy.newbibit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.refinaldy.newbibit.sheet_fragment.AgreementFragment
import com.refinaldy.newbibit.sheet_fragment.BuyFragment
import kotlinx.android.synthetic.main.activity_detail_reksadana.*
import kotlinx.android.synthetic.main.fragment_buy.*

class DetailReksadanaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_reksadana)

        val buyFragment = BuyFragment()

        btn_buy_detail.setOnClickListener{
            buyFragment.show(supportFragmentManager, "BottomSheetDialog")
        }

        val aggreementFragment = AgreementFragment()


    }

}