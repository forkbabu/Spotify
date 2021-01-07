package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.s0;
import kotlin.jvm.internal.h;

/* renamed from: st8  reason: default package */
public final class st8 implements s0 {
    private final jt8 a;
    private final e61 b;
    private final b91 c;

    public st8(jt8 jt8, e61 e61, b91 b91) {
        h.e(jt8, "topicPresenter");
        h.e(e61, "viewBinder");
        h.e(b91, "hubsViewModel");
        this.a = jt8;
        this.b = e61;
        this.c = b91;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        View b2 = this.b.b();
        h.d(b2, "viewBinder.rootView");
        return b2;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        this.a.a(this.c);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
    }
}
