package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

/* renamed from: mr8  reason: default package */
public final class mr8 extends d.a<a> {

    /* renamed from: mr8$a */
    public static final class a extends s51.c.a<View> {
        private final lr8 b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(lr8 lr8) {
            super(lr8.b());
            h.e(lr8, "viewBinder");
            this.b = lr8;
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
            String title = s81.text().title();
            if (title != null) {
                this.b.setText(title);
                i91.b(w51.b()).e("click").d(s81).c(this.a).a();
            }
        }
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        lr8 lr8 = new lr8(viewGroup);
        lr8.getView().setTag(C0707R.id.glue_viewholder_tag, lr8);
        return new a(lr8);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.CARD);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.CARD)");
        return of;
    }
}
