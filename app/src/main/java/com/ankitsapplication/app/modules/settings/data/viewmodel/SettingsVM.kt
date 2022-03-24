package com.ankitsapplication.app.modules.settings.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.settings.`data`.model.Settings1RowModel
import com.ankitsapplication.app.modules.settings.`data`.model.SettingsModel
import kotlin.collections.MutableList

public class SettingsVM : ViewModel() {
  public val settingsModel: MutableLiveData<SettingsModel> = MutableLiveData(SettingsModel())

  public var navArguments: Bundle? = null

  public val recyclerSettingsList: MutableLiveData<MutableList<Settings1RowModel>> =
      MutableLiveData(mutableListOf())
}
