package com.spotify.music.libs.podcast.loader;

public class o {
    private final n a;

    public o(n nVar) {
        this.a = nVar;
    }

    private m b(String str) {
        m mVar = new m(this.a, str);
        mVar.b().b("syncProgress");
        mVar.b().a("trailer");
        return mVar;
    }

    public m a(String str) {
        m b = b(str);
        b.b().g("resumePoint");
        return b;
    }

    public m c(String str) {
        return b(str);
    }
}
