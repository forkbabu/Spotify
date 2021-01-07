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
import java.util.Locale;
import kotlin.jvm.internal.h;

/* renamed from: as8  reason: default package */
public final class as8 extends qk9<a> {
    private final Picasso a;
    private final DurationFormatter b;
    private final mt8 c;

    /* renamed from: as8$a */
    public static final class a extends s51.c.a<View> {
        private final int b;
        private final mpc c;
        private final Drawable f;
        private final ds8 n;
        private final Picasso o;
        private final DurationFormatter p;
        private final mt8 q;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(defpackage.ds8 r8, com.squareup.picasso.Picasso r9, com.spotify.music.podcast.episode.util.DurationFormatter r10, defpackage.mt8 r11) {
            /*
                r7 = this;
                java.lang.String r0 = "episodeRowView"
                kotlin.jvm.internal.h.e(r8, r0)
                java.lang.String r0 = "picasso"
                kotlin.jvm.internal.h.e(r9, r0)
                java.lang.String r0 = "durationFormatter"
                kotlin.jvm.internal.h.e(r10, r0)
                java.lang.String r0 = "dateFormatter"
                kotlin.jvm.internal.h.e(r11, r0)
                r0 = r8
                cs8 r0 = (defpackage.cs8) r0
                android.view.View r1 = r0.getView()
                r7.<init>(r1)
                r7.n = r8
                r7.o = r9
                r7.p = r10
                r7.q = r11
                android.view.View r8 = r0.getView()
                android.content.res.Resources r8 = r8.getResources()
                r9 = 2131166707(0x7f0705f3, float:1.7947667E38)
                int r8 = r8.getDimensionPixelSize(r9)
                r7.b = r8
                mpc r8 = new mpc
                android.view.View r10 = r0.getView()
                android.content.res.Resources r10 = r10.getResources()
                r8.<init>(r10, r9)
                r7.c = r8
                android.view.View r8 = r0.getView()
                android.content.Context r1 = r8.getContext()
                com.spotify.android.paste.graphics.SpotifyIconV2 r2 = com.spotify.android.paste.graphics.SpotifyIconV2.PODCASTS
                android.view.View r8 = r0.getView()
                android.content.res.Resources r8 = r8.getResources()
                r9 = 2131166481(0x7f070511, float:1.7947209E38)
                int r8 = r8.getDimensionPixelSize(r9)
                float r6 = (float) r8
                r3 = 1059648963(0x3f28f5c3, float:0.66)
                r4 = 1
                r5 = 0
                android.graphics.drawable.Drawable r8 = defpackage.yc0.e(r1, r2, r3, r4, r5, r6)
                java.lang.String r9 = "Placeholders.createPlace…size).toFloat()\n        )"
                kotlin.jvm.internal.h.d(r8, r9)
                r7.f = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.as8.a.<init>(ds8, com.squareup.picasso.Picasso, com.spotify.music.podcast.episode.util.DurationFormatter, mt8):void");
        }

        private final String B(int i) {
            String a = this.p.a(DurationFormatter.Format.LONG_HOUR_AND_MINUTE, i);
            h.d(a, "durationFormatter\n      …seconds\n                )");
            Locale locale = Locale.ROOT;
            h.d(locale, "Locale.ROOT");
            String lowerCase = a.toLowerCase(locale);
            h.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            je.h(s81, "model", aVar, "action", iArr, "indexPath");
        }

        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            String str;
            h.e(s81, "data");
            h.e(w51, "config");
            h.e(bVar, "state");
            String title = s81.text().title();
            String str2 = "";
            if (title == null) {
                title = str2;
            }
            this.n.setTitle(title);
            r81 images = s81.images();
            ImageView imageView = this.n.getImageView();
            imageView.setImageDrawable(this.f);
            imageView.setBackground(this.c);
            ImageView imageView2 = this.n.getImageView();
            h.d(imageView2, "episodeRowView.imageView");
            x81 main = images.main();
            if (main == null || (str = main.uri()) == null) {
                x81 background = images.background();
                str = background != null ? background.uri() : null;
            }
            if (str != null) {
                this.o.m(str).o(rwd.g(imageView2, d.a((float) this.b), null));
            } else {
                this.o.b(this.n.getImageView());
                imageView2.setImageDrawable(null);
            }
            i91.b(w51.b()).e("click").d(s81).c(this.a).a();
            p81 custom = s81.custom();
            String string = custom.string("showName", str2);
            String string2 = custom.string("label");
            this.n.setSubtitle(string);
            this.n.c0(h.a("explicit", string2));
            int intValue = custom.intValue("episodePublicationTime", 0);
            int intValue2 = custom.intValue("episodeDuration", 0);
            ds8 ds8 = this.n;
            if (intValue > 0 && intValue2 > 0) {
                str2 = this.q.a(intValue) + " • " + B(intValue2);
            } else if (intValue > 0) {
                str2 = this.q.a(intValue);
            } else if (intValue2 > 0) {
                str2 = B(intValue2);
            }
            ds8.e(str2);
            this.n.r0(custom.string("secondary_icon"));
        }
    }

    public as8(Picasso picasso, DurationFormatter durationFormatter, mt8 mt8) {
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
        cs8 cs8 = new cs8(viewGroup);
        cs8.getView().setTag(C0707R.id.glue_viewholder_tag, cs8);
        return new a(cs8, this.a, this.b, this.c);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.episode_row;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.STACKABLE)");
        return of;
    }
}
