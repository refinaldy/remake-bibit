package com.refinaldy.newbibit.sheet_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.refinaldy.newbibit.R
import kotlinx.android.synthetic.main.fragment_agreement.*
import kotlinx.android.synthetic.main.fragment_payment.*

class PaymentFragment : BottomSheetDialogFragment() {

    val gopay =
        """
        Gopay
        Verifikasi Otomatis. Gratis biaya transfer
        """

    val linkAja =
        """
        LinkAja
        Verifikasi Otomatis. Gratis biaya transfer
        """

    val virtualAccount =
        """
        Virtual Account
        Verifikasi Otomatis. Tanpa Upload 
        Bukti Pembayaran
        """

    val transferManual =
        """
        Transfer Manual
        Verifikasi Manual. Upload Bukti 
        Pembayaran diperlukan
        """

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_payment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val detailPaymentFragment = DetailPaymentFragment()

        btn_toPay.isClickable = true
        btn_toPay.setBackgroundResource(R.color.btn_active)

        rb_gopay.text = gopay
        rb_link_aja.text = linkAja
        rb_manual.text = transferManual
        rb_virtual_account.text = virtualAccount

        btn_toPay.setOnClickListener{
            detailPaymentFragment.show(activity?.supportFragmentManager!!, "BottomSheetDialog")
        }

    }
}