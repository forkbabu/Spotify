package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class ItemLocationBox extends AbstractFullBox {
    public static final String TYPE = "iloc";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_10 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_11 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    public int baseOffsetSize = 8;
    public int indexSize = 0;
    public List<b> items = new LinkedList();
    public int lengthSize = 8;
    public int offsetSize = 8;

    static {
        ajc$preClinit();
    }

    public ItemLocationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("ItemLocationBox.java", ItemLocationBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 119);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "offsetSize", "", "void"), 123);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "createItem", "com.coremedia.iso.boxes.ItemLocationBox", "int:int:int:long:java.util.List", "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents", "", "com.coremedia.iso.boxes.ItemLocationBox$Item"), 160);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "createExtent", "com.coremedia.iso.boxes.ItemLocationBox", "long:long:long", "extentOffset:extentLength:extentIndex", "", "com.coremedia.iso.boxes.ItemLocationBox$Extent"), 285);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 127);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "lengthSize", "", "void"), 131);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 135);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "baseOffsetSize", "", "void"), 139);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 143);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "indexSize", "", "void"), 147);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "getItems", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "java.util.List"), 151);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setItems", "com.coremedia.iso.boxes.ItemLocationBox", "java.util.List", "items", "", "void"), 155);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.offsetSize = i >>> 4;
        this.lengthSize = i & 15;
        int i2 = byteBuffer.get();
        if (i2 < 0) {
            i2 += 256;
        }
        this.baseOffsetSize = i2 >>> 4;
        if (getVersion() == 1) {
            this.indexSize = i2 & 15;
        }
        int l = h7.l(byteBuffer);
        for (int i3 = 0; i3 < l; i3++) {
            this.items.add(new b(byteBuffer));
        }
    }

    public a createExtent(long j, long j2, long j3) {
        d.a().b(bpf.e(ajc$tjp_11, this, this, new Object[]{new Long(j), new Long(j2), new Long(j3)}));
        return new a(j, j2, j3);
    }

    public b createItem(int i, int i2, int i3, long j, List<a> list) {
        d.a().b(bpf.e(ajc$tjp_10, this, this, new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Long(j), list}));
        return new b(i, i2, i3, j, list);
    }

    public int getBaseOffsetSize() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.baseOffsetSize;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        int i;
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put((byte) (((this.offsetSize << 4) | this.lengthSize) & BitmapRenderer.ALPHA_VISIBLE));
        if (getVersion() == 1) {
            byteBuffer.put((byte) (((this.baseOffsetSize << 4) | this.indexSize) & BitmapRenderer.ALPHA_VISIBLE));
        } else {
            byteBuffer.put((byte) ((this.baseOffsetSize << 4) & BitmapRenderer.ALPHA_VISIBLE));
        }
        pe.e(byteBuffer, this.items.size());
        for (b bVar : this.items) {
            pe.e(byteBuffer, bVar.a);
            if (ItemLocationBox.this.getVersion() == 1) {
                pe.e(byteBuffer, bVar.b);
            }
            pe.e(byteBuffer, bVar.c);
            int i2 = ItemLocationBox.this.baseOffsetSize;
            if (i2 > 0) {
                h7.r(bVar.d, byteBuffer, i2);
            }
            pe.e(byteBuffer, bVar.e.size());
            for (a aVar : bVar.e) {
                if (ItemLocationBox.this.getVersion() == 1 && (i = ItemLocationBox.this.indexSize) > 0) {
                    h7.r(aVar.c, byteBuffer, i);
                }
                h7.r(aVar.a, byteBuffer, ItemLocationBox.this.offsetSize);
                h7.r(aVar.b, byteBuffer, ItemLocationBox.this.lengthSize);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long j = 8;
        for (b bVar : this.items) {
            int i = (ItemLocationBox.this.getVersion() == 1 ? 4 : 2) + 2 + ItemLocationBox.this.baseOffsetSize + 2;
            for (a aVar : bVar.e) {
                ItemLocationBox itemLocationBox = ItemLocationBox.this;
                int i2 = itemLocationBox.indexSize;
                if (i2 <= 0) {
                    i2 = 0;
                }
                i += i2 + itemLocationBox.offsetSize + itemLocationBox.lengthSize;
            }
            j += (long) i;
        }
        return j;
    }

    public int getIndexSize() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.indexSize;
    }

    public List<b> getItems() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return this.items;
    }

    public int getLengthSize() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.lengthSize;
    }

    public int getOffsetSize() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.offsetSize;
    }

    public void setBaseOffsetSize(int i) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, new Integer(i)));
        this.baseOffsetSize = i;
    }

    public void setIndexSize(int i) {
        d.a().b(bpf.c(ajc$tjp_7, this, this, new Integer(i)));
        this.indexSize = i;
    }

    public void setItems(List<b> list) {
        d.a().b(bpf.c(ajc$tjp_9, this, this, list));
        this.items = list;
    }

    public void setLengthSize(int i) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, new Integer(i)));
        this.lengthSize = i;
    }

    public void setOffsetSize(int i) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Integer(i)));
        this.offsetSize = i;
    }

    public class a {
        public long a;
        public long b;
        public long c;

        public a(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.c == aVar.c && this.b == aVar.b && this.a == aVar.a;
        }

        public int hashCode() {
            long j = this.a;
            long j2 = this.b;
            long j3 = this.c;
            return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
        }

        public String toString() {
            StringBuilder Z0 = je.Z0("Extent", "{extentOffset=");
            Z0.append(this.a);
            Z0.append(", extentLength=");
            Z0.append(this.b);
            Z0.append(", extentIndex=");
            return je.D0(Z0, this.c, '}');
        }

        public a(ByteBuffer byteBuffer) {
            int i;
            if (ItemLocationBox.this.getVersion() == 1 && (i = ItemLocationBox.this.indexSize) > 0) {
                this.c = oe.a(byteBuffer, i);
            }
            this.a = oe.a(byteBuffer, ItemLocationBox.this.offsetSize);
            this.b = oe.a(byteBuffer, ItemLocationBox.this.lengthSize);
        }
    }

    /* access modifiers changed from: package-private */
    public a createExtent(ByteBuffer byteBuffer) {
        return new a(byteBuffer);
    }

    /* access modifiers changed from: package-private */
    public b createItem(ByteBuffer byteBuffer) {
        return new b(byteBuffer);
    }

    public class b {
        public int a;
        public int b;
        public int c;
        public long d;
        public List<a> e = new LinkedList();

        public b(ByteBuffer byteBuffer) {
            this.a = h7.l(byteBuffer);
            if (ItemLocationBox.this.getVersion() == 1) {
                this.b = h7.l(byteBuffer) & 15;
            }
            this.c = h7.l(byteBuffer);
            int i = ItemLocationBox.this.baseOffsetSize;
            if (i > 0) {
                this.d = oe.a(byteBuffer, i);
            } else {
                this.d = 0;
            }
            int l = h7.l(byteBuffer);
            for (int i2 = 0; i2 < l; i2++) {
                this.e.add(new a(byteBuffer));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.d != bVar.d || this.b != bVar.b || this.c != bVar.c || this.a != bVar.a) {
                return false;
            }
            List<a> list = this.e;
            List<a> list2 = bVar.e;
            return list == null ? list2 == null : list.equals(list2);
        }

        public int hashCode() {
            long j = this.d;
            int i = ((((((this.a * 31) + this.b) * 31) + this.c) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            List<a> list = this.e;
            return i + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Item{baseOffset=" + this.d + ", itemId=" + this.a + ", constructionMethod=" + this.b + ", dataReferenceIndex=" + this.c + ", extents=" + this.e + '}';
        }

        public b(int i, int i2, int i3, long j, List<a> list) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = j;
            this.e = list;
        }
    }
}
