package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.model.ArtistPickerResponse;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.l;

/* renamed from: cm8  reason: default package */
public final /* synthetic */ class cm8 implements l {
    public final /* synthetic */ in8 a;
    public final /* synthetic */ TasteOnboardingItem b;

    public /* synthetic */ cm8(in8 in8, TasteOnboardingItem tasteOnboardingItem) {
        this.a = in8;
        this.b = tasteOnboardingItem;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (ArtistPickerResponse) obj);
    }
}
