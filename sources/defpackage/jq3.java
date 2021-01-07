package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: jq3  reason: default package */
public final /* synthetic */ class jq3 implements g {
    public static final /* synthetic */ jq3 a = new jq3();

    private /* synthetic */ jq3() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Error in SPL subscription", new Object[0]);
    }
}
