package com.ankitsapplication.app.modules.home.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.home.`data`.model.HomeModel

public class HomeVM : ViewModel() {
  public val homeModel: MutableLiveData<HomeModel> = MutableLiveData(HomeModel())

  public var navArguments: Bundle? = null
}
