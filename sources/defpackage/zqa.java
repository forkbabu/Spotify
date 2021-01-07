package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.hubs.util.image.b;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: zqa  reason: default package */
public class zqa extends d.a<a> {
    private final b a;
    private final kra b;

    /* renamed from: zqa$a */
    static class a extends s51.c.a<View> {
        private final zra b;
        private final b c;
        private final kra f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected a(defpackage.zra r2, com.spotify.music.libs.search.hubs.util.image.b r3, defpackage.kra r4) {
            /*
                r1 = this;
                asa r2 = (defpackage.asa) r2
                android.view.View r0 = r2.getView()
                r1.<init>(r0)
                r1.b = r2
                r1.c = r3
                r1.f = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zqa.a.<init>(zra, com.spotify.music.libs.search.hubs.util.image.b, kra):void");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            g91.a(this.a, s81, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            bra.a(this.b, this.c, this.f, s81, w51, pqa.c(s81.images().main()));
        }
    }

    public zqa(b bVar, kra kra) {
        this.a = bVar;
        this.b = kra;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        tra tra = new tra(l70.l(viewGroup.getContext(), viewGroup, C0707R.layout.search_row_two_lines));
        tra.getView().setTag(C0707R.id.glue_viewholder_tag, tra);
        return new a(tra, this.a, this.b);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }
}
