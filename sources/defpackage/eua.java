package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;

/* renamed from: eua  reason: default package */
public class eua {
    public p81 a(jua jua, String str, int i) {
        return HubsImmutableComponentBundle.builder().p("searchTerm", jua.c()).p("backgroundUri", str).p("requestId", jua.d()).p("pageIdentifier", PageIdentifiers.SEARCH.toString()).j("lastTopResultItemPosition", i).d();
    }
}
