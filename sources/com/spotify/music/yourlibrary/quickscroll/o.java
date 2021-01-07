package com.spotify.music.yourlibrary.quickscroll;

import com.spotify.music.yourlibrary.quickscroll.l;
import io.reactivex.disposables.b;
import io.reactivex.internal.schedulers.a;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class o implements l {
    private final y a;
    private final y b;
    private final y c = new a();
    private b d;

    o(y yVar, y yVar2) {
        this.a = yVar;
        this.b = yVar2;
    }

    public void a(long j, l.a aVar) {
        b bVar = this.d;
        if (bVar != null && !bVar.d()) {
            this.d.dispose();
            this.d = null;
        }
        this.d = io.reactivex.a.L(j, TimeUnit.MILLISECONDS, this.c).G(this.a).A(this.b).subscribe(new b(aVar));
    }

    public void b() {
        b bVar = this.d;
        if (bVar != null && !bVar.d()) {
            this.d.dispose();
            this.d = null;
        }
    }
}
