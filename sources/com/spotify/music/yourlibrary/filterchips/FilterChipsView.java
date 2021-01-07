package com.spotify.music.yourlibrary.filterchips;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.common.collect.ImmutableList;

public class FilterChipsView extends FrameLayout implements s {
    private r a;
    private t b;

    public FilterChipsView(Context context) {
        super(context);
        b();
    }

    private void b() {
        q qVar = new q(getContext(), this);
        addView(qVar.c());
        this.a = new r(qVar);
        getViewTreeObserver().addOnPreDrawListener(new o(this));
    }

    public void c() {
        t tVar = this.b;
        if (tVar != null) {
            tVar.b();
        }
    }

    public void d(String str, String str2, boolean z, int i) {
        t tVar = this.b;
        if (tVar != null) {
            tVar.a(str, str2, z, i);
        }
    }

    public void setFilterChips(ImmutableList<l> immutableList) {
        this.a.b(immutableList);
    }

    public void setFilterStateChangeListener(t tVar) {
        this.b = tVar;
    }

    public FilterChipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public FilterChipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }
}
