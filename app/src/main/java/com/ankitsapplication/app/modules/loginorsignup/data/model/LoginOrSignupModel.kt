package com.ankitsapplication.app.modules.loginorsignup.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginOrSignupModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWelcometoour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_our)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOurcommunityi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_our_community_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGetinthrough: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_get_in_through)

)
