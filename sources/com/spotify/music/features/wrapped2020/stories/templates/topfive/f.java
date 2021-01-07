package com.spotify.music.features.wrapped2020.stories.templates.topfive;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.h;

public final class f {
    private final String a;
    private final Uri b;
    private final int c;
    private final List<a> d;
    private final long e;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.spotify.music.features.wrapped2020.stories.templates.topfive.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(String str, Uri uri, int i, List<? extends a> list, long j) {
        h.e(str, "storyId");
        h.e(uri, "previewUri");
        h.e(list, "steps");
        this.a = str;
        this.b = uri;
        this.c = i;
        this.d = list;
        this.e = j;
    }

    public final long a() {
        return this.e;
    }

    public final int b() {
        return this.c;
    }

    public final Uri c() {
        return this.b;
    }

    public final List<a> d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return h.a(this.a, fVar.a) && h.a(this.b, fVar.b) && this.c == fVar.c && h.a(this.d, fVar.d) && this.e == fVar.e;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Uri uri = this.b;
        int hashCode2 = (((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.c) * 31;
        List<a> list = this.d;
        if (list != null) {
            i = list.hashCode();
        }
        return ((hashCode2 + i) * 31) + e.a(this.e);
    }

    public String toString() {
        StringBuilder V0 = je.V0("TopFiveStoryData(storyId=");
        V0.append(this.a);
        V0.append(", previewUri=");
        V0.append(this.b);
        V0.append(", backgroundColor=");
        V0.append(this.c);
        V0.append(", steps=");
        V0.append(this.d);
        V0.append(", animationDuration=");
        return je.E0(V0, this.e, ")");
    }
}
