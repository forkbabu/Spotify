package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.functions.g;

/* renamed from: yn8  reason: default package */
public final /* synthetic */ class yn8 implements g {
    public final /* synthetic */ TasteOnboardingItem a;

    public /* synthetic */ yn8(TasteOnboardingItem tasteOnboardingItem) {
        this.a = tasteOnboardingItem;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, String.format("Error expanding item in taste picker grid %s", this.a.id()), new Object[0]);
    }
}
