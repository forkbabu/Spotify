package com.spotify.music.carmode.navigation.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.StateSet;
import android.view.View;
import android.widget.ImageButton;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.mobile.android.spotlets.tooltip.a;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.carmode.navigation.domain.CarModeNavigationModel;
import com.spotify.music.carmode.navigation.domain.p;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.d0;

public class CarModeNavigationViews implements g<CarModeNavigationModel, p>, h, m {
    private static final int[] v = {16842914};
    private final ImageButton a;
    private final ImageButton b;
    private final ImageButton c;
    private final ImageButton f;
    private final PulsatingView n;
    private final ere o;
    private final d0 p;
    private final tn2 q;
    private final n r;
    private final Context s;
    private da2<p> t;
    private boolean u;

    class a implements h<CarModeNavigationModel> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            CarModeNavigationViews.a(CarModeNavigationViews.this, (CarModeNavigationModel) obj);
            CarModeNavigationViews.this.r.A().a(CarModeNavigationViews.this);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            CarModeNavigationViews.this.r.A().c(CarModeNavigationViews.this);
            CarModeNavigationViews.this.t = null;
        }
    }

    public CarModeNavigationViews(Context context, CarModeNavigationLayout carModeNavigationLayout, ere ere, d0 d0Var, tn2 tn2, n nVar) {
        this.s = context;
        this.o = ere;
        this.p = d0Var;
        this.q = tn2;
        this.r = nVar;
        carModeNavigationLayout.setVisibilityListener(new b(this));
        this.a = (ImageButton) carModeNavigationLayout.findViewById(C0707R.id.home_tab);
        this.b = (ImageButton) carModeNavigationLayout.findViewById(C0707R.id.search_tab);
        this.f = (ImageButton) carModeNavigationLayout.findViewById(C0707R.id.your_library_tab);
        this.c = (ImageButton) carModeNavigationLayout.findViewById(C0707R.id.voice_search_button);
        this.n = (PulsatingView) carModeNavigationLayout.findViewById(C0707R.id.voice_search_pulse_view);
    }

    static void a(CarModeNavigationViews carModeNavigationViews, CarModeNavigationModel carModeNavigationModel) {
        int i;
        carModeNavigationViews.getClass();
        CarModeNavigationModel.SearchType searchType = CarModeNavigationModel.SearchType.VOICE;
        boolean z = true;
        carModeNavigationViews.a.setActivated(carModeNavigationModel.b() == CarModeNavigationModel.NavigationTab.HOME);
        CarModeNavigationModel.NavigationTab b2 = carModeNavigationModel.b();
        CarModeNavigationModel.NavigationTab navigationTab = CarModeNavigationModel.NavigationTab.SEARCH;
        carModeNavigationViews.c.setActivated(b2 == navigationTab && carModeNavigationModel.m() == searchType);
        carModeNavigationViews.b.setActivated(carModeNavigationModel.b() == navigationTab && carModeNavigationModel.m() == CarModeNavigationModel.SearchType.REGULAR);
        carModeNavigationViews.c.setEnabled(carModeNavigationModel.i() && !carModeNavigationModel.e());
        carModeNavigationViews.c.setImageState(carModeNavigationModel.l() ? v : StateSet.NOTHING, true);
        if (carModeNavigationModel.b() != CarModeNavigationModel.NavigationTab.YOUR_LIBRARY) {
            z = false;
        }
        carModeNavigationViews.f.setActivated(z);
        Resources resources = carModeNavigationViews.s.getResources();
        if ((carModeNavigationModel.m() == searchType ? (char) 2 : 3) == 3) {
            i = 0;
        } else {
            i = (int) (((float) resources.getDimensionPixelSize(C0707R.dimen.voice_search_button_size)) / 2.0f);
        }
        q4.Q(carModeNavigationViews.a, 0, 0, i, 0);
        q4.Q(carModeNavigationViews.f, i, 0, 0, 0);
        if (carModeNavigationModel.m() == searchType) {
            carModeNavigationViews.b.setVisibility(8);
            carModeNavigationViews.c.setVisibility(0);
            return;
        }
        carModeNavigationViews.b.setVisibility(0);
        carModeNavigationViews.c.setVisibility(8);
    }

    @Override // com.spotify.music.carmode.navigation.view.h
    public void N1() {
        boolean z = true;
        this.u = true;
        if (this.r.A().b().compareTo(Lifecycle.State.RESUMED) < 0) {
            z = false;
        }
        if (z) {
            this.n.g();
        }
    }

    public /* synthetic */ void d(da2 da2, View view) {
        this.o.a(this.p.d().a(ViewUris.f2.toString()));
        da2.accept(p.l());
    }

    public /* synthetic */ void e(da2 da2, View view) {
        this.o.a(this.p.b().a(ViewUris.d.toString()));
        da2.accept(p.b());
    }

    public /* synthetic */ void f(da2 da2, View view) {
        this.o.a(this.p.e().a(ViewUris.l1.toString()));
        da2.accept(p.n());
    }

    public /* synthetic */ void g(da2 da2, View view) {
        this.o.a(this.p.c().a(ViewUris.n0.toString()));
        da2.accept(p.i());
    }

    public /* synthetic */ void h() {
        this.o.a(this.p.d().b());
    }

    public /* synthetic */ void i() {
        da2<p> da2 = this.t;
        if (da2 != null) {
            da2.accept(p.c());
        }
    }

    public /* synthetic */ void j() {
        da2<p> da2 = this.t;
        if (da2 != null) {
            da2.accept(p.m());
        }
    }

    @Override // com.spotify.music.carmode.navigation.view.h
    public void m0() {
        sn2 sn2 = new sn2(this.s);
        sn2.d(new g(this));
        a.C0193a a2 = this.q.a();
        a2.b(sn2);
        a2.c(this.c);
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (this.u) {
            this.n.f();
        }
    }

    @w(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (this.u) {
            this.n.g();
        }
    }

    @Override // com.spotify.music.carmode.navigation.view.h
    public void q2() {
        this.u = false;
        this.n.f();
    }

    @Override // com.spotify.mobius.g
    public h<CarModeNavigationModel> t(da2<p> da2) {
        this.t = da2;
        this.c.setOnClickListener(new c(this, da2));
        this.a.setOnClickListener(new d(this, da2));
        this.f.setOnClickListener(new a(this, da2));
        this.b.setOnClickListener(new f(this, da2));
        return new a();
    }

    @Override // com.spotify.music.carmode.navigation.view.h
    public void u2() {
        rn2 rn2 = new rn2(this.s);
        rn2.d(new e(this));
        a.C0193a a2 = this.q.a();
        a2.b(rn2);
        a2.c(this.a);
    }
}
