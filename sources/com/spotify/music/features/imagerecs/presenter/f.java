package com.spotify.music.features.imagerecs.presenter;

import com.spotify.cosmos.router.Request;
import io.reactivex.a0;
import io.reactivex.c0;
import okhttp3.a0;
import okhttp3.e;
import okhttp3.y;

public final /* synthetic */ class f implements c0 {
    public final /* synthetic */ o a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ String c;

    public /* synthetic */ f(o oVar, byte[] bArr, String str) {
        this.a = oVar;
        this.b = bArr;
        this.c = str;
    }

    @Override // io.reactivex.c0
    public final void subscribe(a0 a0Var) {
        o oVar = this.a;
        byte[] bArr = this.b;
        String str = this.c;
        oVar.getClass();
        okhttp3.c0 e = okhttp3.c0.e(null, bArr);
        a0.a aVar = new a0.a();
        aVar.j(str);
        aVar.g(Request.PUT, e);
        e b2 = new y.b().c().b(aVar.b());
        b2.h1(new n(oVar, a0Var));
        a0Var.e(new g(b2));
    }
}
