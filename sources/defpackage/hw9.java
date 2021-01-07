package defpackage;

import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import io.reactivex.functions.l;

/* renamed from: hw9  reason: default package */
public final /* synthetic */ class hw9 implements l {
    public static final /* synthetic */ hw9 a = new hw9();

    private /* synthetic */ hw9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((HeadsetPluggedStatus) obj) == HeadsetPluggedStatus.PLUGGED);
    }
}
