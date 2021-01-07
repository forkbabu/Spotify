package com.spotify.libs.onboarding.allboarding.flow;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.fragment.app.l0;
import androidx.lifecycle.v;
import androidx.navigation.e;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.music.C0707R;
import dagger.android.support.DaggerFragment;
import kotlin.d;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public final class InitialLoadingFragment extends DaggerFragment {
    private final e h0 = new e(j.b(c.class), new InitialLoadingFragment$$special$$inlined$navArgs$1(this));
    public f i0;
    private final d j0 = l0.a(this, j.b(e.class), new InitialLoadingFragment$$special$$inlined$viewModels$2(new InitialLoadingFragment$$special$$inlined$viewModels$1(this)), new InitialLoadingFragment$initialLoadingViewModel$2(this));
    public com.spotify.music.features.tasteonboarding.logging.b k0;
    public fre l0;
    private ViewLoadingTracker m0;
    private ViewGroup n0;
    private ViewGroup o0;
    private ViewAnimator p0;

    static final class a implements View.OnClickListener {
        final /* synthetic */ InitialLoadingFragment a;

        a(InitialLoadingFragment initialLoadingFragment) {
            this.a = initialLoadingFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.O4().m(InitialLoadingFragment.K4(this.a).a());
        }
    }

    static final class b<T> implements v<l> {
        final /* synthetic */ InitialLoadingFragment a;

        b(InitialLoadingFragment initialLoadingFragment) {
            this.a = initialLoadingFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.v
        public void a(l lVar) {
            l lVar2 = lVar;
            InitialLoadingFragment initialLoadingFragment = this.a;
            h.d(lVar2, "it");
            InitialLoadingFragment.N4(initialLoadingFragment, lVar2);
        }
    }

    static final class c<T> implements v<com.spotify.libs.onboarding.allboarding.a<a>> {
        final /* synthetic */ InitialLoadingFragment a;

        c(InitialLoadingFragment initialLoadingFragment) {
            this.a = initialLoadingFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.v
        public void a(com.spotify.libs.onboarding.allboarding.a<a> aVar) {
            a a2 = aVar.a();
            if (a2 != null) {
                ViewLoadingTracker viewLoadingTracker = this.a.m0;
                if (viewLoadingTracker != null) {
                    viewLoadingTracker.g();
                }
                String b = a2.b();
                long a3 = a2.a();
                h.e(b, "onboardingSessionId");
                com.spotify.libs.onboarding.allboarding.c.e(this.a).j(new d(b, a3));
            }
        }
    }

    public InitialLoadingFragment() {
        super(C0707R.layout.initial_loading_view);
    }

    public static final c K4(InitialLoadingFragment initialLoadingFragment) {
        return (c) initialLoadingFragment.h0.getValue();
    }

    public static final void N4(InitialLoadingFragment initialLoadingFragment, l lVar) {
        initialLoadingFragment.getClass();
        if (lVar.c()) {
            ViewAnimator viewAnimator = initialLoadingFragment.p0;
            if (viewAnimator != null) {
                ViewGroup viewGroup = initialLoadingFragment.n0;
                if (viewGroup != null) {
                    viewAnimator.setDisplayedChild(viewAnimator.indexOfChild(viewGroup));
                } else {
                    h.k("initialLoadingView");
                    throw null;
                }
            } else {
                h.k("viewAnimator");
                throw null;
            }
        } else if (lVar.b()) {
            ViewAnimator viewAnimator2 = initialLoadingFragment.p0;
            if (viewAnimator2 != null) {
                ViewGroup viewGroup2 = initialLoadingFragment.o0;
                if (viewGroup2 != null) {
                    viewAnimator2.setDisplayedChild(viewAnimator2.indexOfChild(viewGroup2));
                    ViewLoadingTracker viewLoadingTracker = initialLoadingFragment.m0;
                    if (viewLoadingTracker != null) {
                        viewLoadingTracker.j();
                        return;
                    }
                    return;
                }
                h.k("requestError");
                throw null;
            }
            h.k("viewAnimator");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final e O4() {
        return (e) this.j0.getValue();
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
        View findViewById = view.findViewById(C0707R.id.initial_loading_fragment);
        h.d(findViewById, "view.findViewById(R.id.initial_loading_fragment)");
        this.n0 = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(C0707R.id.view_animator);
        h.d(findViewById2, "view.findViewById(R.id.view_animator)");
        this.p0 = (ViewAnimator) findViewById2;
        View findViewById3 = view.findViewById(C0707R.id.glue_empty_state_button);
        h.d(findViewById3, "view.findViewById(R.id.glue_empty_state_button)");
        ViewGroup viewGroup = (ViewGroup) findViewById3;
        this.o0 = viewGroup;
        ((TextView) viewGroup.findViewById(16908308)).setText(C0707R.string.allboarding_request_error_title);
        ViewGroup viewGroup2 = this.o0;
        if (viewGroup2 != null) {
            ((TextView) viewGroup2.findViewById(16908309)).setText(C0707R.string.allboarding_request_error_message);
            ViewGroup viewGroup3 = this.o0;
            if (viewGroup3 != null) {
                ((TextView) viewGroup3.findViewById(C0707R.id.empty_view_button)).setText(C0707R.string.allboarding_request_error_dialog_retry);
                ViewGroup viewGroup4 = this.o0;
                if (viewGroup4 != null) {
                    viewGroup4.findViewById(C0707R.id.empty_view_button).setOnClickListener(new a(this));
                    if (bundle == null) {
                        O4().k(((c) this.h0.getValue()).a());
                    }
                    O4().l().h(b3(), new b(this));
                    O4().j().h(b3(), new c(this));
                    return;
                }
                h.k("requestError");
                throw null;
            }
            h.k("requestError");
            throw null;
        }
        h.k("requestError");
        throw null;
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
            String d = AllboardingPages.LOADING.d();
            Context l4 = l4();
            h.d(l4, "requireContext()");
            this.m0 = fre.a(w3, d, bundle, l4);
            return w3;
        }
        h.k("viewLoadingTrackerFactory");
        throw null;
    }
}
