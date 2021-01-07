package com.spotify.libs.onboarding.allboarding.flow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import com.spotify.libs.onboarding.allboarding.EntryPoint;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

public final class e extends e0 {
    private final u<l> c = new u<>(new l(true, false));
    private final String d;
    private final u<com.spotify.libs.onboarding.allboarding.a<a>> e;
    private io.reactivex.disposables.b f;
    private final iw0 g;
    private final com.spotify.music.features.tasteonboarding.logging.b h;
    private final a0 i;

    /* access modifiers changed from: package-private */
    public static final class a<T> implements g<Long> {
        final /* synthetic */ e a;

        a(e eVar) {
            this.a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: androidx.lifecycle.u */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.g
        public void accept(Long l) {
            Long l2 = l;
            u uVar = this.a.e;
            String str = this.a.d;
            h.d(l2, "it");
            uVar.n(new com.spotify.libs.onboarding.allboarding.a(new a(str, l2.longValue()), null));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements g<Throwable> {
        final /* synthetic */ e a;

        b(e eVar) {
            this.a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: androidx.lifecycle.u */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            this.a.c.n(new l(false, true));
            Assertion.i("Failure getting initial data", th);
        }
    }

    public e(iw0 iw0, com.spotify.music.features.tasteonboarding.logging.b bVar, a0 a0Var) {
        h.e(iw0, "allboardingProvider");
        h.e(bVar, "sessionIdProvider");
        h.e(a0Var, "handle");
        this.g = iw0;
        this.h = bVar;
        this.i = a0Var;
        String str = (String) a0Var.a("sessionId");
        if (str == null) {
            str = bVar.a();
            a0Var.e("sessionId", str);
        }
        this.d = str;
        this.e = new u<>();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.e0
    public void e() {
        io.reactivex.disposables.b bVar = this.f;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public final LiveData<com.spotify.libs.onboarding.allboarding.a<a>> j() {
        return this.e;
    }

    public final void k(EntryPoint entryPoint) {
        h.e(entryPoint, "entryPoint");
        u<l> uVar = this.c;
        l e2 = uVar.e();
        uVar.n(e2 != null ? l.a(e2, true, false, 2) : null);
        io.reactivex.disposables.b bVar = this.f;
        if (bVar == null || (bVar != null && bVar.d())) {
            this.f = ((kw0) this.g).t(this.d, entryPoint).H(io.reactivex.schedulers.a.c()).B(io.reactivex.android.schedulers.a.b()).subscribe(new a(this), new b(this));
        }
    }

    public final LiveData<l> l() {
        return this.c;
    }

    public final void m(EntryPoint entryPoint) {
        h.e(entryPoint, "entryPoint");
        io.reactivex.disposables.b bVar = this.f;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f = null;
        k(entryPoint);
    }
}
