package com.spotify.libs.connect.providers;

import io.reactivex.functions.h;

public final /* synthetic */ class d implements h {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.h
    public final Object a(Object obj, Object obj2, Object obj3) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() && (((Boolean) obj2).booleanValue() || !((Boolean) obj3).booleanValue()));
    }
}
