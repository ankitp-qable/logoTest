package com.ankitsapplication.app.modules.worktoday.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityWorkTodayBinding
import com.ankitsapplication.app.modules.wishlist.ui.WishListActivity
import com.ankitsapplication.app.modules.worktoday.`data`.model.WorkToday1RowModel
import com.ankitsapplication.app.modules.worktoday.`data`.viewmodel.WorkTodayVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class WorkTodayActivity :
    BaseActivity<ActivityWorkTodayBinding>(R.layout.activity_work_today) {
  private val viewModel: WorkTodayVM by viewModels<WorkTodayVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerWorkTodayAdapter =
    RecyclerWorkTodayAdapter(viewModel.recyclerWorkTodayList.value?:mutableListOf())
    binding.recyclerWorkToday.adapter = recyclerWorkTodayAdapter
    recyclerWorkTodayAdapter.setOnItemClickListener(
    object : RecyclerWorkTodayAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : WorkToday1RowModel) {
        onClickRecyclerWorkToday(view, position, item)
      }
    }
    )
    viewModel.recyclerWorkTodayList.observe(this) {
      recyclerWorkTodayAdapter.updateData(it)
    }
    binding.workTodayVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.btnMakeAWishList.setOnClickListener {
      val destIntent = WishListActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public fun onClickRecyclerWorkToday(
    view: View,
    position: Int,
    item: WorkToday1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "WORK_TODAY_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WorkTodayActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
