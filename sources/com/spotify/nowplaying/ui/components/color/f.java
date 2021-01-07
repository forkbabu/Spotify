package com.spotify.nowplaying.ui.components.color;

import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import io.reactivex.k;
import kotlin.jvm.internal.h;

public final class f implements k<ContextTrack, Integer> {
    private final Picasso a;
    private final int b;
    private final int c;

    public f(Picasso picasso, int i, int i2, int i3) {
        i = (i3 & 2) != 0 ? -7829368 : i;
        i2 = (i3 & 4) != 0 ? -16777216 : i2;
        h.e(picasso, "picasso");
        this.a = picasso;
        this.b = i;
        this.c = i2;
    }

    /* Return type fixed from 'tpf' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.g] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.spotify.nowplaying.ui.components.color.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // io.reactivex.k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.tpf<java.lang.Integer> a(io.reactivex.g<com.spotify.player.model.ContextTrack> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "upstream"
            kotlin.jvm.internal.h.e(r3, r0)
            com.spotify.nowplaying.ui.components.color.PrimaryColorTransformer$apply$1 r0 = com.spotify.nowplaying.ui.components.color.PrimaryColorTransformer$apply$1.a
            if (r0 == 0) goto L_0x000f
            com.spotify.nowplaying.ui.components.color.g r1 = new com.spotify.nowplaying.ui.components.color.g
            r1.<init>(r0)
            r0 = r1
        L_0x000f:
            io.reactivex.functions.l r0 = (io.reactivex.functions.l) r0
            io.reactivex.g r3 = r3.u(r0)
            com.spotify.nowplaying.ui.components.color.b r0 = new com.spotify.nowplaying.ui.components.color.b
            r0.<init>(r2)
            io.reactivex.g r3 = r3.g0(r0)
            com.spotify.nowplaying.ui.components.color.c r0 = new com.spotify.nowplaying.ui.components.color.c
            r0.<init>(r2)
            io.reactivex.g r3 = r3.O(r0)
            java.lang.String r0 = "upstream\n            .di…ckFallbackColor else it }"
            kotlin.jvm.internal.h.d(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.nowplaying.ui.components.color.f.a(io.reactivex.g):tpf");
    }

    public final int b() {
        return this.b;
    }

    public final Picasso c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public f(Picasso picasso, int i, int i2) {
        h.e(picasso, "picasso");
        this.a = picasso;
        this.b = i;
        this.c = i2;
    }
}
