package com.ankitsapplication.app.modules.worktoday.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class WorkToday1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtResearchProduc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_research_produc)

)
