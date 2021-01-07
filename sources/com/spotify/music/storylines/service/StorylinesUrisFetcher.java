package com.spotify.music.storylines.service;

import android.content.Intent;
import androidx.core.app.s;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.a;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public class StorylinesUrisFetcher extends s {
    public static final /* synthetic */ int w = 0;
    ajd q;
    sjd r;
    v s;
    fjd t;
    y u;
    ColdStartTracker v;

    @Override // androidx.core.app.f
    public void d(Intent intent) {
        this.v.o(getClass().getSimpleName());
        Logger.g("Running StorylinesFetcher.", new Object[0]);
        try {
            f().i();
        } catch (Exception e) {
            Assertion.i("A crash happened while fetching for Storylines resources", e);
        }
    }

    public a f() {
        return this.r.b().o(new e(this)).m(new f(this)).E(j.a).t(new c(this)).J(35, TimeUnit.SECONDS, this.u);
    }

    @Override // androidx.core.app.s, androidx.core.app.f, android.app.Service
    public void onCreate() {
        dagger.android.a.b(this);
        super.onCreate();
    }
}
