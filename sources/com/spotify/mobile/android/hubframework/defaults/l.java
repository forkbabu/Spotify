package com.spotify.mobile.android.hubframework.defaults;

@Deprecated
public class l implements a61 {
    private final a a;

    @Deprecated
    public interface a {
        boolean a(s81 s81);
    }

    @Deprecated
    public l(a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    @Override // defpackage.a61
    public s81 a(s81 s81) {
        return this.a.a(s81) ? s81.toBuilder().d("hubs:glue:highlight", "1").l() : s81;
    }
}
