package com.spotify.music.features.queue.service;

import com.spotify.libs.album.a;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import io.reactivex.v;

public class p {
    private final a a;
    private final q9a b;

    public p(a aVar, q9a q9a) {
        this.a = aVar;
        this.b = q9a;
    }

    public v a(String str, l0 l0Var) {
        if (l0Var.q() == LinkType.ALBUM) {
            return this.a.a(l0Var.i()).A(b.a).P();
        }
        if (l0Var.q() == LinkType.COLLECTION_ALBUM) {
            return this.b.b(str).a().N0(1).j0(m.a).j0(a.a);
        }
        throw new IllegalArgumentException(je.x0("Unsupported album uri:", str));
    }
}
