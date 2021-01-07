package com.googlecode.mp4parser.boxes.dece;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class AssetInformationBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "ainf";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    String apid = "";
    String profileVersion = "0000";

    static {
        ajc$preClinit();
    }

    public AssetInformationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("AssetInformationBox.java", AssetInformationBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getApid", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"), 131);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setApid", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "apid", "", "void"), 135);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getProfileVersion", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"), 139);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setProfileVersion", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "profileVersion", "", "void"), 143);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.profileVersion = h7.k(byteBuffer, 4);
        this.apid = h7.j(byteBuffer);
    }

    public String getApid() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.apid;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 0) {
            byteBuffer.put(h7.b(this.profileVersion), 0, 4);
            byteBuffer.put(h7.b(this.apid));
            byteBuffer.put((byte) 0);
            return;
        }
        throw new RuntimeException("Unknown ainf version " + getVersion());
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) (h7.q(this.apid) + 9);
    }

    public String getProfileVersion() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.profileVersion;
    }

    public boolean isHidden() {
        return (getFlags() & 1) == 1;
    }

    public void setApid(String str) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, str));
        this.apid = str;
    }

    public void setHidden(boolean z) {
        int flags = getFlags();
        if (!(isHidden() ^ z)) {
            return;
        }
        if (z) {
            setFlags(flags | 1);
        } else {
            setFlags(16777214 & flags);
        }
    }

    public void setProfileVersion(String str) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, str));
        this.profileVersion = str;
    }
}
