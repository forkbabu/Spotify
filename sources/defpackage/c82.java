package defpackage;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.h;
import com.spotify.mobile.android.video.offline.database.BetamaxOfflineDatabase;
import com.spotify.mobile.android.video.offline.x;

/* renamed from: c82  reason: default package */
public final class c82 implements fjf<x> {
    private final wlf<Context> a;

    public c82(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        RoomDatabase.a a2 = h.a(this.a.get(), BetamaxOfflineDatabase.class, "bmax-offline.db");
        a2.e();
        a2.c();
        return new x((BetamaxOfflineDatabase) a2.d());
    }
}
