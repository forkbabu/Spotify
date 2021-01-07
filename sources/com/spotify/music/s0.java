package com.spotify.music;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Looper;
import com.spotify.music.navigation.b;

public class s0 implements b {
    private final Activity a;

    public interface a {
        void b(Intent intent);
    }

    public s0(Activity activity) {
        this.a = activity;
    }

    @Override // com.spotify.music.navigation.b
    public void a(Intent intent, Bundle bundle) {
        if (this.a instanceof a) {
            boolean z = false;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ResolveInfo resolveActivity = this.a.getPackageManager().resolveActivity(intent, 65536);
                if (resolveActivity != null) {
                    ActivityInfo activityInfo = resolveActivity.activityInfo;
                    z = this.a.getComponentName().equals(new ComponentName(activityInfo.packageName, activityInfo.name));
                }
                if (z) {
                    ((a) this.a).b(intent);
                    return;
                }
            }
        }
        this.a.startActivity(intent, bundle);
    }

    @Override // com.spotify.music.navigation.b
    public /* synthetic */ void b(Intent intent) {
        com.spotify.music.navigation.a.a(this, intent);
    }
}
