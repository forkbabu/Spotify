package defpackage;

import android.os.Parcelable;
import com.spotify.music.libs.viewuri.c;
import defpackage.wjb;
import java.util.Collections;
import java.util.List;

/* renamed from: yjb  reason: default package */
public abstract class yjb implements Parcelable {

    /* renamed from: yjb$a */
    public static abstract class a {
        public abstract yjb a();

        public abstract a b(List<String> list);

        public abstract a c(c cVar);
    }

    public static a a() {
        wjb.a aVar = new wjb.a();
        aVar.b(Collections.emptyList());
        return aVar;
    }

    public abstract List<String> b();

    public abstract c c();
}
