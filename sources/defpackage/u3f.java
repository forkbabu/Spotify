package defpackage;

import com.spotify.player.options.RepeatMode;
import com.spotify.player.options.d;
import defpackage.p2f;
import io.reactivex.functions.l;

/* renamed from: u3f  reason: default package */
public final /* synthetic */ class u3f implements l {
    public final /* synthetic */ d a;
    public final /* synthetic */ q7f b;

    public /* synthetic */ u3f(d dVar, q7f q7f) {
        this.a = dVar;
        this.b = q7f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.setRepeatMode(((p2f.r) obj).a() ? RepeatMode.CONTEXT : RepeatMode.NONE).E(e5f.a).t(new e6f(this.b));
    }
}
