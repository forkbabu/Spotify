package defpackage;

import com.spotify.libs.connect.ConnectManager;
import io.reactivex.functions.l;

/* renamed from: eo4  reason: default package */
public final /* synthetic */ class eo4 implements l {
    public static final /* synthetic */ eo4 a = new eo4();

    private /* synthetic */ eo4() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ConnectManager connectManager = (ConnectManager) obj;
        return connectManager.f().Q(fo4.a).j0(new lo4(connectManager));
    }
}
