package com.spotify.music.spotlets.radio.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.StationEntitySession;
import com.spotify.music.spotlets.radio.service.RadioStateObserver;
import io.reactivex.functions.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class k0 {
    static final SpSharedPreferences.b<Object, String> l = SpSharedPreferences.b.e("radio-session-state-station");
    static final SpSharedPreferences.b<Object, String> m = SpSharedPreferences.b.e("radio-session-state-tracks");
    static final SpSharedPreferences.b<Object, String> n = SpSharedPreferences.b.e("radio-session-state-entity");
    private final List<RadioStateObserver> a = new CopyOnWriteArrayList();
    private final ObjectMapper b;
    private final io.reactivex.disposables.a c = new io.reactivex.disposables.a();
    private final RxPlayerState d;
    private final y e;
    private RadioStationsModel f = RadioStationsModel.create(new RadioStationModel[0], new RadioStationModel[0], new RadioStationModel[0], new RadioStationModel[0]);
    private final g<LegacyPlayerState> g = new a();
    private final j0 h;
    private final Map<String, n0> i = new HashMap();
    private final SpSharedPreferences<Object> j;
    private Map<String, StationEntitySession> k = new HashMap();

    class a implements g<LegacyPlayerState> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(LegacyPlayerState legacyPlayerState) {
            boolean z;
            LegacyPlayerState legacyPlayerState2 = legacyPlayerState;
            if (agd.i(legacyPlayerState2.entityUri())) {
                k0.a(k0.this, legacyPlayerState2);
            }
            PlayerTrack track = legacyPlayerState2.track();
            PlayerContextIndex index = legacyPlayerState2.index();
            boolean e = k0.this.h.e(legacyPlayerState2.entityUri(), track, (index == null || index.track() < 0) ? 0 : index.track());
            if (k0.this.h.b() && !k0.this.h.c()) {
                if (track == null || MoreObjects.isNullOrEmpty(track.uri())) {
                    z = k0.c(k0.this, true);
                } else {
                    z = k0.c(k0.this, false);
                }
                e |= z;
            }
            if (e) {
                k0.this.f();
            }
        }
    }

    public k0(ObjectMapper objectMapper, j0 j0Var, SpSharedPreferences<Object> spSharedPreferences, RxPlayerState rxPlayerState, y yVar) {
        this.j = spSharedPreferences;
        this.b = objectMapper;
        this.h = j0Var;
        this.d = rxPlayerState;
        this.e = yVar;
    }

    static void a(k0 k0Var, LegacyPlayerState legacyPlayerState) {
        StationEntitySession h2;
        k0Var.getClass();
        String c2 = agd.c(agd.b(legacyPlayerState.entityUri()));
        c2.getClass();
        c.b bVar = ViewUris.r0;
        if (bVar.a(c2) && (h2 = k0Var.h(bVar.b(c2))) != null) {
            PlayerTrack currentTrack = h2.getCurrentTrack();
            PlayerTrack track = legacyPlayerState.track();
            if (track != null && !PlayerTrackUtil.isAd(track)) {
                if (currentTrack == null || !rw.equal(currentTrack.uid(), track.uid())) {
                    k0Var.c.b(k0Var.d.getPlayerState(10, 39).T().B(io.reactivex.android.schedulers.a.b()).subscribe(new a0(k0Var, h2), z.a));
                }
            }
        }
    }

    static boolean c(k0 k0Var, boolean z) {
        if (k0Var.h.d() == z) {
            return false;
        }
        k0Var.h.g(z);
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void f() {
        for (RadioStateObserver radioStateObserver : this.a) {
            radioStateObserver.a(this.h);
        }
    }

    private void g() {
        for (RadioStateObserver radioStateObserver : this.a) {
            radioStateObserver.c(this.f);
        }
    }

    private void n() {
        SpSharedPreferences.a<Object> b2 = this.j.b();
        SpSharedPreferences.b<Object, String> bVar = n;
        b2.h(bVar);
        try {
            String writeValueAsString = this.b.writeValueAsString(this.k);
            if (!MoreObjects.isNullOrEmpty(writeValueAsString)) {
                b2.f(bVar, writeValueAsString);
            }
        } catch (JsonProcessingException e2) {
            Logger.o(e2, "Failed to save radio station sessions", new Object[0]);
        }
        b2.i();
    }

    private void p(RadioStationModel radioStationModel) {
        StationEntitySession h2 = h(radioStationModel.stationUri);
        if (h2 == null) {
            h2 = new StationEntitySession(radioStationModel, 0, System.currentTimeMillis());
        } else {
            h2.updateStationModel(radioStationModel);
        }
        this.k.put(radioStationModel.uri, h2);
    }

    private void t() {
        PlayerTrack[] playerTrackArr;
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<Map.Entry<String, StationEntitySession>> it = this.k.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, StationEntitySession> next = it.next();
            StationEntitySession value = next.getValue();
            boolean z = false;
            if (value != null) {
                RadioStationModel radioStationModel = value.getRadioStationModel();
                if (!MoreObjects.isNullOrEmpty(radioStationModel.uri) && !MoreObjects.isNullOrEmpty(radioStationModel.nextPageUrl) && radioStationModel.seeds.length > 0 && (playerTrackArr = radioStationModel.tracks) != null && playerTrackArr.length > 0) {
                    z = true;
                }
            }
            if (!z || currentTimeMillis - next.getValue().getLastUpdateTime() >= 28800000) {
                it.remove();
            }
        }
    }

    public void e(RadioStateObserver radioStateObserver) {
        this.a.add(radioStateObserver);
        radioStateObserver.c(this.f);
        radioStateObserver.a(this.h);
    }

    public StationEntitySession h(c cVar) {
        StationEntitySession stationEntitySession = this.k.get(cVar.toString());
        if (stationEntitySession == null || System.currentTimeMillis() - stationEntitySession.getLastUpdateTime() >= 28800000) {
            return null;
        }
        return stationEntitySession;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e A[Catch:{ IOException -> 0x00ae }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState r12) {
        /*
            r11 = this;
            java.lang.String r0 = ""
            r1 = 0
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r11.j     // Catch:{ IOException -> 0x00ae }
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r3 = com.spotify.music.spotlets.radio.service.k0.l     // Catch:{ IOException -> 0x00ae }
            java.lang.String r2 = r2.m(r3, r0)     // Catch:{ IOException -> 0x00ae }
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r3 = r11.j     // Catch:{ IOException -> 0x00ae }
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r4 = com.spotify.music.spotlets.radio.service.k0.m     // Catch:{ IOException -> 0x00ae }
            java.lang.String r3 = r3.m(r4, r0)     // Catch:{ IOException -> 0x00ae }
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r4 = r11.j     // Catch:{ IOException -> 0x00ae }
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r5 = com.spotify.music.spotlets.radio.service.k0.n     // Catch:{ IOException -> 0x00ae }
            java.lang.String r0 = r4.m(r5, r0)     // Catch:{ IOException -> 0x00ae }
            boolean r4 = com.google.common.base.MoreObjects.isNullOrEmpty(r2)     // Catch:{ IOException -> 0x00ae }
            r5 = 0
            if (r4 != 0) goto L_0x0063
            boolean r4 = com.google.common.base.MoreObjects.isNullOrEmpty(r3)     // Catch:{ IOException -> 0x00ae }
            if (r4 != 0) goto L_0x0063
            com.fasterxml.jackson.databind.ObjectMapper r4 = r11.b     // Catch:{ IOException -> 0x00ae }
            java.lang.Class<com.spotify.music.spotlets.radio.model.RadioStationModel> r5 = com.spotify.music.spotlets.radio.model.RadioStationModel.class
            java.lang.Object r2 = r4.readValue(r2, r5)     // Catch:{ IOException -> 0x00ae }
            r5 = r2
            com.spotify.music.spotlets.radio.model.RadioStationModel r5 = (com.spotify.music.spotlets.radio.model.RadioStationModel) r5     // Catch:{ IOException -> 0x00ae }
            com.fasterxml.jackson.databind.ObjectMapper r2 = r11.b     // Catch:{ IOException -> 0x00ae }
            java.lang.Class<com.spotify.music.spotlets.radio.model.RadioStationTracksModel> r4 = com.spotify.music.spotlets.radio.model.RadioStationTracksModel.class
            java.lang.Object r2 = r2.readValue(r3, r4)     // Catch:{ IOException -> 0x00ae }
            com.spotify.music.spotlets.radio.model.RadioStationTracksModel r2 = (com.spotify.music.spotlets.radio.model.RadioStationTracksModel) r2     // Catch:{ IOException -> 0x00ae }
            if (r5 == 0) goto L_0x005f
            if (r2 == 0) goto L_0x005f
            java.lang.String r3 = r5.uri     // Catch:{ IOException -> 0x00ae }
            boolean r3 = com.google.common.base.MoreObjects.isNullOrEmpty(r3)     // Catch:{ IOException -> 0x00ae }
            if (r3 != 0) goto L_0x005f
            java.lang.String[] r3 = r5.seeds     // Catch:{ IOException -> 0x00ae }
            int r3 = r3.length     // Catch:{ IOException -> 0x00ae }
            if (r3 <= 0) goto L_0x005f
            java.lang.String r3 = r2.nextPageUrl     // Catch:{ IOException -> 0x00ae }
            boolean r3 = com.google.common.base.MoreObjects.isNullOrEmpty(r3)     // Catch:{ IOException -> 0x00ae }
            if (r3 != 0) goto L_0x005f
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r3 = r2.tracks     // Catch:{ IOException -> 0x00ae }
            if (r3 == 0) goto L_0x005f
            int r3 = r3.length     // Catch:{ IOException -> 0x00ae }
            if (r3 <= 0) goto L_0x005f
            r3 = 1
            goto L_0x0068
        L_0x005f:
            r10 = r5
            r5 = r2
            r2 = r10
            goto L_0x0064
        L_0x0063:
            r2 = r5
        L_0x0064:
            r3 = 0
            r10 = r5
            r5 = r2
            r2 = r10
        L_0x0068:
            boolean r4 = com.google.common.base.MoreObjects.isNullOrEmpty(r0)     // Catch:{ IOException -> 0x00ae }
            if (r4 != 0) goto L_0x0089
            com.fasterxml.jackson.databind.ObjectMapper r4 = r11.b     // Catch:{ IOException -> 0x00ae }
            com.fasterxml.jackson.databind.type.TypeFactory r6 = r4.getTypeFactory()     // Catch:{ IOException -> 0x00ae }
            java.lang.Class<java.util.HashMap> r7 = java.util.HashMap.class
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Class<com.spotify.music.spotlets.radio.model.StationEntitySession> r9 = com.spotify.music.spotlets.radio.model.StationEntitySession.class
            com.fasterxml.jackson.databind.type.MapType r6 = r6.constructMapType(r7, r8, r9)     // Catch:{ IOException -> 0x00ae }
            java.lang.Object r0 = r4.readValue(r0, r6)     // Catch:{ IOException -> 0x00ae }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ IOException -> 0x00ae }
            r11.k = r0     // Catch:{ IOException -> 0x00ae }
            r11.t()     // Catch:{ IOException -> 0x00ae }
        L_0x0089:
            if (r3 == 0) goto L_0x00b6
            java.lang.String r0 = r5.uri     // Catch:{ IOException -> 0x00ae }
            java.lang.String r12 = r12.entityUri()     // Catch:{ IOException -> 0x00ae }
            boolean r12 = r0.equals(r12)     // Catch:{ IOException -> 0x00ae }
            if (r12 == 0) goto L_0x00b6
            com.spotify.music.spotlets.radio.service.n0 r12 = new com.spotify.music.spotlets.radio.service.n0     // Catch:{ IOException -> 0x00ae }
            com.spotify.music.libs.viewuri.c r0 = com.spotify.music.libs.viewuri.ViewUris.c     // Catch:{ IOException -> 0x00ae }
            r12.<init>(r2, r0)     // Catch:{ IOException -> 0x00ae }
            java.util.Map<java.lang.String, com.spotify.music.spotlets.radio.service.n0> r0 = r11.i     // Catch:{ IOException -> 0x00ae }
            java.lang.String r2 = r5.uri     // Catch:{ IOException -> 0x00ae }
            r0.put(r2, r12)     // Catch:{ IOException -> 0x00ae }
            com.spotify.music.spotlets.radio.service.j0 r0 = r11.h     // Catch:{ IOException -> 0x00ae }
            r0.f(r5, r12)     // Catch:{ IOException -> 0x00ae }
            r11.p(r5)     // Catch:{ IOException -> 0x00ae }
            goto L_0x00b6
        L_0x00ae:
            r12 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Failed to restore radio session"
            com.spotify.base.java.logging.Logger.o(r12, r1, r0)
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.service.k0.i(com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState):void");
    }

    public /* synthetic */ void j(StationEntitySession stationEntitySession, LegacyPlayerState legacyPlayerState) {
        stationEntitySession.updateTracks(legacyPlayerState);
        n();
    }

    public void k(RadioStationModel radioStationModel) {
        ArrayList arrayList = new ArrayList(this.f.userStations().size() + 1);
        arrayList.add(radioStationModel);
        for (RadioStationModel radioStationModel2 : this.f.userStations()) {
            if (!radioStationModel2.uri.equals(radioStationModel.uri)) {
                arrayList.add(radioStationModel2);
            }
        }
        this.f = RadioStationsModel.create(arrayList, this.f.recommendedStations(), this.f.genreStations(), this.f.savedStations());
        g();
    }

    public void l(RadioStateObserver radioStateObserver) {
        this.a.remove(radioStateObserver);
    }

    public void m(RadioStateObserver.FailureState failureState) {
        for (RadioStateObserver radioStateObserver : this.a) {
            radioStateObserver.b(null);
        }
    }

    public void o(RadioStationModel radioStationModel, RadioStationTracksModel radioStationTracksModel, c cVar) {
        ArrayList arrayList = new ArrayList(this.f.userStations().size());
        for (RadioStationModel radioStationModel2 : this.f.userStations()) {
            if (radioStationModel2.getStationSeed().equals(radioStationModel.getStationSeed())) {
                arrayList.add(0, radioStationModel2);
            } else {
                arrayList.add(radioStationModel2);
            }
        }
        this.f = RadioStationsModel.create(arrayList, this.f.recommendedStations(), this.f.genreStations(), this.f.savedStations());
        g();
        RadioStationModel radioStationModel3 = new RadioStationModel(radioStationModel, radioStationTracksModel);
        n0 n0Var = this.i.get(radioStationModel3.uri);
        if (n0Var == null) {
            n0Var = new n0(radioStationTracksModel, cVar);
        } else {
            n0Var.c(radioStationTracksModel);
        }
        this.i.put(radioStationModel3.uri, n0Var);
        p(radioStationModel3);
        SpSharedPreferences.a<Object> b2 = this.j.b();
        SpSharedPreferences.b<Object, String> bVar = l;
        b2.h(bVar);
        SpSharedPreferences.b<Object, String> bVar2 = m;
        b2.h(bVar2);
        try {
            String writeValueAsString = this.b.writeValueAsString(radioStationModel3);
            String writeValueAsString2 = this.b.writeValueAsString(radioStationTracksModel);
            if (!MoreObjects.isNullOrEmpty(writeValueAsString) && !MoreObjects.isNullOrEmpty(writeValueAsString2)) {
                b2.f(bVar, writeValueAsString);
                b2.f(bVar2, writeValueAsString2);
            }
        } catch (JsonProcessingException e2) {
            Logger.o(e2, "Failed to save radio session", new Object[0]);
        }
        b2.i();
        n();
        this.h.f(radioStationModel3, n0Var);
        f();
    }

    public void q() {
        s<LegacyPlayerState> z0 = this.d.getPlayerState().z0();
        this.c.b(z0.E0(z0.N0(1).N(new y(this))).E().o0(this.e).subscribe(this.g, b0.a));
    }

    public void r() {
        this.c.f();
    }

    public void s(RadioStationsModel radioStationsModel) {
        if (radioStationsModel != null && !this.f.equals(radioStationsModel)) {
            this.f = radioStationsModel;
            g();
        }
    }
}
