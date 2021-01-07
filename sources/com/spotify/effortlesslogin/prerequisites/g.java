package com.spotify.effortlesslogin.prerequisites;

import com.spotify.rxjava2.p;
import io.reactivex.y;

public class g implements f {
    private final i a;
    private final boolean b;
    private final p c = new p();
    private final y d;
    private final y e;

    public g(i iVar, boolean z, y yVar, y yVar2) {
        this.a = iVar;
        this.b = z;
        this.d = yVar;
        this.e = yVar2;
    }

    @Override // com.spotify.effortlesslogin.prerequisites.f
    public void a(qg0<String> qg0) {
        if (this.b) {
            this.c.b(this.a.G2().I0(this.d).o0(this.e).subscribe(new b(qg0), a.a));
        }
    }

    @Override // com.spotify.effortlesslogin.prerequisites.f
    public void cancel() {
        this.c.a();
    }
}
