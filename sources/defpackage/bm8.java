package defpackage;

import com.google.common.base.Predicate;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;

/* renamed from: bm8  reason: default package */
public final /* synthetic */ class bm8 implements Predicate {
    public final /* synthetic */ in8 a;

    public /* synthetic */ bm8(in8 in8) {
        this.a = in8;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return this.a.d((TasteOnboardingItem) obj);
    }
}
