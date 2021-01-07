package com.spotify.music.superbird.setup;

import com.spotify.mobile.android.util.d0;
import com.spotify.player.model.BitrateLevel;
import kotlin.jvm.internal.h;

public final class a {
    public static final String a(BitrateLevel bitrateLevel) {
        h.e(bitrateLevel, "$this$title");
        if (bitrateLevel == BitrateLevel.LOW) {
            return d0.c("879f7b750d714368", "7861377562713468");
        }
        if (bitrateLevel == BitrateLevel.NORMAL) {
            return d0.c("c89b283559791f69596717720467", "3765663536796d69346776726867");
        }
        if (bitrateLevel == BitrateLevel.HIGH) {
            return d0.c("90cd7b7a1a781e321971", "6f33337a737879327171");
        }
        if (bitrateLevel == BitrateLevel.VERYHIGH) {
            return d0.c("878b383652761974156f1034236a0d610d350464", "78756e3637766b746c6f30346b6a64616a356c64");
        }
        if (bitrateLevel == BitrateLevel.NORMALIZED) {
            return d0.c("c68631365863276b1130", "397879363163616b7830");
        }
        return d0.c("99892f335c341e6a5b750972187a0c7a", "66777a333234756a357566726f7a627a");
    }
}
