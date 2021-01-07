package defpackage;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.core.http.HttpConnection;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* renamed from: v5  reason: default package */
public class v5 {
    static final byte[] A = {-1, -40, -1};
    private static final byte[] B = {102, 116, 121, 112};
    private static final byte[] C = {109, 105, 102, 49};
    private static final byte[] D = {104, 101, 105, 99};
    private static final byte[] E = {79, 76, 89, 77, 80, 0};
    private static final byte[] F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] G = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] H = {101, 88, 73, 102};
    private static final byte[] I = {73, 72, 68, 82};
    private static final byte[] J = {73, 69, 78, 68};
    private static final byte[] K = {82, 73, 70, 70};
    private static final byte[] L = {87, 69, 66, 80};
    private static final byte[] M = {69, 88, 73, 70};
    private static final byte[] N = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] O = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] P = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] Q = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] R = "ANMF".getBytes(Charset.defaultCharset());
    private static SimpleDateFormat S;
    static final String[] T = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] U = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] V = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final e[] W;
    private static final e[] X;
    private static final e[] Y;
    private static final e[] Z;
    private static final e[] a0;
    private static final e b0 = new e("StripOffsets", 273, 3);
    private static final e[] c0;
    private static final e[] d0;
    private static final e[] e0;
    private static final e[] f0;
    static final e[][] g0;
    private static final e[] h0 = {new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
    private static final e i0 = new e("JPEGInterchangeFormat", 513, 4);
    private static final e j0 = new e("JPEGInterchangeFormatLength", 514, 4);
    private static final HashMap<Integer, e>[] k0;
    private static final HashMap<String, e>[] l0;
    private static final HashSet<String> m0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
    private static final HashMap<Integer, Integer> n0 = new HashMap<>();
    static final Charset o0;
    static final byte[] p0;
    private static final byte[] q0;
    private static final Pattern r0 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    private static final boolean v = Log.isLoggable("ExifInterface", 3);
    private static final List<Integer> w = Arrays.asList(1, 6, 3, 8);
    private static final List<Integer> x = Arrays.asList(2, 7, 4, 5);
    public static final int[] y = {8, 8, 8};
    public static final int[] z = {8};
    private String a;
    private FileDescriptor b;
    private AssetManager.AssetInputStream c;
    private int d;
    private boolean e;
    private final HashMap<String, d>[] f;
    private Set<Integer> g;
    private ByteOrder h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private byte[] m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;

    /* access modifiers changed from: package-private */
    /* renamed from: v5$a */
    public class a extends MediaDataSource {
        long a;
        final /* synthetic */ b b;

        a(v5 v5Var, b bVar) {
            this.b = bVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.a;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.b.available())) {
                        return -1;
                    }
                    this.b.b(j);
                    this.a = j;
                }
                if (i2 > this.b.available()) {
                    i2 = this.b.available();
                }
                int read = this.b.read(bArr, i, i2);
                if (read >= 0) {
                    this.a += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.a = -1;
            return -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v5$c */
    public static class c extends FilterOutputStream {
        final OutputStream a;
        private ByteOrder b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.a = outputStream;
            this.b = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.b = byteOrder;
        }

        public void b(int i) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.a.write((i >>> 0) & BitmapRenderer.ALPHA_VISIBLE);
                this.a.write((i >>> 8) & BitmapRenderer.ALPHA_VISIBLE);
                this.a.write((i >>> 16) & BitmapRenderer.ALPHA_VISIBLE);
                this.a.write((i >>> 24) & BitmapRenderer.ALPHA_VISIBLE);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.a.write((i >>> 24) & BitmapRenderer.ALPHA_VISIBLE);
                this.a.write((i >>> 16) & BitmapRenderer.ALPHA_VISIBLE);
                this.a.write((i >>> 8) & BitmapRenderer.ALPHA_VISIBLE);
                this.a.write((i >>> 0) & BitmapRenderer.ALPHA_VISIBLE);
            }
        }

        public void d(short s) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.a.write((s >>> 0) & BitmapRenderer.ALPHA_VISIBLE);
                this.a.write((s >>> 8) & BitmapRenderer.ALPHA_VISIBLE);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.a.write((s >>> 8) & BitmapRenderer.ALPHA_VISIBLE);
                this.a.write((s >>> 0) & BitmapRenderer.ALPHA_VISIBLE);
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.a.write(bArr, i, i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v5$f */
    public static class f {
        public final long a;
        public final long b;

        f(long j, long j2) {
            if (j2 == 0) {
                this.a = 0;
                this.b = 1;
                return;
            }
            this.a = j;
            this.b = j2;
        }

        public String toString() {
            return this.a + "/" + this.b;
        }
    }

    static {
        "XMP ".getBytes(Charset.defaultCharset());
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", BitmapRenderer.ALPHA_VISIBLE, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", HttpConnection.kErrorHttpBadRange, 2), new e("DateTime", HttpConnection.kErrorHttpTooManyRedirects, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        W = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        X = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        Y = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        Z = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", BitmapRenderer.ALPHA_VISIBLE, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", HttpConnection.kErrorHttpBadRange, 2), new e("DateTime", HttpConnection.kErrorHttpTooManyRedirects, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        a0 = eVarArr5;
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        c0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        d0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        e0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        g0 = eVarArr10;
        k0 = new HashMap[eVarArr10.length];
        l0 = new HashMap[eVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        o0 = forName;
        p0 = "Exif\u0000\u0000".getBytes(forName);
        q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        S = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            e[][] eVarArr11 = g0;
            if (i2 < eVarArr11.length) {
                k0[i2] = new HashMap<>();
                l0[i2] = new HashMap<>();
                e[] eVarArr12 = eVarArr11[i2];
                for (e eVar : eVarArr12) {
                    k0[i2].put(Integer.valueOf(eVar.a), eVar);
                    l0[i2].put(eVar.b, eVar);
                }
                i2++;
            } else {
                HashMap<Integer, Integer> hashMap = n0;
                e[] eVarArr13 = h0;
                hashMap.put(Integer.valueOf(eVarArr13[0].a), 5);
                hashMap.put(Integer.valueOf(eVarArr13[1].a), 1);
                hashMap.put(Integer.valueOf(eVarArr13[2].a), 2);
                hashMap.put(Integer.valueOf(eVarArr13[3].a), 3);
                hashMap.put(Integer.valueOf(eVarArr13[4].a), 7);
                hashMap.put(Integer.valueOf(eVarArr13[5].a), 8);
                Pattern.compile(".*[1-9].*");
                return;
            }
        }
    }

    public v5(String str) {
        Throwable th;
        e[][] eVarArr = g0;
        this.f = new HashMap[eVarArr.length];
        this.g = new HashSet(eVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.c = null;
            this.a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (z(fileInputStream2.getFD())) {
                        this.b = fileInputStream2.getFD();
                    } else {
                        this.b = null;
                    }
                    B(fileInputStream2);
                    d(fileInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    d(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                d(fileInputStream);
                throw th;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    private boolean A(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.h(this.h) <= 512 && dVar2.h(this.h) <= 512;
    }

    private void B(InputStream inputStream) {
        for (int i2 = 0; i2 < g0.length; i2++) {
            try {
                this.f[i2] = new HashMap<>();
            } catch (IOException unused) {
                this.t = false;
                boolean z2 = v;
                a();
                if (!z2) {
                    return;
                }
            } catch (Throwable th) {
                a();
                if (v) {
                    D();
                }
                throw th;
            }
        }
        if (!this.e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, CrashReportManager.TIME_WINDOW);
            this.d = o(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        b bVar = new b(inputStream, ByteOrder.BIG_ENDIAN);
        if (!this.e) {
            switch (this.d) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    s(bVar);
                    break;
                case 4:
                    n(bVar, 0, 0);
                    break;
                case 7:
                    p(bVar);
                    break;
                case 9:
                    r(bVar);
                    break;
                case 10:
                    t(bVar);
                    break;
                case 12:
                    m(bVar);
                    break;
                case 13:
                    q(bVar);
                    break;
                case 14:
                    w(bVar);
                    break;
            }
        } else {
            u(bVar);
        }
        N(bVar);
        this.t = true;
        a();
        if (!v) {
            return;
        }
        D();
    }

    private void C(b bVar, int i2) {
        ByteOrder E2 = E(bVar);
        this.h = E2;
        bVar.d(E2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i3 = this.d;
        if (i3 == 7 || i3 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt < 8 || readInt >= i2) {
                throw new IOException(je.p0("Invalid first Ifd offset: ", readInt));
            }
            int i4 = readInt - 8;
            if (i4 > 0 && bVar.skipBytes(i4) != i4) {
                throw new IOException(je.p0("Couldn't jump to first Ifd: ", i4));
            }
            return;
        }
        StringBuilder V0 = je.V0("Invalid start code: ");
        V0.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(V0.toString());
    }

    private void D() {
        int i2 = 0;
        while (true) {
            HashMap<String, d>[] hashMapArr = this.f;
            if (i2 < hashMapArr.length) {
                hashMapArr[i2].size();
                for (Map.Entry<String, d> entry : this.f[i2].entrySet()) {
                    d value = entry.getValue();
                    entry.getKey();
                    value.toString();
                    value.i(this.h);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private ByteOrder E(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder V0 = je.V0("Invalid byte order: ");
        V0.append(Integer.toHexString(readShort));
        throw new IOException(V0.toString());
    }

    private void F(byte[] bArr, int i2) {
        b bVar = new b(bArr);
        C(bVar, bArr.length);
        G(bVar, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void G(defpackage.v5.b r29, int r30) {
        /*
        // Method dump skipped, instructions count: 803
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v5.G(v5$b, int):void");
    }

    private void H(String str) {
        for (int i2 = 0; i2 < g0.length; i2++) {
            this.f[i2].remove(str);
        }
    }

    private void J(InputStream inputStream, OutputStream outputStream) {
        if (v) {
            String str = "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")";
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            cVar.a.write(-1);
            if (dataInputStream.readByte() == -40) {
                cVar.a.write(-40);
                d dVar = null;
                if (j("Xmp") != null && this.u) {
                    dVar = this.f[0].remove("Xmp");
                }
                cVar.a.write(-1);
                cVar.a.write(-31);
                S(cVar);
                if (dVar != null) {
                    this.f[0].put("Xmp", dVar);
                }
                byte[] bArr = new byte[4096];
                while (dataInputStream.readByte() == -1) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte == -39 || readByte == -38) {
                        cVar.a.write(-1);
                        cVar.a.write(readByte);
                        f(dataInputStream, cVar);
                        return;
                    } else if (readByte != -31) {
                        cVar.a.write(-1);
                        cVar.a.write(readByte);
                        int readUnsignedShort = dataInputStream.readUnsignedShort();
                        cVar.d((short) readUnsignedShort);
                        int i2 = readUnsignedShort - 2;
                        if (i2 >= 0) {
                            while (i2 > 0) {
                                int read = dataInputStream.read(bArr, 0, Math.min(i2, 4096));
                                if (read < 0) {
                                    break;
                                }
                                cVar.a.write(bArr, 0, read);
                                i2 -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (dataInputStream.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, p0)) {
                                    int i3 = readUnsignedShort2 - 6;
                                    if (dataInputStream.skipBytes(i3) != i3) {
                                        throw new IOException("Invalid length");
                                    }
                                }
                            }
                            cVar.a.write(-1);
                            cVar.a.write(readByte);
                            cVar.d((short) (readUnsignedShort2 + 2));
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                cVar.a.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = dataInputStream.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                if (read2 < 0) {
                                    break;
                                }
                                cVar.a.write(bArr, 0, read2);
                                readUnsignedShort2 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    private void K(InputStream inputStream, OutputStream outputStream) {
        Throwable th;
        if (v) {
            String str = "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")";
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = G;
        g(dataInputStream, cVar, bArr.length);
        int i2 = this.o;
        if (i2 == 0) {
            int readInt = dataInputStream.readInt();
            cVar.b(readInt);
            g(dataInputStream, cVar, readInt + 4 + 4);
        } else {
            g(dataInputStream, cVar, ((i2 - bArr.length) - 4) - 4);
            dataInputStream.skipBytes(dataInputStream.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                S(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.a).toByteArray();
                cVar.a.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.b((int) crc32.getValue());
                d(byteArrayOutputStream2);
                f(dataInputStream, cVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                d(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            d(byteArrayOutputStream);
            throw th;
        }
    }

    private void L(InputStream inputStream, OutputStream outputStream) {
        Throwable th;
        Exception e2;
        if (v) {
            String str = "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")";
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = K;
        g(bVar, cVar, bArr.length);
        byte[] bArr2 = L;
        bVar.skipBytes(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                int i2 = this.o;
                if (i2 != 0) {
                    g(bVar, cVar2, ((i2 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                    bVar.skipBytes(4);
                    bVar.skipBytes(bVar.readInt());
                    S(cVar2);
                } else {
                    byte[] bArr3 = new byte[4];
                    if (bVar.read(bArr3) == 4) {
                        byte[] bArr4 = N;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int readInt = bVar.readInt();
                            boolean z2 = true;
                            byte[] bArr5 = new byte[(readInt % 2 == 1 ? readInt + 1 : readInt)];
                            bVar.read(bArr5);
                            bArr5[0] = (byte) (bArr5[0] | 8);
                            if (((bArr5[0] >> 1) & 1) != 1) {
                                z2 = false;
                            }
                            cVar2.a.write(bArr4);
                            cVar2.b(readInt);
                            cVar2.a.write(bArr5);
                            if (z2) {
                                h(bVar, cVar2, Q, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    inputStream.read(bArr6);
                                    if (!Arrays.equals(bArr6, R)) {
                                        break;
                                    }
                                    i(bVar, cVar2, bArr6);
                                }
                                S(cVar2);
                            } else {
                                h(bVar, cVar2, P, O);
                                S(cVar2);
                            }
                        } else if (Arrays.equals(bArr3, P) || Arrays.equals(bArr3, O)) {
                            throw new IOException("WebP files with only VP8 or VP8L chunks are currently not supported");
                        }
                    } else {
                        throw new IOException("Encountered invalid length while parsing WebP chunk type");
                    }
                }
                f(bVar, cVar2);
                int size = byteArrayOutputStream2.size();
                byte[] bArr7 = L;
                cVar.b(size + bArr7.length);
                cVar.a.write(bArr7);
                byteArrayOutputStream2.writeTo(cVar);
                d(byteArrayOutputStream2);
            } catch (Exception e3) {
                e2 = e3;
                byteArrayOutputStream = byteArrayOutputStream2;
                try {
                    throw new IOException("Failed to save WebP file", e2);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    d(byteArrayOutputStream2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                d(byteArrayOutputStream2);
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
            throw new IOException("Failed to save WebP file", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void N(defpackage.v5.b r19) {
        /*
        // Method dump skipped, instructions count: 262
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v5.N(v5$b):void");
    }

    private static boolean O(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private void P(int i2, int i3) {
        if (this.f[i2].isEmpty() || this.f[i3].isEmpty()) {
            boolean z2 = v;
            return;
        }
        d dVar = this.f[i2].get("ImageLength");
        d dVar2 = this.f[i2].get("ImageWidth");
        d dVar3 = this.f[i3].get("ImageLength");
        d dVar4 = this.f[i3].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            boolean z3 = v;
        } else if (dVar3 == null || dVar4 == null) {
            boolean z4 = v;
        } else {
            int h2 = dVar.h(this.h);
            int h3 = dVar2.h(this.h);
            int h4 = dVar3.h(this.h);
            int h5 = dVar4.h(this.h);
            if (h2 < h4 && h3 < h5) {
                HashMap<String, d>[] hashMapArr = this.f;
                HashMap<String, d> hashMap = hashMapArr[i2];
                hashMapArr[i2] = hashMapArr[i3];
                hashMapArr[i3] = hashMap;
            }
        }
    }

    private void Q(b bVar, int i2) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4 = this.f[i2].get("DefaultCropSize");
        d dVar5 = this.f[i2].get("SensorTopBorder");
        d dVar6 = this.f[i2].get("SensorLeftBorder");
        d dVar7 = this.f[i2].get("SensorBottomBorder");
        d dVar8 = this.f[i2].get("SensorRightBorder");
        if (dVar4 != null) {
            if (dVar4.a == 5) {
                f[] fVarArr = (f[]) dVar4.j(this.h);
                if (fVarArr == null || fVarArr.length != 2) {
                    Arrays.toString(fVarArr);
                    return;
                } else {
                    dVar3 = d.d(new f[]{fVarArr[0]}, this.h);
                    dVar2 = d.d(new f[]{fVarArr[1]}, this.h);
                }
            } else {
                int[] iArr = (int[]) dVar4.j(this.h);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    dVar3 = d.e(iArr[0], this.h);
                    dVar2 = d.e(iArr[1], this.h);
                }
            }
            this.f[i2].put("ImageWidth", dVar3);
            this.f[i2].put("ImageLength", dVar2);
        } else if (dVar5 == null || dVar6 == null || dVar7 == null || dVar8 == null) {
            d dVar9 = this.f[i2].get("ImageLength");
            d dVar10 = this.f[i2].get("ImageWidth");
            if ((dVar9 == null || dVar10 == null) && (dVar = this.f[i2].get("JPEGInterchangeFormat")) != null) {
                n(bVar, dVar.h(this.h), i2);
            }
        } else {
            int h2 = dVar5.h(this.h);
            int h3 = dVar7.h(this.h);
            int h4 = dVar8.h(this.h);
            int h5 = dVar6.h(this.h);
            if (h3 > h2 && h4 > h5) {
                d e2 = d.e(h3 - h2, this.h);
                d e3 = d.e(h4 - h5, this.h);
                this.f[i2].put("ImageLength", e2);
                this.f[i2].put("ImageWidth", e3);
            }
        }
    }

    private void R() {
        P(0, 5);
        P(0, 4);
        P(5, 4);
        d dVar = this.f[1].get("PixelXDimension");
        d dVar2 = this.f[1].get("PixelYDimension");
        if (!(dVar == null || dVar2 == null)) {
            this.f[0].put("ImageWidth", dVar);
            this.f[0].put("ImageLength", dVar2);
        }
        if (this.f[4].isEmpty() && A(this.f[5])) {
            HashMap<String, d>[] hashMapArr = this.f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        A(this.f[4]);
    }

    private int S(c cVar) {
        e[][] eVarArr = g0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : h0) {
            H(eVar.b);
        }
        H(i0.b);
        H(j0.b);
        for (int i2 = 0; i2 < g0.length; i2++) {
            for (Object obj : this.f[i2].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f[i2].remove(entry.getKey());
                }
            }
        }
        if (!this.f[1].isEmpty()) {
            this.f[0].put(h0[1].b, d.b(0, this.h));
        }
        if (!this.f[2].isEmpty()) {
            this.f[0].put(h0[2].b, d.b(0, this.h));
        }
        if (!this.f[3].isEmpty()) {
            this.f[1].put(h0[3].b, d.b(0, this.h));
        }
        if (this.i) {
            this.f[4].put(i0.b, d.b(0, this.h));
            this.f[4].put(j0.b, d.b((long) this.l, this.h));
        }
        for (int i3 = 0; i3 < g0.length; i3++) {
            int i4 = 0;
            for (Map.Entry<String, d> entry2 : this.f[i3].entrySet()) {
                d value = entry2.getValue();
                value.getClass();
                int i5 = U[value.a] * value.b;
                if (i5 > 4) {
                    i4 += i5;
                }
            }
            iArr2[i3] = iArr2[i3] + i4;
        }
        int i6 = 8;
        for (int i7 = 0; i7 < g0.length; i7++) {
            if (!this.f[i7].isEmpty()) {
                iArr[i7] = i6;
                i6 = (this.f[i7].size() * 12) + 2 + 4 + iArr2[i7] + i6;
            }
        }
        if (this.i) {
            this.f[4].put(i0.b, d.b((long) i6, this.h));
            this.k = this.o + i6;
            i6 += this.l;
        }
        if (this.d == 4) {
            i6 += 8;
        }
        if (v) {
            for (int i8 = 0; i8 < g0.length; i8++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i8), Integer.valueOf(iArr[i8]), Integer.valueOf(this.f[i8].size()), Integer.valueOf(iArr2[i8]), Integer.valueOf(i6));
            }
        }
        if (!this.f[1].isEmpty()) {
            this.f[0].put(h0[1].b, d.b((long) iArr[1], this.h));
        }
        if (!this.f[2].isEmpty()) {
            this.f[0].put(h0[2].b, d.b((long) iArr[2], this.h));
        }
        if (!this.f[3].isEmpty()) {
            this.f[1].put(h0[3].b, d.b((long) iArr[3], this.h));
        }
        int i9 = this.d;
        if (i9 == 4) {
            cVar.d((short) i6);
            cVar.a.write(p0);
        } else if (i9 == 13) {
            cVar.b(i6);
            cVar.a.write(H);
        } else if (i9 == 14) {
            cVar.a.write(M);
            cVar.b(i6);
        }
        cVar.d(this.h == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
        cVar.a(this.h);
        cVar.d((short) 42);
        cVar.b((int) 8);
        for (int i10 = 0; i10 < g0.length; i10++) {
            if (!this.f[i10].isEmpty()) {
                cVar.d((short) this.f[i10].size());
                int size = (this.f[i10].size() * 12) + iArr[i10] + 2 + 4;
                for (Map.Entry<String, d> entry3 : this.f[i10].entrySet()) {
                    int i11 = l0[i10].get(entry3.getKey()).a;
                    d value2 = entry3.getValue();
                    value2.getClass();
                    int i12 = U[value2.a] * value2.b;
                    cVar.d((short) i11);
                    cVar.d((short) value2.a);
                    cVar.b(value2.b);
                    if (i12 > 4) {
                        cVar.b((int) ((long) size));
                        size += i12;
                    } else {
                        cVar.a.write(value2.c);
                        if (i12 < 4) {
                            while (i12 < 4) {
                                cVar.a.write(0);
                                i12++;
                            }
                        }
                    }
                }
                if (i10 != 0 || this.f[4].isEmpty()) {
                    cVar.b((int) 0);
                } else {
                    cVar.b((int) ((long) iArr[4]));
                }
                for (Map.Entry<String, d> entry4 : this.f[i10].entrySet()) {
                    byte[] bArr = entry4.getValue().c;
                    if (bArr.length > 4) {
                        cVar.a.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.i) {
            cVar.a.write(v());
        }
        if (this.d == 14 && i6 % 2 == 1) {
            cVar.a.write(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return i6;
    }

    private void a() {
        String j2 = j("DateTimeOriginal");
        if (j2 != null && j("DateTime") == null) {
            this.f[0].put("DateTime", d.a(j2));
        }
        if (j("ImageWidth") == null) {
            this.f[0].put("ImageWidth", d.b(0, this.h));
        }
        if (j("ImageLength") == null) {
            this.f[0].put("ImageLength", d.b(0, this.h));
        }
        if (j("Orientation") == null) {
            this.f[0].put("Orientation", d.b(0, this.h));
        }
        if (j("LightSource") == null) {
            this.f[1].put("LightSource", d.b(0, this.h));
        }
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i2])));
        }
        return sb.toString();
    }

    private static void c(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Os.close(fileDescriptor);
            } catch (Exception unused) {
                Log.e("ExifInterface", "Error closing fd.");
            }
        } else {
            Log.e("ExifInterface", "closeFileDescriptor is called in API < 21, which must be wrong.");
        }
    }

    private static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private static long[] e(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    private static int f(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int i2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i2;
            }
            i2 += read;
            outputStream.write(bArr, 0, read);
        }
    }

    private static void g(InputStream inputStream, OutputStream outputStream, int i2) {
        byte[] bArr = new byte[8192];
        while (i2 > 0) {
            int min = Math.min(i2, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i2 -= read;
                ((c) outputStream).a.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    private void h(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder V0 = je.V0("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = o0;
                V0.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    StringBuilder V02 = je.V0(" or ");
                    V02.append(new String(bArr2, charset));
                    str = V02.toString();
                }
                V0.append(str);
                throw new IOException(V0.toString());
            }
            i(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void i(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.a.write(bArr);
        cVar.b(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        g(bVar, cVar, readInt);
    }

    private d l(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < g0.length; i2++) {
            d dVar = this.f[i2].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private void m(b bVar) {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                mediaMetadataRetriever.setDataSource(new a(this, bVar));
            } else {
                FileDescriptor fileDescriptor = this.b;
                if (fileDescriptor != null) {
                    mediaMetadataRetriever.setDataSource(fileDescriptor);
                } else {
                    String str3 = this.a;
                    if (str3 != null) {
                        mediaMetadataRetriever.setDataSource(str3);
                    } else {
                        mediaMetadataRetriever.release();
                        return;
                    }
                }
            }
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            String str4 = null;
            if ("yes".equals(extractMetadata3)) {
                str4 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str4 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str2 = null;
                str = null;
            }
            if (str4 != null) {
                this.f[0].put("ImageWidth", d.e(Integer.parseInt(str4), this.h));
            }
            if (str2 != null) {
                this.f[0].put("ImageLength", d.e(Integer.parseInt(str2), this.h));
            }
            if (str != null) {
                int i2 = 1;
                int parseInt = Integer.parseInt(str);
                if (parseInt == 90) {
                    i2 = 6;
                } else if (parseInt == 180) {
                    i2 = 3;
                } else if (parseInt == 270) {
                    i2 = 8;
                }
                this.f[0].put("Orientation", d.e(i2, this.h));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.b((long) parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i3 = parseInt2 + 6;
                        int i4 = parseInt3 - 6;
                        if (Arrays.equals(bArr, p0)) {
                            byte[] bArr2 = new byte[i4];
                            if (bVar.read(bArr2) == i4) {
                                this.o = i3;
                                F(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void n(defpackage.v5.b r13, int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 448
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v5.n(v5$b, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c6, code lost:
        if (r6 != null) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0110 A[SYNTHETIC, Splitter:B:100:0x0110] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0142 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x010e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int o(java.io.BufferedInputStream r18) {
        /*
        // Method dump skipped, instructions count: 393
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v5.o(java.io.BufferedInputStream):int");
    }

    private void p(b bVar) {
        s(bVar);
        d dVar = this.f[1].get("MakerNote");
        if (dVar != null) {
            b bVar2 = new b(dVar.c);
            bVar2.d(this.h);
            byte[] bArr = E;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.b(0);
            byte[] bArr3 = F;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.b(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.b(12);
            }
            G(bVar2, 6);
            d dVar2 = this.f[7].get("PreviewImageStart");
            d dVar3 = this.f[7].get("PreviewImageLength");
            if (!(dVar2 == null || dVar3 == null)) {
                this.f[5].put("JPEGInterchangeFormat", dVar2);
                this.f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.j(this.h);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i2 = (iArr[2] - iArr[0]) + 1;
                    int i3 = (iArr[3] - iArr[1]) + 1;
                    if (i2 < i3) {
                        int i4 = i2 + i3;
                        i3 = i4 - i3;
                        i2 = i4 - i3;
                    }
                    d e2 = d.e(i2, this.h);
                    d e3 = d.e(i3, this.h);
                    this.f[0].put("ImageWidth", e2);
                    this.f[0].put("ImageLength", e3);
                }
            }
        }
    }

    private void q(b bVar) {
        if (v) {
            String str = "getPngAttributes starting with: " + bVar;
        }
        bVar.d(ByteOrder.BIG_ENDIAN);
        byte[] bArr = G;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i2 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i3 = i2 + 4;
                    if (i3 == 16) {
                        if (!Arrays.equals(bArr2, I)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, J)) {
                        if (Arrays.equals(bArr2, H)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.o = i3;
                                    F(bArr3, 0);
                                    R();
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                        }
                        int i4 = readInt + 4;
                        bVar.skipBytes(i4);
                        length = i3 + i4;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void r(b bVar) {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        n(bVar, i2, 5);
        bVar.b((long) i3);
        bVar.d(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == b0.a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d e2 = d.e(readShort, this.h);
                d e3 = d.e(readShort2, this.h);
                this.f[0].put("ImageLength", e2);
                this.f[0].put("ImageWidth", e3);
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    private void s(b bVar) {
        d dVar;
        C(bVar, bVar.available());
        G(bVar, 0);
        Q(bVar, 0);
        Q(bVar, 5);
        Q(bVar, 4);
        R();
        if (this.d == 8 && (dVar = this.f[1].get("MakerNote")) != null) {
            b bVar2 = new b(dVar.c);
            bVar2.d(this.h);
            bVar2.b(6);
            G(bVar2, 9);
            d dVar2 = this.f[9].get("ColorSpace");
            if (dVar2 != null) {
                this.f[1].put("ColorSpace", dVar2);
            }
        }
    }

    private void t(b bVar) {
        s(bVar);
        if (this.f[0].get("JpgFromRaw") != null) {
            n(bVar, this.s, 5);
        }
        d dVar = this.f[0].get("ISO");
        d dVar2 = this.f[1].get("PhotographicSensitivity");
        if (dVar != null && dVar2 == null) {
            this.f[1].put("PhotographicSensitivity", dVar);
        }
    }

    private void u(b bVar) {
        byte[] bArr = p0;
        bVar.skipBytes(bArr.length);
        byte[] bArr2 = new byte[bVar.available()];
        bVar.readFully(bArr2);
        this.o = bArr.length;
        F(bArr2, 0);
    }

    private void w(b bVar) {
        if (v) {
            String str = "getWebpAttributes starting with: " + bVar;
        }
        bVar.d(ByteOrder.LITTLE_ENDIAN);
        bVar.skipBytes(K.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(L.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i2 = skipBytes + 4 + 4;
                    if (Arrays.equals(M, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.o = i2;
                            F(bArr2, 0);
                            this.o = i2;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i3 = i2 + readInt2;
                    if (i3 != readInt) {
                        if (i3 <= readInt) {
                            int skipBytes2 = bVar.skipBytes(readInt2);
                            if (skipBytes2 == readInt2) {
                                skipBytes = i2 + skipBytes2;
                            } else {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair<Integer, Integer> x(String str) {
        int i2;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> x2 = x(split[0]);
            if (((Integer) x2.first).intValue() == 2) {
                return x2;
            }
            for (int i3 = 1; i3 < split.length; i3++) {
                Pair<Integer, Integer> x3 = x(split[i3]);
                if (((Integer) x3.first).equals(x2.first) || ((Integer) x3.second).equals(x2.first)) {
                    i2 = ((Integer) x2.first).intValue();
                } else {
                    i2 = -1;
                }
                int intValue = (((Integer) x2.second).intValue() == -1 || (!((Integer) x3.first).equals(x2.second) && !((Integer) x3.second).equals(x2.second))) ? -1 : ((Integer) x2.second).intValue();
                if (i2 == -1 && intValue == -1) {
                    return new Pair<>(2, -1);
                }
                if (i2 == -1) {
                    x2 = new Pair<>(Integer.valueOf(intValue), -1);
                } else if (intValue == -1) {
                    x2 = new Pair<>(Integer.valueOf(i2), -1);
                }
            }
            return x2;
        } else if (str.contains("/")) {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0) {
                        if (parseDouble2 >= 0) {
                            if (parseDouble <= 2147483647L) {
                                if (parseDouble2 <= 2147483647L) {
                                    return new Pair<>(10, 5);
                                }
                            }
                            return new Pair<>(5, -1);
                        }
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair<>(2, -1);
        } else {
            try {
                Long valueOf = Long.valueOf(Long.parseLong(str));
                if (valueOf.longValue() >= 0 && valueOf.longValue() <= 65535) {
                    return new Pair<>(3, 4);
                }
                if (valueOf.longValue() < 0) {
                    return new Pair<>(9, -1);
                }
                return new Pair<>(4, -1);
            } catch (NumberFormatException unused2) {
                try {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                } catch (NumberFormatException unused3) {
                    return new Pair<>(2, -1);
                }
            }
        }
    }

    private void y(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar != null && dVar2 != null) {
            int h2 = dVar.h(this.h);
            int h3 = dVar2.h(this.h);
            if (this.d == 7) {
                h2 += this.p;
            }
            int min = Math.min(h3, bVar.c - h2);
            if (h2 > 0 && min > 0) {
                this.i = true;
                int i2 = h2 + this.o;
                this.k = i2;
                this.l = min;
                if (this.a == null && this.c == null && this.b == null) {
                    byte[] bArr = new byte[min];
                    bVar.b((long) i2);
                    bVar.readFully(bArr);
                    this.m = bArr;
                }
            }
        }
    }

    private static boolean z(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Os.lseek(fileDescriptor, 0, OsConstants.SEEK_CUR);
                return true;
            } catch (Exception unused) {
                boolean z2 = v;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d0 A[Catch:{ Exception -> 0x0126, all -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d8 A[Catch:{ Exception -> 0x0126, all -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fc A[Catch:{ Exception -> 0x0119, all -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0100 A[Catch:{ Exception -> 0x0119, all -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x012c A[Catch:{ all -> 0x0155 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void I() {
        /*
        // Method dump skipped, instructions count: 381
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v5.I():void");
    }

    public void M(String str, String str2) {
        e eVar;
        int i2;
        d dVar;
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        int i3 = 2;
        int i4 = 1;
        if (str2 != null && m0.contains(str)) {
            if (str.equals("GPSTimeStamp")) {
                Matcher matcher = r0.matcher(str2);
                if (matcher.find()) {
                    str2 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
                } else {
                    return;
                }
            } else {
                try {
                    str2 = new f((long) (Double.parseDouble(str2) * 10000.0d), 10000).toString();
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
        char c2 = 0;
        int i5 = 0;
        while (i5 < g0.length) {
            if ((i5 != 4 || this.i) && (eVar = l0[i5].get(str)) != null) {
                if (str2 == null) {
                    this.f[i5].remove(str);
                } else {
                    Pair<Integer, Integer> x2 = x(str2);
                    if (eVar.c == ((Integer) x2.first).intValue() || eVar.c == ((Integer) x2.second).intValue()) {
                        i2 = eVar.c;
                    } else {
                        int i6 = eVar.d;
                        if (i6 == -1 || !(i6 == ((Integer) x2.first).intValue() || eVar.d == ((Integer) x2.second).intValue())) {
                            int i7 = eVar.c;
                            if (i7 == i4 || i7 == 7 || i7 == i3) {
                                i2 = i7;
                            } else if (v) {
                                String[] strArr = T;
                                String str3 = strArr[i7];
                                int i8 = eVar.d;
                                if (i8 != -1) {
                                    String str4 = strArr[i8];
                                }
                                String str5 = strArr[((Integer) x2.first).intValue()];
                                if (((Integer) x2.second).intValue() != -1) {
                                    String str6 = strArr[((Integer) x2.second).intValue()];
                                }
                            }
                        } else {
                            i2 = eVar.d;
                        }
                    }
                    switch (i2) {
                        case 1:
                            HashMap<String, d> hashMap = this.f[i5];
                            if (str2.length() != 1 || str2.charAt(0) < '0' || str2.charAt(0) > '1') {
                                byte[] bytes = str2.getBytes(o0);
                                dVar = new d(1, bytes.length, bytes);
                            } else {
                                dVar = new d(1, 1, new byte[]{(byte) (str2.charAt(0) - '0')});
                            }
                            hashMap.put(str, dVar);
                            continue;
                        case 2:
                        case 7:
                            this.f[i5].put(str, d.a(str2));
                            continue;
                        case 3:
                            String[] split = str2.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i9 = 0; i9 < split.length; i9++) {
                                iArr[i9] = Integer.parseInt(split[i9]);
                            }
                            this.f[i5].put(str, d.f(iArr, this.h));
                            continue;
                        case 4:
                            String[] split2 = str2.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i10 = 0; i10 < split2.length; i10++) {
                                jArr[i10] = Long.parseLong(split2[i10]);
                            }
                            this.f[i5].put(str, d.c(jArr, this.h));
                            continue;
                        case 5:
                            String[] split3 = str2.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            for (int i11 = 0; i11 < split3.length; i11++) {
                                String[] split4 = split3[i11].split("/", -1);
                                fVarArr[i11] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                            }
                            this.f[i5].put(str, d.d(fVarArr, this.h));
                            continue;
                        case 9:
                            String[] split5 = str2.split(",", -1);
                            int length = split5.length;
                            int[] iArr2 = new int[length];
                            for (int i12 = 0; i12 < split5.length; i12++) {
                                iArr2[i12] = Integer.parseInt(split5[i12]);
                            }
                            HashMap<String, d> hashMap2 = this.f[i5];
                            ByteOrder byteOrder = this.h;
                            ByteBuffer wrap = ByteBuffer.wrap(new byte[(U[9] * length)]);
                            wrap.order(byteOrder);
                            for (int i13 = 0; i13 < length; i13++) {
                                wrap.putInt(iArr2[i13]);
                            }
                            hashMap2.put(str, new d(9, length, wrap.array()));
                            continue;
                        case 10:
                            String[] split6 = str2.split(",", -1);
                            int length2 = split6.length;
                            f[] fVarArr2 = new f[length2];
                            int i14 = 0;
                            while (i14 < split6.length) {
                                String[] split7 = split6[i14].split("/", -1);
                                fVarArr2[i14] = new f((long) Double.parseDouble(split7[c2]), (long) Double.parseDouble(split7[i4]));
                                i14++;
                                i4 = 1;
                                c2 = 0;
                            }
                            HashMap<String, d> hashMap3 = this.f[i5];
                            ByteOrder byteOrder2 = this.h;
                            ByteBuffer wrap2 = ByteBuffer.wrap(new byte[(U[10] * length2)]);
                            wrap2.order(byteOrder2);
                            for (int i15 = 0; i15 < length2; i15++) {
                                f fVar = fVarArr2[i15];
                                wrap2.putInt((int) fVar.a);
                                wrap2.putInt((int) fVar.b);
                            }
                            hashMap3.put(str, new d(10, length2, wrap2.array()));
                            continue;
                        case 12:
                            String[] split8 = str2.split(",", -1);
                            int length3 = split8.length;
                            double[] dArr = new double[length3];
                            for (int i16 = 0; i16 < split8.length; i16++) {
                                dArr[i16] = Double.parseDouble(split8[i16]);
                            }
                            HashMap<String, d> hashMap4 = this.f[i5];
                            ByteOrder byteOrder3 = this.h;
                            ByteBuffer wrap3 = ByteBuffer.wrap(new byte[(U[12] * length3)]);
                            wrap3.order(byteOrder3);
                            for (int i17 = 0; i17 < length3; i17++) {
                                wrap3.putDouble(dArr[i17]);
                            }
                            hashMap4.put(str, new d(12, length3, wrap3.array()));
                            continue;
                    }
                }
            }
            i5++;
            i3 = 2;
            i4 = 1;
            c2 = 0;
        }
    }

    public String j(String str) {
        d l2 = l(str);
        if (l2 != null) {
            if (!m0.contains(str)) {
                return l2.i(this.h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = l2.a;
                if (i2 != 5 && i2 != 10) {
                    return null;
                }
                f[] fVarArr = (f[]) l2.j(this.h);
                if (fVarArr != null && fVarArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) fVarArr[0].a) / ((float) fVarArr[0].b))), Integer.valueOf((int) (((float) fVarArr[1].a) / ((float) fVarArr[1].b))), Integer.valueOf((int) (((float) fVarArr[2].a) / ((float) fVarArr[2].b))));
                }
                Arrays.toString(fVarArr);
                return null;
            }
            try {
                return Double.toString(l2.g(this.h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int k(String str, int i2) {
        d l2 = l(str);
        if (l2 == null) {
            return i2;
        }
        try {
            return l2.h(this.h);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x005d A[SYNTHETIC, Splitter:B:37:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] v() {
        /*
            r10 = this;
            boolean r0 = r10.i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            byte[] r0 = r10.m
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.res.AssetManager$AssetInputStream r0 = r10.c     // Catch:{ Exception -> 0x00a7, all -> 0x009b }
            if (r0 == 0) goto L_0x0028
            boolean r2 = r0.markSupported()     // Catch:{ Exception -> 0x0025, all -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r0.reset()     // Catch:{ Exception -> 0x0025, all -> 0x001e }
        L_0x0018:
            r2 = r1
            goto L_0x005b
        L_0x001a:
            d(r0)
            return r1
        L_0x001e:
            r2 = move-exception
            r9 = r1
            r1 = r0
            r0 = r2
            r2 = r9
            goto L_0x009e
        L_0x0025:
            r2 = r1
            goto L_0x00a9
        L_0x0028:
            java.lang.String r0 = r10.a
            if (r0 == 0) goto L_0x0034
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.lang.String r2 = r10.a
            r0.<init>(r2)
            goto L_0x0018
        L_0x0034:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x0059
            java.io.FileDescriptor r0 = r10.b
            if (r0 == 0) goto L_0x0059
            java.io.FileDescriptor r0 = android.system.Os.dup(r0)
            r2 = 0
            int r4 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0056, all -> 0x0052 }
            android.system.Os.lseek(r0, r2, r4)     // Catch:{ Exception -> 0x0056, all -> 0x0052 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0056, all -> 0x0052 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0056, all -> 0x0052 }
            r9 = r2
            r2 = r0
            r0 = r9
            goto L_0x005b
        L_0x0052:
            r2 = move-exception
            r9 = r2
            r2 = r0
            goto L_0x0093
        L_0x0056:
            r2 = r0
            r0 = r1
            goto L_0x00a9
        L_0x0059:
            r0 = r1
            r2 = r0
        L_0x005b:
            if (r0 == 0) goto L_0x0095
            int r3 = r10.k     // Catch:{ Exception -> 0x00a9, all -> 0x0090 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x00a9, all -> 0x0090 }
            long r3 = r0.skip(r3)     // Catch:{ Exception -> 0x00a9, all -> 0x0090 }
            int r5 = r10.k     // Catch:{ Exception -> 0x00a9, all -> 0x0090 }
            long r5 = (long) r5
            java.lang.String r7 = "Corrupted image"
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x008a
            int r3 = r10.l
            byte[] r3 = new byte[r3]
            int r4 = r0.read(r3)
            int r5 = r10.l
            if (r4 != r5) goto L_0x0084
            r10.m = r3
            d(r0)
            if (r2 == 0) goto L_0x0083
            c(r2)
        L_0x0083:
            return r3
        L_0x0084:
            java.io.IOException r3 = new java.io.IOException
            r3.<init>(r7)
            throw r3
        L_0x008a:
            java.io.IOException r3 = new java.io.IOException
            r3.<init>(r7)
            throw r3
        L_0x0090:
            r1 = move-exception
            r9 = r1
            r1 = r0
        L_0x0093:
            r0 = r9
            goto L_0x009e
        L_0x0095:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            r3.<init>()
            throw r3
        L_0x009b:
            r2 = move-exception
            r0 = r2
            r2 = r1
        L_0x009e:
            d(r1)
            if (r2 == 0) goto L_0x00a6
            c(r2)
        L_0x00a6:
            throw r0
        L_0x00a7:
            r0 = r1
            r2 = r0
        L_0x00a9:
            d(r0)
            if (r2 == 0) goto L_0x00b1
            c(r2)
        L_0x00b1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v5.v():byte[]");
    }

    /* access modifiers changed from: private */
    /* renamed from: v5$b */
    public static class b extends InputStream implements DataInput {
        private static final ByteOrder n = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder o = ByteOrder.BIG_ENDIAN;
        private DataInputStream a;
        private ByteOrder b;
        final int c;
        int f;

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.a = dataInputStream;
            int available = dataInputStream.available();
            this.c = available;
            this.f = 0;
            this.a.mark(available);
            this.b = byteOrder;
        }

        public long a() {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.a.available();
        }

        public void b(long j) {
            int i = this.f;
            if (((long) i) > j) {
                this.f = 0;
                this.a.reset();
                this.a.mark(this.c);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public void d(ByteOrder byteOrder) {
            this.b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f++;
            return this.a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f++;
            return this.a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            int i = this.f + 1;
            this.f = i;
            if (i <= this.c) {
                int read = this.a.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f += 2;
            return this.a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) {
            int i3 = this.f + i2;
            this.f = i3;
            if (i3 > this.c) {
                throw new EOFException();
            } else if (this.a.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public int readInt() {
            int i = this.f + 4;
            this.f = i;
            if (i <= this.c) {
                int read = this.a.read();
                int read2 = this.a.read();
                int read3 = this.a.read();
                int read4 = this.a.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.b;
                    if (byteOrder == n) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == o) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder V0 = je.V0("Invalid byte order: ");
                    V0.append(this.b);
                    throw new IOException(V0.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            int i = this.f + 8;
            this.f = i;
            if (i <= this.c) {
                int read = this.a.read();
                int read2 = this.a.read();
                int read3 = this.a.read();
                int read4 = this.a.read();
                int read5 = this.a.read();
                int read6 = this.a.read();
                int read7 = this.a.read();
                int read8 = this.a.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.b;
                    if (byteOrder == n) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == o) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder V0 = je.V0("Invalid byte order: ");
                    V0.append(this.b);
                    throw new IOException(V0.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            int i = this.f + 2;
            this.f = i;
            if (i <= this.c) {
                int read = this.a.read();
                int read2 = this.a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.b;
                    if (byteOrder == n) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == o) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder V0 = je.V0("Invalid byte order: ");
                    V0.append(this.b);
                    throw new IOException(V0.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f += 2;
            return this.a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f++;
            return this.a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            int i = this.f + 2;
            this.f = i;
            if (i <= this.c) {
                int read = this.a.read();
                int read2 = this.a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.b;
                    if (byteOrder == n) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == o) {
                        return (read << 8) + read2;
                    }
                    StringBuilder V0 = je.V0("Invalid byte order: ");
                    V0.append(this.b);
                    throw new IOException(V0.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) {
            int min = Math.min(i, this.c - this.f);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.a.skipBytes(min - i2);
            }
            this.f += i2;
            return i2;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = this.a.read(bArr, i, i2);
            this.f += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            int length = this.f + bArr.length;
            this.f = length;
            if (length > this.c) {
                throw new EOFException();
            } else if (this.a.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v5$d */
    public static class d {
        public final int a;
        public final int b;
        public final byte[] c;

        d(int i, int i2, long j, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = bArr;
        }

        public static d a(String str) {
            byte[] bytes = je.o0(str, 0).getBytes(v5.o0);
            return new d(2, bytes.length, bytes);
        }

        public static d b(long j, ByteOrder byteOrder) {
            return c(new long[]{j}, byteOrder);
        }

        public static d c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(v5.U[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(v5.U[5] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.a);
                wrap.putInt((int) fVar.b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d e(int i, ByteOrder byteOrder) {
            return f(new int[]{i}, byteOrder);
        }

        public static d f(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(v5.U[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double g(ByteOrder byteOrder) {
            Object j = j(byteOrder);
            if (j == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (j instanceof String) {
                return Double.parseDouble((String) j);
            } else {
                if (j instanceof long[]) {
                    long[] jArr = (long[]) j;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j instanceof int[]) {
                    int[] iArr = (int[]) j;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j instanceof double[]) {
                    double[] dArr = (double[]) j;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j instanceof f[]) {
                    f[] fVarArr = (f[]) j;
                    if (fVarArr.length == 1) {
                        f fVar = fVarArr[0];
                        double d = (double) fVar.a;
                        double d2 = (double) fVar.b;
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        return d / d2;
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int h(ByteOrder byteOrder) {
            Object j = j(byteOrder);
            if (j == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (j instanceof String) {
                return Integer.parseInt((String) j);
            } else {
                if (j instanceof long[]) {
                    long[] jArr = (long[]) j;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j instanceof int[]) {
                    int[] iArr = (int[]) j;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String i(ByteOrder byteOrder) {
            Object j = j(byteOrder);
            if (j == null) {
                return null;
            }
            if (j instanceof String) {
                return (String) j;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (j instanceof long[]) {
                long[] jArr = (long[]) j;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (j instanceof int[]) {
                int[] iArr = (int[]) j;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (j instanceof double[]) {
                double[] dArr = (double[]) j;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(j instanceof f[])) {
                return null;
            } else {
                f[] fVarArr = (f[]) j;
                while (i < fVarArr.length) {
                    sb.append(fVarArr[i].a);
                    sb.append('/');
                    sb.append(fVarArr[i].b);
                    i++;
                    if (i != fVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x018f A[SYNTHETIC, Splitter:B:134:0x018f] */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x019b A[SYNTHETIC, Splitter:B:143:0x019b] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object j(java.nio.ByteOrder r11) {
            /*
            // Method dump skipped, instructions count: 448
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.v5.d.j(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            StringBuilder V0 = je.V0("(");
            V0.append(v5.T[this.a]);
            V0.append(", data length:");
            return je.B0(V0, this.c.length, ")");
        }

        d(int i, int i2, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = bArr;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v5$e */
    public static class e {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        e(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        e(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public v5(InputStream inputStream) {
        e[][] eVarArr = g0;
        this.f = new HashMap[eVarArr.length];
        this.g = new HashSet(eVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        this.a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (z(fileInputStream.getFD())) {
                    this.c = null;
                    this.b = fileInputStream.getFD();
                }
            }
            this.c = null;
            this.b = null;
        }
        B(inputStream);
    }
}
