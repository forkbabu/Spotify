package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import defpackage.fe9;
import defpackage.ge9;
import defpackage.ie9;

/* renamed from: he9  reason: default package */
public final class he9 {
    static e0 a(ie9 ie9, ge9.d dVar) {
        ImmutableList<String> f = dVar.f();
        ie9.a i = ie9.i();
        i.i(f);
        ie9 a = i.a();
        int i2 = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        if (d(a)) {
            a = a.j(true);
            builder.mo53add((ImmutableSet.Builder) new fe9.b(50, a.h(), ImmutableList.of()));
        }
        return e0.g(e(a), builder.build());
    }

    static e0 b(ie9 ie9, ge9.b bVar) {
        ImmutableList<MusicItem> f = bVar.f();
        ie9.a i = ie9.i();
        i.d(f);
        return e0.f(e(i.a()));
    }

    static e0 c(ie9 ie9, ge9.a aVar) {
        boolean f = aVar.f();
        ie9.a i = ie9.i();
        i.b(Optional.of(Boolean.valueOf(f)));
        ie9 a = i.a();
        if (a.g() && !a.a().or((Optional<Boolean>) Boolean.FALSE).booleanValue()) {
            a = a.j(false);
        }
        int i2 = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        if (d(a)) {
            a = a.j(true);
            builder.mo53add((ImmutableSet.Builder) new fe9.b(50, a.h(), ImmutableList.of()));
        }
        return e0.g(e(a), builder.build());
    }

    private static boolean d(ie9 ie9) {
        return !ie9.g() && ie9.e().isEmpty() && !ie9.h().isEmpty() && ie9.h().size() < ie9.d() && ie9.a().or(Boolean.FALSE).booleanValue();
    }

    private static ie9 e(ie9 ie9) {
        int size = ie9.h().size();
        if (size == 0 || size >= ie9.d()) {
            ImmutableList<MusicItem> of = ImmutableList.of();
            ie9.a i = ie9.i();
            i.g(of);
            return i.a();
        }
        int d = ie9.d() - size;
        int i2 = 0;
        int i3 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        UnmodifiableListIterator<MusicItem> listIterator = ie9.c().listIterator();
        while (listIterator.hasNext()) {
            MusicItem next = listIterator.next();
            if (next.o() && !next.y().a() && !ie9.h().contains(next.A())) {
                MusicItem.b x = next.x();
                MusicItem.g.a n = next.y().n();
                n.e(ie9.a().or((Optional<Boolean>) Boolean.TRUE).booleanValue());
                x.c(n.b());
                x.g(i2);
                builder.mo53add((ImmutableList.Builder) x.b());
                i2++;
                if (i2 == d) {
                    break;
                }
            }
        }
        ImmutableList<MusicItem> build = builder.build();
        ie9.a i4 = ie9.i();
        i4.g(build);
        return i4.a();
    }
}
