package com.spotify.libs.onboarding.allboarding.search;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.v;
import androidx.navigation.e;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.libs.onboarding.allboarding.flow.AllboardingPages;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.search.view.l;
import com.spotify.music.libs.search.view.m;
import com.squareup.picasso.Picasso;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

public final class SearchFragment extends DaggerFragment {
    private final e h0 = new e(j.b(c.class), new SearchFragment$$special$$inlined$navArgs$1(this));
    public iw0 i0;
    public sw0 j0;
    public lp8 k0;
    public fre l0;
    private ViewLoadingTracker m0;
    public Picasso n0;
    private e o0;
    private RecyclerView p0;
    private a q0;
    private ViewGroup r0;
    private TextView s0;
    private TextView t0;
    private Button u0;
    private ow0 v0;
    private final d w0 = new d(this);

    static final class a implements View.OnClickListener {
        final /* synthetic */ SearchFragment a;

        a(SearchFragment searchFragment) {
            this.a = searchFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SearchFragment.L4(this.a).j();
        }
    }

    static final class b implements l.c {
        final /* synthetic */ SearchFragment a;

        b(SearchFragment searchFragment) {
            this.a = searchFragment;
        }

        @Override // com.spotify.music.libs.search.view.l.c
        public final boolean B1() {
            this.a.S4().c();
            this.a.R4().e(null);
            return com.spotify.libs.onboarding.allboarding.c.e(this.a).k();
        }
    }

    static final class c<T> implements v<f> {
        final /* synthetic */ SearchFragment a;

        c(SearchFragment searchFragment) {
            this.a = searchFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: com.spotify.libs.onboarding.allboarding.search.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.v
        public void a(f fVar) {
            f fVar2 = fVar;
            if (kotlin.text.e.n(fVar2.c())) {
                SearchFragment.M4(this.a);
            } else if (fVar2.b()) {
                SearchFragment.P4(this.a);
            } else if (fVar2.d().isEmpty()) {
                SearchFragment.N4(this.a, fVar2.c());
            } else {
                SearchFragment.K4(this.a).b0(fVar2.d());
                this.a.T4(false);
                SearchFragment.V4(this.a, false, 1);
            }
        }
    }

