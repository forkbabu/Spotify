package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: fmd  reason: default package */
public final /* synthetic */ class fmd implements Runnable {
    public final /* synthetic */ lmd a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ c c;
    public final /* synthetic */ String f;

    public /* synthetic */ fmd(lmd lmd, boolean z, c cVar, String str) {
        this.a = lmd;
        this.b = z;
        this.c = cVar;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b, this.c, this.f);
    }
}
