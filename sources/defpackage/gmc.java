package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: gmc  reason: default package */
public abstract class gmc extends qk9<a> {
    private final Picasso a;
    private final w50 b;

    /* renamed from: gmc$a */
    static class a extends s51.c.a<View> {
        private final apc b;
        private final Picasso c;
        private final w50 f;

        protected a(apc apc, Picasso picasso, w50 w50) {
            super(apc.getView());
            this.b = apc;
            this.c = picasso;
            this.f = w50;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        public /* synthetic */ void B(s81 s81) {
            this.f.a(s81, this.a, h60.a);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            w81 text = s81.text();
            x81 main = s81.images().main();
            String str = null;
            if (main != null && !TextUtils.isEmpty(main.uri())) {
                str = main.uri();
            }
            this.b.W((String) MoreObjects.firstNonNull(text.title(), ""), (String) MoreObjects.firstNonNull(text.subtitle(), ""));
            this.b.setOnClickListener(new emc(w51, s81));
            this.c.m(str).o(this.b.E());
            n4.a(this.a, new fmc(this, s81));
        }
    }

    public gmc(Picasso picasso, w50 w50) {
        this.a = picasso;
        this.b = w50;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(apc.w(viewGroup, f(viewGroup.getResources())), this.a, this.b);
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.CARD);
    }

    /* access modifiers changed from: package-private */
    public abstract zoc f(Resources resources);
}
