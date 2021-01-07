package com.spotify.music.features.freetierartist.datasource;

import com.spotify.playlist.models.b;
import io.reactivex.v;
import io.reactivex.w;
import java.util.Map;

public final class s implements w<b91, v> {
    private final String a;
    private final a8a b;
    private final c0 c;

    public s(String str, a8a a8a, c0 c0Var) {
        this.a = str;
        this.b = a8a;
        this.c = c0Var;
    }

    public /* synthetic */ b a(Map map) {
        b bVar = (b) map.get(this.a);
        if (bVar != null) {
            return bVar;
        }
        b.a a2 = b.a();
        a2.n(this.a);
        return a2.b();
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // io.reactivex.w
    public v<v> apply(io.reactivex.s<b91> sVar) {
        return io.reactivex.s.n(sVar, this.b.e(null, this.a).A(new d(this)).P().J0(new b(this.c)), c.a);
    }
}
