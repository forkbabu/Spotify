package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import defpackage.s51;
import kotlin.jvm.internal.h;

/* renamed from: dp1  reason: default package */
public final class dp1 implements pk9<View> {
    private final fp1 a;

    public dp1(fp1 fp1) {
        h.e(fp1, "viewBinder");
        this.a = fp1;
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
        fp1 fp1 = this.a;
        fp1.a(view);
        fp1.e(s81.text().title());
        fp1.b(s81.custom().string("affinity"));
        fp1.d(s81.text().subtitle());
        x81 main = s81.images().main();
        fp1.c(main != null ? main.uri() : null);
        t51.a(w51, view, s81);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.on_demand_playlists_row_component;
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.on_demand_row_component_layout, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(pare…nt_layout, parent, false)");
        return inflate;
    }
}
