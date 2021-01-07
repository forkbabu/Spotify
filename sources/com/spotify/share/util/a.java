package com.spotify.share.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.spotify.core.http.HttpConnection;
import java.util.ArrayList;
import java.util.List;

public class a {
    private final PackageManager a;
    private List<ActivityInfo> b;

    /* renamed from: com.spotify.share.util.a$a  reason: collision with other inner class name */
    public static class C0388a {
        private final ActivityInfo a;

        public C0388a(PackageManager packageManager, ActivityInfo activityInfo) {
            this.a = activityInfo;
        }

        public Intent a() {
            Intent intent = new Intent();
            intent.setPackage(this.a.packageName);
            return intent;
        }
    }

    public a(Context context) {
        this.a = context.getPackageManager();
    }

    public C0388a a(String str) {
        if (this.b == null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(HttpConnection.kDefaultContentType);
            List<ResolveInfo> queryIntentActivities = this.a.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    arrayList.add(activityInfo);
                }
            }
            this.b = arrayList;
        }
        for (ActivityInfo activityInfo2 : this.b) {
            if (activityInfo2.packageName.equals(str)) {
                return new C0388a(this.a, activityInfo2);
            }
        }
        return null;
    }
}
