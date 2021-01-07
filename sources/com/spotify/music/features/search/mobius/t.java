package com.spotify.music.features.search.mobius;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.libs.search.history.SearchHistoryItem;
import defpackage.x98;

public class t implements a71 {
    private final c8b a;
    private final z b;
    private final s6b c;
    private final j81 f;

    public t(c8b c8b, z zVar, s6b s6b, j81 j81) {
        c8b.getClass();
        this.a = c8b;
        this.b = zVar;
        this.c = s6b;
        this.f = j81;
    }

    public static o81 a(String str, int i, String str2) {
        str.getClass();
        return z81.b().e("resultItemClicked").b("uri", str).b("position", Integer.valueOf(i)).b("sectionId", str2).c();
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        this.a.a();
        String string = o81.data().string("uri");
        SearchHistoryItem a2 = this.c.a(string, n61.d());
        if (!MoreObjects.isNullOrEmpty(string)) {
            z zVar = this.b;
            s81 d = n61.d();
            x98.a a3 = x98.a();
            a3.e(xb8.a(this.f.a(n61)));
            a3.a(rqa.e(d));
            a3.b(string);
            a3.c(Optional.fromNullable(d.logging().string("ui:group")));
            a3.d(Optional.of(rqa.g(d)));
            zVar.a(a3.build(), a2);
        }
    }
}
