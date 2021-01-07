package com.spotify.mobile.android.skiplimitpivot;

import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class d implements io.reactivex.functions.d {
    private final /* synthetic */ rmf a;

    d(rmf rmf) {
        this.a = rmf;
    }

    @Override // io.reactivex.functions.d
    public final /* synthetic */ boolean a(Object obj, Object obj2) {
        Object invoke = this.a.invoke(obj, obj2);
        h.d(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
