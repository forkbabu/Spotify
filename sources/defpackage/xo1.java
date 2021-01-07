package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import defpackage.s51;
import kotlin.jvm.internal.h;

/* renamed from: xo1  reason: default package */
public final class xo1 implements pk9<View> {
    private final bp1 a;

    public xo1(bp1 bp1) {
        h.e(bp1, "viewBinder");
        this.a = bp1;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        h.e(view, "view");
        h.e(s81, "model");
        h.e(aVar, "action");
        h.e(iArr, "indexPath");
        g91.a(view, s81, aVar, iArr);
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        h.e(view, "view");
        h.e(s81, "data");
        h.e(w51, "config");
        h.e(bVar, "state");
        bp1 bp1 = this.a;
        bp1.a(view);
        bp1.c(s81.text().title());
        bp1.b(s81.text().subtitle());
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.on_demand_playlists_header_component;
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.on_demand_header_component_layout, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(pare…nt_layout, parent, false)");
        return inflate;
    }
}
