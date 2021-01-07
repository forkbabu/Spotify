package com.spotify.music.libs.assistedcuration.provider;

import android.app.Activity;
import android.content.Context;
import com.spotify.music.libs.assistedcuration.b;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import io.reactivex.s;
import java.util.List;
import java.util.Set;

public class l0 implements w {
    private final Context a;
    private final l1a b;
    private final y<v> c;
    private final b d;

    public l0(Activity activity, l1a l1a, z zVar, b bVar) {
        this.a = activity;
        this.b = l1a;
        k0 k0Var = new k0(this);
        zVar.getClass();
        this.c = new y<>(k0Var);
        this.d = bVar;
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public byte[] a() {
        return new byte[0];
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public void b(Set<String> set) {
        this.c.h(set);
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public String c() {
        return "recently_played";
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public s<List<h>> d(Set<String> set, String str) {
        return this.c.g(set, str);
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public void e(byte[] bArr) {
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
