package com.ankitsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityAppNavigationBinding
import com.ankitsapplication.app.modules.adacana.ui.AdacanaActivity
import com.ankitsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.ankitsapplication.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.ankitsapplication.app.modules.home.ui.HomeActivity
import com.ankitsapplication.app.modules.language.ui.LanguageActivity
import com.ankitsapplication.app.modules.login.ui.LoginActivity
import com.ankitsapplication.app.modules.loginorsignup.ui.LoginOrSignupActivity
import com.ankitsapplication.app.modules.personality.ui.PersonalityActivity
import com.ankitsapplication.app.modules.settings.ui.SettingsActivity
import com.ankitsapplication.app.modules.signup.ui.SignupActivity
import com.ankitsapplication.app.modules.termsandconditions.ui.TermsandconditionsActivity
import com.ankitsapplication.app.modules.wishlist.ui.WishListActivity
import com.ankitsapplication.app.modules.worktoday.ui.WorkTodayActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLoginOrSignUp.setOnClickListener {
      val destIntent = LoginOrSignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAdacana.setOnClickListener {
      val destIntent = AdacanaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTermsAndConditions.setOnClickListener {
      val destIntent = TermsandconditionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPersonality.setOnClickListener {
      val destIntent = PersonalityActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearWishList.setOnClickListener {
      val destIntent = WishListActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLanguage.setOnClickListener {
      val destIntent = LanguageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearWorkToday.setOnClickListener {
      val destIntent = WorkTodayActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSettings.setOnClickListener {
      val destIntent = SettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUp.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
