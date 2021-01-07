package defpackage;

import com.spotify.http.wg.WebgateTokenProvider;
import java.util.concurrent.Callable;

/* renamed from: kse  reason: default package */
public final /* synthetic */ class kse implements Callable {
    public final /* synthetic */ WebgateTokenProvider a;

    public /* synthetic */ kse(WebgateTokenProvider webgateTokenProvider) {
        this.a = webgateTokenProvider;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a(8000);
    }
}
