package defpackage;

import com.spotify.mobius.e0;
import defpackage.gff;
import defpackage.hff;
import defpackage.uef;

/* renamed from: aff  reason: default package */
public final /* synthetic */ class aff implements ti0 {
    public final /* synthetic */ jff a;

    public /* synthetic */ aff(jff jff) {
        this.a = jff;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        jff jff = this.a;
        hff.a aVar = (hff.a) obj;
        if (jff.e()) {
            return e0.a(z42.l(new gff.e()));
        }
        uef.b bVar = (uef.b) jff.f();
        bVar.e(true);
        return e0.f(bVar.a());
    }
}
