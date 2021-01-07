package com.spotify.music.libs.mediabrowserservice;

import com.spotify.mobile.android.service.media.error.EISError;
import io.reactivex.functions.c;

public final /* synthetic */ class t0 implements c {
    public final /* synthetic */ x2 a;

    public /* synthetic */ t0(x2 x2Var) {
        this.a = x2Var;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return this.a.e((EISError) obj, (p1) obj2);
    }
}
