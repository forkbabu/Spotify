package defpackage;

import com.spotify.libs.connect.ConnectManager;
import io.reactivex.functions.l;

/* renamed from: or4  reason: default package */
public final /* synthetic */ class or4 implements l {
    public static final /* synthetic */ or4 a = new or4();

    private /* synthetic */ or4() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ConnectManager connectManager = (ConnectManager) obj;
        return connectManager.f().Q(nr4.a).j0(new pr4(connectManager));
    }
}
