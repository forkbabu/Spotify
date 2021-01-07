package defpackage;

import com.spotify.share.util.a;

/* renamed from: k3e  reason: default package */
public class k3e implements x2e {
    private final a a;

    public k3e(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.x2e
    public boolean a(o8e o8e) {
        return !o8e.d().isPresent() || this.a.a(o8e.d().get()) != null;
    }
}
