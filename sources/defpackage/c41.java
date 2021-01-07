package defpackage;

import com.spotify.mobile.android.audioplayer.domain.AudioFocusUpdate;
import com.spotify.mobile.android.audioplayer.domain.d;
import io.reactivex.functions.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

/* renamed from: c41  reason: default package */
final class c41<T, R> implements l<AudioFocusUpdate, d> {
    public static final c41 a = new c41();

    c41() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d apply(AudioFocusUpdate audioFocusUpdate) {
        AudioFocusUpdate audioFocusUpdate2 = audioFocusUpdate;
        h.e(audioFocusUpdate2, "update");
        int ordinal = audioFocusUpdate2.ordinal();
        if (ordinal == 0) {
            return d.a.a;
        }
        if (ordinal == 1) {
            return d.b.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
