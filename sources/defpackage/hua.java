package defpackage;

import com.spotify.instrumentation.PageIdentifiers;

/* renamed from: hua  reason: default package */
public class hua {
    private final qqa a;

    public hua(qqa qqa) {
        this.a = qqa;
    }

    public b91 a(jua jua) {
        return this.a.b(jua.c(), false).toBuilder().d("searchTerm", jua.c()).d("requestId", jua.d()).d("pageIdentifier", PageIdentifiers.SEARCH.toString()).g();
    }
}
