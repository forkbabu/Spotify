package com.spotify.music.features.onboarding.di;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.music.follow.j;
import com.spotify.music.follow.resolver.f;
import defpackage.nw0;
import io.reactivex.disposables.a;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class AllboardingFollowManagerImpl implements hw0, m {
    private final a a = new a();
    private final com.spotify.music.follow.m b;
    private final t8a c;
    private final f f;

    public AllboardingFollowManagerImpl(com.spotify.music.follow.m mVar, t8a t8a, f fVar, n nVar) {
        h.e(mVar, "followManager");
        h.e(t8a, "likedContent");
        h.e(fVar, "followDataResolver");
        h.e(nVar, "lifecycleObserver");
        this.b = mVar;
        this.c = t8a;
        this.f = fVar;
        nVar.A().a(this);
    }

    public static final void b(AllboardingFollowManagerImpl allboardingFollowManagerImpl, String str, boolean z, j jVar) {
        allboardingFollowManagerImpl.b.g(jVar);
        if (jVar.g() != z) {
            allboardingFollowManagerImpl.b.e(str, z);
        }
    }

    @Override // defpackage.hw0
    public void a(nw0 nw0, boolean z) {
        h.e(nw0, "entity");
        if (nw0 instanceof nw0.a) {
            nw0.a aVar = (nw0.a) nw0;
            j c2 = this.b.c(aVar.a());
            if (c2 == null || c2.g() != z) {
                String a2 = aVar.a();
                s<j> N0 = this.f.a(a2).N0(1);
                h.d(N0, "followDataResolver.resolve(contentUri).take(1)");
                this.a.b(N0.N0(1).subscribe(new d(this, a2, z), e.a));
            }
        } else if (!(nw0 instanceof nw0.b)) {
        } else {
            if (z) {
                this.c.e(((nw0.b) nw0).a(), "allboarding");
            } else {
                this.c.f(((nw0.b) nw0).a(), false);
            }
        }
    }

    @w(Lifecycle.Event.ON_DESTROY)
    public final void tearDown() {
        this.a.f();
    }
}
