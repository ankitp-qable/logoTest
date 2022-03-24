package com.ankitsapplication.app.modules.forgotpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityForgotPasswordBinding
import com.ankitsapplication.app.modules.forgotpassword.`data`.viewmodel.ForgotPasswordVM
import com.ankitsapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

public class ForgotPasswordActivity :
    BaseActivity<ActivityForgotPasswordBinding>(R.layout.activity_forgot_password) {
  private val viewModel: ForgotPasswordVM by viewModels<ForgotPasswordVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.forgotPasswordVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnStart.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "FORGOT_PASSWORD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgotPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
