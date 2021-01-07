package defpackage;

import android.os.Handler;
import com.google.common.base.Joiner;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.ResolverCallbackReceiver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import java.nio.charset.Charset;

/* renamed from: xr0  reason: default package */
public class xr0 implements wr0 {
    private final FireAndForgetResolver a;
    private final Handler b;

    public xr0(Handler handler, FireAndForgetResolver fireAndForgetResolver) {
        handler.getClass();
        this.b = handler;
        this.a = fireAndForgetResolver;
    }

    private void c(String str, String... strArr) {
        this.a.resolve(RequestBuilder.postBytes(str, Joiner.on("\n").join(strArr).getBytes(Charset.defaultCharset())).build(), ResolverCallbackReceiver.forAny(this.b, new rr0(str, strArr), new sr0(str, strArr)));
    }

    @Override // defpackage.wr0
    public void a(String str) {
        c("sp://connect/v1/set_preferred_zeroconf", str);
    }

    @Override // defpackage.wr0
    public void b(String str) {
        c("sp://connect/v1/logout", str);
    }
}
