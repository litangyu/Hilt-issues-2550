package me.kuma.sample.hilt.issues

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import dagger.hilt.android.AndroidEntryPoint

/**
 * Description here.
 *
 * Created on: 4/15/21 3:12 PM
 *
 * @author lty [Contact me.](mailto:lty81372860@gmail.com)
 */
@AndroidEntryPoint
class TestAFragment : BaseListFragment<TestAVM.VM>() {

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return FrameLayout(requireContext()).apply {
      setBackgroundColor(Color.BLUE)
    }
  }
}