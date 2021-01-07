package com.spotify.music.libs.viewuri;

import android.os.Parcelable;
import com.spotify.mobile.android.util.Assertion;
import java.util.regex.Pattern;

public abstract class c implements Parcelable {

    public interface a {

        /* renamed from: com.spotify.music.libs.viewuri.c$a$a  reason: collision with other inner class name */
        public static class C0301a implements a {
            private final c a;

            private C0301a(c cVar) {
                cVar.getClass();
                this.a = cVar;
            }

            public static C0301a a(c cVar) {
                return new C0301a(cVar);
            }

            @Override // com.spotify.music.libs.viewuri.c.a
            public c getViewUri() {
                return this.a;
            }
        }

        c getViewUri();
    }

    public static class b {
        private final String a;
        private Pattern b;

        public b(String str) {
            this.a = str;
        }

        public boolean a(String str) {
            if (this.b == null) {
                this.b = Pattern.compile(this.a);
            }
            return this.b.matcher(str).matches();
        }

        public c b(String str) {
            if (!a(str)) {
                StringBuilder a1 = je.a1("View URI ", str, " did not match pattern ");
                a1.append(this.a);
                Assertion.p(a1.toString());
            }
            return new b(str);
        }

        public String toString() {
            return this.a;
        }
    }

    public static c a(String str) {
        return new b(str);
    }

    public boolean b(String str) {
        return c().equals(str);
    }

    /* access modifiers changed from: package-private */
    public abstract String c();

    @Override // java.lang.Object
    public String toString() {
        return c();
    }
}
