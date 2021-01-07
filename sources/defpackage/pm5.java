package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.listeninghistory.presenter.a;
import com.spotify.pageloader.z0;
import kotlin.jvm.internal.h;

/* renamed from: pm5  reason: default package */
public final class pm5 implements z0 {
    private View a;
    private final a b;
    private final hn5 c;
    private final qm5 f;

    public pm5(a aVar, hn5 hn5, qm5 qm5) {
        h.e(aVar, "presenter");
        h.e(hn5, "viewBinder");
        h.e(qm5, "resource");
        this.b = aVar;
        this.c = hn5;
        this.f = qm5;
    }

    @Override // com.spotify.pageloader.z0
    public void d(Bundle bundle) {
        h.e(bundle, "bundle");
        this.c.d(bundle);
    }

    @Override // com.spotify.pageloader.z0
    public Bundle f() {
        return this.c.e();
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        this.a = this.c.b(context, viewGroup);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.b.b(this.c);
        b91 c2 = this.f.c();
        if (c2 != null) {
            this.b.c(c2);
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.b.a();
    }
}
