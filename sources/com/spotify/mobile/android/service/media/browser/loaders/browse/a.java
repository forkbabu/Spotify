package com.spotify.mobile.android.service.media.browser.loaders.browse;

import android.net.Uri;
import com.spotify.image.provider.MediaUriUtil;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;

/* access modifiers changed from: package-private */
public final class a extends MediaBrowserItem {
    private final MediaBrowserItem.ActionType b;
    private final String c;
    private final String d;
    private final String e;
    private final Uri f;
    private final Uri g;
    private final Uri h;
    private final Uri i;
    private final Uri j;
    private final Uri k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final MediaUriUtil.Transformation o;
    private final MediaBrowserItem.CompletionState p;

    a(MediaBrowserItem.ActionType actionType, String str, String str2, String str3, Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5, Uri uri6, boolean z, boolean z2, boolean z3, MediaUriUtil.Transformation transformation, MediaBrowserItem.CompletionState completionState) {
        if (actionType != null) {
            this.b = actionType;
            if (str != null) {
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = uri;
                this.g = uri2;
                this.h = uri3;
                this.i = uri4;
                this.j = uri5;
                this.k = uri6;
                this.l = z;
                this.m = z2;
                this.n = z3;
                if (transformation != null) {
                    this.o = transformation;
                    if (completionState != null) {
                        this.p = completionState;
                        return;
                    }
                    throw new NullPointerException("Null completionState");
                }
                throw new NullPointerException("Null transformation");
            }
            throw new NullPointerException("Null identifier");
        }
        throw new NullPointerException("Null actionType");
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem
    public MediaBrowserItem.ActionType a() {
        return this.b;
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem
    public MediaBrowserItem.CompletionState b() {
        return this.p;
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem
    public Uri c() {
        return this.k;
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        Uri uri;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        Uri uri5;
        Uri uri6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaBrowserItem)) {
            return false;
        }
        MediaBrowserItem mediaBrowserItem = (MediaBrowserItem) obj;
        if (!this.b.equals(mediaBrowserItem.a()) || !this.c.equals(mediaBrowserItem.e()) || ((str = this.d) != null ? !str.equals(mediaBrowserItem.i()) : mediaBrowserItem.i() != null) || ((str2 = this.e) != null ? !str2.equals(mediaBrowserItem.l()) : mediaBrowserItem.l() != null) || ((uri = this.f) != null ? !uri.equals(mediaBrowserItem.f()) : mediaBrowserItem.f() != null) || ((uri2 = this.g) != null ? !uri2.equals(mediaBrowserItem.k()) : mediaBrowserItem.k() != null) || ((uri3 = this.h) != null ? !uri3.equals(mediaBrowserItem.j()) : mediaBrowserItem.j() != null) || ((uri4 = this.i) != null ? !uri4.equals(mediaBrowserItem.g()) : mediaBrowserItem.g() != null) || ((uri5 = this.j) != null ? !uri5.equals(mediaBrowserItem.h()) : mediaBrowserItem.h() != null) || ((uri6 = this.k) != null ? !uri6.equals(mediaBrowserItem.c()) : mediaBrowserItem.c() != null) || this.l != mediaBrowserItem.o() || this.m != mediaBrowserItem.p() || this.n != mediaBrowserItem.n() || !this.o.equals(mediaBrowserItem.m()) || !this.p.equals(mediaBrowserItem.b())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem
    public Uri f() {
        return this.f;
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem
    public Uri g() {
        return this.i;
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem
    public Uri h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = (((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Uri uri = this.f;
        int hashCode4 = (hashCode3 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        Uri uri2 = this.g;
        int hashCode5 = (hashCode4 ^ (uri2 == null ? 0 : uri2.hashCode())) * 1000003;
        Uri uri3 = this.h;
        int hashCode6 = (hashCode5 ^ (uri3 == null ? 0 : uri3.hashCode())) * 1000003;
        Uri uri4 = this.i;
        int hashCode7 = (hashCode6 ^ (uri4 == null ? 0 : uri4.hashCode())) * 1000003;
        Uri uri5 = this.j;
        int hashCode8 = (hashCode7 ^ (uri5 == null ? 0 : uri5.hashCode())) * 1000003;
        Uri uri6 = this.k;
        if (uri6 != null) {
            i2 = uri6.hashCode();
        }
        int i3 = (hashCode8 ^ i2) * 1000003;
        int i4 = 1231;
        int i5 = (((i3 ^ (this.l ? 1231 : 1237)) * 1000003) ^ (this.m ? 1231 : 1237)) * 1000003;
        if (!this.n) {
            i4 = 1237;
        }
        return ((((i5 ^ i4) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode();
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem
    public String i() {
        return this.d;
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem
    public Uri j() {
        return this.h;
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem
    public Uri k() {
        return this.g;
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem
    public String l() {
        return this.e;
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem
    public MediaUriUtil.Transformation m() {
        return this.o;
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem
    public boolean n() {
        return this.n;
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem
    public boolean o() {
        return this.l;
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem
    public boolean p() {
        return this.m;
    }

    public String toString() {
        StringBuilder V0 = je.V0("MediaBrowserItem{actionType=");
        V0.append(this.b);
        V0.append(", identifier=");
        V0.append(this.c);
        V0.append(", name=");
        V0.append(this.d);
        V0.append(", subtitle=");
        V0.append(this.e);
        V0.append(", imageUri=");
        V0.append(this.f);
        V0.append(", smallImageUri=");
        V0.append(this.g);
        V0.append(", normalImageUri=");
        V0.append(this.h);
        V0.append(", largeImageUri=");
        V0.append(this.i);
        V0.append(", mediaUri=");
        V0.append(this.j);
        V0.append(", contextShareUrl=");
        V0.append(this.k);
        V0.append(", availableOffline=");
        V0.append(this.l);
        V0.append(", explicitContent=");
        V0.append(this.m);
        V0.append(", 19plusContent=");
        V0.append(this.n);
        V0.append(", transformation=");
        V0.append(this.o);
        V0.append(", completionState=");
        V0.append(this.p);
        V0.append("}");
        return V0.toString();
    }
}
