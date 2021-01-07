package com.spotify.music.features.blendtastematch;

import com.spotify.mobius.e0;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class BlendTasteMatchInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<w44, t44, e0<w44, s44>> {
    public static final BlendTasteMatchInjector$createLoopFactory$1 a = new BlendTasteMatchInjector$createLoopFactory$1();

    BlendTasteMatchInjector$createLoopFactory$1() {
        super(2, u44.class, "update", "update(Lcom/spotify/music/features/blendtastematch/domain/BlendTasteMatchModel;Lcom/spotify/music/features/blendtastematch/domain/BlendTasteMatchEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<w44, s44> invoke(w44 w44, t44 t44) {
        Set set;
        w44 w442 = w44;
        t44 t442 = t44;
        h.e(w442, "p1");
        h.e(t442, "p2");
        h.e(w442, "model");
        h.e(t442, "event");
        v44 a2 = w442.a();
        if (a2 instanceof c54) {
            boolean z = true;
            if (t442 instanceof e54) {
                c54 c54 = (c54) w442.a();
                if (c54.h() instanceof y44) {
                    e0<w44, s44> h = e0.h();
                    h.d(h, "noChange()");
                    return h;
                }
                e0<w44, s44> g = e0.g(new w44(c54.a(c54, y44.a, null, null, null, null, null, null, null, 254)), z42.l(new x44(c54.b()), g54.a));
                h.d(g, "next(\n            BlendT…nButtonClicked)\n        )");
                return g;
            } else if (t442 instanceof q44) {
                e0<w44, s44> a3 = e0.a(z42.l(new i54(((q44) t442).a())));
                h.d(a3, "dispatch(effects(Navigat…oUri(event.playlistUri)))");
                return a3;
            } else if (t442 instanceof r44) {
                e0<w44, s44> g2 = e0.g(new w44(c54.a((c54) w442.a(), f54.a, null, null, null, null, null, null, null, 254)), z42.l(j54.a));
                h.d(g2, "next(\n                Bl…orSnackbar)\n            )");
                return g2;
            } else if (t442 instanceof k54) {
                e0<w44, s44> a4 = e0.a(z42.l(z44.a));
                h.d(a4, "dispatch(effects(DismissView))");
                return a4;
            } else if (t442 instanceof b54) {
                c54 c542 = (c54) w442.a();
                String c = c542.c();
                if (!(c == null || c.length() == 0)) {
                    z = false;
                }
                if (z) {
                    set = EmptySet.a;
                } else {
                    set = d.G(new i54(c542.c()));
                }
                e0<w44, s44> a5 = e0.a(set);
                h.d(a5, "dispatch(navigateToBlendPlaylist(model.mode))");
                return a5;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (a2 instanceof a54) {
            e0<w44, s44> h2 = e0.h();
            h.d(h2, "noChange()");
            return h2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
