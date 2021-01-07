package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: jv6  reason: default package */
public final /* synthetic */ class jv6 implements g {
    public static final /* synthetic */ jv6 a = new jv6();

    private /* synthetic */ jv6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "CollaborativeItem: Failed to set collaborative state.", new Object[0]);
    }
}
