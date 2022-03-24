package com.ankitsapplication.app.modules.forgotpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.forgotpassword.`data`.model.ForgotPasswordModel

public class ForgotPasswordVM : ViewModel() {
  public val forgotPasswordModel: MutableLiveData<ForgotPasswordModel> =
      MutableLiveData(ForgotPasswordModel())

  public var navArguments: Bundle? = null
}
