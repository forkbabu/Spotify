package com.spotify.player.sub;

import com.google.common.io.BaseEncoding;
import com.google.protobuf.ByteString;
import com.spotify.paste.widgets.b;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsContextPlayerState$ContextIndex;
import com.spotify.player.esperanto.proto.EsContextPlayerState$ContextPlayerState;
import com.spotify.player.esperanto.proto.EsContextPlayerState$PlaybackQuality;
import com.spotify.player.esperanto.proto.EsOptional$OptionalDouble;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsProvidedTrack$ProvidedTrack;
import com.spotify.player.esperanto.proto.EsRestrictions$Restrictions;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.ContextIndex;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlaybackQuality;
import com.spotify.player.model.PlayerOptions;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Suppressions;
import com.spotify.player.proto.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class EsperantoPlayerSubscriptions$playerState$1 extends FunctionReferenceImpl implements nmf<EsContextPlayerState$ContextPlayerState, PlayerState> {
    public static final EsperantoPlayerSubscriptions$playerState$1 a = new EsperantoPlayerSubscriptions$playerState$1();

    EsperantoPlayerSubscriptions$playerState$1() {
        super(1, e.class, "playerStateFromProto", "playerStateFromProto(Lcom/spotify/player/esperanto/proto/EsContextPlayerState$ContextPlayerState;)Lcom/spotify/player/model/PlayerState;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public PlayerState invoke(EsContextPlayerState$ContextPlayerState esContextPlayerState$ContextPlayerState) {
        AudioStream audioStream;
        BitrateLevel bitrateLevel;
        EsContextPlayerState$ContextPlayerState esContextPlayerState$ContextPlayerState2 = esContextPlayerState$ContextPlayerState;
        h.e(esContextPlayerState$ContextPlayerState2, "p1");
        h.e(esContextPlayerState$ContextPlayerState2, "protoState");
        PlayerState.Builder builder = PlayerState.builder();
        builder.timestamp(esContextPlayerState$ContextPlayerState2.K());
        builder.contextUri(esContextPlayerState$ContextPlayerState2.m());
        builder.contextUrl(esContextPlayerState$ContextPlayerState2.n());
        EsRestrictions$Restrictions l = esContextPlayerState$ContextPlayerState2.l();
        h.d(l, "protoState.contextRestrictions");
        builder.contextRestrictions(b.j(l));
        EsPlayOrigin$PlayOrigin y = esContextPlayerState$ContextPlayerState2.y();
        h.d(y, "protoState.playOrigin");
        h.e(y, "playOrigin");
        PlayOrigin.Builder builder2 = PlayOrigin.builder(y.u());
        builder2.featureVersion(y.v());
        builder2.viewUri(y.x());
        builder2.externalReferrer(y.s());
        builder2.referrerIdentifier(y.w());
        builder2.deviceIdentifier(y.r());
        List<String> t = y.t();
        h.d(t, "playOrigin.featureClassesList");
        builder2.featureClasses(d.Z(t));
        PlayOrigin build = builder2.build();
        h.d(build, "PlayOrigin.builder(playO…st.toSet())\n    }.build()");
        builder.playOrigin(build);
        if (esContextPlayerState$ContextPlayerState2.N()) {
            EsContextPlayerState$ContextIndex p = esContextPlayerState$ContextPlayerState2.p();
            h.d(p, "protoState.index");
            h.e(p, "protoIndex");
            ContextIndex create = ContextIndex.create(p.i(), p.l());
            h.d(create, "ContextIndex.create(prot…x.page, protoIndex.track)");
            builder.index(create);
        }
        if (esContextPlayerState$ContextPlayerState2.R()) {
            EsProvidedTrack$ProvidedTrack L = esContextPlayerState$ContextPlayerState2.L();
            h.d(L, "protoState.track");
            builder.track(b.b(L));
        }
        ByteString z = esContextPlayerState$ContextPlayerState2.z();
        h.d(z, "protoState.playbackId");
        if (!z.isEmpty()) {
            ByteString z2 = esContextPlayerState$ContextPlayerState2.z();
            h.d(z2, "protoState.playbackId");
            h.e(z2, "id");
            builder.playbackId(BaseEncoding.base16().encode(z2.A()));
        }
        if (esContextPlayerState$ContextPlayerState2.O()) {
            EsContextPlayerState$PlaybackQuality A = esContextPlayerState$ContextPlayerState2.A();
            h.d(A, "protoState.playbackQuality");
            h.e(A, "playbackQuality");
            PlaybackQuality.Builder builder3 = PlaybackQuality.builder();
            EsContextPlayerState$PlaybackQuality.BitrateLevel h = A.h();
            h.d(h, "playbackQuality.bitrateLevel");
            h.e(h, "bitrateLevel");
            switch (h.ordinal()) {
                case 0:
                    bitrateLevel = BitrateLevel.UNKNOWN;
                    break;
                case 1:
                    bitrateLevel = BitrateLevel.LOW;
                    break;
                case 2:
                    bitrateLevel = BitrateLevel.NORMAL;
                    break;
                case 3:
                    bitrateLevel = BitrateLevel.HIGH;
                    break;
                case 4:
                    bitrateLevel = BitrateLevel.VERYHIGH;
                    break;
                case 5:
                    bitrateLevel = BitrateLevel.NORMALIZED;
                    break;
                case 6:
                    bitrateLevel = BitrateLevel.UNKNOWN;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            PlaybackQuality build2 = builder3.bitrateLevel(bitrateLevel).build();
            h.d(build2, "PlaybackQuality.builder(…ty.bitrateLevel)).build()");
            builder.playbackQuality(build2);
        }
        if (esContextPlayerState$ContextPlayerState2.P()) {
            EsOptional$OptionalDouble B = esContextPlayerState$ContextPlayerState2.B();
            h.d(B, "protoState.playbackSpeed");
            builder.playbackSpeed(Double.valueOf(B.i()));
        }
        if (esContextPlayerState$ContextPlayerState2.Q()) {
            EsOptional$OptionalInt64 C = esContextPlayerState$ContextPlayerState2.C();
            h.d(C, "protoState.positionAsOfTimestamp");
            builder.positionAsOfTimestamp(Long.valueOf(C.l()));
        }
        if (esContextPlayerState$ContextPlayerState2.M()) {
            EsOptional$OptionalInt64 o = esContextPlayerState$ContextPlayerState2.o();
            h.d(o, "protoState.duration");
            builder.duration(Long.valueOf(o.l()));
        }
        builder.isPlaying(esContextPlayerState$ContextPlayerState2.s());
        builder.isPaused(esContextPlayerState$ContextPlayerState2.r());
        builder.isBuffering(esContextPlayerState$ContextPlayerState2.q());
        builder.isSystemInitiated(esContextPlayerState$ContextPlayerState2.t());
        EsContextPlayerOptions$ContextPlayerOptions w = esContextPlayerState$ContextPlayerState2.w();
        h.d(w, "protoState.options");
        h.e(w, "options");
        PlayerOptions.Builder builder4 = PlayerOptions.builder();
        builder4.shufflingContext(w.m());
        builder4.repeatingContext(w.i());
        builder4.repeatingTrack(w.l());
        PlayerOptions build3 = builder4.build();
        h.d(build3, "PlayerOptions.builder().…atingTrack)\n    }.build()");
        builder.options(build3);
        EsRestrictions$Restrictions G = esContextPlayerState$ContextPlayerState2.G();
        h.d(G, "protoState.restrictions");
        builder.restrictions(b.j(G));
        if (esContextPlayerState$ContextPlayerState2.I() > 0) {
            List<String> J = esContextPlayerState$ContextPlayerState2.J();
            h.d(J, "protoState.suppressionsList");
            h.e(J, "protoSuppressions");
            Suppressions create2 = Suppressions.create(d.Z(J));
            h.d(create2, "Suppressions.create(protoSuppressions.toSet())");
            builder.suppressions(create2);
        }
        if (esContextPlayerState$ContextPlayerState2.u() > 0) {
            List<EsProvidedTrack$ProvidedTrack> v = esContextPlayerState$ContextPlayerState2.v();
            h.d(v, "protoState.nextTracksList");
            ArrayList arrayList = new ArrayList(d.e(v, 10));
            Iterator<T> it = v.iterator();
            while (it.hasNext()) {
                arrayList.add(b.b(it.next()));
            }
            builder.nextTracks(arrayList);
        }
        if (esContextPlayerState$ContextPlayerState2.D() > 0) {
            List<EsProvidedTrack$ProvidedTrack> E = esContextPlayerState$ContextPlayerState2.E();
            h.d(E, "protoState.prevTracksList");
            ArrayList arrayList2 = new ArrayList(d.e(E, 10));
            Iterator<T> it2 = E.iterator();
            while (it2.hasNext()) {
                arrayList2.add(b.b(it2.next()));
            }
            builder.prevTracks(arrayList2);
        }
        builder.contextMetadata(esContextPlayerState$ContextPlayerState2.i());
        builder.pageMetadata(esContextPlayerState$ContextPlayerState2.x());
        String H = esContextPlayerState$ContextPlayerState2.H();
        h.d(H, "protoState.sessionId");
        if (H.length() > 0) {
            builder.sessionId(esContextPlayerState$ContextPlayerState2.H());
        }
        builder.queueRevision(String.valueOf(esContextPlayerState$ContextPlayerState2.F()));
        int ordinal = esContextPlayerState$ContextPlayerState2.h().ordinal();
        if (ordinal == 0) {
            audioStream = AudioStream.DEFAULT;
        } else if (ordinal != 1) {
            audioStream = AudioStream.DEFAULT;
        } else {
            audioStream = AudioStream.ALARM;
        }
        builder.audioStream(audioStream);
        PlayerState build4 = builder.build();
        h.d(build4, "PlayerState.builder().ap…}\n        )\n    }.build()");
        return build4;
    }
}
