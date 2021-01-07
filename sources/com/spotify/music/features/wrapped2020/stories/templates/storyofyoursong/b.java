package com.spotify.music.features.wrapped2020.stories.templates.storyofyoursong;

import android.graphics.Bitmap;
import android.net.Uri;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import com.spotify.player.model.ContextTrack;
import java.util.List;
import kotlin.jvm.internal.h;

public final class b {
    private final String a;
    private final Uri b;
    private final int c;
    private final a09 d;
    private final Bitmap e;
    private final WrappedGradient f;
    private final List<a> g;
    private final yz8 h;
    private final yz8 i;

    public b(String str, Uri uri, int i2, a09 a09, Bitmap bitmap, WrappedGradient wrappedGradient, List<a> list, yz8 yz8, yz8 yz82) {
        h.e(str, "storyId");
        h.e(uri, "previewUri");
        h.e(a09, "intro");
        h.e(bitmap, "image");
        h.e(wrappedGradient, "backgroundGradient");
        h.e(list, "statistics");
        h.e(yz8, "title");
        h.e(yz82, ContextTrack.Metadata.KEY_SUBTITLE);
        this.a = str;
        this.b = uri;
        this.c = i2;
        this.d = a09;
        this.e = bitmap;
        this.f = wrappedGradient;
        this.g = list;
        this.h = yz8;
        this.i = yz82;
    }

    public final int a() {
        return this.c;
    }

    public final Bitmap b() {
        return this.e;
    }

    public final a09 c() {
        return this.d;
    }

    public final Uri d() {
        return this.b;
    }

    public final List<a> e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.a, bVar.a) && h.a(this.b, bVar.b) && this.c == bVar.c && h.a(this.d, bVar.d) && h.a(this.e, bVar.e) && h.a(this.f, bVar.f) && h.a(this.g, bVar.g) && h.a(this.h, bVar.h) && h.a(this.i, bVar.i);
    }

    public final String f() {
        return this.a;
    }

    public final yz8 g() {
        return this.i;
    }

    public final yz8 h() {
        return this.h;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Uri uri = this.b;
        int hashCode2 = (((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.c) * 31;
        a09 a09 = this.d;
        int hashCode3 = (hashCode2 + (a09 != null ? a09.hashCode() : 0)) * 31;
        Bitmap bitmap = this.e;
        int hashCode4 = (hashCode3 + (bitmap != null ? bitmap.hashCode() : 0)) * 31;
        WrappedGradient wrappedGradient = this.f;
        int hashCode5 = (hashCode4 + (wrappedGradient != null ? wrappedGradient.hashCode() : 0)) * 31;
        List<a> list = this.g;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        yz8 yz8 = this.h;
        int hashCode7 = (hashCode6 + (yz8 != null ? yz8.hashCode() : 0)) * 31;
        yz8 yz82 = this.i;
        if (yz82 != null) {
            i2 = yz82.hashCode();
        }
        return hashCode7 + i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("StoryOfYourSongData(storyId=");
        V0.append(this.a);
        V0.append(", previewUri=");
        V0.append(this.b);
        V0.append(", backgroundColor=");
        V0.append(this.c);
        V0.append(", intro=");
        V0.append(this.d);
        V0.append(", image=");
        V0.append(this.e);
        V0.append(", backgroundGradient=");
        V0.append(this.f);
        V0.append(", statistics=");
        V0.append(this.g);
        V0.append(", title=");
        V0.append(this.h);
        V0.append(", subtitle=");
        V0.append(this.i);
        V0.append(")");
        return V0.toString();
    }
}
