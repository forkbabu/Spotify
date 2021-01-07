package com.spotify.libs.onboarding.allboarding.picker;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.l0;
import androidx.lifecycle.a0;
import androidx.lifecycle.v;
import androidx.navigation.m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.libs.onboarding.allboarding.flow.AllboardingPages;
import com.spotify.libs.onboarding.allboarding.picker.r;
import com.spotify.libs.onboarding.allboarding.picker.w;
import com.spotify.libs.onboarding.allboarding.room.AllboardingSearch;
import com.spotify.libs.onboarding.allboarding.room.y;
import com.spotify.libs.onboarding.allboarding.utils.GridRecyclerView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.search.view.l;
import com.squareup.picasso.Picasso;
import dagger.android.support.DaggerFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.j;

public final class PickerFragment extends DaggerFragment {
    private TextView A0;
    private ow0 B0;
    private final h C0 = new h(this);
    private final Map<String, AllboardingRvAdapter> D0 = new LinkedHashMap();
    private final androidx.navigation.e h0 = new androidx.navigation.e(j.b(m.class), new PickerFragment$$special$$inlined$navArgs$1(this));
    private com.spotify.libs.onboarding.allboarding.d i0 = new com.spotify.libs.onboarding.allboarding.d(true);
    public vl8 j0;
    public v k0;
    private ViewLoadingTracker l0;
    public fre m0;
    public Picasso n0;
    private final kotlin.d o0 = l0.a(this, j.b(u.class), new PickerFragment$$special$$inlined$viewModels$2(new PickerFragment$$special$$inlined$viewModels$1(this)), new PickerFragment$pickerViewModel$2(this));
    public rw0 p0;
    private Button q0;
    private Button r0;
    private GridRecyclerView s0;
    private ViewGroup t0;
    private ViewGroup u0;
    private ViewGroup v0;
    private ToolbarSearchFieldView w0;
    private ViewAnimator x0;
    private AppBarLayout y0;
    private TextView z0;

    public static abstract class a {
        private final int a;

        public a(int i) {
            this.a = i;
        }

        public final int a() {
            return this.a;
        }
    }

    static final class b<T> implements v<Boolean> {
        final /* synthetic */ PickerFragment a;

        b(PickerFragment pickerFragment) {
            this.a = pickerFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.v
        public void a(Boolean bool) {
            Boolean bool2 = bool;
            kotlin.jvm.internal.h.d(bool2, "skipped");
            if (bool2.booleanValue()) {
                this.a.j4().finish();
            }
        }
    }

    static final class c<T> implements v<com.spotify.libs.onboarding.allboarding.room.j> {
        final /* synthetic */ PickerFragment a;

        c(PickerFragment pickerFragment) {
            this.a = pickerFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.v
        public void a(com.spotify.libs.onboarding.allboarding.room.j jVar) {
            com.spotify.libs.onboarding.allboarding.room.j jVar2 = jVar;
            this.a.W4().c("searchResult");
            u V4 = this.a.V4();
            kotlin.jvm.internal.h.d(jVar2, "picker");
            V4.s(jVar2);
        }
    }

    public static final class d extends androidx.activity.b {
        final /* synthetic */ PickerFragment c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PickerFragment pickerFragment, boolean z) {
            super(z);
            this.c = pickerFragment;
        }

        @Override // androidx.activity.b
        public void b() {
            this.c.V4().u();
        }
    }

    public static final class e extends RecyclerView.q {
        final /* synthetic */ PickerFragment a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(PickerFragment pickerFragment) {
            this.a = pickerFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i) {
            kotlin.jvm.internal.h.e(recyclerView, "recyclerView");
            if (i != 0) {
                this.a.V4().A(w.a.b);
            }
        }
    }

    static final class f<T> implements v<y> {
        final /* synthetic */ PickerFragment a;

        f(PickerFragment pickerFragment) {
            this.a = pickerFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.v
        public void a(y yVar) {
            y yVar2 = yVar;
            PickerFragment pickerFragment = this.a;
            kotlin.jvm.internal.h.d(yVar2, "it");
            PickerFragment.S4(pickerFragment, yVar2);
        }
    }

