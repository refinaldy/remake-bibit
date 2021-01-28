package com.refinaldy.newbibit.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.refinaldy.newbibit.R
import com.refinaldy.newbibit.dummydata.Reksadana
import kotlinx.android.synthetic.main.item_list_reksadana.view.*

class ReksadanaAdapter(private val listReksadana: ArrayList<Reksadana>) : RecyclerView.Adapter<ReksadanaAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReksadanaAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ReksadanaAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
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

        }

    }


}