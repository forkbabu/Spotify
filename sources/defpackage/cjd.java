package defpackage;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.h;
import com.spotify.music.storylines.persistence.database.StorylinesDatabase;

/* renamed from: cjd  reason: default package */
public final class cjd implements fjf<StorylinesDatabase> {
    private final wlf<Context> a;

    public cjd(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        RoomDatabase.a a2 = h.a(this.a.get(), StorylinesDatabase.class, "storylines_tracks_db");
        a2.c();
        a2.e();
        return (StorylinesDatabase) a2.d();
    }
}
