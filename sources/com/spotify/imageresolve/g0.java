package com.spotify.imageresolve;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.spotify.imageresolve.proto.ProjectionMetadata;

final class g0 {
    private static int a(ProjectionMetadata projectionMetadata) {
        return (projectionMetadata.l() + projectionMetadata.m()) * 2;
    }

    public static a0 b(FluentIterable<a0> fluentIterable, int i, int i2) {
        FluentIterable<a0> filter = fluentIterable.filter(m.a);
        MoreObjects.checkArgument(!filter.isEmpty());
        return e(filter, i, i2);
    }

    public static a0 c(FluentIterable<a0> fluentIterable, int i, int i2) {
        FluentIterable<a0> filter = fluentIterable.filter(n.a);
        MoreObjects.checkArgument(!filter.isEmpty());
        return e(filter, i, i2);
    }

    public static Optional<a0> d(FluentIterable<a0> fluentIterable, int i, int i2) {
        FluentIterable<a0> filter = fluentIterable.filter(l.a);
        if (filter.isEmpty()) {
            return Optional.absent();
        }
        return Optional.of(e(filter, i, i2));
    }

    private static a0 e(Iterable<a0> iterable, int i, int i2) {
        a0 a0Var = null;
        a0 a0Var2 = null;
        for (a0 a0Var3 : iterable) {
            ProjectionMetadata c = a0Var3.c();
            if (c.m() < i || c.l() < i2) {
                if (a0Var2 != null) {
                    if ((c.l() + c.m()) * 2 <= a(a0Var2.c())) {
                    }
                }
                a0Var2 = a0Var3;
            } else {
                if (a0Var != null) {
                    if (a(a0Var.c()) <= (c.l() + c.m()) * 2) {
                    }
                }
                a0Var = a0Var3;
            }
        }
        MoreObjects.checkArgument((a0Var == null && a0Var2 == null) ? false : true);
        return a0Var != null ? a0Var : a0Var2;
    }
}
