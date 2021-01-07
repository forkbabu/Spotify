package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: gw3  reason: default package */
public class gw3 extends qk9<a> {

    /* renamed from: gw3$a */
    static class a extends s51.c.a<View> {
        private final TextView b;
        private final TextView c;
        private final View f;
        private final int n;

        protected a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(C0707R.id.title);
            this.c = (TextView) view.findViewById(C0707R.id.text);
            this.f = view.findViewById(C0707R.id.container);
            this.n = view.getResources().getDimensionPixelSize(C0707R.dimen.information_card_corner_radius);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            this.b.setText(s81.text().title());
            this.c.setText(s81.text().subtitle());
            p81 bundle = s81.custom().bundle("color");
            if (bundle != null) {
                fw3 fw3 = new fw3(bundle);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{fw3.b(), fw3.a()});
                gradientDrawable.setCornerRadius((float) this.n);
                this.f.setBackground(gradientDrawable);
                this.c.setTextColor(fw3.c());
                this.b.setTextColor(fw3.d());
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(je.G(viewGroup, C0707R.layout.information_card, viewGroup, false));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.information_card;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.CARD);
    }
}
