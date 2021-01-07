package defpackage;

import com.spotify.music.newplaying.scroll.widgets.lyrics.view.b;
import io.reactivex.functions.g;

/* renamed from: vmb  reason: default package */
public final /* synthetic */ class vmb implements g {
    public final /* synthetic */ enb a;
    public final /* synthetic */ b b;

    public /* synthetic */ vmb(enb enb, b bVar) {
        this.a = enb;
        this.b = bVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c(this.b, (Integer) obj);
    }
}
