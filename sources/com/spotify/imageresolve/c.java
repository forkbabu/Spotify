package com.spotify.imageresolve;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.protobuf.ByteString;
import com.spotify.imageresolve.proto.Collection;
import com.spotify.imageresolve.proto.ProjectionMap;
import com.spotify.imageresolve.q;
import io.reactivex.functions.l;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class c implements l {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ImmutableList of;
        ProjectionMap projectionMap = (ProjectionMap) obj;
        ImmutableListMultimap.Builder builder = new ImmutableListMultimap.Builder();
        for (Collection collection : projectionMap.h()) {
            if (!collection.h().isEmpty()) {
                ByteString h = collection.h();
                List<Collection.Projection> i = collection.i();
                int i2 = ImmutableList.a;
                ImmutableList.Builder builder2 = new ImmutableList.Builder();
                Iterator<Collection.Projection> it = i.iterator();
                boolean z = false;
                while (true) {
                    boolean z2 = false;
                    while (true) {
                        if (it.hasNext()) {
                            Collection.Projection next = it.next();
                            if (!(!next.h().isEmpty() && next.i() < projectionMap.m() && next.l() < projectionMap.o())) {
                                of = ImmutableList.of();
                                break;
                            }
                            int i3 = a0.b;
                            q.b bVar = new q.b();
                            bVar.b(next.h());
                            bVar.c(projectionMap.l(next.i()));
                            bVar.d(projectionMap.n(next.l()));
                            a0 a2 = bVar.a();
                            builder2.mo53add((ImmutableList.Builder) a2);
                            z = z || a2.c().i();
                            if (z2 || a2.c().h()) {
                                z2 = true;
                            }
                        } else {
                            of = (!z || !z2) ? ImmutableList.of() : builder2.build();
                        }
                    }
                }
                builder.putAll(h, of);
            }
        }
        ImmutableListMultimap build = builder.build();
        return build.isEmpty() ? Optional.absent() : Optional.of(build);
    }
}
