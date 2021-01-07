package defpackage;

import com.spotify.share.base.linkgeneration.proto.UtmParameters;
import defpackage.v3e;
import java.util.Map;

/* renamed from: b4e  reason: default package */
public abstract class b4e {

    /* renamed from: b4e$a */
    public interface a {
        a a(Map<String, String> map);

        b4e build();

        a c(String str);

        a d(UtmParameters utmParameters);
    }

    public static a a(String str) {
        v3e.b bVar = new v3e.b();
        bVar.b(str);
        return bVar;
    }

    public abstract String b();

    public abstract Map<String, String> c();

    public abstract String d();

    public abstract UtmParameters e();
}
