package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import com.spotify.music.podcast.episode.util.DurationFormatter;
import com.spotify.paste.graphics.drawable.d;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

/* renamed from: xr8  reason: default package */
public final class xr8 extends qk9<a> {
    private final Picasso a;
    private final DurationFormatter b;
    private final mt8 c;

    /* renamed from: xr8$a */
    public static final class a extends s51.c.a<View> {
        private final int b;
        private final mpc c;
        private final Drawable f;
        private final ur8 n;
        private final Picasso o;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(defpackage.ur8 r3, com.squareup.picasso.Picasso r4) {
            /*
                r2 = this;
                java.lang.String r0 = "episodeCardBinder"
                kotlin.jvm.internal.h.e(r3, r0)
                java.lang.String r0 = "picasso"
                kotlin.jvm.internal.h.e(r4, r0)
                r0 = r3
                vr8 r0 = (defpackage.vr8) r0
                android.view.View r0 = r0.getView()
                r2.<init>(r0)
                r2.n = r3
                r2.o = r4
                java.lang.String r3 = "view"
                kotlin.jvm.internal.h.d(r0, r3)
                android.content.res.Resources r4 = r0.getResources()
                r0 = 2131166707(0x7f0705f3, float:1.7947667E38)
                int r4 = r4.getDimensionPixelSize(r0)
                r2.b = r4
                mpc r4 = new mpc
                V extends android.view.View r1 = r2.a
                kotlin.jvm.internal.h.d(r1, r3)
                android.content.res.Resources r1 = r1.getResources()
                r4.<init>(r1, r0)
                r2.c = r4
                V extends android.view.View r4 = r2.a
                kotlin.jvm.internal.h.d(r4, r3)
                android.content.Context r3 = r4.getContext()
                com.spotify.android.paste.graphics.SpotifyIconV2 r4 = com.spotify.android.paste.graphics.SpotifyIconV2.PODCASTS
                android.graphics.drawable.Drawable r3 = defpackage.yc0.l(r3, r4)
                r2.f = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xr8.a.<init>(ur8, com.squareup.picasso.Picasso):void");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            je.h(s81, "model", aVar, "action", iArr, "indexPath");
        }

        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            h.e(s81, "data");
            h.e(w51, "config");
            h.e(bVar, "state");
            w81 text = s81.text();
            p81 custom = s81.custom();
            r81 images = s81.images();
            ur8 ur8 = this.n;
            String title = text.title();
            if (title == null) {
                title = "";
            }
            String description = text.description();
            if (description == null) {
                description = "";
            }
            boolean z = false;
            ur8.v2(title, description, custom.string("showName", ""), custom.intValue("episodeDuration", 0), custom.intValue("episodePublicationTime", 0));
            x81 main = images.main();
            String str = null;
            String uri = main != null ? main.uri() : null;
            ImageView M0 = this.n.M0();
            M0.setImageDrawable(this.f);
            M0.setScaleType(ImageView.ScaleType.CENTER);
            M0.setBackground(this.c);
            this.n.l1(false);
            if (!(uri == null || uri.length() == 0)) {
                this.o.m(uri).o(rwd.g(this.n.M0(), d.a((float) this.b), this.n.E0()));
            }
            x81 background = images.background();
            if (background != null) {
                str = background.uri();
            }
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                this.o.m(str).o(this.n.M1());
            } else {
                this.n.l1(true);
                this.o.c(this.n.M1());
            }
            this.n.setOnClickListener(new wr8(w51, s81));
        }
    }

    public xr8(Picasso picasso, DurationFormatter durationFormatter, mt8 mt8) {
        h.e(picasso, "picasso");
        h.e(durationFormatter, "durationFormatter");
        h.e(mt8, "dateFormatter");
        this.a = picasso;
        this.b = durationFormatter;
        this.c = mt8;
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        return new a(new vr8(viewGroup, this.b, this.c), this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.episode_image_card;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.CARD, GlueLayoutTraits.Trait.ONE_COLUMN);
        h.d(of, "EnumSet.of(GlueLayoutTra…tTraits.Trait.ONE_COLUMN)");
        return of;
    }
}
