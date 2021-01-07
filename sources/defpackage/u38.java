package defpackage;

import com.spotify.mobius.e0;
import defpackage.v38;
import defpackage.w38;
import defpackage.y38;

/* renamed from: u38  reason: default package */
public final /* synthetic */ class u38 implements ti0 {
    public final /* synthetic */ a48 a;

    public /* synthetic */ u38(a48 a48) {
        this.a = a48;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        v38.b bVar = (v38.b) this.a.c();
        bVar.a(new w38.c(((y38.c) obj).e()));
        return e0.f(bVar.build());
    }
}
