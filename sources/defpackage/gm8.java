package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: gm8  reason: default package */
public final /* synthetic */ class gm8 implements l {
    public final /* synthetic */ sn8 a;
    public final /* synthetic */ TasteOnboardingItem b;

    public /* synthetic */ gm8(sn8 sn8, TasteOnboardingItem tasteOnboardingItem) {
        this.a = sn8;
        this.b = tasteOnboardingItem;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f(this.b, (List) obj);
    }
}
