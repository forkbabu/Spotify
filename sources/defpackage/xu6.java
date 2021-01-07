package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: xu6  reason: default package */
public final /* synthetic */ class xu6 implements g {
    public static final /* synthetic */ xu6 a = new xu6();

    private /* synthetic */ xu6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "PlayButtonAction: Failed to play.", new Object[0]);
    }
}
