package defpackage;

import com.spotify.mobile.android.util.l0;
import io.reactivex.s;
import io.reactivex.z;
import okhttp3.e0;
import retrofit2.v;

/* renamed from: d27  reason: default package */
public class d27 implements c27 {
    private final e27 a;
    private final g27 b;

    public d27(e27 e27, g27 g27) {
        this.a = e27;
        this.b = g27;
    }

    public s<f27> a(String str) {
        z<v<e0>> a2 = this.a.a(l0.x(str) ? l0.z(str).k() : "");
        g27 g27 = this.b;
        g27.getClass();
        return a2.A(new b27(g27)).P();
    }
}
