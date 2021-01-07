package defpackage;

import android.os.Parcelable;
import defpackage.tie;
import defpackage.wie;

/* renamed from: zie  reason: default package */
public abstract class zie implements Parcelable {
    public static final zie a;

    /* renamed from: zie$a */
    public interface a {
    }

    static {
        tie.b bVar = new tie.b();
        bVar.c(new wie.c());
        bVar.d(false);
        bVar.b(false);
        a = bVar.a();
    }

    public abstract boolean a();

    public abstract wie b();

    public abstract boolean c();

    public abstract a e();

    public zie f(boolean z) {
        tie.b bVar = (tie.b) e();
        bVar.b(z);
        return bVar.a();
    }

    public zie g(boolean z) {
        tie.b bVar = (tie.b) e();
        bVar.d(z);
        return bVar.a();
    }
}
