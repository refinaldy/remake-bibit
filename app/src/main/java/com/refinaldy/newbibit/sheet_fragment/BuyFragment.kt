package com.refinaldy.newbibit.sheet_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.refinaldy.newbibit.R
import kotlinx.android.synthetic.main.fragment_buy.*


class BuyFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_buy, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val aggreementFragment = AgreementFragment()
        btn_buy.isClickable = false

        val check = et_invest_nominal.text.toString()

        btn_buy_500k.setOnClickListener{
            et_invest_nominal.setText("500000")
            btnActive()
        }

        btn_buy_1000k.setOnClickListener{
            et_invest_nominal.setText("1000000")
            btnActive()
        }

        btn_buy_10000k.setOnClickListener{
            et_invest_nominal.setText("10000000")
            btnActive()
        }

        btn_buy_5000k.setOnClickListener{
            et_invest_nominal.setText("5000000")
            btnActive()

        }

        if(check.isEmpty()){
            println("disable ni")
            btn_buy.isClickable = false
        }


        btn_buy.setOnClickListener{
            aggreementFragment.show(activity?.supportFragmentManager!!, "BottomSheetDialog")
        }

    }

    public fun btnActive(){
        println("masuk")
        btn_buy.isClickable = true
        btn_buy.setBackgroundResource(R.color.btn_active)
    }



}