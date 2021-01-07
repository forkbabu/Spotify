package com.spotify.music.features.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.t;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.explicitcontent.j;
import com.spotify.music.features.settings.adapter.m2;
import com.spotify.music.features.settings.adapter.o2;
import com.spotify.music.features.settings.adapter.p2;
import com.spotify.music.features.settings.adapter.u2;
import com.spotify.music.libs.facebook.SocialState;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.samsungpersonalization.SamsungPersonalizationSettingsHandler;
import com.spotify.music.settings.SettingsState;
import com.spotify.music.z0;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.y;
import io.reactivex.z;
import java.util.List;

public class SettingsFragment extends LifecycleListenableListFragment implements s, NavigationItem, mfd, c.a, m2, o2 {
    public static final /* synthetic */ int m1 = 0;
    wlf<u2> A0;
    fm9 B0;
    ConnectManager C0;
    t D0;
    y E0;
    s0 F0;
    u0 G0;
    ExplicitContentFacade H0;
    j I0;
    com.spotify.music.navigation.t J0;
    com.spotify.music.settings.a K0;
    ys2 L0;
    InteractionLogger M0;
    x0 N0;
    com.spotify.music.libs.facebook.t O0;
    or9 P0;
    bqa Q0;
    lqa R0;
    g<SessionState> S0;
    c6a T0;
    ws3 U0;
    ov3 V0;
    y W0;
    z0 X0;
    i1 Y0;
    SamsungPersonalizationSettingsHandler Z0;
    jn5 a1;
    private boolean b1;
    private View c1;
    private String d1;
    private LoadingView e1;
    private io.reactivex.disposables.b f1 = EmptyDisposable.INSTANCE;
    private p2 g1;
    private final io.reactivex.functions.g<h1> h1 = new a();
    private final io.reactivex.functions.g<SettingsState> i1 = new b();
    private final io.reactivex.functions.g<SocialState> j1 = new c();
    private u2 k1;
    private final io.reactivex.functions.g<SessionState> l1 = new p(this);
    private final q r0 = new q();
    protected boolean s0;
    protected boolean t0;
    TextView u0;
    ImageView v0;
    yn1 w0;
    com.spotify.android.flags.c x0;
    uzd y0;
    wlf<p2> z0;

