package com.ankitsapplication.app.modules.termsandconditions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.termsandconditions.`data`.model.TermsandconditionsModel

public class TermsandconditionsVM : ViewModel() {
  public val termsandconditionsModel: MutableLiveData<TermsandconditionsModel> =
      MutableLiveData(TermsandconditionsModel())

  public var navArguments: Bundle? = null
}
