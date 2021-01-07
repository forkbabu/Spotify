package com.spotify.music.carmodehome.page;

import android.view.View;
import kotlin.jvm.internal.h;

public final class b implements View.OnLayoutChangeListener {
    final /* synthetic */ a a;

    public b(a aVar) {
        this.a = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        h.f(view, "view");
        view.removeOnLayoutChangeListener(this);
        a.l(this.a).f();
    }
}
