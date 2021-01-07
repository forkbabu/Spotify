package com.spotify.music.spotlets.radio.service;

import android.net.Uri;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.o0;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.spotlets.radio.model.CreateRadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.StationEntitySession;
import com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.player.play.f;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.tuple.Pair;

/* access modifiers changed from: package-private */
public class d0 {
    private static final Set<String> n = new HashSet(Collections.singletonList("disallow-mft-radio"));
    private static final Set<String> o = new HashSet(Collections.singletonList("disallow-radio"));
    public static final /* synthetic */ int p = 0;
    private final f a;
    private final g<PlayerState> b;
    private final yfd c;
    private final y d;
    private final io.reactivex.disposables.a e = new io.reactivex.disposables.a();
    private final o0 f;
    private final h0 g;
    private final k0 h;
    private final wfd i;
    private boolean j;
    private final com.spotify.music.explicitcontent.f k;
    private boolean l;
    private b m;

    /* access modifiers changed from: package-private */
    public static class a {
        public final c a;
        public final ifd b;
        public final yn0 c;

        a(c cVar, ifd ifd, yn0 yn0) {
            cVar.getClass();
            this.a = cVar;
            this.b = ifd;
            yn0.getClass();
            this.c = yn0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.a.equals(aVar.a) || !this.b.equals(aVar.b) || !this.c.equals(aVar.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.b.hashCode();
            return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
        }
    }

    d0(yfd yfd, k0 k0Var, wfd wfd, h0 h0Var, o0 o0Var, com.spotify.music.explicitcontent.f fVar, y yVar, f fVar2, g<PlayerState> gVar) {
        this.c = yfd;
        this.h = k0Var;
        this.i = wfd;
        this.g = h0Var;
        this.f = o0Var;
        this.k = fVar;
        this.d = yVar;
        this.a = fVar2;
        this.b = gVar;
    }

    private void q(RadioStationModel radioStationModel, RadioStationTracksModel radioStationTracksModel, Integer num, Long l2, boolean z, a aVar) {
        radioStationModel.getClass();
        radioStationTracksModel.getClass();
        aVar.getClass();
        this.h.o(radioStationModel, radioStationTracksModel, aVar.a);
        String arrays = Arrays.toString(radioStationModel.seeds);
        this.e.b(this.b.C(q.a).h0(1).a0().A(h.a).s(new j(this, radioStationModel, radioStationTracksModel, aVar, num, l2)).subscribe(l.a, new r(arrays)));
        if (z) {
            this.e.b(this.c.b(CreateRadioStationModel.create(radioStationModel)).A(this.d).subscribe(n.a, new o(arrays)));
        }
    }

    public void a() {
        this.h.q();
        this.g.b();
        b bVar = this.m;
        if (bVar == null || bVar.d()) {
            this.m = this.k.b().subscribe(new e(this), s.a);
        }
    }

    public void b() {
        c();
        this.e.f();
    }

