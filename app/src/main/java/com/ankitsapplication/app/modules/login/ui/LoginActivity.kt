package com.ankitsapplication.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityLoginBinding
import com.ankitsapplication.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.ankitsapplication.app.modules.home.ui.HomeActivity
import com.ankitsapplication.app.modules.login.`data`.viewmodel.LoginVM
import com.ankitsapplication.app.modules.signup.ui.SignupActivity
import kotlin.String
import kotlin.Unit

public class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.loginVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearDonthaveana.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtForgotPasswor.setOnClickListener {
      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNext.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "LOGIN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
