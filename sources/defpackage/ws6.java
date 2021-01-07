package defpackage;

import android.content.Context;
import com.spotify.music.features.ads.rules.AdRules;
import defpackage.ts6;

/* access modifiers changed from: package-private */
/* renamed from: ws6  reason: default package */
public final class ws6 implements ts6.a {
    private final wlf<String> a;
    private final wlf<eu3> b;
    private final wlf<AdRules> c;
    private final wlf<rs6> d;
    private final wlf<txc> e;
    private final wlf<Context> f;

    ws6(wlf<String> wlf, wlf<eu3> wlf2, wlf<AdRules> wlf3, wlf<rs6> wlf4, wlf<txc> wlf5, wlf<Context> wlf6) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.ts6.a
    public ts6 create() {
        String str = this.a.get();
        a(str, 1);
        String str2 = str;
        eu3 eu3 = this.b.get();
        a(eu3, 2);
        eu3 eu32 = eu3;
        AdRules adRules = this.c.get();
        a(adRules, 3);
        AdRules adRules2 = adRules;
        rs6 rs6 = this.d.get();
        a(rs6, 4);
        rs6 rs62 = rs6;
        txc txc = this.e.get();
        a(txc, 5);
        txc txc2 = txc;
        Context context = this.f.get();
        a(context, 6);
        return new vs6(str2, eu32, adRules2, rs62, txc2, context);
    }
}
