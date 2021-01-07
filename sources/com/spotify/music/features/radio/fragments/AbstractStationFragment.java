package com.spotify.music.features.radio.fragments;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import com.google.common.base.MoreObjects;
import com.spotify.android.flags.d;
import com.spotify.android.glue.patterns.prettylist.compat.i;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.n;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.ContentViewManager;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.radio.common.AbstractContentFragment;
import com.spotify.music.sociallistening.participantlist.impl.m;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.service.RadioActionsService;
import com.spotify.music.spotlets.radio.service.RadioStateObserver;
import com.spotify.music.spotlets.radio.service.c0;
import com.spotify.music.spotlets.radio.service.j0;
import com.spotify.paste.widgets.HeaderView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;

public abstract class AbstractStationFragment<T extends i> extends AbstractContentFragment<RadioStationModel, View> implements d0 {
    public static final /* synthetic */ int V0 = 0;
    private String A0;
    c0 B0;
    private com.spotify.android.glue.patterns.prettylist.compat.c<T> C0;
    private v42 D0;
    private n E0;
    private com.spotify.android.flags.c F0;
    private q28 G0;
    Player H0;
    PlayerStateCompat I0;
    ExplicitContentFacade J0;
    y K0;
    b42 L0;
    Picasso M0;
    fg0 N0;
    nfd O0;
    zec P0;
    boolean Q0;
    private io.reactivex.disposables.b R0;
    private io.reactivex.disposables.b S0;
    private boolean T0;
    private final AdapterView.OnItemClickListener U0 = new a();
    private String w0;
    private String x0;
    private f38 y0;
    protected View z0;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int i2;
            int headerViewsCount = i - AbstractStationFragment.this.C0.h().getListView().getHeaderViewsCount();
            if (headerViewsCount >= 0 && (i2 = AbstractStationFragment.this.D0.i(headerViewsCount)) == 1) {
                int f = AbstractStationFragment.this.D0.f(headerViewsCount, i2);
                if (z42.C(AbstractStationFragment.this.F0)) {
                    Assertion.e(AbstractStationFragment.this.G0);
                    PlayerTrack[] g = AbstractStationFragment.this.G0.g();
                    Parcelable O4 = AbstractStationFragment.this.O4();
                    O4.getClass();
                    RadioStationModel radioStationModel = (RadioStationModel) O4;
                    RadioStationModel radioStationModel2 = new RadioStationModel(radioStationModel, new RadioStationTracksModel(g, agd.j(radioStationModel.nextPageUrl, g)));
                    PlayerTrack playerTrack = g[f];
                    if (!PlayerTrackUtil.isExplicit(playerTrack) || !AbstractStationFragment.this.T0) {
                        AbstractStationFragment.this.a5(radioStationModel2);
                        AbstractStationFragment abstractStationFragment = AbstractStationFragment.this;
                        nfd nfd = abstractStationFragment.O0;
                        com.spotify.music.libs.viewuri.c viewUri = abstractStationFragment.getViewUri();
                        AbstractStationFragment.this.getClass();
                        nfd.d(radioStationModel2, viewUri, kfd.a1, m.b(AbstractStationFragment.this), f);
                        return;
                    }
                    AbstractStationFragment.this.J0.e(playerTrack.uri(), AbstractStationFragment.this.w0);
                    return;
                }
                ShufflePlayHeaderView.a(AbstractStationFragment.this.E0, AbstractStationFragment.this.y0.n(false));
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
        }

