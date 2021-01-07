package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;
import kotlin.jvm.internal.h;

/* renamed from: zo1  reason: default package */
public final class zo1 extends pk9.a<a> {

    /* renamed from: zo1$a */
    public static final class a extends s51.c.a<ViewGroup> {
        private final ViewGroup b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ViewGroup viewGroup) {
            super(viewGroup);
            h.e(viewGroup, "viewGroup");
            this.b = viewGroup;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            je.h(s81, "model", aVar, "action", iArr, "indexPath");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            h.e(s81, "data");
            h.e(w51, "config");
            h.e(bVar, "state");
            this.b.removeAllViews();
            for (s81 s812 : s81.children()) {
                s51<?> a = w51.g().a(w51.c().d(s812));
                ViewGroup viewGroup = this.b;
                if (a != null) {
                    View h = a.h(viewGroup, w51);
                    a.c(h, s812, w51, bVar);
                    viewGroup.addView(h);
                }
            }
        }
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.on_demand_header_parent_component_layout, viewGroup, false);
        if (inflate != null) {
            return new a((ViewGroup) inflate);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.on_demand_playlists_header_component;
    }
}
