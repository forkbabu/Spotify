package defpackage;

import com.spotify.base.java.logging.LogLevel;
import com.spotify.base.java.logging.Logger;
import com.spotify.base.java.logging.f;
import java.util.EnumSet;

/* renamed from: qf0  reason: default package */
public class qf0 implements com.spotify.base.java.logging.c {
    private final tf0 a;
    private final f b;
    private final f c;
    private final f d;
    private final f e;
    private final f f;

    /* renamed from: qf0$a */
    class a implements f {
        a() {
        }

        @Override // com.spotify.base.java.logging.f
        public void a(String str, String str2) {
            qf0.this.a.b("Spotify", qf0.e(str, str2));
        }

        @Override // com.spotify.base.java.logging.f
        public void b(String str, String str2, Throwable th) {
            qf0.this.a.c("Spotify", qf0.e(str, str2), th);
        }
    }

    /* renamed from: qf0$b */
    class b implements f {
        b() {
        }

        @Override // com.spotify.base.java.logging.f
        public void a(String str, String str2) {
            qf0.this.a.i("Spotify", qf0.e(str, str2));
        }

        @Override // com.spotify.base.java.logging.f
        public void b(String str, String str2, Throwable th) {
            qf0.this.a.j("Spotify", qf0.e(str, str2), th);
        }
    }

    /* renamed from: qf0$c */
    class c implements f {
        c() {
        }

        @Override // com.spotify.base.java.logging.f
        public void a(String str, String str2) {
            qf0.this.a.g("Spotify", qf0.e(str, str2));
        }

        @Override // com.spotify.base.java.logging.f
        public void b(String str, String str2, Throwable th) {
            qf0.this.a.h("Spotify", qf0.e(str, str2), th);
        }
    }

    /* renamed from: qf0$d */
    class d implements f {
        d() {
        }

        @Override // com.spotify.base.java.logging.f
        public void a(String str, String str2) {
            qf0.this.a.k("Spotify", qf0.e(str, str2));
        }

        @Override // com.spotify.base.java.logging.f
        public void b(String str, String str2, Throwable th) {
            qf0.this.a.l("Spotify", qf0.e(str, str2), th);
        }
    }

    /* renamed from: qf0$e */
    class e implements f {
        e() {
        }

        @Override // com.spotify.base.java.logging.f
        public void a(String str, String str2) {
            qf0.this.a.d("Spotify", qf0.e(str, str2));
        }

        @Override // com.spotify.base.java.logging.f
        public void b(String str, String str2, Throwable th) {
            qf0.this.a.e("Spotify", qf0.e(str, str2), th);
        }
    }

    public qf0(tf0 tf0, EnumSet<LogLevel> enumSet) {
        f fVar = f.a;
        f aVar = new a();
        f bVar = new b();
        f cVar = new c();
        f dVar = new d();
        e eVar = new e();
        this.a = tf0;
        this.b = !enumSet.contains(LogLevel.VERBOSE) ? fVar : bVar;
        this.c = !enumSet.contains(LogLevel.DEBUG) ? fVar : aVar;
        this.d = !enumSet.contains(LogLevel.INFO) ? fVar : cVar;
        this.e = !enumSet.contains(LogLevel.WARNING) ? fVar : dVar;
        this.f = enumSet.contains(LogLevel.ERROR) ? eVar : fVar;
        enumSet.contains(LogLevel.YELL);
    }

    static String e(String str, String str2) {
        StringBuilder sb = new StringBuilder(Logger.k(str2) + Logger.k(str) + 3);
        sb.append('[');
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.spotify.base.java.logging.c
    public f a() {
        return this.d;
    }

    @Override // com.spotify.base.java.logging.c
    public f b() {
        return this.b;
    }

    @Override // com.spotify.base.java.logging.c
    public f c() {
        return this.e;
    }

    @Override // com.spotify.base.java.logging.c
    public f d() {
        return this.c;
    }

    @Override // com.spotify.base.java.logging.c
    public f error() {
        return this.f;
    }
}
