package com.ankitsapplication.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivitySignupBinding
import com.ankitsapplication.app.modules.home.ui.HomeActivity
import com.ankitsapplication.app.modules.login.ui.LoginActivity
import com.ankitsapplication.app.modules.signup.`data`.viewmodel.SignupVM
import kotlin.String
import kotlin.Unit

public class SignupActivity : BaseActivity<ActivitySignupBinding>(R.layout.activity_signup) {
  private val viewModel: SignupVM by viewModels<SignupVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.signupVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAlreadyhavean.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "SIGNUP_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignupActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
