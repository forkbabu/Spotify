package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: kd2  reason: default package */
public final /* synthetic */ class kd2 implements g {
    public static final /* synthetic */ kd2 a = new kd2();

    private /* synthetic */ kd2() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("[VoiceAd] EarconPlayer start error %s", (Throwable) obj);
    }
}
