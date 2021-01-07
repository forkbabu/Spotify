package com.spotify.music.libs.mediabrowserservice;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.connection.l;
import io.reactivex.disposables.a;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Iterator;

public class x1 {
    private final l a;
    private final h3 b;
    private final o2 c;
    private final y d;
    private final a e = new a();
    private final MediaSessionCompat f;

    public x1(l lVar, o2 o2Var, y yVar, MediaSessionCompat mediaSessionCompat, h3 h3Var) {
        this.a = lVar;
        this.c = o2Var;
        this.d = yVar;
        this.b = h3Var;
        this.f = mediaSessionCompat;
    }

    public static void b(x1 x1Var, boolean z) {
        PlaybackStateCompat b2 = x1Var.f.c().b();
        if (b2 != null) {
            Bundle c2 = b2.c();
            if (c2 == null || c2 == Bundle.EMPTY) {
                c2 = new Bundle(1);
            }
            c2.putBoolean("com.spotify.music.extra.OFFLINE_MODE", z);
            PlaybackStateCompat.b bVar = new PlaybackStateCompat.b(b2);
            bVar.f(c2);
            x1Var.f.p(bVar.b());
        }
    }

    public void a() {
        this.e.f();
    }

    public void c(Boolean bool) {
        Iterator it = ((ArrayList) this.c.f()).iterator();
        while (it.hasNext()) {
            String c2 = ((n2) it.next()).c();
            Logger.g("Invalidating %s because of connectivity change", c2);
            this.b.a(c2);
        }
    }

    public void d() {
        this.e.f();
        this.e.b(this.a.b().E().o0(this.d).subscribe(new t(this)));
        this.e.b(this.a.a().j0(q.a).E().o0(this.d).subscribe(new s(this)));
    }
}
