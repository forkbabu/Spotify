package defpackage;

import com.spotify.music.libs.fullscreen.story.domain.g;
import java.util.concurrent.Callable;

/* renamed from: ya5  reason: default package */
public final /* synthetic */ class ya5 implements Callable {
    public final /* synthetic */ ec5 a;
    public final /* synthetic */ g.c b;
    public final /* synthetic */ String c;

    public /* synthetic */ ya5(ec5 ec5, g.c cVar, String str) {
        this.a = ec5;
        this.b = cVar;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.b(this.b, this.c);
    }
}
