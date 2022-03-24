package com.ankitsapplication.app.modules.appnavigation.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAdacana: String? = MyApp.getInstance().resources.getString(R.string.lbl_adacana)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoginOrSignUp: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_login_or_signup)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWorkToday: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_work_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWishList: String? = MyApp.getInstance().resources.getString(R.string.lbl_wish_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPersonality: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_personality)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_signup2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTermsAndConditions: String? =
      MyApp.getInstance().resources.getString(R.string.msg_termsandconditi)

)
