package defpackage;

import com.spotify.pses.v1.proto.ConfigurationResponse;
import io.reactivex.functions.g;

/* renamed from: zw0  reason: default package */
public final /* synthetic */ class zw0 implements g {
    public final /* synthetic */ ky0 a;

    public /* synthetic */ zw0(ky0 ky0) {
        this.a = ky0;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((ConfigurationResponse) obj);
    }
}
