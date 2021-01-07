package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: s68  reason: default package */
public class s68 extends d.a<a> {

    /* renamed from: s68$a */
    static class a extends s51.c.a<View> {
        private final ia0 b;

        protected a(ia0 ia0) {
            super(ia0.getView());
            this.b = ia0;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            this.b.setTitle(s81.text().title());
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        ia0 a2 = e90.e().a(viewGroup.getContext(), viewGroup);
        ((LinearLayout.LayoutParams) a2.getTitleView().getLayoutParams()).gravity = 8388611;
        return new a(a2);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.HEADER);
    }
}
