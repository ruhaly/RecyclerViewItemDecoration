package com.zyyoona7.demo.adapter

import com.chad.library.adapter.base.BaseSectionQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.zyyoona7.demo.R
import com.zyyoona7.demo.SectionData

/**
 * @author zyyoona7
 * @version v1.0
 * @since 2018/12/17.
 */
class SectionAdapter :
    BaseSectionQuickAdapter<SectionData, BaseViewHolder>(
        R.layout.item_data,
        R.layout.item_section_header, null) {

    override fun convertHead(helper: BaseViewHolder, item: SectionData) {
        helper.setText(R.id.tv_item_header_text, item.header)
    }

    override fun convert(helper: BaseViewHolder, item: SectionData) {
        helper.setText(R.id.tv_item_data, item.text)
    }

    fun sectionItemType():Int{
        return SECTION_HEADER_VIEW
    }
}
