package com.coremedia.iso.boxes.fragment;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class SegmentTypeBox extends AbstractBox {
    public static final String TYPE = "styp";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private List<String> compatibleBrands = Collections.emptyList();
    private String majorBrand;
    private long minorVersion;

    static {
        ajc$preClinit();
    }

    public SegmentTypeBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("SegmentTypeBox.java", SegmentTypeBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getMajorBrand", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "", "", "", "java.lang.String"), 85);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setMajorBrand", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "java.lang.String", "majorBrand", "", "void"), 94);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "setMinorVersion", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", Constants.LONG, "minorVersion", "", "void"), 103);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "getMinorVersion", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "", "", "", Constants.LONG), 113);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getCompatibleBrands", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "", "", "", "java.util.List"), 122);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setCompatibleBrands", "com.coremedia.iso.boxes.fragment.SegmentTypeBox", "java.util.List", "compatibleBrands", "", "void"), 126);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.majorBrand = h7.e(byteBuffer);
        this.minorVersion = h7.n(byteBuffer);
        int remaining = byteBuffer.remaining() / 4;
        this.compatibleBrands = new LinkedList();
        for (int i = 0; i < remaining; i++) {
            this.compatibleBrands.add(h7.e(byteBuffer));
        }
    }

    public List<String> getCompatibleBrands() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.compatibleBrands;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(ne.b(this.majorBrand));
        byteBuffer.putInt((int) this.minorVersion);
        for (String str : this.compatibleBrands) {
            byteBuffer.put(ne.b(str));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) ((this.compatibleBrands.size() * 4) + 8);
    }

    public String getMajorBrand() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.majorBrand;
    }

    public long getMinorVersion() {
        d.a().b(bpf.b(ajc$tjp_3, this, this));
        return this.minorVersion;
    }

    public void setCompatibleBrands(List<String> list) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, list));
        this.compatibleBrands = list;
    }

    public void setMajorBrand(String str) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, str));
        this.majorBrand = str;
    }

    public void setMinorVersion(long j) {
        d.a().b(bpf.c(ajc$tjp_2, this, this, new Long(j)));
        this.minorVersion = j;
    }

    public String toString() {
        StringBuilder Z0 = je.Z0("SegmentTypeBox[", "majorBrand=");
        Z0.append(getMajorBrand());
        Z0.append(";");
        Z0.append("minorVersion=");
        Z0.append(getMinorVersion());
        for (String str : this.compatibleBrands) {
            Z0.append(";");
            Z0.append("compatibleBrand=");
            Z0.append(str);
        }
        Z0.append("]");
        return Z0.toString();
    }

    public SegmentTypeBox(String str, long j, List<String> list) {
        super(TYPE);
        this.majorBrand = str;
        this.minorVersion = j;
        this.compatibleBrands = list;
    }
}
