package com.spotify.music.features.blendinvitation;

import com.spotify.mobius.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class BlendInvitationInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<x34, v34, e0<x34, u34>> {
    public static final BlendInvitationInjector$createLoopFactory$1 a = new BlendInvitationInjector$createLoopFactory$1();

    BlendInvitationInjector$createLoopFactory$1() {
        super(2, w34.class, "update", "update(Lcom/spotify/music/features/blendinvitation/domain/BlendInvitationModel;Lcom/spotify/music/features/blendinvitation/domain/BlendInvitationEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<x34, u34> invoke(x34 x34, v34 v34) {
        x34 x342 = x34;
        v34 v342 = v34;
        h.e(x342, "p1");
        h.e(v342, "p2");
        z34 z34 = z34.a;
        h.e(x342, "model");
        h.e(v342, "event");
        if (v342 instanceof c44) {
            e0<x34, u34> a2 = e0.a(z42.l(z34, e44.a));
            h.d(a2, "dispatch(effects(GetInvi… LogInviteButtonClicked))");
            return a2;
        } else if (v342 instanceof y34) {
            e0<x34, u34> a3 = e0.a(z42.l(z34, d44.a));
            h.d(a3, "dispatch(effects(GetInvi…Url, LogFacePileClicked))");
            return a3;
        } else if (v342 instanceof i44) {
            e0<x34, u34> f = e0.f(x34.a(x342, ((i44) v342).a(), false, 2));
            h.d(f, "next(model.copy(user = event.user))");
            return f;
        } else if (v342 instanceof b44) {
            b44 b44 = (b44) v342;
            if (b44.a() == null) {
                e0<x34, u34> a4 = e0.a(z42.l(g44.a));
                h.d(a4, "dispatch(effects(ShowInvitationErrorSnackbar))");
                return a4;
            }
            e0<x34, u34> a5 = e0.a(z42.l(new f44(b44.a())));
            h.d(a5, "dispatch(effects(ShareIn…on(event.invitationUrl)))");
            return a5;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
