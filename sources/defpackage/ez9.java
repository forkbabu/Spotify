package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.s51;
import java.text.NumberFormat;
import java.util.EnumSet;
import java.util.Locale;

/* renamed from: ez9  reason: default package */
public class ez9 extends qk9<a> {
    private final Picasso a;
    private final DisplayMetrics b;

    /* renamed from: ez9$a */
    static class a extends s51.c.a<View> {
        View b;
        View c;
        TextView f = ((TextView) this.c.findViewById(C0707R.id.rankText));
        View n;
        TextView o;
        ImageView p;
        TextView q;
        Picasso r;

        a(View view, Picasso picasso, DisplayMetrics displayMetrics) {
            super(view);
            boolean z;
            this.r = picasso;
            this.p = (ImageView) view.findViewById(C0707R.id.img_picture);
            this.b = view.findViewById(C0707R.id.artist_verified);
            this.q = (TextView) view.findViewById(C0707R.id.biography);
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(view.getContext(), SpotifyIconV2.CHEVRON_RIGHT, (float) nud.g(24.0f, view.getResources()));
            spotifyIconDrawable.r(androidx.core.content.a.b(view.getContext(), R.color.white));
            this.q.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, spotifyIconDrawable, (Drawable) null);
            View findViewById = view.findViewById(C0707R.id.rank_layout);
            this.c = findViewById;
            findViewById.setBackgroundResource(C0707R.drawable.artist_rank_shape);
            View findViewById2 = view.findViewById(C0707R.id.monthly_listeners_layout);
            this.n = findViewById2;
            this.o = (TextView) findViewById2.findViewById(C0707R.id.monthly_listeners);
            Context context = view.getContext();
            synchronized (x.class) {
                z = context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
            }
            if (z) {
                View findViewById3 = view.findViewById(C0707R.id.artist_about_card_framelayout);
                ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
                layoutParams.height = findViewById3.getResources().getDimensionPixelOffset(C0707R.dimen.std_16dp) + (displayMetrics.widthPixels / 4);
                findViewById3.setLayoutParams(layoutParams);
                return;
            }
            this.n.setBackgroundResource(C0707R.drawable.gradient_transparent_to_black_with_point5_opacity);
            this.b.setBackgroundResource(C0707R.drawable.gradient_black_with_point3_opacity_to_transparent);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            g91.a(this.a, s81, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            t51.a(w51, this.a, s81);
            String description = s81.text().description();
            if (description != null) {
                this.q.setText(z42.m(description).toString());
            }
            x81 background = s81.images().background();
            String uri = background != null ? background.uri() : null;
            int f2 = nud.f(4.0f, this.a.getResources());
            z m = this.r.m(uri);
            m.a();
            m.i();
            m.x(new hz9(f2));
            m.m(this.p);
            int intValue = s81.custom().intValue("monthly_listeners_count", -1);
            int intValue2 = s81.custom().intValue("global_chart_position", -1);
            if (intValue > 0) {
                this.o.setText(NumberFormat.getInstance(Locale.getDefault()).format((long) intValue));
                c.n(this.o, R.style.TextAppearance_Encore_Cello);
                this.n.setVisibility(0);
                if (intValue2 > 0) {
                    this.f.setText(gz9.a(intValue2));
                    this.c.setVisibility(0);
                }
            }
        }
    }

    public ez9(Picasso picasso, DisplayMetrics displayMetrics) {
        this.a = picasso;
        this.b = displayMetrics;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(je.G(viewGroup, C0707R.layout.artist_about_card, viewGroup, false), this.a, this.b);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_artist_biography_component;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }
}
