package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.spotify.music.C0707R;

public class q {
    private final Resources a;
    private final String b;

    public q(@RecentlyNonNull Context context) {
        if (context != null) {
            Resources resources = context.getResources();
            this.a = resources;
            this.b = resources.getResourcePackageName(C0707R.string.common_google_play_services_unknown_issue);
            return;
        }
        throw new NullPointerException("null reference");
    }

    @RecentlyNullable
    public String a(@RecentlyNonNull String str) {
        int identifier = this.a.getIdentifier(str, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
