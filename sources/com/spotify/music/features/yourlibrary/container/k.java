package com.spotify.music.features.yourlibrary.container;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.z;
import com.spotify.music.features.yourlibrary.container.utils.n;
import com.spotify.music.features.yourlibrary.container.view.w;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.navigation.t;
import defpackage.n19;
import io.reactivex.y;

public class k {
    private final e a;
    private final y b;
    private final n c;
    private final t d;

    public k(e eVar, y yVar, n nVar, t tVar) {
        this.a = eVar;
        this.b = yVar;
        this.c = nVar;
        this.d = tVar;
    }

    public MobiusLoop.g<q19, o19> a(h hVar, w wVar, q19 q19) {
        b bVar = b.a;
        n nVar = this.c;
        t tVar = this.d;
        y yVar = this.b;
        m f = i.f();
        f.e(n19.a.class, new w19(wVar), yVar);
        f.e(n19.d.class, new t19(wVar), yVar);
        f.e(n19.f.class, new v19(wVar), yVar);
        f.e(n19.i.class, new s19(wVar), yVar);
        f.d(n19.b.class, new a29(hVar));
        f.d(n19.e.class, new r19(hVar));
        f.e(n19.h.class, new u19(wVar), yVar);
        f.e(n19.g.class, new y19(wVar), yVar);
        f.e(n19.j.class, new z19(nVar), yVar);
        f.b(n19.c.class, new x19(tVar));
        MobiusLoop.f h = i.c(bVar, f.i()).e(c.a).h(i.a(hVar.g()));
        this.a.getClass();
        DebugFlag debugFlag = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_ENABLE_MOBIUS_LOGGING;
        return z.b(h, q19, u92.b());
    }
}
