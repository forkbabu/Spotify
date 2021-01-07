package com.spotify.music.features.eventshub.concertentity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.patterns.prettylist.compat.c;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.b0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.hubframework.defaults.playback.i;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.ui.h;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.features.eventshub.eventshub.EventsHubFragment;
import com.spotify.music.features.eventshub.model.Concert;
import com.spotify.music.features.eventshub.model.ConcertEntityModel;
import com.spotify.music.features.eventshub.model.ConcertPartner;
import com.spotify.music.features.eventshub.model.ConcertResult;
import com.spotify.music.features.eventshub.model.ConcertTicketing;
import com.spotify.music.libs.common.presenter.AbstractViewBinderFragment;
import com.spotify.music.libs.common.presenter.BaseViewBinderFragment;
import com.spotify.music.libs.common.presenter.f;
import com.spotify.music.navigation.t;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.HeaderView;
import com.spotify.ubi.specification.factories.i0;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ConcertEntityFragment extends AbstractViewBinderFragment<ConcertEntityModel> implements k, ToolbarConfig.b, yod, d0 {
    public static final /* synthetic */ int T0 = 0;
    jzc A0;
    w51 B0;
    m C0;
    jz1 D0;
    ys2 E0;
    cqe F0;
    yn1 G0;
    h H0;
    y I0;
    t J0;
    BaseViewBinderFragment.a K0;
    ere L0;
    i0 M0;
    boolean N0;
    private h O0;
    private com.spotify.android.glue.patterns.prettylist.compat.c<com.spotify.android.glue.patterns.prettylist.compat.h> P0;
    private RecyclerView Q0;
    private final View.OnClickListener R0 = new a();
    private final View.OnClickListener S0 = new b();
    twd l0;
    private TextView m0;
    private TextView n0;
    Button o0;
    private boolean p0;
    int q0;
    TicketInfoViewHolder r0;
    TextView s0;
    private com.spotify.music.libs.viewuri.c t0;
    private String u0;
    private List<y05> v0 = Collections.emptyList();
    c w0;
    p05 x0;
    i y0;
    Calendar z0;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int w = ConcertEntityFragment.this.Q0.a0(view).w() - ConcertEntityFragment.this.l0.g0(6);
            ConcertEntityFragment.this.O0.o(Integer.valueOf(w), (ConcertResult) view.getTag());
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ConcertEntityFragment.this.O0.m();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ConcertEntityFragment.this.O0.n();
        }
    }

    private boolean X4() {
        return !this.N0 && x.f(j4());
    }

    @Override // com.spotify.music.features.eventshub.concertentity.k
    public void D(Uri uri) {
        B2().startActivity(new Intent("android.intent.action.VIEW", uri));
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.music.features.eventshub.concertentity.k
    public void E0() {
        this.J0.d(EventsHubFragment.x0);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.b
    public boolean G() {
        return !X4();
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public f<ConcertEntityModel> K4() {
        g gVar = new g(this.D0, kfd.t0.getName(), this.t0.toString(), this.L0, this.M0, this.F0);
        y yVar = this.I0;
        s<ConcertEntityModel> P = this.x0.a(this.u0).P();
        g<SessionState> a2 = this.G0.a();
        a2.getClass();
        h hVar = new h(yVar, P, new v(a2), gVar, new d15(B2().getResources()));
        this.O0 = hVar;
        return hVar;
    }

    @Override // defpackage.yod
    public Uri L0() {
        return Uri.parse(this.t0.toString());
    }

    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.y0.g();
    }

    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        this.y0.h();
        this.w0.a();
        super.P3();
    }

    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public BaseViewBinderFragment.a Q4() {
        return this.K0;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public void S4(Parcelable parcelable) {
        String str;
        ConcertEntityModel concertEntityModel = (ConcertEntityModel) parcelable;
        this.E0.P();
        this.P0.j().setText(this.O0.k(concertEntityModel));
        Concert concert = concertEntityModel.getConcertResult().getConcert();
        concert.getClass();
        boolean isVirtual = concert.isVirtual();
        this.o0.setText(isVirtual ? C0707R.string.events_hub_concert_entity_find_virtual_events_button : C0707R.string.events_hub_concert_entity_find_tickets_button);
        String venue = concert.getVenue();
        String location = concert.getLocation();
        String dateString = concert.getDateString();
        Locale locale = new Locale(SpotifyLocale.e());
        Date date = null;
        if (dateString != null) {
            date = j.a(dateString, "yyyy-MM-dd'T'HH:mm:ss", locale, this.z0);
        }
        String d = j.d(venue, location, isVirtual);
        Calendar calendar = this.z0;
        calendar.setTime(date);
        if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
            str = DateFormat.format("EEE, MMM dd", date).toString();
        } else {
            str = java.text.DateFormat.getDateInstance(0, locale).format(date);
        }
        boolean z = true;
        String join = TextUtils.join(" • ", new String[]{str, j.c(date, calendar, locale)});
        String ticketAvailability = concertEntityModel.getTicketAvailability();
        this.m0.setText(join);
        this.n0.setText(d);
        List<ConcertPartner> partnerConcerts = concert.getPartnerConcerts();
        List<ConcertTicketing> ticketing = concert.getTicketing();
        String str2 = "";
        String partnerId = (partnerConcerts == null || partnerConcerts.isEmpty()) ? str2 : partnerConcerts.get(0).getPartnerId();
        if (ticketing != null && !ticketing.isEmpty()) {
            str2 = ticketing.get(0).getMinPrice();
        }
        Calendar e = this.F0.e();
        if (date == null || !date.before(e.getTime())) {
            this.r0.a(partnerId, ticketAvailability, str2, isVirtual);
        } else {
            this.s0.setText(C0707R.string.events_hub_concert_entity_past_concert);
            Y4(false);
        }
        if (!(ticketAvailability == null || ticketAvailability.isEmpty()) && ticketAvailability.equals(ConcertEntityModel.TICKETS_NOT_AVAILABLE)) {
            z = false;
        }
        Y4(z);
        this.Q0.k(new w05(this.q0), -1);
        this.O0.getClass();
        this.H0.c(this.P0.e(), Uri.parse(concertEntityModel.getConcertResult().getConcert().getImageUri()), (dwd) this.P0.a());
        for (y05 y05 : this.v0) {
            y05.a(concertEntityModel);
        }
        ImageView f = this.P0.f();
        f.getClass();
        s42 b2 = s42.b(f, this.F0);
        Resources R2 = R2();
        int g = nud.g((float) C0707R.dimen.concert_entity_calendar_icon_size, R2);
        b2.a().setLayoutParams(new ViewGroup.LayoutParams(g, g));
        ((TextView) b2.a().findViewById(C0707R.id.month)).setTextSize(0, R2.getDimension(C0707R.dimen.concert_entity_header_calendar_month_text_size));
        ((TextView) b2.a().findViewById(C0707R.id.day)).setTextSize(0, R2.getDimension(C0707R.dimen.concert_entity_header_calendar_day_text_size));
        b2.d(date, locale);
        this.Q0.setAdapter(this.l0);
        this.w0.b(F2(), Uri.parse(concertEntityModel.getConcertResult().getClickThroughUrl()));
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.AbstractViewBinderFragment
    public View U4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        c.C0149c cVar;
        ConcertResult concertResult;
        ConcertEntityModel concertEntityModel = (ConcertEntityModel) N4();
        boolean isVirtual = (concertEntityModel == null || (concertResult = concertEntityModel.getConcertResult()) == null || concertResult.getConcert() == null) ? false : concertResult.isVirtual();
        Button button = (Button) com.spotify.android.paste.app.c.b(B2(), Button.class, null, C0707R.attr.glueButtonPrimaryWhite);
        this.o0 = button;
        button.setText(isVirtual ? C0707R.string.events_hub_concert_entity_find_virtual_events_button : C0707R.string.events_hub_concert_entity_find_tickets_button);
        this.o0.setOnClickListener(new c());
        if (X4()) {
            cVar = com.spotify.android.glue.patterns.prettylist.compat.c.c(B2());
            this.p0 = true;
        } else {
            cVar = com.spotify.android.glue.patterns.prettylist.compat.c.b(B2());
            this.p0 = false;
        }
        HeaderView headerView = new HeaderView(B2(), null);
        c.a<com.spotify.android.glue.patterns.prettylist.compat.h> c2 = cVar.b().c();
        c2.e(true);
        c2.f(this.o0);
        c2.g(headerView);
        this.P0 = c2.a(this);
        Context F2 = F2();
        int dimension = (int) F2.getResources().getDimension(C0707R.dimen.concert_entity_calendar_icon_size);
        headerView.setImageSize(dimension);
        ImageView f = this.P0.f();
        f.getClass();
        ((FrameLayout) f.getParent()).setLayoutParams(new LinearLayout.LayoutParams(dimension, dimension));
        LinearLayout b2 = this.P0.j().b();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        b2.setLayoutParams(layoutParams);
        b2.setOrientation(1);
        int b3 = androidx.core.content.a.b(F2(), C0707R.color.glue_row_subtitle_color);
        int dimension2 = (int) F2.getResources().getDimension(C0707R.dimen.concert_entity_subtitle_text_line_spacing);
        TextView f2 = com.spotify.android.paste.app.c.f(F2);
        this.m0 = f2;
        j.e(f2, F2, b3);
        b2.addView(this.m0);
        TextView f3 = com.spotify.android.paste.app.c.f(F2);
        this.n0 = f3;
        j.e(f3, F2, b3);
        b2.addView(this.n0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.n0.getLayoutParams();
        layoutParams2.setMargins(0, dimension2, 0, dimension2);
        this.n0.setLayoutParams(layoutParams2);
        TicketInfoViewHolder ticketInfoViewHolder = new TicketInfoViewHolder(F2(), this.p0);
        this.r0 = ticketInfoViewHolder;
        b2.addView(ticketInfoViewHolder.d);
        TextView f4 = com.spotify.android.paste.app.c.f(F2);
        this.s0 = f4;
        j.e(f4, F2, b3);
        b2.addView(this.s0);
        RecyclerView g = this.P0.g();
        this.Q0 = g;
        g.setLayoutManager(this.C0.create());
        this.Q0.k(new v05((int) R2().getDimension(C0707R.dimen.concerts_list_bottom_padding)), -1);
        this.l0 = new twd(true);
        ImageView f5 = this.P0.f();
        f5.getClass();
        f5.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.v0 = Collections.unmodifiableList(Arrays.asList(new z05(B2(), this.l0, this.B0, this.y0, e90.e().a(B2(), null)), new x05(B2(), this.l0, this.B0, e90.e().a(B2(), null)), new a15(B2(), this.l0, this.z0, this.R0, this.S0, e90.e().a(B2(), null), this.F0)));
        return this.P0.i();
    }

    /* access modifiers changed from: package-private */
    public void Y4(boolean z) {
        if (z) {
            this.P0.n(this.o0);
            this.q0 = (int) R2().getDimension(C0707R.dimen.concerts_entity_recyclerview_top_padding);
            return;
        }
        this.o0.setVisibility(8);
        this.P0.n(null);
        this.q0 = 0;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        String str;
        String str2;
        Uri uri;
        if (e3()) {
            com.spotify.android.glue.patterns.prettylist.compat.c<com.spotify.android.glue.patterns.prettylist.compat.h> cVar = this.P0;
            if (cVar != null) {
                cVar.k(a0Var, B2());
            }
            ConcertEntityModel concertEntityModel = (ConcertEntityModel) N4();
            String str3 = "";
            Uri parse = !TextUtils.isEmpty(str3) ? Uri.parse(str3) : Uri.EMPTY;
            if (concertEntityModel != null) {
                String k = this.O0.k(concertEntityModel);
                if (!concertEntityModel.getArtists().isEmpty()) {
                    str3 = concertEntityModel.getArtists().get(0).getImageUri();
                }
                Uri parse2 = !TextUtils.isEmpty(str3) ? Uri.parse(str3) : Uri.EMPTY;
                str = concertEntityModel.getConcertResult().getConcert().getVenue();
                str2 = k;
                uri = parse2;
            } else {
                str2 = str3;
                str = str2;
                uri = parse;
            }
            a0Var.c(str3, SpotifyIconV2.ARTIST, true);
            a0Var.h(str2);
            a0Var.i(str);
            String cVar2 = this.t0.toString();
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(a0Var.getContext(), SpotifyIconV2.SHARE_ANDROID, (float) a0Var.getContext().getResources().getDimensionPixelSize(C0707R.dimen.toolbar_icon_size));
            b0 d = a0Var.d(C0707R.id.actionbar_item_share_concert, a0Var.getContext().getString(C0707R.string.actionbar_item_share));
            d.setIcon(spotifyIconDrawable);
            d.a(new a(this, cVar2, uri, str2, str));
        }
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        return this.t0;
    }

    @Override // com.spotify.music.features.eventshub.concertentity.k
    public void j(ConcertResult concertResult) {
        StringBuilder V0 = je.V0("spotify:concert:");
        V0.append(concertResult.getConcert().getId());
        this.J0.d(V0.toString());
    }

    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        Parcelable parcelable = k4().getParcelable("concert_uri");
        parcelable.getClass();
        this.t0 = (com.spotify.music.libs.viewuri.c) parcelable;
        String string = k4().getString("concert_id");
        string.getClass();
        this.u0 = string;
        super.p3(context);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        u4(true);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.CONCERTS_CONCERT, null);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void v3(Menu menu, MenuInflater menuInflater) {
        ToolbarConfig.c(this, menu);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        this.H0.a();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.t0;
    }
}
