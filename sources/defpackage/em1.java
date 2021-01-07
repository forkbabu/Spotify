package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.Targetings;
import io.reactivex.functions.g;

/* renamed from: em1  reason: default package */
public final /* synthetic */ class em1 implements g {
    public static final /* synthetic */ em1 a = new em1();

    private /* synthetic */ em1() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Targetings targetings = (Targetings) obj;
        Logger.b("[FetchAdIdTaskPlugin] Successfully updated limit ad tracking", new Object[0]);
    }
}
