package com.ankitsapplication.app.modules.login.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPersonality: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtThisisyourco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_is_your_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOurcommunityi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_our_community_i2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgotPasswor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_signup2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etPasswordValue: String? = null
)
