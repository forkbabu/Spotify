package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: h74  reason: default package */
public class h74 extends d.a<a> {
    private final Picasso a;
    private final wlf<u> b;
    private final boolean c;

    /* renamed from: h74$a */
    static class a extends s51.c.a<GlueHeaderViewV2> {
        private final i61 b;
        private final g74 c;
        private final Picasso f;

        protected a(GlueHeaderViewV2 glueHeaderViewV2, g74 g74, i61 i61, Picasso picasso) {
            super(glueHeaderViewV2);
            this.b = i61;
            this.c = g74;
            g74.c(i61);
            this.f = picasso;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            g74 g74 = this.c;
            w81 text = s81.text();
            g74.d(text.title(), text.description());
            f0 b2 = this.c.b();
            Picasso picasso = this.f;
            x81 main = s81.images().main();
            String uri = main != null ? main.uri() : null;
            if (TextUtils.isEmpty(uri)) {
                b2.onBitmapFailed(null, null);
            } else {
                picasso.m(uri).o(b2);
            }
            this.b.c0(s81.children());
        }
    }

    public h74(Picasso picasso, wlf<u> wlf, boolean z) {
        this.a = picasso;
        this.b = wlf;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        g74 g74 = new g74(viewGroup, this.c);
        Context context = viewGroup.getContext();
        GlueHeaderViewV2 glueHeaderViewV2 = new GlueHeaderViewV2(context, null);
        this.b.get().o(0.0f);
        glueHeaderViewV2.setStickyAreaSize(nud.l(context, C0707R.attr.actionBarSize) + com.spotify.android.goldenpath.a.e(context.getResources()));
        glueHeaderViewV2.setScrollObserver(new f74(this, new AccelerateInterpolator(2.0f)));
        i61 i61 = new i61(w51);
        glueHeaderViewV2.setContentViewBinder(g74);
        return new a(glueHeaderViewV2, g74, i61, this.a);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.HEADER);
    }

    public /* synthetic */ void f(Interpolator interpolator, float f) {
        this.b.get().o(interpolator.getInterpolation(f));
    }
}
