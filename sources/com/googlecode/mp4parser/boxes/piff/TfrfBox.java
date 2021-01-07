package com.googlecode.mp4parser.boxes.piff;

import com.adjust.sdk.Constants;
import com.coremedia.iso.boxes.UserBox;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class TfrfBox extends AbstractFullBox {
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    public List<a> entries = new ArrayList();

    public class a {
        long a;
        long b;

        public a(TfrfBox tfrfBox) {
        }

        public String toString() {
            StringBuilder Z0 = je.Z0("Entry", "{fragmentAbsoluteTime=");
            Z0.append(this.a);
            Z0.append(", fragmentAbsoluteDuration=");
            return je.D0(Z0, this.b, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public TfrfBox() {
        super(UserBox.TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("TfrfBox.java", TfrfBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getFragmentCount", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", Constants.LONG), 91);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getEntries", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.util.List"), 95);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "toString", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.lang.String"), 100);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        for (int i2 = 0; i2 < i; i2++) {
            a aVar = new a(this);
            if (getVersion() == 1) {
                aVar.a = h7.p(byteBuffer);
                aVar.b = h7.p(byteBuffer);
            } else {
                aVar.a = h7.n(byteBuffer);
                aVar.b = h7.n(byteBuffer);
            }
            this.entries.add(aVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put((byte) (this.entries.size() & BitmapRenderer.ALPHA_VISIBLE));
        for (a aVar : this.entries) {
            if (getVersion() == 1) {
                byteBuffer.putLong(aVar.a);
                byteBuffer.putLong(aVar.b);
            } else {
                byteBuffer.putInt((int) aVar.a);
                byteBuffer.putInt((int) aVar.b);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) ((this.entries.size() * (getVersion() == 1 ? 16 : 8)) + 5);
    }

    public List<a> getEntries() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.entries;
    }

    public long getFragmentCount() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return (long) this.entries.size();
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
        return new byte[]{-44, Byte.MIN_VALUE, 126, -14, -54, 57, 70, -107, -114, 84, 38, -53, -98, 70, -89, -97};
    }

    public String toString() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return "TfrfBox{entries=" + this.entries + '}';
    }
}
