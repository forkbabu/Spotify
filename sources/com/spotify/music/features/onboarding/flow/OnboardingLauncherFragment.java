package com.spotify.music.features.onboarding.flow;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.c;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.navigation.d;
import com.spotify.rxjava2.p;
import dagger.android.support.DaggerFragment;
import io.reactivex.b0;
import io.reactivex.disposables.b;
import kotlin.jvm.internal.h;

public final class OnboardingLauncherFragment extends DaggerFragment {
    private final p h0 = new p();
    private boolean i0;
    public OnboardingLauncherResolver j0;
    public d k0;
    public String l0;
    public String m0;
    public String n0;

    public static final class a implements b0<OnboardingDestination> {
        final /* synthetic */ OnboardingLauncherFragment a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(OnboardingLauncherFragment onboardingLauncherFragment) {
            this.a = onboardingLauncherFragment;
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            h.e(th, "e");
            d dVar = this.a.k0;
            if (dVar != null) {
                dVar.b(Destination.d.a);
            }
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            h.e(bVar, "d");
            this.a.h0.b(bVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.b0
        public void onSuccess(OnboardingDestination onboardingDestination) {
            OnboardingDestination onboardingDestination2 = onboardingDestination;
            h.e(onboardingDestination2, "onboardingDestination");
            OnboardingLauncherFragment.L4(this.a, onboardingDestination2);
        }
    }

    public static final void L4(OnboardingLauncherFragment onboardingLauncherFragment, OnboardingDestination onboardingDestination) {
        d dVar;
        onboardingLauncherFragment.getClass();
        int ordinal = onboardingDestination.a().ordinal();
        String str = "";
        if (ordinal == 0) {
            Intent intent = new Intent();
            c j4 = onboardingLauncherFragment.j4();
            String str2 = onboardingLauncherFragment.n0;
            if (str2 != null) {
                str = str2;
            }
            intent.setClassName(j4, str);
            onboardingLauncherFragment.H4(intent, 1, null);
        } else if (ordinal == 1) {
            Intent intent2 = new Intent();
            c j42 = onboardingLauncherFragment.j4();
            String str3 = onboardingLauncherFragment.l0;
            if (str3 != null) {
                str = str3;
            }
            intent2.setClassName(j42, str);
            intent2.putExtra(onboardingLauncherFragment.m0, false);
            onboardingLauncherFragment.H4(intent2, 2, null);
        } else if (ordinal == 2 && (dVar = onboardingLauncherFragment.k0) != null) {
            dVar.b(Destination.d.a);
        }
    }

    private final void M4() {
        OnboardingLauncherResolver onboardingLauncherResolver = this.j0;
        if (onboardingLauncherResolver != null) {
            onboardingLauncherResolver.P4().B(io.reactivex.android.schedulers.a.b()).subscribe(new a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        h.e(bundle, "args");
        bundle.putBoolean("is_first_launch", this.i0);
    }

    @Override // androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        d dVar;
        if (i == 1) {
            M4();
        } else if (i == 2 && (dVar = this.k0) != null) {
            dVar.b(Destination.d.a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (bundle != null) {
            this.i0 = bundle.getBoolean("is_first_launch", false);
        }
        if (!this.i0) {
            if (k4().getBoolean("ARG_LANGUAGE_ONBOARDING")) {
                OnboardingLauncherResolver onboardingLauncherResolver = this.j0;
                if (onboardingLauncherResolver != null) {
                    onboardingLauncherResolver.O4().subscribe(new a(this));
                }
            } else {
                M4();
            }
            this.i0 = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void x3() {
        super.x3();
        this.h0.a();
    }
}
