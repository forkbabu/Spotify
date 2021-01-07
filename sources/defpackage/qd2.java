package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: qd2  reason: default package */
public final /* synthetic */ class qd2 implements g {
    public static final /* synthetic */ qd2 a = new qd2();

    private /* synthetic */ qd2() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("[VoiceAd] save event error %s", (Throwable) obj);
    }
}
