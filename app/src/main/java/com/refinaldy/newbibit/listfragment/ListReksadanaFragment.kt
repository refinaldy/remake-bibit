package com.refinaldy.newbibit.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.refinaldy.newbibit.R
import com.refinaldy.newbibit.adapter.ReksadanaAdapter
import com.refinaldy.newbibit.dummydata.Reksadana
import com.refinaldy.newbibit.dummydata.ReksadanaData
import com.refinaldy.newbibit.menu_fragment.HomeFragment
import kotlinx.android.synthetic.main.fragment_list_reksadana.*


class ListReksadanaFragment : Fragment() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ReksadanaAdapter.ViewHolder>? = null
    private var list: ArrayList<Reksadana> = arrayListOf()

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
        return inflater.inflate(R.layout.fragment_list_reksadana, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)



        recyclerView_reksadana.apply {
            layoutManager = LinearLayoutManager(activity)
            list.addAll(ReksadanaData.listData)
            adapter = ReksadanaAdapter()


        }

        btn_back_to_home.setOnClickListener {
            val homeFragment = HomeFragment()
        }


    }


}