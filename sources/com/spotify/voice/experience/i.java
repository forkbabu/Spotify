package com.spotify.voice.experience;

import android.widget.ImageView;
import com.google.common.base.Supplier;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobius.q;
import com.spotify.offline.OfflineUtilImpl;
import com.spotify.offline.b;
import com.spotify.remoteconfig.AndroidLibsVoiceProperties;
import com.spotify.voice.api.model.j;
import defpackage.bve;
import io.reactivex.functions.h;

public final class i implements fjf<VoiceFragmentLifecycleObserver> {
    public static void a(VoiceFragment voiceFragment, Supplier<Boolean> supplier) {
        voiceFragment.p0 = supplier;
    }

    public static void b(VoiceFragment voiceFragment, boolean z) {
        voiceFragment.q0 = z;
    }

    public static void c(VoiceFragment voiceFragment, n nVar) {
        voiceFragment.h0 = nVar;
    }

    public static void d(VoiceFragment voiceFragment, Object obj) {
        voiceFragment.m0 = (VoiceFragmentLifecycleObserver) obj;
    }

    public static void e(VoiceFragment voiceFragment, h<ImageView, String, String, ng0> hVar) {
        voiceFragment.l0 = hVar;
    }

    public static void f(VoiceFragment voiceFragment, v0f v0f) {
        voiceFragment.i0 = v0f;
    }

    public static void g(VoiceFragment voiceFragment, l1f l1f) {
        voiceFragment.n0 = l1f;
    }

    public static void h(VoiceFragment voiceFragment, q<vue> qVar) {
        voiceFragment.r0 = qVar;
    }

    public static void i(VoiceFragment voiceFragment, w0f w0f) {
        voiceFragment.j0 = w0f;
    }

    public static void j(VoiceFragment voiceFragment, y0f y0f) {
        voiceFragment.k0 = y0f;
    }

    public static void k(VoiceFragment voiceFragment, cif cif) {
        voiceFragment.o0 = cif;
    }

    public static VoiceFragmentLifecycleObserver l(t92 t92) {
        return new VoiceFragmentLifecycleObserver(t92);
    }

    public static j m(AndroidLibsVoiceProperties androidLibsVoiceProperties, SpSharedPreferences<Object> spSharedPreferences) {
        String a = q8b.a(spSharedPreferences, androidLibsVoiceProperties.m().value());
        j.a a2 = j.a();
        a2.b(a);
        a2.a("/v3/android/");
        return a2.build();
    }

    public static q<vue> n(b bVar) {
        return com.spotify.mobius.rx2.i.a(((OfflineUtilImpl) bVar).a().A(bze.a).A(zye.a).P());
    }

    public static bve o(AndroidLibsVoiceProperties androidLibsVoiceProperties) {
        bve.a a = bve.a();
        a.c(androidLibsVoiceProperties.h());
        a.b(androidLibsVoiceProperties.k());
        a.a(androidLibsVoiceProperties.l());
        return a.build();
    }
}
