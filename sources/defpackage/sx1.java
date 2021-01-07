package defpackage;

import com.spotify.mobile.android.storytelling.common.PauseState;
import com.spotify.mobius.e0;
import defpackage.ox1;
import defpackage.px1;
import defpackage.qx1;
import defpackage.rx1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: sx1  reason: default package */
public final class sx1 {
    private static final e0<tx1, qx1> a(tx1 tx1, int i) {
        if (!(tx1.f() instanceof px1.d) || i + 1 < ((px1.d) tx1.f()).a()) {
            e0<tx1, qx1> a = e0.a(d.G(new qx1.k(i + 1)));
            h.d(a, "dispatch(setOf(PreLoadStory(storyIndex + 1)))");
            return a;
        }
        e0<tx1, qx1> h = e0.h();
        h.d(h, "noChange()");
        return h;
    }

    public static final e0<tx1, qx1> b(tx1 tx1, rx1 rx1) {
        Object obj;
        e0<tx1, qx1> e0Var;
        e0<tx1, qx1> e0Var2;
        e0<tx1, qx1> e0Var3;
        PauseState pauseState = PauseState.PAUSED;
        h.e(tx1, "model");
        h.e(rx1, "event");
        String str = "noChange()";
        if (rx1 instanceof rx1.a) {
            if (h.a(tx1.f(), px1.b.a) || h.a(tx1.f(), px1.a.a)) {
                e0<tx1, qx1> a = e0.a(d.H(qx1.b.a, qx1.c.a));
                h.d(a, "dispatch(setOf(LoadStories, LogRetry))");
                return a;
            }
            e0<tx1, qx1> h = e0.h();
            h.d(h, str);
            return h;
        } else if (rx1 instanceof rx1.c) {
            rx1.c cVar = (rx1.c) rx1;
            tx1 a2 = tx1.a(tx1, cVar.a(), 0, null, false, 14);
            if (cVar.a() instanceof px1.d) {
                e0<tx1, qx1> g = e0.g(a2, d.H(new qx1.n(a2.b()), new qx1.k(0)));
                h.d(g, "next(newModel, setOf(Sho…Index), PreLoadStory(0)))");
                return g;
            }
            e0<tx1, qx1> f = e0.f(a2);
            h.d(f, "next(newModel)");
            return f;
        } else if (rx1 instanceof rx1.g) {
            ox1 a3 = ((rx1.g) rx1).a();
            if (a3 instanceof ox1.c) {
                if (!(tx1.f() instanceof px1.d) || tx1.b() + 1 == ((px1.d) tx1.f()).a()) {
                    e0<tx1, qx1> h2 = e0.h();
                    h.d(h2, str);
                    return h2;
                }
                int b = tx1.b() + 1;
                e0<tx1, qx1> g2 = e0.g(tx1.a(tx1, null, b, null, false, 13), d.H(new qx1.n(b), qx1.d.a));
                h.d(g2, "next(\n            model.…kipToNextStory)\n        )");
                return g2;
            } else if (a3 instanceof ox1.e) {
                if (!(tx1.f() instanceof px1.d)) {
                    e0<tx1, qx1> h3 = e0.h();
                    h.d(h3, str);
                    return h3;
                }
                if (tx1.b() == 0) {
                    e0Var3 = e0.a(d.G(new qx1.n(0)));
                } else {
                    int b2 = tx1.b() - 1;
                    e0Var3 = e0.g(tx1.a(tx1, null, b2, null, false, 13), d.H(new qx1.n(b2), qx1.e.a));
                }
                h.d(e0Var3, "if (model.currentStoryIn…ousStory)\n        )\n    }");
                return e0Var3;
            } else if (a3 instanceof ox1.b) {
                if (tx1.c()) {
                    e0Var2 = e0.h();
                } else {
                    e0Var2 = e0.g(tx1.a(tx1, null, 0, null, true, 7), d.G(qx1.f.a));
                    str = "next(model.copy(muted = true), setOf(MuteAudio))";
                }
                h.d(e0Var2, str);
                return e0Var2;
            } else if (a3 instanceof ox1.i) {
                if (!tx1.c()) {
                    e0Var = e0.h();
                } else {
                    e0Var = e0.g(tx1.a(tx1, null, 0, null, false, 7), d.G(qx1.o.a));
                    str = "next(model.copy(muted = …lse), setOf(UnmuteAudio))";
                }
                h.d(e0Var, str);
                return e0Var;
            } else if (a3 instanceof ox1.a) {
                e0<tx1, qx1> a4 = e0.a(d.G(qx1.a.a));
                h.d(a4, "dispatch(setOf(ExitContainer))");
                return a4;
            } else if (a3 instanceof ox1.d) {
                if (tx1.e() == pauseState) {
                    e0<tx1, qx1> h4 = e0.h();
                    h.d(h4, str);
                    return h4;
                }
                e0<tx1, qx1> a5 = e0.a(d.G(qx1.g.a));
                h.d(a5, "dispatch(setOf(NotifyPause))");
                return a5;
            } else if (a3 instanceof ox1.g) {
                if (tx1.e() == PauseState.RESUMED) {
                    e0<tx1, qx1> h5 = e0.h();
                    h.d(h5, str);
                    return h5;
                }
                e0<tx1, qx1> a6 = e0.a(d.G(qx1.h.a));
                h.d(a6, "dispatch(setOf(NotifyResume))");
                return a6;
            } else if (a3 instanceof ox1.h) {
                if (tx1.f() instanceof px1.d) {
                    e0<tx1, qx1> a7 = e0.a(d.G(new qx1.m(tx1.b())));
                    h.d(a7, "dispatch(setOf(ShareStor…odel.currentStoryIndex)))");
                    return a7;
                }
                e0<tx1, qx1> h6 = e0.h();
                h.d(h6, str);
                return h6;
            } else if (!(a3 instanceof ox1.f)) {
                throw new NoWhenBranchMatchedException();
            } else if (!(tx1.f() instanceof px1.d)) {
                e0<tx1, qx1> h7 = e0.h();
                h.d(h7, str);
                return h7;
            } else {
                e0<tx1, qx1> g3 = e0.g(tx1.a(tx1, null, 0, null, false, 13), d.G(new qx1.n(0)));
                h.d(g3, "next(\n            model.…f(ShowStory(0))\n        )");
                return g3;
            }
        } else if (rx1 instanceof rx1.f) {
            e0<tx1, qx1> a8 = e0.a(d.G(new qx1.i(((rx1.f) rx1).a())));
            h.d(a8, "dispatch(setOf(NotifySto…tarted(event.storyInfo)))");
            return a8;
        } else if (rx1 instanceof rx1.e) {
            return a(tx1, ((rx1.e) rx1).a());
        } else {
            if (rx1 instanceof rx1.d) {
                return a(tx1, ((rx1.d) rx1).a());
            }
            if (rx1 instanceof rx1.b) {
                rx1.b bVar = (rx1.b) rx1;
                if (tx1.e() == bVar.a()) {
                    e0<tx1, qx1> h8 = e0.h();
                    h.d(h8, str);
                    return h8;
                }
                tx1 a9 = tx1.a(tx1, null, 0, bVar.a(), false, 11);
                if (bVar.a() == pauseState) {
                    obj = qx1.j.a;
                } else {
                    obj = qx1.l.a;
                }
                e0<tx1, qx1> g4 = e0.g(a9, d.G(obj));
                h.d(g4, "next(\n            model.…}\n            )\n        )");
                return g4;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
