package defpackage;

import com.spotify.music.h;
import com.spotify.music.r;
import com.spotify.music.w;
import io.reactivex.functions.a;

/* renamed from: xfb  reason: default package */
/* compiled from: java-style lambda group */
public final class xfb implements a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public xfb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        int i = this.a;
        if (i == 0) {
            ((h) this.b).a(false);
        } else if (i == 1) {
            ((w) this.b).a();
        } else if (i == 2) {
            ((r) this.b).a();
        } else {
            throw null;
        }
    }
}
