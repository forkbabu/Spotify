package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.g;

/* renamed from: zn8  reason: default package */
public final /* synthetic */ class zn8 implements g {
    public final /* synthetic */ co8 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TasteOnboardingItem c;

    public /* synthetic */ zn8(co8 co8, int i, TasteOnboardingItem tasteOnboardingItem) {
        this.a = co8;
        this.b = i;
        this.c = tasteOnboardingItem;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.G2(this.b, this.c, (cn8) obj);
    }
}
