package defpackage;

import com.spotify.libs.connect.ConnectManager;
import io.reactivex.functions.n;

/* renamed from: fo4  reason: default package */
public final /* synthetic */ class fo4 implements n {
    public static final /* synthetic */ fo4 a = new fo4();

    private /* synthetic */ fo4() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((ConnectManager.ConnectManagerState) obj) == ConnectManager.ConnectManagerState.STARTED;
    }
}
