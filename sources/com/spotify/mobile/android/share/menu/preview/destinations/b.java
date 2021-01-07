package com.spotify.mobile.android.share.menu.preview.destinations;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.spotify.mobile.android.share.menu.preview.api.ShareCapability;
import com.spotify.mobile.android.share.menu.preview.api.a;
import com.spotify.mobile.android.share.menu.preview.api.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class b {
    private final Activity a;
    private final r2e b;
    private final u2e c;
    private final Resources d;
    private final c e;

    public b(Activity activity, r2e r2e, u2e u2e, Resources resources, c cVar) {
        h.e(activity, "activity");
        h.e(r2e, "shareDestinationProvider");
        h.e(u2e, "shareService");
        h.e(resources, "resources");
        h.e(cVar, "shareUriProvider");
        this.a = activity;
        this.b = r2e;
        this.c = u2e;
        this.d = resources;
        this.e = cVar;
    }

    private final String g(o8e o8e) {
        return String.valueOf(o8e.id());
    }

    public final Set<Pair<String, rmf<a, c, com.spotify.mobile.android.share.menu.preview.api.h>>> d() {
        List<o8e> a2 = this.b.a();
        h.d(a2, "shareDestinationProvider…rovideShareDestinations()");
        ArrayList arrayList = new ArrayList(d.e(a2, 10));
        for (T t : a2) {
            h.d(t, "it");
            arrayList.add(new Pair(g(t), new ShareFlowShareDestinations$shareAction$1(this, t)));
        }
        return d.Z(arrayList);
    }

    public final Set<a> e() {
        ShareCapability shareCapability;
        List<o8e> a2 = this.b.a();
        h.d(a2, "shareDestinationProvider…rovideShareDestinations()");
        ArrayList arrayList = new ArrayList(d.e(a2, 10));
        for (T t : a2) {
            h.d(t, "it");
            String g = g(t);
            ShareCapability shareCapability2 = ShareCapability.Story;
            List<com.spotify.share.sharedata.ShareCapability> b2 = t.b();
            h.d(b2, "this.shareCapabilities()");
            ArrayList arrayList2 = new ArrayList(d.e(b2, 10));
            for (T t2 : b2) {
                if (t2 != null) {
                    int ordinal = t2.ordinal();
                    if (ordinal == 0) {
                        shareCapability = ShareCapability.Link;
                    } else if (ordinal == 1) {
                        shareCapability = ShareCapability.Message;
                    } else if (ordinal == 2) {
                        shareCapability = ShareCapability.Image;
                    } else if (ordinal == 3 || ordinal == 4 || ordinal == 5) {
                        shareCapability = shareCapability2;
                    }
                    arrayList2.add(shareCapability);
                }
                throw new IllegalStateException(("unknown capability " + ((Object) t2)).toString());
            }
            arrayList.add(new a(g, d.Z(arrayList2)));
        }
        return d.Z(arrayList);
    }

    public final Set<Pair<String, com.spotify.mobile.android.share.menu.preview.api.b>> f() {
        List<o8e> a2 = this.b.a();
        h.d(a2, "shareDestinationProvider…rovideShareDestinations()");
        ArrayList arrayList = new ArrayList(d.e(a2, 10));
        for (T t : a2) {
            h.d(t, "it");
            String g = g(t);
            Drawable icon = t.icon();
            h.d(icon, "it.icon()");
            String string = this.d.getString(t.c());
            h.d(string, "resources.getString(it.titleResId())");
            arrayList.add(new Pair(g, new com.spotify.mobile.android.share.menu.preview.api.b(icon, string)));
        }
        return d.Z(arrayList);
    }
}
