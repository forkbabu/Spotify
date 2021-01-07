package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: t8b  reason: default package */
public class t8b {
    private final String a;

    public t8b(String str) {
        this.a = str;
    }

    public Intent a(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context, this.a);
        intent.putExtra("trackUri", str);
        return intent;
    }
}
