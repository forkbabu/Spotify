package com.googlecode.mp4parser.boxes.dece;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class BaseLocationBox extends AbstractFullBox {
    public static final String TYPE = "bloc";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    String baseLocation = "";
    String purchaseLocation = "";

    static {
        ajc$preClinit();
    }

    public BaseLocationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("BaseLocationBox.java", BaseLocationBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getBaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setBaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "baseLocation", "", "void"), 48);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getPurchaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 52);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setPurchaseLocation", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "purchaseLocation", "", "void"), 56);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "equals", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "java.lang.Object", "o", "", "boolean"), 86);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "hashCode", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "int"), 100);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "toString", "com.googlecode.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"), 107);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        String j = h7.j(byteBuffer);
        this.baseLocation = j;
        byteBuffer.get(new byte[((256 - h7.q(j)) - 1)]);
        String j2 = h7.j(byteBuffer);
        this.purchaseLocation = j2;
        byteBuffer.get(new byte[((256 - h7.q(j2)) - 1)]);
        byteBuffer.get(new byte[512]);
    }

    public boolean equals(Object obj) {
        d.a().b(bpf.c(ajc$tjp_4, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseLocationBox baseLocationBox = (BaseLocationBox) obj;
        String str = this.baseLocation;
        if (str == null ? baseLocationBox.baseLocation != null : !str.equals(baseLocationBox.baseLocation)) {
            return false;
        }
        String str2 = this.purchaseLocation;
        String str3 = baseLocationBox.purchaseLocation;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public String getBaseLocation() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.baseLocation;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(h7.b(this.baseLocation));
        byteBuffer.put(new byte[(256 - h7.q(this.baseLocation))]);
        byteBuffer.put(h7.b(this.purchaseLocation));
        byteBuffer.put(new byte[(256 - h7.q(this.purchaseLocation))]);
        byteBuffer.put(new byte[512]);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 1028;
    }

    public String getPurchaseLocation() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.purchaseLocation;
    }

    public int hashCode() {
        d.a().b(bpf.b(ajc$tjp_5, this, this));
        String str = this.baseLocation;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.purchaseLocation;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public void setBaseLocation(String str) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, str));
        this.baseLocation = str;
    }

    public void setPurchaseLocation(String str) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, str));
        this.purchaseLocation = str;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_6, this, this), "BaseLocationBox{baseLocation='");
        je.A(c1, this.baseLocation, '\'', ", purchaseLocation='");
        c1.append(this.purchaseLocation);
        c1.append('\'');
        c1.append('}');
        return c1.toString();
    }

    public BaseLocationBox(String str, String str2) {
        super(TYPE);
        this.baseLocation = str;
        this.purchaseLocation = str2;
    }
}
