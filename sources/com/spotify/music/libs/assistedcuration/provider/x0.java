package com.spotify.music.libs.assistedcuration.provider;

import android.app.Activity;
import android.content.Context;
import com.spotify.music.libs.assistedcuration.b;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import io.reactivex.s;
import java.util.List;
import java.util.Set;

public class x0 implements w {
    private final Context a;
    private final j1a b;
    private final y<e0> c;
    private final b d;

    public x0(Activity activity, j1a j1a, z zVar, b bVar) {
        this.a = activity;
        this.b = j1a;
        w0 w0Var = new w0(this);
        zVar.getClass();
        this.c = new y<>(w0Var);
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
        return "top_genres";
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
