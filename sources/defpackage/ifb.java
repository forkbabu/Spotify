package defpackage;

import com.spotify.music.lyrics.vocalremoval.model.VocalVolume;
import io.reactivex.functions.a;

/* renamed from: ifb  reason: default package */
public final /* synthetic */ class ifb implements a {
    public final /* synthetic */ qfb a;
    public final /* synthetic */ VocalVolume b;

    public /* synthetic */ ifb(qfb qfb, VocalVolume vocalVolume) {
        this.a = qfb;
        this.b = vocalVolume;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.j = this.b;
    }
}
