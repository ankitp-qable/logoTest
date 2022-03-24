package com.ankitsapplication.app.modules.personality.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityPersonalityBinding
import com.ankitsapplication.app.modules.personality.`data`.viewmodel.PersonalityVM
import com.ankitsapplication.app.modules.worktoday.ui.WorkTodayActivity
import kotlin.String
import kotlin.Unit

public class PersonalityActivity :
    BaseActivity<ActivityPersonalityBinding>(R.layout.activity_personality) {
  private val viewModel: PersonalityVM by viewModels<PersonalityVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    binding.personalityVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnChangeSave.setOnClickListener {
      val destIntent = WorkTodayActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "PERSONALITY_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PersonalityActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
