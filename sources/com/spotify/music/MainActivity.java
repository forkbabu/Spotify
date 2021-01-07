package com.spotify.music;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import androidx.fragment.app.x;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.android.flags.c;
import com.spotify.android.glue.patterns.prettylist.compat.f;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.navigation.logger.f;
import com.spotify.instrumentation.navigation.logger.m;
import com.spotify.intentrouter.l;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.coreintegration.k0;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.view.MainLayout;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.ui.view.anchorbar.e;
import com.spotify.mobile.android.ui.view.anchorbar.g;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.ads.audioplus.i;
import com.spotify.music.features.ads.p1;
import com.spotify.music.features.ads.screensaver.p0;
import com.spotify.music.features.payfail.s;
import com.spotify.music.features.search.SearchFragment;
import com.spotify.music.libs.connect.access.ConnectAccessViewModel;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.mainactivity.p;
import com.spotify.music.mainactivity.u;
import com.spotify.music.mainactivity.v;
import com.spotify.music.navigation.BackNavigationInteractionType;
import com.spotify.music.navigation.r;
import com.spotify.music.s0;
import com.spotify.rxjava2.q;
import defpackage.ufb;
import defpackage.ys2;
import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends ss2 implements ys2, p0.a, f, shd, vgb, bhb, s0.a {
    public static final /* synthetic */ int W0 = 0;
    private final Handler A0 = new Handler();
    private final q B0 = new q();
    private final io.reactivex.subjects.a<ufb> C0 = io.reactivex.subjects.a.h1();
    private ws2 D0;
    private Fragment E0;
    private c F0;
    private Uri G;
    private SessionState G0;
    p1 H;
    private MobiusLoop.g<wfb, ufb> H0;
    qv9 I;
    private ij9 I0;
    pz1 J;
    private ix9 J0;
    nhd K;
    private i0 K0;
    wod L;
    private c0 L0;
    e M;
    private p0 M0;
    iy7 N;
    private com.spotify.music.features.ads.audioplus.c N0;
    fm9 O;
    private int O0;
    s P;
    private boolean P0;
    i Q;
    private boolean Q0;
    fi8 R;
    private boolean R0;
    v S;
    private boolean S0;
    hi8 T;
    private boolean T0;
    ColdStartTracker U;
    private xs2 U0;
    ux9 V;
    private final xs2 V0 = new a();
    kd0 W;
    nx9 X;
    xw9 Y;
    zw9 Z;
    p a0;
    m70 b0;
    y0 c0;
    l0 d0;
    m0 e0;
    f0 f0;
    g g0;
    com.spotify.music.navigation.q h0;
    m i0;
    com.spotify.music.navigation.i j0;
    r k0;
    l<hlb> l0;
    ykb m0;
    int n0;
    boolean o0;
    boolean p0;
    ConnectAccessViewModel q0;
    y70 r0;
    k s0;
    z0 t0;
    u u0;
    rhd v0;
    com.spotify.mobile.android.service.feature.q w0;
    k0 x0;
    a0 y0;
    private final ArrayList<Intent> z0 = new ArrayList<>();

    class a implements xs2 {
        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00b1  */
        @Override // defpackage.xs2
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(androidx.fragment.app.Fragment r5, java.lang.String r6) {
            /*
                r4 = this;
                com.spotify.music.MainActivity r6 = com.spotify.music.MainActivity.this
                com.spotify.music.navigation.i r6 = r6.j0
                java.lang.String r6 = r6.c()
                com.spotify.music.MainActivity r0 = com.spotify.music.MainActivity.this
                com.spotify.music.p0 r0 = com.spotify.music.MainActivity.U0(r0)
                r0.f(r6)
                android.os.Bundle r6 = r5.k4()
                yn0 r6 = com.spotify.music.sociallistening.participantlist.impl.m.a(r6)
                yn0 r0 = defpackage.bu9.w
                boolean r6 = r0.equals(r6)
                boolean r0 = r5 instanceof com.spotify.music.navigation.x
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0030
                r0 = r5
                com.spotify.music.navigation.x r0 = (com.spotify.music.navigation.x) r0
                boolean r0 = r0.Y()
                if (r0 == 0) goto L_0x0030
                r0 = 1
                goto L_0x0031
            L_0x0030:
                r0 = 0
            L_0x0031:
                com.spotify.music.MainActivity r3 = com.spotify.music.MainActivity.this
                com.spotify.music.navigation.r r3 = r3.k0
                boolean r3 = r3.e()
                if (r3 == 0) goto L_0x0041
                if (r6 != 0) goto L_0x0041
                if (r0 != 0) goto L_0x0041
                r6 = 1
                goto L_0x0042
            L_0x0041:
                r6 = 0
            L_0x0042:
                boolean r0 = r5 instanceof com.spotify.mobile.android.ui.activity.upsell.premiumdestination.PremiumDestinationFragment
                if (r0 == 0) goto L_0x005e
                com.spotify.music.MainActivity r0 = com.spotify.music.MainActivity.this
                com.spotify.android.flags.c r0 = com.spotify.music.MainActivity.V0(r0)
                if (r0 == 0) goto L_0x005e
                com.spotify.music.MainActivity r0 = com.spotify.music.MainActivity.this
                fm9 r3 = r0.O
                com.spotify.android.flags.c r0 = com.spotify.music.MainActivity.V0(r0)
                boolean r0 = r3.a(r0)
                if (r0 != 0) goto L_0x005e
                r0 = 1
                goto L_0x005f
            L_0x005e:
                r0 = 0
            L_0x005f:
                com.spotify.music.MainActivity r3 = com.spotify.music.MainActivity.this
                com.spotify.music.p0 r3 = com.spotify.music.MainActivity.U0(r3)
                if (r6 != 0) goto L_0x006c
                if (r0 == 0) goto L_0x006a
                goto L_0x006c
            L_0x006a:
                r6 = 0
                goto L_0x006d
            L_0x006c:
                r6 = 1
            L_0x006d:
                r3.e(r6)
                com.spotify.music.MainActivity r6 = com.spotify.music.MainActivity.this
                r6.P()
                com.spotify.music.MainActivity r6 = com.spotify.music.MainActivity.this
                java.lang.String r0 = "input_method"
                java.lang.Object r0 = r6.getSystemService(r0)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                android.view.Window r6 = r6.getWindow()
                android.view.View r6 = r6.getDecorView()
                android.os.IBinder r6 = r6.getWindowToken()
                r0.hideSoftInputFromWindow(r6, r2)
                com.spotify.music.MainActivity r6 = com.spotify.music.MainActivity.this
                com.spotify.music.c0 r6 = com.spotify.music.MainActivity.W0(r6)
                r6.a(r5)
                com.spotify.music.MainActivity r6 = com.spotify.music.MainActivity.this
                android.os.Handler r6 = com.spotify.music.MainActivity.a1(r6)
                com.spotify.music.MainActivity r0 = com.spotify.music.MainActivity.this
                com.spotify.music.i0 r0 = com.spotify.music.MainActivity.X0(r0)
                r6.post(r0)
                com.spotify.music.MainActivity r6 = com.spotify.music.MainActivity.this
                r6.getClass()
                com.spotify.music.navigation.NavigationItem$NavigationGroup r0 = com.spotify.music.navigation.NavigationItem.NavigationGroup.NONE
                boolean r3 = r5 instanceof com.spotify.music.navigation.NavigationItem
                if (r3 == 0) goto L_0x00b7
                com.spotify.music.navigation.NavigationItem r5 = (com.spotify.music.navigation.NavigationItem) r5
                com.spotify.music.navigation.NavigationItem$NavigationGroup r0 = r5.k0()
            L_0x00b7:
                java.lang.Object[] r5 = new java.lang.Object[r1]
                r5[r2] = r0
                java.lang.String r1 = "broadcasting nav group %s"
                com.spotify.base.java.logging.Logger.b(r1, r5)
                kd0 r5 = r6.W
                android.content.Intent r6 = new android.content.Intent
                r6.<init>()
                java.lang.String r1 = "ACTION_LATEST_NAVIGATION"
                android.content.Intent r1 = r6.setAction(r1)
                java.lang.String r2 = "navigation_group"
                r1.putExtra(r2, r0)
                r5.c(r6)
                com.spotify.music.libs.debugtools.flags.DebugFlag r5 = com.spotify.music.libs.debugtools.flags.DebugFlag.SHOW_PAGE_INFO
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.MainActivity.a.a(androidx.fragment.app.Fragment, java.lang.String):void");
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0034: APUT  
      (r3v1 java.lang.Object[])
      (2 ??[int, float, short, byte, char])
      (wrap: java.lang.Boolean : 0x0030: INVOKE  (r6v2 java.lang.Boolean) = (r6v1 boolean) type: STATIC call: java.lang.Boolean.valueOf(boolean):java.lang.Boolean)
     */
    private boolean b1(c cVar, SessionState sessionState) {
        boolean z = true;
        boolean z2 = this.S0 && !P0() && cVar != null && sessionState != null;
        if (!z2) {
            Object[] objArr = new Object[4];
            objArr[0] = Boolean.valueOf(this.S0);
            objArr[1] = Boolean.valueOf(P0());
            objArr[2] = Boolean.valueOf(cVar != null);
            if (sessionState == null) {
                z = false;
            }
            objArr[3] = Boolean.valueOf(z);
            Logger.b("Can't handle Intent right now, mResumed=%b, isFragmentManipulationForbidden=%b, flags loaded=%b, session loaded=%b.", objArr);
        }
        return z2;
    }

    private void d1(Intent intent, c cVar, SessionState sessionState) {
        Logger.b("handleIntent: %s", intent);
        intent.setExtrasClassLoader(getClassLoader());
        setIntent(intent);
        if ("com.facebook.application.174829003346".equals(intent.getAction())) {
            intent.setAction("android.intent.action.VIEW");
        }
        if (!((s3a) this.r0).g(getIntent(), sessionState.loggedIn())) {
            intent.putExtra("is_ui_fragments_loaded", this.Q0);
            if (!this.l0.b(hlb.b(intent, cVar, sessionState))) {
                this.m0.b(intent, cVar, sessionState);
            }
        }
        this.M.a(intent);
        for (ygb ygb : this.d0.a()) {
            ygb.a(intent);
        }
    }

    public static void f1(MainActivity mainActivity) {
        mainActivity.y1(mainActivity.F0, mainActivity.G0);
    }

    private void u1(Intent intent) {
        this.K.b(intent);
        for (zgb zgb : this.e0.a()) {
            zgb.a(intent);
        }
        c cVar = this.F0;
        SessionState sessionState = this.G0;
        if (b1(cVar, sessionState)) {
            cVar.getClass();
            sessionState.getClass();
            d1(intent, cVar, sessionState);
            return;
        }
        this.z0.add(intent);
    }

    private void x1(int i) {
        this.P0 = true;
        setRequestedOrientation(i);
    }

    private void y1(c cVar, SessionState sessionState) {
        if (b1(cVar, sessionState)) {
            while (!this.z0.isEmpty()) {
                cVar.getClass();
                sessionState.getClass();
                d1(this.z0.remove(0), cVar, sessionState);
            }
        }
    }

    @Override // defpackage.ys2
    public void A0(ys2.a aVar) {
        View findViewById = findViewById(C0707R.id.content);
        findViewById.getClass();
        ((MainLayout) findViewById).E0(aVar);
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.c
    public void G0() {
        P();
    }

    @Override // defpackage.vs2
    public final void I1(ws2 ws2) {
        this.D0 = ws2;
    }

    @Override // defpackage.bhb
    public void J() {
        for (xgb xgb : this.f0.a()) {
            Optional<Integer> b = xgb.b();
            if (b.isPresent()) {
                x1(b.get().intValue());
                return;
            }
        }
        x1(this.O0);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2
    public k O0() {
        return this.s0;
    }

    @Override // com.spotify.android.glue.components.toolbar.d
    public void P() {
        p0 p0Var = this.M0;
        if (p0Var != null) {
            p0Var.c();
        }
    }

    @Override // com.spotify.android.glue.components.toolbar.d
    public com.spotify.android.glue.patterns.prettylist.u R() {
        p0 p0Var = this.M0;
        if (p0Var != null) {
            return p0Var.b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2
    public boolean R0() {
        return !this.T0 || this.Q0;
    }

    @Override // com.spotify.music.features.ads.screensaver.p0.a
    public p0 W() {
        return this.S.c();
    }

    @Override // com.spotify.music.s0.a
    public void b(Intent intent) {
        z42.a("Not called on main looper");
        onNewIntent(intent);
    }

    public Uri c1() {
        return this.G;
    }

    public void i1(Intent intent) {
        intent.getClass();
        u1(intent);
    }

    @Override // androidx.appcompat.app.g, android.app.Activity
    public void invalidateOptionsMenu() {
        P();
    }

    public void j1(Bundle bundle, o0 o0Var) {
        wfb wfb;
        Intent intent = getIntent();
        ColdStartTracker coldStartTracker = this.U;
        j jVar = new j(this, bundle, intent);
        coldStartTracker.B("dma_onCreatePrelude");
        jVar.run();
        coldStartTracker.e("dma_onCreatePrelude");
        setVisible(false);
        ColdStartTracker coldStartTracker2 = this.U;
        coldStartTracker2.B("dma_layout");
        setContentView(this.n0);
        coldStartTracker2.e("dma_layout");
        View findViewById = findViewById(C0707R.id.content);
        findViewById.getClass();
        MainLayout mainLayout = (MainLayout) findViewById;
        this.q0.b(this);
        mainLayout.setConnectAccessViewModel(this.q0);
        mainLayout.K0(this.o0);
        for (ahb ahb : this.c0.a()) {
            ahb.f(mainLayout);
        }
        ColdStartTracker coldStartTracker3 = this.U;
        coldStartTracker3.B("dma_Debugdrawer");
        o1(mainLayout);
        coldStartTracker3.e("dma_Debugdrawer");
        this.b0.a();
        ColdStartTracker coldStartTracker4 = this.U;
        f fVar = new f(this, mainLayout);
        coldStartTracker4.B("dma_Toolbar");
        fVar.run();
        coldStartTracker4.e("dma_Toolbar");
        AnchorBar bottomAnchorBar = mainLayout.getBottomAnchorBar();
        AnchorBar topAnchorBar = mainLayout.getTopAnchorBar();
        topAnchorBar.setInflateAnchorItemsLazilyEnabled(this.p0);
        ColdStartTracker coldStartTracker5 = this.U;
        coldStartTracker5.B("dma_TopSnackbar");
        topAnchorBar.setAnchorContentAnimation(AnchorBar.AnchorContentAnimation.TOP_TO_BOTTOM);
        this.M.b(topAnchorBar);
        topAnchorBar.bringToFront();
        coldStartTracker5.e("dma_TopSnackbar");
        ix9 ix9 = new ix9(this.h0);
        this.J0 = ix9;
        this.Y.c(ix9);
        if (bundle != null) {
            Logger.b("onCreate, restoring state", new Object[0]);
            bundle.setClassLoader(getClassLoader());
            this.E0 = v0().U("tag_bottom_tab_nav_fragment");
            this.L0.b();
            com.spotify.music.navigation.q qVar = this.h0;
            Bundle bundle2 = bundle.getBundle("navigation_state");
            bundle2.getClass();
            qVar.r(bundle2);
            this.G = (Uri) bundle.getParcelable("last_referrer");
            this.O0 = bundle.getInt("initial_orientation");
            this.z0.addAll(bundle.getParcelableArrayList("pending_intents"));
        } else {
            for (ahb ahb2 : this.c0.a()) {
                ahb2.c();
            }
            this.O0 = getRequestedOrientation();
        }
        if (bundle == null || (wfb = (wfb) bundle.getParcelable("state_model")) == null) {
            wfb = wfb.f;
        }
        c c = wfb.c();
        this.F0 = c;
        this.G0 = wfb.e();
        this.Q0 = wfb.h();
        ColdStartTracker coldStartTracker6 = this.U;
        coldStartTracker6.B("dma_BottomSnackbar");
        n1(bottomAnchorBar);
        coldStartTracker6.e("dma_BottomSnackbar");
        MobiusLoop.g<wfb, ufb> b = z42.b(this.a0.a(new a(this), new w(this), new u(this), new v(this), new r(this), new h(this)), wfb);
        this.H0 = b;
        b.c(com.spotify.mobius.rx2.i.b(new g(this)));
        this.K0 = new i0(this, this, c);
        this.L.a(new n(this), this);
        this.h0.h(this.M0);
        this.h0.g(this.V0);
        this.M0.i();
        o0Var.getClass();
        t tVar = new t(o0Var);
        this.U0 = tVar;
        this.h0.g(tVar);
        com.spotify.music.features.ads.audioplus.g gVar = new com.spotify.music.features.ads.audioplus.g(this.Q);
        this.N0 = new com.spotify.music.features.ads.audioplus.c(gVar);
        this.S.d(this, this, gVar);
        this.T.a(this.R.a());
    }

    @Override // defpackage.ys2
    public void k(Fragment fragment, String str) {
        this.j0.k(fragment, str);
        String c = this.j0.c();
        super.setTitle(c);
        this.M0.f(c);
    }

    public void k1() {
        super.onStart();
        this.R0 = true;
        ColdStartTracker coldStartTracker = this.U;
        MobiusLoop.g<wfb, ufb> gVar = this.H0;
        gVar.getClass();
        coldStartTracker.B("dma_MoebiusLoop");
        gVar.start();
        coldStartTracker.e("dma_MoebiusLoop");
        ColdStartTracker coldStartTracker2 = this.U;
        coldStartTracker2.B("dma_Monitoring");
        this.X.c();
        this.P.a();
        coldStartTracker2.e("dma_Monitoring");
        this.A0.post(this.K0);
        this.h0.g(this.N.c());
        ColdStartTracker coldStartTracker3 = this.U;
        v vVar = this.S;
        vVar.getClass();
        coldStartTracker3.B("dma_ScreensaverAd_onResume");
        vVar.f();
        coldStartTracker3.e("dma_ScreensaverAd_onResume");
        this.h0.g(this.N0);
        ((s3a) this.r0).a();
    }

    @Override // defpackage.vgb
    public void m0() {
        if (!P0()) {
            Fragment fragment = null;
            Iterator<wgb> it = this.y0.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Optional<Fragment> b = it.next().b();
                if (b.isPresent()) {
                    fragment = b.get();
                    break;
                }
            }
            if (fragment != null) {
                Fragment fragment2 = this.E0;
                if (fragment2 == null || fragment2.getClass() != fragment.getClass()) {
                    this.E0 = fragment;
                    ColdStartTracker coldStartTracker = this.U;
                    coldStartTracker.B("dma_BottomNavFragment");
                    m1();
                    coldStartTracker.e("dma_BottomNavFragment");
                }
            }
        }
    }

    public void m1() {
        x i = v0().i();
        Fragment fragment = this.E0;
        fragment.getClass();
        i.q(C0707R.id.navigation_bar, fragment, "tag_bottom_tab_nav_fragment");
        i.i();
    }

    public void n1(AnchorBar anchorBar) {
        View findViewById = findViewById(C0707R.id.content);
        findViewById.getClass();
        MainLayout mainLayout = (MainLayout) findViewById;
        this.g0.d(anchorBar);
        this.g0.a(!this.o0 || !mainLayout.v0(), this.F0);
        if (!this.o0) {
            anchorBar.bringToFront();
        }
    }

    public void o1(MainLayout mainLayout) {
        this.L0 = new c0(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.L0.getClass();
        ws2 ws2 = this.D0;
        if (ws2 == null || !ws2.b()) {
            m mVar = this.i0;
            f.a aVar = f.a.a;
            mVar.g(aVar);
            this.i0.c(aVar, "MainActivity.onBackPressed");
            if (!this.R0) {
                return;
            }
            if (this.k0.e()) {
                if (S0().c()) {
                    S0().d();
                }
                this.k0.a(BackNavigationInteractionType.HW_BACK_BUTTON_PRESSED);
                return;
            }
            finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        o0 o0Var = new o0(this.B0);
        this.I0 = ij9.c(o0Var);
        setTheme(C0707R.style.res_2132083506_theme_glue_noactionbar);
        long t = ColdStartTracker.t();
        super.onCreate(bundle);
        this.T0 = this.w0.a();
        this.U.p("pmain_create_after_injection");
        this.U.r("dma_onCreateInjection", ColdStartTracker.t() - t);
        Logger.b("onCreate", new Object[0]);
        ColdStartTracker coldStartTracker = this.U;
        l lVar = new l(this, bundle, o0Var);
        coldStartTracker.B("tdma_onCreate");
        lVar.run();
        coldStartTracker.e("tdma_onCreate");
        this.G = this.u0.a(this);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        this.h0.q(this.U0);
        this.Y.a(this.J0);
        this.A0.removeCallbacksAndMessages(null);
        this.B0.c();
        this.H0.d();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, androidx.fragment.app.c, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.G = this.u0.a(this);
        u1(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.S0 = false;
        this.S.e();
        this.T.b();
        this.v0.c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        String c = this.j0.c();
        if (!MoreObjects.isNullOrEmpty(c)) {
            this.M0.f(c);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.S0 = true;
        ColdStartTracker coldStartTracker = this.U;
        coldStartTracker.B("tdma_onResume");
        ColdStartTracker coldStartTracker2 = this.U;
        hi8 hi8 = this.T;
        hi8.getClass();
        coldStartTracker2.B("dma_BookmarkReminder_onResume");
        hi8.c();
        coldStartTracker2.e("dma_BookmarkReminder_onResume");
        coldStartTracker.e("tdma_onResume");
        this.v0.b();
        m0();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBundle("navigation_state", this.h0.s());
        bundle.putParcelable("state_model", this.H0.b());
        bundle.putParcelable("last_referrer", this.G);
        bundle.putInt("initial_orientation", this.O0);
        bundle.putParcelableArrayList("pending_intents", this.z0);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        if (this.j0.u() instanceof SearchFragment) {
            return false;
        }
        startActivity(this.t0.b(this, ViewUris.p0.toString()).a);
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        this.U.p("pmain_start");
        this.H.a(this);
        ColdStartTracker coldStartTracker = this.U;
        k kVar = new k(this);
        coldStartTracker.B("tdma_onStart");
        kVar.run();
        coldStartTracker.e("tdma_onStart");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.R0 = false;
        this.C0.onNext(ufb.a.a);
        this.H0.stop();
        this.S.g();
        this.H.b(this);
        this.h0.q(this.N.c());
        this.h0.q(this.N0);
        this.X.d();
        this.P.b();
    }

    public void p1(MainLayout mainLayout) {
        this.M0 = new p0(this, mainLayout, this.j0, this.k0, new x(this));
    }

    @Override // defpackage.ys2
    public void q1(xs2 xs2) {
        this.h0.g(xs2);
    }

    public /* synthetic */ io.reactivex.v r1(io.reactivex.s sVar) {
        return this.C0;
    }

    public void s1(c cVar, SessionState sessionState) {
        ColdStartTracker coldStartTracker = this.U;
        coldStartTracker.B("dma_registerDialogs");
        this.J.a(cVar);
        coldStartTracker.e("dma_registerDialogs");
        this.L0.getClass();
        ColdStartTracker coldStartTracker2 = this.U;
        m mVar = new m(this, cVar);
        coldStartTracker2.B("dma_BottomSnackBarloadPlayer");
        mVar.run();
        coldStartTracker2.e("dma_BottomSnackBarloadPlayer");
        Intent intent = getIntent();
        ColdStartTracker coldStartTracker3 = this.U;
        o oVar = new o(this, intent);
        coldStartTracker3.B("dma_HandleIntent");
        oVar.run();
        coldStartTracker3.e("dma_HandleIntent");
        y1(cVar, sessionState);
        setVisible(true);
        P();
        this.Q0 = true;
        if (this.T0) {
            T0();
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        super.setRequestedOrientation(i);
        if (!this.P0) {
            Assertion.g("Requesting orientation outside MainActivity plugins is not allowed. Refer to  ForcedOrientationProvider & ForcedOrientationProviderPluginPoint");
        }
        this.P0 = false;
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        Assertion.n();
    }

    /* access modifiers changed from: package-private */
    public void t1(c cVar) {
        Logger.b("MainActivityLifecycle onFlagsChanged", new Object[0]);
        this.F0 = cVar;
        this.K0.a(cVar);
        this.A0.post(this.K0);
        if (!this.o0 && this.O.a(cVar)) {
            this.O0 = 5;
            x1(5);
        }
        this.M0.i();
    }

    @Override // defpackage.ys2
    public void t2(ys2.a aVar) {
        View findViewById = findViewById(C0707R.id.content);
        findViewById.getClass();
        ((MainLayout) findViewById).s0(aVar);
    }

    @Override // defpackage.ys2
    public Fragment u() {
        return this.j0.u();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return this.I0;
    }

    /* access modifiers changed from: package-private */
    public void v1(c cVar, SessionState sessionState) {
        Logger.b("MainActivityLifecycle onLoggedInSessionStarted", new Object[0]);
        this.x0.b(sessionState);
        this.V.a(sessionState.currentUser());
        this.I.a();
        if (!P0() && !this.Q0) {
            Logger.b("tryLoadUiFragments", new Object[0]);
            this.U.p("pmain_start_load_ui");
            ColdStartTracker coldStartTracker = this.U;
            e eVar = new e(this, cVar, sessionState);
            coldStartTracker.B("tdma_tryLoadUiFragments");
            eVar.run();
            coldStartTracker.e("tdma_tryLoadUiFragments");
        }
    }

    /* access modifiers changed from: package-private */
    public void w1(SessionState sessionState) {
        Logger.b("MainActivityLifecycle onSessionStateChanged", new Object[0]);
        this.G0 = sessionState;
    }

    @Override // defpackage.ys2
    public void x2(xs2 xs2) {
        this.h0.q(xs2);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c
    public void z0() {
        super.z0();
        ColdStartTracker coldStartTracker = this.U;
        i iVar = new i(this);
        coldStartTracker.B("dma_onResumeFragments");
        iVar.run();
        coldStartTracker.e("dma_onResumeFragments");
    }
}
