package defpackage;

import com.google.common.base.MoreObjects;

/* renamed from: l76  reason: default package */
public final class l76 implements fjf<String> {
    private final wlf<xq6> a;

    public l76(wlf<xq6> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String a2 = this.a.get().a();
        MoreObjects.checkArgument(a2 != null, "Trying to access Playlist URI too early. Its only available at plugin creation point and onwards.");
        a2.getClass();
        return a2;
    }
}
