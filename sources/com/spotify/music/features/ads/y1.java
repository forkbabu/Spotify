package com.spotify.music.features.ads;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.rules.AdRules;

public class y1 implements xs2 {
    private final AdRules a;
    private final pt3 b;
    private boolean c;

    public y1(AdRules adRules, pt3 pt3) {
        this.a = adRules;
        this.b = pt3;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0026: APUT  (r0v2 java.lang.Object[]), (1 ??[boolean, int, float, short, byte, char]), (r5v1 java.lang.String) */
    @Override // defpackage.xs2
    public void a(Fragment fragment, String str) {
        if (this.c) {
            pt3 pt3 = this.b;
            pt3.getClass();
            boolean z = !TextUtils.isEmpty(str) && pt3.e(str) != null;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = z ? "is" : "is not";
            Logger.b("Context %s %s sponsored", objArr);
            this.a.c(AdRules.StateType.PLAYING_FROM_SPONSORED_CONTEXT, z);
        }
    }

    public void b(boolean z) {
        this.c = z;
    }
}
