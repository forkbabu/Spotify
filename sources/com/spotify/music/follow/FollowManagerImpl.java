package com.spotify.music.follow;

import android.net.Uri;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.follow.j;
import com.spotify.music.json.g;
import io.reactivex.y;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FollowManagerImpl implements m {
    private final o a;
    private final FireAndForgetResolver b;
    private final ObjectMapper c;
    private final Map<String, j> d;
    private final Map<String, Set<l>> e;
    private final y f;

    /* access modifiers changed from: package-private */
    public static class Items implements JacksonModel {
        public String contextSource = "followManager";
        public String[] items;
        public String source = "followManager";

        Items(String str) {
            this.items = new String[]{str};
        }
    }

    /* access modifiers changed from: private */
    public interface a {
        void a(boolean z);
    }

    public FollowManagerImpl(o oVar, FireAndForgetResolver fireAndForgetResolver, g gVar, y yVar) {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        this.d = new TreeMap(comparator);
        this.e = new TreeMap(comparator);
        this.a = oVar;
        this.b = fireAndForgetResolver;
        this.c = gVar.a();
        this.f = yVar;
    }

    private synchronized void m(String str) {
        String decode = Uri.decode(str);
        Set<l> set = this.e.get(decode);
        if (set != null) {
            j jVar = this.d.get(decode);
            for (l lVar : set) {
                lVar.g(jVar);
            }
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x000b: APUT  (r0v1 java.lang.Object[]), (0 ??[int, short, byte, char]), (r2v1 java.lang.String) */
    /* access modifiers changed from: private */
    public static void n(boolean z, String str) {
        Object[] objArr = new Object[2];
        objArr[0] = z ? Request.POST : Request.DELETE;
        objArr[1] = str;
        Logger.g("%s %s succeeded", objArr);
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x000b: APUT  (r1v0 java.lang.Object[]), (0 ??[int, short, byte, char]), (r2v0 java.lang.String) */
    /* access modifiers changed from: private */
    public static void o(Throwable th, boolean z, a aVar) {
        Object[] objArr = new Object[1];
        objArr[0] = z ? Request.POST : Request.DELETE;
        Logger.e(th, "Failed to %s. Rolling back follow state.", objArr);
        aVar.a(!z);
    }

    private synchronized void p(String str, boolean z, boolean z2) {
        String decode = Uri.decode(str);
        Map<String, j> map = this.d;
        j.a h = this.d.get(decode).h();
        h.b(z);
        map.put(decode, h.a());
        if (z2) {
            m(decode);
        }
    }

    private synchronized void q(String str, boolean z, boolean z2) {
        String decode = Uri.decode(str);
        j jVar = this.d.get(decode);
        int c2 = jVar.c() + (z ? 1 : -1);
        Map<String, j> map = this.d;
        j.a h = jVar.h();
        h.d(z);
        h.c(c2);
        map.put(decode, h.a());
        if (z2) {
            m(decode);
        }
    }

    private synchronized void r(String str, boolean z) {
        MoreObjects.checkArgument(l0.z(str).q() == LinkType.ARTIST, "Uri is not an artist uri");
        try {
            this.b.resolve(new Request(z ? Request.POST : Request.DELETE, "sp://core-collection/unstable/bans", Collections.emptyMap(), this.c.writeValueAsString(new Items(str)).getBytes(Charsets.UTF_8)));
        } catch (JsonProcessingException e2) {
            Logger.e(e2, "Failed to serialize json for ban/unbaning of artist.", new Object[0]);
        }
    }

    private synchronized void s(String str, boolean z) {
        MoreObjects.checkArgument(l0.z(str).q() == LinkType.ARTIST, "Uri is not an artist uri");
        try {
            this.b.resolve(new Request(z ? Request.POST : Request.DELETE, "sp://core-collection/v1/items", Collections.emptyMap(), this.c.writeValueAsString(new Items(str)).getBytes(Charsets.UTF_8)));
        } catch (JsonProcessingException e2) {
            Logger.e(e2, "Failed to serialize json for following/unfollowing artist.", new Object[0]);
        }
    }

    private synchronized void t(String str, boolean z) {
        String decode = Uri.decode(str);
        p create = p.create(Collections2.newArrayList(decode));
        (z ? this.a.c(create) : this.a.e(create)).B(this.f).subscribe(new b(z, decode), new f(z, new c(this, str)));
    }

    private synchronized void u(String str, boolean z) {
        String decode = Uri.decode(str);
        p create = p.create(Collections2.newArrayList(decode));
        (z ? this.a.d(create) : this.a.b(create)).B(this.f).subscribe(new e(z, decode), new d(z, new a(this, str)));
    }

    public /* synthetic */ void a(String str, boolean z) {
        p(str, z, true);
        if (l0.z(str).q() == LinkType.ARTIST) {
            r(str, z);
        }
    }

    @Override // com.spotify.music.follow.m
    public synchronized boolean b(String str, l lVar) {
        String decode;
        decode = Uri.decode(str);
        if (!this.e.containsKey(decode)) {
            this.e.put(decode, Collections.newSetFromMap(gf0.b()));
        }
        return this.e.get(decode).add(lVar);
    }

    @Override // com.spotify.music.follow.m
    public synchronized j c(String str) {
        return this.d.get(Uri.decode(str));
    }

    @Override // com.spotify.music.follow.m
    public synchronized boolean d(String str, l lVar) {
        Set<l> set;
        set = this.e.get(Uri.decode(str));
        return set != null && set.remove(lVar);
    }

    @Override // com.spotify.music.follow.m
    public synchronized void e(String str, boolean z) {
        String decode = Uri.decode(str);
        boolean containsKey = this.d.containsKey(decode);
        MoreObjects.checkArgument(containsKey, "no model exists for " + decode);
        boolean z2 = true;
        boolean z3 = l0.z(decode).q() == LinkType.ARTIST;
        boolean f2 = this.d.get(decode).f();
        if (z3 && z) {
            if (f2) {
                z2 = false;
            }
        }
        q(str, z, z2);
        u(str, z);
        if (z3) {
            s(decode, z);
            if (z && f2) {
                f(decode, false);
            }
        }
    }

    @Override // com.spotify.music.follow.m
    public synchronized void f(String str, boolean z) {
        String decode = Uri.decode(str);
        boolean containsKey = this.d.containsKey(decode);
        MoreObjects.checkArgument(containsKey, "no model exists for " + decode);
        boolean z2 = true;
        boolean z3 = l0.z(decode).q() == LinkType.ARTIST;
        boolean g = this.d.get(decode).g();
        if (z3 && z) {
            if (g) {
                z2 = false;
            }
        }
        p(decode, z, z2);
        t(decode, z);
        if (z3) {
            r(decode, z);
            if (z && g) {
                e(decode, false);
            }
        }
    }

    @Override // com.spotify.music.follow.m
    public synchronized void g(j jVar) {
        this.d.put(Uri.decode(jVar.e()), jVar);
        m(jVar.e());
    }

    public /* synthetic */ void j(String str, boolean z) {
        q(str, z, true);
        if (l0.z(str).q() == LinkType.ARTIST) {
            s(str, z);
        }
    }
}
