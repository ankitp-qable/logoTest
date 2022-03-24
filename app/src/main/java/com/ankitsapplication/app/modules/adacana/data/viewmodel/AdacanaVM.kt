package com.ankitsapplication.app.modules.adacana.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.adacana.`data`.model.AdacanaModel

public class AdacanaVM : ViewModel() {
  public val adacanaModel: MutableLiveData<AdacanaModel> = MutableLiveData(AdacanaModel())

  public var navArguments: Bundle? = null
}
