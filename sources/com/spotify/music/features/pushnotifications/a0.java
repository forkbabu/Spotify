package com.spotify.music.features.pushnotifications;

import com.spotify.music.features.pushnotifications.model.RichPushData;
import java.util.List;

public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ x0 a;
    public final /* synthetic */ RichPushData b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String f;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ List r;

    public /* synthetic */ a0(x0 x0Var, RichPushData richPushData, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.a = x0Var;
        this.b = richPushData;
        this.c = str;
        this.f = str2;
        this.n = str3;
        this.o = str4;
        this.p = str5;
        this.q = str6;
        this.r = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j(this.b, this.c, this.f, this.n, this.o, this.p, this.q, this.r);
    }
}
