package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import com.squareup.picasso.z;
import defpackage.s51;
import java.util.EnumSet;
import java.util.List;

/* renamed from: fe3  reason: default package */
public class fe3 extends qk9<a> {
    private final zvd a;
    private final ajf<yf3> b;

    /* renamed from: fe3$a */
    static class a extends s51.c.a<View> {
        final Context b;
        final zvd c;
        final ajf<yf3> f;
        final LinearLayout n = ((LinearLayout) this.a.findViewById(C0707R.id.container));
        final ImageView o = ((ImageView) this.a.findViewById(C0707R.id.image));
        final TextView p = ((TextView) this.a.findViewById(C0707R.id.title));
        final TextView q = ((TextView) this.a.findViewById(C0707R.id.subtitle));
        final TextView r = ((TextView) this.a.findViewById(C0707R.id.accessoryText));
        final LinearLayout s = ((LinearLayout) this.a.findViewById(C0707R.id.children));
        private final SparseArray<w61<?>> t = new SparseArray<>();
        private owd<View> u;

        public a(ViewGroup viewGroup, zvd zvd, ajf<yf3> ajf) {
            super(je.G(viewGroup, C0707R.layout.free_tier_entity_top_container_component_layout, viewGroup, false));
            this.b = viewGroup.getContext();
            this.c = zvd;
            this.f = ajf;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            String str;
            String str2;
            String subtitle;
            x81 main = s81.images().main();
            String str3 = null;
            String uri = (main == null || TextUtils.isEmpty(main.uri())) ? null : main.uri();
            Drawable d = yc0.d(this.b, n71.a(main != null ? main.placeholder() : null).or((Optional<SpotifyIconV2>) SpotifyIconV2.ALBUM), (float) nud.g(64.0f, this.b.getResources()));
            z e = this.c.e(uri);
            e.t(d);
            e.g(d);
            e.m(this.o);
            String title = s81.text().title() != null ? s81.text().title() : "";
            if (s81.text().subtitle() != null) {
                str = s81.text().subtitle();
            } else {
                str = "";
            }
            if (s81.text().accessory() != null) {
                str2 = s81.text().accessory();
            } else {
                str2 = "";
            }
            this.p.setText(title);
            this.q.setText(str);
            this.r.setText(str2);
            p81 bundle = s81.custom().bundle("track_info");
            if (!(bundle == null || (subtitle = s81.text().subtitle()) == null || subtitle.isEmpty())) {
                SpannableString a = this.f.get().a(subtitle, bundle.string("artist_name", ""), bundle.string("artist_uri", ""), bundle.boolValue("use_artist_placeholder", false));
                this.q.setMovementMethod(LinkMovementMethod.getInstance());
                this.q.setText(a, TextView.BufferType.SPANNABLE);
            }
            List<? extends s81> children = s81.children();
            if (!children.isEmpty()) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                this.s.removeAllViews();
                for (int i = 0; i < children.size(); i++) {
                    s81 s812 = (s81) children.get(i);
                    int d2 = w51.c().d(s812);
                    w61<?> w61 = this.t.get(d2);
                    if (w61 == null) {
                        w61 = w61.b(d2, this.s, w51);
                        w61.e().setLayoutParams(layoutParams);
                        this.t.put(d2, w61);
                    }
                    this.s.addView(w61.e());
                    w61.a(i, s812, bVar);
                }
            }
            x81 main2 = s81.images().main();
            if (main2 != null) {
                if (!TextUtils.isEmpty(main2.uri())) {
                    str3 = main2.uri();
                }
                this.u = new owd<>(this.n, owd.n);
                z e2 = this.c.e(str3);
                e2.x(fwd.b);
                e2.o(this.u);
                return;
            }
            Context context = this.b;
            Drawable e3 = nud.e(context, i2.c(context.getResources(), C0707R.color.gray_background_30, null));
            LinearLayout linearLayout = this.n;
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            linearLayout.setBackground(e3);
        }
    }

    public fe3(zvd zvd, ajf<yf3> ajf) {
        this.a = zvd;
        this.b = ajf;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(viewGroup, this.a, this.b);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.free_tier_entity_top_container_component;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.HEADER, GlueLayoutTraits.Trait.OUTSIDE_CONTENT_AREA);
    }
}
