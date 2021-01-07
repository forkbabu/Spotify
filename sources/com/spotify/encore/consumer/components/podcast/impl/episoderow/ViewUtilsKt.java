package com.spotify.encore.consumer.components.podcast.impl.episoderow;

import android.view.View;
import kotlin.jvm.internal.h;

public final class ViewUtilsKt {
    public static final void isGoneIf(View view, cmf<Boolean> cmf) {
        h.e(view, "$this$isGoneIf");
        h.e(cmf, "predicate");
        isVisibleIf(view, new ViewUtilsKt$isGoneIf$1(cmf), true);
    }

    public static final void isInvisibleIf(View view, cmf<Boolean> cmf) {
        h.e(view, "$this$isInvisibleIf");
        h.e(cmf, "predicate");
        isVisibleIf$default(view, new ViewUtilsKt$isInvisibleIf$1(cmf), false, 2, null);
    }

    private static final void isVisibleIf(View view, cmf<Boolean> cmf, boolean z) {
        view.setVisibility(cmf.invoke().booleanValue() ? 0 : z ? 8 : 4);
    }

    static /* synthetic */ void isVisibleIf$default(View view, cmf cmf, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        isVisibleIf(view, cmf, z);
    }
}
