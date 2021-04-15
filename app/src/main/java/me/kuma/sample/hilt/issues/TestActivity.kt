package me.kuma.sample.hilt.issues

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import dagger.hilt.android.AndroidEntryPoint

/**
 * Description here.
 *
 * Created on: 4/15/21 3:15 PM
 * @author lty <a href="mailto:lty81372860@gmail.com">Contact me.</a>
 */
@AndroidEntryPoint
class TestActivity: AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_test)

    supportFragmentManager.commit {
      replace(R.id.fragment_container_a, TestAFragment::class.java, null)
      replace(R.id.fragment_container_b, TestBFragment::class.java, null)
    }
  }
}