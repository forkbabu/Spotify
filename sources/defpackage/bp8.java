package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.remoteconfig.v5;

/* renamed from: bp8  reason: default package */
public class bp8 extends cp8<e<TasteOnboardingItem>, TasteOnboardingItem> {
    private final lp8 p;
    private final v5 q;
    private final zvd r;

    public bp8(lp8 lp8, v5 v5Var, zvd zvd) {
        this.p = lp8;
        this.q = v5Var;
        this.r = zvd;
    }

    private boolean l0(TasteOnboardingItem tasteOnboardingItem) {
        return !MoreObjects.isNullOrEmpty(tasteOnboardingItem.relatedMedia()) && this.q.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        if (1 == i) {
            y90 i2 = e90.d().i(viewGroup.getContext(), viewGroup);
            e.a i0 = i0();
            i0.getClass();
            return new dp8(i2, i0, this.r);
        }
        u90 d = e90.d().d(viewGroup.getContext(), viewGroup);
        e.a i02 = i0();
        i02.getClass();
        return new fp8(d, i02, this.r);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cp8
    public void j0(int i) {
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) Z(i);
        if (l0(tasteOnboardingItem)) {
            lp8 lp8 = this.p;
            String id = tasteOnboardingItem.id();
            id.getClass();
            lp8.f(id, i);
            return;
        }
        lp8 lp82 = this.p;
        String id2 = tasteOnboardingItem.id();
        id2.getClass();
        lp82.a(id2, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return l0((TasteOnboardingItem) Z(i)) ? 1 : 0;
    }
}
