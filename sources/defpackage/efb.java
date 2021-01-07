package defpackage;

import com.spotify.music.lyrics.vocalremoval.model.VocalRemovalStatus;
import io.reactivex.functions.a;

/* renamed from: efb  reason: default package */
public final /* synthetic */ class efb implements a {
    public final /* synthetic */ qfb a;
    public final /* synthetic */ VocalRemovalStatus b;

    public /* synthetic */ efb(qfb qfb, VocalRemovalStatus vocalRemovalStatus) {
        this.a = qfb;
        this.b = vocalRemovalStatus;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.d(this.b);
    }
}
