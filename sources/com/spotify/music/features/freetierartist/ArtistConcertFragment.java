package com.spotify.music.features.freetierartist;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Charsets;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.artist.model.ArtistModel;
import com.spotify.music.navigation.t;
import com.squareup.picasso.Picasso;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ArtistConcertFragment extends ArtistAboutFragment {
    public static final /* synthetic */ int N0 = 0;
    private TextView A0;
    private Button B0;
    private ImageView C0;
    private TextView D0;
    private TextView E0;
    private TextView F0;
    private Button G0;
    private TextView H0;
    private TextView I0;
    private ImageView J0;
    private String K0;
    Picasso L0;
    t M0;
    private final SimpleDateFormat x0 = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
    private final SimpleDateFormat y0 = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.getDefault());
    private ImageView z0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context.getString(C0707R.string.mobile_artists_concert_title);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public void S4(Parcelable parcelable) {
        ArtistModel.Concert concert;
        ArtistModel artistModel = (ArtistModel) parcelable;
        List<ArtistModel.Concert> list = artistModel.upcomingConcerts;
        String str = this.K0;
        Iterator<ArtistModel.Concert> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                concert = null;
                break;
            }
            concert = it.next();
            if (rw.equal(concert.id, str)) {
                break;
            }
        }
        if (concert == null) {
            f1(new Exception(String.format("Concert(%s) doesn't exist.", this.K0)));
            return;
        }
        ArtistModel.ArtistInfo artistInfo = artistModel.info;
        String d = gf0.d(concert.venue + ", " + concert.city, Charsets.UTF_8);
        if (!artistInfo.portraits.isEmpty()) {
            this.r0.h(this.z0, artistInfo.portraits.get(0).uri);
        }
        String str2 = artistInfo.name;
        this.p0.k(this, str2 + ' ' + B2().getString(C0707R.string.mobile_artists_concert_title));
        this.A0.setText(str2);
        this.B0.setText(str2.toUpperCase(Locale.getDefault()));
        this.B0.setOnClickListener(new f(this, artistModel));
        try {
            Date parse = this.x0.parse(concert.localtime);
            s42.b(this.C0, this.w0).d(parse, Locale.getDefault());
            this.E0.setText(this.y0.format(parse));
        } catch (ParseException e) {
            Logger.o(e, "Failed to parse date [%s] with formatter [%s]", concert.localtime, this.x0);
        }
        this.D0.setText(concert.title);
        this.F0.setText(W2(C0707R.string.mobile_artist_concert_location, concert.venue, concert.city));
        this.H0.setText(concert.venue);
        this.I0.setText(concert.city);
        this.L0.m("https://maps.googleapis.com/maps/api/staticmap?center=" + d + "&zoom=13&scale=2&size=600x300&maptype=roadmap&sensor=false&markers=color:red%7C" + d).n(this.J0, null);
        this.J0.setOnClickListener(new g(this, d));
        this.G0.setOnClickListener(new h(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.AbstractViewBinderFragment
    public View U4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.mobile_artist_concert_cat, viewGroup, false);
        this.A0 = (TextView) inflate.findViewById(C0707R.id.artist_name);
        this.z0 = (ImageView) inflate.findViewById(C0707R.id.image);
        this.B0 = (Button) inflate.findViewById(C0707R.id.go_to_artist);
        this.C0 = (ImageView) inflate.findViewById(C0707R.id.calendar);
        this.D0 = (TextView) inflate.findViewById(C0707R.id.concert_title);
        this.E0 = (TextView) inflate.findViewById(C0707R.id.concert_date);
        this.F0 = (TextView) inflate.findViewById(C0707R.id.full_venue_address);
        this.G0 = (Button) inflate.findViewById(C0707R.id.tickets);
        this.H0 = (TextView) inflate.findViewById(C0707R.id.venue_name);
        this.I0 = (TextView) inflate.findViewById(C0707R.id.venue_city);
        this.J0 = (ImageView) inflate.findViewById(C0707R.id.map);
        return inflate;
    }

    @Override // com.spotify.music.features.freetierartist.ArtistAboutFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.K0 = k4().getString("songkick_id");
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.CONCERTS_CONCERT, null);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.e;
    }
}
