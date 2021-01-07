package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.mp4parser.aspectj.lang.a;

public class TimeToSampleBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "stts";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    static Map<List<a>, SoftReference<long[]>> cache = new WeakHashMap();
    List<a> entries = Collections.emptyList();

    public static class a {
        long a;
        long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public long a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }

        public void c(long j) {
            this.a = j;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Entry{count=");
            sb.append(this.a);
            sb.append(", delta=");
            return je.D0(sb, this.b, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public TimeToSampleBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("TimeToSampleBox.java", TimeToSampleBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.util.List"), 79);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setEntries", "com.coremedia.iso.boxes.TimeToSampleBox", "java.util.List", "entries", "", "void"), 83);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.TimeToSampleBox", "", "", "", "java.lang.String"), 87);
    }

    public static synchronized long[] blowupTimeToSamples(List<a> list) {
        long[] jArr;
        synchronized (TimeToSampleBox.class) {
            SoftReference<long[]> softReference = cache.get(list);
            if (!(softReference == null || (jArr = softReference.get()) == null)) {
                return jArr;
            }
            long j = 0;
            for (a aVar : list) {
                j += aVar.a;
            }
            long[] jArr2 = new long[((int) j)];
            int i = 0;
            for (a aVar2 : list) {
                int i2 = 0;
                while (((long) i2) < aVar2.a) {
                    jArr2[i] = aVar2.b;
                    i2++;
                    i++;
                }
            }
            cache.put(list, new SoftReference<>(jArr2));
            return jArr2;
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int n = rw.n(h7.n(byteBuffer));
        this.entries = new ArrayList(n);
        for (int i = 0; i < n; i++) {
            this.entries.add(new a(h7.n(byteBuffer), h7.n(byteBuffer)));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) ((long) this.entries.size()));
        for (a aVar : this.entries) {
            byteBuffer.putInt((int) aVar.a);
            byteBuffer.putInt((int) aVar.b);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) ((this.entries.size() * 8) + 8);
    }

    public List<a> getEntries() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<a> list) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_2, this, this), "TimeToSampleBox[entryCount=");
        c1.append(this.entries.size());
        c1.append("]");
        return c1.toString();
    }
}
