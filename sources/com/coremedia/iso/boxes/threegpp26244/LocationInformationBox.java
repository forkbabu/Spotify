package com.coremedia.iso.boxes.threegpp26244;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class LocationInformationBox extends AbstractFullBox {
    public static final String TYPE = "loci";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_10 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_11 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_12 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_13 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_14 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_15 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    private String additionalNotes = "";
    private double altitude;
    private String astronomicalBody = "";
    private String language;
    private double latitude;
    private double longitude;
    private String name = "";
    private int role;

    static {
        ajc$preClinit();
    }

    public LocationInformationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("LocationInformationBox.java", LocationInformationBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 30);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "language", "", "void"), 34);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "getAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 70);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "setAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "altitude", "", "void"), 74);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "getAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 78);
        ajc$tjp_13 = bpf.g("method-execution", bpf.f("1", "setAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "astronomicalBody", "", "void"), 82);
        ajc$tjp_14 = bpf.g("method-execution", bpf.f("1", "getAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 86);
        ajc$tjp_15 = bpf.g("method-execution", bpf.f("1", "setAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "additionalNotes", "", "void"), 90);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 38);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "name", "", "void"), 42);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "int"), 46);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "int", "role", "", "void"), 50);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 54);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "longitude", "", "void"), 58);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "getLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "double"), 62);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "double", "latitude", "", "void"), 66);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = h7.i(byteBuffer);
        this.name = h7.j(byteBuffer);
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.role = i;
        this.longitude = h7.g(byteBuffer);
        this.latitude = h7.g(byteBuffer);
        this.altitude = h7.g(byteBuffer);
        this.astronomicalBody = h7.j(byteBuffer);
        this.additionalNotes = h7.j(byteBuffer);
    }

    public String getAdditionalNotes() {
        d.a().b(bpf.b(ajc$tjp_14, this, this));
        return this.additionalNotes;
    }

    public double getAltitude() {
        d.a().b(bpf.b(ajc$tjp_10, this, this));
        return this.altitude;
    }

    public String getAstronomicalBody() {
        d.a().b(bpf.b(ajc$tjp_12, this, this));
        return this.astronomicalBody;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        pe.d(byteBuffer, this.language);
        byteBuffer.put(h7.b(this.name));
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) (this.role & BitmapRenderer.ALPHA_VISIBLE));
        pe.b(byteBuffer, this.longitude);
        pe.b(byteBuffer, this.latitude);
        pe.b(byteBuffer, this.altitude);
        byteBuffer.put(h7.b(this.astronomicalBody));
        byteBuffer.put((byte) 0);
        byteBuffer.put(h7.b(this.additionalNotes));
        byteBuffer.put((byte) 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) (h7.b(this.name).length + 22 + h7.b(this.astronomicalBody).length + h7.b(this.additionalNotes).length);
    }

    public String getLanguage() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.language;
    }

    public double getLatitude() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return this.latitude;
    }

    public double getLongitude() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.longitude;
    }

    public String getName() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.name;
    }

    public int getRole() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.role;
    }

    public void setAdditionalNotes(String str) {
        d.a().b(bpf.c(ajc$tjp_15, this, this, str));
        this.additionalNotes = str;
    }

    public void setAltitude(double d) {
        d.a().b(bpf.c(ajc$tjp_11, this, this, new Double(d)));
        this.altitude = d;
    }

    public void setAstronomicalBody(String str) {
        d.a().b(bpf.c(ajc$tjp_13, this, this, str));
        this.astronomicalBody = str;
    }

    public void setLanguage(String str) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, str));
        this.language = str;
    }

    public void setLatitude(double d) {
        d.a().b(bpf.c(ajc$tjp_9, this, this, new Double(d)));
        this.latitude = d;
    }

    public void setLongitude(double d) {
        d.a().b(bpf.c(ajc$tjp_7, this, this, new Double(d)));
        this.longitude = d;
    }

    public void setName(String str) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, str));
        this.name = str;
    }

    public void setRole(int i) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, new Integer(i)));
        this.role = i;
    }
}
