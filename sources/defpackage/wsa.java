package defpackage;

import com.google.common.base.Optional;
import defpackage.vsa;

/* renamed from: wsa  reason: default package */
public abstract class wsa {

    /* renamed from: wsa$a */
    public interface a {
        a a(int i);

        a b(String str);

        wsa build();

        a c(String str);

        a d(String str);

        a e(rqe rqe);
    }

    public static a a() {
        return new vsa.b();
    }

    public abstract Optional<Integer> b();

    public abstract Optional<String> c();

    public abstract Optional<String> d();

    public abstract Optional<String> e();

    public abstract rqe f();
}
