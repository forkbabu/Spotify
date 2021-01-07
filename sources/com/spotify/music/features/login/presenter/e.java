package com.spotify.music.features.login.presenter;

import io.reactivex.functions.c;

public final /* synthetic */ class e implements c {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return Boolean.valueOf(!((CharSequence) obj).toString().trim().isEmpty() && ((CharSequence) obj2).length() > 0);
    }
}
