package defpackage;

import com.spotify.mobile.android.playlist.model.policy.Policy;
import java.util.concurrent.Callable;

/* renamed from: e9a  reason: default package */
public final /* synthetic */ class e9a implements Callable {
    public final /* synthetic */ s9a a;
    public final /* synthetic */ Policy b;

    public /* synthetic */ e9a(s9a s9a, Policy policy) {
        this.a = s9a;
        this.b = policy;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.c(this.b);
    }
}