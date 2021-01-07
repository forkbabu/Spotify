package com.spotify.mobile.android.service.media;

import com.spotify.music.follow.j;
import io.reactivex.a;
import io.reactivex.functions.l;

public final /* synthetic */ class o implements l {
    public final /* synthetic */ c2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ o(c2 c2Var, String str, boolean z) {
        this.a = c2Var;
        this.b = str;
        this.c = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        c2 c2Var = this.a;
        String str = this.b;
        boolean z = this.c;
        c2Var.getClass();
        return a.u(new p(c2Var, (j) obj, str, z));
    }
}
