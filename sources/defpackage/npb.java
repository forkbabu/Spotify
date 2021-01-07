package defpackage;

import com.spotify.music.ads.voice.domain.v;

/* renamed from: npb  reason: default package */
public final /* synthetic */ class npb implements Runnable {
    public final /* synthetic */ gqb a;
    public final /* synthetic */ v b;

    public /* synthetic */ npb(gqb gqb, v vVar) {
        this.a = gqb;
        this.b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b);
    }
}
