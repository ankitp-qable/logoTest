package com.ankitsapplication.app.modules.settings.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitsapplication.app.R
import com.ankitsapplication.app.databinding.RowSettings1Binding
import com.ankitsapplication.app.modules.settings.`data`.model.Settings1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerSettingsAdapter(
  public var list: List<Settings1RowModel>
) : RecyclerView.Adapter<RecyclerSettingsAdapter.RowSettings1VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSettings1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_settings1,parent,false)
    return RowSettings1VH(view)
  }

  public override fun onBindViewHolder(holder: RowSettings1VH, position: Int): Unit {
    val settings1RowModel = Settings1RowModel()
    // TODO uncomment following line after integration with data source
    // val settings1RowModel = list[position]
    holder.binding.settings1RowModel = settings1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Settings1RowModel>): Unit {
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
      item: Settings1RowModel
    ): Unit {
    }
  }

  public inner class RowSettings1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSettings1Binding = RowSettings1Binding.bind(itemView)
    init {
      binding.linearPersonality.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Settings1RowModel())
      }
    }
  }
}
