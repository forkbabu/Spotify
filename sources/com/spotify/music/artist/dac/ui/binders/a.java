package com.spotify.music.artist.dac.ui.binders;

import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.offline.a;
import io.reactivex.functions.l;
import java.util.Map;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class a<T, R> implements l<Map<String, b>, b> {
    final /* synthetic */ String a;

    a(String str) {
        this.a = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public b apply(Map<String, b> map) {
        Map<String, b> map2 = map;
        h.e(map2, "artistsCollection");
        b bVar = map2.get(this.a);
        if (bVar != null) {
            return bVar;
        }
        Covers Q = je.Q(null, null, null, null, 15);
        a.f fVar = a.f.a;
        b.a aVar = new b.a(0, "", "", null, null, false, false, null, 0, 0, false, Q, fVar, fVar);
        aVar.n(this.a);
        return aVar.b();
    }
}
