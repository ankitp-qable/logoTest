package com.ankitsapplication.app.modules.wishlist.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class WishListModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMakeawishlis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_make_a_wish_lis)
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
  public var txtTasktodo: String? = MyApp.getInstance().resources.getString(R.string.lbl_task_todo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAttachments: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_attachments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etTaskfieldValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etDatefieldValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etFilesizeValue: String? = null
)
