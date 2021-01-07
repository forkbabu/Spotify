package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class s {
    private final SharedPreferences a;
    private final String b;
    private final String c;
    private final ArrayDeque<String> d = new ArrayDeque<>();
    private final Executor e;

    private s(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
        this.e = executor;
    }

    static s b(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        s sVar = new s(sharedPreferences, str, str2, executor);
        synchronized (sVar.d) {
            sVar.d.clear();
            String string = sVar.a.getString(sVar.b, "");
            if (!TextUtils.isEmpty(string)) {
                if (string.contains(sVar.c)) {
                    String[] split = string.split(sVar.c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str3 : split) {
                        if (!TextUtils.isEmpty(str3)) {
                            sVar.d.add(str3);
                        }
                    }
                }
            }
        }
        return sVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        synchronized (this.d) {
            SharedPreferences.Editor edit = this.a.edit();
            String str = this.b;
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = this.d.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(this.c);
            }
            edit.putString(str, sb.toString()).commit();
        }
    }

    public final String c() {
        String peek;
        synchronized (this.d) {
            peek = this.d.peek();
        }
        return peek;
    }

    public final boolean d(Object obj) {
        boolean remove;
        synchronized (this.d) {
            remove = this.d.remove(obj);
            if (remove) {
                this.e.execute(new r(this));
            }
        }
        return remove;
    }
}
