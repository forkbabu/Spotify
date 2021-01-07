package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.x;
import com.spotify.remoteconfig.db;

/* renamed from: djd  reason: default package */
public class djd {
    private final db a;
    private final Context b;

    public djd(db dbVar, Context context) {
        this.a = dbVar;
        this.b = context;
    }

    public boolean a() {
        return !x.g(this.b) && this.a.a();
    }

    public boolean b() {
        return this.a.b();
    }
}
