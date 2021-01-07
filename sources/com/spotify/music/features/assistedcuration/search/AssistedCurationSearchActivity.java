package com.spotify.music.features.assistedcuration.search;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarManager;
import com.spotify.android.paste.app.d;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import com.spotify.music.libs.adaptiveui.di.OrientationMode;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.SimpleNavigationManager;
import com.spotify.rxjava2.q;
import defpackage.ys2;
import io.reactivex.g;
import java.util.ArrayList;

public class AssistedCurationSearchActivity extends ss2 implements ys2 {
    public static final /* synthetic */ int X = 0;
    OrientationMode G;
    SimpleNavigationManager H;
    SnackbarManager I;
    w J;
    o0 K;
    g<SessionState> L;
    private ws2 M;
    private Intent N;
    private SessionState O;
    private Optional<Boolean> P = Optional.absent();
    private ToolbarManager Q;
    private ArrayList<String> R;
    private ArrayList<String> S = new ArrayList<>();
    private String T;
    private final q U = new q();
    private final View.OnClickListener V = new a();
    private final xs2 W = new b();

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AssistedCurationSearchActivity.this.H.d(SimpleNavigationManager.NavigationType.UP);
        }
    }

    class b implements xs2 {
        b() {
        }

        @Override // defpackage.xs2
        public void a(Fragment fragment, String str) {
            AssistedCurationSearchActivity.this.Q.b(ToolbarConfig.f(fragment) == ToolbarConfig.Visibility.HIDE);
            AssistedCurationSearchActivity.this.Q.g(!AssistedCurationSearchActivity.this.H.c());
            AssistedCurationSearchActivity.this.Q.f();
        }
    }

    public static void V0(AssistedCurationSearchActivity assistedCurationSearchActivity, SessionState sessionState) {
        assistedCurationSearchActivity.getClass();
        if (sessionState != null && ood.a(sessionState)) {
            if (assistedCurationSearchActivity.O == null) {
                assistedCurationSearchActivity.O = sessionState;
                if (assistedCurationSearchActivity.N == null) {
                    assistedCurationSearchActivity.N = m.b(assistedCurationSearchActivity, ViewUris.p0.toString(), null);
                }
                assistedCurationSearchActivity.onNewIntent(assistedCurationSearchActivity.N);
                return;
            }
            assistedCurationSearchActivity.O = sessionState;
        }
    }

    @Override // defpackage.ys2
    public void A0(ys2.a aVar) {
    }

    @Override // defpackage.vs2
    public void I1(ws2 ws2) {
        this.M = ws2;
    }

    @Override // com.spotify.android.glue.components.toolbar.d
    public void P() {
    }

    @Override // com.spotify.android.glue.components.toolbar.d
    public u R() {
        return this.Q;
    }

    /* access modifiers changed from: package-private */
    public void W0(boolean z) {
        if (this.P.isPresent()) {
            this.P = Optional.of(Boolean.valueOf(z));
            return;
        }
        this.P = Optional.of(Boolean.valueOf(z));
        if (this.N == null) {
            this.N = m.b(this, ViewUris.p0.toString(), null);
        }
        onNewIntent(this.N);
    }

    @Override // defpackage.ys2
    public void k(Fragment fragment, String str) {
        this.Q.setTitle(str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ws2 ws2 = this.M;
        if ((ws2 == null || !ws2.b()) && !this.H.d(SimpleNavigationManager.NavigationType.BACK)) {
            super.onBackPressed();
            finish();
        }
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_assisted_curation_search);
        setRequestedOrientation(this.G.d());
        com.spotify.android.goldenpath.a.b(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(C0707R.id.toolbar_wrapper);
        c c = l70.c(this, viewGroup);
        e eVar = (e) c;
        d.d(eVar.getView(), this);
        viewGroup.addView(eVar.getView());
        ToolbarManager toolbarManager = new ToolbarManager(this, c, this.V);
        this.Q = toolbarManager;
        toolbarManager.h(true);
        if (bundle != null) {
            bundle.setClassLoader(getClassLoader());
            this.N = (Intent) bundle.getParcelable("key_last_intent");
            this.O = (SessionState) bundle.getParcelable("key_last_session");
            String string = bundle.getString("key_last_nft");
            if (string != null && (string.equals("true") || string.equals("false"))) {
                this.P = Optional.of(Boolean.valueOf(Boolean.parseBoolean(string)));
            }
            Bundle bundle2 = bundle.getBundle("key_navigation");
            if (bundle2 != null) {
                this.H.h(bundle2);
            }
            this.R = bundle.getStringArrayList("track_uris_to_ignore");
            this.S = bundle.getStringArrayList("added_tracks");
            this.T = bundle.getString("playlist_title");
            return;
        }
        this.R = getIntent().getStringArrayListExtra("track_uris_to_ignore");
        this.T = getIntent().getStringExtra("playlist_title");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, androidx.fragment.app.c, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            if ("close_search".equals(intent.getAction())) {
                setResult(0);
                finish();
            } else if (intent.getDataString() != null) {
                if ("add_track".equals(intent.getAction())) {
                    String dataString = intent.getDataString();
                    ArrayList<String> arrayList = this.R;
                    if (arrayList == null || !arrayList.contains(dataString)) {
                        ArrayList<String> arrayList2 = this.R;
                        if (arrayList2 != null) {
                            arrayList2.add(dataString);
                        }
                        this.S.add(dataString);
                        Intent intent2 = new Intent();
                        intent2.putStringArrayListExtra("added_tracks", this.S);
                        setResult(-1, intent2);
                        finish();
                    } else if (!this.P.isPresent() || !this.P.get().booleanValue()) {
                        this.K.d(C0707R.string.assisted_curation_duplicates_toast_body, this.T);
                    } else {
                        SnackbarConfiguration build = SnackbarConfiguration.builder(getString(C0707R.string.assisted_curation_duplicates_toast_body, new Object[]{this.T})).build();
                        if (this.I.isAttached()) {
                            this.I.show(build);
                        } else {
                            this.I.showOnNextAttach(build);
                        }
                    }
                } else if (this.O == null || !this.P.isPresent()) {
                    this.N = intent;
                } else {
                    SimpleNavigationManager simpleNavigationManager = this.H;
                    String dataString2 = intent.getDataString();
                    String stringExtra = intent.getStringExtra("ac_search_title");
                    SessionState sessionState = this.O;
                    sessionState.getClass();
                    simpleNavigationManager.g(dataString2, stringExtra, sessionState, this.P.get().booleanValue(), bu9.b, intent.getExtras());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("key_last_intent", this.N);
        bundle.putParcelable("key_last_session", this.O);
        bundle.putString("key_last_nft", String.valueOf(this.P.orNull()));
        bundle.putBundle("key_navigation", this.H.i());
        bundle.putStringArrayList("track_uris_to_ignore", this.R);
        bundle.putStringArrayList("added_tracks", this.S);
        bundle.putString("playlist_title", this.T);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.U.a(this.L.subscribe(new a(this)));
        this.U.a(this.J.b().j0(d.a).E().subscribe(new c(this)));
        this.H.a(this.W);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        this.H.e(this.W);
        this.U.c();
        super.onStop();
    }

    @Override // defpackage.ys2
    public void q1(xs2 xs2) {
    }

    @Override // defpackage.ys2
    public void t2(ys2.a aVar) {
    }

    @Override // defpackage.ys2
    public Fragment u() {
        return this.H.b();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.ASSISTED_CURATION_SEARCH, ViewUris.G.toString());
    }

    @Override // defpackage.ys2
    public void x2(xs2 xs2) {
    }
}
