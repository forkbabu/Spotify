package com.google.android.datatransport.cct.a;

public final class b implements h10 {
    public static final h10 a = new b();

    /* access modifiers changed from: private */
    public static final class a implements com.google.firebase.encoders.b<a> {
        static final a a = new a();

        private a() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            a aVar = (a) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("sdkVersion", aVar.i());
            cVar.f("model", aVar.f());
            cVar.f("hardware", aVar.d());
            cVar.f("device", aVar.b());
            cVar.f("product", aVar.h());
            cVar.f("osBuild", aVar.g());
            cVar.f("manufacturer", aVar.e());
            cVar.f("fingerprint", aVar.c());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.datatransport.cct.a.b$b  reason: collision with other inner class name */
    public static final class C0085b implements com.google.firebase.encoders.b<j> {
        static final C0085b a = new C0085b();

        private C0085b() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            ((com.google.firebase.encoders.c) obj2).f("logRequest", ((j) obj).b());
        }
    }

    /* access modifiers changed from: private */
    public static final class c implements com.google.firebase.encoders.b<zzp> {
        static final c a = new c();

        private c() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            zzp zzp = (zzp) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("clientType", zzp.c());
            cVar.f("androidClientInfo", zzp.b());
        }
    }

    /* access modifiers changed from: private */
    public static final class d implements com.google.firebase.encoders.b<k> {
        static final d a = new d();

        private d() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            k kVar = (k) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.c("eventTimeMs", kVar.d());
            cVar.f("eventCode", kVar.c());
            cVar.c("eventUptimeMs", kVar.e());
            cVar.f("sourceExtension", kVar.g());
            cVar.f("sourceExtensionJsonProto3", kVar.h());
            cVar.c("timezoneOffsetSeconds", kVar.i());
            cVar.f("networkConnectionInfo", kVar.f());
        }
    }

    /* access modifiers changed from: private */
    public static final class e implements com.google.firebase.encoders.b<l> {
        static final e a = new e();

        private e() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            l lVar = (l) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.c("requestTimeMs", lVar.g());
            cVar.c("requestUptimeMs", lVar.h());
            cVar.f("clientInfo", lVar.b());
            cVar.f("logSource", lVar.d());
            cVar.f("logSourceName", lVar.e());
            cVar.f("logEvent", lVar.c());
            cVar.f("qosTier", lVar.f());
        }
    }

    /* access modifiers changed from: private */
    public static final class f implements com.google.firebase.encoders.b<zzt> {
        static final f a = new f();

        private f() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            zzt zzt = (zzt) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("networkType", zzt.c());
            cVar.f("mobileSubtype", zzt.b());
        }
    }

    private b() {
    }

    public void a(i10<?> i10) {
        C0085b bVar = C0085b.a;
        m10 m10 = (m10) i10;
        m10.g(j.class, bVar);
        m10.g(d.class, bVar);
        e eVar = e.a;
        m10.g(l.class, eVar);
        m10.g(g.class, eVar);
        c cVar = c.a;
        m10.g(zzp.class, cVar);
        m10.g(e.class, cVar);
        a aVar = a.a;
        m10.g(a.class, aVar);
        m10.g(c.class, aVar);
        d dVar = d.a;
        m10.g(k.class, dVar);
        m10.g(f.class, dVar);
        f fVar = f.a;
        m10.g(zzt.class, fVar);
        m10.g(i.class, fVar);
    }
}
