package defpackage;

import android.content.Intent;
import defpackage.w60;

/* renamed from: w60  reason: default package */
public abstract class w60<T extends w60> extends x60<T> {
    public T e(String str) {
        d("intent");
        d("intentType");
        c("event", str);
        return this;
    }

    public T f(Intent intent) {
        if (intent != null) {
            d("event");
            c("intent", intent.toUri(1));
            return this;
        }
        throw new IllegalArgumentException("Intent is null");
    }
}
