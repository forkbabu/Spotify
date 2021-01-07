package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: kp9  reason: default package */
public final class kp9 extends ip9 {
    @Override // defpackage.ip9, defpackage.pk9
    public int d() {
        return C0707R.id.home_section_header_small;
    }

    @Override // defpackage.ip9, defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        View h = super.h(viewGroup, w51);
        ((np9) l70.o(h, np9.class)).r1(h.getResources().getDimensionPixelSize(C0707R.dimen.home_section_header_title_size_small));
        h.d(h, "super.createView(parent,…TitleSize(size)\n        }");
        return h;
    }
}
