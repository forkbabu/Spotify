package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: k3a  reason: default package */
public final /* synthetic */ class k3a implements g {
    public static final /* synthetic */ k3a a = new k3a();

    private /* synthetic */ k3a() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("BranchSDKHandler error on fetching feature flag: %s", (Throwable) obj);
    }
}
