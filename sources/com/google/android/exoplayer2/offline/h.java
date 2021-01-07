package com.google.android.exoplayer2.offline;

import android.os.Handler;
import android.os.Message;

public final /* synthetic */ class h implements Handler.Callback {
    public final /* synthetic */ n a;

    public /* synthetic */ h(n nVar) {
        this.a = nVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        n.e(this.a, message);
        return true;
    }
}
