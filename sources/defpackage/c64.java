package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import com.spotify.music.features.browse.view.BrowseRoundedCornerImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: c64  reason: default package */
public class c64 extends d.a<a> {
    private final HubsGlueImageDelegate a;
    private final Picasso b;
    private final boolean c;

    /* renamed from: c64$a */
    static class a extends s51.c.a<View> {
        private final FrameLayout b;
        private final TextView c;
        private final BrowseRoundedCornerImageView f;
        private final HubsGlueImageDelegate n;
        private final Picasso o;

        a(View view, HubsGlueImageDelegate hubsGlueImageDelegate, Picasso picasso, boolean z) {
            super(view);
            FrameLayout frameLayout = (FrameLayout) q4.G(view, C0707R.id.background);
            this.b = frameLayout;
            TextView textView = (TextView) q4.G(view, C0707R.id.find_title_text);
            this.c = textView;
            BrowseRoundedCornerImageView browseRoundedCornerImageView = (BrowseRoundedCornerImageView) q4.G(view, C0707R.id.find_category_card_background);
            this.f = browseRoundedCornerImageView;
            this.n = hubsGlueImageDelegate;
            this.o = picasso;
            if (z) {
                browseRoundedCornerImageView.setScaleX(-1.0f);
            }
            vc0.i(textView);
            vc0.g(view);
            bvd b2 = dvd.b(frameLayout);
            b2.f(browseRoundedCornerImageView);
            b2.g(textView);
            b2.a();
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            g91.a(this.a, s81, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            String title = s81.text().title();
            x81 background = s81.images().background();
            BrowseRoundedCornerImageView browseRoundedCornerImageView = this.f;
            if (background != null) {
                Drawable e = this.n.e(background.placeholder(), HubsGlueImageConfig.CARD);
                z l = this.o.l(this.n.b(background.uri()));
                l.t(e);
                l.g(e);
                l.m(browseRoundedCornerImageView);
            } else {
                this.o.b(browseRoundedCornerImageView);
                browseRoundedCornerImageView.setImageDrawable(null);
            }
            i91.b(w51.b()).e("click").d(s81).c(this.a).a();
            this.c.setText(title);
            this.f.setRoundedCorners(true);
        }
    }

    public c64(HubsGlueImageDelegate hubsGlueImageDelegate, Picasso picasso, boolean z) {
        hubsGlueImageDelegate.getClass();
        this.a = hubsGlueImageDelegate;
        picasso.getClass();
        this.b = picasso;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(je.G(viewGroup, C0707R.layout.find_category_card_old, viewGroup, false), this.a, this.b, this.c);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.CARD, GlueLayoutTraits.Trait.ONE_COLUMN);
    }
}
