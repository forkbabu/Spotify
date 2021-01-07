package defpackage;

import com.spotify.music.features.nowplayingbar.domain.ContentType;
import com.spotify.music.features.nowplayingbar.domain.a;

/* renamed from: vt5  reason: default package */
public abstract class vt5 {
    public static vt5 c(String str, boolean z, boolean z2, ContentType contentType, a aVar) {
        return new ut5(str, z, z2, contentType, aVar);
    }

    public abstract a a();

    public abstract ContentType b();

    public abstract boolean d();

    public abstract String e();

    public abstract boolean f();
}
