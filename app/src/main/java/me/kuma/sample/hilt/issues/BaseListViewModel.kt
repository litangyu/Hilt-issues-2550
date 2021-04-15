package me.kuma.sample.hilt.issues

/**
 * Description here.
 *
 * Created on: 4/15/21 3:49 PM
 * @author lty <a href="mailto:lty81372860@gmail.com">Contact me.</a>
 */
interface BaseListViewModel : BaseViewModel {

  open class ViewModel : BaseViewModel.ViewModel(), BaseListViewModel {

  }
}