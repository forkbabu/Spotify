package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;

public class PlayerQueueUtil {
    private static final Pattern DELIMITER_PATTERN = Pattern.compile("spotify:delimiter|spotify:meta:.*", 2);
    static final String SPOTIFY_DELIMITER_V1 = "spotify:delimiter";
    private static final String SPOTIFY_METADATA_MARKER = "spotify:meta:.*";
    static final String SPOTIFY_META_DELIMITER = "spotify:meta:delimiter";

    public static boolean isDelimiter(PlayerTrack playerTrack) {
        return DELIMITER_PATTERN.matcher(playerTrack.uri()).matches();
    }

    public static boolean isQueued(PlayerTrack playerTrack) {
        return Boolean.valueOf(playerTrack.metadata().get("is_queued")).booleanValue();
    }

    public static PlayerTrack queuedExplicitly(PlayerTrack playerTrack, boolean z) {
        String str;
        if (z == isQueued(playerTrack)) {
            return playerTrack;
        }
        String str2 = playerTrack.metadata().get("album_uri");
        String str3 = playerTrack.metadata().get("artist_uri");
        HashMap hashMap = new HashMap(playerTrack.metadata());
        String uid = playerTrack.uid();
        if (z) {
            hashMap.put("is_queued", Boolean.toString(true));
            str = "";
        } else {
            hashMap.remove("is_queued");
            str = uid;
        }
        return PlayerTrack.create(playerTrack.uri(), str, str2, str3, playerTrack.provider(), ImmutableMap.copyOf(hashMap));
    }

    public PlayerQueue addNextTracks(PlayerQueue playerQueue, Collection<PlayerTrack> collection) {
        PlayerTrack[] nextTracks = playerQueue.nextTracks();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (PlayerTrack playerTrack : nextTracks) {
            if (Boolean.valueOf(playerTrack.metadata().get("is_queued")).booleanValue()) {
                arrayList.add(playerTrack);
            } else {
                if (collection.contains(playerTrack)) {
                    arrayList2.add(playerTrack);
                    collection.remove(playerTrack);
                }
                arrayList3.add(playerTrack);
            }
        }
        for (PlayerTrack playerTrack2 : collection) {
            if (!isDelimiter(playerTrack2)) {
                arrayList2.add(playerTrack2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(queuedExplicitly((PlayerTrack) it.next(), true));
        }
        arrayList.addAll(arrayList3);
        return new PlayerQueue(playerQueue.revision(), playerQueue.track(), (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]), playerQueue.prevTracks());
    }

    public PlayerQueue removeNextTracks(PlayerQueue playerQueue, Collection<PlayerTrack> collection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PlayerTrack[] nextTracks = playerQueue.nextTracks();
        for (PlayerTrack playerTrack : nextTracks) {
            linkedHashMap.put(PlayTrackQueueUtils.getGloballyUniqueUid(playerTrack), playerTrack);
        }
        for (PlayerTrack playerTrack2 : collection) {
            linkedHashMap.remove(PlayTrackQueueUtils.getGloballyUniqueUid(playerTrack2));
        }
        return new PlayerQueue(playerQueue.revision(), playerQueue.track(), (PlayerTrack[]) linkedHashMap.values().toArray(new PlayerTrack[0]), playerQueue.prevTracks());
    }
}
