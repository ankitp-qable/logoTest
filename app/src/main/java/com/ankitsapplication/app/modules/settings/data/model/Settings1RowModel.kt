package com.ankitsapplication.app.modules.settings.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class Settings1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPersonality: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_personality)

)
