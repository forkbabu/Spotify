package com.spotify.music.libs.bluetooth;

import com.spotify.music.libs.bluetooth.h;
import io.reactivex.s;
import io.reactivex.subjects.a;
import java.util.HashSet;
import java.util.Set;

public class m implements l {
    private final Set<String> a = new HashSet(10);
    private final a<i> b = a.h1();

    @Override // com.spotify.music.libs.bluetooth.l
    public void a(i iVar) {
        if (iVar.c() && !this.a.contains(iVar.b())) {
            this.a.add(iVar.b());
            this.b.onNext(iVar);
        } else if (!iVar.c() && this.a.contains(iVar.b())) {
            this.a.remove(iVar.b());
            this.b.onNext(iVar);
        }
    }

    @Override // com.spotify.music.libs.bluetooth.l
    public void b() {
        for (String str : this.a) {
            a<i> aVar = this.b;
            h.b bVar = new h.b();
            bVar.a(str);
            h.b bVar2 = bVar;
            bVar2.b(false);
            aVar.onNext(bVar2.build());
        }
        this.a.clear();
    }

    @Override // com.spotify.music.libs.bluetooth.l
    public s<i> c() {
        return this.b.E();
    }
}
