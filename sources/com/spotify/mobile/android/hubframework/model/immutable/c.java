package com.spotify.mobile.android.hubframework.model.immutable;

import android.os.Parcel;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class c {
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x0076 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Iterable<? extends s81>, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable<com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r0 != false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Iterable<com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel> a(java.lang.Iterable<? extends defpackage.s81> r3) {
        /*
            java.lang.String r0 = "items"
            kotlin.jvm.internal.h.e(r3, r0)
            boolean r0 = r3 instanceof com.google.common.collect.ImmutableList
            if (r0 == 0) goto L_0x0029
            java.lang.Class<com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel> r0 = com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel.class
            com.google.common.base.Predicate r0 = com.google.common.base.MoreObjects.instanceOf(r0)
            java.util.Iterator r1 = r3.iterator()
        L_0x0013:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0025
            java.lang.Object r2 = r1.next()
            boolean r2 = r0.apply(r2)
            if (r2 != 0) goto L_0x0013
            r0 = 0
            goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x0029
            goto L_0x0076
        L_0x0029:
            java.lang.String r0 = "$this$filterNotNull"
            kotlin.jvm.internal.h.e(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "$this$filterNotNullTo"
            kotlin.jvm.internal.h.e(r3, r1)
            java.lang.String r1 = "destination"
            kotlin.jvm.internal.h.e(r0, r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x0041:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x0041
            r0.add(r1)
            goto L_0x0041
        L_0x0051:
            java.util.ArrayList r3 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.d.e(r0, r1)
            r3.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0060:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0076
            java.lang.Object r1 = r0.next()
            s81 r1 = (defpackage.s81) r1
            com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel$b r2 = com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel.Companion
            com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel r1 = r2.c(r1)
            r3.add(r1)
            goto L_0x0060
        L_0x0076:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.hubframework.model.immutable.c.a(java.lang.Iterable):java.lang.Iterable");
    }

    public static final Iterable<HubsImmutableComponentModel> b(List<? extends s81> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return a(list);
    }

    public static final ImmutableList<HubsImmutableComponentModel> c(List<? extends s81> list) {
        if (list == null || list.isEmpty()) {
            ImmutableList<HubsImmutableComponentModel> of = ImmutableList.of();
            h.d(of, "ImmutableList.of()");
            return of;
        }
        ImmutableList<HubsImmutableComponentModel> copyOf = ImmutableList.copyOf(a(list));
        h.d(copyOf, "ImmutableList.copyOf(\n  …tems(items)\n            )");
        return copyOf;
    }

    public static final boolean d(s81 s81, s81 s812) {
        if (s81 == s812) {
            return true;
        }
        if (s81 == null) {
            HubsImmutableComponentModel.Companion.getClass();
            s81 = HubsImmutableComponentModel.EMPTY;
        }
        if (s812 == null) {
            HubsImmutableComponentModel.Companion.getClass();
            s812 = HubsImmutableComponentModel.EMPTY;
        }
        return h.a(s81, s812);
    }

    private static final boolean e(p81 p81) {
        return p81 == null || p81.keySet().isEmpty();
    }

    public static final boolean f(p81 p81, p81 p812) {
        return p81 == p812 || (e(p81) && e(p812));
    }

    public static final boolean g(Collection<?> collection, Collection<?> collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection.isEmpty()) {
            if (collection2 == null || collection2.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean h(Map<?, ?> map, Map<?, ?> map2) {
        if (map == map2) {
            return true;
        }
        if (map == null || map.isEmpty()) {
            if (map2 == null || map2.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static final ImmutableList<HubsImmutableComponentModel> i(Parcel parcel) {
        h.e(parcel, "parcel");
        ArrayList arrayList = new ArrayList(parcel.readInt());
        parcel.readTypedList(arrayList, HubsImmutableComponentModel.CREATOR);
        ImmutableList<HubsImmutableComponentModel> copyOf = ImmutableList.copyOf((Collection) arrayList);
        h.d(copyOf, "ImmutableList.copyOf(list)");
        return copyOf;
    }

    public static final void j(Parcel parcel, List<? extends HubsImmutableComponentModel> list) {
        h.e(parcel, "dest");
        h.e(list, "list");
        parcel.writeInt(list.size());
        parcel.writeTypedList(list);
    }
}
