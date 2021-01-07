package defpackage;

import com.spotify.mobile.android.playlist.model.policy.Policy;
import java.util.concurrent.Callable;

/* renamed from: n9a  reason: default package */
public final /* synthetic */ class n9a implements Callable {
    public final /* synthetic */ faa a;
    public final /* synthetic */ Policy b;

    public /* synthetic */ n9a(faa faa, Policy policy) {
        this.a = faa;
        this.b = policy;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.c(this.b);
    }
}
