package defpackage;

import com.spotify.music.features.employeepodcasts.api.ShelterLoginResponse;
import com.spotify.music.features.employeepodcasts.api.a;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: py4  reason: default package */
public final class py4 implements oy4 {
    private final a a;

    public py4(a aVar) {
        h.e(aVar, "mEndpoint");
        this.a = aVar;
    }

    @Override // defpackage.oy4
    public z<ShelterLoginResponse> a(String str) {
        h.e(str, "code");
        return this.a.a(str, "https://shelter.spotify.com/auth/google/android");
    }
}
