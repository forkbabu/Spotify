package defpackage;

import com.spotify.pageloader.NetworkErrorReason;
import io.reactivex.functions.h;

/* renamed from: lbc  reason: default package */
public final /* synthetic */ class lbc implements h {
    public static final /* synthetic */ lbc a = new lbc();

    private /* synthetic */ lbc() {
    }

    @Override // io.reactivex.functions.h
    public final Object a(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj3;
        if (((Boolean) obj).booleanValue()) {
            return NetworkErrorReason.FORCED_OFFLINE;
        }
        if (bool.booleanValue() && !bool2.booleanValue()) {
            return NetworkErrorReason.AIRPLANE_MODE;
        }
        if (!bool2.booleanValue()) {
            return NetworkErrorReason.NO_NETWORK_CONNECTION;
        }
        return NetworkErrorReason.UNKNOWN;
    }
}
