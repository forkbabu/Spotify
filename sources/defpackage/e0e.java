package defpackage;

import android.content.Context;
import com.spotify.remoteconfig.client.cosmos.c;
import com.spotify.remoteconfig.client.model.resolve.FetchType;
import io.reactivex.a;
import io.reactivex.z;
import okhttp3.e;

/* renamed from: e0e  reason: default package */
public final class e0e implements l0e {
    private final Context a;
    private final e.a b;
    private final hl0 c;
    private final c d;
    private f0e e;

    private e0e(Context context, e.a aVar, hl0 hl0, c cVar) {
        this.a = context;
        this.b = aVar;
        this.c = hl0;
        this.d = cVar;
    }

    public static e0e d(Context context, e.a aVar, hl0 hl0, c cVar) {
        return new e0e(context.getApplicationContext(), aVar, hl0, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x010f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0110, code lost:
        defpackage.yif.j(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0113, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x011f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0120, code lost:
        defpackage.yif.j(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0123, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.f0e h() {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e0e.h():f0e");
    }

    @Override // defpackage.l0e
    public <T extends n0e> T a(o0e<T> o0e) {
        return (T) h().e(o0e);
    }

    public void b() {
        h().a();
    }

    public a c() {
        return h().c();
    }

    public a e() {
        return h().d(FetchType.UNKNOWN);
    }

    public a f(FetchType fetchType) {
        return h().d(fetchType);
    }

    public c0e g() {
        return h().g();
    }

    public z<Boolean> i(byte[] bArr) {
        return h().i(bArr, false);
    }

    public z<Boolean> j(byte[] bArr, boolean z) {
        return h().i(bArr, z);
    }
}
