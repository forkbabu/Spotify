package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.s51;

/* renamed from: l91  reason: default package */
public class l91<V extends View> implements s51<V> {
    private final int a;

    protected l91(int i) {
        this.a = i;
    }

    @Override // defpackage.s51
    public void b(V v, s81 s81, s51.a<View> aVar, int... iArr) {
        g91.a(v, s81, aVar, iArr);
    }

    @Override // defpackage.s51
    public void c(V v, s81 s81, w51 w51, s51.b bVar) {
    }

    @Override // defpackage.s51
    public V h(ViewGroup viewGroup, w51 w51) {
        return (V) LayoutInflater.from(viewGroup.getContext()).inflate(this.a, viewGroup, false);
    }
}
