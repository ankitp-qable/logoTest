package com.ankitsapplication.app.modules.personality.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class PersonalityModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPersonality: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_personality)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEditPhoto: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_edit_photo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUserName: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFirstname: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLastname: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHobby: String? = MyApp.getInstance().resources.getString(R.string.lbl_hobby)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDateofbirth: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_country)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etUsernameValue: String? = null,
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
  public var etHobbyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etPriceValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etCountryValue: String? = null
)
