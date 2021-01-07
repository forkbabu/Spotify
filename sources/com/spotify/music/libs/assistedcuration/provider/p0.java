package com.spotify.music.libs.assistedcuration.provider;

import android.app.Activity;
import android.content.Context;
import com.spotify.music.libs.assistedcuration.b;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import io.reactivex.s;
import java.util.List;
import java.util.Set;

public class p0 implements w {
    private final Context a;
    private final n1a b;
    private final z0a c;
    private final b1a d;
    private final y<z0> e;
    private final b f;

    public p0(Activity activity, n1a n1a, z zVar, z0a z0a, b1a b1a, b bVar) {
        this.a = activity;
        this.b = n1a;
        o0 o0Var = new o0(this);
        zVar.getClass();
        this.e = new y<>(o0Var);
        this.c = z0a;
        this.d = b1a;
        this.f = bVar;
    }

    static String m(String str) {
        return je.x0("similar_to/", str);
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public byte[] a() {
        return this.e.k(12);
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public void b(Set<String> set) {
        this.e.h(set);
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public String c() {
        return "similar_to";
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public s<List<h>> d(Set<String> set, String str) {
        return this.e.g(set, str);
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public void e(byte[] bArr) {
        this.e.i(bArr);
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public void f(String str, e eVar, Set<String> set) {
        this.e.c(str, eVar, set);
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public void g(String str, Set<String> set) {
        this.e.b(str, set);
    }

    /* access modifiers changed from: package-private */
    public void n(e eVar, Set<String> set) {
        this.e.a(eVar, set);
    }
}
