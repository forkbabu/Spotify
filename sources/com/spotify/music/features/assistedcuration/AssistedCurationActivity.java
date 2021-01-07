package com.spotify.music.features.assistedcuration;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.paste.app.d;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.libs.adaptiveui.di.OrientationMode;
import com.spotify.music.libs.assistedcuration.b;
import com.spotify.music.libs.performance.tracking.h0;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import com.spotify.rxjava2.q;
import defpackage.a2a;
import defpackage.ifd;
import io.reactivex.s;
import java.util.Map;
import java.util.Set;

public class AssistedCurationActivity extends ss2 implements c.a, mfd, r34, ifd.b {
    v14 G;
    a2a.a H;
    wec I;
    h0 J;
    Map<String, x1a> K;
    b L;
    OrientationMode M;
    t0<s<com.spotify.music.libs.assistedcuration.presenter.s>> N;
    PageLoaderView.a<s<com.spotify.music.libs.assistedcuration.presenter.s>> O;
    private u14 P;
    private a2a Q;
    private ImageButton R;
    private String S;
    private ImmutableList<String> T;
    private String U;
    private x1a V;
    private SpotifyIconV2 W;
    private String X;
    private Optional<Integer> Y;
    private ViewLoadingTracker Z;
    final q a0 = new q();

