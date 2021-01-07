package defpackage;

import android.content.Intent;

/* renamed from: sv5  reason: default package */
public class sv5 {
    private pg0<Intent, Integer, Boolean> a = pv5.a;
    private a b = ov5.a;

    /* renamed from: sv5$a */
    public interface a {
        boolean b(int i, int i2, Intent intent);
    }

    public void a() {
        this.a = nv5.a;
    }

    public boolean b(int i, int i2, Intent intent) {
        return this.b.b(i, i2, intent);
    }

    public void c(pg0<Intent, Integer, Boolean> pg0) {
        this.a = pg0;
    }

    public void d(a aVar) {
        this.b = aVar;
    }

    public boolean e(Intent intent, int i) {
        return this.a.a(intent, Integer.valueOf(i)).booleanValue();
    }
}
