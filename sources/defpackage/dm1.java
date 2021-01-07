package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.Targetings;
import io.reactivex.functions.g;

/* renamed from: dm1  reason: default package */
public final /* synthetic */ class dm1 implements g {
    public static final /* synthetic */ dm1 a = new dm1();

    private /* synthetic */ dm1() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Targetings targetings = (Targetings) obj;
        Logger.b("[FetchAdIdTaskPlugin] Successfully updated ad id type.", new Object[0]);
    }
}
