package com.spotify.mobile.android.service.media.error;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerError;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerError playerError = (PlayerError) obj;
        EISError eISError = EISError.UNAVAILABLE_OFFLINE;
        if (playerError.error().ordinal() == 6) {
            return eISError;
        }
        String reasons = playerError.reasons();
        if (reasons != null && reasons.contains("not_available_offline")) {
            return eISError;
        }
        Logger.l("Error is unexpected and will be ignored in EIS integrations %s.", playerError);
        return EISError.UNKNOWN;
    }
}
