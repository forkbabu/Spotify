package defpackage;

import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.b;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

/* renamed from: z30  reason: default package */
public class z30 extends AbstractList<w30> {
    private static final j50 s = j50.a(z30.class);
    b a;
    TrackBox b = null;
    SoftReference<ByteBuffer>[] c = null;
    int[] f;
    long[] n;
    long[] o;
    long[][] p;
    SampleSizeBox q;
    int r;

    /* renamed from: z30$a */
    class a implements w30 {
        private int a;

        public a(int i) {
            this.a = i;
        }

        @Override // defpackage.w30
        public void a(WritableByteChannel writableByteChannel) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            synchronized (this) {
                int d = z30.this.d(this.a);
                z30 z30 = z30.this;
                SoftReference<ByteBuffer> softReference = z30.c[d];
                int i = z30.f[d] - 1;
                long j = (long) d;
                long[] jArr = z30.p[rw.n(j)];
                long j2 = jArr[this.a - i];
                if (softReference == null || (byteBuffer = softReference.get()) == null) {
                    try {
                        z30 z302 = z30.this;
                        byteBuffer = z302.a.getByteBuffer(z302.n[rw.n(j)], jArr[jArr.length - 1] + z30.this.q.getSampleSizeAtIndex((i + jArr.length) - 1));
                        z30.this.c[d] = new SoftReference<>(byteBuffer);
                    } catch (IOException e) {
                        StringWriter stringWriter = new StringWriter();
                        e.printStackTrace(new PrintWriter(stringWriter));
                        z30.s.c(stringWriter.toString());
                        throw new IndexOutOfBoundsException(e.getMessage());
                    }
                }
                byteBuffer2 = (ByteBuffer) ((ByteBuffer) byteBuffer.duplicate().position(rw.n(j2))).slice().limit(rw.n(z30.this.q.getSampleSizeAtIndex(this.a)));
            }
            writableByteChannel.write(byteBuffer2);
        }

        @Override // defpackage.w30
        public long getSize() {
            return z30.this.q.getSampleSizeAtIndex(this.a);
        }

        public String toString() {
            return "Sample(index: " + this.a + " size: " + z30.this.q.getSampleSizeAtIndex(this.a) + ")";
        }
    }

    public z30(long j, b bVar) {
        int i;
        int i2 = 0;
        this.r = 0;
        this.a = bVar;
        for (TrackBox trackBox : ((MovieBox) bVar.getBoxes(MovieBox.class).get(0)).getBoxes(TrackBox.class)) {
            if (trackBox.getTrackHeaderBox().getTrackId() == j) {
                this.b = trackBox;
            }
        }
        TrackBox trackBox2 = this.b;
        if (trackBox2 != null) {
            long[] chunkOffsets = trackBox2.getSampleTableBox().getChunkOffsetBox().getChunkOffsets();
            this.n = chunkOffsets;
            this.o = new long[chunkOffsets.length];
            SoftReference<ByteBuffer>[] softReferenceArr = new SoftReference[chunkOffsets.length];
            this.c = softReferenceArr;
            Arrays.fill(softReferenceArr, new SoftReference(null));
            this.p = new long[this.n.length][];
            this.q = this.b.getSampleTableBox().getSampleSizeBox();
            List<SampleToChunkBox.a> entries = this.b.getSampleTableBox().getSampleToChunkBox().getEntries();
            SampleToChunkBox.a[] aVarArr = (SampleToChunkBox.a[]) entries.toArray(new SampleToChunkBox.a[entries.size()]);
            SampleToChunkBox.a aVar = aVarArr[0];
            long a2 = aVar.a();
            int n2 = rw.n(aVar.b());
            int size = size();
            int i3 = 0;
            int i4 = 1;
            int i5 = 0;
            int i6 = 1;
            do {
                i3++;
                if (((long) i3) == a2) {
                    if (aVarArr.length > i4) {
                        SampleToChunkBox.a aVar2 = aVarArr[i4];
                        i5 = n2;
                        n2 = rw.n(aVar2.b());
                        i4++;
                        a2 = aVar2.a();
                    } else {
                        i5 = n2;
                        n2 = -1;
                        a2 = Long.MAX_VALUE;
                    }
                }
                this.p[i3 - 1] = new long[i5];
                i6 += i5;
            } while (i6 <= size);
            this.f = new int[(i3 + 1)];
            SampleToChunkBox.a aVar3 = aVarArr[0];
            long a3 = aVar3.a();
            int n3 = rw.n(aVar3.b());
            int i7 = 0;
            int i8 = 1;
            int i9 = 1;
            int i10 = 0;
            while (true) {
                i = i7 + 1;
                this.f[i7] = i8;
                if (((long) i) == a3) {
                    if (aVarArr.length > i9) {
                        SampleToChunkBox.a aVar4 = aVarArr[i9];
                        i10 = n3;
                        i9++;
                        n3 = rw.n(aVar4.b());
                        a3 = aVar4.a();
                    } else {
                        i10 = n3;
                        n3 = -1;
                        a3 = Long.MAX_VALUE;
                    }
                }
                i8 += i10;
                if (i8 > size) {
                    break;
                }
                i7 = i;
            }
            this.f[i] = Integer.MAX_VALUE;
            long j2 = 0;
            for (int i11 = 1; ((long) i11) <= this.q.getSampleCount(); i11++) {
                while (i11 == this.f[i2]) {
                    i2++;
                    j2 = 0;
                }
                long[] jArr = this.o;
                int i12 = i2 - 1;
                int i13 = i11 - 1;
                jArr[i12] = this.q.getSampleSizeAtIndex(i13) + jArr[i12];
                this.p[i12][i11 - this.f[i12]] = j2;
                j2 += this.q.getSampleSizeAtIndex(i13);
            }
            return;
        }
        throw new RuntimeException("This MP4 does not contain track " + j);
    }

    /* access modifiers changed from: package-private */
    public synchronized int d(int i) {
        int i2 = i + 1;
        int[] iArr = this.f;
        int i3 = this.r;
        if (i2 >= iArr[i3] && i2 < iArr[i3 + 1]) {
            return i3;
        }
        if (i2 < iArr[i3]) {
            this.r = 0;
            while (true) {
                int[] iArr2 = this.f;
                int i4 = this.r;
                if (iArr2[i4 + 1] > i2) {
                    return i4;
                }
                this.r = i4 + 1;
            }
        } else {
            this.r = i3 + 1;
            while (true) {
                int[] iArr3 = this.f;
                int i5 = this.r;
                if (iArr3[i5 + 1] > i2) {
                    return i5;
                }
                this.r = i5 + 1;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        if (((long) i) < this.q.getSampleCount()) {
            return new a(i);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public int size() {
        return rw.n(this.b.getSampleTableBox().getSampleSizeBox().getSampleCount());
    }
}
