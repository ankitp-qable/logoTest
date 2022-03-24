package com.ankitsapplication.app.modules.settings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivitySettingsBinding
import com.ankitsapplication.app.modules.language.ui.LanguageActivity
import com.ankitsapplication.app.modules.personality.ui.PersonalityActivity
import com.ankitsapplication.app.modules.settings.`data`.model.Settings1RowModel
import com.ankitsapplication.app.modules.settings.`data`.viewmodel.SettingsVM
import com.ankitsapplication.app.modules.termsandconditions.ui.TermsandconditionsActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SettingsActivity : BaseActivity<ActivitySettingsBinding>(R.layout.activity_settings) {
  private val viewModel: SettingsVM by viewModels<SettingsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerSettingsAdapter =
    RecyclerSettingsAdapter(viewModel.recyclerSettingsList.value?:mutableListOf())
    binding.recyclerSettings.adapter = recyclerSettingsAdapter
    recyclerSettingsAdapter.setOnItemClickListener(
    object : RecyclerSettingsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Settings1RowModel) {
        onClickRecyclerSettings(view, position, item)
      }
    }
    )
    viewModel.recyclerSettingsList.observe(this) {
      recyclerSettingsAdapter.updateData(it)
    }
    binding.settingsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerSettings(
    view: View,
    position: Int,
    item: Settings1RowModel
  ): Unit {
    when(view.id) {
      R.id.linearPersonality ->  {
        onClickRecyclerSettingsLinearPersonality(view, position, item)
      }
    }
  }

  public fun onClickRecyclerSettingsLinearPersonality(
    view: View,
    position: Int,
    item: Settings1RowModel
  ): Unit {
    when(0) {
      0 ->  {
        val destIntent = PersonalityActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 ->  {
        val destIntent = TermsandconditionsActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 ->  {
        val destIntent = LanguageActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  public companion object {
    public const val TAG: String = "SETTINGS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SettingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
