package com.spotify.android.glue.patterns.prettylist;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.t;
import com.spotify.android.glue.patterns.prettylist.StickyRecyclerView;

class s extends t {
    s(StickyRecyclerView.DynamicBottomPaddingLinearLayoutManager dynamicBottomPaddingLinearLayoutManager, Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x
    public PointF a(int i) {
        return new PointF(0.0f, (float) i);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.t
    public float q(DisplayMetrics displayMetrics) {
        return 50.0f / ((float) displayMetrics.densityDpi);
    }
}
