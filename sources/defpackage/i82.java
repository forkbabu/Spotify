package defpackage;

import com.google.android.exoplayer2.database.a;
import com.spotify.mobile.android.video.offline.z;
import java.io.File;

/* renamed from: i82  reason: default package */
public final class i82 implements fjf<z> {
    private final wlf<a> a;
    private final wlf<File> b;

    public i82(wlf<a> wlf, wlf<File> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z(this.a.get(), this.b.get());
    }
}
