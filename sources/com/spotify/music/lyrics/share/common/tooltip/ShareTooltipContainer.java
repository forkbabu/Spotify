package com.spotify.music.lyrics.share.common.tooltip;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.mobile.android.spotlets.tooltip.TooltipContainer;
import kotlin.jvm.internal.h;

public final class ShareTooltipContainer extends TooltipContainer {
    public ShareTooltipContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareTooltipContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }
}
