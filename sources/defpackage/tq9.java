package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: tq9  reason: default package */
public class tq9 extends qk9<a> {
    private final Picasso a;

    /* renamed from: tq9$a */
    static class a extends s51.c.a<View> {
        private final TextView b;
        private final TextView c = ((TextView) this.a.findViewById(C0707R.id.subtitle));
        private final ImageView f = ((ImageView) this.a.findViewById(C0707R.id.image));
        private final ImageView n = ((ImageView) this.a.findViewById(C0707R.id.shuffle_badge));
        private final Drawable o;
        private final Drawable p;
        private final Picasso q;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected a(android.view.ViewGroup r3, com.squareup.picasso.Picasso r4) {
            /*
                r2 = this;
                r0 = 2131624472(0x7f0e0218, float:1.8876125E38)
                r1 = 0
                android.view.View r0 = defpackage.je.G(r3, r0, r3, r1)
                r2.<init>(r0)
                r2.q = r4
                r4 = 2131431668(0x7f0b10f4, float:1.8485072E38)
                android.view.View r4 = r0.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r2.b = r4
                V extends android.view.View r4 = r2.a
                r0 = 2131431559(0x7f0b1087, float:1.848485E38)
                android.view.View r4 = r4.findViewById(r0)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r2.c = r4
                V extends android.view.View r4 = r2.a
                r0 = 2131430090(0x7f0b0aca, float:1.8481871E38)
                android.view.View r4 = r4.findViewById(r0)
                android.widget.ImageView r4 = (android.widget.ImageView) r4
                r2.f = r4
                V extends android.view.View r4 = r2.a
                r0 = 2131431389(0x7f0b0fdd, float:1.8484506E38)
                android.view.View r4 = r4.findViewById(r0)
                android.widget.ImageView r4 = (android.widget.ImageView) r4
                r2.n = r4
                android.content.Context r4 = r3.getContext()
                android.graphics.drawable.Drawable r4 = defpackage.l70.f(r4)
                r2.o = r4
                android.content.Context r3 = r3.getContext()
                r4 = 2131231878(0x7f080486, float:1.807985E38)
                android.graphics.drawable.Drawable r3 = androidx.core.content.a.d(r3, r4)
                r2.p = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tq9.a.<init>(android.view.ViewGroup, com.squareup.picasso.Picasso):void");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            String str;
            String title = s81.text().title();
            String subtitle = s81.text().subtitle();
            this.b.setText(MoreObjects.nullToEmpty(title));
            if (MoreObjects.isNullOrEmpty(subtitle)) {
                this.c.setVisibility(8);
            } else {
                this.c.setVisibility(0);
                this.c.setText(subtitle);
            }
            if (s81.custom().boolValue("shuffleBadge", false)) {
                this.n.setVisibility(0);
                this.n.setImageDrawable(this.o);
                this.n.setBackground(this.p);
            } else {
                this.n.setVisibility(8);
            }
            x81 main = s81.images().main();
            if (main == null) {
                str = null;
            } else {
                str = main.uri();
            }
            z l = this.q.l(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY);
            l.s(C0707R.color.image_placeholder_color);
            l.f(C0707R.color.image_placeholder_color);
            l.m(this.f);
            bvd c2 = dvd.c(this.a);
            c2.f(this.f, this.n);
            c2.g(this.b, this.c);
            c2.a();
            i91.b(w51.b()).e("click").d(s81).c(this.a).a();
        }
    }

    public tq9(Picasso picasso) {
        this.a = picasso;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(viewGroup, this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_row_large_component;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }
}