    public static final class d implements l.b {
        final /* synthetic */ SearchFragment a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(SearchFragment searchFragment) {
            this.a = searchFragment;
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public /* synthetic */ void L(boolean z) {
            m.b(this, z);
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public /* synthetic */ void f(String str) {
            m.c(this, str);
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public void n() {
            this.a.R4().d(null);
            this.a.S4().h();
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public void r(String str) {
            h.e(str, "newQuery");
            SearchFragment.L4(this.a).h(str);
        }
    }

    public SearchFragment() {
        super(C0707R.layout.search_view);
    }

    public static final /* synthetic */ a K4(SearchFragment searchFragment) {
        a aVar = searchFragment.q0;
        if (aVar != null) {
            return aVar;
        }
        h.k("rvAdapter");
        throw null;
    }

    public static final /* synthetic */ e L4(SearchFragment searchFragment) {
        e eVar = searchFragment.o0;
        if (eVar != null) {
            return eVar;
        }
        h.k("searchViewModel");
        throw null;
    }

    public static final void M4(SearchFragment searchFragment) {
        TextView textView = searchFragment.s0;
        if (textView != null) {
            textView.setText(searchFragment.Q4().a().getInitialText());
            TextView textView2 = searchFragment.t0;
            if (textView2 != null) {
                textView2.setText("");
                Button button = searchFragment.u0;
                if (button != null) {
                    button.setVisibility(8);
                    searchFragment.T4(true);
                    searchFragment.U4(false);
                    return;
                }
                h.k("emptyStateBtn");
                throw null;
            }
            h.k("emptyStateSubtitle");
            throw null;
        }
        h.k("emptyStateTitle");
        throw null;
    }

    public static final void N4(SearchFragment searchFragment, String str) {
        sw0 sw0 = searchFragment.j0;
        if (sw0 != null) {
            sw0.g();
            TextView textView = searchFragment.s0;
            if (textView != null) {
                textView.setText(searchFragment.W2(C0707R.string.allboarding_search_empty_state_no_result_title, str));
                TextView textView2 = searchFragment.t0;
                if (textView2 != null) {
                    textView2.setText(searchFragment.V2(C0707R.string.allboarding_search_empty_state_no_result_body));
                    Button button = searchFragment.u0;
                    if (button != null) {
                        button.setVisibility(8);
                        searchFragment.T4(true);
                        searchFragment.U4(false);
                        return;
                    }
                    h.k("emptyStateBtn");
                    throw null;
                }
                h.k("emptyStateSubtitle");
                throw null;
            }
            h.k("emptyStateTitle");
            throw null;
        }
        h.k("searchLogger");
        throw null;
    }

    public static final void P4(SearchFragment searchFragment) {
        TextView textView = searchFragment.s0;
        if (textView != null) {
            textView.setText(C0707R.string.allboarding_request_error_title);
            TextView textView2 = searchFragment.t0;
            if (textView2 != null) {
                textView2.setText(C0707R.string.allboarding_request_error_message);
                Button button = searchFragment.u0;
                if (button != null) {
                    button.setText(C0707R.string.allboarding_request_error_dialog_retry);
                    Button button2 = searchFragment.u0;
                    if (button2 != null) {
                        button2.setVisibility(0);
                        searchFragment.T4(true);
                        searchFragment.U4(false);
                        return;
                    }
                    h.k("emptyStateBtn");
                    throw null;
                }
                h.k("emptyStateBtn");
                throw null;
            }
            h.k("emptyStateSubtitle");
            throw null;
        }
        h.k("emptyStateTitle");
        throw null;
    }

    private final c Q4() {
        return (c) this.h0.getValue();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void T4(boolean z) {
        ViewGroup viewGroup = this.r0;
        if (viewGroup != null) {
            viewGroup.setVisibility(z ? 0 : 8);
        } else {
            h.k("emptyState");
            throw null;
        }
    }

    private final void U4(boolean z) {
        sw0 sw0 = this.j0;
        if (sw0 != null) {
            sw0.i();
            RecyclerView recyclerView = this.p0;
            if (recyclerView != null) {
                recyclerView.setVisibility(z ? 0 : 8);
            } else {
                h.k("searchRecyclerView");
                throw null;
            }
        } else {
            h.k("searchLogger");
            throw null;
        }
    }

    static /* synthetic */ void V4(SearchFragment searchFragment, boolean z, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        searchFragment.U4(z);
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
    public void O3() {
        super.O3();
        ow0 ow0 = this.v0;
        if (ow0 != null) {
            ow0.g(this.w0);
            ow0 ow02 = this.v0;
            if (ow02 != null) {
                ow02.l(250);
            } else {
                h.k("searchField");
                throw null;
            }
        } else {
            h.k("searchField");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        ow0 ow0 = this.v0;
        if (ow0 != null) {
            ow0.q(this.w0);
            Context l4 = l4();
            h.d(l4, "requireContext()");
            View m4 = m4();
            h.d(m4, "requireView()");
            com.spotify.libs.onboarding.allboarding.c.f(l4, m4);
            return;
        }
        h.k("searchField");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        h.e(view, "view");
        iw0 iw0 = this.i0;
        if (iw0 != null) {
            e0 a2 = new g0(Z(), new d(iw0, Q4().a().getUrl(), Q4().b())).a(e.class);
            h.d(a2, "ViewModelProvider(\n     …rchViewModel::class.java)");
            this.o0 = (e) a2;
            sw0 sw0 = this.j0;
            if (sw0 != null) {
                sw0.d();
                View findViewById = view.findViewById(C0707R.id.glue_empty_state_button);
                Context l4 = l4();
                h.d(l4, "requireContext()");
                h.e(l4, "$this$getColorCompat");
                ((ViewGroup) findViewById).setBackgroundColor(androidx.core.content.a.b(l4, C0707R.color.allboarding_stockholm_black_bg));
                h.d(findViewById, "view.findViewById<ViewGr…)\n            )\n        }");
                ViewGroup viewGroup = (ViewGroup) findViewById;
                this.r0 = viewGroup;
                if (viewGroup != null) {
                    View findViewById2 = viewGroup.findViewById(16908308);
                    h.d(findViewById2, "emptyState.findViewById(android.R.id.text1)");
                    this.s0 = (TextView) findViewById2;
                    ViewGroup viewGroup2 = this.r0;
                    if (viewGroup2 != null) {
                        View findViewById3 = viewGroup2.findViewById(16908309);
                        h.d(findViewById3, "emptyState.findViewById(android.R.id.text2)");
                        this.t0 = (TextView) findViewById3;
                        ViewGroup viewGroup3 = this.r0;
                        if (viewGroup3 != null) {
                            View findViewById4 = viewGroup3.findViewById(C0707R.id.empty_view_button);
                            h.d(findViewById4, "emptyState.findViewById(…e.R.id.empty_view_button)");
                            Button button = (Button) findViewById4;
                            this.u0 = button;
                            if (button != null) {
                                button.setOnClickListener(new a(this));
                                ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) view.findViewById(C0707R.id.search_toolbar);
                                Context l42 = l4();
                                h.d(l42, "requireContext()");
                                h.d(toolbarSearchFieldView, "searchFieldView");
                                this.v0 = new ow0(l42, toolbarSearchFieldView, true);
                                Button searchPlaceHolder = toolbarSearchFieldView.getSearchPlaceHolder();
                                h.d(searchPlaceHolder, "searchFieldView.searchPlaceHolder");
                                searchPlaceHolder.setText(Q4().a().getPlaceholder());
                                ow0 ow0 = this.v0;
                                if (ow0 != null) {
                                    ow0.y();
                                    ow0 ow02 = this.v0;
                                    if (ow02 != null) {
                                        ow02.u(new b(this));
                                        ow0 ow03 = this.v0;
                                        if (ow03 != null) {
                                            ow03.m();
                                            Picasso picasso = this.n0;
                                            if (picasso != null) {
                                                this.q0 = new a(picasso, new SearchFragment$onViewCreated$4(this), new SearchFragment$onViewCreated$5(this));
                                                View findViewById5 = view.findViewById(C0707R.id.search_rv);
                                                h.d(findViewById5, "view.findViewById(R.id.search_rv)");
                                                RecyclerView recyclerView = (RecyclerView) findViewById5;
                                                this.p0 = recyclerView;
                                                if (recyclerView != null) {
                                                    a aVar = this.q0;
                                                    if (aVar != null) {
                                                        recyclerView.setAdapter(aVar);
                                                        e eVar = this.o0;
                                                        if (eVar != null) {
                                                            eVar.i().h(b3(), new c(this));
                                                            ViewLoadingTracker viewLoadingTracker = this.m0;
                                                            if (viewLoadingTracker != null) {
                                                                viewLoadingTracker.g();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        h.k("searchViewModel");
                                                        throw null;
                                                    }
                                                    h.k("rvAdapter");
                                                    throw null;
                                                }
                                                h.k("searchRecyclerView");
                                                throw null;
                                            }
                                            h.k("picasso");
                                            throw null;
                                        }
                                        h.k("searchField");
                                        throw null;
                                    }
                                    h.k("searchField");
                                    throw null;
                                }
                                h.k("searchField");
                                throw null;
                            }
                            h.k("emptyStateBtn");
                            throw null;
                        }
                        h.k("emptyState");
                        throw null;
                    }
                    h.k("emptyState");
                    throw null;
                }
                h.k("emptyState");
                throw null;
            }
            h.k("searchLogger");
            throw null;
        }
        h.k("allboardingProvider");
        throw null;
    }

    public final lp8 R4() {
        lp8 lp8 = this.k0;
        if (lp8 != null) {
            return lp8;
        }
        h.k("artistSearchLogger");
        throw null;
    }

    public final sw0 S4() {
        sw0 sw0 = this.j0;
        if (sw0 != null) {
            return sw0;
        }
        h.k("searchLogger");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            C4(TransitionInflater.from(l4()).inflateTransition(17760257));
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
            String d2 = AllboardingPages.SEARCH.d();
            Context l4 = l4();
            h.d(l4, "requireContext()");
            this.m0 = fre.a(w3, d2, bundle, l4);
            return w3;
        }
        h.k("viewLoadingTrackerFactory");
        throw null;
    }
}
