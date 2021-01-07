package com.spotify.voice.api;

import com.spotify.audiorecord.api.AudioRecordingType;
import com.spotify.audiorecord.api.e;
import com.spotify.http.wg.WebgateTokenProvider;
import com.spotify.mobile.android.util.connectivity.y;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.json.g;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.lb;
import com.spotify.voice.api.model.l;
import com.spotify.voice.api.qualifiers.VoiceConsumer;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;

public final class p implements fjf<n> {
    private final wlf<l> a;
    private final wlf<Map<AudioRecordingType, e>> b;
    private final wlf<pre> c;
    private final wlf<mte> d;
    private final wlf<g> e;
    private final wlf<io.reactivex.g<PlayerState>> f;
    private final wlf<s<com.spotify.music.connection.g>> g;
    private final wlf<y> h;
    private final wlf<sg0<ng0, Boolean>> i;
    private final wlf<z<Boolean>> j;
    private final wlf<WebgateTokenProvider> k;
    private final wlf<lb> l;
    private final wlf<SpSharedPreferences<Object>> m;
    private final wlf<cqe> n;

    public p(wlf<l> wlf, wlf<Map<AudioRecordingType, e>> wlf2, wlf<pre> wlf3, wlf<mte> wlf4, wlf<g> wlf5, wlf<io.reactivex.g<PlayerState>> wlf6, wlf<s<com.spotify.music.connection.g>> wlf7, wlf<y> wlf8, wlf<sg0<ng0, Boolean>> wlf9, wlf<z<Boolean>> wlf10, wlf<WebgateTokenProvider> wlf11, wlf<lb> wlf12, wlf<SpSharedPreferences<Object>> wlf13, wlf<cqe> wlf14) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
        this.l = wlf12;
        this.m = wlf13;
        this.n = wlf14;
    }

    public static p a(wlf<l> wlf, wlf<Map<AudioRecordingType, e>> wlf2, wlf<pre> wlf3, wlf<mte> wlf4, wlf<g> wlf5, wlf<io.reactivex.g<PlayerState>> wlf6, wlf<s<com.spotify.music.connection.g>> wlf7, wlf<y> wlf8, wlf<sg0<ng0, Boolean>> wlf9, wlf<z<Boolean>> wlf10, wlf<WebgateTokenProvider> wlf11, wlf<lb> wlf12, wlf<SpSharedPreferences<Object>> wlf13, wlf<cqe> wlf14) {
        return new p(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10, wlf11, wlf12, wlf13, wlf14);
    }

    public static n b(l lVar, Map<AudioRecordingType, e> map, pre pre, mte mte, g gVar, io.reactivex.g<PlayerState> gVar2, s<com.spotify.music.connection.g> sVar, y yVar, sg0<ng0, Boolean> sg0, z<Boolean> zVar, WebgateTokenProvider webgateTokenProvider, lb lbVar, SpSharedPreferences<Object> spSharedPreferences, cqe cqe) {
        e eVar;
        if (!map.isEmpty()) {
            if (lVar.b() == VoiceConsumer.SUPERBIRD) {
                eVar = map.get(AudioRecordingType.EXTERNAL);
            } else {
                eVar = map.get(AudioRecordingType.MICROPHONE);
            }
            if (eVar == null) {
                throw new IllegalArgumentException("Didn't find an AudioRecording.");
            } else if (lbVar.a()) {
                return i.a;
            } else {
                cqe.getClass();
                pre.getClass();
                mte.getClass();
                gVar.getClass();
                gVar2.getClass();
                sVar.getClass();
                yVar.getClass();
                sg0.getClass();
                zVar.getClass();
                webgateTokenProvider.getClass();
                spSharedPreferences.getClass();
                return new k(eVar, lVar, mte, webgateTokenProvider, cqe, pre, gVar, gVar2, sVar, yVar, sg0, zVar, spSharedPreferences, lbVar, null).a();
            }
        } else {
            throw new IllegalArgumentException("Map<String, AudioRecording> cannot be empty!");
        }
    }

    @Override // defpackage.wlf
    public Object get() {
        return b(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get(), this.n.get());
    }
}
