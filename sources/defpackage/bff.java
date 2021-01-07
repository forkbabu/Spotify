package defpackage;

import com.spotify.mobius.e0;
import defpackage.hff;
import defpackage.uef;

/* renamed from: bff  reason: default package */
public final /* synthetic */ class bff implements ti0 {
    public final /* synthetic */ jff a;

    public /* synthetic */ bff(jff jff) {
        this.a = jff;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        jff jff = this.a;
        String l = ((hff.i) obj).l();
        uef.b bVar = (uef.b) jff.f();
        bVar.b(l);
        return e0.f(bVar.a());
    }
}
