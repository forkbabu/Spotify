package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

/* renamed from: fs8  reason: default package */
public final class fs8 extends d.a<a> {

    /* renamed from: fs8$a */
    public static final class a extends s51.c.a<View> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(es8 es8) {
            super(es8.getView());
            h.e(es8, "viewBinder");
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
        }
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        es8 es8 = new es8(viewGroup);
        es8.getView().setTag(C0707R.id.glue_viewholder_tag, es8);
        return new a(es8);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.HEADER);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.HEADER)");
        return of;
    }
}
