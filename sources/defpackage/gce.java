package defpackage;

import com.spotify.mobius.e0;
import defpackage.iee;
import defpackage.mbe;

/* renamed from: gce  reason: default package */
public final /* synthetic */ class gce implements ti0 {
    public final /* synthetic */ kee a;

    public /* synthetic */ gce(kee kee) {
        this.a = kee;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        kee kee = this.a;
        boolean y = ((iee.m) obj).y();
        mbe.b bVar = (mbe.b) kee.o();
        bVar.g(y);
        return e0.f(bVar.c());
    }
}
