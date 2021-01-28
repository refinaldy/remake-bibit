package com.refinaldy.newbibit.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.refinaldy.newbibit.DetailReksadanaActivity
import com.refinaldy.newbibit.R
import com.refinaldy.newbibit.dummydata.Reksadana
import com.refinaldy.newbibit.dummydata.ReksadanaData
import kotlinx.android.synthetic.main.item_list_reksadana.view.*

class ReksadanaAdapter(private val listReksadana: ArrayList<Reksadana>) : RecyclerView.Adapter<ReksadanaAdapter.ViewHolder>(){

    private val investmentManager = arrayOf(
            "Sucorinvest Money Market Fund",
            "BNI AM Dana Syariah",
            "Syariah Obligasi",
            "Saham Syariah"
    )

    private val oneYearReturn = arrayOf(
            7.65 ,
            8.74,
            10.53,
            14.00
    )

    private val aum = arrayOf(
            "4.5B",
            "2B",
            "1B",
            "5B"
    )

    private val expenseRatio = arrayOf(
            "0.45%",
            "0.50%",
            "0.20%",
            "0.7%"
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReksadanaAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_list_reksadana, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return listReksadana.size
    }

    override fun onBindViewHolder(holder: ReksadanaAdapter.ViewHolder, position: Int) {

        holder.itemTitle.text = investmentManager[position]
        holder.itemReturn.text = oneYearReturn[position].toString()
        holder.itemExpenseRatio.text =expenseRatio[position]
        holder.itemAum.text = aum[position]

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemTitle: TextView
        var itemReturn: TextView
        var itemAum: TextView
        var itemExpenseRatio: TextView

        init{
            itemTitle = itemView.findViewById(R.id.title_list_reksadana)
            itemReturn = itemView.findViewById(R.id.return_year)
            itemAum = itemView.findViewById(R.id.aum)
            itemExpenseRatio = itemView.findViewById(R.id.expense_ratio)

            itemView.setOnClickListener {
                var position: Int = getAdapterPosition()
                val context = itemView.context
                val intent = Intent(context, DetailReksadanaActivity::class.java).apply {
                    putExtra("NUMBER", position)
                    putExtra("TITLE", itemTitle.text)
                    putExtra("RETURN", itemReturn.text)
                    putExtra("AUM", itemAum.text)
                    putExtra("EXPENSERATIO", itemExpenseRatio.text)
                }
                context.startActivity(intent)
            }
        }

    }


}