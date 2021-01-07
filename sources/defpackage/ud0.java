package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRecord;
import android.media.AudioRouting;
import android.os.Build;
import com.spotify.audiorecord.api.AudioRecordingException;
import com.spotify.audiorecord.api.e;
import com.spotify.base.java.logging.Logger;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.subjects.a;
import io.reactivex.subjects.c;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: ud0  reason: default package */
public class ud0 implements e {
    private g<ByteBuffer> a;
    private final c<Boolean> b;
    private final sd0 c;
    private final rd0 d;
    private int e;

    public ud0() {
        this.c = Build.VERSION.SDK_INT >= 23 ? new sd0() : null;
        this.b = a.i1(Boolean.FALSE).g1();
        this.d = new rd0(this);
        try {
            l();
        } catch (AudioRecordingException e2) {
            Logger.o(e2, "Unable to initialize audio recording", new Object[0]);
        }
    }

    private synchronized void l() {
        td0 td0 = new td0(this.c);
        this.e = td0.b();
        this.a = g.n0(td0, new od0(td0), new nd0(this)).Z();
    }

    @Override // com.spotify.audiorecord.api.b
    public void a() {
        this.d.e();
    }

    @Override // com.spotify.audiorecord.api.e
    public boolean b() {
        return true;
    }

    @Override // com.spotify.audiorecord.api.e
    public AudioDeviceInfo c() {
        sd0 sd0;
        if (Build.VERSION.SDK_INT < 23 || (sd0 = this.c) == null) {
            return null;
        }
        return sd0.a();
    }

    @Override // com.spotify.audiorecord.api.b
    public void d() {
        this.d.d();
    }

    @Override // com.spotify.audiorecord.api.b
    public g<ByteBuffer> e() {
        if (!this.d.a()) {
            return i();
        }
        rd0 rd0 = this.d;
        rd0.getClass();
        return g.p(new md0(rd0), BackpressureStrategy.DROP).e0(io.reactivex.schedulers.a.c());
    }

    @Override // com.spotify.audiorecord.api.e
    public /* synthetic */ l f() {
        return com.spotify.audiorecord.api.c.a(this);
    }

    @Override // com.spotify.audiorecord.api.e
    public String g() {
        return String.format(Locale.US, "content-type: audio/l16; rate=%s", Integer.valueOf(this.e));
    }

    @Override // com.spotify.audiorecord.api.g
    public s<Boolean> h() {
        return this.b;
    }

    @Override // com.spotify.audiorecord.api.e
    public g<ByteBuffer> i() {
        if (this.a == null) {
            try {
                l();
            } catch (AudioRecordingException e2) {
                return g.B(e2);
            }
        }
        g<ByteBuffer> gVar = this.a;
        return gVar != null ? gVar : g.B(new AudioRecordingException("INVALID_BUFFER_INIT", new IllegalStateException("Invalid audio record, see previous errors.")));
    }

    @Override // com.spotify.audiorecord.api.b
    public void j(byte[] bArr) {
        this.d.c(bArr);
    }

    @Override // com.spotify.audiorecord.api.g
    public void k(boolean z) {
        this.b.onNext(Boolean.valueOf(z));
    }

    public void m(AudioRecord audioRecord) {
        Logger.b("Disposing recorder", new Object[0]);
        AudioRecord.OnRoutingChangedListener onRoutingChangedListener = this.c;
        if (onRoutingChangedListener != null && audioRecord != null) {
            Logger.g("Removing audio routing listener.", new Object[0]);
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                audioRecord.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) onRoutingChangedListener);
            } else if (i == 23) {
                audioRecord.removeOnRoutingChangedListener(onRoutingChangedListener);
            }
        }
    }
}
