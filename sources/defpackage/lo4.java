package defpackage;

import com.spotify.libs.connect.ConnectManager;
import io.reactivex.functions.l;

/* renamed from: lo4  reason: default package */
public final /* synthetic */ class lo4 implements l {
    public final /* synthetic */ ConnectManager a;

    public /* synthetic */ lo4(ConnectManager connectManager) {
        this.a = connectManager;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ConnectManager.ConnectManagerState connectManagerState = (ConnectManager.ConnectManagerState) obj;
        return this.a;
    }
}
