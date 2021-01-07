package com.spotify.remoteconfig.client.network;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.paste.widgets.b;
import com.spotify.remoteconfig.client.logging.EventLogger;
import com.spotify.remoteconfig.client.model.resolve.FetchType;
import io.reactivex.functions.g;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class f<T> implements g<Throwable> {
    final /* synthetic */ i a;
    final /* synthetic */ FetchType b;

    f(i iVar, FetchType fetchType) {
        this.a = iVar;
        this.b = fetchType;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Throwable th) {
        Throwable th2 = th;
        h.f(th2, AppProtocol.LogMessage.SEVERITY_ERROR);
        this.a.g.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.a.a;
        trf.c(th2, "The call to UCS failed locally within %d ms.", Long.valueOf(currentTimeMillis));
        if (th2 instanceof UcsRequestFailedException) {
            i.h(this.a, currentTimeMillis, this.b, ((UcsRequestFailedException) th2).a());
        } else if ((th2 instanceof SocketTimeoutException) || h.a(th2.getMessage(), "timeout")) {
            b.f(this.a.f, this.b, currentTimeMillis, this.a.d, EventLogger.FetchErrorReason.TIMEOUT, th2.getMessage(), 0, 32, null);
        } else if (th2.getMessage() != null) {
            b.f(this.a.f, this.b, currentTimeMillis, this.a.d, EventLogger.FetchErrorReason.CLIENT_ERROR, th2.getMessage(), 0, 32, null);
        } else {
            String message = th2.getMessage();
            if (message == null) {
                message = "unknown error message";
            }
            StringBuilder Z0 = je.Z0(message, " - ");
            Throwable cause = th2.getCause();
            Z0.append(cause != null ? cause.getMessage() : null);
            b.f(this.a.f, this.b, currentTimeMillis, this.a.d, EventLogger.FetchErrorReason.UNKNOWN, Z0.toString(), 0, 32, null);
        }
    }
}
