package ru.netology.nmedia.ui

import androidx.appcompat.app.AppCompatActivity
import ru.netology.nmedia.R

class AppActivity : AppCompatActivity(R.layout.app_activity)

//{
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        val binding = AppActivityBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        if (supportFragmentManager.findFragmentByTag(FeedFragment.TAG) == null) {
//            supportFragmentManager.commit {
//                add(R.id.fragmentContainer, FeedFragment(), FeedFragment.TAG)
//            }
//        }
//    }
//
//}