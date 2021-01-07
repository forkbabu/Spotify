package com.spotify.music.features.showentity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.C0707R;
import com.spotify.music.features.showentity.r;
import com.spotify.playlist.models.Show;
import io.reactivex.y;

public class ShowEntityResolverFragment extends LifecycleListenableFragment implements ToolbarConfig.d, s, g<u, t>, b0 {
    public static final /* synthetic */ int p0 = 0;
    z h0;
    qna i0;
    ajf<w> j0;
    y k0;
    y l0;
    private View m0;
    private View n0;
    private MobiusLoop.g<u, t> o0;

    class a implements h<u> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            if (((u) obj).c()) {
                ShowEntityResolverFragment.this.m0.setVisibility(0);
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    public static ShowEntityResolverFragment L4(String str, boolean z, Bundle bundle) {
        Bundle F = je.F("uri", str, "original_uri", str);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("auto_play", z);
        F.putBundle("navigation_extras", bundle);
        ShowEntityResolverFragment showEntityResolverFragment = new ShowEntityResolverFragment();
        showEntityResolverFragment.r4(F);
        return showEntityResolverFragment;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    public void M4(String str, Throwable th) {
        Logger.e(th, "Error while resolving entity: %s", str);
        this.n0.setVisibility(0);
        this.m0.setVisibility(8);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.o0.start();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.o0.stop();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "show_resolver";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.mobius.g
    public h<u> t(da2<t> da2) {
        return new a();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.SHOWS_RESOLVER, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_show_resolver, viewGroup, false);
        this.m0 = inflate.findViewById(C0707R.id.progress_view);
        qna qna = this.i0;
        y yVar = this.k0;
        y yVar2 = this.l0;
        m f = i.f();
        f.h(r.b.class, new f(qna, yVar, yVar2));
        f.h(r.a.class, i.a);
        f.e(r.c.class, new e(this), io.reactivex.android.schedulers.a.b());
        f.e(r.d.class, new c(this), io.reactivex.android.schedulers.a.b());
        MobiusLoop.f f2 = i.c(p.a, f.i()).e(a.a).f(b.g("Show entity resolver"));
        String string = k4().getString("uri", "");
        if (!string.isEmpty()) {
            MobiusLoop.g<u, t> b = z42.b(f2, new q(string, k4().getBundle("navigation_extras"), Show.MediaType.UNKNOWN, false));
            this.o0 = b;
            b.c(this);
            ViewGroup viewGroup2 = (ViewGroup) inflate;
            nb0 b2 = pb0.b(l4(), viewGroup2);
            b2.setTitle(C0707R.string.error_general_title);
            b2.A2(C0707R.string.error_general_body);
            View view = b2.getView();
            this.n0 = view;
            view.setVisibility(8);
            viewGroup2.addView(this.n0);
            return inflate;
        }
        throw new IllegalArgumentException("Empty ARGUMENT_URI");
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        this.o0.d();
        super.y3();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.j1;
    }
}
