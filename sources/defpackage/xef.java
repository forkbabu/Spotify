package defpackage;

import com.spotify.mobius.e0;
import defpackage.gff;
import defpackage.hff;
import java.util.Locale;

/* renamed from: xef  reason: default package */
public final /* synthetic */ class xef implements ti0 {
    public final /* synthetic */ jff a;

    public /* synthetic */ xef(jff jff) {
        this.a = jff;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        jff jff = this.a;
        hff.d dVar = (hff.d) obj;
        jff k = jff.k(true);
        Locale locale = Locale.getDefault();
        String str = locale.getLanguage() + '-' + locale.getCountry();
        if (!jff.i()) {
            return e0.g(k, z42.l(new gff.e(), new gff.h(str)));
        }
        if (jff.h()) {
            return e0.g(k, z42.l(new gff.d(), new gff.a(), new gff.h(str)));
        }
        return e0.f(k);
    }
}
