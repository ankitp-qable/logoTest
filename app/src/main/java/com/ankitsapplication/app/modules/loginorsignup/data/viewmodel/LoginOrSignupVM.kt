package com.ankitsapplication.app.modules.loginorsignup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.loginorsignup.`data`.model.LoginOrSignupModel

public class LoginOrSignupVM : ViewModel() {
  public val loginOrSignupModel: MutableLiveData<LoginOrSignupModel> =
      MutableLiveData(LoginOrSignupModel())

  public var navArguments: Bundle? = null
}
