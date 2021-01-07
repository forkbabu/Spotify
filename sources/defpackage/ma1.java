package defpackage;

import android.content.BroadcastReceiver;
import io.reactivex.functions.f;

/* renamed from: ma1  reason: default package */
public final /* synthetic */ class ma1 implements f {
    public final /* synthetic */ qa1 a;
    public final /* synthetic */ BroadcastReceiver b;

    public /* synthetic */ ma1(qa1 qa1, BroadcastReceiver broadcastReceiver) {
        this.a = qa1;
        this.b = broadcastReceiver;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.j(this.b);
    }
}
