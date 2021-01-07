package com.spotify.music.features.spoton;

import android.app.PendingIntent;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class o {
    private final Set<String> a = new HashSet(Arrays.asList("com.samsung.accessory.atticmgr", "com.samsung.accessory.popcornmgr", "com.samsung.accessory.fridaymgr", "com.samsung.accessory.neobeanmgr"));

    public boolean a(PendingIntent pendingIntent) {
        String str;
        if (pendingIntent == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT > 16) {
            str = pendingIntent.getCreatorPackage();
        } else {
            str = pendingIntent.getTargetPackage();
        }
        return this.a.contains(str);
    }
}
