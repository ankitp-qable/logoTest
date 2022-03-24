package com.ankitsapplication.app.modules.signup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.signup.`data`.model.SignupModel

public class SignupVM : ViewModel() {
  public val signupModel: MutableLiveData<SignupModel> = MutableLiveData(SignupModel())

  public var navArguments: Bundle? = null
}
