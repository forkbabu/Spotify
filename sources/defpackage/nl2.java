package defpackage;

import android.content.Context;
import android.os.Build;
import com.spotify.mobile.android.util.x;
import com.spotify.remoteconfig.yc;

/* renamed from: nl2  reason: default package */
public class nl2 {
    private final tl2 a;
    private final Context b;
    private final sda c;
    private final yc d;

    public nl2(tl2 tl2, Context context, sda sda, yc ycVar) {
        this.a = tl2;
        this.b = context;
        this.c = sda;
        this.d = ycVar;
    }

    public boolean a() {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 && i != 25 && !x.g(this.b) && this.d.a() && !this.c.a();
    }

    public boolean b() {
        return a() && this.a.a();
    }

    public void c(boolean z) {
        this.a.b(z);
    }
}
