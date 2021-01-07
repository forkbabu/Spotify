package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: sba  reason: default package */
public class sba {
    private final a a;
    private final Context b;

    /* renamed from: sba$a */
    public interface a {
        Intent a(Context context);
    }

    public sba(Context context, a aVar) {
        this.b = context;
        this.a = aVar;
    }

    public Intent a() {
        return this.a.a(this.b);
    }
}
