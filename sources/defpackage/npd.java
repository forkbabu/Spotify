package defpackage;

import com.spotify.remoteconfig.AndroidLibsYourLibraryFlagsProperties;
import java.util.concurrent.TimeUnit;

/* renamed from: npd  reason: default package */
public class npd {
    private final AndroidLibsYourLibraryFlagsProperties a;

    public npd(AndroidLibsYourLibraryFlagsProperties androidLibsYourLibraryFlagsProperties) {
        this.a = androidLibsYourLibraryFlagsProperties;
    }

    public long a() {
        return TimeUnit.HOURS.toMillis((long) this.a.c());
    }

    public boolean b() {
        return this.a.b();
    }

    public boolean c() {
        return this.a.d();
    }
}
