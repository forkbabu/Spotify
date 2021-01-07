package defpackage;

import android.media.AudioRecord;
import com.spotify.audiorecord.api.AudioRecordingException;
import com.spotify.base.java.logging.Logger;
import io.reactivex.h;
import io.reactivex.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: wd0  reason: default package */
class wd0 implements i<ByteBuffer> {
    private final AudioRecord a;
    private final int b;

    wd0(AudioRecord audioRecord, int i) {
        this.a = audioRecord;
        this.b = i;
    }

    public /* synthetic */ void a() {
        this.a.release();
        Logger.b("Subscriber cancelled", new Object[0]);
    }

    @Override // io.reactivex.i
    public void subscribe(h<ByteBuffer> hVar) {
        Logger.b("Starting to record 16bit mono audio samples at %dkHz", Integer.valueOf(this.a.getSampleRate()));
        hVar.e(new pd0(this));
        try {
            this.a.startRecording();
            while (true) {
                if (this.a.getRecordingState() == 3) {
                    ByteBuffer order = ByteBuffer.allocateDirect(this.b).order(ByteOrder.nativeOrder());
                    int read = this.a.read(order, this.b);
                    if (read < 0 && !hVar.isCancelled()) {
                        hVar.onError(new AudioRecordingException("NO_MIC_DATA", new Exception(je.p0("Recording failed; code: ", read))));
                        break;
                    } else if (read > 0 && !hVar.isCancelled()) {
                        hVar.onNext(order);
                    }
                } else {
                    break;
                }
            }
            if (!hVar.isCancelled()) {
                hVar.onComplete();
            }
        } catch (IllegalStateException e) {
            throw new AudioRecordingException("START", e);
        }
    }
}
