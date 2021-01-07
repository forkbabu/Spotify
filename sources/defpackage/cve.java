package defpackage;

import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import defpackage.xue;

/* renamed from: cve  reason: default package */
public abstract class cve implements Parcelable {

    /* access modifiers changed from: package-private */
    /* renamed from: cve$a */
    public interface a {
    }

    public static cve b(String str, String str2, String str3) {
        xue.b bVar = new xue.b();
        bVar.e("");
        if (MoreObjects.isNullOrEmpty(str)) {
            str = "";
        }
        bVar.c(str);
        if (MoreObjects.isNullOrEmpty(str2)) {
            str2 = "";
        }
        bVar.d(str2);
        if (MoreObjects.isNullOrEmpty(str3)) {
            str3 = "";
        }
        bVar.b(str3);
        return bVar.a();
    }

    public static cve c() {
        xue.b bVar = new xue.b();
        bVar.e("");
        bVar.c("");
        bVar.d("");
        bVar.b("");
        return bVar.a();
    }

    public abstract String a();

    public abstract String e();

    public abstract String f();

    public abstract a g();

    public abstract String h();

    public cve i(String str) {
        xue.b bVar = (xue.b) g();
        bVar.e(str);
        return bVar.a();
    }
}
