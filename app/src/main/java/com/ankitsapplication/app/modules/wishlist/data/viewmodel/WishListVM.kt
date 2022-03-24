package com.ankitsapplication.app.modules.wishlist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.wishlist.`data`.model.WishListModel

public class WishListVM : ViewModel() {
  public val wishListModel: MutableLiveData<WishListModel> = MutableLiveData(WishListModel())

  public var navArguments: Bundle? = null
}
