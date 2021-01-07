package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: lv6  reason: default package */
public final /* synthetic */ class lv6 implements g {
    public static final /* synthetic */ lv6 a = new lv6();

    private /* synthetic */ lv6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to remove playlist.", new Object[0]);
    }
}
