package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.spotify.mobius.e0;
import com.spotify.mobius.s;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import com.spotify.music.yourlibrary.interfaces.i;
import defpackage.n19;
import defpackage.o19;
import defpackage.q19;
import java.util.Map;

/* renamed from: p19  reason: default package */
public final class p19 {
    private static YourLibraryPageGroup a(YourLibraryPageId yourLibraryPageId, q19 q19) {
        UnmodifiableIterator<Map.Entry<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>>> it = q19.d().mo54entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> next = it.next();
            if (next.getValue().contains(yourLibraryPageId)) {
                return next.getKey();
            }
        }
        StringBuilder V0 = je.V0("Group for page id ");
        V0.append(yourLibraryPageId.g());
        V0.append(" was not found!");
        throw new IllegalArgumentException(V0.toString());
    }

    public static s<q19, n19> b(q19 q19) {
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        i g = q19.g();
        if (g.c()) {
            i.a f = g.f();
            f.d(false);
            i a = f.a();
            q19.a e = q19.e();
            e.f(a);
            q19 = e.a();
        }
        if (q19.a().isPresent() && !q19.b()) {
            builder.mo53add((ImmutableSet.Builder) new n19.a(q19.a().get(), false, true));
            Optional<YourLibraryPageId> absent = Optional.absent();
            q19.a e2 = q19.e();
            e2.b(absent);
            q19 = e2.a();
        }
        return s.c(q19, builder.build());
    }

    static e0 c(q19 q19, o19.d dVar) {
        YourLibraryPageId orNull = q19.a().orNull();
        YourLibraryPageId l = dVar.l();
        q19.a e = q19.e();
        e.b(Optional.of(l));
        q19 a = e.a();
        if (!a.b()) {
            q19.a e2 = a.e();
            e2.c(true);
            a = e2.a();
        }
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        boolean z = false;
        builder.mo60add((Object[]) new n19[]{new n19.b(dVar.m(), dVar.n()), new n19.d(l, true), new n19.j(dVar.l())});
        if (orNull != null) {
            builder.mo53add((ImmutableSet.Builder) new n19.d(orNull, false));
        }
        if (!(orNull == null || a(orNull, a) == a(l, a))) {
            z = true;
        }
        if (z) {
            builder.mo53add((ImmutableSet.Builder) new n19.i(YourLibraryTabsCollapseState.EXPANDED, true));
        }
        return e0.g(a, builder.build());
    }
}
