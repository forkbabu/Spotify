package defpackage;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.spotify.music.features.tasteonboarding.artistpicker.presenter.like.j;
import com.spotify.music.features.tasteonboarding.c;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.features.tasteonboarding.model.d;
import defpackage.an8;
import defpackage.wm8;
import defpackage.ym8;
import defpackage.zm8;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: sn8  reason: default package */
public class sn8 implements on8 {
    private final c a;
    private final j b;
    private final sm8 c;
    private final mn8 d;

    /* access modifiers changed from: package-private */
    /* renamed from: sn8$a */
    public static class a implements Predicate<TasteOnboardingItem> {
        final /* synthetic */ TasteOnboardingItem a;

        a(TasteOnboardingItem tasteOnboardingItem) {
            this.a = tasteOnboardingItem;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.common.base.Predicate
        public boolean apply(TasteOnboardingItem tasteOnboardingItem) {
            TasteOnboardingItem tasteOnboardingItem2 = tasteOnboardingItem;
            if (tasteOnboardingItem2 == null) {
                return false;
            }
            String id = tasteOnboardingItem2.id();
            d logging = this.a.logging();
            logging.getClass();
            return id.equals(logging.e());
        }
    }

    public sn8(c cVar, j jVar, sm8 sm8, mn8 mn8) {
        this.a = cVar;
        this.b = jVar;
        this.c = sm8;
        this.d = mn8;
    }

    private static TasteOnboardingItem d(List<TasteOnboardingItem> list, String str) {
        for (TasteOnboardingItem tasteOnboardingItem : list) {
            Iterator<TasteOnboardingItem> it = tasteOnboardingItem.relatedItems().iterator();
            while (true) {
                if (it.hasNext()) {
                    TasteOnboardingItem next = it.next();
                    if (str.equals(next.id())) {
                        return next;
                    }
                }
            }
        }
        return null;
    }

    private static TasteOnboardingItem e(List<TasteOnboardingItem> list, TasteOnboardingItem tasteOnboardingItem) {
        return (TasteOnboardingItem) Collections2.find(list.iterator(), new a(tasteOnboardingItem));
    }

    private void g(int i, TasteOnboardingItem tasteOnboardingItem) {
        TasteOnboardingItem e = e(this.c.e(), tasteOnboardingItem);
        e.getClass();
        ArrayList arrayList = new ArrayList(e.relatedItems());
        arrayList.set(i, tasteOnboardingItem);
        TasteOnboardingItem createWithRelatedItems = e.createWithRelatedItems(arrayList);
        this.c.e().set(go8.a(this.c.e(), e.id()), createWithRelatedItems);
    }

    @Override // defpackage.on8
    public qn8 a(TasteOnboardingItem tasteOnboardingItem) {
        TasteOnboardingItem d2 = d(this.c.e(), tasteOnboardingItem.id());
        if (d2 == null) {
            if (!"search-result".equals(this.c.e().get(0).id())) {
                List<TasteOnboardingItem> e = this.c.e();
                d.a a2 = d.a();
                a2.d("search-result");
                a2.b("search");
                e.add(0, TasteOnboardingItem.create("search-result", "From Search", null, null, null, a2.a(), null, "", ""));
            }
            TasteOnboardingItem tasteOnboardingItem2 = this.c.e().get(0);
            ArrayList arrayList = new ArrayList(tasteOnboardingItem2.relatedItems());
            arrayList.add(0, tasteOnboardingItem);
            this.c.e().set(0, tasteOnboardingItem2.createWithRelatedItems(arrayList));
            zm8.b bVar = new zm8.b();
            bVar.d(tasteOnboardingItem);
            an8.b bVar2 = new an8.b();
            bVar2.c(0);
            bVar2.b(0);
            bVar.b(bVar2.a());
            bVar.c(true);
            return bVar.a();
        }
        TasteOnboardingItem e2 = e(this.c.e(), d2);
        e2.getClass();
        int a3 = go8.a(this.c.e(), e2.id());
        int a4 = go8.a(e2.relatedItems(), d2.id());
        boolean c2 = this.a.c(d2.id());
        zm8.b bVar3 = new zm8.b();
        bVar3.d(d2);
        an8.b bVar4 = new an8.b();
        bVar4.c(a4);
        bVar4.b(a3);
        bVar3.b(bVar4.a());
        bVar3.c(!c2);
        return bVar3.a();
    }

    @Override // defpackage.on8
    public pn8 b(int i, TasteOnboardingItem tasteOnboardingItem) {
        boolean z = false;
        if (!this.a.c(tasteOnboardingItem.id())) {
            TasteOnboardingItem createWithLike = tasteOnboardingItem.createWithLike(true);
            g(i, createWithLike);
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
        g(i, createWithLike2);
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
        return this.d.b(d2).A(new gm8(this, d2));
    }

    public bn8 f(TasteOnboardingItem tasteOnboardingItem, List list) {
        String id = tasteOnboardingItem.id();
        TasteOnboardingItem d2 = d(this.c.e(), id);
        d2.getClass();
        TasteOnboardingItem e = e(this.c.e(), d2);
        e.getClass();
        int a2 = go8.a(e.relatedItems(), id);
        TasteOnboardingItem createWithExpanded = d2.createWithExpanded(true);
        ArrayList arrayList = new ArrayList(e.relatedItems());
        arrayList.set(a2, createWithExpanded);
        arrayList.addAll(a2 + 1, list);
        TasteOnboardingItem createWithRelatedItems = e.createWithRelatedItems(arrayList);
        int a3 = go8.a(this.c.e(), e.id());
        this.c.e().set(a3, createWithRelatedItems);
        wm8.b bVar = new wm8.b();
        bVar.b(this.c.e());
        an8.b bVar2 = new an8.b();
        bVar2.c(a2);
        bVar2.b(a3);
        bVar.c(bVar2.a());
        return bVar.a();
    }
}
