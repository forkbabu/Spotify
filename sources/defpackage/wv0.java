package defpackage;

import android.app.Application;
import androidx.room.RoomDatabase;
import com.spotify.libs.onboarding.allboarding.room.AllboardingDatabase;
import defpackage.vv0;
import kotlin.jvm.internal.h;

/* renamed from: wv0  reason: default package */
public final class wv0 implements fjf<AllboardingDatabase> {
    private final wlf<Application> a;

    public wv0(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Application application = this.a.get();
        vv0.a aVar = vv0.a;
        h.e(application, "context");
        RoomDatabase d = androidx.room.h.b(application, AllboardingDatabase.class).d();
        h.d(d, "Room.inMemoryDatabaseBui…                ).build()");
        return (AllboardingDatabase) d;
    }
}
