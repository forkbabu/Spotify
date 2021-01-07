package defpackage;

import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import defpackage.s2f;

/* renamed from: v2f  reason: default package */
public abstract class v2f implements Parcelable {

    /* access modifiers changed from: package-private */
    /* renamed from: v2f$a */
    public interface a {
    }

    public static v2f a(String str, String str2) {
        s2f.b bVar = new s2f.b();
        bVar.d("");
        if (MoreObjects.isNullOrEmpty(str)) {
            str = "";
        }
        bVar.b(str);
        if (MoreObjects.isNullOrEmpty(str2)) {
            str2 = "";
        }
        bVar.c(str2);
        return bVar.a();
    }

    public static v2f b() {
        s2f.b bVar = new s2f.b();
        bVar.d("");
        bVar.b("");
        bVar.c("");
        return bVar.a();
    }

    public abstract String c();

    public abstract String e();

    public abstract a f();

    public abstract String g();

    public v2f h(String str) {
        s2f.b bVar = (s2f.b) f();
        bVar.d(str);
        return bVar.a();
    }
}
