package defpackage;

import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import io.reactivex.g;

/* renamed from: ui2  reason: default package */
public final class ui2 implements fjf<ti2> {
    private final wlf<g<ShortcutInfo>> a;
    private final wlf<ShortcutManager> b;
    private final wlf<Integer> c;

    public ui2(wlf<g<ShortcutInfo>> wlf, wlf<ShortcutManager> wlf2, wlf<Integer> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ti2(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
