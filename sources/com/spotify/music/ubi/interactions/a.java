package com.spotify.music.ubi.interactions;

import com.spotify.mobile.android.util.l0;

public final class a {
    public static InteractionAction a(String str) {
        return c(str, true);
    }

    public static InteractionAction b(String str) {
        return c(str, false);
    }

    private static InteractionAction c(String str, boolean z) {
        int ordinal = l0.z(str).q().ordinal();
        if (ordinal != 6) {
            if (ordinal != 14) {
                if (!(ordinal == 126 || ordinal == 128)) {
                    if (ordinal != 205) {
                        if (ordinal != 210) {
                            if (!(ordinal == 244 || ordinal == 246)) {
                                if (!(ordinal == 273 || ordinal == 180 || ordinal == 181 || ordinal == 185 || ordinal == 186)) {
                                    return null;
                                }
                            }
                        }
                    }
                }
            }
            return z ? InteractionAction.FOLLOW : InteractionAction.UNFOLLOW;
        }
        return z ? InteractionAction.LIKE : InteractionAction.UNLIKE;
    }
}
