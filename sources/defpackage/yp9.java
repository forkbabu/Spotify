package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.goldenpath.a;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: yp9  reason: default package */
public class yp9 implements Object<View>, pk9 {
    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        g91.a(view, s81, aVar, iArr);
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        int i = e90.i;
        nb0 nb0 = (nb0) l70.o(view, nb0.class);
        nb0.setTitle(s81.text().title());
        nb0.setSubtitle(s81.text().subtitle());
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_inline_empty_state;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        View view = pb0.b(viewGroup.getContext(), viewGroup).getView();
        ViewGroup.LayoutParams c = a.c(viewGroup.getContext(), (ViewGroup) view);
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(C0707R.dimen.home_inline_empty_state_padding_48);
        view.setPadding(view.getPaddingLeft(), dimensionPixelSize, view.getPaddingRight(), dimensionPixelSize);
        view.setLayoutParams(c);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        view.setBackground(null);
        return view;
    }
}
