package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import kotlin.jvm.internal.f;

/* renamed from: b70  reason: default package */
public abstract class b70 {
    private final PageIdentifiers a;
    private final com.spotify.music.libs.viewuri.c b;

    /* renamed from: b70$a */
    public static final class a extends b70 {
        public static final a c = new a();

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private a() {
            /*
                r3 = this;
                com.spotify.instrumentation.PageIdentifiers r0 = com.spotify.instrumentation.PageIdentifiers.ALLBOARDING_CONTENTPICKER
                java.lang.String r1 = "spotify:internal:allboarding:origin:default"
                com.spotify.music.libs.viewuri.c r1 = com.spotify.music.libs.viewuri.c.a(r1)
                java.lang.String r2 = "ViewUri.create(\"spotify:…boarding:origin:default\")"
                kotlin.jvm.internal.h.d(r1, r2)
                r2 = 0
                r3.<init>(r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.b70.a.<init>():void");
        }
    }

    /* renamed from: b70$b */
    public static final class b extends b70 {
        public static final b c = new b();

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private b() {
            /*
                r3 = this;
                com.spotify.instrumentation.PageIdentifiers r0 = com.spotify.instrumentation.PageIdentifiers.ALLBOARDING_SEARCH
                java.lang.String r1 = "spotify:internal:allboarding:search"
                com.spotify.music.libs.viewuri.c r1 = com.spotify.music.libs.viewuri.c.a(r1)
                java.lang.String r2 = "ViewUri.create(\"spotify:…rnal:allboarding:search\")"
                kotlin.jvm.internal.h.d(r1, r2)
                r2 = 0
                r3.<init>(r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.b70.b.<init>():void");
        }
    }

    /* renamed from: b70$c */
    public static final class c extends b70 {
        public static final c c = new c();

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private c() {
            /*
                r3 = this;
                com.spotify.instrumentation.PageIdentifiers r0 = com.spotify.instrumentation.PageIdentifiers.ALLBOARDING_SEND
                java.lang.String r1 = "spotify:internal:allboarding:send"
                com.spotify.music.libs.viewuri.c r1 = com.spotify.music.libs.viewuri.c.a(r1)
                java.lang.String r2 = "ViewUri.create(\"spotify:…ternal:allboarding:send\")"
                kotlin.jvm.internal.h.d(r1, r2)
                r2 = 0
                r3.<init>(r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.b70.c.<init>():void");
        }
    }

    public b70(PageIdentifiers pageIdentifiers, com.spotify.music.libs.viewuri.c cVar, f fVar) {
        this.a = pageIdentifiers;
        this.b = cVar;
    }

    public final PageIdentifiers a() {
        return this.a;
    }

    public final com.spotify.music.libs.viewuri.c b() {
        return this.b;
    }
}
