package defpackage;

import com.spotify.mobile.android.playlist.model.policy.Policy;
import java.util.concurrent.Callable;

/* renamed from: k9a  reason: default package */
public final /* synthetic */ class k9a implements Callable {
    public final /* synthetic */ faa a;
    public final /* synthetic */ Policy b;

    public /* synthetic */ k9a(faa faa, Policy policy) {
        this.a = faa;
        this.b = policy;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.d(this.b);
    }
}
