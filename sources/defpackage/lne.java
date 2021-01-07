package defpackage;

import com.spotify.mobile.android.util.connectivity.ConnectionType;
import io.reactivex.functions.n;

/* renamed from: lne  reason: default package */
public final /* synthetic */ class lne implements n {
    public static final /* synthetic */ lne a = new lne();

    private /* synthetic */ lne() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        ConnectionType connectionType = (ConnectionType) obj;
        int i = vne.l;
        return connectionType == ConnectionType.CONNECTION_TYPE_WLAN;
    }
}
