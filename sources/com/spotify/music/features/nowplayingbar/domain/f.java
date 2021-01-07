package com.spotify.music.features.nowplayingbar.domain;

import com.spotify.music.features.nowplayingbar.domain.h;
import com.spotify.music.sociallistening.models.b;

public final class f {
    private final h a;
    private final ContentType b;
    private final a c;
    private final b d;

    static {
        b bVar = null;
        h.a aVar = true & true ? h.a.a : null;
        ContentType contentType = true & true ? ContentType.COVER : null;
        a aVar2 = true & true ? new a(null, null, 3) : null;
        if (true && true) {
            bVar = b.n;
        }
        kotlin.jvm.internal.h.e(aVar, "playerInfo");
        kotlin.jvm.internal.h.e(contentType, "contentType");
        kotlin.jvm.internal.h.e(aVar2, "connectState");
        kotlin.jvm.internal.h.e(bVar, "socialListeningState");
    }

    public f() {
        this(null, null, null, null, 15);
    }

    public f(h hVar, ContentType contentType, a aVar, b bVar) {
        kotlin.jvm.internal.h.e(hVar, "playerInfo");
        kotlin.jvm.internal.h.e(contentType, "contentType");
        kotlin.jvm.internal.h.e(aVar, "connectState");
        kotlin.jvm.internal.h.e(bVar, "socialListeningState");
        this.a = hVar;
        this.b = contentType;
        this.c = aVar;
        this.d = bVar;
    }

    public static f a(f fVar, h hVar, ContentType contentType, a aVar, b bVar, int i) {
        if ((i & 1) != 0) {
            hVar = fVar.a;
        }
        if ((i & 2) != 0) {
            contentType = fVar.b;
        }
        if ((i & 4) != 0) {
            aVar = fVar.c;
        }
        if ((i & 8) != 0) {
            bVar = fVar.d;
        }
        kotlin.jvm.internal.h.e(hVar, "playerInfo");
        kotlin.jvm.internal.h.e(contentType, "contentType");
        kotlin.jvm.internal.h.e(aVar, "connectState");
        kotlin.jvm.internal.h.e(bVar, "socialListeningState");
        return new f(hVar, contentType, aVar, bVar);
    }

    public final a b() {
        return this.c;
    }

    public final ContentType c() {
        return this.b;
    }

    public final h d() {
        return this.a;
    }

    public final b e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.h.a(this.a, fVar.a) && kotlin.jvm.internal.h.a(this.b, fVar.b) && kotlin.jvm.internal.h.a(this.c, fVar.c) && kotlin.jvm.internal.h.a(this.d, fVar.d);
    }

    public int hashCode() {
        h hVar = this.a;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        ContentType contentType = this.b;
        int hashCode2 = (hashCode + (contentType != null ? contentType.hashCode() : 0)) * 31;
        a aVar = this.c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        b bVar = this.d;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("NowPlayingBarModel(playerInfo=");
        V0.append(this.a);
        V0.append(", contentType=");
        V0.append(this.b);
        V0.append(", connectState=");
        V0.append(this.c);
        V0.append(", socialListeningState=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, ContentType contentType, a aVar, b bVar, int i) {
        this((i & 1) != 0 ? h.a.a : null, (i & 2) != 0 ? ContentType.COVER : null, (i & 4) != 0 ? new a(null, null, 3) : null, (i & 8) != 0 ? b.n : null);
    }
}
