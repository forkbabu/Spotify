package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.tasteonboarding.artistpicker.model.ArtistPickerResponse;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.features.tasteonboarding.model.d;
import defpackage.xm8;
import io.reactivex.d0;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: in8  reason: default package */
public class in8 implements hn8 {
    private final sm8 a;
    private final ho8 b;

    public in8(sm8 sm8, ho8 ho8) {
        this.a = sm8;
        this.b = ho8;
    }

    private z<cn8> b(TasteOnboardingItem tasteOnboardingItem) {
        TasteOnboardingItem createWithRelatedItems = tasteOnboardingItem.createWithRelatedItems(Collections2.newArrayList(Collections2.filter((Iterable) tasteOnboardingItem.relatedItems(), (Predicate) new bm8(this))));
        List<TasteOnboardingItem> relatedItems = createWithRelatedItems.relatedItems();
        int size = relatedItems.size();
        if (size > 6) {
            size = 6;
        }
        boolean z = false;
        List<TasteOnboardingItem> subList = relatedItems.subList(0, size);
        ArrayList arrayList = new ArrayList(createWithRelatedItems.relatedItems());
        arrayList.subList(0, subList.size()).clear();
        TasteOnboardingItem createWithRelatedItems2 = createWithRelatedItems.createWithRelatedItems(arrayList);
        e(createWithRelatedItems2);
        xm8.b bVar = new xm8.b();
        String id = tasteOnboardingItem.id();
        ArrayList arrayList2 = new ArrayList();
        for (TasteOnboardingItem tasteOnboardingItem2 : subList) {
            String x0 = je.x0("more-", id);
            d logging = tasteOnboardingItem2.logging();
            logging.getClass();
            arrayList2.add(tasteOnboardingItem2.createWithLogging(logging.h(x0).g(id)));
        }
        bVar.a(ImmutableList.copyOf((Collection) arrayList2));
        if (createWithRelatedItems2.relatedItems().isEmpty() && MoreObjects.isNullOrEmpty(createWithRelatedItems2.moreUri())) {
            z = true;
        }
        bVar.c(z);
        return z.z(bVar.b());
    }

    private void e(TasteOnboardingItem tasteOnboardingItem) {
        List<TasteOnboardingItem> e = this.a.e();
        String id = tasteOnboardingItem.id();
        List<TasteOnboardingItem> e2 = this.a.e();
        int i = 0;
        while (true) {
            if (i >= e2.size()) {
                i = -1;
                break;
            } else if (e2.get(i).id().equals(id)) {
                break;
            } else {
                i++;
            }
        }
        e.set(i, tasteOnboardingItem);
    }

    @Override // defpackage.hn8
    public z<cn8> a(TasteOnboardingItem tasteOnboardingItem) {
        if ((tasteOnboardingItem.relatedItems().size() >= 6) || MoreObjects.isNullOrEmpty(tasteOnboardingItem.moreUri())) {
            return b(tasteOnboardingItem);
        }
        ho8 ho8 = this.b;
        String moreUri = tasteOnboardingItem.moreUri();
        moreUri.getClass();
        return ho8.b(moreUri).s(new cm8(this, tasteOnboardingItem));
    }

    public d0 c(TasteOnboardingItem tasteOnboardingItem, ArtistPickerResponse artistPickerResponse) {
        TasteOnboardingItem tasteOnboardingItem2 = artistPickerResponse.items().get(0);
        ArrayList arrayList = new ArrayList(tasteOnboardingItem.relatedItems());
        arrayList.addAll(tasteOnboardingItem2.relatedItems());
        TasteOnboardingItem createWithRelatedItems = tasteOnboardingItem.createWithMoreUri(tasteOnboardingItem2.moreUri()).createWithRelatedItems(arrayList);
        e(createWithRelatedItems);
        return b(createWithRelatedItems);
    }

    public boolean d(TasteOnboardingItem tasteOnboardingItem) {
        boolean z;
        Iterator<TasteOnboardingItem> it = this.a.e().iterator();
        while (true) {
            if (it.hasNext()) {
                if (tasteOnboardingItem.id().equals(it.next().id())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return !z;
    }
}
