package defpackage;

import com.spotify.mobile.android.util.Assertion;
import defpackage.xya;
import io.reactivex.functions.g;

/* renamed from: k0b  reason: default package */
public class k0b implements g<xya.d> {
    private final m0b a;
    private final s0b b;
    private final d0b c;

    public k0b(m0b m0b, s0b s0b, d0b d0b) {
        this.a = m0b;
        this.b = s0b;
        this.c = d0b;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(xya.d dVar) {
        for (xya xya : dVar.a()) {
            xya.getClass();
            if (xya instanceof xya.e) {
                this.a.a((xya.e) xya);
            } else if (xya instanceof xya.h) {
                this.b.accept((xya.h) xya);
            } else if (xya instanceof xya.a) {
                this.c.a((xya.a) xya);
            } else {
                Assertion.g("Effect not handled in the MergedSearchEffectHandler: " + xya);
            }
        }
    }
}
