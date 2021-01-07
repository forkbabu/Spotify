package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobius.e0;
import com.spotify.music.features.profile.model.LoadingState;
import defpackage.lp7;
import defpackage.mp7;
import defpackage.np7;
import kotlin.jvm.internal.h;

/* renamed from: dp7  reason: default package */
public final /* synthetic */ class dp7 implements nmf {
    public final /* synthetic */ np7 a;

    public /* synthetic */ dp7(np7 np7) {
        this.a = np7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        np7 np7 = this.a;
        mp7.f fVar = (mp7.f) obj;
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        String o = np7.o();
        boolean equals = o.equals(np7.b());
        if (equals) {
            h.e(o, "username");
            builder.mo53add((ImmutableSet.Builder) new lp7.b(o));
        }
        if (np7.h() != LoadingState.LOADED) {
            String o2 = np7.o();
            h.e(o2, "username");
            builder.mo53add((ImmutableSet.Builder) new lp7.a(o2));
            np7.a n = np7.n();
            n.i(LoadingState.LOADING);
            np7 = n.a();
        } else if (np7.e() != ct7.a) {
            ct7 e = np7.e();
            h.e(o, "username");
            h.e(e, "baseFollowState");
            builder.mo53add((ImmutableSet.Builder) new lp7.c(o, e));
        }
        if (!equals && !np7.l() && np7.m().isEmpty()) {
            builder.mo53add((ImmutableSet.Builder) lp7.d.a);
        }
        return e0.g(np7, builder.build());
    }
}
