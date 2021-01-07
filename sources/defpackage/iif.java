package defpackage;

import com.sensory.speech.snsr.SnsrStream;
import com.spotify.audiorecord.api.AudioRecordingType;
import com.spotify.audiorecord.api.e;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.WakeWordProviderError;
import com.spotify.wakeword.sensory.z;
import io.reactivex.disposables.d;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* renamed from: iif  reason: default package */
public class iif implements SnsrStream.Provider {
    private final BlockingQueue<ByteBuffer> a = new ArrayBlockingQueue(64);
    private final d b = new d();
    private final Map<AudioRecordingType, e> c;
    private final fif d;
    private final z e;
    private ByteBuffer f = ByteBuffer.allocate(0);

    public iif(Map<AudioRecordingType, e> map, fif fif, z zVar) {
        this.c = map;
        this.d = fif;
        this.e = zVar;
    }

    public static void b(iif iif, ByteBuffer byteBuffer) {
        if (!iif.a.offer(byteBuffer)) {
            Logger.b("addToBuffer buffer overrun", new Object[0]);
        }
    }

    public /* synthetic */ void a(Throwable th) {
        String str;
        Logger.b(th.toString(), new Object[0]);
        fif fif = this.d;
        WakeWordProviderError.b n = WakeWordProviderError.n();
        n.p(this.e.a());
        n.o("Sensory");
        n.n("AUDIO_RECORD_FAILED");
        if (th.getMessage() == null) {
            str = "UNKNOWN";
        } else {
            str = th.getMessage();
        }
        n.m(str);
        fif.b((WakeWordProviderError) n.build());
    }

    @Override // com.sensory.speech.snsr.SnsrStream.Provider
    public long onClose() {
        Logger.b("onClose [%s]", Thread.currentThread().toString());
        if (this.b.d()) {
            return 0;
        }
        this.b.dispose();
        return 0;
    }

    @Override // com.sensory.speech.snsr.SnsrStream.Provider
    public long onOpen() {
        Logger.b("onOpen [%s]", Thread.currentThread().toString());
        e eVar = this.c.get(AudioRecordingType.MICROPHONE);
        if (eVar == null) {
            return -5;
        }
        this.b.b(eVar.i().subscribe(new hif(this), new gif(this)));
        return 0;
    }

    @Override // com.sensory.speech.snsr.SnsrStream.Provider
    public long onRead(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            if (this.f.remaining() == 0) {
                try {
                    this.f = this.a.take();
                } catch (InterruptedException unused) {
                    return -2;
                }
            }
            int min = Math.min(this.f.remaining(), bArr.length - i);
            this.f.get(bArr, i, min);
            i += min;
        }
        if (i == 0) {
            return -1;
        }
        return (long) i;
    }

    @Override // com.sensory.speech.snsr.SnsrStream.Provider
    public void onRelease() {
        Logger.b("onRelease [%s]", Thread.currentThread().toString());
        if (!this.b.d()) {
            this.b.dispose();
        }
    }

    @Override // com.sensory.speech.snsr.SnsrStream.Provider
    public long onWrite(byte[] bArr) {
        return -4;
    }
}
