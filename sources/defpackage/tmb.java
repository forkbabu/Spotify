package defpackage;

import com.spotify.music.lyrics.core.experience.rx.LyricsEventPublisher;
import io.reactivex.functions.g;

/* renamed from: tmb  reason: default package */
public final /* synthetic */ class tmb implements g {
    public final /* synthetic */ enb a;

    public /* synthetic */ tmb(enb enb) {
        this.a = enb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((LyricsEventPublisher.a) obj);
    }
}
