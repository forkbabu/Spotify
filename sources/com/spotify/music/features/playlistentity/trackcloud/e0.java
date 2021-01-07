package com.spotify.music.features.playlistentity.trackcloud;

import android.content.Context;
import com.spotify.music.features.playlistallsongs.c;
import com.spotify.music.features.playlistentity.configuration.i;
import com.spotify.music.features.playlistentity.trackcloud.b0;
import com.spotify.music.features.playlistentity.trackcloud.w;

/* access modifiers changed from: package-private */
public final class e0 implements b0.a {
    private final wlf<w.a> a;
    private final wlf<Context> b;
    private final wlf<q> c;

    e0(wlf<w.a> wlf, wlf<Context> wlf2, wlf<q> wlf3) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.features.playlistentity.trackcloud.b0.a
    public b0 a(i iVar, c cVar) {
        w.a aVar = this.a.get();
        b(aVar, 1);
        w.a aVar2 = aVar;
        Context context = this.b.get();
        b(context, 2);
        Context context2 = context;
        q qVar = this.c.get();
        b(qVar, 3);
        b(iVar, 4);
        b(cVar, 5);
        return new d0(aVar2, context2, qVar, iVar, cVar);
    }
}
