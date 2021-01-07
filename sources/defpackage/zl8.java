package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: zl8  reason: default package */
public final /* synthetic */ class zl8 implements l {
    public final /* synthetic */ dn8 a;
    public final /* synthetic */ TasteOnboardingItem b;

    public /* synthetic */ zl8(dn8 dn8, TasteOnboardingItem tasteOnboardingItem) {
        this.a = dn8;
        this.b = tasteOnboardingItem;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f(this.b, (List) obj);
    }
}
