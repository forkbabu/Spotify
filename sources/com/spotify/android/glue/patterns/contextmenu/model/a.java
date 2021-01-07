package com.spotify.android.glue.patterns.contextmenu.model;

import android.net.Uri;
import com.spotify.android.paste.graphics.SpotifyIconV2;

public class a {
    private String a;
    private String b;
    private String c;
    private String d;
    private Uri e;
    private SpotifyIconV2 f;
    private boolean g;
    private int h;

    public a() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = Uri.EMPTY;
        this.f = null;
        this.g = false;
        this.h = -1;
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    public Uri c() {
        return this.e;
    }

    public SpotifyIconV2 d() {
        return this.f;
    }

    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.g == aVar.g && this.h == aVar.h && this.e.equals(aVar.e) && this.f == aVar.f && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.a.equals(aVar.a);
    }

    public String f() {
        return this.a;
    }

    public boolean g() {
        return this.g;
    }

    public void h(String str) {
        this.c = str;
    }

    public int hashCode() {
        int hashCode = (this.e.hashCode() + je.Y0(this.d, je.Y0(this.c, je.Y0(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31;
        SpotifyIconV2 spotifyIconV2 = this.f;
        return ((((hashCode + (spotifyIconV2 != null ? spotifyIconV2.hashCode() : 0)) * 31) + (this.g ? 1 : 0)) * 31) + this.h;
    }

    public void i(String str) {
        this.d = str;
    }

    public void j(Uri uri) {
        this.e = uri;
    }

    public void k(boolean z) {
        this.g = z;
    }

    public void l(SpotifyIconV2 spotifyIconV2) {
        this.f = spotifyIconV2;
    }

    public void m(String str) {
        this.b = str;
    }

    public void n(String str) {
        this.a = str;
    }

    public void o(int i) {
        this.h = i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContextMenuHeader{mTitle='");
        je.A(V0, this.a, '\'', ", mSubtitle='");
        je.A(V0, this.b, '\'', ", mDescription='");
        je.A(V0, this.c, '\'', ", mDescriptionHeader='");
        je.A(V0, this.d, '\'', ", mHeaderImageUri='");
        V0.append(this.e);
        V0.append('\'');
        V0.append(", mPlaceholderIcon=");
        Object obj = this.f;
        if (obj == null) {
            obj = "null";
        }
        V0.append(obj);
        V0.append(", mIsIconRounded=");
        V0.append(this.g);
        V0.append(", mTitleMaxLines=");
        return je.A0(V0, this.h, '}');
    }

    public a(String str, String str2, Uri uri, SpotifyIconV2 spotifyIconV2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = "";
        this.d = "";
        this.e = uri;
        this.f = spotifyIconV2;
        this.g = z;
        this.h = -1;
    }
}
