package com.ankitsapplication.app.modules.worktoday.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitsapplication.app.R
import com.ankitsapplication.app.databinding.RowWorkToday1Binding
import com.ankitsapplication.app.modules.worktoday.`data`.model.WorkToday1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerWorkTodayAdapter(
  public var list: List<WorkToday1RowModel>
) : RecyclerView.Adapter<RecyclerWorkTodayAdapter.RowWorkToday1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowWorkToday1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_work_today1,parent,false)
    return RowWorkToday1VH(view)
  }

  public override fun onBindViewHolder(holder: RowWorkToday1VH, position: Int): Unit {
    val workToday1RowModel = WorkToday1RowModel()
    // TODO uncomment following line after integration with data source
    // val workToday1RowModel = list[position]
    holder.binding.workToday1RowModel = workToday1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<WorkToday1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: WorkToday1RowModel
    ): Unit {
    }
  }

  public inner class RowWorkToday1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowWorkToday1Binding = RowWorkToday1Binding.bind(itemView)
  }
}
