package com.spotify.music.features.hiddencontent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.android.glue.patterns.header.behavior.GlueScrollingViewBehavior;

@Deprecated
public class TabBarAccessoryOffsetHeaderBehaviour extends GlueScrollingViewBehavior {
    public TabBarAccessoryOffsetHeaderBehaviour() {
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.android.glue.patterns.header.behavior.GlueScrollingViewBehavior
    public int e() {
        View g = g();
        if (g != null) {
            return g.getMeasuredHeight();
        }
        return 0;
    }

    public TabBarAccessoryOffsetHeaderBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
