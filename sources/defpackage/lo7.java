package defpackage;

import com.spotify.music.features.profile.saveprofile.domain.SaveProfileState;
import com.spotify.music.features.profile.saveprofile.domain.r;
import io.reactivex.functions.l;

/* renamed from: lo7  reason: default package */
public final /* synthetic */ class lo7 implements l {
    public static final /* synthetic */ lo7 a = new lo7();

    private /* synthetic */ lo7() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((r) obj).c() != SaveProfileState.IDLE);
    }
}
