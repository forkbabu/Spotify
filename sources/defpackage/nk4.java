package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: nk4  reason: default package */
public class nk4 implements d<View> {
    private final sk4 a;

    public nk4(sk4 sk4) {
        sk4.getClass();
        this.a = sk4;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        rk4 rk4 = (rk4) l70.o(view, rk4.class);
        rk4.setTitle(s81.text().title());
        rk4.v(s81.custom().string("color"));
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.HEADER);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        return this.a.a(viewGroup.getContext(), viewGroup).getView();
    }
}
