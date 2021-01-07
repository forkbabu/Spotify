package defpackage;

import com.spotify.mobius.e0;
import defpackage.gff;
import defpackage.hff;

/* renamed from: wef  reason: default package */
public final /* synthetic */ class wef implements ti0 {
    public final /* synthetic */ jff a;

    public /* synthetic */ wef(jff jff) {
        this.a = jff;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        jff jff = this.a;
        hff.b bVar = (hff.b) obj;
        if (jff.e()) {
            return e0.g(jff.l(true), z42.l(new gff.d(), new gff.b()));
        }
        return e0.g(jff.l(true), z42.l(new gff.b()));
    }
}
