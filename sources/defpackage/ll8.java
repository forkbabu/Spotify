package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: ll8  reason: default package */
public class ll8 extends cl8 {
    private final ol8 p;
    private final vl8 q;
    private final jl8 r;

    public ll8(ol8 ol8, vl8 vl8, jl8 jl8) {
        this.p = ol8;
        this.q = vl8;
        this.r = jl8;
        U(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return this.p.a(viewGroup, i0(), j0(), this.r);
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.d
    public void f0(List<TasteOnboardingItem> list) {
        super.f0(list);
        if (list != null) {
            this.r.b(list.size());
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cl8
    public void k0(int i) {
        this.q.h(((TasteOnboardingItem) Z(i)).id(), i);
    }
}
