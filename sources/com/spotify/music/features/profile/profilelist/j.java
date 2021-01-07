package com.spotify.music.features.profile.profilelist;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.rx2.o;
import com.spotify.mobius.z;
import com.spotify.music.features.profile.model.e;
import com.spotify.music.navigation.t;
import defpackage.kt7;
import defpackage.lt7;
import io.reactivex.s;
import io.reactivex.y;

public class j {
    private final y a;
    private final y b;
    private final y c;
    private final t d;
    private final at7 e;

    public j(y yVar, y yVar2, y yVar3, t tVar, at7 at7) {
        this.a = yVar;
        this.b = yVar2;
        this.c = yVar3;
        this.d = tVar;
        this.e = at7;
    }

    public MobiusLoop.g<mt7, lt7> a(mt7 mt7, s<e> sVar) {
        s i0 = s.i0(lt7.b.a);
        f fVar = f.a;
        t tVar = this.d;
        at7 at7 = this.e;
        y yVar = this.c;
        m f = i.f();
        f.h(kt7.a.class, new pt7(sVar));
        f.e(kt7.b.class, new rt7(tVar), yVar);
        f.h(kt7.c.class, new qt7(at7));
        return z.b(i.c(fVar, f.i()).h(i.a(i0)).b(new e(this)).d(new d(this)).f(b.g("profile list")), mt7, u92.b());
    }

    public /* synthetic */ ia2 b() {
        return new o(this.a);
    }

    public /* synthetic */ ia2 c() {
        return new o(this.b);
    }
}
