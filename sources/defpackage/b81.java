package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import defpackage.p81;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* renamed from: b81  reason: default package */
public final class b81 {
    private static String[] a(Set<String> set) {
        if (set.isEmpty()) {
            return null;
        }
        return (String[]) set.toArray(new String[0]);
    }

    public static p81 b(Context context) {
        p81[] p81Arr;
        p81[] p81Arr2 = null;
        if (context == null) {
            return null;
        }
        p81.a e = HubsImmutableComponentBundle.builder().p("uri", context.uri()).p("url", context.url()).e("metadata", c(context.metadata()));
        if (context.restrictions().isPresent()) {
            Optional<Restrictions> restrictions = context.restrictions();
            e = e.e("restrictions", !restrictions.isPresent() ? null : HubsImmutableComponentBundle.builder().q("disallow_peeking_prev_reasons", a(restrictions.get().disallowPeekingPrevReasons())).q("disallow_peeking_next_reasons", a(restrictions.get().disallowPeekingNextReasons())).q("disallow_skipping_prev_reasons", a(restrictions.get().disallowSkippingPrevReasons())).q("disallow_skipping_next_reasons", a(restrictions.get().disallowSkippingNextReasons())).q("disallow_pausing_reasons", a(restrictions.get().disallowPausingReasons())).q("disallow_resuming_reasons", a(restrictions.get().disallowResumingReasons())).q("disallow_toggling_repeat_context_reasons", a(restrictions.get().disallowTogglingRepeatContextReasons())).q("disallow_toggling_repeat_track_reasons", a(restrictions.get().disallowTogglingRepeatTrackReasons())).q("disallow_toggling_shuffle_reasons", a(restrictions.get().disallowTogglingShuffleReasons())).q("disallow_seeking_reasons", a(restrictions.get().disallowSeekingReasons())).q("disallow_transferring_playback_reasons", a(restrictions.get().disallowTransferringPlaybackReasons())).q("disallow_remote_control_reasons", a(restrictions.get().disallowRemoteControlReasons())).q("disallow_inserting_into_next_tracks_reasons", a(restrictions.get().disallowInsertingIntoNextTracksReasons())).q("disallow_inserting_into_context_tracks_reasons", a(restrictions.get().disallowInsertingIntoContextTracksReasons())).q("disallow_reordering_in_next_tracks_reasons", a(restrictions.get().disallowReorderingInNextTracksReasons())).q("disallow_reordering_in_context_tracks_reasons", a(restrictions.get().disallowReorderingInContextTracksReasons())).q("disallow_removing_from_next_tracks_reasons", a(restrictions.get().disallowRemovingFromNextTracksReasons())).q("disallow_removing_from_context_tracks_reasons", a(restrictions.get().disallowRemovingFromContextTracksReasons())).q("disallow_updating_context_reasons", a(restrictions.get().disallowUpdatingContextReasons())).q("disallow_set_queue_reasons", a(restrictions.get().disallowSetQueueReasons())).d());
        }
        Optional<ImmutableList<ContextPage>> pages = context.pages();
        if (pages.isPresent()) {
            p81[] p81Arr3 = new p81[pages.get().size()];
            int i = 0;
            while (i < pages.get().size()) {
                ContextPage contextPage = pages.get().get(i);
                p81.a p = HubsImmutableComponentBundle.builder().p("page_url", contextPage.pageUrl()).p("next_page_url", contextPage.nextPageUrl());
                Optional<ImmutableList<ContextTrack>> tracks = contextPage.tracks();
                if (!tracks.isPresent()) {
                    p81Arr = p81Arr2;
                } else {
                    p81Arr = new p81[tracks.get().size()];
                    for (int i2 = 0; i2 < tracks.get().size(); i2++) {
                        ContextTrack contextTrack = tracks.get().get(i2);
                        p81Arr[i2] = HubsImmutableComponentBundle.builder().p("uri", contextTrack.uri()).p("uid", contextTrack.uid()).p("album_uri", contextTrack.metadata().get("album_uri")).p("artist_uri", contextTrack.metadata().get("artist_uri")).p(ContextTrack.Metadata.KEY_PROVIDER, MoreObjects.isNullOrEmpty(contextTrack.provider()) ? null : contextTrack.provider()).e("metadata", c(contextTrack.metadata())).d();
                    }
                }
                p81Arr3[i] = p.f("tracks", p81Arr).e("metadata", c(contextPage.metadata())).d();
                i++;
                p81Arr2 = null;
            }
            p81Arr2 = p81Arr3;
        }
        return e.f("pages", p81Arr2).d();
    }

