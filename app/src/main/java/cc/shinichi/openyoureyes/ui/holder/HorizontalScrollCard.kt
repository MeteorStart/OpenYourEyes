package cc.shinichi.openyoureyes.ui.holder

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.PagerSnapHelper
import android.support.v7.widget.RecyclerView
import cc.shinichi.openyoureyes.R
import cc.shinichi.openyoureyes.model.bean.home.Item
import cc.shinichi.openyoureyes.model.entity.HomeDataEntity
import cc.shinichi.openyoureyes.ui.adapter.HorRvAdapter
import cc.shinichi.openyoureyes.widget.decoration.HorRvDecoration
import com.chad.library.adapter.base.BaseViewHolder

class HorizontalScrollCard {

  private var context: Context
  private var helper: BaseViewHolder
  private var entity: HomeDataEntity

  private var list: MutableList<Item?> = mutableListOf()
  private lateinit var adapter: HorRvAdapter
  private lateinit var manager: LinearLayoutManager
  private lateinit var snapHelper: PagerSnapHelper

  constructor(
    context: Context,
    helper: BaseViewHolder,
    entity: HomeDataEntity
  ) {
    this.context = context
    this.entity = entity
    this.helper = helper
    setData()
  }

  private fun setData() {
    if (entity.getItem()?.data?.itemList == null) {
      return
    }
    val recyclerView = helper.getView<RecyclerView>(R.id.rv_horizontalScrollCard)
    manager = LinearLayoutManager(context)
    manager.orientation = LinearLayoutManager.HORIZONTAL
    recyclerView.layoutManager = manager
    recyclerView.onFlingListener = null
    snapHelper = PagerSnapHelper()
    snapHelper.attachToRecyclerView(recyclerView)
    if (list.size > 0) {
      list.clear()
    }
    list.addAll(entity.getItem()?.data?.itemList!!)
    adapter = HorRvAdapter(context, list)
    recyclerView.adapter = adapter
    val decoration = HorRvDecoration(adapter.itemCount)
    val decorationCount = recyclerView.itemDecorationCount
    if (decorationCount > 0) {
      for (i in 0 until decorationCount) {
        recyclerView.removeItemDecorationAt(i)
      }
    }
    recyclerView.addItemDecoration(decoration)
  }
}