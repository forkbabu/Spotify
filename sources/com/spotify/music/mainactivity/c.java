package com.spotify.music.mainactivity;

import androidx.fragment.app.Fragment;
import com.spotify.music.navigation.f;
import com.spotify.music.navigation.g;

public final /* synthetic */ class c implements si0 {
    public final /* synthetic */ m a;
    public final /* synthetic */ Fragment b;
    public final /* synthetic */ g c;
    public final /* synthetic */ com.spotify.music.navigation.c d;

    public /* synthetic */ c(m mVar, Fragment fragment, g gVar, com.spotify.music.navigation.c cVar) {
        this.a = mVar;
        this.b = fragment;
        this.c = gVar;
        this.d = cVar;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        this.a.c(this.b, this.c, this.d, (f.d) obj);
    }
}