        @Override // com.spotify.music.spotlets.radio.service.RadioStateObserver
        public void c(RadioStationsModel radioStationsModel) {
            AbstractStationFragment.this.A5(radioStationsModel);
        }
    }

    class c implements hg0<RadioActionsService.a> {
        final /* synthetic */ g a;
        final /* synthetic */ g b;

        c(g gVar, g gVar2) {
            this.a = gVar;
            this.b = gVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.hg0
        public void l(RadioActionsService.a aVar) {
            AbstractStationFragment.this.S0.dispose();
            AbstractStationFragment abstractStationFragment = AbstractStationFragment.this;
            abstractStationFragment.S0 = abstractStationFragment.B0.r(abstractStationFragment.getViewUri()).o0(AbstractStationFragment.this.K0).subscribe(this.a, this.b);
            AbstractStationFragment.this.B0.q(this);
        }

        @Override // defpackage.hg0
        public void onDisconnected() {
            AbstractStationFragment.this.B0.q(this);
        }
    }

    public AbstractStationFragment() {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.R0 = emptyDisposable;
        this.S0 = emptyDisposable;
    }

    /* access modifiers changed from: protected */
    public abstract void A5(RadioStationsModel radioStationsModel);

    /* access modifiers changed from: protected */
    public abstract void B5(RadioStationModel radioStationModel);

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return MoreObjects.isNullOrEmpty(this.A0) ? context.getString(C0707R.string.radio_title) : this.A0;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.y0.g();
        q28 q28 = this.G0;
        if (q28 != null) {
            q28.d();
        }
        this.C0.j().a(this.A0);
        this.B0.i();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.y0.i();
        q28 q28 = this.G0;
        if (q28 != null) {
            q28.e();
        }
        this.B0.j();
        this.S0.dispose();
        this.R0.dispose();
    }

    @Override // com.spotify.music.features.radio.common.AbstractContentFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        this.B0 = new c0(j4().getApplicationContext(), new b(), getClass().getSimpleName(), this.N0);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public View Q4(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        androidx.fragment.app.c j4 = j4();
        HeaderView headerView = new HeaderView(j4, null);
        if (x5()) {
            this.C0 = r5(true, headerView, this.F0);
        } else {
            this.z0 = this.y0.n(false);
            this.C0 = r5(false, headerView, this.F0);
        }
        this.C0.q(null);
        this.C0.h().getListView().setOnItemClickListener(this.U0);
        this.C0.h().getListView().setOnItemLongClickListener(new j42(j4, getViewUri()));
        return this.C0.i();
    }

    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public void Z4(AbstractContentFragment.d<RadioStationModel> dVar) {
        dVar.getClass();
        h hVar = new h(dVar);
        a aVar = new a(dVar);
        if (this.B0.l()) {
            this.S0.dispose();
            this.S0 = this.B0.r(getViewUri()).o0(this.K0).subscribe(hVar, aVar);
            return;
        }
        this.B0.p(new c(hVar, aVar));
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.radio.common.AbstractContentFragment
    public void b5(ContentViewManager.b bVar) {
        bVar.b(C0707R.string.error_no_connection_title, C0707R.string.error_no_connection_body);
        bVar.a(SpotifyIconV2.RADIO, C0707R.string.radio_station_entity_error_title, C0707R.string.radio_station_entity_error_body);
        bVar.c(C0707R.string.radio_station_entity_error_title, C0707R.string.radio_station_entity_error_body);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        if (x5()) {
            this.y0.w(a0Var);
            this.y0.n(true);
        }
        com.spotify.android.glue.patterns.prettylist.compat.c<T> cVar = this.C0;
        if (cVar != null) {
            cVar.k(a0Var, B2());
        }
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        Parcelable parcelable = k4().getParcelable("StationFragment.station_uri");
        parcelable.getClass();
        return (com.spotify.music.libs.viewuri.c) parcelable;
    }

    /* access modifiers changed from: protected */
    public RadioStationModel q5(RadioStationModel radioStationModel) {
        return new RadioStationModel(radioStationModel.uri, radioStationModel.title, radioStationModel.titleUri, radioStationModel.imageUri, radioStationModel.playlistUri, radioStationModel.subtitle, radioStationModel.subtitleUri, radioStationModel.seeds, radioStationModel.relatedArtists, radioStationModel.tracks, radioStationModel.nextPageUrl, radioStationModel.explicitSave);
    }

    /* access modifiers changed from: protected */
    public abstract com.spotify.android.glue.patterns.prettylist.compat.c<T> r5(boolean z, HeaderView headerView, com.spotify.android.flags.c cVar);

    @Override // com.spotify.music.features.radio.common.AbstractContentFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        Bundle k4 = k4();
        com.spotify.music.libs.viewuri.c viewUri = getViewUri();
        String string = k4.getString("StationFragment.station_title");
        String cVar = viewUri.toString();
        this.w0 = cVar;
        this.A0 = string;
        this.x0 = agd.d(cVar);
        super.s3(bundle);
        this.F0 = d.c(this);
        u4(true);
        this.E0 = new n();
        k4.getString("username", "");
    }

    /* access modifiers changed from: protected */
    public void s5(v42 v42) {
    }

    /* access modifiers changed from: protected */
    public v42 t5() {
        return this.D0;
    }

    /* access modifiers changed from: protected */
    public com.spotify.android.glue.patterns.prettylist.compat.c<T> u5() {
        return this.C0;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        ToolbarConfig.c(this, menu);
    }

    /* access modifiers changed from: protected */
    public String v5() {
        return this.w0;
    }

    @Override // com.spotify.music.features.radio.common.AbstractContentFragment, androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.F0 = d.c(this);
        this.y0 = new f38(j4(), getViewUri(), viewGroup, C0707R.string.header_play_radio, C0707R.string.header_pause_radio, x5(), kfd.q1, m.b(this), this.H0, this.I0, this.O0, this.P0.d());
        return super.w3(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w5 */
    public boolean S4(RadioStationModel radioStationModel) {
        return radioStationModel == null || (MoreObjects.isNullOrEmpty(radioStationModel.title) && MoreObjects.isNullOrEmpty(radioStationModel.titleUri));
    }

    /* access modifiers changed from: protected */
    public boolean x5() {
        return !this.Q0 && x.f(j4());
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        q28 q28 = this.G0;
        super.y3();
    }

    public /* synthetic */ void y5(Boolean bool) {
        this.T0 = bool.booleanValue();
        q28 q28 = this.G0;
        if (q28 != null) {
            q28.h().c(bool.booleanValue());
        }
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.a1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z5 */
    public void U4(RadioStationModel radioStationModel, View view) {
        Drawable drawable;
        q28 q28 = this.G0;
        if (q28 != null) {
            q28.e();
            this.G0.getClass();
        }
        q28 q282 = new q28(j4(), this.x0, getViewUri(), this.F0, this.L0, this.I0, k4().getLong("StationFragment.station_random"));
        this.G0 = q282;
        q282.d();
        this.D0 = new v42(B2());
        this.R0.dispose();
        this.R0 = this.J0.c().o0(this.K0).subscribe(new c(this), b.a);
        s5(this.D0);
        this.D0.c(q282.h(), z42.C(this.F0) ? C0707R.string.station_track_list_header : C0707R.string.station_track_list_header_mft, 1, null, LayoutInflater.from(B2()).inflate(C0707R.layout.station_footer, (ViewGroup) this.C0.h().getListView(), false));
        this.C0.h().getListView().setAdapter((ListAdapter) this.D0);
        this.M0.l(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY).o(rwd.h(this.C0.e(), (dwd) this.C0.a()));
        l0 z = l0.z(this.x0);
        LinkType q = z.q();
        androidx.fragment.app.c j4 = j4();
        int ordinal = q.ordinal();
        if (ordinal == 6) {
            int i = yc0.b;
            drawable = yc0.c(j4, SpotifyIcon.ALBUM_32, Float.NaN, true, false);
        } else if (ordinal == 34) {
            drawable = yc0.b(j4, SpotifyIcon.BROWSE_32);
        } else if (ordinal == 101) {
            drawable = yc0.d(j4, SpotifyIconV2.MIX, (float) nud.g(32.0f, j4.getResources()));
        } else if (ordinal == 185 || ordinal == 210) {
            drawable = yc0.f(j4);
        } else if (ordinal != 273) {
            drawable = yc0.a(j4);
        } else {
            drawable = yc0.r(j4);
        }
        ImageView f = this.C0.f();
        if (z.q() == LinkType.ARTIST) {
            f.getClass();
            z l = this.M0.l(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY);
            l.t(drawable);
            l.g(drawable);
            l.o(rwd.c(f));
            f.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            z l2 = this.M0.l(!TextUtils.isEmpty(radioStationModel.imageUri) ? Uri.parse(radioStationModel.imageUri) : Uri.EMPTY);
            l2.t(drawable);
            l2.g(drawable);
            l2.n(f, null);
        }
        this.C0.j().a(radioStationModel.title);
        B5(radioStationModel);
        k4().putString("StationFragment.station_title", radioStationModel.title);
        RadioStationModel q5 = q5(radioStationModel);
        a5(q5);
        PlayerTrack[] playerTrackArr = q5.tracks;
        if (playerTrackArr == null || playerTrackArr.length == 0) {
            this.D0.k(1);
        } else {
            Assertion.e(this.G0);
            this.G0.h().clear();
            this.G0.c(playerTrackArr);
        }
        this.y0.x(q5);
    }
}
