package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.d;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.C0707R;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: cp8  reason: default package */
public abstract class cp8<T extends e<D>, D extends TasteOnboardingItem> extends d<T, D> {
    private static final Object o = new Object();
    private e.a<D> n;

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.b, androidx.recyclerview.widget.RecyclerView.e
    public void Q(RecyclerView.b0 b0Var) {
        e eVar = (e) b0Var;
        eVar.m0();
        eVar.a.setTag(C0707R.id.item_impression, null);
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.b
    /* renamed from: X */
    public void P(T t) {
        t.l0();
        int w = t.w();
        if (w > -1 && t.a.getTag(C0707R.id.item_impression) == null) {
            t.a.setTag(C0707R.id.item_impression, o);
            j0(w);
        }
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.b
    public void Y(T t) {
        t.m0();
        t.a.setTag(C0707R.id.item_impression, null);
    }

    /* access modifiers changed from: protected */
    public e.a<D> i0() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public abstract void j0(int i);

    public void k0(e.a<D> aVar) {
        this.n = aVar;
    }
}
