package com.google.android.exoplayer2.offline;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.offline.DownloadHelper;

public final /* synthetic */ class a implements Handler.Callback {
    public final /* synthetic */ DownloadHelper.e a;

    public /* synthetic */ a(DownloadHelper.e eVar) {
        this.a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return DownloadHelper.e.a(this.a, message);
    }
}
