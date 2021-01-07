package defpackage;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.h;
import com.spotify.music.behindthelyrics.persistence.database.BehindTheLyricsTracksDatabase;

/* renamed from: hk2  reason: default package */
public final class hk2 implements fjf<BehindTheLyricsTracksDatabase> {
    private final wlf<Context> a;

    public hk2(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        RoomDatabase.a a2 = h.a(this.a.get(), BehindTheLyricsTracksDatabase.class, "btl_tracks_db");
        a2.e();
        a2.c();
        return (BehindTheLyricsTracksDatabase) a2.d();
    }
}
