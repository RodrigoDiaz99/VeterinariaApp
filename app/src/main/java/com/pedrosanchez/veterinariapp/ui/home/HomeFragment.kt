package com.pedrosanchez.veterinariapp.ui.home


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment
import com.pedrosanchez.veterinariapp.R


class HomeFragment : Fragment() {

    private lateinit var WebView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater!!.inflate(R.layout.fragment_home, container, false)
        WebView = view.findViewById (R.id.webView) as WebView
        WebView.loadUrl("http://cooperwashh.herokuapp.com")
        return view
    }
}