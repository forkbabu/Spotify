package defpackage;

import com.spotify.playlist.models.j;

/* renamed from: df6  reason: default package */
public final /* synthetic */ class df6 implements Runnable {
    public final /* synthetic */ kf6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j c;

    public /* synthetic */ df6(kf6 kf6, boolean z, j jVar) {
        this.a = kf6;
        this.b = z;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b, this.c);
    }
}
