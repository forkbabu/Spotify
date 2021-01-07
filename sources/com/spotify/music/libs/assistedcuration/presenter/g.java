package com.spotify.music.libs.assistedcuration.presenter;

import com.spotify.music.libs.assistedcuration.presenter.p;
import com.spotify.playlist.models.k;
import com.spotify.playlist.models.o;
import io.reactivex.functions.l;
import java.util.HashSet;

public final /* synthetic */ class g implements l {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        k kVar = (k) obj;
        int i = v.d;
        String j = kVar.j().j();
        HashSet hashSet = new HashSet();
        for (com.spotify.playlist.models.l lVar : kVar.getItems()) {
            o g = lVar.g();
            if (g != null) {
                hashSet.add(g.getUri());
            }
        }
        p.b bVar = new p.b();
        bVar.b(j);
        bVar.c(hashSet);
        return bVar.a();
    }
}
