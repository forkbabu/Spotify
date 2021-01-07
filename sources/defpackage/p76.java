package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: p76  reason: default package */
public final class p76 implements fjf<String> {
    private final wlf<Fragment> a;

    public p76(wlf<Fragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().D2().getString("key_input_uri");
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
