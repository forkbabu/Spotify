package defpackage;

import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.g;

/* renamed from: r95  reason: default package */
public final /* synthetic */ class r95 implements g {
    public final /* synthetic */ aa5 a;
    public final /* synthetic */ String b;

    public /* synthetic */ r95(aa5 aa5, String str) {
        this.a = aa5;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(this.b, (ContextTrack) obj);
    }
}
