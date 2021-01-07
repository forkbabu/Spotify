package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.presenter.like.j;
import com.spotify.music.features.tasteonboarding.c;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import defpackage.vm8;
import defpackage.wm8;
import defpackage.ym8;
import defpackage.zm8;
import io.reactivex.d0;
import io.reactivex.z;
import java.util.List;

/* renamed from: dn8  reason: default package */
public class dn8 implements on8 {
    private final c a;
    private final j b;
    private final sm8 c;
    private final mn8 d;

    public dn8(c cVar, j jVar, sm8 sm8, mn8 mn8) {
        this.a = cVar;
        this.b = jVar;
        this.c = sm8;
        this.d = mn8;
    }

    private static TasteOnboardingItem d(List<TasteOnboardingItem> list, String str) {
        for (TasteOnboardingItem tasteOnboardingItem : list) {
            if (str.equals(tasteOnboardingItem.id())) {
                return tasteOnboardingItem;
            }
        }
        return null;
    }

    @Override // defpackage.on8
    public qn8 a(TasteOnboardingItem tasteOnboardingItem) {
        TasteOnboardingItem d2 = d(this.c.e(), tasteOnboardingItem.id());
        if (d2 == null) {
            this.c.e().add(0, tasteOnboardingItem);
            zm8.b bVar = new zm8.b();
            bVar.d(tasteOnboardingItem);
            vm8.b bVar2 = new vm8.b();
            bVar2.b(0);
            bVar.b(bVar2.a());
            bVar.c(true);
            return bVar.a();
        }
        int a2 = go8.a(this.c.e(), d2.id());
        boolean c2 = this.a.c(d2.id());
        zm8.b bVar3 = new zm8.b();
        bVar3.d(d2);
        vm8.b bVar4 = new vm8.b();
        bVar4.b(a2);
        bVar3.b(bVar4.a());
        bVar3.c(!c2);
        return bVar3.a();
    }

    @Override // defpackage.on8
    public pn8 b(int i, TasteOnboardingItem tasteOnboardingItem) {
        boolean z = false;
        if (!this.a.c(tasteOnboardingItem.id())) {
            TasteOnboardingItem createWithLike = tasteOnboardingItem.createWithLike(true);
            this.c.e().set(i, createWithLike);
            String id = createWithLike.id();
            this.b.a(id).a(id);
            if (!createWithLike.isExpanded() && tasteOnboardingItem.moreUri() != null) {
                z = true;
            }
            ym8.b bVar = new ym8.b();
            bVar.c(this.c.e());
            bVar.b(z);
            return bVar.a();
        }
        TasteOnboardingItem createWithLike2 = tasteOnboardingItem.createWithLike(false);
        this.c.e().set(i, createWithLike2);
        String id2 = createWithLike2.id();
        this.b.a(id2).b(id2);
        ym8.b bVar2 = new ym8.b();
        bVar2.c(this.c.e());
        bVar2.b(false);
        return bVar2.a();
    }

    @Override // defpackage.on8
    public z<bn8> c(String str) {
        TasteOnboardingItem d2 = d(this.c.e(), str);
        d2.getClass();
        return this.d.b(d2).p(new yl8(this, d2)).s(new zl8(this, d2));
    }

    public void e(TasteOnboardingItem tasteOnboardingItem, List list) {
        TasteOnboardingItem d2 = d(this.c.e(), tasteOnboardingItem.id());
        d2.getClass();
        int a2 = go8.a(this.c.e(), d2.id());
        this.c.e().set(a2, d2.createWithExpanded(true));
        this.c.e().addAll(a2 + 1, list);
    }

    public d0 f(TasteOnboardingItem tasteOnboardingItem, List list) {
        wm8.b bVar = new wm8.b();
        bVar.b(this.c.e());
        vm8.b bVar2 = new vm8.b();
        bVar2.b(go8.a(this.c.e(), tasteOnboardingItem.id()));
        bVar.c(bVar2.a());
        return z.z(bVar.a());
    }
}
