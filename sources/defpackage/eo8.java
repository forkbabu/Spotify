package defpackage;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.rxjava2.q;
import defpackage.sl8;
import io.reactivex.y;

/* renamed from: eo8  reason: default package */
public class eo8 extends m implements sl8.a {
    private final ajf<sl8> a;
    private final y b;
    private final on8 c;
    private final vl8 f;
    private final sm8 n;
    private final q o = new q();

    public eo8(ajf<sl8> ajf, k kVar, y yVar, sn8 sn8, vl8 vl8, sm8 sm8) {
        this.a = ajf;
        kVar.y0(this);
        this.b = yVar;
        this.c = sn8;
        this.f = vl8;
        this.n = sm8;
    }

    private void F2(int i, TasteOnboardingItem tasteOnboardingItem) {
        pn8 b2 = this.c.b(i, tasteOnboardingItem);
        this.a.get().setItems(b2.b());
        if (b2.a()) {
            this.o.a(this.c.c(tasteOnboardingItem.id()).B(this.b).subscribe(new bo8(this), new ao8(tasteOnboardingItem)));
        }
    }

    @Override // defpackage.sl8.a
    public void A1(int i, TasteOnboardingItem tasteOnboardingItem, String str) {
        if (!tasteOnboardingItem.isLiked()) {
            this.f.b(i, this.n.e().size() - 1, null, tasteOnboardingItem.id(), tasteOnboardingItem.logging().b(), tasteOnboardingItem.logging().c(), tasteOnboardingItem.logging().e());
        } else {
            this.f.g(i, this.n.e().size() - 1, null, tasteOnboardingItem.id(), tasteOnboardingItem.logging().b(), tasteOnboardingItem.logging().c(), tasteOnboardingItem.logging().e());
        }
        F2(i, tasteOnboardingItem);
    }

    @Override // defpackage.sl8.a
    public void E1(TasteOnboardingItem tasteOnboardingItem) {
        qn8 a2 = this.c.a(tasteOnboardingItem);
        this.a.get().g(a2.b());
        if (a2.c()) {
            F2(a2.b().a(), a2.a());
        }
    }

    public /* synthetic */ void E2(bn8 bn8) {
        this.a.get().setItems(bn8.a());
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onStop() {
        this.o.c();
    }
}
