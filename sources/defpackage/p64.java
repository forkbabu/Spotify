package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: p64  reason: default package */
public class p64 implements d<View> {
    private final r64 a;

    public p64(r64 r64) {
        r64.getClass();
        this.a = r64;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        t64 t64 = (t64) l70.o(view, t64.class);
        t64.setTitle(s81.text().title());
        i91.b(w51.b()).e("click").d(s81).c(t64.l()).a();
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        r64 r64 = this.a;
        Context context = viewGroup.getContext();
        r64.getClass();
        context.getClass();
        o64 o64 = new o64(context);
        o64.getView().setTag(C0707R.id.glue_viewholder_tag, o64);
        return o64.getView();
    }
}
