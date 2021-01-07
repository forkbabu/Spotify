package defpackage;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.spotify.superbird.pitstop.room.PitstopDatabase;
import defpackage.hpe;
import kotlin.jvm.internal.h;

/* renamed from: jpe  reason: default package */
public final class jpe implements fjf<PitstopDatabase> {
    private final wlf<Context> a;

    public jpe(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        hpe.a aVar = hpe.a;
        h.e(context, "context");
        RoomDatabase.a a2 = androidx.room.h.a(context, PitstopDatabase.class, "pitstop_logs_db");
        a2.e();
        RoomDatabase d = a2.d();
        h.d(d, "Room.databaseBuilder(con…\n                .build()");
        return (PitstopDatabase) d;
    }
}
