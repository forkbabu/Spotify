package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import defpackage.s45;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: t45  reason: default package */
public abstract class t45 {

    /* renamed from: t45$a */
    public interface a {
        a a(String str);

        a b(Map<String, CollectionStateProvider.a> map);

        t45 build();

        a c(List<com.spotify.music.freetiercommon.models.a> list);

        a d(boolean z);
    }

    public static a a() {
        s45.b bVar = new s45.b();
        bVar.b(Collections.emptyMap());
        s45.b bVar2 = bVar;
        bVar2.d(false);
        return bVar2;
    }

    public abstract Map<String, CollectionStateProvider.a> b();

    public abstract String c();

    public abstract List<com.spotify.music.freetiercommon.models.a> d();

    public abstract boolean e();

    public abstract a f();
}
