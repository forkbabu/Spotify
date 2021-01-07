package com.spotify.paste.widgets;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.GeneratedMessageLite;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPlayOptions$PlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.spotify.player.esperanto.proto.EsProvidedTrack$ProvidedTrack;
import com.spotify.player.esperanto.proto.EsRestrictions$Restrictions;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOperation;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.player.model.command.options.PlayTrigger;
import com.spotify.remoteconfig.client.logging.EventLogger;
import com.spotify.remoteconfig.client.logging.a;
import com.spotify.remoteconfig.client.model.resolve.FetchType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class b {
    public static final EsCommandOptions$CommandOptions a(CommandOptions commandOptions) {
        h.e(commandOptions, "commandOptions");
        EsCommandOptions$CommandOptions.a m = EsCommandOptions$CommandOptions.m();
        Optional<Boolean> overrideRestrictions = commandOptions.overrideRestrictions();
        h.d(overrideRestrictions, "commandOptions.overrideRestrictions()");
        if (overrideRestrictions.isPresent()) {
            Boolean bool = commandOptions.overrideRestrictions().get();
            h.d(bool, "commandOptions.overrideRestrictions().get()");
            m.n(bool.booleanValue());
        }
        Optional<Boolean> onlyForLocalDevice = commandOptions.onlyForLocalDevice();
        h.d(onlyForLocalDevice, "commandOptions.onlyForLocalDevice()");
        if (onlyForLocalDevice.isPresent()) {
            Boolean bool2 = commandOptions.onlyForLocalDevice().get();
            h.d(bool2, "commandOptions.onlyForLocalDevice().get()");
            m.m(bool2.booleanValue());
        }
        Optional<Boolean> systemInitiated = commandOptions.systemInitiated();
        h.d(systemInitiated, "commandOptions.systemInitiated()");
        if (systemInitiated.isPresent()) {
            Boolean bool3 = commandOptions.systemInitiated().get();
            h.d(bool3, "commandOptions.systemInitiated().get()");
            m.o(bool3.booleanValue());
        }
        GeneratedMessageLite build = m.build();
        h.d(build, "EsCommandOptions.Command…)\n        }\n    }.build()");
        return (EsCommandOptions$CommandOptions) build;
    }

    public static final ContextTrack b(EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack) {
        h.e(esProvidedTrack$ProvidedTrack, "protoTrack");
        EsContextTrack$ContextTrack l = esProvidedTrack$ProvidedTrack.l();
        h.d(l, "protoTrack.contextTrack");
        h.e(l, "protoTrack");
        ContextTrack.Builder builder = ContextTrack.builder(l.q());
        String p = l.p();
        if (!(p == null || p.length() == 0)) {
            builder.uid(l.p());
        }
        if (l.n() > 0) {
            builder.metadata(l.o());
        }
        ContextTrack build = builder.build();
        h.d(build, "ContextTrack.builder(pro…)\n        }\n    }.build()");
        ContextTrack.Builder builder2 = build.toBuilder();
        builder2.provider(esProvidedTrack$ProvidedTrack.n());
        ContextTrack build2 = builder2.build();
        h.d(build2, "contextTrackFromProto(pr…k.provider)\n    }.build()");
        return build2;
    }

    public static final EsContextTrack$ContextTrack c(ContextTrack contextTrack) {
        h.e(contextTrack, AppProtocol.TrackData.TYPE_TRACK);
        EsContextTrack$ContextTrack.a r = EsContextTrack$ContextTrack.r();
        String uri = contextTrack.uri();
        boolean z = false;
        if (!(uri == null || uri.length() == 0)) {
            r.o(contextTrack.uri());
        }
        String uid = contextTrack.uid();
        if (!(uid == null || uid.length() == 0)) {
            r.n(contextTrack.uid());
        }
        ImmutableMap<String, String> metadata = contextTrack.metadata();
        if (metadata == null || metadata.isEmpty()) {
            z = true;
        }
        if (!z) {
            r.m(contextTrack.metadata());
        }
        GeneratedMessageLite build = r.build();
        h.d(build, "EsContextTrack.ContextTr…)\n        }\n    }.build()");
        return (EsContextTrack$ContextTrack) build;
    }

    public static final EsProvidedTrack$ProvidedTrack d(ContextTrack contextTrack) {
        h.e(contextTrack, AppProtocol.TrackData.TYPE_TRACK);
        EsProvidedTrack$ProvidedTrack.a o = EsProvidedTrack$ProvidedTrack.o();
        o.m(c(contextTrack));
        o.n(contextTrack.provider());
        GeneratedMessageLite build = o.build();
        h.d(build, "EsProvidedTrack.Provided…provider())\n    }.build()");
        return (EsProvidedTrack$ProvidedTrack) build;
    }

    public static final String e(PlayerState playerState) {
        String uri;
        h.e(playerState, "$this$currentTrackUri");
        ContextTrack orNull = playerState.track().orNull();
        return (orNull == null || (uri = orNull.uri()) == null) ? "" : uri;
    }

    public static /* synthetic */ void f(EventLogger eventLogger, FetchType fetchType, long j, c0e c0e, EventLogger.FetchErrorReason fetchErrorReason, String str, int i, int i2, Object obj) {
        ((a) eventLogger).c(fetchType, j, c0e, (i2 & 8) != 0 ? EventLogger.FetchErrorReason.UNKNOWN : fetchErrorReason, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? -1 : i);
    }

    public static final EsLoggingParams$LoggingParams g(LoggingParams loggingParams) {
        h.e(loggingParams, "loggingParams");
        EsLoggingParams$LoggingParams.a m = EsLoggingParams$LoggingParams.m();
        Optional<Long> commandInitiatedTime = loggingParams.commandInitiatedTime();
        h.d(commandInitiatedTime, "loggingParams.commandInitiatedTime()");
        if (commandInitiatedTime.isPresent()) {
            EsOptional$OptionalInt64.a m2 = EsOptional$OptionalInt64.m();
            Long l = loggingParams.commandInitiatedTime().get();
            h.d(l, "loggingParams.commandInitiatedTime().get()");
            m2.m(l.longValue());
            m.o((EsOptional$OptionalInt64) m2.build());
        }
        Optional<String> pageInstanceId = loggingParams.pageInstanceId();
        h.d(pageInstanceId, "loggingParams.pageInstanceId()");
        if (pageInstanceId.isPresent()) {
            m.n(loggingParams.pageInstanceId().get());
        }
        Optional<String> interactionId = loggingParams.interactionId();
        h.d(interactionId, "loggingParams.interactionId()");
        if (interactionId.isPresent()) {
            m.m(loggingParams.interactionId().get());
        }
        GeneratedMessageLite build = m.build();
        h.d(build, "EsLoggingParams.LoggingP…)\n        }\n    }.build()");
        return (EsLoggingParams$LoggingParams) build;
    }

    public static final EsPlayOptions$PlayOptions h(PlayOptions playOptions) {
        EsPlayOptions$PlayOptions.Trigger trigger;
        int ordinal;
        EsPlayOptions$PlayOptions.Operation operation;
        int ordinal2;
        h.e(playOptions, "playOptions");
        EsPlayOptions$PlayOptions.a l = EsPlayOptions$PlayOptions.l();
        Optional<PlayOperation> operation2 = playOptions.operation();
        h.d(operation2, "playOptions.operation()");
        if (operation2.isPresent()) {
            PlayOperation playOperation = playOptions.operation().get();
            if (playOperation == null || (ordinal2 = playOperation.ordinal()) == 0) {
                operation = EsPlayOptions$PlayOptions.Operation.REPLACE;
            } else if (ordinal2 == 1) {
                operation = EsPlayOptions$PlayOptions.Operation.ENQUEUE;
            } else if (ordinal2 == 2) {
                operation = EsPlayOptions$PlayOptions.Operation.PUSH;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            l.m(operation);
        }
        Optional<PlayTrigger> trigger2 = playOptions.trigger();
        h.d(trigger2, "playOptions.trigger()");
        if (trigger2.isPresent()) {
            PlayTrigger playTrigger = playOptions.trigger().get();
            if (playTrigger == null || (ordinal = playTrigger.ordinal()) == 0) {
                trigger = EsPlayOptions$PlayOptions.Trigger.IMMEDIATELY;
            } else if (ordinal == 1) {
                trigger = EsPlayOptions$PlayOptions.Trigger.ADVANCED_PAST_TRACK;
            } else if (ordinal == 2) {
                trigger = EsPlayOptions$PlayOptions.Trigger.ADVANCED_PAST_CONTEXT;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            l.n(trigger);
        }
        GeneratedMessageLite build = l.build();
        h.d(build, "EsPlayOptions.PlayOption…}\n        }\n    }.build()");
        return (EsPlayOptions$PlayOptions) build;
    }

    public static final EsPlayOrigin$PlayOrigin i(PlayOrigin playOrigin) {
        h.e(playOrigin, "playOrigin");
        EsPlayOrigin$PlayOrigin.a y = EsPlayOrigin$PlayOrigin.y();
        y.p(playOrigin.featureIdentifier());
        y.q(playOrigin.featureVersion());
        y.s(playOrigin.viewUri());
        y.o(playOrigin.externalReferrer());
        y.r(playOrigin.referrerIdentifier());
        y.n(playOrigin.deviceIdentifier());
        y.m(playOrigin.featureClasses());
        GeneratedMessageLite build = y.build();
        h.d(build, "EsPlayOrigin.PlayOrigin.…eClasses())\n    }.build()");
        return (EsPlayOrigin$PlayOrigin) build;
    }

    public static final Restrictions j(EsRestrictions$Restrictions esRestrictions$Restrictions) {
        h.e(esRestrictions$Restrictions, "restrictions");
        Restrictions.Builder builder = Restrictions.builder();
        List<String> I = esRestrictions$Restrictions.I();
        h.d(I, "restrictions.disallowPausingReasonsList");
        builder.disallowPausingReasons(d.Z(I));
        List<String> Q = esRestrictions$Restrictions.Q();
        h.d(Q, "restrictions.disallowResumingReasonsList");
        builder.disallowResumingReasons(d.Z(Q));
        List<String> R = esRestrictions$Restrictions.R();
        h.d(R, "restrictions.disallowSeekingReasonsList");
        builder.disallowSeekingReasons(d.Z(R));
        List<String> K = esRestrictions$Restrictions.K();
        h.d(K, "restrictions.disallowPeekingPrevReasonsList");
        builder.disallowPeekingPrevReasons(d.Z(K));
        List<String> J = esRestrictions$Restrictions.J();
        h.d(J, "restrictions.disallowPeekingNextReasonsList");
        builder.disallowPeekingNextReasons(d.Z(J));
        List<String> U = esRestrictions$Restrictions.U();
        h.d(U, "restrictions.disallowSkippingPrevReasonsList");
        builder.disallowSkippingPrevReasons(d.Z(U));
        List<String> T = esRestrictions$Restrictions.T();
        h.d(T, "restrictions.disallowSkippingNextReasonsList");
        builder.disallowSkippingNextReasons(d.Z(T));
        List<String> V = esRestrictions$Restrictions.V();
        h.d(V, "restrictions.disallowTog…gRepeatContextReasonsList");
        builder.disallowTogglingRepeatContextReasons(d.Z(V));
        List<String> W = esRestrictions$Restrictions.W();
        h.d(W, "restrictions.disallowTog…ingRepeatTrackReasonsList");
        builder.disallowTogglingRepeatTrackReasons(d.Z(W));
        List<String> X = esRestrictions$Restrictions.X();
        h.d(X, "restrictions.disallowTogglingShuffleReasonsList");
        builder.disallowTogglingShuffleReasons(d.Z(X));
        List<String> S = esRestrictions$Restrictions.S();
        h.d(S, "restrictions.disallowSetQueueReasonsList");
        builder.disallowSetQueueReasons(d.Z(S));
        List<String> H = esRestrictions$Restrictions.H();
        h.d(H, "restrictions.disallowInt…uptingPlaybackReasonsList");
        builder.disallowInterruptingPlaybackReasons(d.Z(H));
        List<String> Y = esRestrictions$Restrictions.Y();
        h.d(Y, "restrictions.disallowTra…erringPlaybackReasonsList");
        builder.disallowTransferringPlaybackReasons(d.Z(Y));
        List<String> L = esRestrictions$Restrictions.L();
        h.d(L, "restrictions.disallowRemoteControlReasonsList");
        builder.disallowRemoteControlReasons(d.Z(L));
        List<String> G = esRestrictions$Restrictions.G();
        h.d(G, "restrictions.disallowIns…IntoNextTracksReasonsList");
        builder.disallowInsertingIntoNextTracksReasons(d.Z(G));
        List<String> F = esRestrictions$Restrictions.F();
        h.d(F, "restrictions.disallowIns…oContextTracksReasonsList");
        builder.disallowInsertingIntoContextTracksReasons(d.Z(F));
        List<String> P = esRestrictions$Restrictions.P();
        h.d(P, "restrictions.disallowReo…ngInNextTracksReasonsList");
        builder.disallowReorderingInNextTracksReasons(d.Z(P));
        List<String> O = esRestrictions$Restrictions.O();
        h.d(O, "restrictions.disallowReo…nContextTracksReasonsList");
        builder.disallowReorderingInContextTracksReasons(d.Z(O));
        List<String> N = esRestrictions$Restrictions.N();
        h.d(N, "restrictions.disallowRem…FromNextTracksReasonsList");
        builder.disallowRemovingFromNextTracksReasons(d.Z(N));
        List<String> M = esRestrictions$Restrictions.M();
        h.d(M, "restrictions.disallowRem…mContextTracksReasonsList");
        builder.disallowRemovingFromContextTracksReasons(d.Z(M));
        List<String> Z = esRestrictions$Restrictions.Z();
        h.d(Z, "restrictions.disallowUpdatingContextReasonsList");
        builder.disallowUpdatingContextReasons(d.Z(Z));
        Restrictions build = builder.build();
        h.d(build, "Restrictions.builder().a…st.toSet())\n    }.build()");
        return build;
    }
}
