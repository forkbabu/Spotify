package com.spotify.music.features.onboarding.flow;

import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.onboarding.flow.OnboardingDestination;
import com.spotify.music.features.tasteonboarding.f;
import com.spotify.music.features.tasteonboarding.g;
import dagger.android.support.DaggerFragment;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import kotlin.jvm.internal.h;
import org.apache.commons.lang3.tuple.ImmutableTriple;

public final class OnboardingLauncherResolver extends DaggerFragment {
    private final s<Boolean> h0;
    private final y i0;
    private final fha j0;
    private final l0 k0;
    private final v l0;
    private final w m0;
    private final q9c n0;
    private final g o0;
    private final vwc p0;
    private final fm9 q0;
    private final fha r0;

    static final class a<T, R> implements l<com.spotify.android.flags.c, d0<? extends OnboardingDestination>> {
        final /* synthetic */ OnboardingLauncherResolver a;

        a(OnboardingLauncherResolver onboardingLauncherResolver) {
            this.a = onboardingLauncherResolver;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends OnboardingDestination> apply(com.spotify.android.flags.c cVar) {
            com.spotify.android.flags.c cVar2 = cVar;
            h.e(cVar2, "flags");
            if (!cVar2.j2(s9c.c)) {
                return this.a.P4();
            }
            z z = z.z(new OnboardingDestination(OnboardingDestination.Destination.LANGUAGE, cVar2));
            h.d(z, "Single.just(\n           …  )\n                    )");
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T1, T2, T3, R> implements io.reactivex.functions.h<com.spotify.android.flags.c, Boolean, Boolean, ImmutableTriple<com.spotify.android.flags.c, Boolean, Boolean>> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.h
        public ImmutableTriple<com.spotify.android.flags.c, Boolean, Boolean> a(com.spotify.android.flags.c cVar, Boolean bool, Boolean bool2) {
            com.spotify.android.flags.c cVar2 = cVar;
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            h.e(cVar2, "left");
            return new ImmutableTriple<>(cVar2, Boolean.valueOf(booleanValue), Boolean.valueOf(booleanValue2));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T, R> implements l<ImmutableTriple<com.spotify.android.flags.c, Boolean, Boolean>, OnboardingDestination> {
        final /* synthetic */ OnboardingLauncherResolver a;

        c(OnboardingLauncherResolver onboardingLauncherResolver) {
            this.a = onboardingLauncherResolver;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public OnboardingDestination apply(ImmutableTriple<com.spotify.android.flags.c, Boolean, Boolean> immutableTriple) {
            ImmutableTriple<com.spotify.android.flags.c, Boolean, Boolean> immutableTriple2 = immutableTriple;
            h.e(immutableTriple2, "triple");
            L l = immutableTriple2.left;
            l.getClass();
            h.d(l, "Preconditions.checkNotNu…eft\n                    )");
            L l2 = l;
            M m = immutableTriple2.middle;
            m.getClass();
            h.d(m, "Preconditions.checkNotNull(triple.middle)");
            boolean booleanValue = m.booleanValue();
            R r = immutableTriple2.right;
            r.getClass();
            h.d(r, "Preconditions.checkNotNull(triple.right)");
            boolean booleanValue2 = r.booleanValue();
            OnboardingLauncherResolver onboardingLauncherResolver = this.a;
            if (OnboardingLauncherResolver.N4(onboardingLauncherResolver, booleanValue2, l2, onboardingLauncherResolver.k0) || !OnboardingLauncherResolver.M4(this.a, booleanValue, l2)) {
                this.a.o0.b();
                return new OnboardingDestination(OnboardingDestination.Destination.FINISH, null);
            }
            this.a.o0.a();
            return new OnboardingDestination(OnboardingDestination.Destination.TASTE, l2);
        }
    }

    public OnboardingLauncherResolver(l0 l0Var, v vVar, w wVar, q9c q9c, g gVar, vwc vwc, fm9 fm9, r9c r9c, y yVar, fha fha) {
        h.e(l0Var, "mSpotifyLinkFromLoginActivity");
        h.e(vVar, "mRxFlags");
        h.e(wVar, "mRxProductState");
        h.e(q9c, "mTasteOnboardingDeepLinkTracker");
        h.e(gVar, "mTasteOnboardingDeepLinkTrackerLogger");
        h.e(vwc, "mPremiumFeatureUtils");
        h.e(fm9, "mFreeTierFeatureUtils");
        h.e(r9c, "removeTasteOnboardingProductState");
        h.e(yVar, "ioScheduler");
        h.e(fha, "homeFeatureFlagsProvider");
        this.k0 = l0Var;
        this.l0 = vVar;
        this.m0 = wVar;
        this.n0 = q9c;
        this.o0 = gVar;
        this.p0 = vwc;
        this.q0 = fm9;
        this.r0 = fha;
        this.h0 = ((fq8) r9c).c();
        this.i0 = yVar;
        this.j0 = fha;
    }

    public static final boolean M4(OnboardingLauncherResolver onboardingLauncherResolver, boolean z, com.spotify.android.flags.c cVar) {
        if (((onboardingLauncherResolver.j0.a() > 0) || !onboardingLauncherResolver.q0.a(cVar)) && !z) {
            return false;
        }
        return true;
    }

    public static final boolean N4(OnboardingLauncherResolver onboardingLauncherResolver, boolean z, com.spotify.android.flags.c cVar, l0 l0Var) {
        onboardingLauncherResolver.getClass();
        if (!z && !((f) onboardingLauncherResolver.n0).d(cVar, l0Var) && !cVar.j2(s9c.d)) {
            if (!(onboardingLauncherResolver.j0.a() > 0)) {
                return false;
            }
        }
        return true;
    }

    public final z<OnboardingDestination> O4() {
        z<R> s = this.l0.b().h0(1).a0().H(this.i0).s(new a(this));
        h.d(s, "mRxFlags.flags()\n       …          }\n            }");
        return s;
    }

    public final z<OnboardingDestination> P4() {
        io.reactivex.g<com.spotify.android.flags.c> b2 = this.l0.b();
        b2.getClass();
        io.reactivex.internal.operators.observable.v vVar = new io.reactivex.internal.operators.observable.v(b2);
        vwc vwc = this.p0;
        w wVar = this.m0;
        vwc.getClass();
        z<OnboardingDestination> A0 = s.m(vVar, wVar.c("payment-state").W(twc.a, false, Integer.MAX_VALUE), this.h0, b.a).I0(this.i0).N0(1).j0(new c(this)).A0(new OnboardingDestination(OnboardingDestination.Destination.FINISH, null));
        h.d(A0, "Observable.combineLatest…          )\n            )");
        return A0;
    }
}
