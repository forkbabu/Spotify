package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.d;

/* renamed from: su5  reason: default package */
public final /* synthetic */ class su5 implements d {
    public static final /* synthetic */ su5 a = new su5();

    private /* synthetic */ su5() {
    }

    @Override // io.reactivex.functions.d
    public final boolean a(Object obj, Object obj2) {
        Optional optional = (Optional) obj;
        Optional optional2 = (Optional) obj2;
        if (optional.isPresent() && optional2.isPresent()) {
            Optional<ContextTrack> track = ((PlayerState) optional.get()).track();
            track.getClass();
            if (track.equals(((PlayerState) optional2.get()).track())) {
                return true;
            }
        }
        return false;
    }
}
