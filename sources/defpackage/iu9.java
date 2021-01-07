package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.s0;
import defpackage.ju9;
import kotlin.jvm.internal.h;

/* renamed from: iu9  reason: default package */
public final class iu9 implements s0 {
    private ju9 a;
    private Bundle b;
    private final ju9.a c;
    private final qu9 f;

    public iu9(ju9.a aVar, qu9 qu9) {
        h.e(aVar, "presenterFactory");
        h.e(qu9, "viewBinder");
        this.c = aVar;
        this.f = qu9;
    }

    public final void a(int i, int i2, Intent intent) {
        this.f.b(i, i2, intent);
    }

    public final void b(Bundle bundle) {
        this.b = bundle;
        ju9 ju9 = this.a;
        if (ju9 != null) {
            ju9.d(bundle);
        }
    }

    public final void c(Bundle bundle) {
        h.e(bundle, "outState");
        ju9 ju9 = this.a;
        if (ju9 != null) {
            ju9.c(bundle);
        }
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.f.getView();
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        ju9 b2 = ((ou9) this.c).b(this.f);
        this.f.i(b2);
        ((nu9) b2).d(this.b);
        this.a = b2;
        this.f.d(context, layoutInflater, viewGroup);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        ju9 ju9 = this.a;
        if (ju9 != null) {
            ju9.start();
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        ju9 ju9 = this.a;
        if (ju9 != null) {
            ju9.stop();
        }
    }
}
