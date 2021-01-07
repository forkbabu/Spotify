package com.spotify.libs.onboarding.allboarding.flow;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.l0;
import androidx.navigation.e;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.libs.onboarding.allboarding.room.AllboardingDatabase;
import com.spotify.libs.onboarding.allboarding.simpleloading.SimpleLoadingView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.remoteconfig.AndroidLibsAllboardingProperties;
import com.squareup.picasso.Picasso;
import dagger.android.support.DaggerFragment;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.concurrent.TimeUnit;
import kotlin.d;
import kotlin.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public final class ShowLoadingFragment extends DaggerFragment {
    public Picasso h0;
    public tv0 i0;
    public AllboardingDatabase j0;
    public gw0 k0;
    public fre l0;
    private ViewLoadingTracker m0;
    public wlf<AndroidLibsAllboardingProperties> n0;
    private final e o0 = new e(j.b(h.class), new ShowLoadingFragment$$special$$inlined$navArgs$1(this));
    public j p0;
    private final d q0 = l0.a(this, j.b(i.class), new ShowLoadingFragment$$special$$inlined$viewModels$2(new ShowLoadingFragment$$special$$inlined$viewModels$1(this)), new ShowLoadingFragment$showLoadingViewModel$2(this));
    private io.reactivex.disposables.b r0;

    public static final class a extends androidx.activity.b {
        a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void b() {
            Assertion.v("User tried to back out from ShowLoadingFragment");
        }
    }

    static final class b<T, R> implements l<Long, f> {
        final /* synthetic */ ShowLoadingFragment a;

        b(ShowLoadingFragment showLoadingFragment) {
            this.a = showLoadingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public f apply(Long l) {
            h.e(l, "it");
            AllboardingDatabase allboardingDatabase = this.a.j0;
            if (allboardingDatabase != null) {
                allboardingDatabase.d();
                tv0 tv0 = this.a.i0;
                if (tv0 != null) {
                    tv0.b();
                    gw0 gw0 = this.a.k0;
                    if (gw0 != null) {
                        gw0.a();
                        return f.a;
                    }
                    h.k("doneListener");
                    throw null;
                }
                h.k("deeplinkTracker");
                throw null;
            }
            h.k("allboardingDb");
            throw null;
        }
    }

    static final class c<T> implements g<f> {
        final /* synthetic */ ShowLoadingFragment a;

        c(ShowLoadingFragment showLoadingFragment) {
            this.a = showLoadingFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(f fVar) {
            this.a.j4().finish();
        }
    }

    public ShowLoadingFragment() {
        super(C0707R.layout.post_data_fragment);
    }

    public static final h K4(ShowLoadingFragment showLoadingFragment) {
        return (h) showLoadingFragment.o0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        h.e(bundle, "outState");
        ViewLoadingTracker viewLoadingTracker = this.m0;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.t(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        wlf<AndroidLibsAllboardingProperties> wlf = this.n0;
        if (wlf != null) {
            AndroidLibsAllboardingProperties.LoadingAnimation a2 = wlf.get().a();
            AndroidLibsAllboardingProperties.LoadingAnimation loadingAnimation = AndroidLibsAllboardingProperties.LoadingAnimation.GREAT_PICKS;
            if (a2 == loadingAnimation) {
                ((i) this.q0.getValue()).g().h(b3(), new g(this, view));
            } else {
                SimpleLoadingView simpleLoadingView = (SimpleLoadingView) view.findViewById(C0707R.id.loading_animation_lite);
                h.d(simpleLoadingView, "simpleLoadingView");
                simpleLoadingView.setVisibility(0);
                simpleLoadingView.setTitle(((h) this.o0.getValue()).a());
            }
            ViewLoadingTracker viewLoadingTracker = this.m0;
            if (viewLoadingTracker != null) {
                viewLoadingTracker.g();
            }
            androidx.fragment.app.c j4 = j4();
            h.d(j4, "requireActivity()");
            j4.S0().b(b3(), new a(true));
            wlf<AndroidLibsAllboardingProperties> wlf2 = this.n0;
            if (wlf2 != null) {
                this.r0 = s.W0(wlf2.get().a() == loadingAnimation ? 5000 : 3000, TimeUnit.MILLISECONDS).I0(io.reactivex.schedulers.a.c()).j0(new b(this)).subscribe(new c(this));
            } else {
                h.k("properties");
                throw null;
            }
        } else {
            h.k("properties");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        View w3 = super.w3(layoutInflater, viewGroup, bundle);
        if (w3 == null) {
            return null;
        }
        fre fre = this.l0;
        if (fre != null) {
            h.d(w3, "it");
            String d = AllboardingPages.SEND.d();
            Context l4 = l4();
            h.d(l4, "requireContext()");
            this.m0 = fre.a(w3, d, bundle, l4);
            return w3;
        }
        h.k("viewLoadingTrackerFactory");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        io.reactivex.disposables.b bVar = this.r0;
        if (bVar != null) {
            bVar.dispose();
        }
    }
}
