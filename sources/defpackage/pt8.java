package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.h;

/* renamed from: pt8  reason: default package */
public final class pt8 implements rt8 {
    private final ys2 a;
    private final Fragment b;

    public pt8(ys2 ys2, Fragment fragment) {
        h.e(ys2, "fragmentContainer");
        h.e(fragment, "fragment");
        this.a = ys2;
        this.b = fragment;
    }

    @Override // defpackage.rt8
    public void setTitle(String str) {
        h.e(str, "title");
        this.a.k(this.b, str);
    }
}
