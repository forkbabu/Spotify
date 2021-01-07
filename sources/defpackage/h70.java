package defpackage;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.h;
import com.spotify.accountinfostore.room.LocalAccountInfoDatabase;

/* renamed from: h70  reason: default package */
public final class h70 implements fjf<LocalAccountInfoDatabase> {
    private final wlf<Context> a;

    public h70(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        RoomDatabase.a a2 = h.a(this.a.get(), LocalAccountInfoDatabase.class, "account_info_db");
        a2.e();
        return (LocalAccountInfoDatabase) a2.d();
    }
}
