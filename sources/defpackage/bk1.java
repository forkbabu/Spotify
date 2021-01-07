package defpackage;

import com.spotify.libs.connect.ConnectManager;
import io.reactivex.functions.g;

/* renamed from: bk1  reason: default package */
public final /* synthetic */ class bk1 implements g {
    public static final /* synthetic */ bk1 a = new bk1();

    private /* synthetic */ bk1() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ConnectManager connectManager = (ConnectManager) obj;
        if (!connectManager.e()) {
            connectManager.d();
        }
    }
}
