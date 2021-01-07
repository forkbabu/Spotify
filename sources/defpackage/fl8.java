package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: fl8  reason: default package */
public class fl8 extends cl8 {
    private final hl8 p;
    private final vl8 q;

    public fl8(hl8 hl8, vl8 vl8) {
        this.p = hl8;
        this.q = vl8;
        U(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return this.p.a(viewGroup, i, i0(), j0());
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cl8
    public void k0(int i) {
        this.q.a(((TasteOnboardingItem) Z(i)).id(), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) Z(i);
        return (tasteOnboardingItem.isArtist() || tasteOnboardingItem.isPodcast()) ? 1 : 2;
    }
}