    class a implements ToolbarSearchFieldView.e {
        a() {
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
        public void a() {
            AssistedCurationActivity.this.P.e();
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
        public void b() {
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
        public void c() {
        }
    }

    public static Intent V0(Context context, String str, int i, String str2, SpotifyIconV2 spotifyIconV2, String str3, String... strArr) {
        Intent y = je.y(context, AssistedCurationActivity.class, "uri", str);
        y.putExtra("custom_card_order", strArr);
        y.putExtra("max_items_in_playlist", i);
        y.putExtra("custom_track_handler", str2);
        y.putExtra("custom_track_accessory_icon", spotifyIconV2);
        y.putExtra("description", str3);
        return y;
    }

    @Override // defpackage.r34
    public void D(Set<String> set, String str) {
        this.I.c(set, str, 1);
    }

    @Override // defpackage.r34
    public void G() {
        finish();
    }

    @Override // defpackage.r34
    public a2a L() {
        if (this.Q == null) {
            this.Q = this.H.a(PageIdentifiers.ASSISTED_CURATION, this.V);
        }
        return this.Q;
    }

    @Override // defpackage.r34
    public u14 N() {
        if (this.P == null) {
            this.P = this.G.b(PageIdentifiers.ASSISTED_CURATION, this);
        }
        return this.P;
    }

    public ImmutableList<String> W0() {
        return this.T;
    }

    @Override // defpackage.r34
    public void X(com.spotify.music.libs.assistedcuration.presenter.s sVar) {
        this.Z.g();
        this.Q.n(sVar);
    }

    public SpotifyIconV2 X0() {
        return this.W;
    }

    public String a() {
        return this.S;
    }

    public String a1() {
        return this.X;
    }

    public Optional<Integer> b1() {
        return this.Y;
    }

    public /* synthetic */ void c1(View view) {
        this.P.d();
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.ASSISTED_CURATION;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.U.b(this.S);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1 && intent != null) {
            this.Q.i(intent.getStringArrayListExtra("added_tracks"));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.P.c();
        super.onBackPressed();
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        x1a x1a;
        ImmutableList<String> immutableList;
        Optional<Integer> optional;
        ImmutableList<String> immutableList2;
        Optional<Integer> optional2;
        if (bundle != null) {
            this.S = bundle.getString("uri");
            String[] stringArray = bundle.getStringArray("custom_card_order");
            if (stringArray == null) {
                immutableList2 = ImmutableList.of();
            } else {
                immutableList2 = ImmutableList.copyOf(stringArray);
            }
            this.T = immutableList2;
            this.U = bundle.getString("custom_track_handler");
            this.W = (SpotifyIconV2) bundle.getSerializable("custom_track_accessory_icon");
            this.X = bundle.getString("description");
            int i = bundle.getInt("max_items_in_playlist", 0);
            if (i > 0) {
                optional2 = Optional.of(Integer.valueOf(i));
            } else {
                optional2 = Optional.absent();
            }
            this.Y = optional2;
        } else {
            Intent intent = getIntent();
            this.S = intent.getStringExtra("uri");
            String[] stringArrayExtra = intent.getStringArrayExtra("custom_card_order");
            if (stringArrayExtra == null) {
                immutableList = ImmutableList.of();
            } else {
                immutableList = ImmutableList.copyOf(stringArrayExtra);
            }
            this.T = immutableList;
            this.U = intent.getStringExtra("custom_track_handler");
            this.W = (SpotifyIconV2) intent.getSerializableExtra("custom_track_accessory_icon");
            this.X = intent.getStringExtra("description");
            int intExtra = intent.getIntExtra("max_items_in_playlist", 0);
            if (intExtra > 0) {
                optional = Optional.of(Integer.valueOf(intExtra));
            } else {
                optional = Optional.absent();
            }
            this.Y = optional;
        }
        super.onCreate(bundle);
        setRequestedOrientation(this.M.d());
        if (this.P == null) {
            this.P = this.G.b(PageIdentifiers.ASSISTED_CURATION, this);
        }
        if (this.K.get(this.U) != null) {
            x1a = this.K.get(this.U);
        } else {
            x1a = this.K.get("PlaylistTrackHandler");
        }
        this.V = x1a;
        if (MoreObjects.isNullOrEmpty(this.S)) {
            Assertion.p("No playlist uri provided. Did you use createIntent()?");
        }
        setContentView(C0707R.layout.activity_assisted_curation);
        com.spotify.android.goldenpath.a.b(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(C0707R.id.toolbar_wrapper);
        e eVar = (e) l70.c(this, viewGroup);
        eVar.setTitle(getString(C0707R.string.assisted_curation_title_add_songs));
        d.d(eVar.getView(), this);
        viewGroup.addView(eVar.getView());
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(this);
        this.R = stateListAnimatorImageButton;
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        stateListAnimatorImageButton.setBackground(null);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this, SpotifyIconV2.ARROW_LEFT, (float) getResources().getDimensionPixelSize(C0707R.dimen.toolbar_icon_size));
        spotifyIconDrawable.r(androidx.core.content.a.b(getBaseContext(), R.color.white));
        this.R.setImageDrawable(spotifyIconDrawable);
        this.R.setContentDescription(getString(C0707R.string.generic_content_description_close));
        this.R.setOnClickListener(new a(this));
        eVar.H1(ToolbarSide.START, this.R, C0707R.id.toolbar_up_button);
        if (this.L.b().isPresent()) {
            TextView textView = (TextView) findViewById(C0707R.id.description);
            textView.setText(this.L.b().get());
            textView.setVisibility(0);
        }
        ((ToolbarSearchFieldView) findViewById(C0707R.id.search_toolbar)).setToolbarSearchFieldCallbacks(new a());
        ViewGroup viewGroup2 = (ViewGroup) findViewById(C0707R.id.contentContainer);
        PageLoaderView<s<com.spotify.music.libs.assistedcuration.presenter.s>> a2 = this.O.a(this);
        a2.j0(this, this.N);
        viewGroup2.addView(a2);
        a2.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        if (this.Q == null) {
            this.Q = this.H.a(PageIdentifiers.ASSISTED_CURATION, this.V);
        }
        if (bundle != null) {
            this.Q.d(bundle);
        }
        this.Z = this.J.b(viewGroup2.getRootView(), getViewUri().toString(), bundle, u0());
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
        this.Z.t(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.N.start();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.N.stop();
        this.Z.f();
        this.V.stop();
        this.a0.c();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.ASSISTED_CURATION, getViewUri().toString());
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.h;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("uri", this.S);
        bundle.putStringArray("custom_card_order", (String[]) this.T.toArray(new String[0]));
        bundle.putInt("max_items_in_playlist", this.Y.or((Optional<Integer>) 0).intValue());
        bundle.putString("custom_track_handler", this.U);
        bundle.putSerializable("custom_track_accessory_icon", this.W);
        bundle.putString("description", this.X);
        this.Q.f(bundle);
    }
}
