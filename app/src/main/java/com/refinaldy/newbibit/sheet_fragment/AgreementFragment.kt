package com.refinaldy.newbibit.sheet_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.refinaldy.newbibit.R
import kotlinx.android.synthetic.main.fragment_agreement.*


class AgreementFragment : BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_agreement, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val paymentFragment = PaymentFragment()
        val rgAgree: RadioGroup = view.findViewById(R.id.rg_agree)
        val rbAgree: RadioButton = view.findViewById(R.id.rb_agree)

        rbAgree.setOnClickListener {
            btnActive()
        }

        btn_pay.setOnClickListener{
            paymentFragment.show(activity?.supportFragmentManager!!, "BottomSheetDialog")
        }

    }

    public fun btnActive(){
        println("masuk")
        btn_pay.isClickable = true
        btn_pay.setBackgroundResource(R.color.btn_active)
    }


}