    public void c() {
        this.h.r();
        this.g.c();
        b bVar = this.m;
        if (bVar != null && !bVar.d()) {
            this.m.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    public k0 d() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public s<RadioStationModel> e(String str) {
        return this.c.e(str, 40, null, this.l, false);
    }

    public /* synthetic */ void f(Boolean bool) {
        this.l = bool.booleanValue();
    }

    public /* synthetic */ void g(String[] strArr, a aVar, TracksAndRadioStationModel tracksAndRadioStationModel) {
        RadioStationModel radioStationModel = tracksAndRadioStationModel.station;
        Logger.b("Created station %s from seeds %s. Have %d tracks with next-page-url %s", radioStationModel.uri, Arrays.toString(strArr), Integer.valueOf(tracksAndRadioStationModel.tracks.length), tracksAndRadioStationModel.nextPageUrl);
        this.h.k(radioStationModel);
        q(radioStationModel, tracksAndRadioStationModel, null, null, false, aVar);
    }

    public /* synthetic */ void h(String[] strArr, Throwable th) {
        Logger.n("Failed to create station with seeds %s", Arrays.toString(strArr));
        this.f.c(C0707R.string.toast_unable_to_start_radio, new Object[0]);
        this.h.m(null);
    }

    public /* synthetic */ void i(a aVar, RadioStationModel radioStationModel) {
        q(radioStationModel, new RadioStationTracksModel(radioStationModel.tracks, radioStationModel.nextPageUrl), null, null, false, aVar);
    }

    public /* synthetic */ void j(RadioStationModel radioStationModel, boolean z, a aVar, RadioStationTracksModel radioStationTracksModel) {
        q(radioStationModel, radioStationTracksModel, null, null, z, aVar);
    }

    public /* synthetic */ void k(RadioStationModel radioStationModel, Throwable th) {
        this.f.c(C0707R.string.toast_unable_to_start_radio, new Object[0]);
        Logger.n("Failed to load tracks from the backend for %s", radioStationModel.uri);
    }

    public io.reactivex.d0 l(RadioStationModel radioStationModel, RadioStationTracksModel radioStationTracksModel, a aVar, Integer num, Long l2, Pair pair) {
        Restrictions restrictions;
        f fVar = this.a;
        HashMap hashMap = new HashMap(2);
        hashMap.put("context_description", x.n(radioStationModel.title, ""));
        hashMap.put("image_url", x.n(radioStationModel.imageUri, ""));
        Context.Builder metadata = Context.builder(radioStationModel.getPlayerContextUri()).metadata(hashMap);
        ContextPage.Builder builder = ContextPage.builder();
        Uri parse = Uri.parse(radioStationTracksModel.nextPageUrl);
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        HashSet hashSet = new HashSet(parse.getQueryParameterNames());
        hashSet.add("filter-explicit");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals("filter-explicit")) {
                if (this.l) {
                    clearQuery.appendQueryParameter("filter-explicit", "1");
                }
            } else if (parse.getQueryParameterNames().contains(str)) {
                clearQuery.appendQueryParameter(str, parse.getQueryParameter(str));
            }
        }
        Context.Builder pages = metadata.pages(ImmutableList.of(builder.nextPageUrl(clearQuery.toString()).tracks((List<ContextTrack>) ImmutableList.copyOf(Collections2.transform((Iterable) Arrays.asList(radioStationTracksModel.tracks), (Function) new i(ContextTrack.Builder.builder())))).build()));
        if (this.j) {
            Restrictions.Builder builder2 = Restrictions.builder();
            Set<String> set = o;
            restrictions = builder2.disallowTogglingRepeatContextReasons(set).disallowTogglingRepeatTrackReasons(set).disallowTogglingShuffleReasons(set).build();
        } else {
            Restrictions.Builder builder3 = Restrictions.builder();
            Set<String> set2 = n;
            restrictions = builder3.disallowPeekingPrevReasons(set2).disallowSkippingPrevReasons(set2).disallowTogglingRepeatContextReasons(set2).disallowTogglingRepeatTrackReasons(set2).disallowTogglingShuffleReasons(set2).disallowSeekingReasons(set2).build();
        }
        PlayCommand.Builder builder4 = PlayCommand.builder(pages.restrictions(restrictions).build(), PlayOrigin.builder(aVar.b.getName()).referrerIdentifier(aVar.c.getName()).viewUri(radioStationModel.getPlayerContextUri()).build());
        PreparePlayOptions.Builder builder5 = PreparePlayOptions.builder();
        if (num != null) {
            builder5 = builder5.skipTo(SkipToTrack.builder().trackIndex(Long.valueOf((long) num.intValue())).build());
        }
        if (l2 != null) {
            builder5 = builder5.seekTo(l2);
        }
        PlayerOptionOverrides.Builder builder6 = PlayerOptionOverrides.builder();
        Boolean bool = Boolean.FALSE;
        return fVar.a(builder4.options(builder5.playerOptionsOverride(builder6.repeatingContext(bool).shufflingContext(bool).repeatingTrack(bool).build()).suppressions(Suppressions.create(ImmutableSet.of("mft/inject_filler_tracks", "mft/inject_random_tracks", "mft/force_shuffle"))).build()).loggingParams(LoggingParams.builder().interactionId((String) pair.d()).pageInstanceId((String) pair.g()).build()).build());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r9.intValue() < 0) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(com.spotify.music.spotlets.radio.model.RadioStationModel r8, int r9, long r10, boolean r12, java.lang.String[] r13, com.spotify.music.spotlets.radio.service.d0.a r14) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.service.d0.m(com.spotify.music.spotlets.radio.model.RadioStationModel, int, long, boolean, java.lang.String[], com.spotify.music.spotlets.radio.service.d0$a):void");
    }

    /* access modifiers changed from: package-private */
    public void n(String[] strArr, boolean z, int i2, long j2, String[] strArr2, a aVar) {
        strArr.getClass();
        aVar.getClass();
        String[] strArr3 = (String[]) FluentIterable.from(Arrays.asList(strArr)).filter(g.a).toArray(String.class);
        boolean z2 = true;
        if (strArr3 == null || strArr3.length == 0) {
            this.f.c(C0707R.string.toast_unable_to_start_radio, new Object[0]);
            Logger.n("Invalid seeds for station, should be either artist, album, track, genre or playlist uri. %s", Arrays.toString(strArr));
            return;
        }
        c.b bVar = ViewUris.r0;
        String c2 = agd.c(strArr3[0]);
        c2.getClass();
        StationEntitySession h2 = this.h.h(bVar.b(c2));
        if (h2 != null) {
            RadioStationModel radioStationModel = h2.getRadioStationModel();
            int i3 = -1;
            if (i2 >= -1 && i2 < radioStationModel.tracks.length) {
                i3 = i2;
            }
            m(radioStationModel, i3, j2, z, strArr2, aVar);
        } else if ((z || strArr3.length > 1) && !ViewUris.t0.a(strArr3[0])) {
            if (strArr3.length <= 0) {
                z2 = false;
            }
            MoreObjects.checkState(z2);
            this.e.b(this.c.a(CreateRadioStationModel.create(strArr3), strArr2).o0(this.d).subscribe(new k(this, strArr3, aVar), new d(this, strArr3)));
        } else {
            String str = strArr3[0];
            str.getClass();
            this.e.b(this.c.e(str, 40, strArr2, this.l, aVar.c.equals(bu9.n) || aVar.b.equals(kfd.w0)).o0(this.d).subscribe(new m(this, aVar), new b(str)));
        }
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.g.b();
    }

    /* access modifiers changed from: package-private */
    public void p(com.spotify.android.flags.c cVar) {
        this.j = z42.C(cVar);
    }
}
