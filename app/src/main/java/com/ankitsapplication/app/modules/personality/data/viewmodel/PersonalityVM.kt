package com.ankitsapplication.app.modules.personality.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.personality.`data`.model.PersonalityModel

public class PersonalityVM : ViewModel() {
  public val personalityModel: MutableLiveData<PersonalityModel> =
      MutableLiveData(PersonalityModel())

  public var navArguments: Bundle? = null
}
