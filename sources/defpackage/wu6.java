package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: wu6  reason: default package */
public final /* synthetic */ class wu6 implements g {
    public static final /* synthetic */ wu6 a = new wu6();

    private /* synthetic */ wu6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "PlayButtonAction: Failed to play.", new Object[0]);
    }
}
