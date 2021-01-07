package com.spotify.music.features.carepackage.view;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.carepackage.m;
import com.spotify.music.preview.q;
import com.spotify.music.preview.t;
import com.spotify.music.preview.z;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.k;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;

public final class CarePackageViews implements Object {
    private final View a;
    private final List<CarePackageTrackView> b;
    private final ImageView c;
    private final TextView f;
    private final Button n;
    private final TextView o;
    private final Drawable p;
    private final Picasso q;
    private final q r;
    private final ui4 s;

    static final class a implements View.OnClickListener {
        final /* synthetic */ da2 a;

        a(da2 da2) {
            this.a = da2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.accept(th4.a);
        }
    }

    public static final class b implements h<dh4> {
        final /* synthetic */ CarePackageViews a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(CarePackageViews carePackageViews) {
            this.a = carePackageViews;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            dh4 dh4 = (dh4) obj;
            kotlin.jvm.internal.h.e(dh4, "model");
            nh4 b = dh4.b();
            if (b instanceof lh4) {
                CarePackageViews.d(this.a);
            } else if (b instanceof mh4) {
                CarePackageViews carePackageViews = this.a;
                k a2 = ((mh4) dh4.b()).a();
                z c = dh4.c();
                CarePackageViews.e(carePackageViews, a2, c != null ? c.g() : null);
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            for (CarePackageTrackView carePackageTrackView : this.a.b) {
                carePackageTrackView.setOnClickListener(null);
                carePackageTrackView.D();
                carePackageTrackView.E();
            }
            this.a.n.setOnClickListener(null);
        }
    }

    public CarePackageViews(LayoutInflater layoutInflater, ViewGroup viewGroup, Picasso picasso, q qVar, ui4 ui4) {
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        kotlin.jvm.internal.h.e(picasso, "picasso");
        kotlin.jvm.internal.h.e(qVar, "previewOverlay");
        kotlin.jvm.internal.h.e(ui4, "audioPlusLogger");
        this.q = picasso;
        this.r = qVar;
        this.s = ui4;
        View inflate = layoutInflater.inflate(C0707R.layout.care_package_dialog_fragment, viewGroup, false);
        kotlin.jvm.internal.h.d(inflate, "inflater.inflate(R.layou…_fragment, parent, false)");
        this.a = inflate;
        View G = q4.G(inflate, C0707R.id.button_1);
        kotlin.jvm.internal.h.d(G, "requireViewById(root, R.id.button_1)");
        View G2 = q4.G(inflate, C0707R.id.button_2);
        kotlin.jvm.internal.h.d(G2, "requireViewById(root, R.id.button_2)");
        View G3 = q4.G(inflate, C0707R.id.button_3);
        kotlin.jvm.internal.h.d(G3, "requireViewById(root, R.id.button_3)");
        View G4 = q4.G(inflate, C0707R.id.button_4);
        kotlin.jvm.internal.h.d(G4, "requireViewById(root, R.id.button_4)");
        View G5 = q4.G(inflate, C0707R.id.button_5);
        kotlin.jvm.internal.h.d(G5, "requireViewById(root, R.id.button_5)");
        this.b = d.u((CarePackageTrackView) G, (CarePackageTrackView) G2, (CarePackageTrackView) G3, (CarePackageTrackView) G4, (CarePackageTrackView) G5);
        View G6 = q4.G(inflate, C0707R.id.header_decoration);
        kotlin.jvm.internal.h.d(G6, "requireViewById<ImageVie…, R.id.header_decoration)");
        ImageView imageView = (ImageView) G6;
        this.c = imageView;
        View G7 = q4.G(inflate, C0707R.id.header_title);
        kotlin.jvm.internal.h.d(G7, "requireViewById<TextView>(root, R.id.header_title)");
        this.f = (TextView) G7;
        View G8 = q4.G(inflate, C0707R.id.button_share);
        kotlin.jvm.internal.h.d(G8, "requireViewById<Button>(root, R.id.button_share)");
        this.n = (Button) G8;
        View G9 = q4.G(inflate, C0707R.id.share_notice);
        kotlin.jvm.internal.h.d(G9, "requireViewById<TextView>(root, R.id.share_notice)");
        this.o = (TextView) G9;
        this.p = androidx.core.content.a.d(inflate.getContext(), C0707R.drawable.cat_placeholder_track);
        Drawable d = androidx.core.content.a.d(inflate.getContext(), C0707R.drawable.heart_header);
        com.squareup.picasso.z m = picasso.m("https://care-package.spotifycdn.com/my-forever-favorites/header-image/header_image.png");
        kotlin.jvm.internal.h.c(d);
        m.t(d);
        m.g(d);
        m.n(imageView, null);
        ui4.b();
        View G10 = q4.G(inflate, C0707R.id.appbar);
        kotlin.jvm.internal.h.d(G10, "requireViewById<AppBarLayout>(root, R.id.appbar)");
        AppBarLayout appBarLayout = (AppBarLayout) G10;
        View G11 = q4.G(inflate, C0707R.id.toolbar_title);
        kotlin.jvm.internal.h.d(G11, "requireViewById<TextView…root, R.id.toolbar_title)");
        TextView textView = (TextView) G11;
        View G12 = q4.G(inflate, C0707R.id.collapsible_header);
        kotlin.jvm.internal.h.d(G12, "requireViewById<ViewGrou… R.id.collapsible_header)");
        ViewGroup viewGroup2 = (ViewGroup) G12;
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup2.getChildAt(i);
            kotlin.jvm.internal.h.d(childAt, "header.getChildAt(i)");
            arrayList.add(childAt);
        }
        appBarLayout.a(new c(this, appBarLayout, textView, d.Q(arrayList)));
        String c2 = SpotifyLocale.c();
        m mVar = m.b;
        if (m.a().contains(c2)) {
            this.f.setText(this.a.getContext().getString(C0707R.string.audio_plus_header_favourites));
        } else {
            this.f.setText(this.a.getContext().getString(C0707R.string.header_dialog_title));
        }
        Logger.b(this.a.getContext().getString(C0707R.string.removal_snackbar_action_text), new Object[0]);
        Logger.b(this.a.getContext().getString(C0707R.string.removal_snackbar_message), new Object[0]);
    }

