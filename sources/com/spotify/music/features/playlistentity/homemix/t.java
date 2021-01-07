package com.spotify.music.features.playlistentity.homemix;

import com.spotify.playlist.formatlisttype.FormatListType;
import defpackage.zo6;

public class t implements zo6.a {
    private final zo6.c a;

    public t(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.zo6.a
    public boolean a(zo6.b bVar) {
        return bVar.a() == FormatListType.o;
    }

    @Override // defpackage.zo6.a
    public zo6.c b() {
        return this.a;
    }

    @Override // defpackage.zo6.a
    public Class<? extends zo6> c() {
        return s.class;
    }
}
