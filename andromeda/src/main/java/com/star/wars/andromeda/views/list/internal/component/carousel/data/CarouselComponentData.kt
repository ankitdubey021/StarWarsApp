package com.star.wars.andromeda.views.list.internal.component.carousel.data

import android.os.Parcelable
import com.star.wars.andromeda.views.list.*
import kotlinx.parcelize.Parcelize

@Parcelize
data class CarouselComponentData(
    override val id: String = "",
    override val width: Width = Width.FILL,
    override val height: Height = Height.WRAP,
    override val gravity: Gravity = Gravity.NO_GRAVITY,
    override val viewType: String = "carousel",
    override val paddingHorizontal: Int = 0,
    override val paddingVertical: Int = 0,
    override val extraPayload: Parcelable? = null,
    val children: MutableList<BaseComponentData> = mutableListOf()
) : ComponentData
