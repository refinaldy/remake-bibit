package com.refinaldy.newbibit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.refinaldy.newbibit.menu_fragment.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val portofolioFragment = PortofolioFragment()
        val transactionFragment = TransactionFragment()
        val supportFragment = SupportFragment()
        val profileFragment = ProfileFragment()

        makeCurrentFragment(homeFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){

                R.id.ic_home -> makeCurrentFragment(homeFragment)
                R.id.ic_portofolio -> makeCurrentFragment(portofolioFragment)
                R.id.ic_transaction -> makeCurrentFragment(transactionFragment)
                R.id.ic_support -> makeCurrentFragment(supportFragment)
                R.id.ic_profile -> makeCurrentFragment(profileFragment)
            }
            true

        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }

}