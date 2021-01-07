package defpackage;

import com.google.common.base.Predicate;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.Iterator;
import java.util.List;

/* renamed from: fm8  reason: default package */
public final /* synthetic */ class fm8 implements Predicate {
    public final /* synthetic */ List a;

    public /* synthetic */ fm8(List list) {
        this.a = list;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        boolean z;
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) obj;
        Iterator it = this.a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (tasteOnboardingItem.id().equals(((TasteOnboardingItem) it.next()).id())) {
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
