package defpackage;

import com.coremedia.iso.boxes.UserBox;
import com.coremedia.iso.boxes.b;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* renamed from: ke  reason: default package */
public abstract class ke implements le {
    private static Logger b = Logger.getLogger(ke.class.getName());
    ThreadLocal<ByteBuffer> a = new a(this);

    /* renamed from: ke$a */
    class a extends ThreadLocal<ByteBuffer> {
        a(ke keVar) {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(32);
        }
    }

    public abstract com.coremedia.iso.boxes.a a(String str, byte[] bArr, String str2);

    public com.coremedia.iso.boxes.a b(com.googlecode.mp4parser.a aVar, b bVar) {
        int read;
        long j;
        byte[] bArr;
        long Z = aVar.Z();
        this.a.get().rewind().limit(8);
        do {
            read = aVar.read(this.a.get());
            if (read == 8) {
                this.a.get().rewind();
                long n = h7.n(this.a.get());
                if (n >= 8 || n <= 1) {
                    String e = h7.e(this.a.get());
                    if (n == 1) {
                        this.a.get().limit(16);
                        aVar.read(this.a.get());
                        this.a.get().position(8);
                        j = h7.p(this.a.get()) - 16;
                    } else {
                        j = n == 0 ? aVar.size() - aVar.Z() : n - 8;
                    }
                    if (UserBox.TYPE.equals(e)) {
                        this.a.get().limit(this.a.get().limit() + 16);
                        aVar.read(this.a.get());
                        bArr = new byte[16];
                        for (int position = this.a.get().position() - 16; position < this.a.get().position(); position++) {
                            bArr[position - (this.a.get().position() - 16)] = this.a.get().get(position);
                        }
                        j -= 16;
                    } else {
                        bArr = null;
                    }
                    com.coremedia.iso.boxes.a a2 = a(e, bArr, bVar instanceof com.coremedia.iso.boxes.a ? ((com.coremedia.iso.boxes.a) bVar).getType() : "");
                    a2.setParent(bVar);
                    this.a.get().rewind();
                    a2.parse(aVar, this.a.get(), j, this);
                    return a2;
                }
                b.severe("Plausibility check failed: size < 8 (size = " + n + "). Stop parsing!");
                return null;
            }
        } while (read >= 0);
        aVar.position(Z);
        throw new EOFException();
    }
}
