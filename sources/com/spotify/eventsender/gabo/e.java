package com.spotify.eventsender.gabo;

import com.google.common.collect.Collections2;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Range;
import com.spotify.eventsender.c0;
import com.spotify.eventsender.gabo.PublishEventsRequest;
import com.spotify.eventsender.h0;
import com.spotify.eventsender.k0;
import java.util.List;
import retrofit2.v;

/* access modifiers changed from: package-private */
public class e implements h0 {
    private final f a;
    private final h b;
    private final kl0 c;

    e(f fVar, h hVar, kl0 kl0) {
        this.a = fVar;
        this.b = hVar;
        this.c = kl0;
    }

    private k0 d(int i, v<PublishEventsResponse> vVar) {
        int b2 = vVar.b();
        PublishEventsResponse a2 = vVar.a();
        boolean z = true;
        if (b2 != 200 || a2 == null) {
            kl0 kl0 = this.c;
            kl0.d("Recieved error code: " + b2);
            k0.a a3 = k0.a();
            a3.c(true);
            return a3.a();
        }
        k0.a a4 = k0.a();
        a4.b(Collections2.difference(ContiguousSet.create(Range.closedOpen(0, Integer.valueOf(i)), DiscreteDomain.integers()), FluentIterable.from(a2.h()).filter(b.a).transform(a.a).toSet()));
        if (vVar.e().c("Spotify-Back-Off") == null) {
            z = false;
        }
        a4.c(z);
        return a4.a();
    }

    @Override // com.spotify.eventsender.h0
    public k0 a(List<c0> list) {
        return d(list.size(), this.a.b(c(list)).h());
    }

    @Override // com.spotify.eventsender.h0
    public k0 b(List<c0> list) {
        return d(list.size(), this.a.a(c(list)).h());
    }

    /* access modifiers changed from: package-private */
    public PublishEventsRequest c(List<c0> list) {
        h hVar = this.b;
        hVar.getClass();
        ImmutableList list2 = FluentIterable.from(list).transform(new d(hVar)).toList();
        PublishEventsRequest.b i = PublishEventsRequest.i();
        i.m(list2);
        return (PublishEventsRequest) i.build();
    }
}
