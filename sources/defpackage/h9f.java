package defpackage;

import android.media.AudioDeviceInfo;
import com.spotify.audiorecord.api.a;
import com.spotify.audiorecord.api.e;
import com.spotify.audiorecord.api.f;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.s;
import java.nio.ByteBuffer;

/* renamed from: h9f  reason: default package */
public class h9f implements e {
    private final g<ByteBuffer> a;

    public h9f(g<ByteBuffer> gVar) {
        this.a = gVar;
    }

    @Override // com.spotify.audiorecord.api.b
    public /* synthetic */ void a() {
        a.d(this);
    }

    @Override // com.spotify.audiorecord.api.e
    public boolean b() {
        return false;
    }

    @Override // com.spotify.audiorecord.api.e
    public AudioDeviceInfo c() {
        return null;
    }

    @Override // com.spotify.audiorecord.api.b
    public /* synthetic */ void d() {
        a.c(this);
    }

    @Override // com.spotify.audiorecord.api.b
    public /* synthetic */ g e() {
        return a.a(this);
    }

    @Override // com.spotify.audiorecord.api.e
    public l<ByteBuffer, Float> f() {
        return e9f.a;
    }

    @Override // com.spotify.audiorecord.api.e
    public String g() {
        return "content-type: audio/ogg; codecs=opus; rate=16000";
    }

    @Override // com.spotify.audiorecord.api.g
    public /* synthetic */ s h() {
        return f.a(this);
    }

    @Override // com.spotify.audiorecord.api.e
    public g<ByteBuffer> i() {
        return this.a;
    }

    @Override // com.spotify.audiorecord.api.b
    public /* synthetic */ void j(byte[] bArr) {
        a.b(this, bArr);
    }

    @Override // com.spotify.audiorecord.api.g
    public /* synthetic */ void k(boolean z) {
        f.b(this, z);
    }
}
