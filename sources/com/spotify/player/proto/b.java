package com.spotify.player.proto;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.BaseEncoding;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.spotify.player.esperanto.proto.EsContext$Context;
import com.spotify.player.esperanto.proto.EsContextPage$ContextPage;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.spotify.player.esperanto.proto.EsRestrictions$Restrictions;
import com.spotify.player.esperanto.proto.EsSkipToTrack$SkipToTrack;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PrefetchLevel;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import defpackage.pxd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import kotlin.text.a;

public final class b {
    public static final EsContext$Context a(Context context) {
        h.e(context, "context");
        EsContext$Context.a p = EsContext$Context.p();
        Optional<ImmutableList<ContextPage>> pages = context.pages();
        h.d(pages, "context.pages()");
        if (pages.isPresent()) {
            p.o(true);
            ImmutableList<ContextPage> immutableList = context.pages().get();
            h.d(immutableList, "context.pages().get()");
            ImmutableList<ContextPage> immutableList2 = immutableList;
            ArrayList arrayList = new ArrayList(d.e(immutableList2, 10));
            for (T t : immutableList2) {
                h.e(t, "page");
                EsContextPage$ContextPage.a o = EsContextPage$ContextPage.o();
                Optional<ImmutableList<ContextTrack>> tracks = t.tracks();
                h.d(tracks, "page.tracks()");
                if (tracks.isPresent()) {
                    o.o(true);
                    ImmutableList<ContextTrack> immutableList3 = t.tracks().get();
                    h.d(immutableList3, "page.tracks().get()");
                    ImmutableList<ContextTrack> immutableList4 = immutableList3;
                    ArrayList arrayList2 = new ArrayList(d.e(immutableList4, 10));
                    Iterator<T> it = immutableList4.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(com.spotify.paste.widgets.b.c(it.next()));
                    }
                    o.m(arrayList2);
                }
                o.n(t.metadata());
                o.q(t.pageUrl());
                o.p(t.nextPageUrl());
                GeneratedMessageLite build = o.build();
                h.d(build, "EsContextPage.ContextPag…xtPageUrl()\n    }.build()");
                arrayList.add((EsContextPage$ContextPage) build);
            }
            p.m(arrayList);
        }
        p.n(context.metadata());
        p.q(context.uri());
        p.r(context.url());
        Optional<Restrictions> restrictions = context.restrictions();
        h.d(restrictions, "context.restrictions()");
        if (restrictions.isPresent()) {
            Restrictions restrictions2 = context.restrictions().get();
            h.d(restrictions2, "context.restrictions().get()");
            Restrictions restrictions3 = restrictions2;
            h.e(restrictions3, "restrictions");
            EsRestrictions$Restrictions.a a0 = EsRestrictions$Restrictions.a0();
            a0.p(restrictions3.disallowPausingReasons());
            a0.x(restrictions3.disallowResumingReasons());
            a0.y(restrictions3.disallowSeekingReasons());
            a0.r(restrictions3.disallowPeekingPrevReasons());
            a0.q(restrictions3.disallowPeekingNextReasons());
            a0.B(restrictions3.disallowSkippingPrevReasons());
            a0.A(restrictions3.disallowSkippingNextReasons());
            a0.C(restrictions3.disallowTogglingRepeatContextReasons());
            a0.D(restrictions3.disallowTogglingRepeatTrackReasons());
            a0.E(restrictions3.disallowTogglingShuffleReasons());
            a0.z(restrictions3.disallowSetQueueReasons());
            a0.o(restrictions3.disallowInterruptingPlaybackReasons());
            a0.F(restrictions3.disallowTransferringPlaybackReasons());
            a0.s(restrictions3.disallowRemoteControlReasons());
            a0.n(restrictions3.disallowInsertingIntoNextTracksReasons());
            a0.m(restrictions3.disallowInsertingIntoContextTracksReasons());
            a0.w(restrictions3.disallowReorderingInNextTracksReasons());
            a0.v(restrictions3.disallowReorderingInContextTracksReasons());
            a0.u(restrictions3.disallowRemovingFromNextTracksReasons());
            a0.t(restrictions3.disallowRemovingFromContextTracksReasons());
            a0.G(restrictions3.disallowUpdatingContextReasons());
            GeneratedMessageLite build2 = a0.build();
            h.d(build2, "EsRestrictions.Restricti…tReasons())\n    }.build()");
            p.p((EsRestrictions$Restrictions) build2);
        }
        GeneratedMessageLite build3 = p.build();
        h.d(build3, "EsContext.Context.newBui…)\n        }\n    }.build()");
        return (EsContext$Context) build3;
    }

    public static final EsPreparePlayOptions$PreparePlayOptions b(PreparePlayOptions preparePlayOptions, pxd pxd) {
        EsPreparePlayOptions$PreparePlayOptions.AudioStream audioStream;
        int ordinal;
        EsPreparePlayOptions$PreparePlayOptions.PrefetchLevel prefetchLevel;
        int ordinal2;
        h.e(preparePlayOptions, "preparePlayOptions");
        h.e(pxd, "serializer");
        EsPreparePlayOptions$PreparePlayOptions.a w = EsPreparePlayOptions$PreparePlayOptions.w();
        Optional<String> playbackId = preparePlayOptions.playbackId();
        h.d(playbackId, "preparePlayOptions.playbackId()");
        if (playbackId.isPresent()) {
            String str = preparePlayOptions.playbackId().get();
            h.d(str, "preparePlayOptions.playbackId().get()");
            String str2 = str;
            h.e(str2, "id");
            BaseEncoding base16 = BaseEncoding.base16();
            Locale locale = Locale.US;
            h.d(locale, "java.util.Locale.US");
            String upperCase = str2.toUpperCase(locale);
            h.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            w.s(ByteString.h(base16.decode(upperCase)));
        }
        Optional<Boolean> alwaysPlaySomething = preparePlayOptions.alwaysPlaySomething();
        h.d(alwaysPlaySomething, "preparePlayOptions.alwaysPlaySomething()");
        if (alwaysPlaySomething.isPresent()) {
            Boolean bool = preparePlayOptions.alwaysPlaySomething().get();
            h.d(bool, "preparePlayOptions.alwaysPlaySomething().get()");
            w.o(bool.booleanValue());
        }
        Optional<SkipToTrack> skipTo = preparePlayOptions.skipTo();
        h.d(skipTo, "preparePlayOptions.skipTo()");
        if (skipTo.isPresent()) {
            SkipToTrack skipToTrack = preparePlayOptions.skipTo().get();
            h.d(skipToTrack, "preparePlayOptions.skipTo().get()");
            SkipToTrack skipToTrack2 = skipToTrack;
            h.e(skipToTrack2, "skipToTrack");
            EsSkipToTrack$SkipToTrack.a o = EsSkipToTrack$SkipToTrack.o();
            o.n(skipToTrack2.pageUrl().or((Optional<String>) ""));
            Optional<Long> pageIndex = skipToTrack2.pageIndex();
            h.d(pageIndex, "skipToTrack.pageIndex()");
            if (pageIndex.isPresent()) {
                EsOptional$OptionalInt64.a m = EsOptional$OptionalInt64.m();
                Long l = skipToTrack2.pageIndex().get();
                h.d(l, "skipToTrack.pageIndex().get()");
                m.m(l.longValue());
                o.m((EsOptional$OptionalInt64) m.build());
            }
            o.p(skipToTrack2.trackUid().or((Optional<String>) ""));
            o.q(skipToTrack2.trackUri().or((Optional<String>) ""));
            Optional<Long> trackIndex = skipToTrack2.trackIndex();
            h.d(trackIndex, "skipToTrack.trackIndex()");
            if (trackIndex.isPresent()) {
                EsOptional$OptionalInt64.a m2 = EsOptional$OptionalInt64.m();
                Long l2 = skipToTrack2.trackIndex().get();
                h.d(l2, "skipToTrack.trackIndex().get()");
                m2.m(l2.longValue());
                o.o((EsOptional$OptionalInt64) m2.build());
            }
            GeneratedMessageLite build = o.build();
            h.d(build, "EsSkipToTrack.SkipToTrac…)\n        }\n    }.build()");
            w.x((EsSkipToTrack$SkipToTrack) build);
        }
        Optional<Long> seekTo = preparePlayOptions.seekTo();
        h.d(seekTo, "preparePlayOptions.seekTo()");
        if (seekTo.isPresent()) {
            EsOptional$OptionalInt64.a m3 = EsOptional$OptionalInt64.m();
            Long l3 = preparePlayOptions.seekTo().get();
            h.d(l3, "preparePlayOptions.seekTo().get()");
            m3.m(l3.longValue());
            w.v((EsOptional$OptionalInt64) m3.build());
        }
        Optional<Boolean> initiallyPaused = preparePlayOptions.initiallyPaused();
        h.d(initiallyPaused, "preparePlayOptions.initiallyPaused()");
        if (initiallyPaused.isPresent()) {
            Boolean bool2 = preparePlayOptions.initiallyPaused().get();
            h.d(bool2, "preparePlayOptions.initiallyPaused().get()");
            w.q(bool2.booleanValue());
        }
        Optional<Boolean> systemInitiated = preparePlayOptions.systemInitiated();
        h.d(systemInitiated, "preparePlayOptions.systemInitiated()");
        if (systemInitiated.isPresent()) {
            Boolean bool3 = preparePlayOptions.systemInitiated().get();
            h.d(bool3, "preparePlayOptions.systemInitiated().get()");
            w.y(bool3.booleanValue());
        }
        Optional<PlayerOptionOverrides> playerOptionsOverride = preparePlayOptions.playerOptionsOverride();
        h.d(playerOptionsOverride, "preparePlayOptions.playerOptionsOverride()");
        if (playerOptionsOverride.isPresent()) {
            PlayerOptionOverrides playerOptionOverrides = preparePlayOptions.playerOptionsOverride().get();
            h.d(playerOptionOverrides, "preparePlayOptions.playerOptionsOverride().get()");
            PlayerOptionOverrides playerOptionOverrides2 = playerOptionOverrides;
            h.e(playerOptionOverrides2, "overrides");
            EsContextPlayerOptions$ContextPlayerOptionOverrides.a m4 = EsContextPlayerOptions$ContextPlayerOptionOverrides.m();
            Optional<Boolean> shufflingContext = playerOptionOverrides2.shufflingContext();
            h.d(shufflingContext, "overrides.shufflingContext()");
            if (shufflingContext.isPresent()) {
                EsOptional$OptionalBoolean.a i = EsOptional$OptionalBoolean.i();
                Boolean bool4 = playerOptionOverrides2.shufflingContext().get();
                h.d(bool4, "overrides.shufflingContext().get()");
                i.m(bool4.booleanValue());
                m4.o((EsOptional$OptionalBoolean) i.build());
            }
            Optional<Boolean> repeatingContext = playerOptionOverrides2.repeatingContext();
            h.d(repeatingContext, "overrides.repeatingContext()");
            if (repeatingContext.isPresent()) {
                EsOptional$OptionalBoolean.a i2 = EsOptional$OptionalBoolean.i();
                Boolean bool5 = playerOptionOverrides2.repeatingContext().get();
                h.d(bool5, "overrides.repeatingContext().get()");
                i2.m(bool5.booleanValue());
                m4.m((EsOptional$OptionalBoolean) i2.build());
            }
            Optional<Boolean> repeatingTrack = playerOptionOverrides2.repeatingTrack();
            h.d(repeatingTrack, "overrides.repeatingTrack()");
            if (repeatingTrack.isPresent()) {
                EsOptional$OptionalBoolean.a i3 = EsOptional$OptionalBoolean.i();
                Boolean bool6 = playerOptionOverrides2.repeatingTrack().get();
                h.d(bool6, "overrides.repeatingTrack().get()");
                i3.m(bool6.booleanValue());
                m4.n((EsOptional$OptionalBoolean) i3.build());
            }
            GeneratedMessageLite build2 = m4.build();
            h.d(build2, "EsContextPlayerOptions.C…      }\n        }.build()");
            w.t((EsContextPlayerOptions$ContextPlayerOptionOverrides) build2);
        }
        Optional<Suppressions> suppressions = preparePlayOptions.suppressions();
        h.d(suppressions, "preparePlayOptions.suppressions()");
        if (suppressions.isPresent()) {
            w.m(preparePlayOptions.suppressions().get().providers());
        }
        Optional<PrefetchLevel> prefetchLevel2 = preparePlayOptions.prefetchLevel();
        h.d(prefetchLevel2, "preparePlayOptions.prefetchLevel()");
        if (prefetchLevel2.isPresent()) {
            PrefetchLevel prefetchLevel3 = preparePlayOptions.prefetchLevel().get();
            if (prefetchLevel3 == null || (ordinal2 = prefetchLevel3.ordinal()) == 0) {
                prefetchLevel = EsPreparePlayOptions$PreparePlayOptions.PrefetchLevel.NONE;
            } else if (ordinal2 == 1) {
                prefetchLevel = EsPreparePlayOptions$PreparePlayOptions.PrefetchLevel.MEDIA;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            w.u(prefetchLevel);
        }
        Optional<AudioStream> audioStream2 = preparePlayOptions.audioStream();
        h.d(audioStream2, "preparePlayOptions.audioStream()");
        if (audioStream2.isPresent()) {
            AudioStream audioStream3 = preparePlayOptions.audioStream().get();
            if (audioStream3 == null || (ordinal = audioStream3.ordinal()) == 0) {
                audioStream = EsPreparePlayOptions$PreparePlayOptions.AudioStream.DEFAULT;
            } else if (ordinal == 1) {
                audioStream = EsPreparePlayOptions$PreparePlayOptions.AudioStream.ALARM;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            w.p(audioStream);
        }
        Optional<String> sessionId = preparePlayOptions.sessionId();
        h.d(sessionId, "preparePlayOptions.sessionId()");
        if (sessionId.isPresent()) {
            w.w(preparePlayOptions.sessionId().get());
        }
        Optional<String> license = preparePlayOptions.license();
        h.d(license, "preparePlayOptions.license()");
        if (license.isPresent()) {
            w.r(preparePlayOptions.license().get());
        }
        ImmutableMap<String, Object> configurationOverride = preparePlayOptions.configurationOverride();
        h.d(configurationOverride, "preparePlayOptions.configurationOverride()");
        for (Map.Entry<String, Object> entry : configurationOverride.entrySet()) {
            String key = entry.getKey();
            pxd.a<byte[]> b = pxd.b(entry.getValue());
            if (b instanceof pxd.a.b) {
                byte[] bArr = (byte[]) ((pxd.a.b) b).a();
                h.e(bArr, "$this$decodeToString");
                w.n(key, new String(bArr, a.a));
            } else if (b instanceof pxd.a.C0670a) {
                StringBuilder V0 = je.V0("Unexpected serialization failure: ");
                V0.append(((pxd.a.C0670a) b).a());
                throw new SerializationException(V0.toString());
            }
        }
        GeneratedMessageLite build3 = w.build();
        h.d(build3, "EsPreparePlayOptions.Pre…      }\n        }.build()");
        return (EsPreparePlayOptions$PreparePlayOptions) build3;
    }
}
