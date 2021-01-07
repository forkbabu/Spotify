package defpackage;

import com.spotify.mobius.rx2.m;
import com.spotify.music.features.yourlibrary.musicpages.datasource.j5;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;

/* renamed from: ca9  reason: default package */
public class ca9 implements z99 {
    private final j5 a;
    private final y b;

    public ca9(j5 j5Var, y yVar) {
        this.a = j5Var;
        this.b = yVar;
    }

    public static s c(ca9 ca9, r0.c cVar) {
        return ca9.a.a(cVar.a()).N().j0(h89.a).r0(j89.a);
    }

    @Override // defpackage.z99
    public void a(m<r0, s0> mVar) {
        mVar.h(r0.c.class, new i89(this));
    }

    public /* synthetic */ v b(s sVar) {
        return sVar.o0(this.b).J0(new k89(this));
    }
}
