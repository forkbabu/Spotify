package com.spotify.music.libs.assistedcuration.provider;

import android.app.Activity;
import android.content.Context;
import com.spotify.music.libs.assistedcuration.b;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import io.reactivex.s;
import java.util.List;
import java.util.Set;

public class t0 implements w {
    private final Context a;
    private final n1a b;
    private final y<v> c;
    private final b d;

    public t0(Activity activity, n1a n1a, z zVar, b bVar) {
        this.a = activity;
        this.b = n1a;
        s0 s0Var = new s0(this);
        zVar.getClass();
        this.c = new y<>(s0Var);
        this.d = bVar;
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public byte[] a() {
        return this.c.j();
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public void b(Set<String> set) {
        this.c.h(set);
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public String c() {
        return "suggested_songs";
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public s<List<h>> d(Set<String> set, String str) {
        return this.c.g(set, str);
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public void e(byte[] bArr) {
        this.c.i(bArr);
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public void f(String str, e eVar, Set<String> set) {
        this.c.c(str, eVar, set);
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public void g(String str, Set<String> set) {
        this.c.b(str, set);
    }
}
