package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.spotify.music.libs.assistedcuration.model.RecsRequest;
import com.spotify.music.libs.assistedcuration.model.RecsResponse;
import com.spotify.music.libs.assistedcuration.model.e;
import io.reactivex.s;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: n1a  reason: default package */
public class n1a {
    private final b0a a;

    public n1a(b0a b0a) {
        this.a = b0a;
    }

    public s<List<e>> a(String str, Set<String> set, List<e> list, int i) {
        HashSet newHashSet = Collections2.newHashSet(set);
        newHashSet.add(str);
        HashSet hashSet = new HashSet();
        for (e eVar : list) {
            hashSet.add(eVar.getUri());
        }
        newHashSet.addAll(hashSet);
        return b(Collections.singleton(str), "", newHashSet, i).j0(y0a.a).r0(v0a.a);
    }

    public s<RecsResponse> b(Collection<String> collection, String str, Collection<String> collection2, int i) {
        w0a w0a = w0a.a;
        return this.a.a(RecsRequest.create(i, ImmutableSet.copyOf(Collections2.transform((Iterable) collection2, (Function) w0a)), ImmutableSet.copyOf(Collections2.transform((Iterable) collection, (Function) w0a)), str)).P().r0(x0a.a);
    }
}
