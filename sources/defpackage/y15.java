package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.h;

/* renamed from: y15  reason: default package */
public final class y15 extends RecyclerView.q {
    final /* synthetic */ u15 a;
    final /* synthetic */ LinearLayoutManager b;

    y15(u15 u15, LinearLayoutManager linearLayoutManager) {
        this.a = u15;
        this.b = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(RecyclerView recyclerView, int i, int i2) {
        h.e(recyclerView, "recyclerView");
        PublishSubject publishSubject = this.a.h;
        u15 u15 = this.a;
        int b2 = this.b.b2();
        int i0 = this.b.i0();
        u15.getClass();
        publishSubject.onNext(Boolean.valueOf(b2 > i0 + -3));
        this.a.i.onNext(new jnf(this.b.U1(), this.b.Z1()));
    }
}
