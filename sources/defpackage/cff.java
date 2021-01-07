package defpackage;

import com.spotify.mobius.e0;
import defpackage.gff;
import defpackage.hff;
import java.util.HashSet;
import java.util.Set;

/* renamed from: cff  reason: default package */
public final /* synthetic */ class cff implements ti0 {
    public final /* synthetic */ jff a;

    public /* synthetic */ cff(jff jff) {
        this.a = jff;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        jff jff = this.a;
        hff.h hVar = (hff.h) obj;
        Set l = z42.l(new gff[0]);
        if (jff.e()) {
            ((HashSet) l).add(new gff.b());
        }
        ((HashSet) l).add(new gff.c());
        return e0.a(l);
    }
}
