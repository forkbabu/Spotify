package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: b84  reason: default package */
public class b84 implements d<View> {
    private final g84 a;

    public b84(g84 g84) {
        g84.getClass();
        this.a = g84;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        f84 f84 = (f84) l70.o(view, f84.class);
        f84.setTitle(s81.text().title());
        f84.v(s81.custom().string("color"));
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
