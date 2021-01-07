package com.spotify.music.features.playlistentity.viewbinder;

import com.spotify.music.features.playlistentity.viewbinder.h0;
import com.spotify.music.features.playlistentity.viewbinder.l0;
import com.spotify.music.features.playlistentity.viewbinder.o0;
import defpackage.as6;

public final /* synthetic */ class c implements sg0 {
    public final /* synthetic */ o0.a a;
    public final /* synthetic */ h0.a b;
    public final /* synthetic */ l0.a c;

    public /* synthetic */ c(o0.a aVar, h0.a aVar2, l0.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        o0.a aVar = this.a;
        h0.a aVar2 = this.b;
        l0.a aVar3 = this.c;
        as6 as6 = (as6) obj;
        as6.getClass();
        if (as6 instanceof as6.d) {
            return ((p0) aVar).b(((as6.d) as6).b());
        } else if (as6 instanceof as6.b) {
            return ((i0) aVar2).b(((as6.b) as6).b());
        } else if (as6 instanceof as6.c) {
            return ((m0) aVar3).b(((as6.c) as6).b());
        } else {
            throw new IllegalArgumentException("Custom error for Result " + as6 + " is not supported.");
        }
    }
}
