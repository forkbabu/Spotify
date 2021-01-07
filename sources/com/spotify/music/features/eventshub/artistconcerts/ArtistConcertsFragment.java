package com.spotify.music.features.eventshub.artistconcerts;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.C0707R;
import com.spotify.music.artist.uri.ArtistUri;
import com.spotify.music.features.eventshub.locationsearch.f;
import com.spotify.music.features.eventshub.model.ArtistConcertsModel;
import com.spotify.music.features.eventshub.model.ConcertResult;
import com.spotify.music.libs.common.presenter.AbstractViewBinderFragment;
import com.spotify.music.libs.common.presenter.BaseViewBinderFragment;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.remoteconfig.s5;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ArtistConcertsFragment extends AbstractViewBinderFragment<ArtistConcertsModel> implements g {
    public static final /* synthetic */ int H0 = 0;
    String A0;
    e B0;
    private int C0;
    private c D0;
    private final View.OnClickListener E0 = new a();
    private ia0 F0;
    private final View.OnClickListener G0 = new b();
    p05 l0;
    ys2 m0;
    d n0;
    cqe o0;
    yn1 p0;
    f q0;
    y r0;
    t s0;
    BaseViewBinderFragment.a t0;
    s5 u0;
    private List<ConcertResult> v0;
    private List<ConcertResult> w0;
    private List<ConcertResult> x0;
    private RecyclerView y0;
    private twd z0;

    enum Section {
        ARTISTS_CONCERTS_VIRTUAL(C0707R.string.artist_concerts_virtual, 1, 6),
        ARTISTS_CONCERTS_NEAR_USER(C0707R.string.artist_concerts_near_user_location, 2, 7),
        ARTIST_CONCERTS_OTHER_LOCATIONS(C0707R.string.artist_concerts_other_locations, 8, 9);
        
        public final int mBodyId;
        public final int mHeaderId;
        public final int mHeaderResId;

        private Section(int i, int i2, int i3) {
            this.mHeaderResId = i;
            this.mHeaderId = i2;
            this.mBodyId = i3;
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ArtistConcertsFragment.this.B0.k();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RecyclerView.b0 a0 = ArtistConcertsFragment.this.y0.a0(view);
            ConcertResult concertResult = (ConcertResult) view.getTag();
            Boolean nearUser = concertResult.getNearUser();
            nearUser.getClass();
            ArtistConcertsFragment.this.B0.l(a0.w() - ArtistConcertsFragment.this.z0.g0(nearUser.booleanValue() ? 7 : 9), concertResult);
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.music.features.eventshub.artistconcerts.g
    public void I(String str) {
        this.s0.d(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public com.spotify.music.libs.common.presenter.f<ArtistConcertsModel> K4() {
        y yVar = this.r0;
        s<ArtistConcertsModel> P = this.l0.c(this.A0, this.C0, false).P();
        g<SessionState> a2 = this.p0.a();
        a2.getClass();
        e eVar = new e(yVar, P, new v(a2), this.n0, kfd.f);
        this.B0 = eVar;
        return eVar;
    }

    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public BaseViewBinderFragment.a Q4() {
        return this.t0;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public void S4(Parcelable parcelable) {
        String str;
        String str2;
        ArtistConcertsModel artistConcertsModel = (ArtistConcertsModel) parcelable;
        this.m0.k(this, artistConcertsModel.getArtist().getName());
        List<ConcertResult> concerts = artistConcertsModel.getConcerts();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        for (ConcertResult concertResult : concerts) {
            if (concertResult.isVirtual()) {
                this.v0.add(concertResult);
            } else {
                Boolean nearUser = concertResult.getNearUser();
                nearUser.getClass();
                if (nearUser.booleanValue()) {
                    this.w0.add(concertResult);
                } else {
                    this.x0.add(concertResult);
                }
            }
        }
        if (this.u0.a()) {
            List<ConcertResult> list = this.v0;
            Section section = Section.ARTISTS_CONCERTS_VIRTUAL;
            X4(list, section.mHeaderResId, section.mHeaderId, section.mBodyId);
        }
        String userLocation = artistConcertsModel.getUserLocation();
        Section section2 = Section.ARTISTS_CONCERTS_NEAR_USER;
        this.F0 = e90.e().a(B2(), null);
        if (MoreObjects.isNullOrEmpty(userLocation)) {
            str2 = V2(C0707R.string.artist_concerts_near_you);
            str = V2(C0707R.string.artist_concerts_no_concerts_near_you);
        } else {
            String W2 = W2(section2.mHeaderResId, userLocation);
            str = W2(C0707R.string.artist_concerts_no_concerts_near_user_location, userLocation);
            str2 = W2;
        }
        this.F0.setTitle(str2);
        this.F0.i1(true);
        this.z0.Z(new v02(this.F0.getView(), true), section2.mHeaderId);
        int dimension = (int) R2().getDimension(C0707R.dimen.std_8dp);
        if (this.w0.isEmpty()) {
            LinearLayout linearLayout = new LinearLayout(F2());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            linearLayout.setGravity(1);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setPadding(dimension, 0, dimension, dimension);
            TextView f = com.spotify.android.paste.app.c.f(F2());
            f.setTextSize(2, 14.0f);
            f.setTextColor(androidx.core.content.a.b(F2(), C0707R.color.glue_row_subtitle_color));
            f.setText(str);
            linearLayout.addView(f);
            this.z0.Z(new v02(linearLayout, true), 3);
        }
        LinearLayout linearLayout2 = new LinearLayout(F2());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout2.setGravity(17);
        linearLayout2.setPadding(0, 0, 0, dimension);
        linearLayout2.setLayoutParams(layoutParams2);
        Button d = com.spotify.android.paste.app.c.d(B2());
        d.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        d.setText(B2().getString(C0707R.string.events_hub_location_button_text));
        d.setOnClickListener(this.E0);
        linearLayout2.addView(d);
        this.z0.Z(new v02(linearLayout2, false), 4);
        Calendar e = this.o0.e();
        if (this.w0.size() > 0) {
            this.z0.Z(new t05(B2(), this.w0, this.G0, e, new d15(R2()), this.o0), section2.mBodyId);
        }
        List<ConcertResult> list2 = this.x0;
        Section section3 = Section.ARTIST_CONCERTS_OTHER_LOCATIONS;
        X4(list2, section3.mHeaderResId, section3.mHeaderId, section3.mBodyId);
        LinearLayout linearLayout3 = new LinearLayout(F2());
        linearLayout3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout3.setGravity(3);
        int dimension2 = (int) R2().getDimension(C0707R.dimen.std_8dp);
        linearLayout3.setPadding(dimension2, dimension2, dimension2, dimension2);
        linearLayout3.setLayoutParams(layoutParams3);
        TextView f2 = com.spotify.android.paste.app.c.f(B2());
        f2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        f2.setTextColor(androidx.core.content.a.b(F2(), C0707R.color.glue_row_subtitle_color));
        f2.setText(B2().getString(C0707R.string.artist_concerts_browse_all_concerts_text));
        linearLayout3.addView(f2);
        TextView f3 = com.spotify.android.paste.app.c.f(B2());
        f3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        f3.setText(B2().getString(C0707R.string.artist_concerts_browse_all_concerts_button_text));
        f3.setOnClickListener(new a(this));
        linearLayout3.addView(f3);
        this.z0.Z(new v02(linearLayout3, false), 5);
        this.y0.setAdapter(this.z0);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.AbstractViewBinderFragment
    public View U4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(B2(), null);
        this.y0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(B2()));
        int dimensionPixelSize = F2().getResources().getDimensionPixelSize(C0707R.dimen.content_area_horizontal_margin);
        this.y0.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.y0.k(new v05((int) R2().getDimension(C0707R.dimen.concerts_list_bottom_padding)), -1);
        this.z0 = new twd(true);
        return this.y0;
    }

    /* access modifiers changed from: protected */
    public void X4(List<ConcertResult> list, int i, int i2, int i3) {
        if (!list.isEmpty()) {
            ia0 a2 = e90.e().a(B2(), null);
            a2.setTitle(R2().getString(i));
            this.z0.Z(new v02(a2.getView(), true), i2);
            this.z0.Z(new t05(B2(), list, this.G0, this.o0.e(), new d15(R2()), this.o0), i3);
        }
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return this.D0;
    }

    @Override // com.spotify.music.features.eventshub.artistconcerts.g
    public void j(ConcertResult concertResult) {
        StringBuilder V0 = je.V0("spotify:concert:");
        V0.append(concertResult.getConcert().getId());
        this.s0.d(V0.toString());
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.D0 = (c) k4().getParcelable("artist_uri");
        this.A0 = new ArtistUri(this.D0.toString()).a();
        this.C0 = this.q0.a().mGeonameId;
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.CONCERTS_ARTIST, null);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.f;
    }
}
