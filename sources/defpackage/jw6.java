package defpackage;

import com.spotify.playlist.models.j;

/* renamed from: jw6  reason: default package */
public final /* synthetic */ class jw6 implements Runnable {
    public final /* synthetic */ px6 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ j c;

    public /* synthetic */ jw6(px6 px6, String str, j jVar) {
        this.a = px6;
        this.b = str;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b, this.c);
    }
}
