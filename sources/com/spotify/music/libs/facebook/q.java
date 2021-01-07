package com.spotify.music.libs.facebook;

import android.app.Application;
import android.content.Intent;
import com.facebook.applinks.a;
import com.facebook.k;
import com.facebook.login.o;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.Assertion;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class q {
    public static final ImmutableList<String> c = ImmutableList.of("public_profile");
    public static final ImmutableList<String> d = ImmutableList.of("public_profile", "email", "user_birthday", "user_friends", "user_gender");
    private final CountDownLatch a;
    private final k.AbstractC0072k b;

    q() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.a = countDownLatch;
        this.b = new n(countDownLatch);
    }

    public o a() {
        try {
            if (!this.a.await(10, TimeUnit.SECONDS)) {
                Assertion.g("Facebook SDK failed to initialize after 10s.");
            }
        } catch (InterruptedException unused) {
        }
        return o.b();
    }

    public boolean b(Intent intent) {
        try {
            return a.a(intent) != null;
        } catch (Exception unused) {
            Assertion.h("AppLinkData.createFromAlApplinkData crashes for: $", intent.toString());
            return false;
        }
    }

    public void c(Application application) {
        k.A(application.getApplicationContext(), this.b);
    }
}
