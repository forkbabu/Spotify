package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

/* renamed from: is8  reason: default package */
public final class is8 extends d.a<a> {

    /* renamed from: is8$a */
    public static final class a extends s51.c.a<View> {
        private final hs8 b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(hs8 hs8) {
            super(hs8.getView());
            h.e(hs8, "viewBinder");
            this.b = hs8;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            je.h(s81, "model", aVar, "action", iArr, "indexPath");
        }

        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            h.e(s81, "data");
            h.e(w51, "config");
            h.e(bVar, "state");
            hs8 hs8 = this.b;
            String title = s81.text().title();
            if (title == null) {
                title = "";
            }
            hs8.setTitle(title);
        }
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        hs8 hs8 = new hs8(viewGroup);
        hs8.getView().setTag(C0707R.id.glue_viewholder_tag, hs8);
        return new a(hs8);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.HEADER);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.HEADER)");
        return of;
    }
}
