package defpackage;

import com.spotify.libs.connect.ConnectManager;
import io.reactivex.functions.n;

/* renamed from: nr4  reason: default package */
public final /* synthetic */ class nr4 implements n {
    public static final /* synthetic */ nr4 a = new nr4();

    private /* synthetic */ nr4() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((ConnectManager.ConnectManagerState) obj) == ConnectManager.ConnectManagerState.STARTED;
    }
}
