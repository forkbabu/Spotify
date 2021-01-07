package com.spotify.music.features.home.common.datasource;

import io.reactivex.functions.l;
import okhttp3.e0;
import retrofit2.v;

public final /* synthetic */ class e implements l {
    public final /* synthetic */ j a;

    public /* synthetic */ e(j jVar) {
        this.a = jVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        j jVar = this.a;
        v vVar = (v) obj;
        jVar.getClass();
        e0 e0Var = (e0) vVar.a();
        if (vVar.f() && e0Var != null) {
            return jVar.a(e0Var.b());
        }
        e0 d = vVar.d();
        if (!vVar.f() && d != null) {
            return jVar.a(d.b());
        }
        throw new HomeResponseParseException();
    }
}
