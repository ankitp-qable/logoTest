package com.ankitsapplication.app.modules.signup.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class SignupModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPersonality: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhencommunity: String? =
      MyApp.getInstance().resources.getString(R.string.msg_when_community)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDuration: String? =
      MyApp.getInstance().resources.getString(R.string.msg_our_community_i3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSubtitile: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etFirstnameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etLastnameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etPasswordValue: String? = null
)
