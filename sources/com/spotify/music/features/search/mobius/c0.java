package com.spotify.music.features.search.mobius;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import defpackage.zya;

public class c0 implements b0 {
    private final hb8 a;
    private final mb8 b;
    private final jb8 c;
    private final lb8 d;

    public c0(hb8 hb8, mb8 mb8, jb8 jb8, lb8 lb8) {
        this.a = hb8;
        this.b = mb8;
        this.c = jb8;
        this.d = lb8;
    }

    @Override // com.spotify.music.features.search.mobius.b0
    public void a(zya zya) {
        if (zya instanceof zya.e) {
            zya.e eVar = (zya.e) zya;
            this.b.a(eVar.l(), eVar.m());
        }
    }

    @Override // com.spotify.music.features.search.mobius.b0
    public void b(zya zya, x98 x98) {
        if (zya instanceof zya.f) {
            zya.f fVar = (zya.f) zya;
            String d2 = fVar.l().d();
            boolean c2 = fVar.l().c();
            LinkType linkType = LinkType.TRACK;
            boolean z = true;
            if (!c2 && l0.b(d2, linkType)) {
                this.d.a(x98);
            }
            boolean b2 = l0.b(d2, linkType);
            if (!c2 && b2) {
                z = false;
            }
            if (z) {
                this.c.a(x98);
            }
        } else if (zya instanceof zya.a) {
            this.a.a(x98);
        } else {
            a(zya);
        }
    }
}
