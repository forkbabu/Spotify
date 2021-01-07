package com.spotify.wakeword.sensory;

import com.sensory.speech.snsr.SnsrRC;
import com.sensory.speech.snsr.SnsrSession;
import com.sensory.speech.snsr.SnsrStream;
import com.sensory.speech.snsr.SnsrStreamMeta;
import com.sensory.speech.snsr.SnsrStreamMode;
import com.spotify.audiorecord.api.b;
import com.spotify.base.java.logging.Logger;
import com.spotify.wakeword.sensory.x;
import com.spotify.wakeword.sensory.y;
import io.reactivex.t;
import java.io.IOException;

public final /* synthetic */ class a implements SnsrSession.Listener {
    public final /* synthetic */ b a;
    public final /* synthetic */ t b;
    public final /* synthetic */ String c;

    public /* synthetic */ a(b bVar, t tVar, String str) {
        this.a = bVar;
        this.b = tVar;
        this.c = str;
    }

    @Override // com.sensory.speech.snsr.SnsrSession.Listener
    public final SnsrRC onEvent(SnsrSession snsrSession, String str) {
        b bVar = this.a;
        t tVar = this.b;
        String str2 = this.c;
        if (!"^result".equals(str)) {
            return SnsrRC.OK;
        }
        byte[] bArr = new byte[32000];
        double d = snsrSession.getDouble("end-sample");
        SnsrStream fromMemory = SnsrStream.fromMemory(bArr, SnsrStreamMode.WRITE);
        bVar.d();
        try {
            snsrSession.setDouble("audio-stream-from", d);
            fromMemory.copy(snsrSession.getStream("audio-stream"));
            int meta = (int) fromMemory.getMeta(SnsrStreamMeta.BYTES_WRITTEN);
            byte[] bArr2 = new byte[meta];
            System.arraycopy(bArr, 0, bArr2, 0, meta);
            bVar.j(bArr2);
            tVar.onNext(new y.a(str2));
        } catch (IOException e) {
            Logger.e(e, e.getLocalizedMessage(), new Object[0]);
            tVar.onNext(new y.b(str2, new x.d(e)));
        } catch (Throwable th) {
            fromMemory.release();
            throw th;
        }
        fromMemory.release();
        return SnsrRC.STOP;
    }
}
