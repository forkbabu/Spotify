package defpackage;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.e;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.b;
import com.google.android.gms.auth.api.signin.internal.g;
import com.google.android.gms.auth.api.signin.internal.j;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.internal.auth.d;
import java.util.Arrays;

/* renamed from: oq  reason: default package */
public final class oq {
    public static final a.g<dt> a;
    public static final a.g<j> b;
    private static final a.AbstractC0094a<dt, a> c;
    private static final a.AbstractC0094a<j, GoogleSignInOptions> d;
    public static final com.google.android.gms.common.api.a<a> e;
    public static final com.google.android.gms.common.api.a<GoogleSignInOptions> f;
    public static final e g = new ws();
    public static final b h = new g();

    @Deprecated
    /* renamed from: oq$a */
    public static class a implements a.d {
        public static final a f = new a(new C0661a());
        private final String a;
        private final boolean b;
        private final String c;

        public a(C0661a aVar) {
            this.a = aVar.a;
            this.b = aVar.b.booleanValue();
            this.c = aVar.c;
        }

        public final String a() {
            return this.c;
        }

        public final Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", this.a);
            bundle.putBoolean("force_save_dialog", this.b);
            bundle.putString("log_session_id", this.c);
            return bundle;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m.a(this.a, aVar.a) && this.b == aVar.b && m.a(this.c, aVar.c);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), this.c});
        }

        @Deprecated
        /* renamed from: oq$a$a  reason: collision with other inner class name */
        public static class C0661a {
            protected String a;
            protected Boolean b = Boolean.FALSE;
            protected String c;

            public C0661a() {
            }

            public C0661a a(String str) {
                this.c = str;
                return this;
            }

            public a b() {
                return new a(this);
            }

            public C0661a(a aVar) {
                this.a = aVar.a;
                this.b = Boolean.valueOf(aVar.b);
                this.c = aVar.c;
            }
        }
    }

    static {
        a.g<dt> gVar = new a.g<>();
        a = gVar;
        a.g<j> gVar2 = new a.g<>();
        b = gVar2;
        sq sqVar = new sq();
        c = sqVar;
        tq tqVar = new tq();
        d = tqVar;
        com.google.android.gms.common.api.a<qq> aVar = pq.c;
        e = new com.google.android.gms.common.api.a<>("Auth.CREDENTIALS_API", sqVar, gVar);
        f = new com.google.android.gms.common.api.a<>("Auth.GOOGLE_SIGN_IN_API", tqVar, gVar2);
        d dVar = pq.d;
    }
}
