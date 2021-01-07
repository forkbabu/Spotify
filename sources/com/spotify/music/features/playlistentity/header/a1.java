package com.spotify.music.features.playlistentity.header;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.music.features.playlistentity.configuration.g;
import com.spotify.music.features.playlistentity.header.x0;
import com.squareup.picasso.Picasso;

final class a1 implements x0.a {
    private final wlf<Picasso> a;
    private final wlf<Context> b;
    private final wlf<s0> c;
    private final wlf<c.a> d;
    private final wlf<cqe> e;

    a1(wlf<Picasso> wlf, wlf<Context> wlf2, wlf<s0> wlf3, wlf<c.a> wlf4, wlf<cqe> wlf5) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
        b(wlf5, 5);
        this.e = wlf5;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.features.playlistentity.header.x0.a
    public x0 a(g gVar, Optional optional) {
        Picasso picasso = this.a.get();
        b(picasso, 1);
        Picasso picasso2 = picasso;
        Context context = this.b.get();
        b(context, 2);
        Context context2 = context;
        s0 s0Var = this.c.get();
        b(s0Var, 3);
        s0 s0Var2 = s0Var;
        c.a aVar = this.d.get();
        b(aVar, 4);
        c.a aVar2 = aVar;
        cqe cqe = this.e.get();
        b(cqe, 5);
        b(gVar, 6);
        b(optional, 7);
        return new z0(picasso2, context2, s0Var2, aVar2, cqe, gVar, optional);
    }
}
