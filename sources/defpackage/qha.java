package defpackage;

import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import io.reactivex.functions.g;

/* renamed from: qha  reason: default package */
public final /* synthetic */ class qha implements g {
    public final /* synthetic */ rha a;

    public /* synthetic */ qha(rha rha) {
        this.a = rha;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((HeadsetPluggedStatus) obj);
    }
}
