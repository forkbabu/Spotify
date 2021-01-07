package com.spotify.music.features.yourlibraryx.effecthandlers;

import com.spotify.collection.endpoints.yourlibrary.all.YourLibraryEndpointConfiguration;
import com.spotify.collection.endpoints.yourlibrary.all.b;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponse;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponseEntity;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponseHeader;
import com.spotify.music.features.yourlibraryx.domain.b;
import com.spotify.music.features.yourlibraryx.domain.h;
import com.spotify.music.features.yourlibraryx.domain.k;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.d;

public final class e {
    private final b a;
    private final String b;
    private final String c;
    private final String d;

    static final class a<T, R> implements l<YourLibraryResponseProto$YourLibraryResponse, h> {
        final /* synthetic */ e a;
        final /* synthetic */ k b;

        a(e eVar, k kVar) {
            this.a = eVar;
            this.b = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public h apply(YourLibraryResponseProto$YourLibraryResponse yourLibraryResponseProto$YourLibraryResponse) {
            YourLibraryResponseProto$YourLibraryResponse yourLibraryResponseProto$YourLibraryResponse2 = yourLibraryResponseProto$YourLibraryResponse;
            kotlin.jvm.internal.h.e(yourLibraryResponseProto$YourLibraryResponse2, "it");
            return e.b(this.a, yourLibraryResponseProto$YourLibraryResponse2, this.b.c().d());
        }
    }

    public e(b bVar, String str, String str2, String str3) {
        kotlin.jvm.internal.h.e(bVar, "endpoint");
        kotlin.jvm.internal.h.e(str, "username");
        kotlin.jvm.internal.h.e(str2, "likedSongsLabel");
        kotlin.jvm.internal.h.e(str3, "yourEpisodesLabel");
        this.a = bVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public static final List a(e eVar, boolean z) {
        eVar.getClass();
        if (z) {
            return d.t(b.c.a);
        }
        return EmptyList.a;
    }

    public static final h b(e eVar, YourLibraryResponseProto$YourLibraryResponse yourLibraryResponseProto$YourLibraryResponse, int i) {
        jnf jnf;
        int i2;
        eVar.getClass();
        if (yourLibraryResponseProto$YourLibraryResponse.h() == 0) {
            jnf jnf2 = jnf.n;
            jnf = jnf.f;
        } else {
            jnf = knf.e(i, yourLibraryResponseProto$YourLibraryResponse.h() + i);
        }
        boolean z = true;
        if (jnf.isEmpty()) {
            i2 = 0;
        } else {
            YourLibraryResponseProto$YourLibraryResponseHeader l = yourLibraryResponseProto$YourLibraryResponse.l();
            kotlin.jvm.internal.h.d(l, "this.header");
            i2 = l.s() + jnf.e() + 1;
        }
        List<YourLibraryResponseProto$YourLibraryResponseEntity> i3 = yourLibraryResponseProto$YourLibraryResponse.i();
        kotlin.jvm.internal.h.d(i3, "this.entityList");
        YourLibraryResponseProto$YourLibraryResponseHeader l2 = yourLibraryResponseProto$YourLibraryResponse.l();
        kotlin.jvm.internal.h.d(l2, "this.header");
        ArrayList arrayList = new ArrayList();
        eVar.c(arrayList, l2.q(), kotlin.a.b(new YourLibraryEffectHandler$toContentFilters$1(eVar, l2)));
        eVar.c(arrayList, l2.l(), kotlin.a.b(new YourLibraryEffectHandler$toContentFilters$2(eVar, l2)));
        eVar.c(arrayList, l2.i(), kotlin.a.b(new YourLibraryEffectHandler$toContentFilters$3(eVar, l2)));
        eVar.c(arrayList, l2.r(), kotlin.a.b(new YourLibraryEffectHandler$toContentFilters$4(eVar, l2)));
        if (!l2.m() && !l2.n() && !l2.o() && !l2.p()) {
            z = false;
        }
        eVar.c(arrayList, z, kotlin.a.b(YourLibraryEffectHandler$toContentFilters$5.a));
        return new h(i3, jnf, i2, arrayList, false, 16);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    private final <T> List<T> c(List<T> list, boolean z, kotlin.d<? extends T> dVar) {
        if (z) {
            list.add(dVar.getValue());
        }
        return list;
    }

    public final s<h> d(k kVar) {
        YourLibraryEndpointConfiguration.Sort sort;
        YourLibraryEndpointConfiguration.Entity entity;
        kotlin.jvm.internal.h.e(kVar, "subscription");
        com.spotify.collection.endpoints.yourlibrary.all.b bVar = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        int ordinal = kVar.e().ordinal();
        if (ordinal == 0) {
            sort = YourLibraryEndpointConfiguration.Sort.RELEVANCE;
        } else if (ordinal == 1) {
            sort = YourLibraryEndpointConfiguration.Sort.PLAYED;
        } else if (ordinal == 2) {
            sort = YourLibraryEndpointConfiguration.Sort.ADDED;
        } else if (ordinal == 3) {
            sort = YourLibraryEndpointConfiguration.Sort.NAME;
        } else if (ordinal == 4) {
            sort = YourLibraryEndpointConfiguration.Sort.CREATOR;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        String e = kVar.b().e();
        List<com.spotify.music.features.yourlibraryx.domain.b> c2 = kVar.b().c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c2.iterator();
        while (true) {
            YourLibraryEndpointConfiguration.Entity entity2 = null;
            if (it.hasNext()) {
                T next = it.next();
                if (next instanceof b.a) {
                    entity2 = YourLibraryEndpointConfiguration.Entity.ALBUMS;
                } else if (next instanceof b.C0269b) {
                    entity2 = YourLibraryEndpointConfiguration.Entity.ARTISTS;
                } else if (!(next instanceof b.c) && !(next instanceof b.d)) {
                    if (next instanceof b.e) {
                        entity2 = YourLibraryEndpointConfiguration.Entity.PLAYLISTS;
                    } else if (next instanceof b.f) {
                        entity2 = YourLibraryEndpointConfiguration.Entity.SHOWS;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (entity2 != null) {
                    arrayList.add(entity2);
                }
            } else {
                boolean z = false;
                if (arrayList.size() != 1) {
                    entity = null;
                } else {
                    entity = (YourLibraryEndpointConfiguration.Entity) arrayList.get(0);
                }
                List<com.spotify.music.features.yourlibraryx.domain.b> c3 = kVar.b().c();
                if (!(c3 instanceof Collection) || !c3.isEmpty()) {
                    Iterator<T> it2 = c3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (kotlin.jvm.internal.h.a(it2.next(), b.c.a)) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                Boolean bool = z ? Boolean.TRUE : null;
                Integer valueOf = Integer.valueOf(kVar.c().d());
                Integer valueOf2 = Integer.valueOf((kVar.c().e() + 1) - kVar.c().d());
                Boolean bool2 = Boolean.TRUE;
                s<R> j0 = bVar.a(new YourLibraryEndpointConfiguration(str, null, valueOf, valueOf2, bool2, 0, null, sort, entity, str2, null, str3, null, bool, e, bool2, kVar.d(), 5218)).j0(new a(this, kVar));
                kotlin.jvm.internal.h.d(j0, "endpoint.subscribeToYour…bscription.range.first) }");
                return j0;
            }
        }
    }
}
