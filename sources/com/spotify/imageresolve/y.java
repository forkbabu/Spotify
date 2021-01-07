package com.spotify.imageresolve;

import android.net.Uri;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableMultimap;
import com.google.protobuf.ByteString;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class y {
    private final h0 a;
    private final s b;

    public y(h0 h0Var, s sVar) {
        this.a = h0Var;
        this.b = sVar;
    }

    public Uri a(Uri uri) {
        ImmutableMultimap<ByteString, a0> a2;
        Optional absent;
        Optional<v> b2 = v.b(uri);
        if (!b2.isPresent() || (a2 = this.a.a()) == null) {
            return uri;
        }
        FluentIterable from = FluentIterable.from(a2.mo44get((ImmutableMultimap<ByteString, a0>) b2.get().a()));
        if (from.isEmpty()) {
            return uri;
        }
        Optional firstMatch = from.firstMatch(new h(b2));
        if (!firstMatch.isPresent()) {
            return uri;
        }
        int m = ((a0) firstMatch.get()).c().m();
        int l = ((a0) firstMatch.get()).c().l();
        a0 b3 = g0.b(from, m, l);
        a0 c = g0.c(from, m, l);
        Optional<a0> d = g0.d(from, m, l);
        v vVar = b2.get();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(b3.a(vVar));
        linkedHashSet.add(Uri.parse("spotify:image:" + vVar.d(b3.b()).e()));
        linkedHashSet.add(c.a(vVar));
        if (d.isPresent()) {
            linkedHashSet.add(d.get().a(vVar));
        }
        Set<Uri> a3 = this.b.a(linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                absent = Optional.absent();
                break;
            }
            Uri uri2 = (Uri) it.next();
            if (a3.contains(uri2)) {
                absent = Optional.of(uri2);
                break;
            }
        }
        return (Uri) absent.or((Optional) c.a(b2.get()));
    }
}
