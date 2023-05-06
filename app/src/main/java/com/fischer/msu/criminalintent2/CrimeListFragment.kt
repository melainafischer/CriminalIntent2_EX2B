package com.fischer.msu.criminalintent2
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

private const val TAG = "CrimeListFragment"

class CrimeListFragment: Fragment() {

    private val crimeListViewModel :CrimeListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "total Crimes : ${crimeListViewModel.crimes.size}")
    }
}