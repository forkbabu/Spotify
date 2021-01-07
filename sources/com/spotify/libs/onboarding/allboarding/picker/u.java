package com.spotify.libs.onboarding.allboarding.picker;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.s;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.onboarding.allboarding.picker.r;
import com.spotify.libs.onboarding.allboarding.picker.w;
import com.spotify.libs.onboarding.allboarding.room.AllboardingSearch;
import com.spotify.libs.onboarding.allboarding.room.PickerStepData;
import com.spotify.libs.onboarding.allboarding.room.v;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.z;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;

public final class u extends e0 {
    private s<d> c;
    private final androidx.lifecycle.u<com.spotify.libs.onboarding.allboarding.a<r>> d;
    private boolean e;
    private io.reactivex.disposables.a f;
    private io.reactivex.disposables.b g;
    private d h;
    private final iw0 i;
    private final rw0 j;
    private final vl8 k;
    private final String l;
    private final long m;
    private w n = null;

    /* access modifiers changed from: package-private */
    public static final class a<T> implements io.reactivex.functions.g<io.reactivex.disposables.b> {
        final /* synthetic */ u a;

        a(u uVar) {
            this.a = uVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: androidx.lifecycle.s */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.g
        public void accept(io.reactivex.disposables.b bVar) {
            s sVar = this.a.c;
            d dVar = (d) this.a.c.e();
            sVar.n(dVar != null ? d.a(dVar, null, null, null, true, false, 23) : null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements io.reactivex.functions.a {
        public static final b a = new b();

        b() {
        }

        @Override // io.reactivex.functions.a
        public final void run() {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements io.reactivex.functions.g<Throwable> {
        final /* synthetic */ u a;

        c(u uVar) {
            this.a = uVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: androidx.lifecycle.s */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Assertion.w("Failure posting", th);
            s sVar = this.a.c;
            d dVar = (d) this.a.c.e();
            sVar.n(dVar != null ? d.a(dVar, null, null, null, false, true, 7) : null);
        }
    }

    static final class d<I, O> implements d1<d, y> {
        public static final d a = new d();

        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.d1
        public y apply(d dVar) {
            c cVar;
            c cVar2;
            PickerStepData.b f;
            PickerStepData.b e;
            Integer d;
            d dVar2 = dVar;
            List<com.spotify.libs.onboarding.allboarding.room.j> e2 = dVar2.e();
            int size = e2 != null ? e2.size() : -1;
            PickerStepData d2 = dVar2.d();
            boolean z = false;
            if (size >= ((d2 == null || (d = d2.d()) == null) ? 0 : d.intValue())) {
                z = true;
            }
            PickerStepData d3 = dVar2.d();
            AllboardingSearch allboardingSearch = null;
            String l = d3 != null ? d3.l() : null;
            PickerStepData d4 = dVar2.d();
            if (d4 == null || (e = d4.e()) == null) {
                cVar = null;
            } else {
                String a2 = e.a();
                kotlin.jvm.internal.h.c(a2);
                String a3 = e.b().a();
                kotlin.jvm.internal.h.c(a3);
                cVar = new c(a2, z, a3);
            }
            PickerStepData d5 = dVar2.d();
            if (d5 == null || (f = d5.f()) == null) {
                cVar2 = null;
            } else {
                String a4 = f.a();
                kotlin.jvm.internal.h.c(a4);
                String a5 = f.b().a();
                kotlin.jvm.internal.h.c(a5);
                cVar2 = new c(a4, z, a5);
            }
            List<v> b = dVar2.b();
            if (b == null) {
                b = EmptyList.a;
            }
            PickerStepData d6 = dVar2.d();
            if (d6 != null) {
                allboardingSearch = d6.i();
            }
            return new y(l, cVar, cVar2, b, allboardingSearch, dVar2.f(), dVar2.c());
        }
    }

    static final class e<V> implements Callable<Integer> {
        final /* synthetic */ u a;
        final /* synthetic */ String b;
        final /* synthetic */ com.spotify.libs.onboarding.allboarding.room.j c;

        e(u uVar, String str, com.spotify.libs.onboarding.allboarding.room.j jVar) {
            this.a = uVar;
            this.b = str;
            this.c = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Integer call() {
            if (((kw0) this.a.i).p(this.b) == null) {
                Logger.b(je.I0(je.V0("No section found for id "), this.b, " creating it at the top"), new Object[0]);
                ((kw0) this.a.i).i(this.a.m, this.c);
            }
            StringBuilder V0 = je.V0("sectionId = ");
            V0.append(this.b);
            V0.append(" uri ");
            V0.append(this.c.i());
            Logger.b(V0.toString(), new Object[0]);
            int m = ((kw0) this.a.i).m(this.b, this.c.i());
            ((kw0) this.a.i).s(this.b, this.a.m, this.c);
            Logger.b("inserted or updated picker " + this.c.i() + " on position " + m, new Object[0]);
            return Integer.valueOf(m);
        }
    }

    static final class f<T> implements io.reactivex.functions.g<Integer> {
        final /* synthetic */ u a;
        final /* synthetic */ String b;

        f(u uVar, String str) {
            this.a = uVar;
            this.b = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Integer num) {
            Integer num2 = num;
            u uVar = this.a;
            String str = this.b;
            kotlin.jvm.internal.h.d(num2, "posToScroll");
            uVar.A(new w.c(str, num2.intValue()));
        }
    }

    static final class g<T> implements io.reactivex.functions.g<Throwable> {
        public static final g a = new g();

        g() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Assertion.i("failed to insert and select artist", th);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable<kotlin.f> {
        final /* synthetic */ u a;
        final /* synthetic */ com.spotify.libs.onboarding.allboarding.room.j b;
        final /* synthetic */ boolean c;
        final /* synthetic */ int f;
        final /* synthetic */ int n;

        h(u uVar, com.spotify.libs.onboarding.allboarding.room.j jVar, boolean z, int i, int i2) {
            this.a = uVar;
            this.b = jVar;
            this.c = z;
            this.f = i;
            this.n = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public kotlin.f call() {
            String str = null;
            if (this.b.b() != null) {
                if (this.c) {
                    vl8 vl8 = this.a.k;
                    int i = this.f;
                    String i2 = this.b.i();
                    com.spotify.libs.onboarding.allboarding.room.f g = this.b.g();
                    String a2 = g != null ? g.a() : null;
                    com.spotify.libs.onboarding.allboarding.room.f g2 = this.b.g();
                    if (g2 != null) {
                        str = g2.b();
                    }
                    vl8.b(i, 0, null, i2, a2, null, str);
                } else {
                    vl8 vl82 = this.a.k;
                    int i3 = this.f;
                    String i4 = this.b.i();
                    com.spotify.libs.onboarding.allboarding.room.f g3 = this.b.g();
                    String a3 = g3 != null ? g3.a() : null;
                    com.spotify.libs.onboarding.allboarding.room.f g4 = this.b.g();
                    if (g4 != null) {
                        str = g4.b();
                    }
                    vl82.g(i3, 0, null, i4, a3, null, str);
                }
            } else if (this.b.c() != null) {
                vl8 vl83 = this.a.k;
                int i5 = this.f;
                String i6 = this.b.i();
                com.spotify.libs.onboarding.allboarding.room.f g5 = this.b.g();
                String a4 = g5 != null ? g5.a() : null;
                com.spotify.libs.onboarding.allboarding.room.f g6 = this.b.g();
                if (g6 != null) {
                    str = g6.b();
                }
                vl83.f(i5, 0, null, i6, a4, null, str);
            }
            this.a.j.d(this.n, this.f, this.b);
            return kotlin.f.a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T, R> implements l<kotlin.f, d0<? extends w>> {
        final /* synthetic */ u a;
        final /* synthetic */ com.spotify.libs.onboarding.allboarding.room.j b;

        i(u uVar, com.spotify.libs.onboarding.allboarding.room.j jVar) {
            this.a = uVar;
            this.b = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends w> apply(kotlin.f fVar) {
            kotlin.jvm.internal.h.e(fVar, "it");
            return ((kw0) this.a.i).w(this.a.m, this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements io.reactivex.functions.g<w> {
        final /* synthetic */ u a;

        j(u uVar) {
            this.a = uVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(w wVar) {
            w wVar2 = wVar;
            u uVar = this.a;
            if (uVar.o() instanceof w.a) {
                wVar2 = w.b.b;
            }
            uVar.A(wVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> implements io.reactivex.functions.g<Throwable> {
        public static final k a = new k();

        k() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Assertion.w("Failure setPickerItemSelection()", th);
        }
    }

    public u(iw0 iw0, rw0 rw0, vl8 vl8, String str, long j2, w wVar, int i2) {
        kotlin.jvm.internal.h.e(iw0, "allboardingProvider");
        kotlin.jvm.internal.h.e(rw0, "pickerLogger");
        kotlin.jvm.internal.h.e(vl8, "artistPickerLogger");
        kotlin.jvm.internal.h.e(str, "sessionId");
        this.i = iw0;
        this.j = rw0;
        this.k = vl8;
        this.l = str;
        this.m = j2;
        s<d> sVar = new s<>();
        sVar.n(new d(null, null, null, false, false, 31));
        this.c = sVar;
        this.d = new androidx.lifecycle.u<>();
        this.f = new io.reactivex.disposables.a();
        this.h = new d(null, null, null, false, false, 31);
        kw0 kw0 = (kw0) iw0;
        this.c.o((LiveData<S>) kw0.k(j2), new s(this));
        this.c.o(kw0.o(j2), new b(0, this));
        this.c.o(kw0.r(j2), new t(this));
        this.c.o(kw0.l(str), new b(1, this));
    }

    public final void A(w wVar) {
        this.n = wVar;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.e0
    public void e() {
        this.f.dispose();
    }

    public final void m(String str) {
        kotlin.jvm.internal.h.e(str, "postUrl");
        io.reactivex.disposables.b bVar = this.g;
        if (bVar == null || (bVar != null && bVar.d())) {
            io.reactivex.disposables.b subscribe = ((kw0) this.i).j(this.l, str).A(io.reactivex.android.schedulers.a.b()).s(new a(this)).subscribe(b.a, new c(this));
            this.f.b(subscribe);
            this.g = subscribe;
        }
    }

    public final d n() {
        return this.h;
    }

    public final w o() {
        return this.n;
    }

    public final LiveData<List<com.spotify.libs.onboarding.allboarding.room.j>> p(String str) {
        kotlin.jvm.internal.h.e(str, "sectionId");
        return ((kw0) this.i).n(str);
    }

    public final LiveData<com.spotify.libs.onboarding.allboarding.a<r>> q() {
        LiveData<com.spotify.libs.onboarding.allboarding.a<r>> a2 = androidx.lifecycle.d0.a(this.d);
        kotlin.jvm.internal.h.d(a2, "Transformations.distinctUntilChanged(events)");
        return a2;
    }

    public final LiveData<y> r() {
        LiveData<y> b2 = androidx.lifecycle.d0.b(this.c, d.a);
        kotlin.jvm.internal.h.d(b2, "Transformations.map(comb…,\n            )\n        }");
        return b2;
    }

    public final void s(com.spotify.libs.onboarding.allboarding.room.j jVar) {
        kotlin.jvm.internal.h.e(jVar, "picker");
        String j2 = jVar.j();
        kotlin.jvm.internal.h.c(j2);
        io.reactivex.disposables.b subscribe = z.y(new e(this, j2, jVar)).H(io.reactivex.schedulers.a.c()).subscribe(new f(this, j2), g.a);
        kotlin.jvm.internal.h.d(subscribe, "Single.fromCallable {\n  …          }\n            )");
        this.f.b(subscribe);
    }

    public final boolean t() {
        return this.e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r8 = this;
            com.spotify.libs.onboarding.allboarding.picker.SkippableMode r0 = com.spotify.libs.onboarding.allboarding.picker.SkippableMode.SKIPPABLE_BUT_CONFIRM
            com.spotify.libs.onboarding.allboarding.picker.SkippableMode r1 = com.spotify.libs.onboarding.allboarding.picker.SkippableMode.SKIPPABLE
            com.spotify.libs.onboarding.allboarding.picker.SkippableMode r2 = com.spotify.libs.onboarding.allboarding.picker.SkippableMode.ABORT_POSTING
            io.reactivex.disposables.b r3 = r8.g
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0014
            boolean r3 = r3.d()
            if (r3 != 0) goto L_0x0014
            r3 = r2
            goto L_0x0073
        L_0x0014:
            androidx.lifecycle.s<com.spotify.libs.onboarding.allboarding.picker.d> r3 = r8.c
            java.lang.Object r3 = r3.e()
            com.spotify.libs.onboarding.allboarding.picker.d r3 = (com.spotify.libs.onboarding.allboarding.picker.d) r3
            if (r3 == 0) goto L_0x002f
            com.spotify.libs.onboarding.allboarding.room.PickerStepData r3 = r3.d()
            if (r3 == 0) goto L_0x002f
            java.lang.Integer r3 = r3.d()
            if (r3 == 0) goto L_0x002f
            int r3 = r3.intValue()
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            if (r3 != 0) goto L_0x0034
            r3 = r1
            goto L_0x0073
        L_0x0034:
            androidx.lifecycle.s<com.spotify.libs.onboarding.allboarding.picker.d> r3 = r8.c
            java.lang.Object r3 = r3.e()
            com.spotify.libs.onboarding.allboarding.picker.d r3 = (com.spotify.libs.onboarding.allboarding.picker.d) r3
            if (r3 == 0) goto L_0x0045
            java.util.List r3 = r3.b()
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.a
        L_0x0047:
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x004e
            goto L_0x006c
        L_0x004e:
            java.util.Iterator r3 = r3.iterator()
        L_0x0052:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x006c
            java.lang.Object r6 = r3.next()
            com.spotify.libs.onboarding.allboarding.room.v r6 = (com.spotify.libs.onboarding.allboarding.room.v) r6
            java.lang.String r6 = r6.a()
            java.lang.String r7 = "banner"
            boolean r6 = kotlin.jvm.internal.h.a(r6, r7)
            if (r6 == 0) goto L_0x0052
            r3 = 1
            goto L_0x006d
        L_0x006c:
            r3 = 0
        L_0x006d:
            if (r3 == 0) goto L_0x0072
            com.spotify.libs.onboarding.allboarding.picker.SkippableMode r3 = com.spotify.libs.onboarding.allboarding.picker.SkippableMode.UNSKIPPABLE
            goto L_0x0073
        L_0x0072:
            r3 = r0
        L_0x0073:
            if (r3 != r2) goto L_0x007b
            java.lang.String r0 = "User tried to back out of allboarding while posting but was rejected"
            com.spotify.mobile.android.util.Assertion.g(r0)
            goto L_0x009e
        L_0x007b:
            r2 = 0
            if (r3 != r1) goto L_0x008b
            androidx.lifecycle.u<com.spotify.libs.onboarding.allboarding.a<com.spotify.libs.onboarding.allboarding.picker.r>> r0 = r8.d
            com.spotify.libs.onboarding.allboarding.picker.r$a r1 = com.spotify.libs.onboarding.allboarding.picker.r.a.a
            com.spotify.libs.onboarding.allboarding.a r3 = new com.spotify.libs.onboarding.allboarding.a
            r3.<init>(r1, r2)
            r0.n(r3)
            goto L_0x009e
        L_0x008b:
            androidx.lifecycle.u<com.spotify.libs.onboarding.allboarding.a<com.spotify.libs.onboarding.allboarding.picker.r>> r1 = r8.d
            com.spotify.libs.onboarding.allboarding.picker.r$d r6 = new com.spotify.libs.onboarding.allboarding.picker.r$d
            if (r3 != r0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r4 = 0
        L_0x0093:
            r6.<init>(r4)
            com.spotify.libs.onboarding.allboarding.a r0 = new com.spotify.libs.onboarding.allboarding.a
            r0.<init>(r6, r2)
            r1.n(r0)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.onboarding.allboarding.picker.u.u():void");
    }

    public final void v(String str) {
        PickerStepData d2;
        PickerStepData.b e2;
        PickerStepData.a c2;
        PickerStepData d3;
        Integer d4;
        List<com.spotify.libs.onboarding.allboarding.room.j> e3;
        kotlin.jvm.internal.h.e(str, "postUrl");
        this.k.c();
        this.j.a();
        d e4 = this.c.e();
        int i2 = 0;
        int size = (e4 == null || (e3 = e4.e()) == null) ? 0 : e3.size();
        d e5 = this.c.e();
        if (!(e5 == null || (d3 = e5.d()) == null || (d4 = d3.d()) == null)) {
            i2 = d4.intValue();
        }
        if (size < i2) {
            Assertion.g("button should not be visible if we have not selected enough items");
        }
        if (size == 0) {
            d e6 = this.c.e();
            if (((e6 == null || (d2 = e6.d()) == null || (e2 = d2.e()) == null || (c2 = e2.c()) == null) ? null : c2.b()) == PickerStepData.AllboardingScreenType.LOADING) {
                this.d.n(new com.spotify.libs.onboarding.allboarding.a<>(r.a.a, null));
                return;
            }
        }
        m(str);
    }

    public final void w(d dVar) {
        kotlin.jvm.internal.h.e(dVar, "<set-?>");
        this.h = dVar;
    }

    public final void x() {
        d dVar;
        if (this.h.d() != null && this.h.e() != null && this.h.b() != null) {
            s<d> sVar = this.c;
            d e2 = sVar.e();
            if (e2 != null) {
                dVar = d.a(e2, this.h.e(), this.h.d(), this.h.b(), false, false, 24);
            } else {
                dVar = null;
            }
            sVar.n(dVar);
        }
    }

    public final void y(boolean z) {
        this.e = z;
    }

    public final void z(com.spotify.libs.onboarding.allboarding.room.j jVar, int i2, int i3) {
        kotlin.jvm.internal.h.e(jVar, "pickerItem");
        com.spotify.libs.onboarding.allboarding.room.z l2 = jVar.l();
        boolean z = l2 != null && !l2.e();
        this.n = null;
        io.reactivex.disposables.b subscribe = z.y(new h(this, jVar, z, i3, i2)).s(new i(this, jVar)).subscribe(new j(this), k.a);
        kotlin.jvm.internal.h.d(subscribe, "Single.fromCallable {\n  …)\n            }\n        )");
        this.f.b(subscribe);
    }
}
