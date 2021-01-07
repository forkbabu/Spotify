package com.google.firebase.crashlytics.internal.model;

import com.coremedia.iso.boxes.UserBox;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

public final class a implements h10 {
    public static final h10 a = new a();

    /* renamed from: com.google.firebase.crashlytics.internal.model.a$a  reason: collision with other inner class name */
    private static final class C0129a implements com.google.firebase.encoders.b<CrashlyticsReport.b> {
        static final C0129a a = new C0129a();

        private C0129a() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.b bVar = (CrashlyticsReport.b) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("key", bVar.b());
            cVar.f("value", bVar.c());
        }
    }

    private static final class b implements com.google.firebase.encoders.b<CrashlyticsReport> {
        static final b a = new b();

        private b() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("sdkVersion", crashlyticsReport.i());
            cVar.f("gmpAppId", crashlyticsReport.e());
            cVar.d("platform", crashlyticsReport.h());
            cVar.f("installationUuid", crashlyticsReport.f());
            cVar.f("buildVersion", crashlyticsReport.c());
            cVar.f("displayVersion", crashlyticsReport.d());
            cVar.f("session", crashlyticsReport.j());
            cVar.f("ndkPayload", crashlyticsReport.g());
        }
    }

    private static final class c implements com.google.firebase.encoders.b<CrashlyticsReport.c> {
        static final c a = new c();

        private c() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.c cVar = (CrashlyticsReport.c) obj;
            com.google.firebase.encoders.c cVar2 = (com.google.firebase.encoders.c) obj2;
            cVar2.f("files", cVar.b());
            cVar2.f("orgId", cVar.c());
        }
    }

    private static final class d implements com.google.firebase.encoders.b<CrashlyticsReport.c.b> {
        static final d a = new d();

        private d() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.c.b bVar = (CrashlyticsReport.c.b) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("filename", bVar.c());
            cVar.f("contents", bVar.b());
        }
    }

    private static final class e implements com.google.firebase.encoders.b<CrashlyticsReport.d.a> {
        static final e a = new e();

        private e() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.d.a aVar = (CrashlyticsReport.d.a) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("identifier", aVar.c());
            cVar.f("version", aVar.f());
            cVar.f("displayVersion", aVar.b());
            cVar.f("organization", aVar.e());
            cVar.f("installationUuid", aVar.d());
        }
    }

    private static final class f implements com.google.firebase.encoders.b<CrashlyticsReport.d.a.b> {
        static final f a = new f();

        private f() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            ((com.google.firebase.encoders.c) obj2).f("clsId", ((CrashlyticsReport.d.a.b) obj).a());
        }
    }

    private static final class g implements com.google.firebase.encoders.b<CrashlyticsReport.d.c> {
        static final g a = new g();

        private g() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.d.c cVar = (CrashlyticsReport.d.c) obj;
            com.google.firebase.encoders.c cVar2 = (com.google.firebase.encoders.c) obj2;
            cVar2.d("arch", cVar.b());
            cVar2.f("model", cVar.f());
            cVar2.d("cores", cVar.c());
            cVar2.c("ram", cVar.h());
            cVar2.c("diskSpace", cVar.d());
            cVar2.b("simulator", cVar.j());
            cVar2.d("state", cVar.i());
            cVar2.f("manufacturer", cVar.e());
            cVar2.f("modelClass", cVar.g());
        }
    }

    private static final class h implements com.google.firebase.encoders.b<CrashlyticsReport.d> {
        static final h a = new h();

        private h() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.d dVar = (CrashlyticsReport.d) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("generator", dVar.f());
            cVar.f("identifier", dVar.h().getBytes(CrashlyticsReport.a));
            cVar.c("startedAt", dVar.j());
            cVar.f("endedAt", dVar.d());
            cVar.b("crashed", dVar.l());
            cVar.f("app", dVar.b());
            cVar.f("user", dVar.k());
            cVar.f("os", dVar.i());
            cVar.f("device", dVar.c());
            cVar.f("events", dVar.e());
            cVar.d("generatorType", dVar.g());
        }
    }

    private static final class i implements com.google.firebase.encoders.b<CrashlyticsReport.d.AbstractC0117d.a> {
        static final i a = new i();

        private i() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.d.AbstractC0117d.a aVar = (CrashlyticsReport.d.AbstractC0117d.a) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("execution", aVar.d());
            cVar.f("customAttributes", aVar.c());
            cVar.f("background", aVar.b());
            cVar.d("uiOrientation", aVar.e());
        }
    }

    private static final class j implements com.google.firebase.encoders.b<CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a> {
        static final j a = new j();

        private j() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a aVar = (CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.c("baseAddress", aVar.b());
            cVar.c("size", aVar.d());
            cVar.f("name", aVar.c());
            String e = aVar.e();
            cVar.f(UserBox.TYPE, e != null ? e.getBytes(CrashlyticsReport.a) : null);
        }
    }

    private static final class k implements com.google.firebase.encoders.b<CrashlyticsReport.d.AbstractC0117d.a.b> {
        static final k a = new k();

        private k() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.d.AbstractC0117d.a.b bVar = (CrashlyticsReport.d.AbstractC0117d.a.b) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("threads", bVar.e());
            cVar.f("exception", bVar.c());
            cVar.f("signal", bVar.d());
            cVar.f("binaries", bVar.b());
        }
    }

    private static final class l implements com.google.firebase.encoders.b<CrashlyticsReport.d.AbstractC0117d.a.b.c> {
        static final l a = new l();

        private l() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.d.AbstractC0117d.a.b.c cVar = (CrashlyticsReport.d.AbstractC0117d.a.b.c) obj;
            com.google.firebase.encoders.c cVar2 = (com.google.firebase.encoders.c) obj2;
            cVar2.f("type", cVar.f());
            cVar2.f("reason", cVar.e());
            cVar2.f("frames", cVar.c());
            cVar2.f("causedBy", cVar.b());
            cVar2.d("overflowCount", cVar.d());
        }
    }

    private static final class m implements com.google.firebase.encoders.b<CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d> {
        static final m a = new m();

        private m() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d dVar = (CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("name", dVar.d());
            cVar.f("code", dVar.c());
            cVar.c("address", dVar.b());
        }
    }

    private static final class n implements com.google.firebase.encoders.b<CrashlyticsReport.d.AbstractC0117d.a.b.e> {
        static final n a = new n();

        private n() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.d.AbstractC0117d.a.b.e eVar = (CrashlyticsReport.d.AbstractC0117d.a.b.e) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.f("name", eVar.d());
            cVar.d("importance", eVar.c());
            cVar.f("frames", eVar.b());
        }
    }

    private static final class o implements com.google.firebase.encoders.b<CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b> {
        static final o a = new o();

        private o() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b bVar = (CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.c("pc", bVar.e());
            cVar.f("symbol", bVar.f());
            cVar.f("file", bVar.b());
            cVar.c("offset", bVar.d());
            cVar.d("importance", bVar.c());
        }
    }

    private static final class p implements com.google.firebase.encoders.b<CrashlyticsReport.d.AbstractC0117d.c> {
        static final p a = new p();

        private p() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.d.AbstractC0117d.c cVar = (CrashlyticsReport.d.AbstractC0117d.c) obj;
            com.google.firebase.encoders.c cVar2 = (com.google.firebase.encoders.c) obj2;
            cVar2.f("batteryLevel", cVar.b());
            cVar2.d("batteryVelocity", cVar.c());
            cVar2.b("proximityOn", cVar.g());
            cVar2.d("orientation", cVar.e());
            cVar2.c("ramUsed", cVar.f());
            cVar2.c("diskUsed", cVar.d());
        }
    }

    private static final class q implements com.google.firebase.encoders.b<CrashlyticsReport.d.AbstractC0117d> {
        static final q a = new q();

        private q() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.d.AbstractC0117d dVar = (CrashlyticsReport.d.AbstractC0117d) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.c("timestamp", dVar.e());
            cVar.f("type", dVar.f());
            cVar.f("app", dVar.b());
            cVar.f("device", dVar.c());
            cVar.f("log", dVar.d());
        }
    }

    private static final class r implements com.google.firebase.encoders.b<CrashlyticsReport.d.AbstractC0117d.AbstractC0128d> {
        static final r a = new r();

        private r() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            ((com.google.firebase.encoders.c) obj2).f("content", ((CrashlyticsReport.d.AbstractC0117d.AbstractC0128d) obj).b());
        }
    }

    private static final class s implements com.google.firebase.encoders.b<CrashlyticsReport.d.e> {
        static final s a = new s();

        private s() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            CrashlyticsReport.d.e eVar = (CrashlyticsReport.d.e) obj;
            com.google.firebase.encoders.c cVar = (com.google.firebase.encoders.c) obj2;
            cVar.d("platform", eVar.c());
            cVar.f("version", eVar.d());
            cVar.f("buildVersion", eVar.b());
            cVar.b("jailbroken", eVar.e());
        }
    }

    private static final class t implements com.google.firebase.encoders.b<CrashlyticsReport.d.f> {
        static final t a = new t();

        private t() {
        }

        @Override // com.google.firebase.encoders.b
        public void a(Object obj, Object obj2) {
            ((com.google.firebase.encoders.c) obj2).f("identifier", ((CrashlyticsReport.d.f) obj).b());
        }
    }

    private a() {
    }

    public void a(i10<?> i10) {
        b bVar = b.a;
        m10 m10 = (m10) i10;
        m10.g(CrashlyticsReport.class, bVar);
        m10.g(b.class, bVar);
        h hVar = h.a;
        m10.g(CrashlyticsReport.d.class, hVar);
        m10.g(f.class, hVar);
        e eVar = e.a;
        m10.g(CrashlyticsReport.d.a.class, eVar);
        m10.g(g.class, eVar);
        f fVar = f.a;
        m10.g(CrashlyticsReport.d.a.b.class, fVar);
        m10.g(h.class, fVar);
        t tVar = t.a;
        m10.g(CrashlyticsReport.d.f.class, tVar);
        m10.g(u.class, tVar);
        s sVar = s.a;
        m10.g(CrashlyticsReport.d.e.class, sVar);
        m10.g(t.class, sVar);
        g gVar = g.a;
        m10.g(CrashlyticsReport.d.c.class, gVar);
        m10.g(i.class, gVar);
        q qVar = q.a;
        m10.g(CrashlyticsReport.d.AbstractC0117d.class, qVar);
        m10.g(j.class, qVar);
        i iVar = i.a;
        m10.g(CrashlyticsReport.d.AbstractC0117d.a.class, iVar);
        m10.g(k.class, iVar);
        k kVar = k.a;
        m10.g(CrashlyticsReport.d.AbstractC0117d.a.b.class, kVar);
        m10.g(l.class, kVar);
        n nVar = n.a;
        m10.g(CrashlyticsReport.d.AbstractC0117d.a.b.e.class, nVar);
        m10.g(p.class, nVar);
        o oVar = o.a;
        m10.g(CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.class, oVar);
        m10.g(q.class, oVar);
        l lVar = l.a;
        m10.g(CrashlyticsReport.d.AbstractC0117d.a.b.c.class, lVar);
        m10.g(n.class, lVar);
        m mVar = m.a;
        m10.g(CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d.class, mVar);
        m10.g(o.class, mVar);
        j jVar = j.a;
        m10.g(CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a.class, jVar);
        m10.g(m.class, jVar);
        C0129a aVar = C0129a.a;
        m10.g(CrashlyticsReport.b.class, aVar);
        m10.g(c.class, aVar);
        p pVar = p.a;
        m10.g(CrashlyticsReport.d.AbstractC0117d.c.class, pVar);
        m10.g(r.class, pVar);
        r rVar = r.a;
        m10.g(CrashlyticsReport.d.AbstractC0117d.AbstractC0128d.class, rVar);
        m10.g(s.class, rVar);
        c cVar = c.a;
        m10.g(CrashlyticsReport.c.class, cVar);
        m10.g(d.class, cVar);
        d dVar = d.a;
        m10.g(CrashlyticsReport.c.b.class, dVar);
        m10.g(e.class, dVar);
    }
}
