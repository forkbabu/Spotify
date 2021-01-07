package defpackage;

import com.spotify.voice.api.model.ErrorDomain;
import com.spotify.voice.api.model.i;
import defpackage.qte;

/* renamed from: ute  reason: default package */
public abstract class ute {

    /* renamed from: ute$a */
    public interface a {
        a a(String str);

        a b(String str);

        ute build();

        a c(ErrorDomain errorDomain);

        a d(i iVar);

        a n(String str);
    }

    public static a a() {
        return new qte.b();
    }

    public abstract String b();

    public abstract String c();

    public abstract ErrorDomain d();

    public abstract String e();

    public abstract i f();
}
