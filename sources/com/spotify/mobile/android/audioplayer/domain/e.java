package com.spotify.mobile.android.audioplayer.domain;

import com.spotify.mobile.android.audioplayer.domain.c;
import com.spotify.mobile.android.audioplayer.domain.d;
import com.spotify.mobile.android.audioplayer.domain.g;
import com.spotify.mobius.e0;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class e {
    private static final long a(f fVar, long j) {
        long b = fVar.b();
        long j2 = 0;
        if (fVar.e() > 0) {
            j2 = j - fVar.e();
        }
        return b + j2;
    }

    private static final Set<c> b(f fVar, c cVar) {
        String str;
        Set<c> set;
        if (c(fVar) && !fVar.d() && fVar.c()) {
            set = z42.l(cVar);
            str = "effects(effect)";
        } else {
            set = z42.l(new c[0]);
            str = "effects()";
        }
        h.d(set, str);
        return set;
    }

    private static final boolean c(f fVar) {
        return true ^ (fVar.e() > 0);
    }

    public static final e0<f, c> d(f fVar, d dVar) {
        e0<f, c> e0Var;
        c.b bVar = c.b.a;
        c.e eVar = c.e.a;
        h.e(fVar, "model");
        h.e(dVar, "event");
        if (dVar instanceof d.a) {
            f a = f.a(fVar, null, false, true, 0, 0, 0, 59);
            e0<f, c> g = e0.g(a, b(a, eVar));
            h.d(g, "next(newModel, newModel.effectIfPlayable(Resume))");
            return g;
        }
        boolean z = true;
        if (dVar instanceof d.b) {
            e0<f, c> g2 = e0.g(f.a(fVar, null, false, false, 0, 0, 0, 59), z42.l(bVar));
            h.d(g2, "next(model.copy(hasAudio…= false), effects(Pause))");
            return g2;
        } else if (dVar instanceof d.C0173d) {
            e0<f, c> a2 = e0.a(z42.l(c.a.a));
            h.d(a2, "dispatch(effects(AbandonAudioFocus))");
            return a2;
        } else {
            String str = "noChange()";
            if (dVar instanceof d.c) {
                d.c cVar = (d.c) dVar;
                g a3 = cVar.a();
                if (a3 instanceof g.c) {
                    g.c cVar2 = (g.c) cVar.a();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    if (!fVar.c()) {
                        linkedHashSet.add(c.d.a);
                    }
                    linkedHashSet.add(new c.C0172c(cVar2.a()));
                    e0<f, c> g3 = e0.g(f.a(fVar, cVar2.a(), false, false, 0, 0, 0, 6), linkedHashSet);
                    h.d(g3, "next(\n            model.…        effects\n        )");
                    return g3;
                } else if (a3 instanceof g.b) {
                    long b = cVar.b();
                    if (fVar.e() > 0) {
                        e0<f, c> h = e0.h();
                        h.d(h, str);
                        return h;
                    }
                    e0<f, c> g4 = e0.g(f.a(fVar, null, false, false, 0, b, 0, 47), z42.l(bVar));
                    h.d(g4, "next(model.copy(pauseSta…mestamp), effects(Pause))");
                    return g4;
                } else if (a3 instanceof g.d) {
                    long b2 = cVar.b();
                    if (c(fVar)) {
                        e0<f, c> h2 = e0.h();
                        h.d(h2, str);
                        return h2;
                    }
                    f a4 = f.a(fVar, null, false, false, 0, 0, a(fVar, b2), 15);
                    e0<f, c> g5 = e0.g(a4, b(a4, eVar));
                    h.d(g5, "next(\n                ne…ble(Resume)\n            )");
                    return g5;
                } else if (a3 instanceof g.a) {
                    if (fVar.d()) {
                        e0Var = e0.h();
                    } else {
                        e0Var = e0.g(f.a(fVar, null, true, false, 0, 0, 0, 61), z42.l(bVar));
                        str = "next(model.copy(muted = true), effects(Pause))";
                    }
                    h.d(e0Var, str);
                    return e0Var;
                } else if (a3 instanceof g.e) {
                    long b3 = cVar.b();
                    if (!fVar.d()) {
                        e0<f, c> h3 = e0.h();
                        h.d(h3, str);
                        return h3;
                    }
                    f a5 = f.a(fVar, null, false, false, 0, 0, 0, 61);
                    e0<f, c> g6 = e0.g(a5, b(a5, new c.f((b3 - a5.f()) - a(a5, b3))));
                    h.d(g6, "next(\n                ne…imestamp)))\n            )");
                    return g6;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (dVar instanceof d.e) {
                d.e eVar2 = (d.e) dVar;
                if (fVar.f() <= 0) {
                    z = false;
                }
                if (z) {
                    e0<f, c> h4 = e0.h();
                    h.d(h4, str);
                    return h4;
                }
                f a6 = f.a(fVar, null, false, false, eVar2.a(), 0, 0, 55);
                e0<f, c> g7 = e0.g(a6, b(a6, eVar));
                h.d(g7, "next(\n                ne…ble(Resume)\n            )");
                return g7;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
