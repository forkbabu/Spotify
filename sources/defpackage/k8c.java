package defpackage;

import com.spotify.music.offline.OfflineError;
import io.reactivex.functions.g;

/* renamed from: k8c  reason: default package */
public final /* synthetic */ class k8c implements g {
    public final /* synthetic */ n8c a;

    public /* synthetic */ k8c(n8c n8c) {
        this.a = n8c;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        n8c.e(this.a, (OfflineError) obj);
    }
}
