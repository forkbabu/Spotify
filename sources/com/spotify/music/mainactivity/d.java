package com.spotify.music.mainactivity;

import androidx.fragment.app.Fragment;
import com.spotify.music.navigation.c;
import com.spotify.music.navigation.f;
import com.spotify.music.navigation.g;

public final /* synthetic */ class d implements si0 {
    public final /* synthetic */ m a;
    public final /* synthetic */ Fragment b;
    public final /* synthetic */ g c;
    public final /* synthetic */ c d;

    public /* synthetic */ d(m mVar, Fragment fragment, g gVar, c cVar) {
        this.a = mVar;
        this.b = fragment;
        this.c = gVar;
        this.d = cVar;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        this.a.b(this.b, this.c, this.d, (f.a) obj);
    }
}