    public static final float a(CarePackageViews carePackageViews, float f2, float f3) {
        carePackageViews.getClass();
        if (f2 > f3) {
            return 1.0f - ((1.0f - f2) / (1.0f - f3));
        }
        return 0.0f;
    }

    public static final void d(CarePackageViews carePackageViews) {
        int i = 0;
        for (T t : carePackageViews.b) {
            t.setHighlighted(false);
            i++;
            t.J(i);
        }
        carePackageViews.h(0);
    }

    public static final void e(CarePackageViews carePackageViews, k kVar, String str) {
        String str2;
        com.spotify.playlist.models.a album;
        carePackageViews.getClass();
        List Q = d.Q(kVar.getItems());
        int i = 0;
        boolean z = false;
        for (T t : carePackageViews.b) {
            boolean z2 = true;
            if (i < Q.size()) {
                l lVar = (l) Q.get(i);
                String e = lVar.e();
                o g = lVar.g();
                if (g == null || (album = g.getAlbum()) == null || (str2 = album.g()) == null) {
                    Episode c2 = lVar.c();
                    str2 = c2 != null ? c2.n() : null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                t.K(e, str2);
                Covers.Size size = Covers.Size.NORMAL;
                String d = com.spotify.playlist.models.q.d(lVar, size);
                if (!(d == null || d.length() == 0)) {
                    com.squareup.picasso.z m = carePackageViews.q.m(com.spotify.playlist.models.q.d(lVar, size));
                    Drawable drawable = carePackageViews.p;
                    if (drawable != null) {
                        m.t(drawable);
                    } else {
                        m.q();
                    }
                    Drawable drawable2 = carePackageViews.p;
                    if (drawable2 != null) {
                        m.g(drawable2);
                    }
                    m.o(t.a(t.getImage(), carePackageViews.r, carePackageViews.f(lVar)));
                } else {
                    Drawable drawable3 = carePackageViews.p;
                    if (drawable3 != null) {
                        t.onPrepareLoad(drawable3);
                    }
                }
                if (str == null || !kotlin.jvm.internal.h.a(carePackageViews.f(lVar), str)) {
                    z2 = false;
                }
                t.setPlaying(z2);
            } else {
                if (!z) {
                    t.setHighlighted(true);
                    z = true;
                } else {
                    t.setHighlighted(false);
                }
                t.J(i + 1);
            }
            i++;
        }
        carePackageViews.h(Q.size());
    }

    private final String f(l lVar) {
        String previewId;
        o g = lVar.g();
        if (g != null && (previewId = g.getPreviewId()) != null) {
            return previewId;
        }
        Episode c2 = lVar.c();
        if (c2 != null) {
            return c2.s();
        }
        return null;
    }

    private final void h(int i) {
        int max = Math.max(0, 5 - i);
        if (max > 0) {
            this.n.setEnabled(false);
            this.o.setVisibility(0);
            this.o.setText(this.a.getResources().getQuantityString(C0707R.plurals.share_notice, max, Integer.valueOf(max)));
            return;
        }
        this.n.setEnabled(true);
        this.o.setVisibility(4);
    }

    public final View g() {
        return this.a;
    }

    public h<dh4> t(da2<bh4> da2) {
        kotlin.jvm.internal.h.e(da2, "eventConsumer");
        int i = 0;
        for (T t : this.b) {
            t.setOnAddSongListener(new CarePackageViews$connect$1(da2));
            t.setOnDeleteListener(new CarePackageViews$connect$2(da2, i));
            t.G(new CarePackageViews$connect$3(da2, i), new CarePackageViews$connect$4(da2, i));
            i++;
        }
        this.n.setOnClickListener(new a(da2));
        return new b(this);
    }
}
