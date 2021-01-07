package com.spotify.music.features.home.common.viewbinder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.header.behavior.e;
import com.spotify.android.glue.patterns.header.headers.a;
import com.spotify.music.C0707R;

public class FadingHomeHeaderView extends View implements a, com.spotify.android.glue.patterns.prettylist.a {
    public static final /* synthetic */ int c = 0;
    private e a;
    private final int b;

    public FadingHomeHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.android.glue.patterns.header.headers.v2.a
    public void a(int i, float f) {
        this.a.a(f);
    }

    @Override // com.spotify.android.glue.patterns.header.headers.a
    public int getTotalScrollRange() {
        return this.b;
    }

    @Override // com.spotify.android.glue.patterns.header.headers.a
    public View getView() {
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, z42.A(this.b));
    }

    @Override // com.spotify.android.glue.patterns.prettylist.a
    public void setCoordinatorAccessoryOffset(int i) {
    }

    public void setScrollObserver(e eVar) {
        this.a = (e) MoreObjects.firstNonNull(eVar, a.a);
    }

    public FadingHomeHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = a.a;
        int l = (nud.l(context, C0707R.attr.actionBarSize) / 2) + com.spotify.android.goldenpath.a.e(context.getResources());
        this.b = l;
        setLayoutParams(new FrameLayout.LayoutParams(-1, l));
    }
}
