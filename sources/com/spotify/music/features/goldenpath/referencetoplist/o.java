package com.spotify.music.features.goldenpath.referencetoplist;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;

public class o {
    private final s<b91> a;
    private final p b;
    private final y c;
    private b d = EmptyDisposable.INSTANCE;

    public o(s<b91> sVar, p pVar, y yVar) {
        this.a = sVar;
        pVar.getClass();
        this.b = pVar;
        yVar.getClass();
        this.c = yVar;
    }

    public void a() {
        s<b91> o0 = this.a.o0(this.c);
        p pVar = this.b;
        pVar.getClass();
        this.d = o0.subscribe(new a(pVar), c.a);
    }

    public void b() {
        this.d.dispose();
    }
}
