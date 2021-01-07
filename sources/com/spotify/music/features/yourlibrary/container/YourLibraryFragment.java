package com.spotify.music.features.yourlibrary.container;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedMap;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.logic.k;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.yourlibrary.container.view.a0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.x;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.d;
import com.spotify.music.yourlibrary.interfaces.f;
import com.spotify.music.yourlibrary.interfaces.i;
import defpackage.q19;

public class YourLibraryFragment extends LifecycleListenableFragment implements NavigationItem, d, c.a, s, mfd, k, w09, x, ToolbarConfig.a {
    k h0;
    a0 i0;
    zpd j0;
    h k0;
    n l0;
    YourLibraryPrefs m0;
    ys2 n0;
    private com.spotify.music.features.yourlibrary.container.view.x o0;
    private MobiusLoop.g<q19, o19> p0;

    public static YourLibraryFragment K4(com.spotify.android.flags.c cVar, String str, l0 l0Var) {
        YourLibraryFragment yourLibraryFragment = new YourLibraryFragment();
        Bundle E = je.E("username", str);
        E.putString("YourLibraryFragment.uri", l0Var.B());
        yourLibraryFragment.r4(E);
        com.spotify.android.flags.d.a(yourLibraryFragment, cVar);
        return yourLibraryFragment;
    }

    @Override // com.spotify.music.navigation.x
    public boolean C0() {
        this.k0.k();
        return true;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.p0.stop();
        this.n0.I1(null);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.p0.start();
        this.n0.I1(this.o0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        q19 b = this.p0.b();
        Optional<YourLibraryPageId> a = b.a();
        if (a.isPresent()) {
            bundle.putString("YourLibraryFragment.focusedPageId", a.get().g());
        }
        bundle.putParcelable("YourLibraryFragment.yourLibraryState", b.g());
        bundle.putInt("YourLibraryFragment.tabsOffset", this.o0.l());
    }

    @Override // com.spotify.music.navigation.x
    public boolean Y() {
        return true;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.YOURLIBRARY;
    }

    @Override // com.spotify.music.yourlibrary.interfaces.d
    public com.spotify.music.yourlibrary.interfaces.c g2(f fVar) {
        h hVar = this.k0;
        hVar.getClass();
        return new g(hVar, hVar, fVar);
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.k
    public com.spotify.android.flags.c getFlags() {
        return com.spotify.android.flags.d.c(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.l1;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "android-spotlet-your-library";
    }

    @Override // com.spotify.music.navigation.NavigationItem
    public NavigationItem.NavigationGroup k0() {
        return NavigationItem.NavigationGroup.COLLECTION;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.c(new a(this));
    }

    @Override // defpackage.w09
    public String w1() {
        Bundle D2 = D2();
        if (D2 != null) {
            return D2.getString("username", "");
        }
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        this.o0 = this.i0.b(layoutInflater, viewGroup);
        q19 q19 = q19.a;
        ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> a = this.j0.a();
        q19.a e = q19.e();
        e.e(a);
        q19 a2 = e.a();
        YourLibraryPageId a3 = this.m0.a();
        if (bundle != null) {
            String string2 = bundle.getString("YourLibraryFragment.focusedPageId");
            if (string2 != null) {
                a3 = (YourLibraryPageId) MoreObjects.firstNonNull(YourLibraryPageId.d(string2), a3);
            }
            i iVar = (i) bundle.getParcelable("YourLibraryFragment.yourLibraryState");
            a2 = a2.f(iVar);
            this.o0.r(iVar);
            this.o0.x(bundle.getInt("YourLibraryFragment.tabsOffset"));
        } else {
            Bundle D2 = D2();
            if (!(D2 == null || (string = D2.getString("YourLibraryFragment.uri")) == null)) {
                a3 = this.l0.a(string, a3);
            }
        }
        q19.a e2 = a2.e();
        e2.b(Optional.of(a3));
        MobiusLoop.g<q19, o19> a4 = this.h0.a(this.k0, this.o0, e2.a());
        this.p0 = a4;
        a4.c(this.o0);
        return this.o0.k();
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        Optional<YourLibraryPageId> a = this.p0.b().a();
        if (a.isPresent()) {
            this.m0.b(a.get());
        }
        this.p0.d();
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.HIDE;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.v1;
    }
}
