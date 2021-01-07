package defpackage;

import android.os.Handler;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.ResolverCallbackReceiver;
import com.spotify.cosmos.router.Request;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.n;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import java.nio.charset.Charset;

/* renamed from: as0  reason: default package */
public class as0 implements zr0 {
    private String a = "";
    private final FireAndForgetResolver b;
    private final Handler c;
    private final n d;

    public as0(Handler handler, FireAndForgetResolver fireAndForgetResolver, n nVar) {
        handler.getClass();
        this.c = handler;
        this.b = fireAndForgetResolver;
        this.d = nVar;
    }

    private void e(String str, String... strArr) {
        Request build = RequestBuilder.postBytes(str, Joiner.on("\n").join(strArr).getBytes(Charset.defaultCharset())).build();
        String join = Joiner.on(",").join(strArr);
        this.b.resolve(build, ResolverCallbackReceiver.forAny(this.c, new tr0(str, join), new ur0(str, join)));
    }

    @Override // defpackage.zr0
    public void a(String str) {
        e("sp://connect/v1/attach", str);
        this.a = str;
    }

    @Override // defpackage.zr0
    public Optional<String> b() {
        if (this.a.isEmpty()) {
            return Optional.absent();
        }
        return Optional.of(this.a);
    }

    @Override // defpackage.zr0
    public void c(String str) {
        this.a = str;
        for (ConnectManager.b bVar : this.d.a()) {
            bVar.c();
        }
        if (rw.equal(str, "local_device")) {
            e("sp://connect/v1/pull", new String[0]);
        } else {
            e("sp://connect/v1/transfer", str);
        }
    }

    @Override // defpackage.zr0
    public void d() {
        c("local_device");
    }
}