    class a implements io.reactivex.functions.g<h1> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(h1 h1Var) {
            h1 h1Var2 = h1Var;
            SettingsFragment settingsFragment = SettingsFragment.this;
            settingsFragment.b1 = settingsFragment.V0.a() && h1Var2.a();
            if (SettingsFragment.this.g1 != null) {
                SettingsFragment.this.g1.b1(h1Var2.g() || h1Var2.h(), h1Var2.b(), h1Var2.e(), h1Var2.d(), !h1Var2.f(), SettingsFragment.this.U0.c() && h1Var2.a(), SettingsFragment.this.b1, h1Var2.c());
            }
        }
    }

    class b implements io.reactivex.functions.g<SettingsState> {
        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(SettingsState settingsState) {
            SettingsFragment.this.g1.h1(settingsState);
            SettingsFragment settingsFragment = SettingsFragment.this;
            settingsFragment.t0 = true;
            SettingsFragment.S4(settingsFragment);
        }
    }

    class c implements io.reactivex.functions.g<SocialState> {
        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(SocialState socialState) {
            SocialState socialState2 = socialState;
            SettingsFragment.this.g1.T0(socialState2.available() && socialState2.enabled());
        }
    }

    static void S4(SettingsFragment settingsFragment) {
        if (settingsFragment.s0 && settingsFragment.t0) {
            settingsFragment.e1.n();
        }
    }

    public static void h5(SettingsFragment settingsFragment, boolean z) {
        q qVar = settingsFragment.r0;
        z<Boolean> e = settingsFragment.a1.e(settingsFragment, z);
        p2 p2Var = settingsFragment.g1;
        p2Var.getClass();
        qVar.a(e.subscribe(new f(p2Var)));
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.settings_title);
    }

    @Override // androidx.fragment.app.Fragment
    public void L3(int i, String[] strArr, int[] iArr) {
        this.a1.c(i, iArr);
    }

    @Override // com.spotify.music.features.settings.LifecycleListenableListFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.g1.K0();
        this.g1.notifyDataSetChanged();
        this.e1.r();
    }

    @Override // androidx.fragment.app.ListFragment
    public void M4(ListView listView, View view, int i, long j) {
        ((hk8) l70.o(view, hk8.class)).Y1();
    }

    @Override // com.spotify.music.features.settings.LifecycleListenableListFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.r0.a(this.Y0.a().subscribe(this.h1, w.a));
        this.r0.a(this.K0.a().o0(this.E0).subscribe(this.i1, m.a));
        this.r0.a(this.w0.a().subscribe(this.l1, a0.a));
        this.r0.a(this.F0.a().B(this.E0).subscribe(new s(this), g.a));
        this.g1.Y0(this);
        this.r0.a(this.H0.d().o0(this.E0).subscribe(new e0(this), t.a));
        this.r0.a(this.I0.a().o0(this.E0).subscribe(new z(this)));
        if (!this.B0.a(this.x0)) {
            this.r0.a(this.G0.a().B(this.E0).subscribe(new l(this), n.a));
        }
        this.r0.a(this.C0.p(getClass().getSimpleName()).o0(this.E0).subscribe(new o(this)));
        this.r0.a(this.P0.a().B(this.E0).subscribe(new h(this), new r(this)));
        this.r0.a(new v(this.S0.h0(1).O(q0.a)).W(new x(this), false, Integer.MAX_VALUE).o0(this.E0).subscribe(new k(this)));
        q qVar = this.r0;
        io.reactivex.s<y6a> o0 = this.T0.b().o0(this.E0);
        p2 p2Var = this.g1;
        p2Var.getClass();
        qVar.a(o0.subscribe(new p0(p2Var)));
        q qVar2 = this.r0;
        io.reactivex.s<Boolean> o02 = this.T0.f().o0(this.E0);
        p2 p2Var2 = this.g1;
        p2Var2.getClass();
        qVar2.a(o02.subscribe(new n0(p2Var2)));
        q qVar3 = this.r0;
        io.reactivex.s<Boolean> o03 = this.T0.e().o0(this.E0);
        p2 p2Var3 = this.g1;
        p2Var3.getClass();
        qVar3.a(o03.subscribe(new o0(p2Var3)));
        this.g1.U0(this.a1.a(F2()));
        this.g1.V0(new c0(this));
        this.r0.a(this.O0.a().o0(this.E0).subscribe(this.j1, y.a));
        if (this.Z0.b()) {
            this.r0.a(this.Z0.c().E().o0(this.E0).subscribe(new g0(this)));
        }
        this.g1.Z0(this);
    }

    @Override // com.spotify.music.features.settings.LifecycleListenableListFragment, androidx.fragment.app.Fragment
    public void P3() {
        c6.c(this).a(C0707R.id.loader_settings);
        c6.c(this).a(C0707R.id.loader_settings_session);
        this.f1.dispose();
        this.r0.c();
        this.g1.g();
        super.P3();
    }

    public void T4(View view) {
        String B = l0.J(this.d1).B();
        B.getClass();
        this.M0.a(B, "settings-profile-section", -1, InteractionLogger.InteractionType.HIT, "open-profile");
        this.J0.d(B);
    }

    public void U4(SessionState sessionState) {
        if (sessionState.loggedIn()) {
            this.d1 = sessionState.currentUser();
            this.g1.W0(sessionState.currentUserName());
            this.g1.M0(sessionState.currentUser());
        }
        this.s0 = true;
        if (this.t0) {
            this.e1.n();
        }
    }

    public /* synthetic */ void V4(int i) {
        this.g1.c1(i);
    }

    public /* synthetic */ void W4(int i, Throwable th) {
        this.g1.c1(i);
        Logger.e(th, "Failed to update 'show my recently played artists' product state", new Object[0]);
    }

    public /* synthetic */ void X4(List list) {
        this.g1.d1(!list.isEmpty());
    }

    public /* synthetic */ void Y4(Throwable th) {
        this.g1.d1(false);
    }

    public /* synthetic */ void Z4(Boolean bool) {
        this.g1.notifyDataSetChanged();
    }

    public /* synthetic */ void a5(Boolean bool) {
        this.g1.S0(bool.booleanValue());
    }

    public /* synthetic */ void b5(Boolean bool) {
        this.g1.R0(!bool.booleanValue());
    }

    public /* synthetic */ void c5(Integer num) {
        this.g1.c1(num.intValue());
    }

    public /* synthetic */ void d5(GaiaDevice gaiaDevice) {
        this.g1.a1(!gaiaDevice.isSelf());
        this.g1.Q0(this.C0.r());
        this.k1.d(this.g1.p());
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    public /* synthetic */ void e5(boolean z) {
        this.g1.X0(z);
    }

    public /* synthetic */ void f5(boolean z, Throwable th) {
        this.g1.X0(!z);
        Logger.e(th, "Failed updating 'publish-activity' in product state", new Object[0]);
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.SETTINGS;
    }

    public /* synthetic */ void g5(Boolean bool) {
        this.g1.X0(bool.booleanValue());
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        return ViewUris.c0;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "config";
    }

    public void i5(boolean z) {
        if (!this.f1.d()) {
            this.f1.dispose();
        }
        this.f1 = this.F0.b(z).A(this.E0).subscribe(new f0(this, z), new q(this, z));
    }

    public void j5(boolean z) {
        int s = this.g1.s();
        int i = z ? s | 1 : s & -2;
        this.r0.a(this.G0.b(i).A(this.E0).subscribe(new i(this, i), new v(this, s)));
    }

    @Override // com.spotify.music.navigation.NavigationItem
    public NavigationItem.NavigationGroup k0() {
        return NavigationItem.NavigationGroup.HOME;
    }

    @Override // com.spotify.music.features.settings.LifecycleListenableListFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        super.n3(i, i2, intent);
        if (i == 1 && i2 == -1) {
            int i3 = PermissionsRequestActivity.f;
            PermissionsRequestActivity.a aVar = (PermissionsRequestActivity.a) intent.getParcelableExtra("permission_result");
            if (aVar != null) {
                boolean b2 = aVar.b("android.permission.RECORD_AUDIO");
                this.g1.i1(b2);
                if (this.b1) {
                    this.g1.n(b2);
                }
            }
        }
        if (this.Z0.b()) {
            this.Z0.d(i, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.music.features.settings.LifecycleListenableListFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        u4(true);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.SETTINGS, null);
    }

    @Override // androidx.fragment.app.ListFragment, androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.g1 = this.z0.get();
        this.k1 = this.A0.get();
        this.c1 = layoutInflater.inflate(C0707R.layout.list_frame, viewGroup, false);
        this.L0.k(this, B2().getString(C0707R.string.settings_title));
        ListView listView = (ListView) this.c1.findViewById(16908298);
        Bundle D2 = D2();
        boolean e = this.D0.e();
        if (D2 != null && D2.getBoolean("premium_button_visible") && e) {
            View inflate = layoutInflater.inflate(C0707R.layout.settings_get_premium, (ViewGroup) listView, false);
            View findViewById = inflate.findViewById(C0707R.id.btn_get_premium);
            listView.addHeaderView(inflate);
            findViewById.setOnClickListener(new b0(this));
        }
        Optional<View> a2 = ((szd) this.y0).a(listView);
        if (a2.isPresent()) {
            listView.addHeaderView(a2.get());
        }
        View inflate2 = layoutInflater.inflate(C0707R.layout.settings_view_profile, (ViewGroup) listView, false);
        this.v0 = (ImageView) inflate2.findViewById(C0707R.id.avatar);
        this.u0 = (TextView) inflate2.findViewById(C0707R.id.username);
        this.v0.setImageDrawable(yc0.s(B2()));
        ImageView imageView = (ImageView) inflate2.findViewById(16908294);
        imageView.setImageDrawable(new SpotifyIconDrawable(imageView.getContext(), SpotifyIconV2.CHEVRON_RIGHT, 24.0f));
        listView.addHeaderView(inflate2);
        inflate2.setOnClickListener(new h0(this));
        N4(this.k1);
        listView.setDivider(null);
        listView.setDividerHeight(0);
        View view = (View) listView.getParent();
        view.setVisibility(4);
        LoadingView m = LoadingView.m(layoutInflater, B2(), view);
        this.e1 = m;
        ((ViewGroup) this.c1).addView(m, -1, -1);
        return this.c1;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.h1;
    }
}
