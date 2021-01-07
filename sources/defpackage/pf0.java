package defpackage;

import android.util.Log;
import com.spotify.base.java.logging.LogLevel;
import com.spotify.base.java.logging.Logger;
import java.util.EnumSet;

/* renamed from: pf0  reason: default package */
public class pf0 implements com.spotify.base.java.logging.c {
    private static final com.spotify.base.java.logging.f f = new a();
    private static final com.spotify.base.java.logging.f g = new b();
    private static final com.spotify.base.java.logging.f h = new c();
    private static final com.spotify.base.java.logging.f i = new d();
    private static final com.spotify.base.java.logging.f j = new e();
    private static final com.spotify.base.java.logging.f k = new f();
    private final com.spotify.base.java.logging.f a;
    private final com.spotify.base.java.logging.f b;
    private final com.spotify.base.java.logging.f c;
    private final com.spotify.base.java.logging.f d;
    private final com.spotify.base.java.logging.f e;

    /* renamed from: pf0$a */
    static class a extends g {
        a() {
            super(null);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.pf0.g
        public void d(String str) {
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.pf0.g
        public void e(String str, Throwable th) {
        }
    }

    /* renamed from: pf0$b */
    static class b extends g {
        b() {
            super(null);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.pf0.g
        public void d(String str) {
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.pf0.g
        public void e(String str, Throwable th) {
        }
    }

    /* renamed from: pf0$c */
    static class c extends g {
        c() {
            super(null);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.pf0.g
        public void d(String str) {
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.pf0.g
        public void e(String str, Throwable th) {
        }
    }

    /* renamed from: pf0$d */
    static class d extends g {
        d() {
            super(null);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.pf0.g
        public void d(String str) {
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.pf0.g
        public void e(String str, Throwable th) {
        }
    }

    /* renamed from: pf0$e */
    static class e extends g {
        e() {
            super(null);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.pf0.g
        public void d(String str) {
            Log.e("Spotify", str);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.pf0.g
        public void e(String str, Throwable th) {
            Log.e("Spotify", str, th);
        }
    }

    /* renamed from: pf0$f */
    static class f extends g {
        f() {
            super(null);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.pf0.g
        public void d(String str) {
            Log.e("YELL", str);
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.pf0.g
        public void e(String str, Throwable th) {
            Log.e("YELL", str, th);
        }
    }

    /* renamed from: pf0$g */
    private static abstract class g implements com.spotify.base.java.logging.f {
        g(a aVar) {
        }

        private static String c(String str, String str2) {
            StringBuilder sb = new StringBuilder(Logger.k(str2) + Logger.k(str) + 3);
            sb.append('[');
            sb.append(str);
            sb.append("] ");
            sb.append(str2);
            return sb.toString();
        }

        @Override // com.spotify.base.java.logging.f
        public final void a(String str, String str2) {
            d(c(str, str2));
        }

        @Override // com.spotify.base.java.logging.f
        public final void b(String str, String str2, Throwable th) {
            e(c(str, str2), th);
        }

        /* access modifiers changed from: package-private */
        public abstract void d(String str);

        /* access modifiers changed from: package-private */
        public abstract void e(String str, Throwable th);
    }

    public pf0(EnumSet<LogLevel> enumSet) {
        com.spotify.base.java.logging.f fVar = com.spotify.base.java.logging.f.a;
        this.a = enumSet.contains(LogLevel.VERBOSE) ? g : fVar;
        this.b = enumSet.contains(LogLevel.DEBUG) ? f : fVar;
        this.c = enumSet.contains(LogLevel.INFO) ? h : fVar;
        this.d = enumSet.contains(LogLevel.WARNING) ? i : fVar;
        this.e = enumSet.contains(LogLevel.ERROR) ? j : fVar;
        enumSet.contains(LogLevel.YELL);
    }

    @Override // com.spotify.base.java.logging.c
    public com.spotify.base.java.logging.f a() {
        return this.c;
    }

    @Override // com.spotify.base.java.logging.c
    public com.spotify.base.java.logging.f b() {
        return this.a;
    }

    @Override // com.spotify.base.java.logging.c
    public com.spotify.base.java.logging.f c() {
        return this.d;
    }

    @Override // com.spotify.base.java.logging.c
    public com.spotify.base.java.logging.f d() {
        return this.b;
    }

    @Override // com.spotify.base.java.logging.c
    public com.spotify.base.java.logging.f error() {
        return this.e;
    }
}
