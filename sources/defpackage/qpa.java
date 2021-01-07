package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.h;

/* renamed from: qpa  reason: default package */
public final class qpa implements spa {
    private final ys2 a;
    private final Fragment b;

    public qpa(ys2 ys2, Fragment fragment) {
        h.e(ys2, "spotifyFragmentContainer");
        h.e(fragment, "fragment");
        this.a = ys2;
        this.b = fragment;
    }

    @Override // defpackage.spa
    public void setTitle(String str) {
        h.e(str, "title");
        this.a.k(this.b, str);
    }
}
