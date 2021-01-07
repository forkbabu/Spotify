package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.h;

/* renamed from: ulc  reason: default package */
public final class ulc implements klc {
    private final gsc a;

    public ulc(gsc gsc) {
        h.e(gsc, "segmentAdapter");
        this.a = gsc;
    }

    @Override // defpackage.klc
    public void a(esc esc) {
        h.e(esc, "value");
        this.a.c0(esc);
    }

    @Override // defpackage.klc
    public void b() {
        this.a.z();
    }

    @Override // defpackage.klc
    public RecyclerView.e<RecyclerView.b0> e() {
        return this.a;
    }
}
