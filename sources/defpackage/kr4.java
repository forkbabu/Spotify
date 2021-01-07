package defpackage;

import com.spotify.remoteconfig.jj;

/* renamed from: kr4  reason: default package */
class kr4 implements jr4 {
    private final jj a;

    kr4(jj jjVar) {
        this.a = jjVar;
    }

    @Override // defpackage.jr4
    public boolean isEnabled() {
        return this.a.c();
    }
}
