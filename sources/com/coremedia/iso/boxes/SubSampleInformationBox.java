package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.encore.foundation.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class SubSampleInformationBox extends AbstractFullBox {
    public static final String TYPE = "subs";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private List<a> entries = new ArrayList();

    public static class a {
        private long a;
        private List<C0063a> b = new ArrayList();

        /* renamed from: com.coremedia.iso.boxes.SubSampleInformationBox$a$a  reason: collision with other inner class name */
        public static class C0063a {
            private long a;
            private int b;
            private int c;
            private long d;

            public int a() {
                return this.c;
            }

            public long b() {
                return this.d;
            }

            public int c() {
                return this.b;
            }

            public long d() {
                return this.a;
            }

            public void e(int i) {
                this.c = i;
            }

            public void f(long j) {
                this.d = j;
            }

            public void g(int i) {
                this.b = i;
            }

            public void h(long j) {
                this.a = j;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("SubsampleEntry{subsampleSize=");
                sb.append(this.a);
                sb.append(", subsamplePriority=");
                sb.append(this.b);
                sb.append(", discardable=");
                sb.append(this.c);
                sb.append(", reserved=");
                return je.D0(sb, this.d, '}');
            }
        }

        public long a() {
            return this.a;
        }

        public int b() {
            return this.b.size();
        }

        public List<C0063a> c() {
            return this.b;
        }

        public void d(long j) {
            this.a = j;
        }

        public String toString() {
            return "SampleEntry{sampleDelta=" + this.a + ", subsampleCount=" + this.b.size() + ", subsampleEntries=" + this.b + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    public SubSampleInformationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("SubSampleInformationBox.java", SubSampleInformationBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.util.List"), 50);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "java.util.List", "entries", "", "void"), 54);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.lang.String"), R.styleable.AppCompatTheme_windowNoTitle);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        long n = h7.n(byteBuffer);
        for (int i = 0; ((long) i) < n; i++) {
            a aVar = new a();
            aVar.d(h7.n(byteBuffer));
            int l = h7.l(byteBuffer);
            for (int i2 = 0; i2 < l; i2++) {
                a.C0063a aVar2 = new a.C0063a();
                aVar2.h(getVersion() == 1 ? h7.n(byteBuffer) : (long) h7.l(byteBuffer));
                int i3 = byteBuffer.get();
                if (i3 < 0) {
                    i3 += 256;
                }
                aVar2.g(i3);
                int i4 = byteBuffer.get();
                if (i4 < 0) {
                    i4 += 256;
                }
                aVar2.e(i4);
                aVar2.f(h7.n(byteBuffer));
                aVar.c().add(aVar2);
            }
            this.entries.add(aVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) ((long) this.entries.size()));
        for (a aVar : this.entries) {
            byteBuffer.putInt((int) aVar.a());
            pe.e(byteBuffer, aVar.b());
            for (a.C0063a aVar2 : aVar.c()) {
                if (getVersion() == 1) {
                    byteBuffer.putInt((int) aVar2.d());
                } else {
                    pe.e(byteBuffer, rw.n(aVar2.d()));
                }
                byteBuffer.put((byte) (aVar2.c() & BitmapRenderer.ALPHA_VISIBLE));
                byteBuffer.put((byte) (aVar2.a() & BitmapRenderer.ALPHA_VISIBLE));
                byteBuffer.putInt((int) aVar2.b());
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long j = 8;
        for (a aVar : this.entries) {
            j = j + 4 + 2;
            for (int i = 0; i < aVar.c().size(); i++) {
                j = (getVersion() == 1 ? j + 4 : j + 2) + 2 + 4;
            }
        }
        return j;
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
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_2, this, this), "SubSampleInformationBox{entryCount=");
        c1.append(this.entries.size());
        c1.append(", entries=");
        c1.append(this.entries);
        c1.append('}');
        return c1.toString();
    }
}
