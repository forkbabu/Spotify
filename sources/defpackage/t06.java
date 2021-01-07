package defpackage;

import com.spotify.playlist.models.Episode;
import defpackage.s06;
import java.util.Collections;
import java.util.Map;

/* renamed from: t06  reason: default package */
public abstract class t06 {

    /* renamed from: t06$a */
    public interface a {
    }

    public static a a() {
        s06.b bVar = new s06.b();
        bVar.d(false);
        s06.b bVar2 = bVar;
        bVar2.c(true);
        s06.b bVar3 = bVar2;
        bVar3.a(Collections.emptyMap());
        return bVar3;
    }

    public abstract Map<String, String> b();

    public abstract int c();

    public abstract Episode.MediaType d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract boolean h();

    public abstract boolean i();
}
