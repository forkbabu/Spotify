package com.spotify.music.libs.assistedcuration.provider;

import android.app.Activity;
import android.content.Context;
import com.spotify.music.libs.assistedcuration.b;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import io.reactivex.s;
import java.util.List;
import java.util.Set;

public class h0 implements w {
    private final Context a;
    private final faa b;
    private final y<v> c;
    private final b d;

    public h0(Activity activity, faa faa, z zVar, b bVar) {
        this.a = activity;
        this.b = faa;
        faa.b().h(new ane("addTime", false, null, 6));
        g0 g0Var = new g0(this);
        zVar.getClass();
        this.c = new y<>(g0Var);
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
        return "liked_songs";
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
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.w
    public void g(String str, Set<String> set) {
        this.c.b(str, set);
    }
}
