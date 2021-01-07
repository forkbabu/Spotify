package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.s;
import com.google.android.exoplayer2.video.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MediaCodecUtil {
    private static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<b, List<e>> b = new HashMap<>();
    private static final SparseIntArray c;
    private static final SparseIntArray d;
    private static final SparseIntArray e;
    private static final SparseIntArray f;
    private static final Map<String, Integer> g;
    private static final Map<String, Integer> h;
    private static final Map<String, Integer> i;
    private static final SparseIntArray j;
    private static final SparseIntArray k;
    private static int l = -1;
    public static final /* synthetic */ int m = 0;

    public static class DecoderQueryException extends Exception {
        DecoderQueryException(Throwable th, a aVar) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* access modifiers changed from: private */
    public static final class b {
        public final String a;
        public final boolean b;
        public final boolean c;

        public b(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            if (TextUtils.equals(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = 1231;
            int Y0 = (je.Y0(this.a, 31, 31) + (this.b ? 1231 : 1237)) * 31;
            if (!this.c) {
                i = 1237;
            }
            return Y0 + i;
        }
    }

    /* access modifiers changed from: private */
    public interface c {
        MediaCodecInfo a(int i);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* access modifiers changed from: private */
    public static final class d implements c {
        d(a aVar) {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static final class e implements c {
        private final int a;
        private MediaCodecInfo[] b;

        public e(boolean z, boolean z2) {
            this.a = (z || z2) ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo a(int i) {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
            return this.b[i];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int d() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
            return this.b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean e() {
            return true;
        }
    }

    /* access modifiers changed from: private */
    public interface f<T> {
        int a(T t);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        sparseIntArray.put(110, 16);
        sparseIntArray.put(122, 32);
        sparseIntArray.put(244, 64);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        e = sparseIntArray3;
        sparseIntArray3.put(0, 1);
        sparseIntArray3.put(1, 2);
        sparseIntArray3.put(2, 4);
        sparseIntArray3.put(3, 8);
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        f = sparseIntArray4;
        sparseIntArray4.put(10, 1);
        sparseIntArray4.put(11, 2);
        sparseIntArray4.put(20, 4);
        sparseIntArray4.put(21, 8);
        sparseIntArray4.put(30, 16);
        sparseIntArray4.put(31, 32);
        sparseIntArray4.put(40, 64);
        sparseIntArray4.put(41, 128);
        sparseIntArray4.put(50, 256);
        sparseIntArray4.put(51, 512);
        sparseIntArray4.put(60, 2048);
        sparseIntArray4.put(61, 4096);
        sparseIntArray4.put(62, 8192);
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        je.f(16384, hashMap, "L150", 65536, "L153", 262144, "L156", 1048576, "L180");
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        je.f(32768, hashMap, "H150", 131072, "H153", 524288, "H156", 2097152, "H180");
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
        HashMap hashMap2 = new HashMap();
        h = hashMap2;
        hashMap2.put("00", 1);
        hashMap2.put("01", 2);
        hashMap2.put("02", 4);
        hashMap2.put("03", 8);
        hashMap2.put("04", 16);
        hashMap2.put("05", 32);
        hashMap2.put("06", 64);
        hashMap2.put("07", 128);
        hashMap2.put("08", 256);
        hashMap2.put("09", 512);
        HashMap hashMap3 = new HashMap();
        i = hashMap3;
        hashMap3.put("01", 1);
        hashMap3.put("02", 2);
        hashMap3.put("03", 4);
        hashMap3.put("04", 8);
        hashMap3.put("05", 16);
        hashMap3.put("06", 32);
        hashMap3.put("07", 64);
        hashMap3.put("08", 128);
        hashMap3.put("09", 256);
        SparseIntArray sparseIntArray5 = new SparseIntArray();
        j = sparseIntArray5;
        sparseIntArray5.put(0, 1);
        sparseIntArray5.put(1, 2);
        sparseIntArray5.put(2, 4);
        sparseIntArray5.put(3, 8);
        sparseIntArray5.put(4, 16);
        sparseIntArray5.put(5, 32);
        sparseIntArray5.put(6, 64);
        sparseIntArray5.put(7, 128);
        sparseIntArray5.put(8, 256);
        sparseIntArray5.put(9, 512);
        sparseIntArray5.put(10, 1024);
        sparseIntArray5.put(11, 2048);
        sparseIntArray5.put(12, 4096);
        sparseIntArray5.put(13, 8192);
        sparseIntArray5.put(14, 16384);
        sparseIntArray5.put(15, 32768);
        sparseIntArray5.put(16, 65536);
        sparseIntArray5.put(17, 131072);
        sparseIntArray5.put(18, 262144);
        sparseIntArray5.put(19, 524288);
        sparseIntArray5.put(20, 1048576);
        sparseIntArray5.put(21, 2097152);
        sparseIntArray5.put(22, 4194304);
        sparseIntArray5.put(23, 8388608);
        SparseIntArray sparseIntArray6 = new SparseIntArray();
        k = sparseIntArray6;
        sparseIntArray6.put(1, 1);
        sparseIntArray6.put(2, 2);
        sparseIntArray6.put(3, 3);
        sparseIntArray6.put(4, 4);
        sparseIntArray6.put(5, 5);
        sparseIntArray6.put(6, 6);
        sparseIntArray6.put(17, 17);
        sparseIntArray6.put(20, 20);
        sparseIntArray6.put(23, 23);
        sparseIntArray6.put(29, 29);
        sparseIntArray6.put(39, 39);
        sparseIntArray6.put(42, 42);
    }

    private static void a(String str, List<e> list) {
        if ("audio/raw".equals(str)) {
            if (f0.a < 26 && f0.b.equals("R9") && list.size() == 1 && list.get(0).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(e.i("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            j(list, a.a);
        } else if (f0.a < 21 && list.size() > 1) {
            String str2 = list.get(0).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                j(list, b.a);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b0, code lost:
        if (r2.startsWith("t0") == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (r0.startsWith("HM") == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e1, code lost:
        if ("SO-02E".equals(r2) == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010f, code lost:
        if ("C1605".equals(r0) == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0171, code lost:
        if ("SCV31".equals(r0) == false) goto L_0x0174;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01dd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(android.media.MediaCodecInfo r5, java.lang.String r6, boolean r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 574
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b(android.media.MediaCodecInfo, java.lang.String, boolean, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair<Integer, Integer> c(d0 d0Var) {
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Integer num;
        Integer num2;
        String str = d0Var.o;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        int i8 = 1;
        if (!"video/dolby-vision".equals(d0Var.r)) {
            String str2 = split[0];
            str2.hashCode();
            switch (str2.hashCode()) {
                case 3004662:
                    if (str2.equals("av01")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3006243:
                    if (str2.equals(VisualSampleEntry.TYPE3)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3006244:
                    if (str2.equals("avc2")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3199032:
                    if (str2.equals(VisualSampleEntry.TYPE7)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3214780:
                    if (str2.equals(VisualSampleEntry.TYPE6)) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3356560:
                    if (str2.equals(AudioSampleEntry.TYPE3)) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3624515:
                    if (str2.equals("vp09")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    i iVar = d0Var.D;
                    if (split.length < 4) {
                        return null;
                    }
                    try {
                        int parseInt = Integer.parseInt(split[1]);
                        int parseInt2 = Integer.parseInt(split[2].substring(0, 2));
                        int parseInt3 = Integer.parseInt(split[3]);
                        if (parseInt != 0) {
                            return null;
                        }
                        if (parseInt3 != 8 && parseInt3 != 10) {
                            return null;
                        }
                        if (parseInt3 != 8) {
                            i8 = (iVar == null || !(iVar.f != null || (i2 = iVar.c) == 7 || i2 == 6)) ? 2 : 4096;
                        }
                        int i9 = j.get(parseInt2, -1);
                        if (i9 == -1) {
                            return null;
                        }
                        return new Pair<>(Integer.valueOf(i8), Integer.valueOf(i9));
                    } catch (NumberFormatException unused) {
                        return null;
                    }
                case 1:
                case 2:
                    if (split.length < 2) {
                        return null;
                    }
                    try {
                        if (split[1].length() == 6) {
                            i3 = Integer.parseInt(split[1].substring(0, 2), 16);
                            i4 = Integer.parseInt(split[1].substring(4), 16);
                        } else if (split.length < 3) {
                            return null;
                        } else {
                            i3 = Integer.parseInt(split[1]);
                            i4 = Integer.parseInt(split[2]);
                        }
                        int i10 = c.get(i3, -1);
                        if (i10 == -1 || (i5 = d.get(i4, -1)) == -1) {
                            return null;
                        }
                        return new Pair<>(Integer.valueOf(i10), Integer.valueOf(i5));
                    } catch (NumberFormatException unused2) {
                        return null;
                    }
                case 3:
                case 4:
                    if (split.length < 4) {
                        return null;
                    }
                    Matcher matcher = a.matcher(split[1]);
                    if (!matcher.matches()) {
                        return null;
                    }
                    String group = matcher.group(1);
                    if (!"1".equals(group)) {
                        if (!"2".equals(group)) {
                            return null;
                        }
                        i8 = 2;
                    }
                    Integer num3 = g.get(split[3]);
                    if (num3 == null) {
                        return null;
                    }
                    return new Pair<>(Integer.valueOf(i8), num3);
                case 5:
                    if (split.length != 3) {
                        return null;
                    }
                    try {
                        if (!"audio/mp4a-latm".equals(s.d(Integer.parseInt(split[1], 16))) || (i6 = k.get(Integer.parseInt(split[2]), -1)) == -1) {
                            return null;
                        }
                        return new Pair<>(Integer.valueOf(i6), 0);
                    } catch (NumberFormatException unused3) {
                        return null;
                    }
                case 6:
                    if (split.length < 3) {
                        return null;
                    }
                    try {
                        int parseInt4 = Integer.parseInt(split[1]);
                        int parseInt5 = Integer.parseInt(split[2]);
                        int i11 = e.get(parseInt4, -1);
                        if (i11 == -1 || (i7 = f.get(parseInt5, -1)) == -1) {
                            return null;
                        }
                        return new Pair<>(Integer.valueOf(i11), Integer.valueOf(i7));
                    } catch (NumberFormatException unused4) {
                        return null;
                    }
                default:
                    return null;
            }
        } else if (split.length < 3) {
            return null;
        } else {
            Matcher matcher2 = a.matcher(split[1]);
            if (!matcher2.matches() || (num = h.get(matcher2.group(1))) == null || (num2 = i.get(split[2])) == null) {
                return null;
            }
            return new Pair<>(num, num2);
        }
    }

    public static e d(String str, boolean z, boolean z2) {
        List<e> e2 = e(str, z, z2);
        if (e2.isEmpty()) {
            return null;
        }
        return e2.get(0);
    }

    public static synchronized List<e> e(String str, boolean z, boolean z2) {
        synchronized (MediaCodecUtil.class) {
            b bVar = new b(str, z, z2);
            HashMap<b, List<e>> hashMap = b;
            List<e> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i2 = f0.a;
            ArrayList<e> f2 = f(bVar, i2 >= 21 ? new e(z, z2) : new d(null));
            if (z && f2.isEmpty() && 21 <= i2 && i2 <= 23) {
                f2 = f(bVar, new d(null));
                if (!f2.isEmpty()) {
                    String str2 = f2.get(0).a;
                }
            }
            a(str, f2);
            List<e> unmodifiableList = Collections.unmodifiableList(f2);
            hashMap.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d0, code lost:
        if (r1.b == false) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ce A[SYNTHETIC, Splitter:B:50:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x017b A[ADDED_TO_REGION, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<com.google.android.exoplayer2.mediacodec.e> f(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.b r26, com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c r27) {
        /*
        // Method dump skipped, instructions count: 426
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f(com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b, com.google.android.exoplayer2.mediacodec.MediaCodecUtil$c):java.util.ArrayList");
    }

    public static List<e> g(List<e> list, d0 d0Var) {
        ArrayList arrayList = new ArrayList(list);
        j(arrayList, new c(d0Var));
        return arrayList;
    }

    private static boolean h(MediaCodecInfo mediaCodecInfo) {
        if (f0.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String Q = f0.Q(mediaCodecInfo.getName());
        if (Q.startsWith("arc.")) {
            return false;
        }
        if (Q.startsWith("omx.google.") || Q.startsWith("omx.ffmpeg.") || ((Q.startsWith("omx.sec.") && Q.contains(".sw.")) || Q.equals("omx.qcom.video.decoder.hevcswvdec") || Q.startsWith("c2.android.") || Q.startsWith("c2.google.") || (!Q.startsWith("omx.") && !Q.startsWith("c2.")))) {
            return true;
        }
        return false;
    }

    public static int i() {
        int i2;
        if (l == -1) {
            int i3 = 0;
            e d2 = d("video/avc", false, false);
            if (d2 != null) {
                MediaCodecInfo.CodecProfileLevel[] d3 = d2.d();
                int length = d3.length;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = d3[i3].level;
                    if (i5 == 1 || i5 == 2) {
                        i2 = 25344;
                    } else {
                        switch (i5) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                continue;
                            case 64:
                                i2 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i2 = 414720;
                                continue;
                            case 512:
                                i2 = 921600;
                                continue;
                            case 1024:
                                i2 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i2 = 2097152;
                                continue;
                            case 8192:
                                i2 = 2228224;
                                continue;
                            case 16384:
                                i2 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i2 = 9437184;
                                continue;
                            default:
                                i2 = -1;
                                continue;
                        }
                    }
                    i4 = Math.max(i2, i4);
                    i3++;
                }
                i3 = Math.max(i4, f0.a >= 21 ? 345600 : 172800);
            }
            l = i3;
        }
        return l;
    }

    private static <T> void j(List<T> list, f<T> fVar) {
        Collections.sort(list, new d(fVar));
    }
}
