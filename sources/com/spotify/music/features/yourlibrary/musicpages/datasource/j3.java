package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.v;
import java.util.Map;

public class j3 implements w3 {
    private final ia9 a;
    private final m b;
    private final CollectionStateProvider c;
    private final a d;
    private final s<Boolean> e;
    private final PublishSubject<Integer> f;
    private final io.reactivex.subjects.a<s<String>> g = io.reactivex.subjects.a.h1();
    private s<y3> h;

    public interface a {
        s<Map<String, com.spotify.playlist.models.a>> a(String... strArr);
    }

    public j3(ia9 ia9, m mVar, CollectionStateProvider collectionStateProvider, a aVar, s<Boolean> sVar) {
        this.a = ia9;
        this.b = mVar;
        this.c = collectionStateProvider;
        this.d = aVar;
        this.e = sVar;
        this.f = PublishSubject.h1();
    }

    public static s a(j3 j3Var) {
        return s.n(j3Var.f.G0(100).J0(new m(j3Var)).J0(new q(j3Var)), j3Var.e, g0.a).j0(new p(j3Var)).j0(d.a).r0(o.a);
    }

    public static s e(j3 j3Var, int i) {
        return j3Var.a.a(i).A(s.a).P();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0092, code lost:
        if (r8 == false) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.collect.ImmutableList f(com.spotify.music.features.yourlibrary.musicpages.datasource.j3 r16, java.lang.String[] r17, java.util.Map r18, java.util.Map r19, java.lang.String r20) {
        /*
            r0 = r17
            r16.getClass()
            int r1 = r0.length
            int r2 = com.google.common.collect.ImmutableList.a
            com.google.common.collect.ImmutableList$Builder r2 = new com.google.common.collect.ImmutableList$Builder
            r2.<init>()
            int r3 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0011:
            r7 = 50
            if (r4 >= r3) goto L_0x00aa
            r8 = r0[r4]
            r9 = r19
            java.lang.Object r10 = r9.get(r8)
            com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider$a r10 = (com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a) r10
            if (r10 == 0) goto L_0x00a2
            boolean r10 = r10.b()
            if (r10 != 0) goto L_0x00a2
            r10 = r18
            if (r6 >= r7) goto L_0x009d
            java.lang.Object r7 = r10.get(r8)
            com.spotify.playlist.models.a r7 = (com.spotify.playlist.models.a) r7
            if (r7 == 0) goto L_0x009d
            boolean r8 = r20.isEmpty()
            if (r8 != 0) goto L_0x0095
            r8 = 32
            java.lang.StringBuilder r11 = defpackage.je.S0(r8)
            java.util.Locale r12 = java.util.Locale.getDefault()
            r13 = r20
            java.lang.String r12 = r13.toLowerCase(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.StringBuilder r12 = defpackage.je.S0(r8)
            java.lang.String r14 = r7.g()
            java.util.Locale r15 = java.util.Locale.getDefault()
            java.lang.String r14 = r14.toLowerCase(r15)
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            boolean r12 = r12.contains(r11)
            if (r12 != 0) goto L_0x0091
            java.lang.StringBuilder r8 = defpackage.je.S0(r8)
            com.spotify.playlist.models.b r12 = r7.c()
            java.lang.String r12 = r12.f()
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            java.util.Locale r12 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.toLowerCase(r12)
            boolean r8 = r8.contains(r11)
            if (r8 == 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r8 = 0
            goto L_0x0092
        L_0x0091:
            r8 = 1
        L_0x0092:
            if (r8 == 0) goto L_0x009f
            goto L_0x0097
        L_0x0095:
            r13 = r20
        L_0x0097:
            r2.mo53add(r7)
            int r6 = r6 + 1
            goto L_0x009f
        L_0x009d:
            r13 = r20
        L_0x009f:
            int r5 = r5 + 1
            goto L_0x00a6
        L_0x00a2:
            r10 = r18
            r13 = r20
        L_0x00a6:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x00aa:
            r0 = 100
            if (r1 != r0) goto L_0x00bb
            if (r5 >= r7) goto L_0x00bb
            r1 = r16
            io.reactivex.subjects.PublishSubject<java.lang.Integer> r1 = r1.f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.onNext(r0)
        L_0x00bb:
            com.google.common.collect.ImmutableList r0 = r2.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourlibrary.musicpages.datasource.j3.f(com.spotify.music.features.yourlibrary.musicpages.datasource.j3, java.lang.String[], java.util.Map, java.util.Map, java.lang.String):com.google.common.collect.ImmutableList");
    }

    private s<y3> i() {
        if (this.h == null) {
            this.h = s.B(new l(this)).v0(1).h1();
        }
        return this.h;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<Boolean> b() {
        return i().j0(n.a);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> c() {
        return i();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.w3
    public s<y3> d(s<x3> sVar) {
        this.g.onNext(sVar.j0(f3.a).j0(s1.a));
        return i();
    }

    public v g(String[] strArr) {
        return s.l(s.i0(strArr), this.d.a(strArr), this.c.b("", "", strArr), s.M0(this.g).G0("").E(), new r(this));
    }

    public ImmutableList h(eg9 eg9) {
        ImmutableList immutableList = (ImmutableList) eg9.b();
        boolean booleanValue = ((Boolean) eg9.c()).booleanValue();
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            builder.mo53add((ImmutableList.Builder) this.b.n((com.spotify.playlist.models.a) immutableList.get(i2), booleanValue, i2, true));
        }
        return builder.build();
    }
}
