package defpackage;

import com.adjust.sdk.Constants;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.player.options.RepeatMode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.h;

/* renamed from: bqd  reason: default package */
public final class bqd {
    public static byte[] a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Constants.SHA256);
            instance.update(bArr);
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static final RepeatMode b(PlayerState playerState) {
        h.e(playerState, "playerState");
        if (playerState.options().repeatingTrack()) {
            return RepeatMode.TRACK;
        }
        if (playerState.options().repeatingContext()) {
            return RepeatMode.CONTEXT;
        }
        return RepeatMode.NONE;
    }

    public static final boolean c(Restrictions restrictions) {
        h.e(restrictions, "restrictions");
        return restrictions.disallowTogglingRepeatTrackReasons().isEmpty() || restrictions.disallowTogglingRepeatContextReasons().isEmpty();
    }

    public static final RepeatMode d(RepeatMode repeatMode, Restrictions restrictions) {
        RepeatMode repeatMode2 = RepeatMode.TRACK;
        RepeatMode repeatMode3 = RepeatMode.CONTEXT;
        h.e(repeatMode, "$this$next");
        h.e(restrictions, "restrictions");
        int ordinal = repeatMode.ordinal();
        if (ordinal == 0) {
            return restrictions.disallowTogglingRepeatContextReasons().isEmpty() ? repeatMode3 : d(repeatMode3, restrictions);
        }
        if (ordinal != 1) {
            return RepeatMode.NONE;
        }
        if (restrictions.disallowTogglingRepeatTrackReasons().isEmpty()) {
            return repeatMode2;
        }
        return d(repeatMode2, restrictions);
    }
}
