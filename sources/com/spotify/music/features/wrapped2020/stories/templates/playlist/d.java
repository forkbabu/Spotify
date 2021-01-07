package com.spotify.music.features.wrapped2020.stories.templates.playlist;

import android.graphics.Bitmap;
import android.net.Uri;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import kotlin.jvm.internal.h;

public final class d {
    private final String a;
    private final Uri b;
    private final int c;
    private final int d;
    private final Bitmap e;
    private final WrappedGradient f;
    private final String g;
    private final String h;
    private final int i;
    private final String j;
    private final String k;
    private final String l;

    public d(String str, Uri uri, int i2, int i3, Bitmap bitmap, WrappedGradient wrappedGradient, String str2, String str3, int i4, String str4, String str5, String str6) {
        h.e(str, "storyId");
        h.e(uri, "previewUri");
        h.e(bitmap, "playlistArt");
        h.e(wrappedGradient, "gradient");
        h.e(str2, "header");
        h.e(str3, "body");
        h.e(str4, "addPlaylistPrompt");
        h.e(str5, "playlistExistsPrompt");
        h.e(str6, "playlistUri");
        this.a = str;
        this.b = uri;
        this.c = i2;
        this.d = i3;
        this.e = bitmap;
        this.f = wrappedGradient;
        this.g = str2;
        this.h = str3;
        this.i = i4;
        this.j = str4;
        this.k = str5;
        this.l = str6;
    }

    public final String a() {
        return this.j;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.h;
    }

    public final WrappedGradient e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.a(this.a, dVar.a) && h.a(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d && h.a(this.e, dVar.e) && h.a(this.f, dVar.f) && h.a(this.g, dVar.g) && h.a(this.h, dVar.h) && this.i == dVar.i && h.a(this.j, dVar.j) && h.a(this.k, dVar.k) && h.a(this.l, dVar.l);
    }

    public final String f() {
        return this.g;
    }

    public final Bitmap g() {
        return this.e;
    }

    public final String h() {
        return this.k;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Uri uri = this.b;
        int hashCode2 = (((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 31;
        Bitmap bitmap = this.e;
        int hashCode3 = (hashCode2 + (bitmap != null ? bitmap.hashCode() : 0)) * 31;
        WrappedGradient wrappedGradient = this.f;
        int hashCode4 = (hashCode3 + (wrappedGradient != null ? wrappedGradient.hashCode() : 0)) * 31;
        String str2 = this.g;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.h;
        int hashCode6 = (((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.i) * 31;
        String str4 = this.j;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.k;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.l;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String i() {
        return this.l;
    }

    public final Uri j() {
        return this.b;
    }

    public final String k() {
        return this.a;
    }

    public final int l() {
        return this.i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaylistStoryData(storyId=");
        V0.append(this.a);
        V0.append(", previewUri=");
        V0.append(this.b);
        V0.append(", backgroundColor=");
        V0.append(this.c);
        V0.append(", backgroundColorInitial=");
        V0.append(this.d);
        V0.append(", playlistArt=");
        V0.append(this.e);
        V0.append(", gradient=");
        V0.append(this.f);
        V0.append(", header=");
        V0.append(this.g);
        V0.append(", body=");
        V0.append(this.h);
        V0.append(", textColor=");
        V0.append(this.i);
        V0.append(", addPlaylistPrompt=");
        V0.append(this.j);
        V0.append(", playlistExistsPrompt=");
        V0.append(this.k);
        V0.append(", playlistUri=");
        return je.I0(V0, this.l, ")");
    }
}
