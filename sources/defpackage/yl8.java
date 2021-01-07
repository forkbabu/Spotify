package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.g;
import java.util.List;

/* renamed from: yl8  reason: default package */
public final /* synthetic */ class yl8 implements g {
    public final /* synthetic */ dn8 a;
    public final /* synthetic */ TasteOnboardingItem b;

    public /* synthetic */ yl8(dn8 dn8, TasteOnboardingItem tasteOnboardingItem) {
        this.a = dn8;
        this.b = tasteOnboardingItem;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(this.b, (List) obj);
    }
}
