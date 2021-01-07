package defpackage;

import android.media.AudioRecord;
import android.media.AudioRouting;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import android.os.Handler;
import com.spotify.audiorecord.api.AudioRecordingException;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: td0  reason: default package */
public class td0 implements Callable<AudioRecord> {
    private static final int[] c = {16000, 8000};
    private a a = a.c;
    private final sd0 b;

    /* access modifiers changed from: package-private */
    /* renamed from: td0$a */
    public static class a {
        private static final a c = new a(0, 0);
        final int a;
        final int b;

        a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    td0(sd0 sd0) {
        this.b = sd0;
        int[] iArr = c;
        for (int i : iArr) {
            int minBufferSize = AudioRecord.getMinBufferSize(i, 16, 2);
            if (minBufferSize != -1 && minBufferSize != -2) {
                this.a = new a(i, Math.max(minBufferSize, 1024));
                return;
            }
        }
    }

    public int a() {
        return this.a.b;
    }

    public int b() {
        return this.a.a;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public AudioRecord call() {
        NoiseSuppressor create;
        AcousticEchoCanceler create2;
        if (this.a != a.c) {
            try {
                a aVar = this.a;
                AudioRecord audioRecord = new AudioRecord(6, aVar.a, 16, 2, aVar.b);
                int audioSessionId = audioRecord.getAudioSessionId();
                if (AcousticEchoCanceler.isAvailable() && (create2 = AcousticEchoCanceler.create(audioSessionId)) != null) {
                    create2.setEnabled(true);
                    Logger.b("Acoustic Echo Canceler enabled %b", Boolean.valueOf(create2.getEnabled()));
                }
                if (NoiseSuppressor.isAvailable() && (create = NoiseSuppressor.create(audioSessionId)) != null) {
                    create.setEnabled(true);
                    Logger.b("Noise Suppressor enabled %b", Boolean.valueOf(create.getEnabled()));
                }
                sd0 sd0 = this.b;
                if (sd0 != null) {
                    Logger.g("Registering audio routing listener.", new Object[0]);
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 24) {
                        audioRecord.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) sd0, (Handler) null);
                    } else if (i == 23) {
                        audioRecord.addOnRoutingChangedListener((AudioRecord.OnRoutingChangedListener) sd0, (Handler) null);
                    }
                }
                if (audioRecord.getState() == 1) {
                    return audioRecord;
                }
                audioRecord.release();
                StringBuilder V0 = je.V0("Cannot create AudioRecord, state=");
                int state = audioRecord.getState();
                V0.append(state != 0 ? state != 1 ? "UNKNOWN" : "INITIALIZED" : "UNINITIALIZED");
                throw new AudioRecordingException("INITIALIZATION", new IllegalArgumentException(V0.toString()));
            } catch (IllegalArgumentException e) {
                throw new AudioRecordingException("INITIALIZATION", e);
            }
        } else {
            throw new AudioRecordingException("INVALID_BUFFER_SIZE", new IllegalArgumentException("No supported bitrate for AudioRecord"));
        }
    }
}
