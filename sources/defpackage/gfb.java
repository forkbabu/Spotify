package defpackage;

import com.spotify.music.lyrics.vocalremoval.model.KaraokeState;
import io.reactivex.functions.g;

/* renamed from: gfb  reason: default package */
public final /* synthetic */ class gfb implements g {
    public final /* synthetic */ qfb a;

    public /* synthetic */ gfb(qfb qfb) {
        this.a = qfb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((KaraokeState) obj);
    }
}
