package com.refinaldy.newbibit.menu_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.refinaldy.newbibit.R
import com.refinaldy.newbibit.listfragment.ListReksadanaFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listReksadanaFragment = ListReksadanaFragment()
        ic_rdpu.setOnClickListener{
            makeCurrentFragment(listReksadanaFragment)
        }

        ic_rdpt.setOnClickListener{
            makeCurrentFragment(listReksadanaFragment)
        }

        ic_rds.setOnClickListener{
            makeCurrentFragment(listReksadanaFragment)
        }


    }

    private fun makeCurrentFragment(fragment: Fragment) =
            activity?.supportFragmentManager?.beginTransaction()?.apply {
                replace(R.id.fl_wrapper, fragment)
                commit()
            }
}