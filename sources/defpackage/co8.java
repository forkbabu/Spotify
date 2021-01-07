package defpackage;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.rxjava2.q;
import defpackage.sl8;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;

/* renamed from: co8  reason: default package */
public class co8 extends m implements sl8.a {
    private final ajf<sl8> a;
    private final y b;
    private final on8 c;
    private final hn8 f;
    private final vl8 n;
    private final sm8 o;
    private final q p = new q();
    private b q = EmptyDisposable.INSTANCE;

    public co8(ajf<sl8> ajf, k kVar, y yVar, dn8 dn8, hn8 hn8, vl8 vl8, sm8 sm8) {
        this.a = ajf;
        kVar.y0(this);
        this.b = yVar;
        this.c = dn8;
        this.f = hn8;
        this.n = vl8;
        this.o = sm8;
    }

    private int E2() {
        return this.o.e().size() - 1;
    }

    private void H2(int i, TasteOnboardingItem tasteOnboardingItem) {
        pn8 b2 = this.c.b(i, tasteOnboardingItem);
        this.a.get().setItems(b2.b());
        if (b2.a()) {
            this.p.a(this.c.c(tasteOnboardingItem.id()).B(this.b).subscribe(new xn8(this), new yn8(tasteOnboardingItem)));
        }
    }

    @Override // defpackage.sl8.a
    public void A1(int i, TasteOnboardingItem tasteOnboardingItem, String str) {
        if (!tasteOnboardingItem.isArtist() && !tasteOnboardingItem.isPodcast()) {
            this.n.f(i, E2(), null, tasteOnboardingItem.id(), tasteOnboardingItem.logging().b(), tasteOnboardingItem.logging().c(), tasteOnboardingItem.logging().e());
        } else if (!tasteOnboardingItem.isLiked()) {
            this.n.b(i, E2(), null, tasteOnboardingItem.id(), tasteOnboardingItem.logging().b(), tasteOnboardingItem.logging().c(), tasteOnboardingItem.logging().e());
        } else {
            this.n.g(i, E2(), null, tasteOnboardingItem.id(), tasteOnboardingItem.logging().b(), tasteOnboardingItem.logging().c(), tasteOnboardingItem.logging().e());
        }
        if (tasteOnboardingItem.isArtist() || tasteOnboardingItem.isPodcast()) {
            H2(i, tasteOnboardingItem);
            return;
        }
        this.q.dispose();
        this.q = this.f.a(tasteOnboardingItem).B(this.b).subscribe(new zn8(this, i, tasteOnboardingItem), new wn8(tasteOnboardingItem));
    }

    @Override // defpackage.sl8.a
    public void E1(TasteOnboardingItem tasteOnboardingItem) {
        qn8 a2 = this.c.a(tasteOnboardingItem);
        this.a.get().g(a2.b());
        if (a2.c()) {
            H2(a2.b().a(), a2.a());
        }
    }

    public /* synthetic */ void F2(bn8 bn8) {
        this.a.get().setItems(bn8.a());
        this.a.get().h(bn8.b());
    }

    public /* synthetic */ void G2(int i, TasteOnboardingItem tasteOnboardingItem, cn8 cn8) {
        this.o.e().addAll(i, cn8.a());
        if (cn8.b()) {
            this.o.e().remove(go8.a(this.o.e(), tasteOnboardingItem.id()));
        }
        this.a.get().setItems(this.o.e());
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onStop() {
        this.p.c();
        this.q.dispose();
    }
}
