package defpackage;

import com.spotify.playlist.models.j;

/* renamed from: hv6  reason: default package */
public final /* synthetic */ class hv6 implements Runnable {
    public final /* synthetic */ rw6 a;
    public final /* synthetic */ j b;

    public /* synthetic */ hv6(rw6 rw6, j jVar) {
        this.a = rw6;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b);
    }
}
