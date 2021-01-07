package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.upsell.premiumdestination.n;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.x;
import io.reactivex.android.schedulers.a;
import io.reactivex.disposables.b;
import io.reactivex.g;

public class PremiumDestinationFragment extends LifecycleListenableFragment implements t, NavigationItem, x, s, ToolbarConfig.d, ToolbarConfig.c, c.a, c02 {
    public static final /* synthetic */ int s0 = 0;
    private b h0;
    private CharSequence i0;
    private RecyclerView j0;
    private TextView k0;
    private PremiumDestinationHeader l0;
    private View m0;
    private GlueHeaderLayout n0;
    private boolean o0;
    u p0;
    g9b q0;
    g<SessionState> r0;

    @Override // com.spotify.music.navigation.x
    public boolean C0() {
        this.n0.E(true);
        return true;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.q0.pause();
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.premiumdestination.t
    public void K(CharSequence charSequence) {
        this.i0 = charSequence;
    }

    public boolean K4() {
        return this.o0;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.q0.a();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.h0.dispose();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        ((ViewGroup) view).addView(this.m0);
        this.n0 = (GlueHeaderLayout) view.findViewById(C0707R.id.glue_header_layout);
        this.l0 = (PremiumDestinationHeader) view.findViewById(C0707R.id.header_view);
        this.k0 = (TextView) view.findViewById(C0707R.id.button_upgrade);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0707R.id.recycler_view);
        this.j0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        this.j0.setAdapter(new n());
        this.j0.k(new n.c(), -1);
        g<SessionState> Q = this.r0.Q(a.b());
        u uVar = this.p0;
        uVar.getClass();
        this.h0 = Q.subscribe(new i(uVar), a.a);
        this.k0.setOnClickListener(new b(this));
        this.k0.setVisibility(8);
        this.l0.getContent().getSubtitleView().setVisibility(4);
    }

    @Override // com.spotify.music.navigation.x
    public boolean Y() {
        return true;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public Fragment e() {
        return this;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.b1;
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.premiumdestination.t
    public void h2(int i) {
        if (i == 0) {
            this.k0.setAlpha(0.0f);
            this.k0.setVisibility(i);
            this.k0.animate().alpha(1.0f);
            return;
        }
        this.k0.setVisibility(i);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "premium-destination";
    }

    @Override // com.spotify.music.navigation.NavigationItem
    public NavigationItem.NavigationGroup k0() {
        return NavigationItem.NavigationGroup.PREMIUM;
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.premiumdestination.t
    public void l2(String str) {
        TextView n2 = this.l0.getContent().n2();
        if (TextUtils.isEmpty(n2.getText())) {
            n2.setTranslationY((float) n2.getResources().getDimensionPixelSize(C0707R.dimen.std_8dp));
            n2.setAlpha(0.0f);
        }
        n2.setText(str);
        n2.animate().alpha(1.0f).translationY(0.0f);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.premiumdestination.t
    public void r1(String str, l[] lVarArr) {
        n nVar = (n) this.j0.getAdapter();
        nVar.getClass();
        nVar.Y(str, this.i0, lVarArr);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        this.o0 = bundle == null;
        super.s3(bundle);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.PREMIUM_DESTINATION, ViewUris.b1.toString());
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.premiumdestination.t
    public void w2(String str) {
        this.k0.setText(str);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        this.m0 = layoutInflater.inflate(C0707R.layout.fragment_premium_destination, viewGroup, false);
        if (bundle == null) {
            z = true;
        }
        this.o0 = z;
        return new FrameLayout(F2());
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.premiumdestination.t
    public void x1(String str) {
        this.l0.getContent().getSubtitleView().setText(str);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        this.p0.p();
    }

    @Override // com.spotify.mobile.android.ui.activity.upsell.premiumdestination.t
    public void y1(int i) {
        TextView subtitleView = this.l0.getContent().getSubtitleView();
        if (i == 8) {
            i = 4;
        }
        subtitleView.setVisibility(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        this.m0 = null;
        androidx.fragment.app.c B2 = B2();
        if (B2 != null && !B2.isChangingConfigurations()) {
            this.p0.m();
        }
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.X0;
    }
}
