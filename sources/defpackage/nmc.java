package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.util.d0;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import java.util.EnumSet;
import java.util.Locale;

/* renamed from: nmc  reason: default package */
abstract class nmc extends qk9<a> {
    private final Picasso a;
    private final cmc b;
    private final w50 c;

    /* renamed from: nmc$a */
    static class a extends s51.c.a<View> {
        private final jpc b;
        private final Picasso c;
        private final cmc f;
        private final w50 n;

        protected a(jpc jpc, Picasso picasso, cmc cmc, w50 w50) {
            super(jpc.getView());
            this.b = jpc;
            this.c = picasso;
            this.f = cmc;
            this.n = w50;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        public /* synthetic */ void B(s81 s81) {
            this.n.a(s81, this.a, h60.a);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            w81 text = s81.text();
            x81 main = s81.images().main();
            x81 background = s81.images().background();
            String str = null;
            String uri = main != null ? main.uri() : null;
            if (background != null) {
                str = background.uri();
            }
            String string = s81.custom().string("releaseDate");
            int intValue = s81.custom().intValue("episodeDuration", 0);
            int intValue2 = s81.custom().intValue("listenedDuration", 0);
            this.b.g((String) MoreObjects.firstNonNull(text.title(), ""), (String) MoreObjects.firstNonNull(text.description(), ""), d0.a(this.f.a(string, intValue).toLowerCase(Locale.getDefault()), Locale.getDefault()), s81.custom().boolValue("downloadedBadge", false), (intValue <= 0 || intValue2 <= 0) ? -1 : (intValue2 * 100) / intValue);
            if (!TextUtils.isEmpty(uri)) {
                this.c.m(uri).o(this.b.d());
            }
            if (!TextUtils.isEmpty(str) && !str.equals(uri)) {
                this.c.m(str).o(this.b.M1());
            }
            this.b.setOnClickListener(new mmc(w51, s81));
            n4.a(this.a, new lmc(this, s81));
        }
    }

    nmc(Picasso picasso, cmc cmc, w50 w50) {
        this.a = picasso;
        this.b = cmc;
        this.c = w50;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(jpc.c(f(viewGroup.getResources()), viewGroup.getContext(), viewGroup), this.a, this.b, this.c);
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.CARD);
    }

    /* access modifiers changed from: package-private */
    public abstract hpc f(Resources resources);
}
