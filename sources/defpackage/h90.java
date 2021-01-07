package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.g90;

/* renamed from: h90  reason: default package */
public class h90<V extends g90> extends RecyclerView.b0 {
    private final V C;

    protected h90(V v) {
        super(v.getView());
        this.C = v;
    }

    public static <V extends g90> h90<V> h0(V v) {
        return new h90<>(v);
    }

    public V j0() {
        return this.C;
    }
}
