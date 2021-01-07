package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import java.util.ArrayList;

public final class s {
    private static final ArrayList<a> a = new ArrayList<>();

    /* access modifiers changed from: private */
    public static final class a {
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : f0.O(str)) {
            String c = c(str2);
            if (c != null && h(c)) {
                return c;
            }
        }
        return null;
    }

    public static int b(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 2;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 3;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 4;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 5;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                return 5;
            case 3:
                return 17;
            case 4:
                return 6;
            case 5:
                return 8;
            case 6:
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String Q = f0.Q(str.trim());
        if (Q.startsWith(VisualSampleEntry.TYPE3) || Q.startsWith(VisualSampleEntry.TYPE4)) {
            return "video/avc";
        }
        if (Q.startsWith(VisualSampleEntry.TYPE7) || Q.startsWith(VisualSampleEntry.TYPE6)) {
            return "video/hevc";
        }
        if (Q.startsWith("dvav") || Q.startsWith("dva1") || Q.startsWith("dvhe") || Q.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (Q.startsWith("av01")) {
            return "video/av01";
        }
        if (Q.startsWith("vp9") || Q.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (Q.startsWith("vp8") || Q.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (Q.startsWith(AudioSampleEntry.TYPE3)) {
            if (Q.startsWith("mp4a.")) {
                String substring = Q.substring(5);
                if (substring.length() >= 2) {
                    try {
                        str2 = d(Integer.parseInt(f0.R(substring.substring(0, 2)), 16));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (Q.startsWith(AudioSampleEntry.TYPE8) || Q.startsWith(AC3SpecificBox.TYPE)) {
            return "audio/ac3";
        } else {
            if (Q.startsWith(AudioSampleEntry.TYPE9) || Q.startsWith(EC3SpecificBox.TYPE)) {
                return "audio/eac3";
            }
            if (Q.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (Q.startsWith("ac-4") || Q.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (Q.startsWith("dtsc") || Q.startsWith(AudioSampleEntry.TYPE13)) {
                return "audio/vnd.dts";
            }
            if (Q.startsWith(AudioSampleEntry.TYPE12) || Q.startsWith(AudioSampleEntry.TYPE11)) {
                return "audio/vnd.dts.hd";
            }
            if (Q.startsWith("opus")) {
                return "audio/opus";
            }
            if (Q.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (Q.startsWith("flac")) {
                return "audio/flac";
            }
            int size = a.size();
            for (int i = 0; i < size; i++) {
                a.get(i).getClass();
                if (Q.startsWith(null)) {
                    break;
                }
            }
            return null;
        }
    }

    public static String d(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    private static String e(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (j(str)) {
            return 2;
        }
        if (i(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        int size = a.size();
        for (int i = 0; i < size; i++) {
            a.get(i).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : f0.O(str)) {
            String c = c(str2);
            if (c != null && j(c)) {
                return c;
            }
        }
        return null;
    }

    public static boolean h(String str) {
        return "audio".equals(e(str));
    }

    public static boolean i(String str) {
        return "text".equals(e(str));
    }

    public static boolean j(String str) {
        return "video".equals(e(str));
    }
}
