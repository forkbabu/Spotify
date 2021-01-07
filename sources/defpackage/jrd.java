package defpackage;

import android.net.Uri;
import io.reactivex.z;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* renamed from: jrd  reason: default package */
public class jrd {
    private final lrd a;

    /* access modifiers changed from: package-private */
    /* renamed from: jrd$a */
    public class a implements d<Void> {
        a(jrd jrd) {
        }

        @Override // retrofit2.d
        public void a(b<Void> bVar, Throwable th) {
        }

        @Override // retrofit2.d
        public void b(b<Void> bVar, v<Void> vVar) {
        }
    }

    public jrd(lrd lrd) {
        lrd.getClass();
        this.a = lrd;
    }

    public void a(String str, String str2) {
        if (str.startsWith("spotify:track")) {
            this.a.b(str, str2).d0(new a(this));
        }
    }

    public z<Boolean> b(String str, String str2, Uri uri) {
        Boolean bool = Boolean.FALSE;
        String a2 = ird.a(uri);
        if (a2 == null) {
            return z.z(bool);
        }
        return this.a.a(str, str2, a2).P(Boolean.TRUE).F(bool);
    }
}
