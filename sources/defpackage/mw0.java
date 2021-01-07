package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.onboarding.allboarding.room.j;
import com.spotify.libs.onboarding.allboarding.room.k;
import com.spotify.libs.onboarding.allboarding.room.l;
import com.spotify.libs.onboarding.allboarding.room.z;
import defpackage.kw0;
import kotlin.jvm.internal.Ref$IntRef;

/* renamed from: mw0  reason: default package */
final class mw0 implements Runnable {
    final /* synthetic */ kw0.f a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ Ref$IntRef f;

    mw0(kw0.f fVar, boolean z, String str, Ref$IntRef ref$IntRef) {
        this.a = fVar;
        this.b = z;
        this.c = str;
        this.f = ref$IntRef;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.b.l() != null) {
            ((l) this.a.a.b.u()).k(this.a.b.i(), this.b, this.a.a.d.d());
            if (this.a.b.l().b()) {
                kw0.f fVar = this.a;
                kw0.b(fVar.a, fVar.b, this.b);
            }
        }
        if (this.a.b.f() == null) {
            return;
        }
        if (this.a.b.l() == null || this.b) {
            Ref$IntRef ref$IntRef = this.f;
            kw0.f fVar2 = this.a;
            ref$IntRef.element = kw0.h(fVar2.a, this.c, fVar2.b);
            return;
        }
        Logger.b("Item became deselected", new Object[0]);
        if (this.a.b.b() != null) {
            k u = this.a.a.b.u();
            j jVar = this.a.b;
            ((l) u).l(j.a(jVar, null, null, this.c, null, null, z.a(jVar.l(), this.b, false, 0, 6), null, null, null, null, null, null, 3995));
        }
    }
}
