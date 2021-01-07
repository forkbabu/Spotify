package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.tagreader.SPTTagReader;
import com.spotify.music.spotlets.scannables.model.a;
import java.util.concurrent.Callable;

/* renamed from: bhd  reason: default package */
public final /* synthetic */ class bhd implements Callable {
    public final /* synthetic */ a a;

    public /* synthetic */ bhd(a aVar) {
        this.a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a aVar = this.a;
        byte[] bArr = aVar.a;
        int i = aVar.b;
        String[] decodeWaveformTag = SPTTagReader.decodeWaveformTag(bArr, 0, i, aVar.c, i);
        if (decodeWaveformTag == null || decodeWaveformTag.length <= 0) {
            return Optional.absent();
        }
        return Optional.of(decodeWaveformTag[0]);
    }
}
