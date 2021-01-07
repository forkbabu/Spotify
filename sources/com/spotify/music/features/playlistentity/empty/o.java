package com.spotify.music.features.playlistentity.empty;

import android.content.Context;
import com.spotify.music.features.playlistentity.empty.l;
import com.squareup.picasso.Picasso;

/* access modifiers changed from: package-private */
public final class o implements l.a {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<j> c;

    o(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<j> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.features.playlistentity.empty.l.a
    public l create() {
        Context context = this.a.get();
        a(context, 1);
        Picasso picasso = this.b.get();
        a(picasso, 2);
        j jVar = this.c.get();
        a(jVar, 3);
        return new n(context, picasso, jVar);
    }
}
