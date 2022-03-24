package com.ankitsapplication.app.modules.worktoday.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class WorkTodayModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMakeawishlis: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_work_today_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMakeyourjobe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_make_your_job_e)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_02_april_2021)

)
