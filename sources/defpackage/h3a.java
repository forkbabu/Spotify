package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: h3a  reason: default package */
public final /* synthetic */ class h3a implements g {
    public static final /* synthetic */ h3a a = new h3a();

    private /* synthetic */ h3a() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("BranchSDKHandler error on fetching feature flag: %s", (Throwable) obj);
    }
}
