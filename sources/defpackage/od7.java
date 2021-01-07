package defpackage;

import com.spotify.playlist.models.offline.a;

/* renamed from: od7  reason: default package */
public final /* synthetic */ class od7 implements Runnable {
    public final /* synthetic */ xd7 a;
    public final /* synthetic */ a b;
    public final /* synthetic */ rc7 c;

    public /* synthetic */ od7(xd7 xd7, a aVar, rc7 rc7) {
        this.a = xd7;
        this.b = aVar;
        this.c = rc7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b, this.c);
    }
}
