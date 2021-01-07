package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.Targetings;
import io.reactivex.functions.g;

/* renamed from: hm1  reason: default package */
public final /* synthetic */ class hm1 implements g {
    public static final /* synthetic */ hm1 a = new hm1();

    private /* synthetic */ hm1() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Targetings targetings = (Targetings) obj;
        Logger.b("[FetchAdIdTaskPlugin] Successfully updated ad id.", new Object[0]);
    }
}
