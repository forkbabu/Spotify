package com.spotify.mobile.android.service.media.browser.loaders.browse;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.image.provider.MediaUriUtil;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;

public class b {
    private MediaBrowserItem.ActionType a;
    private final String b;
    private String c;
    private String d;
    private Uri e;
    private Uri f;
    private Uri g;
    private Uri h;
    private Uri i;
    private Uri j;
    private boolean k;
    private boolean l;
    private boolean m;
    private Bundle n;
    private MediaUriUtil.Transformation o;
    private MediaBrowserItem.CompletionState p;

    public b(String str) {
        this.a = MediaBrowserItem.ActionType.NONE;
        Uri uri = Uri.EMPTY;
        this.e = uri;
        this.f = uri;
        this.g = uri;
        this.h = uri;
        this.o = MediaUriUtil.Transformation.NONE;
        this.p = MediaBrowserItem.CompletionState.NONE;
        str.getClass();
        this.b = str;
    }

    private Bundle b() {
        if (this.n == null) {
            this.n = new Bundle();
        }
        return this.n;
    }

    public MediaBrowserItem a() {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        Uri uri = this.e;
        Uri uri2 = this.f;
        Uri uri3 = this.g;
        Uri uri4 = this.h;
        Uri uri5 = this.i;
        Uri uri6 = this.j;
        MediaBrowserItem.ActionType actionType = this.a;
        boolean z = this.k;
        boolean z2 = this.l;
        boolean z3 = this.m;
        Bundle b2 = b();
        a aVar = new a(actionType, str, str2, str3, uri, uri2, uri3, uri4, uri5, uri6, z, z2, z3, this.o, this.p);
        aVar.a = b2;
        return aVar;
    }

    public b c(MediaBrowserItem.ActionType actionType) {
        this.a = actionType;
        return this;
    }

    public b d(boolean z) {
        this.k = z;
        return this;
    }

    public b e(MediaBrowserItem.CompletionState completionState) {
        this.p = completionState;
        return this;
    }

    public b f(Uri uri) {
        this.j = uri;
        return this;
    }

    public b g(String str) {
        b().putString("com.spotify.music.extra.CONTEXT_URI", str);
        return this;
    }

    public b h(boolean z) {
        this.l = z;
        return this;
    }

    public b i(Bundle bundle) {
        if (bundle != null) {
            b().putAll(bundle);
        }
        return this;
    }

    public b j(Uri uri) {
        this.e = uri;
        return this;
    }

    public b k(boolean z) {
        this.m = z;
        return this;
    }

    public b l(Uri uri) {
        this.h = uri;
        return this;
    }

    public b m(Uri uri) {
        this.i = uri;
        return this;
    }

    public b n(Uri uri) {
        this.g = uri;
        return this;
    }

    public b o(boolean z) {
        b().putBoolean("com.spotify.music.extra.SHUFFLE", z);
        return this;
    }

    public b p(Uri uri) {
        this.f = uri;
        return this;
    }

    public b q(String str) {
        this.d = str;
        return this;
    }

    public b r(String str) {
        this.c = str;
        return this;
    }

    public b s(MediaUriUtil.Transformation transformation) {
        this.o = transformation;
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(Uri uri) {
        this(String.valueOf(uri));
        uri.getClass();
    }
}
