package com.ankitsapplication.app.modules.language.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.language.`data`.model.LanguageModel

public class LanguageVM : ViewModel() {
  public val languageModel: MutableLiveData<LanguageModel> = MutableLiveData(LanguageModel())

  public var navArguments: Bundle? = null
}
