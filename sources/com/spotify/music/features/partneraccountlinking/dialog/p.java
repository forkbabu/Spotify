package com.spotify.music.features.partneraccountlinking.dialog;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;

public class p {
    static final SpSharedPreferences.b<Object, Long> d = SpSharedPreferences.b.e("account_linking_dialog_time_first_shown");
    static final SpSharedPreferences.b<Object, Integer> e = SpSharedPreferences.b.e("account_linking_dialog_times_shown");
    static final SpSharedPreferences.b<Object, Boolean> f = SpSharedPreferences.b.e("account_linking_not_linked");
    private final i a;
    private final Context b;
    private Optional<SpSharedPreferences<Object>> c = Optional.absent();

    p(i iVar, Context context) {
        this.a = iVar;
        this.b = context;
    }

    /* access modifiers changed from: package-private */
    public long a() {
        if (this.c.isPresent()) {
            return this.c.get().j(d, 0);
        }
        throw new RuntimeException("setup needs to be called first");
    }

    /* access modifiers changed from: package-private */
    public int b() {
        if (this.c.isPresent()) {
            return this.c.get().f(e, 0);
        }
        throw new RuntimeException("setup needs to be called first");
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        if (this.c.isPresent()) {
            return this.c.get().d(f, true);
        }
        throw new RuntimeException("setup needs to be called first");
    }

    /* access modifiers changed from: package-private */
    public void d(boolean z) {
        if (this.c.isPresent()) {
            SpSharedPreferences.a<Object> b2 = this.c.get().b();
            b2.a(f, z);
            b2.i();
            return;
        }
        throw new RuntimeException("setup needs to be called first");
    }

    /* access modifiers changed from: package-private */
    public void e(long j) {
        if (this.c.isPresent()) {
            SpSharedPreferences.a<Object> b2 = this.c.get().b();
            b2.e(d, j);
            b2.i();
            return;
        }
        throw new RuntimeException("setup needs to be called first");
    }

    /* access modifiers changed from: package-private */
    public void f(int i) {
        if (this.c.isPresent()) {
            SpSharedPreferences.a<Object> b2 = this.c.get().b();
            b2.b(e, i);
            b2.i();
            return;
        }
        throw new RuntimeException("setup needs to be called first");
    }

    public String g(String str) {
        this.c = Optional.of(this.a.b(this.b, str));
        return str;
    }
}
