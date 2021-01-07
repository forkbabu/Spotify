package defpackage;

import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder.ShelfView;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: nl8  reason: default package */
public class nl8 extends e<TasteOnboardingItem> {
    private final ShelfView C;
    private final e.a<TasteOnboardingItem> D;
    private final fl8 E;
    private final kn8 F;
    private final jl8 G;

    public nl8(ShelfView shelfView, e.a<TasteOnboardingItem> aVar, fl8 fl8, kn8 kn8, jl8 jl8) {
        super(shelfView);
        shelfView.getClass();
        this.C = shelfView;
        this.D = aVar;
        this.E = fl8;
        this.F = kn8;
        this.G = jl8;
        shelfView.setAdapter(fl8);
        shelfView.setSnapHelper(new qo8());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(TasteOnboardingItem tasteOnboardingItem, int i) {
        TasteOnboardingItem tasteOnboardingItem2 = tasteOnboardingItem;
        this.C.setTitle(tasteOnboardingItem2.name());
        this.E.f0(tasteOnboardingItem2.relatedItems());
        this.E.l0(this.D);
        this.C.D();
        this.C.setShelfScrollX(this.G.a(i));
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void s0() {
        this.G.c(w(), this.C.getShelfScrollX());
    }

    public void u0(int i) {
        this.C.E(i);
    }
}
