package com.ankitsapplication.app.modules.worktoday.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.worktoday.`data`.model.WorkToday1RowModel
import com.ankitsapplication.app.modules.worktoday.`data`.model.WorkTodayModel
import kotlin.collections.MutableList

public class WorkTodayVM : ViewModel() {
  public val workTodayModel: MutableLiveData<WorkTodayModel> = MutableLiveData(WorkTodayModel())

  public var navArguments: Bundle? = null

  public val recyclerWorkTodayList: MutableLiveData<MutableList<WorkToday1RowModel>> =
      MutableLiveData(mutableListOf())
}
