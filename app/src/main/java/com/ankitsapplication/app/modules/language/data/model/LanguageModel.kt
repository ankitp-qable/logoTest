package com.ankitsapplication.app.modules.language.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class LanguageModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYoursettingss: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_settings_s)

)
