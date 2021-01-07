package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.eventshub.concertslist.b;
import com.spotify.music.features.eventshub.concertslist.f;
import com.spotify.music.features.eventshub.model.ConcertResult;
import java.util.List;

/* renamed from: u05  reason: default package */
public class u05 extends RecyclerView.e<RecyclerView.b0> {
    private final f c;

    public u05(f fVar) {
        this.c = fVar;
        U(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        View view = b0Var.a;
        int i2 = e90.i;
        y90 y90 = (y90) l70.o(view, y90.class);
        this.c.a(new b(y90), i);
        y90.getView().setOnClickListener(new s05(this, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return h90.h0(e90.d().i(viewGroup.getContext(), viewGroup));
    }

    public /* synthetic */ void X(int i, View view) {
        this.c.d((long) i);
    }

    public void Y(List<ConcertResult> list) {
        this.c.f(list);
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return (long) this.c.b(i).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return x90.class.hashCode();
    }
}
