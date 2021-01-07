package com.spotify.android.glue.patterns.header.headers;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.android.glue.patterns.prettylist.a;

public class GlueNoHeaderView extends View implements a, a {
    private boolean a;

    public GlueNoHeaderView(Context context) {
        super(context);
    }

    @Override // com.spotify.android.glue.patterns.header.headers.v2.a
    public void a(int i, float f) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getFilterHeight() {
        if (!this.a) {
            return 0;
        }
        int l = nud.l(getContext(), 16843499);
        return Build.VERSION.SDK_INT >= 19 ? l + com.spotify.android.goldenpath.a.d(getContext()) : l;
    }

    @Override // com.spotify.android.glue.patterns.header.headers.a
    public int getTotalScrollRange() {
        return 0;
    }

    @Override // com.spotify.android.glue.patterns.header.headers.a
    public View getView() {
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, z42.A(getFilterHeight()));
    }

    @Override // com.spotify.android.glue.patterns.prettylist.a
    public void setCoordinatorAccessoryOffset(int i) {
    }

    public void setFakingActionBar(boolean z) {
        this.a = z;
    }

    public GlueNoHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GlueNoHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
