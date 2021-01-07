package defpackage;

import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import io.reactivex.functions.g;

/* renamed from: pm1  reason: default package */
public final /* synthetic */ class pm1 implements g {
    public final /* synthetic */ mn1 a;

    public /* synthetic */ pm1(mn1 mn1) {
        this.a = mn1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((HeadsetPluggedStatus) obj);
    }
}
