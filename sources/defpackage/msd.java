package defpackage;

import android.content.Context;
import androidx.room.h;
import com.spotify.packagevalidator.denylist.cache.db.DenylistDatabase;

/* renamed from: msd  reason: default package */
public final class msd implements fjf<DenylistDatabase> {
    private final wlf<Context> a;

    public msd(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return (DenylistDatabase) h.a(this.a.get().getApplicationContext(), DenylistDatabase.class, "denylist.db").d();
    }
}
