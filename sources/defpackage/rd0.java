package defpackage;

import com.spotify.audiorecord.api.e;
import io.reactivex.disposables.a;
import io.reactivex.g;
import io.reactivex.h;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rd0  reason: default package */
public class rd0 {
    private final BlockingDeque<ByteBuffer> a = new LinkedBlockingDeque();
    private final AtomicBoolean b = new AtomicBoolean();
    private final e c;
    private a d;

    public rd0(e eVar) {
        this.c = eVar;
    }

    public boolean a() {
        return this.b.get();
    }

    public /* synthetic */ void b(h hVar) {
        while (true) {
            try {
                ByteBuffer pollFirst = this.a.pollFirst(1000, TimeUnit.MILLISECONDS);
                if (pollFirst != null) {
                    hVar.onNext(pollFirst);
                } else {
                    hVar.onComplete();
                    return;
                }
            } catch (Exception e) {
                hVar.f(e);
                return;
            }
        }
    }

    public void c(byte[] bArr) {
        try {
            this.a.putFirst(ByteBuffer.wrap(bArr));
        } catch (InterruptedException unused) {
        }
    }

    public synchronized void d() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.dispose();
        }
        this.a.clear();
        this.b.set(true);
        a aVar2 = new a();
        this.d = aVar2;
        g<ByteBuffer> i = this.c.i();
        BlockingDeque<ByteBuffer> blockingDeque = this.a;
        blockingDeque.getClass();
        aVar2.b(i.subscribe(new qd0(blockingDeque)));
    }

    public synchronized void e() {
        this.b.set(false);
        a aVar = this.d;
        if (aVar != null) {
            aVar.dispose();
        }
    }
}
