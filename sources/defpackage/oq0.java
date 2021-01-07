package defpackage;

import android.net.Uri;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;

/* renamed from: oq0  reason: default package */
public class oq0 {
    private final nq0 a;

    public oq0(nq0 nq0) {
        this.a = nq0;
    }

    public Uri a(Uri uri, Uri uri2, Optional<String> optional) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null && uri2 == null) {
            return null;
        }
        boolean z = false;
        if (uri != null && this.a.f(uri.toString())) {
            String uri3 = uri.toString();
            Uri.Builder buildUpon = Uri.parse(this.a.a(uri3)).buildUpon();
            if (optional.isPresent()) {
                str4 = optional.get();
            } else {
                str4 = this.a.h();
            }
            buildUpon.appendQueryParameter("adjust_tracker", str4).appendQueryParameter("adjust_adgroup", MoreObjects.nullToEmpty(this.a.g(uri3))).appendQueryParameter("adjust_creative", MoreObjects.nullToEmpty(this.a.b(uri3))).appendQueryParameter("adjust_campaign", MoreObjects.nullToEmpty(this.a.e(uri3)));
            return buildUpon.build();
        } else if (uri2 == null) {
            return uri;
        } else {
            if (uri != null && !Uri.EMPTY.equals(uri) && !MoreObjects.isNullOrEmpty(this.a.a(uri.toString()))) {
                z = true;
            }
            if (z) {
                str = uri.toString();
            } else {
                str = this.a.d();
            }
            Uri.Builder buildUpon2 = Uri.parse(this.a.a(str)).buildUpon();
            if (optional.isPresent()) {
                str2 = optional.get();
            } else {
                str2 = this.a.c();
            }
            Uri.Builder appendQueryParameter = buildUpon2.appendQueryParameter("adjust_tracker", str2);
            if (!uri2.isHierarchical() || uri2.getAuthority() == null) {
                str3 = uri2.toString();
            } else {
                str3 = uri2.getAuthority();
            }
            appendQueryParameter.appendQueryParameter("adjust_campaign", str3);
            return buildUpon2.build();
        }
    }
}
