package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.j1;
import com.google.android.gms.common.internal.q;
import com.spotify.music.C0707R;

@Deprecated
public final class h {
    private static final Object d = new Object();
    private static h e;
    private final String a;
    private final Status b;
    private final boolean c;

    h(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C0707R.string.common_google_play_services_unknown_issue));
        boolean z = false;
        if (identifier != 0) {
            this.c = !(resources.getInteger(identifier) != 0 ? true : z);
        } else {
            this.c = false;
        }
        String a2 = j1.a(context);
        a2 = a2 == null ? new q(context).a("google_app_id") : a2;
        if (TextUtils.isEmpty(a2)) {
            this.b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.a = null;
            return;
        }
        this.a = a2;
        this.b = Status.o;
    }

    private static h a(String str) {
        h hVar;
        synchronized (d) {
            hVar = e;
            if (hVar == null) {
                StringBuilder sb = new StringBuilder(str.length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return hVar;
    }

    @RecentlyNullable
    public static String b() {
        return a("getGoogleAppId").a;
    }

    @RecentlyNonNull
    public static Status c(@RecentlyNonNull Context context) {
        Status status;
        g.k(context, "Context must not be null.");
        synchronized (d) {
            if (e == null) {
                e = new h(context);
            }
            status = e.b;
        }
        return status;
    }

    public static boolean d() {
        return a("isMeasurementExplicitlyDisabled").c;
    }
}
