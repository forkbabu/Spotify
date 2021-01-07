package com.spotify.music.features.radio.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.flags.d;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.ContentViewManager;
import com.spotify.music.features.radio.common.AbstractContentFragment;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.c;
import com.spotify.music.spotlets.radio.service.RadioStateObserver;
import com.spotify.music.spotlets.radio.service.c0;
import com.spotify.music.spotlets.radio.service.j0;
import com.squareup.picasso.Picasso;

public class CollectionRadioFragment extends AbstractContentFragment<c, RecyclerView> {
    public static final String G0 = ViewUris.o1.toString();
    cqe A0;
    private c0 B0;
    private com.spotify.android.flags.c C0;
    private String D0;
    n28 E0;
    private b38 F0;
    PlayerStateCompat w0;
    Picasso x0;
    fg0 y0;
    jz1 z0;

    class a extends b38 {
        a(PlayerStateCompat playerStateCompat) {
            super(playerStateCompat);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b38
        public boolean f(LegacyPlayerState legacyPlayerState, LegacyPlayerState legacyPlayerState2) {
            return b38.e(legacyPlayerState, legacyPlayerState2);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b38
        public void g(LegacyPlayerState legacyPlayerState) {
            CollectionRadioFragment.this.D0 = agd.b(legacyPlayerState.entityUri());
            CollectionRadioFragment collectionRadioFragment = CollectionRadioFragment.this;
            collectionRadioFragment.E0.c0(collectionRadioFragment.D0);
        }
    }

    class b implements RadioStateObserver {
        b() {
        }

        @Override // com.spotify.music.spotlets.radio.service.RadioStateObserver
        public void a(j0 j0Var) {
        }

        @Override // com.spotify.music.spotlets.radio.service.RadioStateObserver
        public void b(RadioStateObserver.FailureState failureState) {
            CollectionRadioFragment collectionRadioFragment = CollectionRadioFragment.this;
            String str = CollectionRadioFragment.G0;
            collectionRadioFragment.h0.b();
        }

        @Override // com.spotify.music.spotlets.radio.service.RadioStateObserver
        public void c(RadioStationsModel radioStationsModel) {
            CollectionRadioFragment collectionRadioFragment = CollectionRadioFragment.this;
            String str = CollectionRadioFragment.G0;
            if (collectionRadioFragment.h0 != null) {
                if (!(radioStationsModel == null || (radioStationsModel.recommendedStations().isEmpty() && radioStationsModel.genreStations().isEmpty()))) {
                    c cVar = null;
                    if (radioStationsModel.savedStations().size() > 0) {
                        cVar = c.a(radioStationsModel.savedStations());
                    }
                    CollectionRadioFragment.this.h0.a(cVar);
                }
            }
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.collection_start_stations_title);
    }

    @Override // com.spotify.music.features.radio.common.AbstractContentFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        bundle.putString("playing-station-seed", this.D0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        c0 c0Var = this.B0;
        if (c0Var != null) {
            c0Var.i();
        }
        this.F0.c();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        c0 c0Var = this.B0;
        if (c0Var != null) {
            c0Var.j();
        }
        this.F0.d();
    }

    @Override // com.spotify.music.features.radio.common.AbstractContentFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        this.B0 = new c0(l4().getApplicationContext(), new b(), getClass().getSimpleName(), this.y0);
    }

    /* Return type fixed from 'android.view.View' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public /* bridge */ /* synthetic */ RecyclerView Q4(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return h5();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Parcelable, android.view.View] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public /* bridge */ /* synthetic */ void U4(c cVar, RecyclerView recyclerView) {
        i5(cVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public void V4(gb0 gb0, ContentViewManager.ContentState contentState) {
        if (contentState == ContentViewManager.ContentState.EMPTY_CONTENT) {
            if (x.f(B2())) {
                gb0.D2().b(false);
            } else {
                gb0.D2().b(true);
            }
            gb0.getSubtitleView().setVisibility(8);
            gb0.b2(false);
            return;
        }
        gb0.b2(false);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public void Z4(AbstractContentFragment.d<c> dVar) {
        this.B0.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public void b5(ContentViewManager.b bVar) {
        bVar.b(C0707R.string.error_no_connection_title, C0707R.string.error_no_connection_body);
        bVar.a(SpotifyIconV2.RADIO, C0707R.string.collection_stations_empty_title, C0707R.string.collection_stations_empty_body);
        bVar.c(C0707R.string.your_radio_stations_backend_error_title, C0707R.string.your_radio_stations_backend_error_body);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        return ViewUris.o1;
    }

    /* access modifiers changed from: protected */
    public RecyclerView h5() {
        androidx.fragment.app.c j4 = j4();
        o28 o28 = new o28(j4, kfd.A, this.C0, this.q0, this.z0, true, this.A0);
        this.E0 = new n28(j4, null, o28.g(), this.q0, this.x0);
        n28 n28 = new n28(j4, null, o28.g(), this.q0, this.x0);
        this.E0 = n28;
        n28.c0(this.D0);
        RecyclerView recyclerView = new RecyclerView(j4(), null);
        recyclerView.setLayoutManager(new LinearLayoutManager(j4().getApplicationContext()));
        recyclerView.setAdapter(this.E0);
        return recyclerView;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return G0;
    }

    /* access modifiers changed from: protected */
    public void i5(c cVar) {
        this.E0.b0(cVar.b());
    }

    @Override // com.spotify.music.features.radio.common.AbstractContentFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (bundle != null) {
            this.D0 = bundle.getString("playing-station-seed");
        }
        this.C0 = d.c(this);
        this.F0 = new a(this.w0);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.COLLECTION_RADIO, null);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.A;
    }
}
