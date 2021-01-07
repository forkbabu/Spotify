package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.z0;
import kotlin.jvm.internal.h;

/* renamed from: llc  reason: default package */
public final class llc implements z0 {
    private final rlc a;
    private final olc b;
    private final wjc c;

    /* renamed from: llc$a */
    public interface a {
        llc a(wjc wjc);
    }

    public llc(rlc rlc, olc olc, wjc wjc) {
        h.e(rlc, "viewBinder");
        h.e(olc, "presenter");
        h.e(wjc, "initialData");
        this.a = rlc;
        this.b = olc;
        this.c = wjc;
    }

    @Override // com.spotify.pageloader.z0
    public void d(Bundle bundle) {
        h.e(bundle, "bundle");
        this.b.d(bundle);
    }

    @Override // com.spotify.pageloader.z0
    public Bundle f() {
        return this.b.f();
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.a.getView();
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        this.a.a(layoutInflater, viewGroup);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.b.g(this.c);
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.b.stop();
    }
}
