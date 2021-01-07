package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.music.C0707R;
import defpackage.s51;
import kotlin.jvm.internal.h;

/* renamed from: vo1  reason: default package */
public final class vo1 implements pk9<View> {
    private final com.spotify.mobile.android.skiplimitpivot.view.a a;
    private final hp1 b;

    /* renamed from: vo1$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ vo1 a;

        a(vo1 vo1) {
            this.a = vo1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.b.a();
            this.a.a.onClose();
        }
    }

    public vo1(com.spotify.mobile.android.skiplimitpivot.view.a aVar, hp1 hp1) {
        h.e(aVar, "onCloseListener");
        h.e(hp1, "logger");
        this.a = aVar;
        this.b = hp1;
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
        ((Button) view.findViewById(C0707R.id.close)).setOnClickListener(new a(this));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.on_demand_playlists_header_component;
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.on_demand_header_close_component_layout, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(pare…nt_layout, parent, false)");
        return inflate;
    }
}
