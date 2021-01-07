package com.spotify.music.features.creatorartist;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.android.glue.patterns.toolbarmenu.h0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.view.ExpandableEllipsizeTextView;
import com.spotify.mobile.android.util.ui.h;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.artist.uri.ArtistUri;
import com.spotify.music.features.creatorartist.k;
import com.spotify.music.features.creatorartist.model.ArtistBioSection;
import com.spotify.music.features.creatorartist.model.CreatorAboutModel;
import com.spotify.music.features.creatorartist.model.Image;
import com.spotify.music.features.creatorartist.model.a;
import com.spotify.music.features.creatorartist.view.ArtistBiographyImageView;
import com.spotify.music.libs.artistbio.view.MonthlyListenersView;
import com.spotify.music.libs.common.presenter.AbstractViewBinderFragment;
import com.spotify.music.libs.common.presenter.BaseViewBinderFragment;
import com.spotify.music.libs.common.presenter.f;
import com.spotify.music.libs.viewuri.c;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager;
import com.spotify.paste.widgets.carousel.CarouselView;
import com.squareup.picasso.Picasso;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;
import java.util.List;

public class BiographyFragment extends AbstractViewBinderFragment<CreatorAboutModel> implements j, k.a, d0 {
    public static final /* synthetic */ int N0 = 0;
    jz1 A0;
    ere B0;
    yn1 C0;
    ys2 D0;
    h0 E0;
    vka F0;
    h G0;
    Picasso H0;
    y I0;
    BaseViewBinderFragment.a J0;
    a K0;
    private d L0;
    boolean M0;
    private CarouselView l0;
    private ExpandableEllipsizeTextView m0;
    private View n0;
    private TextView o0;
    private u90 p0;
    private u90 q0;
    private u90 r0;
    private u90 s0;
    private u90 t0;
    private ArtistUri u0;
    private c v0;
    v42 w0;
    h x0;
    MonthlyListenersView y0;
    tka z0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.x0.n();
    }

    @Override // androidx.fragment.app.Fragment
    public void J3(Menu menu) {
        if (this.x0.l()) {
            ToolbarConfig.c(this, menu);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public f<CreatorAboutModel> K4() {
        y yVar = this.I0;
        s<CreatorAboutModel> P = this.K0.a(this.u0.a()).P();
        g<SessionState> a = this.C0.a();
        a.getClass();
        h hVar = new h(yVar, P, new v(a), this.u0, this.L0, this, new k(this), this.M0);
        this.x0 = hVar;
        return hVar;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.x0.o();
    }

    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public BaseViewBinderFragment.a Q4() {
        return this.J0;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.BaseViewBinderFragment
    public void S4(Parcelable parcelable) {
        CreatorAboutModel creatorAboutModel = (CreatorAboutModel) parcelable;
        this.D0.k(this, creatorAboutModel.name());
        this.y0.a(creatorAboutModel.monthlyListeners(), creatorAboutModel.globalChartPosition());
        this.w0.p(ArtistBioSection.MONTHLY_LISTENERS.d());
        this.L0.f(this.u0.toString(), "about");
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.common.presenter.AbstractViewBinderFragment
    public View U4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.creator_bio, viewGroup, false);
        ListView listView = (ListView) inflate.findViewById(16908298);
        this.w0 = new v42(B2());
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C0707R.layout.creatorartist_monthlylisteners, new FrameLayout(F2()), true);
        MonthlyListenersView monthlyListenersView = (MonthlyListenersView) frameLayout.findViewById(C0707R.id.monthly_listeners_view);
        this.y0 = monthlyListenersView;
        ((FrameLayout.LayoutParams) monthlyListenersView.getLayoutParams()).topMargin = F2().getResources().getDimensionPixelOffset(C0707R.dimen.std_16dp);
        this.n0 = inflate.findViewById(C0707R.id.creatorbio_landscape_gallery);
        if (!this.M0) {
            FrameLayout frameLayout2 = (FrameLayout) layoutInflater.inflate(C0707R.layout.artist_carousel, (ViewGroup) listView, false);
            this.l0 = (CarouselView) frameLayout2.findViewById(C0707R.id.cover_art_carousel);
            f fVar = new f(this, CarouselLayoutManager.MeasureMode.SQUARE);
            fVar.d2(new com.spotify.paste.widgets.carousel.f(F2()));
            this.l0.setLayoutManager(fVar);
            this.l0.setItemAnimator(new com.spotify.paste.widgets.carousel.c());
            this.w0.d(new w02(frameLayout2), null, ArtistBioSection.GALLERY.d());
        }
        ExpandableEllipsizeTextView expandableEllipsizeTextView = (ExpandableEllipsizeTextView) layoutInflater.inflate(C0707R.layout.creatorartist_biography, (ViewGroup) listView, false);
        this.m0 = expandableEllipsizeTextView;
        expandableEllipsizeTextView.setMovementMethod(LinkMovementMethod.getInstance());
        nud.p(F2(), this.m0, C0707R.attr.pasteTextAppearanceArticle);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.autobiography, (ViewGroup) listView, false);
        TextView textView = (TextView) viewGroup2.findViewById(C0707R.id.autobiography);
        this.o0 = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        nud.p(F2(), this.o0, C0707R.attr.pasteTextAppearanceArticle);
        u90 e = e90.d().e(F2(), listView);
        this.p0 = e;
        View view = e.getView();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), F2().getResources().getDimensionPixelOffset(C0707R.dimen.std_16dp));
        viewGroup2.addView(this.p0.getView());
        ViewGroup viewGroup3 = (ViewGroup) layoutInflater.inflate(C0707R.layout.social_links, (ViewGroup) listView, false);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(F2(), SpotifyIconV2.INSTAGRAM, F2().getResources().getDimension(C0707R.dimen.social_link_icon_size));
        u90 e2 = e90.d().e(F2(), listView);
        this.t0 = e2;
        e2.getView().setVisibility(8);
        this.t0.Z().setText(C0707R.string.creator_artist_instagram_label);
        this.t0.getImageView().setImageDrawable(spotifyIconDrawable);
        this.t0.getImageView().getLayoutParams().height = F2().getResources().getDimensionPixelOffset(C0707R.dimen.std_24dp);
        this.t0.getImageView().getLayoutParams().width = F2().getResources().getDimensionPixelOffset(C0707R.dimen.std_24dp);
        viewGroup3.addView(this.t0.getView());
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(F2(), SpotifyIconV2.TWITTER, F2().getResources().getDimension(C0707R.dimen.social_link_icon_size));
        u90 e3 = e90.d().e(F2(), listView);
        this.s0 = e3;
        e3.getView().setVisibility(8);
        this.s0.Z().setText(C0707R.string.creator_artist_twitter_label);
        this.s0.getImageView().setImageDrawable(spotifyIconDrawable2);
        this.s0.getImageView().getLayoutParams().height = F2().getResources().getDimensionPixelOffset(C0707R.dimen.std_24dp);
        this.s0.getImageView().getLayoutParams().width = F2().getResources().getDimensionPixelOffset(C0707R.dimen.std_24dp);
        viewGroup3.addView(this.s0.getView());
        SpotifyIconDrawable spotifyIconDrawable3 = new SpotifyIconDrawable(F2(), SpotifyIconV2.FACEBOOK, F2().getResources().getDimension(C0707R.dimen.social_link_icon_size));
        u90 e4 = e90.d().e(F2(), listView);
        this.r0 = e4;
        e4.getView().setVisibility(8);
        this.r0.Z().setText(C0707R.string.creator_artist_facebook_label);
        this.r0.getImageView().setImageDrawable(spotifyIconDrawable3);
        this.r0.getImageView().getLayoutParams().height = F2().getResources().getDimensionPixelOffset(C0707R.dimen.std_24dp);
        this.r0.getImageView().getLayoutParams().width = F2().getResources().getDimensionPixelOffset(C0707R.dimen.std_24dp);
        viewGroup3.addView(this.r0.getView());
        SpotifyIconDrawable spotifyIconDrawable4 = new SpotifyIconDrawable(F2(), SpotifyIconV2.COPY, F2().getResources().getDimension(C0707R.dimen.social_link_icon_size));
        u90 e5 = e90.d().e(F2(), listView);
        this.q0 = e5;
        e5.getView().setVisibility(8);
        this.q0.Z().setText(C0707R.string.creator_artist_wikipedia_label);
        this.q0.getImageView().setImageDrawable(spotifyIconDrawable4);
        this.q0.getImageView().getLayoutParams().height = F2().getResources().getDimensionPixelOffset(C0707R.dimen.std_24dp);
        this.q0.getImageView().getLayoutParams().width = F2().getResources().getDimensionPixelOffset(C0707R.dimen.std_24dp);
        viewGroup3.addView(this.q0.getView());
        this.w0.d(new w02(frameLayout), null, ArtistBioSection.MONTHLY_LISTENERS.d());
        this.w0.d(new w02(this.m0), null, ArtistBioSection.BIOGRAPHY.d());
        this.w0.d(new w02(viewGroup2), null, ArtistBioSection.AUTOBIOGRAPHY.d());
        this.w0.d(new w02(viewGroup3), null, ArtistBioSection.SOCIAL_LINKS.d());
        this.w0.j(new int[0]);
        listView.setAdapter((ListAdapter) this.w0);
        return inflate;
    }

    public /* synthetic */ void X4() {
        this.F0.b(this.v0, this.u0.b(ArtistUri.Type.ARTIST), this.x0.k());
    }

    public void Y4(boolean z) {
        this.n0.setVisibility(z ? 0 : 8);
    }

    public void Z4(String str, String str2, String str3) {
        Spannable spannable = (Spannable) z42.m(str);
        x.l(spannable, null);
        this.o0.setText(spannable);
        this.G0.i(this.p0.getImageView(), str2);
        this.p0.setText(B2().getResources().getString(C0707R.string.posted_by, str3));
        this.w0.p(ArtistBioSection.AUTOBIOGRAPHY.d());
        this.L0.f(this.u0.toString(), "autobiography");
        this.L0.a();
    }

    public void a5(String str) {
        Spannable spannable = (Spannable) z42.m(str);
        x.l(spannable, null);
        this.m0.setText(spannable);
        this.w0.p(ArtistBioSection.BIOGRAPHY.d());
        this.L0.f(this.u0.toString(), "biography");
        this.L0.b();
    }

    public void b5(String str, boolean z) {
        this.r0.getView().setOnClickListener(new e(this, str, "social-facebook-link"));
        this.r0.getView().setVisibility(z ? 0 : 8);
        this.w0.p(ArtistBioSection.SOCIAL_LINKS.d());
        this.L0.c();
    }

    public void c5(Image image) {
        ((ArtistBiographyImageView) this.n0.findViewById(C0707R.id.biography_image_0)).a(image, this.H0);
    }

    public void d5(String str, boolean z) {
        this.t0.getView().setOnClickListener(new e(this, str, "social-instagram-link"));
        this.t0.getView().setVisibility(z ? 0 : 8);
        this.w0.p(ArtistBioSection.SOCIAL_LINKS.d());
        this.L0.g();
    }

    public void e5(List<Image> list) {
        tu4 tu4 = new tu4(this.H0);
        tu4.Z(list);
        this.l0.setAdapter(tu4);
        this.w0.p(ArtistBioSection.GALLERY.d());
        this.L0.f(this.u0.toString(), "gallery");
        this.L0.e();
    }

    public void f5(Image image) {
        ((ArtistBiographyImageView) this.n0.findViewById(C0707R.id.biography_image_1)).a(image, this.H0);
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        if (this.z0.a() && !this.M0) {
            this.E0.o(a0Var, new b(this));
        }
    }

    public void g5(String str, boolean z) {
        this.s0.getView().setOnClickListener(new e(this, str, "social-twitter-link"));
        this.s0.getView().setVisibility(z ? 0 : 8);
        this.w0.p(ArtistBioSection.SOCIAL_LINKS.d());
        this.L0.j();
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return this.v0;
    }

    public void h5(String str, boolean z) {
        this.q0.getView().setOnClickListener(new e(this, str, "social-wikipedia-link"));
        this.q0.getView().setVisibility(z ? 0 : 8);
        this.w0.p(ArtistBioSection.SOCIAL_LINKS.d());
        this.L0.k();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.M0 = x.f(F2());
        Parcelable parcelable = k4().getParcelable("artist_uri");
        parcelable.getClass();
        this.v0 = (c) parcelable;
        ArtistUri artistUri = new ArtistUri(this.v0.toString());
        this.u0 = artistUri;
        this.L0 = new d(this.A0, this.B0, artistUri.toString());
        u4(true);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.ARTIST_ABOUT, null);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.I;
    }
}
