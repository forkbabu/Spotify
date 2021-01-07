package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobius.e0;
import com.spotify.music.sociallistening.models.Participant;
import com.spotify.music.sociallistening.models.b;
import defpackage.hed;
import defpackage.ied;
import defpackage.jed;
import java.util.Collection;

/* renamed from: bed  reason: default package */
public final /* synthetic */ class bed implements ti0 {
    public final /* synthetic */ jed a;

    public /* synthetic */ bed(jed jed) {
        this.a = jed;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        jed jed = this.a;
        ied.a aVar = (ied.a) obj;
        if (jed.b()) {
            return e0.h();
        }
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        if (aVar.h().a().isPresent()) {
            b bVar = aVar.h().a().get();
            boolean z = false;
            if (!bVar.i() || jed.c().isEmpty() || bVar.b().equals(jed.c())) {
                if ((bVar.h() && bVar.d().size() < jed.e()) || jed.a()) {
                    z = true;
                }
                Optional tryFind = Collections2.tryFind(bVar.d(), ced.a);
                if (tryFind.isPresent()) {
                    builder.mo53add((ImmutableSet.Builder) new hed.a(Optional.fromNullable(MoreObjects.emptyToNull(((Participant) tryFind.get()).getImageUrl())), ((Participant) tryFind.get()).getDisplayName()));
                }
                jed.a m = jed.m();
                m.g(Optional.of(ImmutableList.copyOf((Collection) bVar.d())));
                m.d(bVar.b());
                m.e(bVar.c());
                m.j(bVar.e());
                m.k(z);
                m.m(z);
                m.l(z);
                jed = m.a();
            } else {
                jed.a m2 = jed.m();
                m2.c(true);
                return e0.g(m2.a(), z42.l(new hed.b()));
            }
        }
        if (aVar.h().c().isPresent()) {
            jed.a m3 = jed.m();
            m3.n(Optional.of(aVar.h().c().get()));
            jed = m3.a();
        }
        return e0.g(jed, builder.build());
    }
}
