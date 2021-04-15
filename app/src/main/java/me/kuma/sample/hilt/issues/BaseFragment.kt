package me.kuma.sample.hilt.issues

import androidx.fragment.app.Fragment

/**
 * Description here.
 *
 * Created on: 4/15/21 3:48 PM
 * @author lty <a href="mailto:lty81372860@gmail.com">Contact me.</a>
 */
abstract class BaseFragment<VM: BaseViewModel>: Fragment() {

  lateinit var viewModel: VM
}