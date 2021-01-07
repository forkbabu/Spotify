package com.spotify.music.mainactivity;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobius.s;
import defpackage.tfb;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class MainActivityMobiusLoopFactory$createFactory$2 extends FunctionReferenceImpl implements nmf<wfb, s<wfb, tfb>> {
    MainActivityMobiusLoopFactory$createFactory$2(vfb vfb) {
        super(1, vfb, vfb.class, "init", "init(Lcom/spotify/music/mainactivity/domain/MainActivityModel;)Lcom/spotify/mobius/First;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<wfb, tfb> invoke(wfb wfb) {
        wfb wfb2 = wfb;
        h.e(wfb2, "p1");
        ((vfb) this.receiver).getClass();
        h.e(wfb2, "initialModel");
        if (wfb2.h()) {
            s<wfb, tfb> c = s.c(wfb2, ImmutableSet.of(tfb.g.a));
            h.d(c, "First.first(\n           …vityEffect>\n            )");
            return c;
        }
        s<wfb, tfb> b = s.b(wfb2);
        h.d(b, "First.first(initialModel)");
        return b;
    }
}