    public static p81 c(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        p81.a builder = HubsImmutableComponentBundle.builder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builder = builder.p(entry.getKey(), entry.getValue());
        }
        return builder.d();
    }

    public static Context d(p81 p81) {
        Restrictions restrictions;
        String str;
        String str2;
        Map<String, String> map;
        Restrictions restrictions2;
        int i;
        String str3;
        String str4;
        String str5;
        Map<String, String> map2;
        Restrictions restrictions3;
        String str6;
        int i2;
        p81[] p81Arr;
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (p81 == null) {
            return null;
        }
        String str7 = "uri";
        String str8 = "";
        String string = p81.string(str7, str8);
        String string2 = p81.string("url", str8);
        Map<String, String> e = e(p81.bundle("metadata"));
        p81 bundle = p81.bundle("restrictions");
        if (bundle == null) {
            restrictions = null;
        } else {
            restrictions = Restrictions.builder().disallowPeekingPrevReasons(f(bundle, "disallow_peeking_prev_reasons")).disallowPeekingNextReasons(f(bundle, "disallow_peeking_next_reasons")).disallowSkippingPrevReasons(f(bundle, "disallow_skipping_prev_reasons")).disallowSkippingNextReasons(f(bundle, "disallow_skipping_next_reasons")).disallowPausingReasons(f(bundle, "disallow_pausing_reasons")).disallowResumingReasons(f(bundle, "disallow_resuming_reasons")).disallowTogglingRepeatContextReasons(f(bundle, "disallow_toggling_repeat_context_reasons")).disallowTogglingRepeatTrackReasons(f(bundle, "disallow_toggling_repeat_track_reasons")).disallowTogglingShuffleReasons(f(bundle, "disallow_toggling_shuffle_reasons")).disallowSeekingReasons(f(bundle, "disallow_seeking_reasons")).disallowTransferringPlaybackReasons(f(bundle, "disallow_transferring_playback_reasons")).disallowRemoteControlReasons(f(bundle, "disallow_remote_control_reasons")).disallowInsertingIntoNextTracksReasons(f(bundle, "disallow_inserting_into_next_tracks_reasons")).disallowInsertingIntoContextTracksReasons(f(bundle, "disallow_inserting_into_context_tracks_reasons")).disallowReorderingInNextTracksReasons(f(bundle, "disallow_reordering_in_next_tracks_reasons")).disallowReorderingInContextTracksReasons(f(bundle, "disallow_reordering_in_context_tracks_reasons")).disallowRemovingFromNextTracksReasons(f(bundle, "disallow_removing_from_next_tracks_reasons")).disallowRemovingFromContextTracksReasons(f(bundle, "disallow_removing_from_context_tracks_reasons")).disallowUpdatingContextReasons(f(bundle, "disallow_updating_context_reasons")).disallowSetQueueReasons(f(bundle, "disallow_set_queue_reasons")).build();
        }
        p81[] bundleArray = p81.bundleArray("pages");
        if (bundleArray == null) {
            str = string;
            str2 = string2;
            map = e;
            restrictions2 = restrictions;
        } else {
            ArrayList arrayList3 = new ArrayList(bundleArray.length);
            int length = bundleArray.length;
            int i3 = 0;
            while (i3 < length) {
                p81 p812 = bundleArray[i3];
                String string3 = p812.string("page_url", str8);
                String string4 = p812.string("next_page_url", str8);
                p81[] bundleArray2 = p812.bundleArray("tracks");
                if (bundleArray2 == null) {
                    p81Arr = bundleArray;
                    str6 = str7;
                    str3 = str8;
                    str4 = string;
                    str5 = string2;
                    map2 = e;
                    restrictions3 = restrictions;
                    i2 = length;
                    i = i3;
                    arrayList = null;
                } else {
                    p81Arr = bundleArray;
                    arrayList = new ArrayList(bundleArray2.length);
                    int length2 = bundleArray2.length;
                    i2 = length;
                    int i4 = 0;
                    while (i4 < length2) {
                        p81 p813 = bundleArray2[i4];
                        String string5 = p813.string(str7, str8);
                        String string6 = p813.string("uid", str8);
                        String string7 = p813.string("album_uri");
                        String string8 = p813.string("artist_uri");
                        String string9 = p813.string(ContextTrack.Metadata.KEY_PROVIDER, str8);
                        Map<String, String> e2 = e(p813.bundle("metadata"));
                        ImmutableMap.Builder builder = ImmutableMap.builder();
                        builder.putAll(e2);
                        boolean z = true;
                        if (string7 != null) {
                            if (!(((ImmutableMap) e2).get("album_uri") != null)) {
                                builder.mo51put("album_uri", string7);
                            }
                        }
                        if (string8 != null) {
                            if (((ImmutableMap) e2).get("artist_uri") == null) {
                                z = false;
                            }
                            if (!z) {
                                builder.mo51put("artist_uri", string8);
                            }
                        }
                        arrayList.add(ContextTrack.builder(string5).uid(string6).metadata(builder.build()).provider(string9).build());
                        i4++;
                        length2 = length2;
                        bundleArray2 = bundleArray2;
                        str7 = str7;
                        restrictions = restrictions;
                        e = e;
                        string2 = string2;
                        string = string;
                        str8 = str8;
                        i3 = i3;
                    }
                    str6 = str7;
                    str3 = str8;
                    str4 = string;
                    str5 = string2;
                    map2 = e;
                    restrictions3 = restrictions;
                    i = i3;
                }
                ContextPage.Builder metadata = ContextPage.builder().pageUrl(string3).nextPageUrl(string4).metadata(e(p812.bundle("metadata")));
                if (arrayList != null) {
                    metadata.tracks(arrayList);
                }
                arrayList3.add(metadata.build());
                i3 = i + 1;
                bundleArray = p81Arr;
                length = i2;
                str7 = str6;
                restrictions = restrictions3;
                e = map2;
                string2 = str5;
                string = str4;
                str8 = str3;
            }
            str = string;
            str2 = string2;
            map = e;
            restrictions2 = restrictions;
            arrayList2 = arrayList3;
        }
        Context.Builder metadata2 = Context.builder(str).url(str2).metadata(map);
        if (arrayList2 != null) {
            metadata2.pages(arrayList2);
        }
        if (restrictions2 != null) {
            metadata2.restrictions(restrictions2);
        }
        return metadata2.build();
    }

    static Map<String, String> e(p81 p81) {
        if (p81 == null) {
            return ImmutableMap.of();
        }
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (String str : p81.keySet()) {
            String string = p81.string(str);
            if (string != null) {
                builder.mo51put(str, string);
            }
        }
        return builder.build();
    }

    private static Set<String> f(p81 p81, String str) {
        String[] stringArray = p81.stringArray(str);
        if (stringArray == null) {
            return ImmutableSet.of();
        }
        return ImmutableSet.copyOf(stringArray);
    }
}