    static final class g<T> implements v<com.spotify.libs.onboarding.allboarding.a<r>> {
        final /* synthetic */ PickerFragment a;

        g(PickerFragment pickerFragment) {
            this.a = pickerFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.v
        public void a(com.spotify.libs.onboarding.allboarding.a<r> aVar) {
            com.spotify.libs.onboarding.allboarding.a<r> aVar2 = aVar;
            m f = com.spotify.libs.onboarding.allboarding.c.e(this.a).f();
            if (f == null || f.k() != C0707R.id.pickerFragment) {
                Assertion.g("Cannot execute actions in PickerFragment when navigation is elsewhere");
                return;
            }
            r a2 = aVar2.a();
            if (a2 == null) {
                return;
            }
            if (a2 instanceof r.c) {
                String a3 = PickerFragment.L4(this.a).a();
                long a4 = ((r.c) a2).a();
                kotlin.jvm.internal.h.e(a3, "onboardingSessionId");
                com.spotify.libs.onboarding.allboarding.c.e(this.a).j(new n(a3, a4));
            } else if (a2 instanceof r.b) {
                String a5 = ((r.b) a2).a();
                String a6 = PickerFragment.L4(this.a).a();
                kotlin.jvm.internal.h.e(a5, "loadingText");
                kotlin.jvm.internal.h.e(a6, "onboardingSessionId");
                com.spotify.libs.onboarding.allboarding.c.e(this.a).j(new p(a5, a6));
            } else if (kotlin.jvm.internal.h.a(a2, r.a.a)) {
                this.a.j4().finish();
            } else if (a2 instanceof r.d) {
                com.spotify.libs.onboarding.allboarding.c.e(this.a).j(new o(((r.d) a2).a()));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final class h implements l.b {
        private AllboardingSearch a;
        final /* synthetic */ PickerFragment b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(PickerFragment pickerFragment) {
            this.b = pickerFragment;
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public void L(boolean z) {
            if (z) {
                vl8 vl8 = this.b.j0;
                if (vl8 != null) {
                    vl8.e();
                    this.b.U4().f();
                    AllboardingSearch allboardingSearch = this.a;
                    if (allboardingSearch != null) {
                        String a2 = PickerFragment.L4(this.b).a();
                        kotlin.jvm.internal.h.e(allboardingSearch, "searchConfig");
                        kotlin.jvm.internal.h.e(a2, "sessionId");
                        com.spotify.libs.onboarding.allboarding.c.e(this.b).j(new q(allboardingSearch, a2));
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.h.k("artistPickerLogger");
                throw null;
            }
        }

        public final void a(AllboardingSearch allboardingSearch) {
            this.a = allboardingSearch;
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public /* synthetic */ void f(String str) {
            com.spotify.music.libs.search.view.m.c(this, str);
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public /* synthetic */ void n() {
            com.spotify.music.libs.search.view.m.a(this);
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public void r(String str) {
            kotlin.jvm.internal.h.e(str, "newQuery");
        }
    }

    public PickerFragment() {
        super(C0707R.layout.picker_view);
    }

    public static final m L4(PickerFragment pickerFragment) {
        return (m) pickerFragment.h0.getValue();
    }

    public static final /* synthetic */ TextView M4(PickerFragment pickerFragment) {
        TextView textView = pickerFragment.A0;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.h.k("pickerToolbarTitle");
        throw null;
    }

    public static final /* synthetic */ GridRecyclerView O4(PickerFragment pickerFragment) {
        GridRecyclerView gridRecyclerView = pickerFragment.s0;
        if (gridRecyclerView != null) {
            return gridRecyclerView;
        }
        kotlin.jvm.internal.h.k("recyclerView");
        throw null;
    }

    public static final void R4(PickerFragment pickerFragment, String str) {
        w o = pickerFragment.V4().o();
        if (o != null && (o instanceof w.c)) {
            w.c cVar = (w.c) o;
            if (!(!kotlin.jvm.internal.h.a(cVar.b(), str))) {
                pickerFragment.V4().A(null);
                int f0 = pickerFragment.i0.f0(cVar.b().hashCode());
                if (f0 < 0) {
                    f0 = 0;
                }
                int a2 = o.a() + f0;
                Logger.b(je.p0("Scrolling to pos ", a2), new Object[0]);
                GridRecyclerView gridRecyclerView = pickerFragment.s0;
                if (gridRecyclerView != null) {
                    gridRecyclerView.getLayoutManager().t2(a2, 0);
                } else {
                    kotlin.jvm.internal.h.k("recyclerView");
                    throw null;
                }
            }
        }
    }

    public static final void S4(PickerFragment pickerFragment, y yVar) {
        c b2;
        androidx.fragment.app.c j4 = pickerFragment.j4();
        kotlin.jvm.internal.h.d(j4, "requireActivity()");
        j4.setTitle(yVar.f());
        TextView textView = pickerFragment.A0;
        if (textView != null) {
            textView.setText(yVar.f());
            TextView textView2 = pickerFragment.z0;
            if (textView2 != null) {
                textView2.setText(yVar.f());
                Button button = pickerFragment.q0;
                if (button != null) {
                    if (!(button.getVisibility() == 0) && (b2 = yVar.b()) != null && b2.c()) {
                        vl8 vl8 = pickerFragment.j0;
                        if (vl8 != null) {
                            vl8.d();
                        } else {
                            kotlin.jvm.internal.h.k("artistPickerLogger");
                            throw null;
                        }
                    }
                    Button button2 = pickerFragment.q0;
                    if (button2 != null) {
                        c b3 = yVar.b();
                        int i = 8;
                        button2.setVisibility(b3 != null && b3.c() ? 0 : 8);
                        c b4 = yVar.b();
                        if (b4 != null) {
                            Button button3 = pickerFragment.q0;
                            if (button3 != null) {
                                button3.setText(b4.a());
                                Button button4 = pickerFragment.q0;
                                if (button4 != null) {
                                    button4.setOnClickListener(new a(0, b4, pickerFragment));
                                    ViewGroup viewGroup = pickerFragment.u0;
                                    if (viewGroup != null) {
                                        viewGroup.findViewById(C0707R.id.empty_view_button).setOnClickListener(new a(1, b4, pickerFragment));
                                    } else {
                                        kotlin.jvm.internal.h.k("requestError");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.h.k("actionButton");
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.h.k("actionButton");
                                throw null;
                            }
                        }
                        Button button5 = pickerFragment.r0;
                        if (button5 != null) {
                            c d2 = yVar.d();
                            button5.setVisibility(d2 != null && d2.c() ? 0 : 8);
                            c d3 = yVar.d();
                            if (d3 != null) {
                                Button button6 = pickerFragment.r0;
                                if (button6 != null) {
                                    button6.setText(d3.a());
                                    Button button7 = pickerFragment.r0;
                                    if (button7 != null) {
                                        button7.setOnClickListener(new a(2, d3, pickerFragment));
                                    } else {
                                        kotlin.jvm.internal.h.k("secondaryActionButton");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.h.k("secondaryActionButton");
                                    throw null;
                                }
                            }
                            if (yVar.c() != null) {
                                rw0 rw0 = pickerFragment.p0;
                                if (rw0 != null) {
                                    rw0.e();
                                    ToolbarSearchFieldView toolbarSearchFieldView = pickerFragment.w0;
                                    if (toolbarSearchFieldView != null) {
                                        Button searchPlaceHolder = toolbarSearchFieldView.getSearchPlaceHolder();
                                        kotlin.jvm.internal.h.d(searchPlaceHolder, "searchToolbar.searchPlaceHolder");
                                        searchPlaceHolder.setText(yVar.c().getPlaceholder());
                                    } else {
                                        kotlin.jvm.internal.h.k("searchToolbar");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.h.k("pickerLogger");
                                    throw null;
                                }
                            }
                            ToolbarSearchFieldView toolbarSearchFieldView2 = pickerFragment.w0;
                            if (toolbarSearchFieldView2 != null) {
                                if (yVar.c() != null) {
                                    i = 0;
                                }
                                toolbarSearchFieldView2.setVisibility(i);
                                pickerFragment.C0.a(yVar.c());
                                if (yVar.g()) {
                                    ViewAnimator viewAnimator = pickerFragment.x0;
                                    if (viewAnimator != null) {
                                        ViewGroup viewGroup2 = pickerFragment.t0;
                                        if (viewGroup2 != null) {
                                            viewAnimator.setDisplayedChild(viewAnimator.indexOfChild(viewGroup2));
                                        } else {
                                            kotlin.jvm.internal.h.k("loadingView");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.h.k("viewAnimator");
                                        throw null;
                                    }
                                } else if (yVar.a()) {
                                    ViewAnimator viewAnimator2 = pickerFragment.x0;
                                    if (viewAnimator2 != null) {
                                        ViewGroup viewGroup3 = pickerFragment.u0;
                                        if (viewGroup3 != null) {
                                            viewAnimator2.setDisplayedChild(viewAnimator2.indexOfChild(viewGroup3));
                                            vl8 vl82 = pickerFragment.j0;
                                            if (vl82 != null) {
                                                vl82.i();
                                                ViewLoadingTracker viewLoadingTracker = pickerFragment.l0;
                                                if (viewLoadingTracker != null) {
                                                    viewLoadingTracker.j();
                                                }
                                            } else {
                                                kotlin.jvm.internal.h.k("artistPickerLogger");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.h.k("requestError");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.h.k("viewAnimator");
                                        throw null;
                                    }
                                } else {
                                    ViewAnimator viewAnimator3 = pickerFragment.x0;
                                    if (viewAnimator3 != null) {
                                        ViewGroup viewGroup4 = pickerFragment.v0;
                                        if (viewGroup4 != null) {
                                            viewAnimator3.setDisplayedChild(viewAnimator3.indexOfChild(viewGroup4));
                                        } else {
                                            kotlin.jvm.internal.h.k("pickerView");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.h.k("viewAnimator");
                                        throw null;
                                    }
                                }
                                List<com.spotify.libs.onboarding.allboarding.room.v> e2 = yVar.e();
                                Logger.b("sections -> " + e2, new Object[0]);
                                if (!e2.isEmpty()) {
                                    if (e2.size() != pickerFragment.i0.c0().size()) {
                                        pickerFragment.D0.clear();
                                        pickerFragment.i0 = new com.spotify.libs.onboarding.allboarding.d(true);
                                        GridRecyclerView gridRecyclerView = pickerFragment.s0;
                                        if (gridRecyclerView != null) {
                                            gridRecyclerView.setAdapter(null);
                                        } else {
                                            kotlin.jvm.internal.h.k("recyclerView");
                                            throw null;
                                        }
                                    }
                                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                                    ref$IntRef.element = 0;
                                    for (T t : e2) {
                                        g gVar = new g(t, ref$IntRef.element, pickerFragment, ref$IntRef);
                                        if (!kotlin.jvm.internal.h.a(t.a(), "title")) {
                                            ref$IntRef.element++;
                                        }
                                        String a2 = t.a();
                                        switch (a2.hashCode()) {
                                            case -1409097913:
                                                if (a2.equals("artist") && !pickerFragment.i0.g0(t.c().hashCode())) {
                                                    Picasso picasso = pickerFragment.n0;
                                                    if (picasso != null) {
                                                        AllboardingRvAdapter allboardingRvAdapter = new AllboardingRvAdapter(picasso, new PickerFragment$renderSections$$inlined$forEach$lambda$8(pickerFragment, ref$IntRef), new PickerFragment$renderSections$$inlined$forEach$lambda$9(gVar));
                                                        pickerFragment.D0.put(t.c(), allboardingRvAdapter);
                                                        pickerFragment.i0.Z(allboardingRvAdapter, t.c().hashCode());
                                                        rw0 rw02 = pickerFragment.p0;
                                                        if (rw02 != null) {
                                                            rw02.l(ref$IntRef.element);
                                                            pickerFragment.V4().p(t.c()).h(pickerFragment, new f(allboardingRvAdapter, t, pickerFragment, ref$IntRef));
                                                            break;
                                                        } else {
                                                            kotlin.jvm.internal.h.k("pickerLogger");
                                                            throw null;
                                                        }
                                                    } else {
                                                        kotlin.jvm.internal.h.k("picasso");
                                                        throw null;
                                                    }
                                                }
                                            case -1396342996:
                                                if (a2.equals("banner") && !pickerFragment.i0.g0(t.c().hashCode())) {
                                                    Picasso picasso2 = pickerFragment.n0;
                                                    if (picasso2 != null) {
                                                        AllboardingRvAdapter allboardingRvAdapter2 = new AllboardingRvAdapter(picasso2, new PickerFragment$renderSections$$inlined$forEach$lambda$2(pickerFragment, ref$IntRef), new PickerFragment$renderSections$$inlined$forEach$lambda$3(gVar));
                                                        pickerFragment.D0.put(t.c(), allboardingRvAdapter2);
                                                        pickerFragment.i0.Z(allboardingRvAdapter2, t.c().hashCode());
                                                        rw0 rw03 = pickerFragment.p0;
                                                        if (rw03 != null) {
                                                            rw03.b(ref$IntRef.element);
                                                            pickerFragment.V4().p(t.c()).h(pickerFragment, new i(allboardingRvAdapter2, t, pickerFragment, ref$IntRef));
                                                            break;
                                                        } else {
                                                            kotlin.jvm.internal.h.k("pickerLogger");
                                                            throw null;
                                                        }
                                                    } else {
                                                        kotlin.jvm.internal.h.k("picasso");
                                                        throw null;
                                                    }
                                                }
                                            case 3529469:
                                                if (a2.equals("show") && !pickerFragment.i0.g0(t.c().hashCode())) {
                                                    Picasso picasso3 = pickerFragment.n0;
                                                    if (picasso3 != null) {
                                                        AllboardingRvAdapter allboardingRvAdapter3 = new AllboardingRvAdapter(picasso3, new PickerFragment$renderSections$$inlined$forEach$lambda$5(pickerFragment, ref$IntRef), new PickerFragment$renderSections$$inlined$forEach$lambda$6(gVar));
                                                        pickerFragment.D0.put(t.c(), allboardingRvAdapter3);
                                                        pickerFragment.i0.Z(allboardingRvAdapter3, t.c().hashCode());
                                                        rw0 rw04 = pickerFragment.p0;
                                                        if (rw04 != null) {
                                                            rw04.l(ref$IntRef.element);
                                                            pickerFragment.V4().p(t.c()).h(pickerFragment, new k(allboardingRvAdapter3, t, pickerFragment, ref$IntRef));
                                                            break;
                                                        } else {
                                                            kotlin.jvm.internal.h.k("pickerLogger");
                                                            throw null;
                                                        }
                                                    } else {
                                                        kotlin.jvm.internal.h.k("picasso");
                                                        throw null;
                                                    }
                                                }
                                            case 110371416:
                                                if (a2.equals("title") && !pickerFragment.i0.g0(t.c().hashCode())) {
                                                    Picasso picasso4 = pickerFragment.n0;
                                                    if (picasso4 != null) {
                                                        AllboardingRvAdapter allboardingRvAdapter4 = new AllboardingRvAdapter(picasso4, null, null);
                                                        y yVar2 = new y(t.f(), t.e());
                                                        allboardingRvAdapter4.b0(kotlin.collections.d.t(new com.spotify.libs.onboarding.allboarding.room.j(String.valueOf(yVar2.hashCode()), "", null, yVar2, null, null, null, null, null, null, null, null, 4084)));
                                                        pickerFragment.i0.Z(allboardingRvAdapter4, t.c().hashCode());
                                                        break;
                                                    } else {
                                                        kotlin.jvm.internal.h.k("picasso");
                                                        throw null;
                                                    }
                                                }
                                        }
                                    }
                                    pickerFragment.T4();
                                    return;
                                }
                                return;
                            }
                            kotlin.jvm.internal.h.k("searchToolbar");
                            throw null;
                        }
                        kotlin.jvm.internal.h.k("secondaryActionButton");
                        throw null;
                    }
                    kotlin.jvm.internal.h.k("actionButton");
                    throw null;
                }
                kotlin.jvm.internal.h.k("actionButton");
                throw null;
            }
            kotlin.jvm.internal.h.k("pickerTitle");
            throw null;
        }
        kotlin.jvm.internal.h.k("pickerToolbarTitle");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void T4() {
        Map<String, AllboardingRvAdapter> map = this.D0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, AllboardingRvAdapter> entry : map.entrySet()) {
            if (entry.getValue().u() == 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            GridRecyclerView gridRecyclerView = this.s0;
            if (gridRecyclerView == null) {
                kotlin.jvm.internal.h.k("recyclerView");
                throw null;
            } else if (gridRecyclerView.getAdapter() == null) {
                GridRecyclerView gridRecyclerView2 = this.s0;
                if (gridRecyclerView2 != null) {
                    gridRecyclerView2.setAdapter(this.i0);
                    ViewLoadingTracker viewLoadingTracker = this.l0;
                    if (viewLoadingTracker != null) {
                        viewLoadingTracker.g();
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.h.k("recyclerView");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final u V4() {
        return (u) this.o0.getValue();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final a0 W4() {
        androidx.navigation.h e2 = com.spotify.libs.onboarding.allboarding.c.e(this).e(C0707R.id.pickerFragment);
        kotlin.jvm.internal.h.d(e2, "findNavController()\n    …ntry(R.id.pickerFragment)");
        a0 d2 = e2.d();
        kotlin.jvm.internal.h.d(d2, "findNavController()\n    …        .savedStateHandle");
        return d2;
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        kotlin.jvm.internal.h.e(bundle, "outState");
        ViewLoadingTracker viewLoadingTracker = this.l0;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.t(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        ow0 ow0 = this.B0;
        if (ow0 != null) {
            ow0.g(this.C0);
        } else {
            kotlin.jvm.internal.h.k("searchField");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        ow0 ow0 = this.B0;
        if (ow0 != null) {
            ow0.q(this.C0);
        } else {
            kotlin.jvm.internal.h.k("searchField");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        kotlin.jvm.internal.h.e(view, "view");
        Context l4 = l4();
        kotlin.jvm.internal.h.d(l4, "requireContext()");
        com.spotify.libs.onboarding.allboarding.c.f(l4, view);
        W4().b("skipDialogResult").h(b3(), new b(this));
        W4().b("searchResult").h(b3(), new c(this));
        androidx.fragment.app.c j4 = j4();
        kotlin.jvm.internal.h.d(j4, "requireActivity()");
        j4.S0().b(b3(), new d(this, true));
        View findViewById = view.findViewById(C0707R.id.view_animator);
        kotlin.jvm.internal.h.d(findViewById, "view.findViewById(R.id.view_animator)");
        this.x0 = (ViewAnimator) findViewById;
        View findViewById2 = view.findViewById(C0707R.id.posting_view);
        kotlin.jvm.internal.h.d(findViewById2, "view.findViewById(R.id.posting_view)");
        this.t0 = (ViewGroup) findViewById2;
        View findViewById3 = view.findViewById(C0707R.id.glue_empty_state_button);
        kotlin.jvm.internal.h.d(findViewById3, "view.findViewById(R.id.glue_empty_state_button)");
        ViewGroup viewGroup = (ViewGroup) findViewById3;
        this.u0 = viewGroup;
        if (viewGroup != null) {
            ((TextView) viewGroup.findViewById(16908308)).setText(C0707R.string.allboarding_request_error_title);
            ViewGroup viewGroup2 = this.u0;
            if (viewGroup2 != null) {
                ((TextView) viewGroup2.findViewById(16908309)).setText(C0707R.string.allboarding_request_error_message);
                ViewGroup viewGroup3 = this.u0;
                if (viewGroup3 != null) {
                    ((TextView) viewGroup3.findViewById(C0707R.id.empty_view_button)).setText(C0707R.string.allboarding_request_error_dialog_retry);
                    View findViewById4 = view.findViewById(C0707R.id.pickerView);
                    kotlin.jvm.internal.h.d(findViewById4, "view.findViewById(R.id.pickerView)");
                    this.v0 = (ViewGroup) findViewById4;
                    View findViewById5 = view.findViewById(C0707R.id.search_toolbar);
                    kotlin.jvm.internal.h.d(findViewById5, "view.findViewById(R.id.search_toolbar)");
                    this.w0 = (ToolbarSearchFieldView) findViewById5;
                    Context l42 = l4();
                    kotlin.jvm.internal.h.d(l42, "requireContext()");
                    ToolbarSearchFieldView toolbarSearchFieldView = this.w0;
                    if (toolbarSearchFieldView != null) {
                        this.B0 = new ow0(l42, toolbarSearchFieldView, true);
                        View findViewById6 = view.findViewById(C0707R.id.actionButton);
                        kotlin.jvm.internal.h.d(findViewById6, "view.findViewById(R.id.actionButton)");
                        this.q0 = (Button) findViewById6;
                        View findViewById7 = view.findViewById(C0707R.id.secondaryActionButton);
                        kotlin.jvm.internal.h.d(findViewById7, "view.findViewById(R.id.secondaryActionButton)");
                        this.r0 = (Button) findViewById7;
                        View findViewById8 = view.findViewById(C0707R.id.pickerAppBar);
                        kotlin.jvm.internal.h.d(findViewById8, "view.findViewById(R.id.pickerAppBar)");
                        this.y0 = (AppBarLayout) findViewById8;
                        View findViewById9 = view.findViewById(C0707R.id.pickerToolbar);
                        kotlin.jvm.internal.h.d(findViewById9, "view.findViewById(R.id.pickerToolbar)");
                        Toolbar toolbar = (Toolbar) findViewById9;
                        View findViewById10 = view.findViewById(C0707R.id.pickerCollapsingToolbar);
                        kotlin.jvm.internal.h.d(findViewById10, "view.findViewById(R.id.pickerCollapsingToolbar)");
                        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById10;
                        View findViewById11 = view.findViewById(C0707R.id.pickerTitle);
                        kotlin.jvm.internal.h.d(findViewById11, "view.findViewById(R.id.pickerTitle)");
                        this.z0 = (TextView) findViewById11;
                        View findViewById12 = view.findViewById(C0707R.id.pickerToolbarTitle);
                        kotlin.jvm.internal.h.d(findViewById12, "view.findViewById(R.id.pickerToolbarTitle)");
                        this.A0 = (TextView) findViewById12;
                        AppBarLayout appBarLayout = this.y0;
                        if (appBarLayout != null) {
                            appBarLayout.a(new l(this));
                            View findViewById13 = view.findViewById(C0707R.id.picker_recycler_view);
                            kotlin.jvm.internal.h.d(findViewById13, "view.findViewById(R.id.picker_recycler_view)");
                            this.s0 = (GridRecyclerView) findViewById13;
                            if (!V4().t()) {
                                V4().y(true);
                            } else {
                                GridRecyclerView gridRecyclerView = this.s0;
                                if (gridRecyclerView != null) {
                                    gridRecyclerView.setLayoutAnimation(null);
                                } else {
                                    kotlin.jvm.internal.h.k("recyclerView");
                                    throw null;
                                }
                            }
                            GridRecyclerView gridRecyclerView2 = this.s0;
                            if (gridRecyclerView2 != null) {
                                gridRecyclerView2.n(new e(this));
                                V4().r().h(b3(), new f(this));
                                V4().q().h(b3(), new g(this));
                                return;
                            }
                            kotlin.jvm.internal.h.k("recyclerView");
                            throw null;
                        }
                        kotlin.jvm.internal.h.k("pickerAppBar");
                        throw null;
                    }
                    kotlin.jvm.internal.h.k("searchToolbar");
                    throw null;
                }
                kotlin.jvm.internal.h.k("requestError");
                throw null;
            }
            kotlin.jvm.internal.h.k("requestError");
            throw null;
        }
        kotlin.jvm.internal.h.k("requestError");
        throw null;
    }

    public final rw0 U4() {
        rw0 rw0 = this.p0;
        if (rw0 != null) {
            return rw0;
        }
        kotlin.jvm.internal.h.k("pickerLogger");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        View w3 = super.w3(layoutInflater, viewGroup, bundle);
        if (w3 == null) {
            return null;
        }
        fre fre = this.m0;
        if (fre != null) {
            kotlin.jvm.internal.h.d(w3, "it");
            String d2 = AllboardingPages.PICKER.d();
            Context l4 = l4();
            kotlin.jvm.internal.h.d(l4, "requireContext()");
            this.l0 = fre.a(w3, d2, bundle, l4);
            return w3;
        }
        kotlin.jvm.internal.h.k("viewLoadingTrackerFactory");
        throw null;
    }
}
