package com.spotify.music.ads.voice;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.jakewharton.rxrelay2.b;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.music.ads.voice.domain.s;
import com.spotify.music.ads.voice.domain.u;
import com.spotify.music.ads.voice.domain.v;
import com.spotify.music.ads.voice.domain.w;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.remoteconfig.uc;
import com.spotify.rxjava2.p;
import java.util.Map;

public class f {
    private final wlf<MobiusLoop.h<v, s, r>> a;
    private final uc b;
    private MobiusLoop<v, s, r> c;
    private final b<Optional<MobiusLoop<v, s, r>>> d = b.h1(Optional.absent());
    private final p e = new p();
    private w92 f;
    private String g;

    public f(wlf<MobiusLoop.h<v, s, r>> wlf, uc ucVar) {
        this.a = wlf;
        this.b = ucVar;
    }

    public void a() {
        if (this.c != null) {
            Logger.b("[VoiceAd] finishVoiceAd", new Object[0]);
            this.c.dispose();
            this.c = null;
            this.d.accept(Optional.absent());
        }
        this.e.a();
    }

    public Map<String, String> b() {
        if (TextUtils.isEmpty(this.g)) {
            return ImmutableMap.of("asr", "cloudspeech");
        }
        return ImmutableMap.of("intent", this.g, "asr", "cloudspeech");
    }

    public /* synthetic */ void c(da2 da2, Optional optional) {
        this.f = ((MobiusLoop) optional.get()).j(da2);
        Logger.b("[VoiceAd] Mobius loop registered", new Object[0]);
    }

    public void d() {
        this.c.h(s.c());
    }

    public void e(da2<v> da2) {
        this.e.b(this.d.Q(b.a).subscribe(new c(this, da2), d.a));
    }

    public void f(Ad ad) {
        if (this.c == null) {
            Logger.b("[VoiceAd] startVoiceAd adType %s advertiser %s metadata %s", Integer.valueOf(ad.adType()), ad.advertiser(), ad.metadata());
            MobiusLoop.h<v, s, r> hVar = this.a.get();
            Boolean valueOf = Boolean.valueOf(this.b.a());
            String id = ad.id();
            String lineItemId = ad.lineItemId();
            String creativeId = ad.creativeId();
            String adPlaybackId = ad.adPlaybackId();
            String str = ad.metadata().get(Ad.METADATA_VOICE_MICROPHONE_DELAY);
            str.getClass();
            long parseLong = Long.parseLong(str);
            String str2 = ad.metadata().get(Ad.METADATA_VOICE_INTENT);
            String str3 = ad.metadata().get(Ad.METADATA_VOICE_ACTION_URI);
            long duration = ((ad.duration() * 1000) - parseLong) - 2000;
            long j = 8000;
            if (duration > 0) {
                j = Math.min(8000L, duration);
            }
            u d2 = u.d(id, lineItemId, creativeId, adPlaybackId, parseLong, str2, str3, j);
            v.a a2 = v.a();
            a2.g(w.a());
            a2.f(d2);
            a2.e(0);
            a2.b("");
            a2.d(false);
            a2.c(valueOf.booleanValue());
            this.c = hVar.g(a2.a());
            this.g = ad.metadata().get(Ad.METADATA_VOICE_INTENT);
            this.d.accept(Optional.fromNullable(this.c));
        }
    }

    public void g() {
        if (this.f != null) {
            Logger.b("[VoiceAd] Mobius loop unregistered", new Object[0]);
            this.f.dispose();
            this.f = null;
            this.e.a();
        }
    }
}
