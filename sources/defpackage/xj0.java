package defpackage;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.s;
import io.reactivex.z;
import java.nio.charset.Charset;

/* renamed from: xj0  reason: default package */
public class xj0 implements vj0 {
    private static final Charset b = Charset.forName("UTF8");
    private final yj0 a;

    public xj0(yj0 yj0) {
        this.a = yj0;
    }

    /* JADX DEBUG: Type inference failed for r3v5. Raw type applied. Possible types: io.reactivex.s<R>, io.reactivex.s<byte[]> */
    private s<byte[]> c(String str, String str2, byte[] bArr, String str3) {
        return (s<R>) this.a.resolve(new Request(str3, "sp://esperanto/" + str + '/' + str2, bArr)).j0(wj0.a);
    }

    static /* synthetic */ byte[] d(Response response) {
        if (response.getStatus() == 200) {
            return response.getBody();
        }
        throw new RuntimeException(new String(response.getBody(), b));
    }

    @Override // defpackage.vj0
    public s<byte[]> a(String str, String str2, byte[] bArr) {
        return c(str, str2, bArr, Request.SUB);
    }

    @Override // defpackage.vj0
    public z<byte[]> b(String str, String str2, byte[] bArr) {
        return c(str, str2, bArr, Request.POST).T();
    }
}
