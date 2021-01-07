package defpackage;

import android.os.Parcelable;
import defpackage.nae;
import defpackage.uae;
import java.util.Calendar;

/* renamed from: tae  reason: default package */
public abstract class tae implements Parcelable {
    public static final tae a;

    /* renamed from: tae$a */
    public interface a {
    }

    static {
        Calendar instance = Calendar.getInstance();
        int i = instance.get(2);
        int i2 = instance.get(5);
        nae.b bVar = new nae.b();
        bVar.a(new uae.b());
        bVar.b(i2);
        bVar.c(i);
        bVar.d(instance.get(1) - 10);
        bVar.f(false);
        a = bVar.e();
    }

    public abstract uae a();

    public abstract int b();

    public abstract int c();

    public abstract int e();

    public abstract boolean f();

    public abstract a g();

    public tae h(int i, int i2, int i3, uae uae) {
        nae.b bVar = (nae.b) g();
        bVar.d(i);
        bVar.c(i2);
        bVar.b(i3);
        bVar.a(uae);
        return bVar.e();
    }

    public tae i(uae uae) {
        nae.b bVar = (nae.b) g();
        bVar.a(uae);
        return bVar.e();
    }
}
