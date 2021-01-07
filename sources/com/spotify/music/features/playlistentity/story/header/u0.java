package com.spotify.music.features.playlistentity.story.header;

import android.content.Context;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.music.features.playlistentity.story.header.p0;
import com.squareup.picasso.Picasso;
import defpackage.r62;

final class u0 implements p0.a {
    private final wlf<Picasso> a;
    private final wlf<Context> b;
    private final wlf<n0> c;
    private final wlf<r62.a> d;
    private final wlf<l72> e;
    private final wlf<c.a> f;

    u0(wlf<Picasso> wlf, wlf<Context> wlf2, wlf<n0> wlf3, wlf<r62.a> wlf4, wlf<l72> wlf5, wlf<c.a> wlf6) {
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
        b(wlf6, 6);
        this.f = wlf6;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.features.playlistentity.story.header.p0.a
    public p0 a(f0 f0Var) {
        Picasso picasso = this.a.get();
        b(picasso, 1);
        Picasso picasso2 = picasso;
        Context context = this.b.get();
        b(context, 2);
        Context context2 = context;
        n0 n0Var = this.c.get();
        b(n0Var, 3);
        n0 n0Var2 = n0Var;
        r62.a aVar = this.d.get();
        b(aVar, 4);
        r62.a aVar2 = aVar;
        l72 l72 = this.e.get();
        b(l72, 5);
        l72 l722 = l72;
        c.a aVar3 = this.f.get();
        b(aVar3, 6);
        b(f0Var, 7);
        return new s0(picasso2, context2, n0Var2, aVar2, l722, aVar3, f0Var);
    }
}
