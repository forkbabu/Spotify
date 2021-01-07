package defpackage;

import com.spotify.mobius.e0;
import com.spotify.music.preview.z;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.o;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: ch4  reason: default package */
public final class ch4 {
    private static final String a(nh4 nh4, int i) {
        String previewId;
        if (!(nh4 instanceof mh4)) {
            return null;
        }
        mh4 mh4 = (mh4) nh4;
        if (mh4.a().getItems().size() <= i) {
            return null;
        }
        o g = mh4.a().getItems().get(i).g();
        if (g != null && (previewId = g.getPreviewId()) != null) {
            return previewId;
        }
        Episode c = mh4.a().getItems().get(i).c();
        if (c != null) {
            return c.s();
        }
        return null;
    }

    public static final e0<dh4, ah4> b(dh4 dh4, bh4 bh4) {
        e0<dh4, ah4> e0Var;
        e0<dh4, ah4> e0Var2;
        h.e(dh4, "model");
        h.e(bh4, "event");
        String str = null;
        if (bh4 instanceof ph4) {
            ph4 ph4 = (ph4) bh4;
            dh4 a = dh4.a(dh4, new mh4(ph4.a()), null, 2);
            if (dh4.b() instanceof mh4) {
                e0<dh4, ah4> f = e0.f(a);
                h.d(f, "next(newModel)");
                return f;
            }
            e0<dh4, ah4> g = e0.g(a, z42.l(new rh4(ph4.a().j().getUri())));
            h.d(g, "next(newModel, effects(S…istEntity.playlist.uri)))");
            return g;
        } else if (bh4 instanceof oh4) {
            e0<dh4, ah4> h = e0.h();
            h.d(h, "noChange()");
            return h;
        } else if (bh4 instanceof vg4) {
            nh4 b = dh4.b();
            if (b instanceof lh4) {
                e0Var2 = e0.h();
            } else if (b instanceof mh4) {
                e0Var2 = e0.a(z42.l(new gh4(((mh4) dh4.b()).a())));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            h.d(e0Var2, "when (model.playlistStat…tEntity))\n        )\n    }");
            return e0Var2;
        } else if (bh4 instanceof th4) {
            nh4 b2 = dh4.b();
            if (b2 instanceof lh4) {
                e0Var = e0.h();
            } else if (b2 instanceof mh4) {
                e0Var = e0.a(z42.l(new sh4(((mh4) dh4.b()).a()), new ug4(((mh4) dh4.b()).a().j().getUri())));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            h.d(e0Var, "when (model.playlistStat…        )\n        )\n    }");
            return e0Var;
        } else if (bh4 instanceof fh4) {
            fh4 fh4 = (fh4) bh4;
            if (!(dh4.b() instanceof mh4) || ((mh4) dh4.b()).a().getItems().size() <= fh4.a()) {
                e0<dh4, ah4> h2 = e0.h();
                h.d(h2, "noChange()");
                return h2;
            }
            String uri = ((mh4) dh4.b()).a().j().getUri();
            String f2 = ((mh4) dh4.b()).a().getItems().get(fh4.a()).f();
            h.c(f2);
            ah4[] ah4Arr = {new eh4(uri, f2)};
            h.e(ah4Arr, "elements");
            LinkedHashSet linkedHashSet = new LinkedHashSet(d.w(1));
            d.N(ah4Arr, linkedHashSet);
            String a2 = a(dh4.b(), fh4.a());
            if (a2 != null) {
                z c = dh4.c();
                if (c != null) {
                    str = c.g();
                }
                if (h.a(a2, str)) {
                    linkedHashSet.add(new hh4(a2));
                }
            }
            e0<dh4, ah4> a3 = e0.a(linkedHashSet);
            h.d(a3, "dispatch(effects)");
            return a3;
        } else if (bh4 instanceof qh4) {
            e0<dh4, ah4> f3 = e0.f(dh4.a(dh4, null, ((qh4) bh4).a(), 1));
            h.d(f3, "next(model.copy(previewP…vent.previewPlayerState))");
            return f3;
        } else if (bh4 instanceof kh4) {
            String a4 = a(dh4.b(), ((kh4) bh4).a());
            if (a4 != null) {
                e0<dh4, ah4> a5 = e0.a(z42.l(new jh4(a4)));
                h.d(a5, "dispatch(effects(PlayPreview(previewId)))");
                return a5;
            }
            e0<dh4, ah4> h3 = e0.h();
            h.d(h3, "noChange()");
            return h3;
        } else if (bh4 instanceof ih4) {
            String a6 = a(dh4.b(), ((ih4) bh4).a());
            if (a6 != null) {
                e0<dh4, ah4> a7 = e0.a(z42.l(new hh4(a6)));
                h.d(a7, "dispatch(effects(PausePreview(previewId)))");
                return a7;
            }
            e0<dh4, ah4> h4 = e0.h();
            h.d(h4, "noChange()");
            return h4;
        } else if (bh4 instanceof zh4) {
            zh4 zh4 = (zh4) bh4;
            if (dh4.b() instanceof mh4) {
                e0<dh4, ah4> a8 = e0.a(z42.l(new wg4(((mh4) dh4.b()).a().j().getUri(), zh4.a())));
                h.d(a8, "dispatch(\n            ef…)\n            )\n        )");
                return a8;
            }
            e0<dh4, ah4> h5 = e0.h();
            h.d(h5, "noChange()");
            return h5;
        } else if (bh4 instanceof yg4) {
            e0<dh4, ah4> h6 = e0.h();
            h.d(h6, "noChange()");
            return h6;
        } else if (bh4 instanceof xg4) {
            e0<dh4, ah4> h7 = e0.h();
            h.d(h7, "noChange()");
            return h7;
        } else if (bh4 instanceof yh4) {
            yh4 yh4 = (yh4) bh4;
            if (dh4.b() instanceof mh4) {
                e0<dh4, ah4> a9 = e0.a(z42.l(new xh4(((mh4) dh4.b()).a().j().getUri(), yh4.a())));
                h.d(a9, "dispatch(\n            ef…)\n            )\n        )");
                return a9;
            }
            e0<dh4, ah4> h8 = e0.h();
            h.d(h8, "noChange()");
            return h8;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
