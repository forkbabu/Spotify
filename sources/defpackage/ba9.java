package defpackage;

import com.spotify.mobius.rx2.m;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.j1;
import io.reactivex.y;

/* renamed from: ba9  reason: default package */
public class ba9 implements z99 {
    private final j1 a;
    private final y b;

    public ba9(j1 j1Var, y yVar) {
        this.a = j1Var;
        this.b = yVar;
    }

    @Override // defpackage.z99
    public void a(m<r0, s0> mVar) {
        mVar.e(r0.c0.class, new f89(this), this.b);
        mVar.e(r0.d0.class, new e89(this), this.b);
        mVar.e(r0.e0.class, new d89(this), this.b);
        mVar.e(r0.f0.class, new g89(this), this.b);
        j1 j1Var = this.a;
        j1Var.getClass();
        mVar.c(r0.g0.class, new w99(j1Var), this.b);
        j1 j1Var2 = this.a;
        j1Var2.getClass();
        mVar.c(r0.h0.class, new w99(j1Var2), this.b);
        j1 j1Var3 = this.a;
        j1Var3.getClass();
        mVar.c(r0.i0.class, new u79(j1Var3), this.b);
    }

    public /* synthetic */ void b(r0.c0 c0Var) {
        this.a.f(c0Var.b(), c0Var.a());
    }

    public /* synthetic */ void c(r0.d0 d0Var) {
        this.a.a();
    }

    public /* synthetic */ void d(r0.e0 e0Var) {
        this.a.b(e0Var.a());
    }

    public /* synthetic */ void e(r0.f0 f0Var) {
        this.a.c(f0Var.a());
    }
}
