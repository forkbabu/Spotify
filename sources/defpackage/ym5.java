package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

/* renamed from: ym5  reason: default package */
public final class ym5 extends qk9<a> {
    private static final q81 a;
    public static final ym5 b = null;

    /* renamed from: ym5$a */
    public static final class a extends s51.c.a<View> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            h.e(view, "view");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            je.h(s81, "model", aVar, "action", iArr, "indexPath");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            h.e(s81, "data");
            h.e(w51, "config");
            h.e(bVar, "state");
        }
    }

    static {
        String d = HubsComponentCategory.ROW.d();
        h.d(d, "HubsComponentCategory.ROW.id");
        a = z81.d("listeninghistory:loading", d);
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.view_loading_placeholder, viewGroup, false);
        h.d(inflate, "view");
        return new a(inflate);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.loading_placeholder;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
        h.d(of, "EnumSet.of(Trait.STACKABLE)");
        return of;
    }
}
