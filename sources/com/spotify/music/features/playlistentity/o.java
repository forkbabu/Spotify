package com.spotify.music.features.playlistentity;

import com.google.common.base.MoreObjects;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.ubi.specification.factories.k2;
import io.reactivex.s;
import io.reactivex.subjects.a;

public class o implements c.a {
    private final String a;
    private final a<ej9> b = a.h1();
    private String c = "";
    private String f = "";
    private com.spotify.instrumentation.a n = PageIdentifiers.PLAYLIST_NOTLOADED;
    private k2 o;

    public o(String str) {
        this.a = str;
    }

    public s<ej9> a() {
        return this.b.G0(fj9.b(this.n.path(), getViewUri().toString()));
    }

    public com.spotify.instrumentation.a b() {
        return this.n;
    }

    public k2 d(String str) {
        String format = String.format("%s|%s", this.f, this.c);
        k2 k2Var = this.o;
        if (k2Var == null || !format.equals(k2Var.a().j())) {
            this.o = new k2(this.n.path(), str, format);
        }
        return this.o;
    }

    public void f(com.spotify.instrumentation.a aVar, String str, String str2, String str3) {
        this.n = aVar;
        this.f = (String) MoreObjects.firstNonNull(str, "");
        this.c = (String) MoreObjects.firstNonNull(str2, "");
        this.b.onNext(fj9.b(aVar.path(), str3));
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        if (l0.z(this.a).q() == LinkType.PLAYLIST_FORMAT) {
            return ViewUris.H0.b(this.a);
        }
        return ViewUris.G0.b(this.a);
    }

    public void h(String str) {
        this.c = (String) MoreObjects.firstNonNull(str, "");
    }
}
