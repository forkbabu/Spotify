package defpackage;

import com.spotify.music.libs.fullscreen.story.domain.i;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: mc5  reason: default package */
public final /* synthetic */ class mc5 implements l {
    public static final /* synthetic */ mc5 a = new mc5();

    private /* synthetic */ mc5() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return new i.g(!playerState.isPaused() && playerState.isPlaying());
    }
}
