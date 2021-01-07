package defpackage;

import android.net.Uri;
import com.spotify.http.wg.b;
import io.reactivex.schedulers.a;
import io.reactivex.z;

/* renamed from: ckb  reason: default package */
public class ckb {
    private final bkb a;
    private final b b;

    public ckb(bkb bkb, b bVar) {
        this.a = bkb;
        this.b = bVar;
    }

    public z<String> a() {
        String host = Uri.parse("https://app-report.spotify.com/").getHost();
        if (host != null) {
            this.b.b(host);
        }
        return this.a.getToken().A(akb.a).H(a.c()).B(io.reactivex.android.schedulers.a.b());
    }
}
