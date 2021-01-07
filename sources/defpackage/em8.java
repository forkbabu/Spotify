package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.Collections;

/* renamed from: em8  reason: default package */
public final /* synthetic */ class em8 implements Function {
    public static final /* synthetic */ em8 a = new em8();

    private /* synthetic */ em8() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        TasteOnboardingItem tasteOnboardingItem = (TasteOnboardingItem) obj;
        int i = mn8.c;
        if (tasteOnboardingItem.relatedItems().isEmpty()) {
            return Collections.singleton(tasteOnboardingItem);
        }
        return FluentIterable.concat(Collections.singleton(tasteOnboardingItem), tasteOnboardingItem.relatedItems());
    }
}
