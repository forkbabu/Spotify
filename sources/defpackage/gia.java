package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: gia  reason: default package */
public final /* synthetic */ class gia implements g {
    public static final /* synthetic */ gia a = new gia();

    private /* synthetic */ gia() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.l("Received state %s", (Optional) obj);
    }
}
