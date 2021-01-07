package com.google.firebase.crashlytics.ndk;

class c implements sy {
    private final e a;

    c(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.sy
    public boolean a(String str) {
        ((a) this.a).a(str);
        return true;
    }

    @Override // defpackage.sy
    public vy b(String str) {
        return new h(((a) this.a).b(str));
    }

    @Override // defpackage.sy
    public void c(String str, String str2, long j) {
        ((a) this.a).f(str, str2, j);
    }

    @Override // defpackage.sy
    public boolean d(String str) {
        boolean e = ((a) this.a).e(str);
        ty f = ty.f();
        StringBuilder V0 = je.V0("Crashlytics NDK initialization ");
        V0.append(e ? "successful" : "FAILED");
        f.g(V0.toString());
        return e;
    }

    @Override // defpackage.sy
    public void e(String str, int i, String str2, int i2, long j, long j2, boolean z, int i3, String str3, String str4) {
        ((a) this.a).h(str, i, str2, i2, j, j2, z, i3, str3, str4);
    }

    @Override // defpackage.sy
    public boolean f(String str) {
        return ((a) this.a).d(str);
    }

    @Override // defpackage.sy
    public void g(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        ((a) this.a).g(str, str2, str3, str4, str5, i, str6);
    }

    @Override // defpackage.sy
    public void h(String str, String str2, String str3, boolean z) {
        ((a) this.a).j(str, str2, str3, z);
    }
}
