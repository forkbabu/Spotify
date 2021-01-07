package defpackage;

import com.spotify.cosmos.session.model.LoginResponse;
import io.reactivex.functions.g;

/* renamed from: e01  reason: default package */
public final /* synthetic */ class e01 implements g {
    public static final /* synthetic */ e01 a = new e01();

    private /* synthetic */ e01() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ((LoginResponse) obj).match(b01.a, h01.a, f01.a, g01.a, c01.a);
    }
}
