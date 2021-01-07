package defpackage;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.mobius.e0;
import com.spotify.music.sociallistening.models.Participant;
import com.spotify.music.sociallistening.models.b;
import defpackage.rbd;
import defpackage.sbd;
import defpackage.tbd;
import java.util.Collection;

/* renamed from: lbd  reason: default package */
public final /* synthetic */ class lbd implements ti0 {
    public final /* synthetic */ tbd a;

    public /* synthetic */ lbd(tbd tbd) {
        this.a = tbd;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        tbd tbd = this.a;
        b d = tbd.d();
        b e = ((sbd.c) obj).e();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) e.d());
        ImmutableList copyOf2 = ImmutableList.copyOf((Collection) d.d());
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        boolean z = d.g() && d.c().equals(e.c());
        ImmutableList copyOf3 = ImmutableList.copyOf(Collections2.filter((Iterable) copyOf, (Predicate) new kbd(copyOf2)));
        if (!copyOf3.isEmpty()) {
            if (!d.i() || copyOf2.size() > 1 || copyOf.size() != 2) {
                if (d.i() && !z && copyOf.size() > 2) {
                    Optional tryFind = Collections2.tryFind(copyOf, ibd.a);
                    if (tryFind.isPresent()) {
                        builder.mo53add((ImmutableSet.Builder) new rbd.g(((Participant) tryFind.get()).getDisplayName(), copyOf.size()));
                    }
                } else if (z) {
                    UnmodifiableListIterator listIterator = copyOf3.listIterator();
                    while (listIterator.hasNext()) {
                        builder.mo53add((ImmutableSet.Builder) new rbd.c(((Participant) listIterator.next()).getDisplayName()));
                    }
                }
            } else if (e.h() && z) {
                Optional tryFind2 = Collections2.tryFind(copyOf, jbd.a);
                if (tryFind2.isPresent()) {
                    if (tbd.b()) {
                        builder.mo53add((ImmutableSet.Builder) new rbd.c(((Participant) tryFind2.get()).getDisplayName()));
                    } else {
                        builder.mo53add((ImmutableSet.Builder) new rbd.k(((Participant) tryFind2.get()).getDisplayName()));
                    }
                }
            } else if (!e.h() && !z) {
                Optional tryFind3 = Collections2.tryFind(copyOf, obd.a);
                if (tryFind3.isPresent()) {
                    builder.mo53add((ImmutableSet.Builder) new rbd.g(((Participant) tryFind3.get()).getDisplayName(), copyOf.size()));
                }
            }
        }
        ImmutableList copyOf4 = ImmutableList.copyOf(Collections2.filter((Iterable) copyOf2, (Predicate) new pbd(copyOf)));
        if (!copyOf4.isEmpty()) {
            if (d.h() || copyOf.size() > 1) {
                if (d.h() && !z && copyOf2.size() >= 1 && copyOf.size() <= 1) {
                    builder.mo53add((ImmutableSet.Builder) new rbd.f(e.l()));
                } else if (z && e.g()) {
                    UnmodifiableListIterator listIterator2 = copyOf4.listIterator();
                    while (listIterator2.hasNext()) {
                        builder.mo53add((ImmutableSet.Builder) new rbd.d(((Participant) listIterator2.next()).getDisplayName()));
                    }
                }
            } else if (e.f()) {
                Optional tryFind4 = Collections2.tryFind(copyOf2, mbd.a);
                if (tryFind4.isPresent()) {
                    builder.mo53add((ImmutableSet.Builder) new rbd.b(((Participant) tryFind4.get()).getDisplayName()));
                }
                builder.mo53add((ImmutableSet.Builder) new rbd.e());
            } else {
                builder.mo53add((ImmutableSet.Builder) new rbd.h(e.l()));
            }
        }
        tbd.a e2 = tbd.e();
        e2.d(e);
        return e0.g(e2.a(), builder.build());
    }
}
