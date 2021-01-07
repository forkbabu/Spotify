package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;

public class q {
    private Fragment a;
    private android.app.Fragment b;

    public q(Fragment fragment) {
        h0.f(fragment, "fragment");
        this.a = fragment;
    }

    public final Activity a() {
        Fragment fragment = this.a;
        if (fragment != null) {
            return fragment.B2();
        }
        return this.b.getActivity();
    }

    public android.app.Fragment b() {
        return this.b;
    }

    public Fragment c() {
        return this.a;
    }

    public void d(Intent intent, int i) {
        Fragment fragment = this.a;
        if (fragment != null) {
            fragment.H4(intent, i, null);
        } else {
            this.b.startActivityForResult(intent, i);
        }
    }

    public q(android.app.Fragment fragment) {
        h0.f(fragment, "fragment");
        this.b = fragment;
    }
}
