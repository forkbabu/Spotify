package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.content.Context;
import android.view.ViewGroup;
import defpackage.s51;

final class x extends f0<oa0> {
    public x() {
        super(oa0.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
    public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
        return e90.e().g().e(context, viewGroup);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void g(oa0 oa0, s81 s81, w51 w51, s51.b bVar) {
        oa0.setTitle(s81.text().title());
        oa0.e(s81.text().subtitle());
    }
}
