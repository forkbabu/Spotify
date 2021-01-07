package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.image.provider.MediaUriUtil;
import com.spotify.mediaitem.a;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.b;
import com.spotify.mobile.android.service.media.browser.loaders.browse.model.c;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.t;
import com.spotify.music.C0707R;

/* renamed from: rj1  reason: default package */
public final class rj1 {
    private final MediaUriUtil a;
    private final Context b;
    private final c4e c;

    public rj1(MediaUriUtil mediaUriUtil, Context context, c4e c4e) {
        this.a = mediaUriUtil;
        this.b = context;
        this.c = c4e;
    }

    public static MediaBrowserItem a(Context context, c cVar, Uri uri) {
        b bVar = new b(uri);
        bVar.r(cVar.b());
        bVar.c(MediaBrowserItem.ActionType.BROWSABLE);
        bVar.j(gf0.g(context, C0707R.drawable.ic_eis_browse));
        return bVar.a();
    }

    private String c(xj1 xj1, String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (TextUtils.isEmpty(xj1.e())) {
            return this.b.getString(C0707R.string.playlist_fallback_general_subtitle);
        }
        return this.b.getString(C0707R.string.playlist_fallback_subtitle, xj1.e());
    }

    public MediaBrowserItem b(xj1 xj1, String str, t tVar) {
        Uri uri;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        Uri uri5;
        l0 z = l0.z(xj1.getUri());
        LinkType q = z.q();
        String b2 = xj1.b();
        switch (q.ordinal()) {
            case 6:
            case 14:
            case 54:
            case 56:
            case 246:
                uri = Uri.parse(xj1.getUri());
                b2 = xj1.e();
                break;
            case 8:
            case 25:
            case 70:
            case 101:
            case 131:
            case 184:
            case 215:
            case 216:
            case 217:
            case 218:
            case 220:
            case 258:
            case 260:
            case 275:
            case 298:
                String d = agd.d(xj1.getUri());
                StringBuilder sb = new StringBuilder();
                StringBuilder V0 = je.V0("content://");
                V0.append(tVar.y());
                sb.append(Uri.parse(V0.toString()));
                sb.append("/radio/");
                sb.append(d);
                uri = Uri.parse(sb.toString());
                break;
            case 71:
            case 75:
                String B = l0.a(str).B();
                if (B == null) {
                    uri = Uri.EMPTY;
                    break;
                } else {
                    uri = Uri.parse(B);
                    break;
                }
            case 185:
                uri = Uri.parse(xj1.getUri());
                b2 = c(xj1, b2);
                break;
            case 210:
                uri = Uri.parse(l0.A(z.i()).B());
                b2 = c(xj1, b2);
                break;
            case 273:
                uri = Uri.parse(xj1.getUri());
                break;
            default:
                uri = Uri.EMPTY;
                break;
        }
        if (uri == Uri.EMPTY) {
            Assertion.g(String.format("Couldn't create a playable uri from the playlistUri = %s, linkType = %s", xj1.getUri(), q));
            return null;
        }
        if (xj1.c() != null) {
            uri2 = Uri.parse(xj1.c());
            MediaUriUtil mediaUriUtil = this.a;
            MediaUriUtil.Transformation transformation = MediaUriUtil.Transformation.NONE;
            uri5 = mediaUriUtil.b(uri2, transformation, MediaUriUtil.ImageDimension.SMALL);
            uri3 = this.a.b(uri2, transformation, MediaUriUtil.ImageDimension.NORMAL);
            uri4 = this.a.b(uri2, transformation, MediaUriUtil.ImageDimension.LARGE);
        } else {
            uri2 = Uri.EMPTY;
            uri5 = uri2;
            uri4 = uri5;
            uri3 = uri4;
        }
        a aVar = new a();
        aVar.i(xj1.a());
        Bundle b3 = aVar.b();
        b bVar = new b(uri);
        bVar.r(xj1.f());
        bVar.q(b2);
        bVar.j(uri2);
        bVar.p(uri5);
        bVar.n(uri3);
        bVar.l(uri4);
        bVar.m(uri);
        bVar.f(Uri.parse(this.c.a(uri.toString())));
        bVar.c(MediaBrowserItem.ActionType.PLAYABLE);
        bVar.i(b3);
        return bVar.a();
    }
}
