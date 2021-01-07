package defpackage;

import com.spotify.mobius.rx2.m;
import com.spotify.music.features.yourlibrary.musicpages.datasource.w3;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.pages.p;
import com.spotify.music.features.yourlibrary.musicpages.prefs.MusicPagesPrefs;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: ea9  reason: default package */
public class ea9 implements z99 {
    private final MusicPagesPrefs a;
    private final w3 b;
    private final y c;

    public ea9(MusicPagesPrefs musicPagesPrefs, p pVar, y yVar) {
        this.a = musicPagesPrefs;
        this.b = pVar.a();
        this.c = yVar;
    }

    @Override // defpackage.z99
    public void a(m<r0, s0> mVar) {
        mVar.h(r0.l0.class, new z89(this));
        mVar.e(r0.y0.class, new w89(this), this.c);
        mVar.h(r0.i1.class, new x89(this));
    }

    public /* synthetic */ v b(r0.l0 l0Var) {
        return this.a.h(l0Var.a());
    }

    public /* synthetic */ v c(s sVar) {
        return sVar.J0(new y89(this)).j0(s79.a).o0(this.c);
    }

    public /* synthetic */ void d(r0.y0 y0Var) {
        this.a.i(y0Var.b(), y0Var.a(), y0Var.c());
    }

    public /* synthetic */ v e(s sVar) {
        return this.b.d(sVar.j0(u99.a)).j0(x99.a).z(50, TimeUnit.MILLISECONDS, this.c).o0(this.c);
    }
}
