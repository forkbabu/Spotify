package defpackage;

import com.spotify.collection.endpoints.artist.policy.Policy;
import java.util.concurrent.Callable;

/* renamed from: g9a  reason: default package */
public final /* synthetic */ class g9a implements Callable {
    public final /* synthetic */ z9a a;
    public final /* synthetic */ Policy b;

    public /* synthetic */ g9a(z9a z9a, Policy policy) {
        this.a = z9a;
        this.b = policy;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.d(this.b);
    }
}
