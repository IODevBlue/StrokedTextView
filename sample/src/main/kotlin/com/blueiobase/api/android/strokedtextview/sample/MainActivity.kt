package com.blueiobase.api.android.strokedtextview.sample

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {

    private val githubButton: ImageButton by lazy { findViewById(R.id.github_button) }
    private val repoLink = "https://github.com/IODevBlue/StrokedTextView"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        githubButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(repoLink)
            startActivity(intent)
        }

    }
}