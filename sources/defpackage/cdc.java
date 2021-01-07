package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.spotify.mobius.e0;
import com.spotify.music.libs.partnerapps.PartnerType;
import defpackage.adc;
import defpackage.bdc;
import defpackage.ddc;

/* renamed from: cdc  reason: default package */
public final class cdc {
    static e0 a(ddc ddc, bdc.j jVar) {
        if (d(jVar.k(), ddc.b())) {
            return e0.a(z42.l(new adc.d(jVar.k())));
        }
        return e0.h();
    }

    static e0 b(ddc ddc, bdc.b bVar) {
        Optional<PartnerType> a = ddc.a();
        ddc.a d = ddc.d();
        d.c(bVar.k());
        d.a(Optional.absent());
        ddc b = d.b();
        if (!a.isPresent() || !d(a.get(), b.b())) {
            return e0.f(b);
        }
        return e0.g(b, z42.l(new adc.d(a.get())));
    }

    static e0 c(ddc ddc, bdc.a aVar) {
        return e0.f(e(ddc, aVar.l(), Optional.of(Boolean.valueOf(aVar.k())), Optional.absent()));
    }

    private static boolean d(PartnerType partnerType, ImmutableMap<PartnerType, bla> immutableMap) {
        bla bla;
        return partnerType != PartnerType.UNKNOWN && (bla = immutableMap.get(partnerType)) != null && bla.b() && bla.c();
    }

    private static ddc e(ddc ddc, PartnerType partnerType, Optional<Boolean> optional, Optional<Boolean> optional2) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        UnmodifiableIterator<PartnerType> it = ddc.b().keySet().iterator();
        while (it.hasNext()) {
            PartnerType next = it.next();
            bla bla = ddc.b().get(next);
            bla.getClass();
            bla bla2 = bla;
            if (next == partnerType) {
                builder.mo51put(next, bla2.d(optional, optional2));
            } else {
                builder.mo51put(next, bla2);
            }
        }
        ddc.a d = ddc.d();
        d.c(builder.build());
        return d.b();
    }
}
