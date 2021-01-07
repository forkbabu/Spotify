package defpackage;

import com.google.common.base.Charsets;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: nva  reason: default package */
public class nva implements sg0<hva, b91> {
    private final rva a;
    private final pva b;
    private final qqa c;

    public nva(rva rva, pva pva, qqa qqa) {
        this.a = rva;
        this.b = pva;
        this.c = qqa;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.sg0
    public b91 apply(hva hva) {
        hva hva2 = hva;
        if (!FluentIterable.from(hva2.d().l()).filter(iva.a).toList().isEmpty()) {
            List<s81> a2 = this.a.a(hva2.d().l(), hva2.c());
            pva pva = this.b;
            pva.getClass();
            ImmutableList list = FluentIterable.from(hva2.d().h()).filter(jva.a).transform(new kva(pva, new AtomicInteger(0), hva2)).toList();
            return z81.i().a(a2).a(list).h(HubsImmutableComponentBundle.builder().p("searchTerm", gf0.c(hva2.b(), Charsets.UTF_8)).p("backgroundUri", hva2.d().i(0).l()).p("requestId", hva2.c()).p("pageIdentifier", PageIdentifiers.ASSISTED_CURATION_SEARCH.toString()).j("lastTopResultItemPosition", ((ArrayList) a2).size() - 1).d()).g();
        }
        String c2 = hva2.c();
        String c3 = gf0.c(hva2.b(), Charsets.UTF_8);
        return this.c.b(c3, false).toBuilder().d("searchTerm", c3).d("requestId", c2).d("pageIdentifier", PageIdentifiers.ASSISTED_CURATION_SEARCH.toString()).g();
    }
}
