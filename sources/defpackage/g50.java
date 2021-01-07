package defpackage;

import android.util.Log;

/* renamed from: g50  reason: default package */
public class g50 extends j50 {
    String a;

    public g50(String str) {
        this.a = str;
    }

    @Override // defpackage.j50
    public void b(String str) {
        String.valueOf(this.a);
    }

    @Override // defpackage.j50
    public void c(String str) {
        Log.e("isoparser", String.valueOf(this.a) + ":" + str);
    }

    @Override // defpackage.j50
    public void d(String str) {
        String.valueOf(this.a);
    }
}
