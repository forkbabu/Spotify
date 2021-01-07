package com.spotify.music.sushi;

import android.os.Bundle;
import androidx.fragment.app.o;
import com.spotify.player.model.BitrateLevel;
import kotlin.jvm.internal.h;

public final class b implements d {
    private final o a;

    public b(o oVar) {
        h.e(oVar, "fragmentManager");
        this.a = oVar;
    }

    @Override // com.spotify.music.sushi.d
    public void a(BitrateLevel bitrateLevel) {
        h.e(bitrateLevel, "bitrateLevel");
        h.e(bitrateLevel, "currentLevel");
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_current_level", bitrateLevel);
        SushiBottomSheetFragment sushiBottomSheetFragment = new SushiBottomSheetFragment();
        sushiBottomSheetFragment.r4(bundle);
        sushiBottomSheetFragment.Y4(this.a, SushiBottomSheetFragment.class.getSimpleName());
    }
}
