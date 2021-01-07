package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: a01  reason: default package */
public class a01 implements zz0 {
    private final Context a;

    public a01(Context context) {
        this.a = context;
    }

    @Override // defpackage.zz0
    public boolean a(String str) {
        return Arrays.binarySearch(this.a.getResources().getStringArray(C0707R.array.password_blacklist), str.toLowerCase(Locale.ENGLISH)) >= 0;
    }
}
