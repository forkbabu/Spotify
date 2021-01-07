package com.spotify.mobile.android.cosmos.player.v2;

import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Map;

public final class PlayerTrackUtil {
    private static final String ARTISTS_KEY_FORMAT = "artist_name:%d";

    private PlayerTrackUtil() {
    }

    public static boolean areTitlesEqual(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        return same(playerTrack, playerTrack2) || !(playerTrack == null || playerTrack2 == null || !rw.equal(playerTrack.metadata().get("title"), playerTrack2.metadata().get("title")));
    }

    public static boolean areTracksEqual(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        return areUidsEqual(playerTrack, playerTrack2) && areTitlesEqual(playerTrack, playerTrack2);
    }

    public static boolean areUidsEqual(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        return same(playerTrack, playerTrack2) || !(playerTrack == null || playerTrack2 == null || (!canUseUids(playerTrack, playerTrack2) ? !playerTrack.uri().equals(playerTrack2.uri()) : !playerTrack.uid().equals(playerTrack2.uid())));
    }

    public static boolean areUidsOrUrisEqual(PlayerTrack playerTrack, String str, String str2) {
        return playerTrack != null && ((playerTrack.uid() != null && playerTrack.uid().equals(str)) || (playerTrack.uri() != null && playerTrack.uri().equals(str2)));
    }

    private static boolean canUseUids(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        return !MoreObjects.isNullOrEmpty(playerTrack.uid()) && !MoreObjects.isNullOrEmpty(playerTrack2.uid());
    }

    public static String getAdId(Map<String, String> map) {
        return map.get("ad_id");
    }

    public static String getArtists(PlayerTrack playerTrack) {
        playerTrack.getClass();
        ArrayDeque arrayDeque = new ArrayDeque();
        String str = playerTrack.metadata().get("artist_name");
        int i = 1;
        while (str != null) {
            arrayDeque.add(str);
            str = playerTrack.metadata().get(String.format(Locale.getDefault(), ARTISTS_KEY_FORMAT, Integer.valueOf(i)));
            i++;
        }
        return Joiner.on(", ").join(arrayDeque);
    }

    public static long getDuration(Map<String, String> map) {
        String str = map.get("duration");
        if (str == null || str.isEmpty()) {
            return -1;
        }
        return Long.parseLong(str);
    }

    public static String getTitle(PlayerTrack playerTrack) {
        String str = playerTrack.metadata().get("title");
        return str != null ? str : "";
    }

    public static boolean hasAdId(Map<String, String> map) {
        return !MoreObjects.isNullOrEmpty(map.get("ad_id"));
    }

    public static boolean hasManifestId(Map<String, String> map) {
        return !MoreObjects.isNullOrEmpty(map.get("media.manifest_id"));
    }

    public static boolean is19Plus(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return Boolean.parseBoolean(playerTrack.metadata().get("is_19_plus"));
    }

    public static boolean isAd(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return isAdInMetadata(playerTrack.metadata());
    }

    public static boolean isAdInMetadata(Map<String, String> map) {
        return Boolean.valueOf(map.get("is_advertisement")).booleanValue();
    }

    public static boolean isAudio(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        String str = playerTrack.metadata().get("media.type");
        if ("audio".equals(str) || str == null) {
            return true;
        }
        return false;
    }

    public static boolean isExplicit(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return Boolean.parseBoolean(playerTrack.metadata().get("is_explicit"));
    }

    public static boolean isInterruptionFromAds(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return isInterruptionFromAds(playerTrack.uri(), playerTrack.metadata());
    }

    public static boolean isPodcast(PlayerTrack playerTrack) {
        return playerTrack.uri().startsWith("spotify:episode") && !isVideo(playerTrack);
    }

    public static boolean isSuggestedTrack(PlayerTrack playerTrack) {
        String str;
        if (playerTrack == null || (str = playerTrack.metadata().get(PlayerTrack.Metadata.MFT_INJECTION_SOURCE)) == null || !str.trim().toLowerCase(Locale.ENGLISH).equals("fallback")) {
            return false;
        }
        return true;
    }

    public static boolean isVideo(PlayerTrack playerTrack) {
        if (playerTrack == null) {
            return false;
        }
        return "video".equals(playerTrack.metadata().get("media.type"));
    }

    private static boolean same(PlayerTrack playerTrack, PlayerTrack playerTrack2) {
        return playerTrack == playerTrack2;
    }

    public static boolean isInterruptionFromAds(String str, Map<String, String> map) {
        return str != null && InterruptionUtil.isInterruptionUri(str) && hasAdId(map);
    }
}
