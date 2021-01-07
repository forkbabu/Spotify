package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: cq9  reason: default package */
public class cq9 implements Object<View>, pk9 {
    private final gq9 a;
    private final w50 b;

    public cq9(gq9 gq9, w50 w50) {
        gq9.getClass();
        this.a = gq9;
        this.b = w50;
    }

    public /* synthetic */ void a(s81 s81, View view) {
        this.b.a(s81, view, h60.a);
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        fq9 fq9 = (fq9) l70.o(view, fq9.class);
        w81 text = s81.text();
        fq9.setTitle(text.title());
        fq9.setSubtitle(text.subtitle());
        fq9.m1(text.accessory());
        x81 main = s81.images().main();
        String str = null;
        String uri = main != null ? main.uri() : null;
        if (main != null) {
            str = main.placeholder();
        }
        fq9.j2(uri, str);
        i91.b(w51.b()).e("click").d(s81).c(view).a();
        n4.a(view, new bq9(this, s81, view));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_promo_view;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.CARD);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        return ((eq9) this.a.a(viewGroup.getContext(), viewGroup)).getView();
    }
}
