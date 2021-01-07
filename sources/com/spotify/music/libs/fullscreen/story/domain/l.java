package com.spotify.music.libs.fullscreen.story.domain;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.mobius.e0;
import com.spotify.mobius.s;
import com.spotify.music.libs.fullscreen.story.domain.OverlayContextMenu;
import com.spotify.music.libs.fullscreen.story.domain.OverlayModel;
import com.spotify.music.libs.fullscreen.story.domain.a;
import com.spotify.music.libs.fullscreen.story.domain.b;
import com.spotify.music.libs.fullscreen.story.domain.g;
import com.spotify.music.libs.fullscreen.story.domain.h;
import com.spotify.music.libs.fullscreen.story.domain.i;
import com.spotify.music.libs.fullscreen.story.domain.j;
import com.spotify.music.libs.fullscreen.story.domain.k;
import com.spotify.music.libs.fullscreen.story.domain.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class l {
    private static final Set<g> a(m mVar, g... gVarArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        d.b(linkedHashSet, gVarArr);
        linkedHashSet.add(new g.o(a.C0287a.a));
        if (mVar.a() == null || !mVar.a().booleanValue()) {
            linkedHashSet.add(g.a.a);
        } else {
            linkedHashSet.add(new g.p(true));
        }
        return linkedHashSet;
    }

    public static final s<m, g> b(m mVar) {
        h.e(mVar, "model");
        m b = m.b(mVar, FullscreenStoryViewState.LOADING, 0, null, null, 0, 0, null, true, 126);
        Set l = z42.l(new g.o(a.b.a), new g.f(k.v.a));
        h.d(l, "effects(\n            Upd…toryViewShown),\n        )");
        if (mVar.h() == null) {
            s<m, g> c = s.c(b, l);
            h.d(c, "first(firstModel, firstEffects)");
            return c;
        }
        ((HashSet) l).add(new g.h(g(mVar.h())));
        s<m, g> c2 = s.c(b, l);
        h.d(c2, "first(firstModel, firstEffects)");
        return c2;
    }

    public static final String c(m mVar) {
        List<c> b;
        c cVar;
        h.e(mVar, "model");
        p h = mVar.h();
        b b2 = (h == null || (b = h.b()) == null || (cVar = b.get(mVar.c())) == null) ? null : cVar.b();
        if (b2 == null) {
            return "unknown";
        }
        if (b2 instanceof b.C0289b) {
            return ((b.C0289b) b2).a();
        }
        if (b2 instanceof b.a) {
            return ((b.a) b2).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final g d(int i, long j, m mVar) {
        if (mVar.h() != null) {
            return new g.j(i, j, mVar.h().b().get(i));
        }
        throw new IllegalArgumentException("Story can't be null".toString());
    }

    private static final g e(int i, m mVar) {
        return d(i, 0, mVar);
    }

    private static final e0<m, g> f(m mVar, boolean z) {
        Set<g> set;
        if (mVar.h() != null) {
            int c = mVar.c() + 1;
            if (c >= mVar.h().b().size()) {
                if (z) {
                    set = a(mVar, new g.q(false), new g.f(k.h.a));
                } else {
                    set = a(mVar, new g.q(false));
                }
                e0<m, g> a = e0.a(set);
                h.d(a, "dispatch(effects)");
                return a;
            }
            e0<m, g> g = e0.g(m.b(mVar, FullscreenStoryViewState.BUFFERING, 0, null, null, 0, 0, null, false, 254), z42.l(e(c, mVar), new g.f(new k.m(c(mVar), mVar.c()))));
            h.d(g, "next(\n            model.…)\n            )\n        )");
            return g;
        }
        throw new IllegalArgumentException("Story can't be null".toString());
    }

    private static final Set<String> g(p pVar) {
        List<c> b = pVar.b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = b.iterator();
        while (it.hasNext()) {
            OverlayModel c = it.next().c();
            String e = c != null ? c.e() : null;
            if (e != null) {
                arrayList.add(e);
            }
        }
        return d.Z(arrayList);
    }

    public static final e0<m, g> h(m mVar, i iVar) {
        Set set;
        k qVar;
        e0<m, g> e0Var;
        j jVar;
        e0<m, g> e0Var2;
        e0<m, g> e0Var3;
        OverlayContextMenu.Type type;
        j jVar2;
        FullscreenStoryViewState fullscreenStoryViewState = FullscreenStoryViewState.LOADING;
        FullscreenStoryViewState fullscreenStoryViewState2 = FullscreenStoryViewState.PLAYING_VIDEO;
        FullscreenStoryViewState fullscreenStoryViewState3 = FullscreenStoryViewState.PLAYING_AUDIO;
        g.a aVar = g.a.a;
        a aVar2 = a.C0287a.a;
        FullscreenStoryViewState fullscreenStoryViewState4 = FullscreenStoryViewState.BUFFERING;
        h.e(mVar, "model");
        h.e(iVar, "event");
        if (iVar instanceof i.b) {
            return f(mVar, true);
        }
        if (iVar instanceof i.k) {
            if (mVar.h() != null) {
                return f(mVar, false);
            }
            e0<m, g> a = e0.a(z42.l(new g.f(new k.m(c(mVar), mVar.c()))));
            h.d(a, "dispatch(\n              …          )\n            )");
            return a;
        } else if (iVar instanceof i.s) {
            g.f fVar = new g.f(new k.s(c(mVar), mVar.c()));
            if (mVar.h() == null) {
                e0<m, g> a2 = e0.a(z42.l(fVar));
                h.d(a2, "dispatch(effects(logEffect))");
                return a2;
            }
            int c = mVar.c() - 1;
            if (c < 0) {
                e0<m, g> a3 = e0.a(z42.l(fVar));
                h.d(a3, "dispatch(effects(logEffect))");
                return a3;
            }
            e0<m, g> g = e0.g(m.b(mVar, fullscreenStoryViewState4, 0, null, null, 0, 0, null, false, 254), z42.l(e(c, mVar), fVar));
            h.d(g, "next(\n                mo…logEffect),\n            )");
            return g;
        } else if (iVar instanceof i.n) {
            if (mVar.h() != null) {
                int c2 = mVar.c();
                c cVar = mVar.h().b().get(c2);
                OverlayModel c3 = cVar.c();
                if (c3 != null) {
                    if (c3.j() == OverlayModel.Type.TRACK || c3.j() == OverlayModel.Type.ALBUM || c3.j() == OverlayModel.Type.PLAYLIST) {
                        String e = cVar.c().e();
                        boolean z = !cVar.c().g();
                        if (z) {
                            jVar2 = j.b.a;
                        } else {
                            jVar2 = j.d.a;
                        }
                        e0<m, g> a4 = e0.a(z42.l(new g.d(e, z), new g.l(jVar2), new g.f(new k.l(c(mVar), c2, z))));
                        h.d(a4, "dispatch(\n            ef…)\n            )\n        )");
                        return a4;
                    }
                    StringBuilder V0 = je.V0("Can't heart ");
                    V0.append(c3.j());
                    throw new IllegalArgumentException(V0.toString().toString());
                }
                throw new IllegalArgumentException("Can't heart without overlay".toString());
            }
            throw new IllegalArgumentException("Story can't be null".toString());
        } else if (iVar instanceof i.m) {
            if (mVar.h() != null) {
                int c4 = mVar.c();
                OverlayModel c5 = mVar.h().b().get(c4).c();
                if (c5 != null) {
                    int ordinal = c5.j().ordinal();
                    if (ordinal == 0) {
                        type = OverlayContextMenu.Type.TRACK;
                    } else if (ordinal == 1) {
                        type = OverlayContextMenu.Type.ALBUM;
                    } else if (ordinal == 2) {
                        throw new IllegalStateException("Artist doesn't have overlay context menu".toString());
                    } else if (ordinal == 3) {
                        type = OverlayContextMenu.Type.PLAYLIST;
                    } else if (ordinal == 4) {
                        type = OverlayContextMenu.Type.EPISODE;
                    } else if (ordinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        throw new IllegalStateException("Show doesn't have overlay context menu".toString());
                    }
                    e0<m, g> a5 = e0.a(z42.l(new g.n(new OverlayContextMenu(c5.i(), c5.e(), c5.c(), type)), new g.f(new k.p(c(mVar), c4))));
                    h.d(a5, "dispatch(\n              …          )\n            )");
                    return a5;
                }
                throw new IllegalArgumentException("Overlay can't be null".toString());
            }
            throw new IllegalArgumentException("Story can't be null".toString());
        } else if (iVar instanceof i.o) {
            if (mVar.h() != null) {
                int c6 = mVar.c();
                OverlayModel c7 = mVar.h().b().get(c6).c();
                if (c7 != null) {
                    if (c7.j() == OverlayModel.Type.ARTIST) {
                        String e2 = c7.e();
                        String i = c7.i();
                        boolean z2 = !c7.g();
                        e0<m, g> a6 = e0.a(z42.l(new g.c(e2, i, z2), new g.f(new k.i(c(mVar), c6, z2))));
                        h.d(a6, "dispatch(\n            ef…)\n            )\n        )");
                        return a6;
                    }
                    StringBuilder V02 = je.V0("Can't follow ");
                    V02.append(c7.j());
                    throw new IllegalArgumentException(V02.toString().toString());
                }
                throw new IllegalArgumentException("Overlay can't be null".toString());
            }
            throw new IllegalArgumentException("Story can't be null".toString());
        } else if (iVar instanceof i.j) {
            if (mVar.h() != null) {
                e0<m, g> a7 = e0.a(z42.l(new g.m(mVar.h().c()), new g.f(new k.C0292k(c(mVar), mVar.c()))));
                h.d(a7, "dispatch(\n            ef…)\n            )\n        )");
                return a7;
            }
            throw new IllegalArgumentException("Story can't be null".toString());
        } else if (iVar instanceof i.p) {
            int a8 = ((i.p) iVar).a();
            boolean z3 = a8 == mVar.c();
            e0<m, g> f = e0.f(m.b(mVar, null, a8, null, null, z3 ? mVar.f() : 0, z3 ? mVar.e() : 0, null, false, 205));
            h.d(f, "next(\n            model.…s\n            )\n        )");
            return f;
        } else if (iVar instanceof i.q) {
            boolean a9 = ((i.q) iVar).a();
            if (mVar.h() != null && mVar.c() >= 0) {
                if (mVar.i() == fullscreenStoryViewState3 || mVar.i() == fullscreenStoryViewState2) {
                    if (a9) {
                        aVar2 = a.b.a;
                    }
                    e0<m, g> a10 = e0.a(z42.l(new g.q(a9), new g.o(aVar2)));
                    h.d(a10, "dispatch(\n            ef…)\n            )\n        )");
                    return a10;
                }
            }
            e0<m, g> h = e0.h();
            h.d(h, "noChange()");
            return h;
        } else if (iVar instanceof i.w) {
            o a11 = ((i.w) iVar).a();
            if (a11 instanceof o.a) {
                e0<m, g> g2 = e0.g(m.b(mVar, fullscreenStoryViewState4, 0, null, null, 0, 0, null, false, 254), z42.l(g.b.a));
                h.d(g2, "next(\n                mo…howLoading)\n            )");
                return g2;
            } else if (a11 instanceof o.g) {
                int c8 = mVar.c();
                String c9 = c(mVar);
                if (mVar.h() != null) {
                    if (mVar.c() >= 0) {
                        b b = mVar.h().b().get(mVar.c()).b();
                        if (b instanceof b.C0289b) {
                            e0Var3 = e0.g(m.b(mVar, fullscreenStoryViewState2, 0, null, null, 0, 0, null, false, 254), z42.l(new g.f(new k.w(c9, c8))));
                        } else if (b instanceof b.a) {
                            e0Var3 = e0.g(m.b(mVar, fullscreenStoryViewState3, 0, null, null, 0, 0, null, false, 254), z42.l(new g.f(new k.a(c9, c8))));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        h.d(e0Var3, "when (model.story.chapte…      )\n                }");
                        return e0Var3;
                    }
                    throw new IllegalArgumentException("Invalid chapter index".toString());
                }
                throw new IllegalArgumentException("Story is missing".toString());
            } else if (a11 instanceof o.f) {
                if (mVar.h() != null) {
                    if (mVar.c() >= 0) {
                        b b2 = mVar.h().b().get(mVar.c()).b();
                        if (b2 instanceof b.C0289b) {
                            e0Var2 = e0.f(m.b(mVar, fullscreenStoryViewState2, 0, null, null, 0, 0, null, false, 254));
                        } else if (b2 instanceof b.a) {
                            e0Var2 = e0.f(m.b(mVar, fullscreenStoryViewState3, 0, null, null, 0, 0, null, false, 254));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        h.d(e0Var2, "when (model.story.chapte…AUDIO))\n                }");
                        return e0Var2;
                    }
                    throw new IllegalArgumentException("Invalid chapter index".toString());
                }
                throw new IllegalArgumentException("Story is missing".toString());
            } else if (a11 instanceof o.d) {
                o.d dVar = (o.d) a11;
                e0<m, g> f2 = e0.f(m.b(mVar, null, 0, null, null, dVar.b(), dVar.a(), null, false, 207));
                h.d(f2, "next(\n                  …      )\n                )");
                return f2;
            } else if (a11 instanceof o.b) {
                throw new IllegalStateException("Cannot happen, it's been mapped to ChapterFinished Event".toString());
            } else if (a11 instanceof o.c) {
                throw new IllegalStateException("Cannot happen, it's been mapped to Error(PlaybackError) Event".toString());
            } else if (a11 instanceof o.e) {
                throw new IllegalStateException("Cannot happen, it's been mapped to Error(PlaybackError) Event".toString());
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (iVar instanceof i.u) {
            p a12 = ((i.u) iVar).a();
            m b3 = m.b(mVar, null, 0, null, a12, 0, 0, null, false, 247);
            e0<m, g> g3 = e0.g(b3, z42.l(new g.h(g(a12)), e(0, b3), new g.k(a12.b()), new g.f(k.t.a)));
            h.d(g3, "next(\n            nextMo…)\n            )\n        )");
            return g3;
        } else if (iVar instanceof i.d) {
            Map<String, Boolean> a13 = ((i.d) iVar).a();
            p h2 = mVar.h();
            if (h2 != null) {
                List<c> b4 = h2.b();
                ArrayList arrayList = new ArrayList(d.e(b4, 10));
                for (T t : b4) {
                    OverlayModel c10 = t.c();
                    if (c10 != null) {
                        Boolean bool = a13.get(c10.e());
                        if (bool != null) {
                            t = (T) c.a(t, OverlayModel.a(c10, null, null, null, null, 0, null, null, null, bool.booleanValue(), BitmapRenderer.ALPHA_VISIBLE), null, 2);
                        } else {
                            throw new IllegalArgumentException((c10.e() + " is not present in " + a13).toString());
                        }
                    }
                    arrayList.add(t);
                }
                e0<m, g> f3 = e0.f(m.b(mVar, null, 0, null, p.a(mVar.h(), null, null, null, null, null, arrayList, 31), 0, 0, null, false, 247));
                h.d(f3, "next(model.copy(story = …chapters = newChapters)))");
                return f3;
            }
            throw new IllegalArgumentException("Story can't be null".toString());
        } else if (iVar instanceof i.C0291i) {
            i.C0291i iVar2 = (i.C0291i) iVar;
            String a14 = iVar2.a();
            if (iVar2.b()) {
                jVar = new j.a(a14);
            } else {
                jVar = new j.c(a14);
            }
            e0<m, g> a15 = e0.a(z42.l(new g.l(jVar)));
            h.d(a15, "dispatch(effects(ShowFeedback(feedback)))");
            return a15;
        } else if (iVar instanceof i.c) {
            e0<m, g> a16 = e0.a(a(mVar, new g.q(false), new g.f(new k.c(c(mVar), mVar.c()))));
            h.d(a16, "dispatch(effects)");
            return a16;
        } else if (iVar instanceof i.a) {
            e0<m, g> a17 = e0.a(a(mVar, new g.q(false), new g.f(new k.b(c(mVar), mVar.c()))));
            h.d(a17, "dispatch(effects)");
            return a17;
        } else if (iVar instanceof i.r) {
            e0<m, g> a18 = e0.a(z42.l(new g.f(new k.r(c(mVar), mVar.c())), g.C0290g.a));
            h.d(a18, "dispatch(\n              …          )\n            )");
            return a18;
        } else if (iVar instanceof i.v) {
            e0<m, g> f4 = e0.f(m.b(mVar, null, 0, null, null, 0, 0, null, ((i.v) iVar).a(), 127));
            h.d(f4, "next(model.copy(showStoryInfo = show))");
            return f4;
        } else if (iVar instanceof i.g) {
            boolean a19 = ((i.g) iVar).a();
            if (mVar.a() == null) {
                m b5 = m.b(mVar, null, 0, null, null, 0, 0, Boolean.valueOf(a19), false, 191);
                if (a19) {
                    e0Var = e0.g(b5, z42.l(new g.p(false)));
                } else {
                    e0Var = e0.f(b5);
                }
                h.d(e0Var, "if (playing) {\n         …wModel)\n                }");
                return e0Var;
            } else if (a19) {
                e0<m, g> a20 = e0.a(z42.l(new g.o(aVar2), aVar, new g.q(false), new g.f(new k.d(c(mVar), mVar.c()))));
                h.d(a20, "dispatch(\n              …      )\n                )");
                return a20;
            } else {
                e0<m, g> h3 = e0.h();
                h.d(h3, "noChange()");
                return h3;
            }
        } else if (iVar instanceof i.f) {
            e0<m, g> a21 = e0.a(z42.l(new g.o(aVar2), aVar));
            h.d(a21, "dispatch(\n            ef…e\n            )\n        )");
            return a21;
        } else if (iVar instanceof i.h) {
            h a22 = ((i.h) iVar).a();
            String str = "unknown";
            if (a22 instanceof h.f) {
                String message = ((h.f) a22).a().getMessage();
                if (message != null) {
                    str = message;
                }
                qVar = new k.u(str);
            } else if (a22 instanceof h.d) {
                String message2 = ((h.d) a22).a().getMessage();
                if (message2 != null) {
                    str = message2;
                }
                qVar = new k.n(str);
            } else if (a22 instanceof h.c) {
                String message3 = ((h.c) a22).a().getMessage();
                if (message3 != null) {
                    str = message3;
                }
                qVar = new k.j(str);
            } else if (a22 instanceof h.b) {
                qVar = k.f.a;
            } else if (a22 instanceof h.a) {
                qVar = k.e.a;
            } else if (a22 instanceof h.e) {
                qVar = new k.q(c(mVar), mVar.c());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            e0<m, g> g4 = e0.g(m.b(mVar, FullscreenStoryViewState.ERROR, 0, null, null, 0, 0, null, false, 254), z42.l(new g.f(qVar)));
            kotlin.jvm.internal.h.d(g4, "next(\n            model.…ffect.Log(log))\n        )");
            return g4;
        } else if (iVar instanceof i.e) {
            if (!((i.e) iVar).a()) {
                e0<m, g> g5 = e0.g(m.b(mVar, FullscreenStoryViewState.OFFLINE, 0, null, null, 0, 0, null, false, 254), z42.l(new g.q(false)));
                kotlin.jvm.internal.h.d(g5, "next(\n                mo…ate(false))\n            )");
                return g5;
            }
            m b6 = m.b(mVar, fullscreenStoryViewState, 0, null, null, 0, 0, null, false, 254);
            if (mVar.h() == null) {
                set = z42.l(g.e.a);
                kotlin.jvm.internal.h.d(set, "effects(\n               ….LoadStory,\n            )");
            } else {
                set = z42.l(d(mVar.c() >= 0 ? mVar.c() : 0, mVar.f(), mVar));
                kotlin.jvm.internal.h.d(set, "effects(\n               …Ms, model),\n            )");
            }
            e0<m, g> g6 = e0.g(b6, set);
            kotlin.jvm.internal.h.d(g6, "next(newModel, effects)");
            return g6;
        } else if (iVar instanceof i.t) {
            if (mVar.i() != fullscreenStoryViewState4) {
                e0<m, g> h4 = e0.h();
                kotlin.jvm.internal.h.d(h4, "noChange()");
                return h4;
            }
            e0<m, g> f5 = e0.f(m.b(mVar, fullscreenStoryViewState, 0, null, null, 0, 0, null, false, 254));
            kotlin.jvm.internal.h.d(f5, "next(model.copy(viewStat…nStoryViewState.LOADING))");
            return f5;
        } else if (!(iVar instanceof i.l)) {
            throw new NoWhenBranchMatchedException();
        } else if (mVar.h() != null) {
            OverlayModel c11 = mVar.h().b().get(mVar.c()).c();
            if (c11 != null) {
                e0<m, g> a23 = e0.a(z42.l(new g.f(new k.o(c(mVar), mVar.c(), c11.e())), new g.i(c11.e()), aVar));
                kotlin.jvm.internal.h.d(a23, "dispatch(\n              …          )\n            )");
                return a23;
            }
            throw new IllegalArgumentException("Can't open entity uri without overlay".toString());
        } else {
            throw new IllegalArgumentException("Story can't be null".toString());
        }
    }
}
