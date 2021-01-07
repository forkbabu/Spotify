package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.model.RelatedArtistsResponse;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.l;

/* renamed from: dm8  reason: default package */
public final /* synthetic */ class dm8 implements l {
    public final /* synthetic */ mn8 a;
    public final /* synthetic */ TasteOnboardingItem b;

    public /* synthetic */ dm8(mn8 mn8, TasteOnboardingItem tasteOnboardingItem) {
        this.a = mn8;
        this.b = tasteOnboardingItem;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(this.b, (RelatedArtistsResponse) obj);
    }
}
