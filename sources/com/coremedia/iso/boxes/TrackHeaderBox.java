package com.coremedia.iso.boxes;

import com.adjust.sdk.Constants;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import java.util.Date;
import org.mp4parser.aspectj.lang.a;

public class TrackHeaderBox extends AbstractFullBox {
    private static j50 LOG = j50.a(TrackHeaderBox.class);
    public static final String TYPE = "tkhd";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_10 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_11 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_12 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_13 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_14 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_15 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_16 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_17 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_18 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_19 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_20 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_21 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_22 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_23 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_24 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_25 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_26 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_27 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_28 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_29 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    private int alternateGroup;
    private Date creationTime = new Date(0);
    private long duration;
    private double height;
    private int layer;
    private k50 matrix = k50.j;
    private Date modificationTime = new Date(0);
    private long trackId;
    private float volume;
    private double width;

    static {
        ajc$preClinit();
    }

    public TrackHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("TrackHeaderBox.java", TrackHeaderBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 62);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.util.Date"), 66);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "getContent", "com.coremedia.iso.boxes.TrackHeaderBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 145);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "java.lang.String"), 173);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "setCreationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "creationTime", "", "void"), ContentType.BUMPER);
        ajc$tjp_13 = bpf.g("method-execution", bpf.f("1", "setModificationTime", "com.coremedia.iso.boxes.TrackHeaderBox", "java.util.Date", "modificationTime", "", "void"), 206);
        ajc$tjp_14 = bpf.g("method-execution", bpf.f("1", "setTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", Constants.LONG, "trackId", "", "void"), 214);
        ajc$tjp_15 = bpf.g("method-execution", bpf.f("1", "setDuration", "com.coremedia.iso.boxes.TrackHeaderBox", Constants.LONG, "duration", "", "void"), 218);
        ajc$tjp_16 = bpf.g("method-execution", bpf.f("1", "setLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "layer", "", "void"), 225);
        ajc$tjp_17 = bpf.g("method-execution", bpf.f("1", "setAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "int", "alternateGroup", "", "void"), 229);
        ajc$tjp_18 = bpf.g("method-execution", bpf.f("1", "setVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "float", "volume", "", "void"), AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL);
        ajc$tjp_19 = bpf.g("method-execution", bpf.f("1", "setMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 237);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getTrackId", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Constants.LONG), 70);
        ajc$tjp_20 = bpf.g("method-execution", bpf.f("1", "setWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "width", "", "void"), 241);
        ajc$tjp_21 = bpf.g("method-execution", bpf.f("1", "setHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "double", "height", "", "void"), 245);
        ajc$tjp_22 = bpf.g("method-execution", bpf.f("1", "isEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 250);
        ajc$tjp_23 = bpf.g("method-execution", bpf.f("1", "isInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 254);
        ajc$tjp_24 = bpf.g("method-execution", bpf.f("1", "isInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 258);
        ajc$tjp_25 = bpf.g("method-execution", bpf.f("1", "isInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "boolean"), 262);
        ajc$tjp_26 = bpf.g("method-execution", bpf.f("1", "setEnabled", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "enabled", "", "void"), 266);
        ajc$tjp_27 = bpf.g("method-execution", bpf.f("1", "setInMovie", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inMovie", "", "void"), 274);
        ajc$tjp_28 = bpf.g("method-execution", bpf.f("1", "setInPreview", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPreview", "", "void"), 282);
        ajc$tjp_29 = bpf.g("method-execution", bpf.f("1", "setInPoster", "com.coremedia.iso.boxes.TrackHeaderBox", "boolean", "inPoster", "", "void"), 290);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "getDuration", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", Constants.LONG), 74);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getLayer", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 78);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "getAlternateGroup", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "int"), 82);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getVolume", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "float"), 86);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "getMatrix", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 90);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "getWidth", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 94);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "getHeight", "com.coremedia.iso.boxes.TrackHeaderBox", "", "", "", "double"), 98);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = rw.h(h7.p(byteBuffer));
            this.modificationTime = rw.h(h7.p(byteBuffer));
            this.trackId = h7.n(byteBuffer);
            h7.n(byteBuffer);
            this.duration = byteBuffer.getLong();
        } else {
            this.creationTime = rw.h(h7.n(byteBuffer));
            this.modificationTime = rw.h(h7.n(byteBuffer));
            this.trackId = h7.n(byteBuffer);
            h7.n(byteBuffer);
            this.duration = (long) byteBuffer.getInt();
        }
        if (this.duration < -1) {
            LOG.d("tkhd duration is not in expected range");
        }
        h7.n(byteBuffer);
        h7.n(byteBuffer);
        this.layer = h7.l(byteBuffer);
        this.alternateGroup = h7.l(byteBuffer);
        this.volume = h7.h(byteBuffer);
        h7.l(byteBuffer);
        this.matrix = k50.a(byteBuffer);
        this.width = h7.g(byteBuffer);
        this.height = h7.g(byteBuffer);
    }

    public int getAlternateGroup() {
        d.a().b(bpf.b(ajc$tjp_5, this, this));
        return this.alternateGroup;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        d.a().b(bpf.c(ajc$tjp_10, this, this, byteBuffer));
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            byteBuffer.putLong(rw.g(this.creationTime));
            byteBuffer.putLong(rw.g(this.modificationTime));
            byteBuffer.putInt((int) this.trackId);
            byteBuffer.putInt((int) 0);
            byteBuffer.putLong(this.duration);
        } else {
            byteBuffer.putInt((int) rw.g(this.creationTime));
            byteBuffer.putInt((int) rw.g(this.modificationTime));
            byteBuffer.putInt((int) this.trackId);
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) this.duration);
        }
        int i = (int) 0;
        byteBuffer.putInt(i);
        byteBuffer.putInt(i);
        pe.e(byteBuffer, this.layer);
        pe.e(byteBuffer, this.alternateGroup);
        pe.c(byteBuffer, (double) this.volume);
        pe.e(byteBuffer, 0);
        this.matrix.b(byteBuffer);
        pe.b(byteBuffer, this.width);
        pe.b(byteBuffer, this.height);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (getVersion() == 1 ? 36 : 24) + 60;
    }

    public Date getCreationTime() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.creationTime;
    }

    public long getDuration() {
        d.a().b(bpf.b(ajc$tjp_3, this, this));
        return this.duration;
    }

    public double getHeight() {
        d.a().b(bpf.b(ajc$tjp_9, this, this));
        return this.height;
    }

    public int getLayer() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.layer;
    }

    public k50 getMatrix() {
        d.a().b(bpf.b(ajc$tjp_7, this, this));
        return this.matrix;
    }

    public Date getModificationTime() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.modificationTime;
    }

    public long getTrackId() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.trackId;
    }

    public float getVolume() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.volume;
    }

    public double getWidth() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return this.width;
    }

    public boolean isEnabled() {
        d.a().b(bpf.b(ajc$tjp_22, this, this));
        return (getFlags() & 1) > 0;
    }

    public boolean isInMovie() {
        d.a().b(bpf.b(ajc$tjp_23, this, this));
        return (getFlags() & 2) > 0;
    }

    public boolean isInPoster() {
        d.a().b(bpf.b(ajc$tjp_25, this, this));
        return (getFlags() & 8) > 0;
    }

    public boolean isInPreview() {
        d.a().b(bpf.b(ajc$tjp_24, this, this));
        return (getFlags() & 4) > 0;
    }

    public void setAlternateGroup(int i) {
        d.a().b(bpf.c(ajc$tjp_17, this, this, new Integer(i)));
        this.alternateGroup = i;
    }

    public void setCreationTime(Date date) {
        d.a().b(bpf.c(ajc$tjp_12, this, this, date));
        this.creationTime = date;
        if ((date.getTime() / 1000) + 2082844800 >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setDuration(long j) {
        d.a().b(bpf.c(ajc$tjp_15, this, this, new Long(j)));
        this.duration = j;
        if (j >= 4294967296L) {
            setFlags(1);
        }
    }

    public void setEnabled(boolean z) {
        d.a().b(bpf.c(ajc$tjp_26, this, this, new Boolean(z)));
        if (z) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & -2);
        }
    }

    public void setHeight(double d) {
        d.a().b(bpf.c(ajc$tjp_21, this, this, new Double(d)));
        this.height = d;
    }

    public void setInMovie(boolean z) {
        d.a().b(bpf.c(ajc$tjp_27, this, this, new Boolean(z)));
        if (z) {
            setFlags(getFlags() | 2);
        } else {
            setFlags(getFlags() & -3);
        }
    }

    public void setInPoster(boolean z) {
        d.a().b(bpf.c(ajc$tjp_29, this, this, new Boolean(z)));
        if (z) {
            setFlags(getFlags() | 8);
        } else {
            setFlags(getFlags() & -9);
        }
    }

    public void setInPreview(boolean z) {
        d.a().b(bpf.c(ajc$tjp_28, this, this, new Boolean(z)));
        if (z) {
            setFlags(getFlags() | 4);
        } else {
            setFlags(getFlags() & -5);
        }
    }

    public void setLayer(int i) {
        d.a().b(bpf.c(ajc$tjp_16, this, this, new Integer(i)));
        this.layer = i;
    }

    public void setMatrix(k50 k50) {
        d.a().b(bpf.c(ajc$tjp_19, this, this, k50));
        this.matrix = k50;
    }

    public void setModificationTime(Date date) {
        d.a().b(bpf.c(ajc$tjp_13, this, this, date));
        this.modificationTime = date;
        if ((date.getTime() / 1000) + 2082844800 >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setTrackId(long j) {
        d.a().b(bpf.c(ajc$tjp_14, this, this, new Long(j)));
        this.trackId = j;
    }

    public void setVolume(float f) {
        d.a().b(bpf.c(ajc$tjp_18, this, this, new Float(f)));
        this.volume = f;
    }

    public void setWidth(double d) {
        d.a().b(bpf.c(ajc$tjp_20, this, this, new Double(d)));
        this.width = d;
    }

    public String toString() {
        d.a().b(bpf.b(ajc$tjp_11, this, this));
        return "TrackHeaderBox[creationTime=" + getCreationTime() + ";modificationTime=" + getModificationTime() + ";trackId=" + getTrackId() + ";duration=" + getDuration() + ";layer=" + getLayer() + ";alternateGroup=" + getAlternateGroup() + ";volume=" + getVolume() + ";matrix=" + this.matrix + ";width=" + getWidth() + ";height=" + getHeight() + "]";
    }
}
