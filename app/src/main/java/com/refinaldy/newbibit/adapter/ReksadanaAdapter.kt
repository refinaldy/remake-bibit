package com.refinaldy.newbibit.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.refinaldy.newbibit.activity.DetailReksadanaActivity
import com.refinaldy.newbibit.databinding.ItemListReksadanaBinding

class ReksadanaAdapter() : RecyclerView.Adapter<ReksadanaAdapter.ViewHolder>(){

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
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemListReksadanaBinding.inflate(inflater)


        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return investmentManager.size
    }

    override fun onBindViewHolder(holder: ReksadanaAdapter.ViewHolder, position: Int) {

        holder.itemTitle.text = investmentManager[position]
        holder.itemReturn.text = oneYearReturn[position].toString()
        holder.itemExpenseRatio.text =expenseRatio[position]
        holder.itemAum.text = aum[position]

        holder.reksadanaCard.setOnClickListener{
            val context = holder.itemView.context
            val intent = Intent(context, DetailReksadanaActivity::class.java)
            context.startActivity(intent)
        }


    }

    class ViewHolder(binding: ItemListReksadanaBinding) : RecyclerView.ViewHolder(binding.root){
        val itemTitle = binding.titleListReksadana
        val itemReturn = binding.returnYear
        val itemExpenseRatio = binding.expenseRatio
        val itemAum = binding.aum
        val reksadanaCard = binding.reksadanaCard
    }








}