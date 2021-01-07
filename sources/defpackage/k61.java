package defpackage;

import android.os.Parcelable;
import defpackage.s51;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: k61  reason: default package */
public class k61 implements s51.b {
    private final Map<String, Parcelable> a = new WeakHashMap();
    private final r61 b;

    public k61(r61 r61) {
        this.b = r61;
    }

    @Override // defpackage.s51.b
    public Parcelable a(s81 s81) {
        return this.a.get(this.b.d(s81).id());
    }

    @Override // defpackage.s51.b
    public boolean b(s81 s81, Parcelable parcelable) {
        s81 c = this.b.c(s81);
        if (c == null || c.id() == null) {
            return false;
        }
        this.a.put(c.id(), parcelable);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.a.clear();
    }

    public final void d(Parcelable parcelable) {
        e(parcelable, this.a);
    }

    /* access modifiers changed from: protected */
    public void e(Parcelable parcelable, Map<String, Parcelable> map) {
    }

    public Parcelable f() {
        return g(this.a);
    }

    /* access modifiers changed from: protected */
    public Parcelable g(Map<String, Parcelable> map) {
        return null;
    }
}
