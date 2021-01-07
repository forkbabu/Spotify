package com.spotify.music.features.radio.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.t;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.ContentViewManager;
import com.spotify.music.features.radio.common.AbstractContentFragment;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.x;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.service.RadioStateObserver;
import com.spotify.music.spotlets.radio.service.c0;
import com.spotify.music.spotlets.radio.service.j0;
import com.spotify.rxjava2.q;
import com.squareup.picasso.Picasso;
import io.reactivex.functions.g;

public class RadioFragment extends AbstractContentFragment<RadioStationsModel, ListView> implements NavigationItem, x {
    public static final /* synthetic */ int N0 = 0;
    private m28 A0;
    private w28<l28> B0;
    private String C0;
    private c D0;
    private c0 E0;
    private final q F0 = new q();
    PlayerStateCompat G0;
    t H0;
    zk4 I0;
    DisplayMetrics J0;
    Picasso K0;
    fg0 L0;
    jz1 M0;
    private final g<SessionState> w0 = new g(this);
    private b38 x0;
    private v42 y0;
    private m28 z0;

    class a extends b38 {
        a(PlayerStateCompat playerStateCompat) {
            super(playerStateCompat);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b38
        public boolean f(LegacyPlayerState legacyPlayerState, LegacyPlayerState legacyPlayerState2) {
            if (b38.e(legacyPlayerState, legacyPlayerState2)) {
                return true;
            }
            if (legacyPlayerState.isPaused() != legacyPlayerState2.isPaused()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.b38
        public void g(LegacyPlayerState legacyPlayerState) {
            if (RadioFragment.this.z0 != null) {
                RadioFragment.this.z0.l0(legacyPlayerState.entityUri());
                RadioFragment.this.z0.j0(!legacyPlayerState.isPaused());
                RadioFragment.this.z0.z();
            }
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
            RadioFragment radioFragment = RadioFragment.this;
            int i = RadioFragment.N0;
            radioFragment.h0.b();
        }

        @Override // com.spotify.music.spotlets.radio.service.RadioStateObserver
        public void c(RadioStationsModel radioStationsModel) {
            RadioFragment radioFragment = RadioFragment.this;
            int i = RadioFragment.N0;
            radioFragment.h0.a(radioStationsModel);
        }
    }

    private m28 g5(int i, int i2, boolean z) {
        m28 m28 = new m28(j4(), ViewUris.c, z, this.D0, this.q0, this.K0, this.M0, fqe.a);
        int a2 = nud.a(this.J0.widthPixels, 3, R2().getDimensionPixelSize(C0707R.dimen.radio_cover_cat_height), nud.g(64.0f, R2()), R2().getDimensionPixelOffset(C0707R.dimen.radio_cover_items_cat_right_gap), 1.0f);
        RecyclerView recyclerView = new RecyclerView(j4(), null);
        recyclerView.setLayoutParams(new AbsListView.LayoutParams(-1, a2));
        if (i2 == 1 || i2 == 2) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
            recyclerView.setLayoutManager(linearLayoutManager);
            int dimensionPixelSize = R2().getDimensionPixelSize(C0707R.dimen.hugs_card_row_gap);
            recyclerView.k(new l(this, recyclerView, linearLayoutManager, dimensionPixelSize, dimensionPixelSize / 2), -1);
        }
        recyclerView.setAdapter(m28);
        this.y0.d(new w02(recyclerView), R2().getString(i), i2);
        return m28;
    }

    @Override // com.spotify.music.navigation.x
    public boolean C0() {
        return false;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        String str = this.C0;
        return str == null ? context.getString(C0707R.string.radio_title) : str;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.x0.c();
        this.F0.a(this.p0.a().subscribe(this.w0, f.a));
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.F0.c();
        this.x0.d();
        this.E0.j();
    }

    @Override // com.spotify.music.features.radio.common.AbstractContentFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        P4().i().setText(C0707R.string.header_radio_button_get_premium);
        P4().b2(true);
        androidx.fragment.app.c j4 = j4();
        P4().i().setOnClickListener(new e(this, j4));
        this.E0 = new c0(j4.getApplicationContext(), new b(), getClass().getSimpleName(), this.L0);
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public /* bridge */ /* synthetic */ ListView Q4(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return h5(viewGroup);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public boolean S4(RadioStationsModel radioStationsModel) {
        RadioStationsModel radioStationsModel2 = radioStationsModel;
        return radioStationsModel2 == null || (radioStationsModel2.userStations().isEmpty() && radioStationsModel2.recommendedStations().isEmpty() && radioStationsModel2.genreStations().isEmpty());
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public boolean T4(SessionState sessionState) {
        return super.T4(sessionState) && sessionState.canStream();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Parcelable, android.view.View] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public /* bridge */ /* synthetic */ void U4(RadioStationsModel radioStationsModel, ListView listView) {
        j5(radioStationsModel);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public void V4(gb0 gb0, ContentViewManager.ContentState contentState) {
        int i = 0;
        boolean z = contentState == ContentViewManager.ContentState.SERVICE_WARNING && this.H0.e();
        Button i2 = P4().i();
        if (!z) {
            i = 8;
        }
        i2.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public void X4(SessionState sessionState) {
        this.E0.j();
        if (sessionState.canStream()) {
            super.X4(sessionState);
        }
    }

    @Override // com.spotify.music.navigation.x
    public boolean Y() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public void Y4(SessionState sessionState) {
        super.Y4(sessionState);
        this.E0.i();
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public void Z4(AbstractContentFragment.d<RadioStationsModel> dVar) {
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public void b5(ContentViewManager.b bVar) {
        bVar.b(C0707R.string.error_no_connection_title, C0707R.string.header_radio_offline_body);
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.RADIO;
        bVar.a(spotifyIconV2, C0707R.string.error_general_title, C0707R.string.error_general_body);
        bVar.c(C0707R.string.your_radio_stations_backend_error_title, C0707R.string.your_radio_stations_backend_error_body);
        bVar.d(spotifyIconV2, C0707R.string.header_radio_not_available_in_region_title, C0707R.string.header_radio_not_available_in_region_body);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public boolean c5() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public boolean d5() {
        return false;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        return ViewUris.c;
    }

    public ListView h5(ViewGroup viewGroup) {
        ListView listView = new ListView(viewGroup.getContext());
        androidx.fragment.app.c j4 = j4();
        v42 v42 = new v42(j4);
        this.y0 = v42;
        v42.n(new k(this, j4));
        this.z0 = g5(C0707R.string.radio_section_your_stations_station_entity, 1, true);
        this.A0 = g5(C0707R.string.radio_section_recommended_stations, 2, false);
        w28<l28> w28 = new w28<>(j4, new l28(j4, this.q0), R2().getInteger(C0707R.integer.genre_list_columns));
        this.B0 = w28;
        this.y0.b(w28, C0707R.string.radio_section_genres, 3);
        this.y0.k(1, 2, 3);
        listView.setAdapter((ListAdapter) this.y0);
        return listView;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "radio";
    }

    public /* synthetic */ void i5(SessionState sessionState) {
        j4().G0();
        N4().k(!sessionState.canStream());
    }

    /* access modifiers changed from: protected */
    public void j5(RadioStationsModel radioStationsModel) {
        this.z0.i0(radioStationsModel.userStations());
        this.y0.p(1);
        if (this.z0.u() == 0) {
            this.y0.k(1);
        }
        this.A0.i0(radioStationsModel.recommendedStations());
        this.y0.p(2);
        this.B0.e().setNotifyOnChange(false);
        this.B0.e().clear();
        this.B0.e().addAll(radioStationsModel.genreStations());
        this.B0.e().notifyDataSetChanged();
        this.y0.p(3);
    }

    @Override // com.spotify.music.navigation.NavigationItem
    public NavigationItem.NavigationGroup k0() {
        return NavigationItem.NavigationGroup.FIND;
    }

    @Override // com.spotify.music.features.radio.common.AbstractContentFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.C0 = k4().getString("title");
        this.D0 = d.c(this);
        this.x0 = new a(this.G0);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.RADIO, null);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.a1;
    }
}
