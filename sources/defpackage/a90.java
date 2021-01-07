package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Any;
import com.spotify.android.dac.api.view.helpers.a;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: a90  reason: default package */
public final class a90<T> implements t80 {
    private T a;
    private View b;
    private final a<T> c;

    public a90(Any any, a<T> aVar) {
        h.e(any, "proto");
        h.e(aVar, "componentBinder");
        this.c = aVar;
        this.a = aVar.e().invoke(any);
    }

    @Override // defpackage.t80
    public void a() {
        this.c.d().invoke();
    }

    @Override // defpackage.t80
    public View b(ViewGroup viewGroup, boolean z) {
        h.e(viewGroup, "parent");
        View c2 = this.c.builder().c(viewGroup, this.a, Boolean.valueOf(z));
        this.b = c2;
        if (c2 != null) {
            return c2;
        }
        h.k("rootView");
        throw null;
    }

    @Override // defpackage.t80
    public void c() {
        rmf<View, T, f> c2 = this.c.c();
        View view = this.b;
        if (view != null) {
            c2.invoke(view, this.a);
        } else {
            h.k("rootView");
            throw null;
        }
    }

    @Override // defpackage.t80
    public void d(Any any) {
        h.e(any, "proto");
        this.a = this.c.e().invoke(any);
    }
}
