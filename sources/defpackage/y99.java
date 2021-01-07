package defpackage;

import com.spotify.mobius.rx2.m;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.follow.FollowCompanion;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import io.reactivex.y;

/* renamed from: y99  reason: default package */
public class y99 implements z99 {
    private final ExplicitContentFacade a;
    private final AgeRestrictedContentFacade b;
    private final t8a c;
    private final s7a d;
    private final FollowCompanion e;
    private final y f;

    public y99(ExplicitContentFacade explicitContentFacade, AgeRestrictedContentFacade ageRestrictedContentFacade, t8a t8a, s7a s7a, FollowCompanion followCompanion, y yVar) {
        this.a = explicitContentFacade;
        this.b = ageRestrictedContentFacade;
        this.c = t8a;
        this.d = s7a;
        this.e = followCompanion;
        this.f = yVar;
    }

    @Override // defpackage.z99
    public void a(m<r0, s0> mVar) {
        mVar.e(r0.c1.class, new a89(this), this.f);
        mVar.e(r0.a1.class, new y79(this), this.f);
        mVar.e(r0.h1.class, new x79(this), this.f);
        mVar.e(r0.l1.class, new v79(this), this.f);
        mVar.e(r0.k1.class, new z79(this), this.f);
        mVar.e(r0.j1.class, new w79(this), this.f);
    }

    public /* synthetic */ void b(r0.a1 a1Var) {
        this.b.d(a1Var.b(), a1Var.a());
    }

    public /* synthetic */ void c(r0.c1 c1Var) {
        this.a.e(c1Var.b(), c1Var.a());
    }

    public /* synthetic */ void d(r0.h1 h1Var) {
        if (h1Var.b()) {
            this.c.e(h1Var.a(), "");
        } else {
            this.c.b(h1Var.a());
        }
    }

    public /* synthetic */ void e(r0.j1 j1Var) {
        this.e.b(j1Var.b(), j1Var.a());
    }

    public /* synthetic */ void f(r0.k1 k1Var) {
        if (k1Var.b()) {
            this.d.a(k1Var.c(), k1Var.a(), true);
        } else {
            this.d.b(k1Var.c(), k1Var.a(), true);
        }
    }

    public /* synthetic */ void g(r0.l1 l1Var) {
        if (l1Var.b()) {
            this.c.e(l1Var.c(), l1Var.a());
        } else {
            this.c.b(l1Var.c());
        }
    }
}
