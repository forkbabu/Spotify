package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.libs.onboarding.allboarding.AllBoardingActivity;
import com.spotify.libs.onboarding.allboarding.EntryPoint;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.messages.AllboardingAssignment;
import com.spotify.music.features.onboarding.flow.OnboardingLauncherFragment;
import com.spotify.remoteconfig.AndroidFeatureAllboardingProperties;
import kotlin.jvm.internal.h;

/* renamed from: rb1  reason: default package */
final class rb1 implements z01<Destination.f> {
    final /* synthetic */ wlf a;
    final /* synthetic */ gl0 b;

    rb1(wlf wlf, gl0 gl0) {
        this.a = wlf;
        this.b = gl0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.loginflow.navigation.Destination, android.app.Activity] */
    @Override // defpackage.z01
    public Object b(Destination.f fVar, Activity activity) {
        OnboardingLauncherFragment onboardingLauncherFragment;
        Destination.f fVar2 = fVar;
        AndroidFeatureAllboardingProperties.EnableAllboarding a2 = ((AndroidFeatureAllboardingProperties) this.a.get()).a();
        gl0 gl0 = this.b;
        AllboardingAssignment.b i = AllboardingAssignment.i();
        i.m(a2.value());
        gl0.c(i.build());
        if (a2 == AndroidFeatureAllboardingProperties.EnableAllboarding.ENABLED) {
            EntryPoint entryPoint = EntryPoint.a;
            AllBoardingActivity.a aVar = AllBoardingActivity.C;
            h.e(activity, "context");
            h.e(entryPoint, "entryPoint");
            Intent intent = new Intent(activity, AllBoardingActivity.class);
            intent.putExtra("entry-point", 0);
            return intent;
        }
        if (a2 == AndroidFeatureAllboardingProperties.EnableAllboarding.DISABLED) {
            boolean a3 = fVar2.a();
            onboardingLauncherFragment = new OnboardingLauncherFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("ARG_LANGUAGE_ONBOARDING", a3);
            onboardingLauncherFragment.r4(bundle);
        } else {
            boolean a4 = fVar2.a();
            onboardingLauncherFragment = new OnboardingLauncherFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("ARG_LANGUAGE_ONBOARDING", a4);
            onboardingLauncherFragment.r4(bundle2);
        }
        return onboardingLauncherFragment;
    }

    @Override // defpackage.z01
    public boolean c() {
        return true;
    }
}
