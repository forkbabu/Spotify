package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.content.Context;
import android.view.ViewGroup;
import defpackage.s51;

final class y extends f0<qa0> {
    public y() {
        super(qa0.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
    public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
        return e90.e().g().f(context, viewGroup);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void g(qa0 qa0, s81 s81, w51 w51, s51.b bVar) {
        qa0.setTitle(s81.text().title());
        qa0.setSubtitle(s81.text().subtitle());
    }
}
