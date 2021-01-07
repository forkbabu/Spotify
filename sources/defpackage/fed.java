package defpackage;

import com.spotify.mobius.e0;
import defpackage.hed;
import defpackage.ied;

/* renamed from: fed  reason: default package */
public final /* synthetic */ class fed implements ti0 {
    public final /* synthetic */ jed a;

    public /* synthetic */ fed(jed jed) {
        this.a = jed;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        ied.c cVar = (ied.c) obj;
        if (this.a.b()) {
            return e0.h();
        }
        return e0.a(z42.l(new hed.c(cVar.h().getUsername())));
    }
}
