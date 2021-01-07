package com.spotify.music.features.entityselector.container;

import com.spotify.mobius.e0;
import defpackage.vy4;
import defpackage.wy4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class EntitySelectorsInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<xy4, wy4, e0<xy4, vy4>> {
    public static final EntitySelectorsInjector$createLoopFactory$1 a = new EntitySelectorsInjector$createLoopFactory$1();

    EntitySelectorsInjector$createLoopFactory$1() {
        super(2, yy4.class, "update", "update(Lcom/spotify/music/features/entityselector/container/domain/EntitySelectorModel;Lcom/spotify/music/features/entityselector/container/domain/EntitySelectorEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<xy4, vy4> invoke(xy4 xy4, wy4 wy4) {
        e0<xy4, vy4> e0Var;
        xy4 xy42 = xy4;
        wy4 wy42 = wy4;
        h.e(xy42, "p1");
        h.e(wy42, "p2");
        vy4.a aVar = vy4.a.a;
        h.e(xy42, "model");
        h.e(wy42, "event");
        if (wy42 instanceof wy4.a) {
            e0<xy4, vy4> a2 = e0.a(z42.l(aVar));
            h.d(a2, "Next.dispatch(effects(Close))");
            return a2;
        } else if (wy42 instanceof wy4.b) {
            wy4.b bVar = (wy4.b) wy42;
            int size = 5 - xy42.c().size();
            if (h.a(bVar.a(), xy42.d()) || bVar.a().isEmpty()) {
                e0<xy4, vy4> h = e0.h();
                h.d(h, "Next.noChange<EntitySele…, EntitySelectorEffect>()");
                return h;
            }
            if (bVar.a().size() < size) {
                e0Var = e0.g(xy4.a(xy42, bVar.a(), null, null, 6), z42.l(new vy4.b(xy42.b())));
            } else {
                e0Var = e0.g(xy4.a(xy42, bVar.a(), null, null, 6), z42.l(aVar));
            }
            h.d(e0Var, "if (event.userSelectionL…ts(Close)\n        )\n    }");
            return e0Var;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
