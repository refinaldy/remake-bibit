package com.refinaldy.newbibit.sheet_fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.refinaldy.newbibit.R
import com.refinaldy.newbibit.activity.DetailReksadanaActivity
import com.refinaldy.newbibit.activity.MainActivity
import kotlinx.android.synthetic.main.fragment_detail_payment.*


class DetailPaymentFragment : BottomSheetDialogFragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_payment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_endPay.setOnClickListener {
            val context = view.context
            val intent = Intent(context, MainActivity::class.java)
            intent.putExtra("to", "transaction")
            context.startActivity(intent)
        }
    }

}