package com.spotify.music.features.freetierallsongsdialog;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Optional;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarManager;
import com.spotify.android.paste.app.d;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import defpackage.ifd;
import defpackage.q45;
import java.util.ArrayList;
import java.util.List;

public class FreeTierAllSongsDialogActivity extends ss2 implements mfd, c.a, r45, ifd.b, b55, b4<p45>, q45.b {
    public static final /* synthetic */ int X = 0;
    a55 G;
    q45 H;
    b42 I;
    private RecyclerView J;
    private View K;
    private Parcelable L;
    private com.spotify.android.glue.components.toolbar.c M;
    private ToolbarManager N;
    private twd O;
    private LoadingView P;
    private ArrayList<com.spotify.music.freetiercommon.models.a> Q;
    private String R;
    private String S;
    private Optional<Boolean> T = Optional.absent();
    private TextView U;
    private TextView V;
    private final View.OnClickListener W = new a();

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FreeTierAllSongsDialogActivity.this.G.e();
        }
    }

    public String W0() {
        return this.S;
    }

    public String X0() {
        return this.R;
    }

    public ArrayList<com.spotify.music.freetiercommon.models.a> a1() {
        return this.Q;
    }

    public void b1() {
        if (this.P.p()) {
            this.P.n();
        }
        Parcelable parcelable = this.L;
        if (parcelable != null) {
            this.J.post(new a(this, parcelable));
            this.L = null;
        }
    }

    public /* synthetic */ void c1(Parcelable parcelable) {
        RecyclerView.m layoutManager = this.J.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.h1(parcelable);
        }
    }

    public void d1(List<com.spotify.music.freetiercommon.models.a> list) {
        if (!list.isEmpty()) {
            this.H.g0(list);
            this.O.l0(2, 1);
            return;
        }
        this.O.i0(1, 2);
    }

    public void f1(boolean z) {
        this.V.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.FREE_TIER_ALL_SONGS_DIALOG;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.P;
    }

    public void i1(com.spotify.music.freetiercommon.models.a aVar, int i) {
        this.G.i(aVar, i);
    }

    public void j1(com.spotify.music.freetiercommon.models.a aVar, int i) {
        this.G.j(aVar, i);
    }

    public void k1(com.spotify.music.freetiercommon.models.a aVar, int i) {
        this.G.k(aVar, i);
    }

    public void m1(com.spotify.music.freetiercommon.models.a aVar, int i) {
        this.G.l(aVar, i);
    }

    public void n1(boolean z) {
        this.H.f0(z);
    }

    public void o1(String str) {
        this.U.setText(str);
        this.N.setTitle(str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.G.d();
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.R = bundle.getString("tracks_title", null);
            this.S = bundle.getString("context_uri", null);
            this.L = bundle.getParcelable("list");
            this.Q = bundle.getParcelableArrayList("tracks");
            if (bundle.containsKey("available_tracks_only")) {
                this.T = Optional.of(Boolean.valueOf(bundle.getBoolean("available_tracks_only")));
            }
        } else {
            this.R = getIntent().getStringExtra("tracks_title");
            this.S = getIntent().getStringExtra("context_uri");
            this.Q = getIntent().getParcelableArrayListExtra("tracks");
            if (getIntent().hasExtra("available_tracks_only")) {
                this.T = Optional.of(Boolean.valueOf(getIntent().getBooleanExtra("available_tracks_only", false)));
            }
        }
        super.onCreate(bundle);
        if (this.Q == null) {
            Assertion.p("A list of tracks provided. Did you use createIntent()?");
        }
        setContentView(C0707R.layout.activity_all_songs);
        com.spotify.android.goldenpath.a.b(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0707R.id.recycler_view);
        this.J = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        FrameLayout frameLayout = (FrameLayout) findViewById(C0707R.id.toolbar_wrapper);
        com.spotify.android.glue.components.toolbar.c c = l70.c(this, frameLayout);
        this.M = c;
        d.d(((e) c).getView(), this);
        frameLayout.addView(this.M.getView(), 0);
        ToolbarManager toolbarManager = new ToolbarManager(this, this.M, this.W);
        this.N = toolbarManager;
        toolbarManager.h(true);
        this.N.g(true);
        this.N.o(0.0f);
        View inflate = LayoutInflater.from(this).inflate(C0707R.layout.free_tier_all_songs_header, (ViewGroup) this.J, false);
        this.U = (TextView) inflate.findViewById(C0707R.id.title);
        TextView textView = (TextView) inflate.findViewById(C0707R.id.subtitle);
        this.V = textView;
        textView.setVisibility(8);
        this.K = inflate;
        twd twd = new twd(false);
        this.O = twd;
        twd.Z(new v02(this.K, true), 0);
        this.O.i0(0);
        ia0 d = e90.e().d(this, null);
        d.setTitle(getString(C0707R.string.free_tier_section_header_includes));
        this.O.Z(new v02(d.getView(), true), 1);
        this.O.Z(this.H, 2);
        this.O.l0(0);
        this.O.i0(1, 2);
        this.J.setAdapter(this.O);
        this.J.n(new c(this));
        this.P = LoadingView.m(getLayoutInflater(), this, this.J);
        ((CoordinatorLayout) findViewById(C0707R.id.content)).addView(this.P);
        ((CoordinatorLayout.e) this.P.getLayoutParams()).c = 17;
        this.P.r();
        this.J.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        RecyclerView recyclerView = this.J;
        if (recyclerView != null) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            bundle.putParcelable("list", layoutManager.i1());
        }
        bundle.putString("tracks_title", this.R);
        bundle.putParcelableArrayList("tracks", this.Q);
        bundle.putString("context_uri", this.S);
        if (this.T.isPresent()) {
            bundle.putBoolean("available_tracks_only", this.T.or((Optional<Boolean>) Boolean.FALSE).booleanValue());
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.G.g();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        this.G.h();
        super.onStop();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.mobile.android.ui.contextmenu.b4
    public r3 p0(p45 p45) {
        return this.G.f(p45, this.I);
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.FREE_TIER_ALL_SONGS_DIALOG, ViewUris.P.toString());
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.j0;
    }
}
