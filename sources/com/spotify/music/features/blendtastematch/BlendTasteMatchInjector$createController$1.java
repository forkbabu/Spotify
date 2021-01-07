package com.spotify.music.features.blendtastematch;

import com.spotify.mobius.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class BlendTasteMatchInjector$createController$1 extends FunctionReferenceImpl implements nmf<w44, s<w44, s44>> {
    public static final BlendTasteMatchInjector$createController$1 a = new BlendTasteMatchInjector$createController$1();

    BlendTasteMatchInjector$createController$1() {
        super(1, u44.class, "init", "init(Lcom/spotify/music/features/blendtastematch/domain/BlendTasteMatchModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<w44, s44> invoke(w44 w44) {
        w44 w442 = w44;
        h.e(w442, "p1");
        h.e(w442, "model");
        v44 a2 = w442.a();
        if (a2 instanceof c54) {
            s<w44, s44> b = s.b(w442);
            h.d(b, "First.first(model)");
            return b;
        } else if (a2 instanceof a54) {
            s<w44, s44> c = s.c(w442, d.G(h54.a));
            h.d(c, "First.first(model, setOf…ateToExpiredInvitation)))");
            return c;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
