package com.spotify.music.mainactivity;

import com.google.common.collect.ImmutableSet;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobius.e0;
import com.spotify.mobius.g0;
import defpackage.tfb;
import defpackage.ufb;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class n<M, E, F> implements g0<wfb, ufb, tfb> {
    public static final n a = new n();

    n() {
    }

    /* Return type fixed from 'com.spotify.mobius.e0' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.spotify.mobius.g0
    public e0<wfb, tfb> a(wfb wfb, ufb ufb) {
        wfb wfb2 = wfb;
        ufb ufb2 = ufb;
        h.e(wfb2, "model");
        h.e(ufb2, "event");
        h.e(wfb2, "model");
        h.e(ufb2, "event");
        if (ufb2 instanceof ufb.b) {
            c a2 = ((ufb.b) ufb2).a();
            wfb b = wfb.b(wfb2, null, a2, false, 5);
            Set of = ImmutableSet.of();
            h.d(of, "ImmutableSet.of()");
            if (wfb2.g()) {
                if (wfb2.c() == null) {
                    b = wfb.b(b, null, null, true, 3);
                    SessionState e = wfb2.e();
                    h.c(e);
                    of = z42.l(new tfb.e(a2, e));
                    h.d(of, "Effects.effects(\n       …      )\n                )");
                } else if (wfb2.h()) {
                    of = z42.l(new tfb.c(a2));
                    h.d(of, "Effects.effects(\n       …wFlags)\n                )");
                }
            }
            e0<wfb, tfb> g = e0.g(b, of);
            h.d(g, "Next.next(\n            n…        effects\n        )");
            return g;
        } else if (ufb2 instanceof ufb.c) {
            SessionState a3 = ((ufb.c) ufb2).a();
            wfb b2 = wfb.b(wfb2, a3, null, false, 6);
            Set of2 = ImmutableSet.of();
            h.d(of2, "ImmutableSet.of()");
            if (b2.i()) {
                if (wfb2.h()) {
                    b2 = wfb.b(b2, null, null, false, 3);
                    of2 = z42.l(tfb.a.a);
                    h.d(of2, "Effects.effects(MainActi…ffect.EndLoggedInSession)");
                } else {
                    of2 = z42.l(tfb.b.a);
                    h.d(of2, "Effects.effects(MainActivityEffect.GoToLogin)");
                }
            } else if (wfb2.f()) {
                if (!wfb2.g() && b2.g() && !wfb2.h()) {
                    b2 = wfb.b(b2, null, null, true, 3);
                    c c = wfb2.c();
                    h.c(c);
                    of2 = z42.l(new tfb.e(c, a3));
                    h.d(of2, "Effects.effects(\n       …      )\n                )");
                } else if (wfb2.h()) {
                    of2 = z42.l(new tfb.d(a3));
                    h.d(of2, "Effects.effects(\n       …nState)\n                )");
                }
            }
            e0<wfb, tfb> g2 = e0.g(b2, of2);
            h.d(g2, "Next.next(\n            n…        effects\n        )");
            return g2;
        } else if (!(ufb2 instanceof ufb.a)) {
            throw new NoWhenBranchMatchedException();
        } else if (wfb2.h()) {
            e0<wfb, tfb> a4 = e0.a(ImmutableSet.of(tfb.f.a));
            h.d(a4, "Next.dispatch(\n         …          )\n            )");
            return a4;
        } else {
            e0<wfb, tfb> h = e0.h();
            h.d(h, "Next.noChange()");
            return h;
        }
    }
}
