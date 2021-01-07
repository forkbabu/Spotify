package com.spotify.music.carmode.navigation;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.e;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.z;
import com.spotify.music.C0707R;
import com.spotify.music.carmode.navigation.domain.CarModeNavigationModel;
import com.spotify.music.carmode.navigation.domain.o;
import com.spotify.music.carmode.navigation.domain.p;
import com.spotify.music.carmode.navigation.view.CarModeNavigationLayout;
import com.spotify.music.carmode.navigation.view.CarModeNavigationViews;
import com.spotify.music.carmode.navigation.view.h;
import com.spotify.music.connection.l;
import com.spotify.music.libs.carmodeengine.util.y;
import com.spotify.music.navigation.b;
import com.spotify.music.navigation.o;
import com.spotify.music.navigation.x;
import com.spotify.ubi.specification.factories.d0;
import dagger.android.support.a;

public class CarModeNavigationFragment extends Fragment implements h {
    r g0;
    ere h0;
    tn2 i0;
    o j0;
    b k0;
    y l0;
    ys2 m0;
    private MobiusLoop.g<CarModeNavigationModel, p> n0;
    private CarModeNavigationViews o0;

    @Override // com.spotify.music.carmode.navigation.view.h
    public void N1() {
        CarModeNavigationViews carModeNavigationViews = this.o0;
        if (carModeNavigationViews != null) {
            carModeNavigationViews.N1();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.n0.start();
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.n0.stop();
    }

    @Override // com.spotify.music.carmode.navigation.view.h
    public void m0() {
        CarModeNavigationViews carModeNavigationViews = this.o0;
        if (carModeNavigationViews != null) {
            carModeNavigationViews.m0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.music.carmode.navigation.view.h
    public void q2() {
        CarModeNavigationViews carModeNavigationViews = this.o0;
        if (carModeNavigationViews != null) {
            carModeNavigationViews.q2();
        }
    }

    @Override // com.spotify.music.carmode.navigation.view.h
    public void u2() {
        CarModeNavigationViews carModeNavigationViews = this.o0;
        if (carModeNavigationViews != null) {
            carModeNavigationViews.u2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Optional<x> optional;
        Fragment u = this.m0.u();
        CarModeNavigationModel.a c = CarModeNavigationModel.c();
        c.a(true);
        c.e(true);
        c.b(true);
        c.c(this.l0.g());
        if (u instanceof x) {
            optional = Optional.of((x) u);
        } else {
            optional = Optional.absent();
        }
        c.f(optional);
        c.d(kfd.a(u));
        CarModeNavigationModel build = c.build();
        CarModeNavigationLayout carModeNavigationLayout = (CarModeNavigationLayout) layoutInflater.inflate(C0707R.layout.car_mode_navigation_bar, viewGroup, false);
        d0 d0Var = new d0();
        r rVar = this.g0;
        c cVar = c.a;
        o oVar = rVar.b;
        b bVar = rVar.a;
        s sVar = rVar.f;
        h hVar = rVar.h;
        m f = i.f();
        f.h(o.a.class, bn2.a);
        f.b(o.d.class, new tm2(oVar, bVar));
        f.b(o.c.class, new zm2(oVar, bVar));
        f.b(o.b.class, new vm2(oVar, bVar));
        f.b(o.g.class, new rm2(oVar, bVar));
        f.b(o.e.class, new om2(oVar, bVar));
        f.b(o.j.class, new wm2(oVar, bVar));
        f.d(o.l.class, new pm2(oVar, bVar));
        f.b(o.m.class, new ym2(sVar));
        f.b(o.n.class, new um2(sVar));
        f.b(o.i.class, new qm2(hVar));
        f.b(o.f.class, new an2(hVar));
        f.b(o.h.class, new cn2(hVar));
        f.b(o.k.class, new sm2(hVar));
        MobiusLoop.f c2 = i.c(cVar, f.i());
        mn2 mn2 = rVar.c;
        l lVar = rVar.d;
        pn2 pn2 = rVar.e;
        ln2 ln2 = rVar.g;
        this.n0 = z.a(c2.h(i.a(mn2.a(), lVar.b().j0(in2.a), pn2.a(), ln2.a(), ln2.b(), rVar.i.a(), rVar.j.a().j0(hn2.a))).b(a.a).f(new e("CarModeNavigation")), build, b.a, u92.b());
        CarModeNavigationViews carModeNavigationViews = new CarModeNavigationViews(layoutInflater.getContext(), carModeNavigationLayout, this.h0, d0Var, this.i0, b3());
        this.o0 = carModeNavigationViews;
        this.n0.c(carModeNavigationViews);
        return carModeNavigationLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        this.n0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void z3() {
        super.z3();
        boolean f = this.n0.b().f();
        if ((this.n0.b().b() == CarModeNavigationModel.NavigationTab.SEARCH && this.n0.b().m() == CarModeNavigationModel.SearchType.VOICE) || f) {
            new Handler().post(new e(this, f));
        }
    }
}
