package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import defpackage.s51;
import defpackage.s81;
import java.util.EnumSet;

/* renamed from: vqa  reason: default package */
public class vqa implements d<View> {

    /* renamed from: vqa$a */
    public static class a {
        private String a;
        private String b;
        private String c;
        private o81 d;
        private wsa e;
        private p81 f;

        public s81 a() {
            s81.a p = z81.c().o("search:EmptyState", HubsComponentCategory.CARD.d()).y(z81.h().a(this.a).d(this.b)).p(this.f);
            if (this.d != null) {
                p = p.b(z81.c().n(HubsGlueRow.NORMAL).s("search-retry").y(z81.h().a(this.c)).f("click", this.d).p(this.f).h(pqa.a(this.e)).l());
            }
            return p.l();
        }

        public a b(String str, o81 o81, wsa wsa) {
            this.c = str;
            this.d = o81;
            this.e = wsa;
            return this;
        }

        public a c(p81 p81) {
            this.f = p81;
            return this;
        }

        public a d(String str) {
            this.b = str;
            return this;
        }

        public a e(String str) {
            this.a = str;
            return this;
        }
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x007c  */
    @Override // defpackage.s51
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.view.View r2, defpackage.s81 r3, defpackage.w51 r4, defpackage.s51.b r5) {
        /*
            r1 = this;
            java.lang.Class<pra> r5 = defpackage.pra.class
            g90 r2 = defpackage.l70.o(r2, r5)
            pra r2 = (defpackage.pra) r2
            w81 r5 = r3.text()
            java.lang.String r5 = r5.title()
            r2.setTitle(r5)
            w81 r5 = r3.text()
            java.lang.String r5 = r5.subtitle()
            r2.setSubtitle(r5)
            java.util.List r5 = r3.children()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0050
            java.util.List r3 = r3.children()
            r5 = 0
            java.lang.Object r3 = r3.get(r5)
            s81 r3 = (defpackage.s81) r3
            w81 r5 = r3.text()
            java.lang.String r5 = r5.title()
            java.util.Map r0 = r3.events()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0050
            boolean r5 = com.google.common.base.MoreObjects.isNullOrEmpty(r5)
            if (r5 != 0) goto L_0x0050
            com.google.common.base.Optional r3 = com.google.common.base.Optional.of(r3)
            goto L_0x0054
        L_0x0050:
            com.google.common.base.Optional r3 = com.google.common.base.Optional.absent()
        L_0x0054:
            boolean r5 = r3.isPresent()
            if (r5 == 0) goto L_0x007c
            o61 r4 = r4.b()
            java.lang.Object r3 = r3.get()
            s81 r3 = (defpackage.s81) r3
            w81 r5 = r3.text()
            java.lang.String r5 = r5.title()
            r2.t(r5)
            android.view.View r2 = r2.i()
            sqa r5 = new sqa
            r5.<init>(r4, r3)
            r2.setOnClickListener(r5)
            goto L_0x007f
        L_0x007c:
            r2.q()
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqa.c(android.view.View, s81, w51, s51$b):void");
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        qra qra = new qra(viewGroup);
        qra.getView().setTag(C0707R.id.glue_viewholder_tag, qra);
        return qra.getView();
    }
}
