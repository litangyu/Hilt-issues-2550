package me.kuma.sample.hilt.issues

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel

/**
 * Description here.
 *
 * Created on: 4/15/21 3:13 PM
 * @author lty <a href="mailto:lty81372860@gmail.com">Contact me.</a>
 */
interface TestBVM {

  class VM
  @ViewModelInject constructor() : ViewModel(), TestBVM {

  }
}