package com.ankitsapplication.app.modules.settings.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class SettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYoursettingss: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_settings_s)

)
