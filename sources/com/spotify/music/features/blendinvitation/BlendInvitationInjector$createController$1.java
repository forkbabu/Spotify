package com.spotify.music.features.blendinvitation;

import com.spotify.mobius.s;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class BlendInvitationInjector$createController$1 extends FunctionReferenceImpl implements nmf<x34, s<x34, u34>> {
    public static final BlendInvitationInjector$createController$1 a = new BlendInvitationInjector$createController$1();

    BlendInvitationInjector$createController$1() {
        super(1, w34.class, "init", "init(Lcom/spotify/music/features/blendinvitation/domain/BlendInvitationModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<x34, u34> invoke(x34 x34) {
        x34 x342 = x34;
        h.e(x342, "p1");
        h.e(x342, "model");
        if (x342.c() == null) {
            s<x34, u34> c = s.c(x342, z42.l(a44.a));
            h.d(c, "First.first(model, effec…s BlendInvitationEffect))");
            return c;
        }
        s<x34, u34> b = s.b(x342);
        h.d(b, "First.first(model)");
        return b;
    }
}
