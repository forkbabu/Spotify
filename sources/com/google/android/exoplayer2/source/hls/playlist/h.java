package com.google.android.exoplayer2.source.hls.playlist;

import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.util.f0;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public final class h implements x.a<g> {
    private static final Pattern A = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern B = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern C = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern D = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern E = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern F = b("AUTOSELECT");
    private static final Pattern G = b("DEFAULT");
    private static final Pattern H = b("FORCED");
    private static final Pattern I = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern J = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern K = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    private static final Pattern b = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern c = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern d = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern e = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern f = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern g = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern h = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern i = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern j = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern k = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern l = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern m = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern n = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern o = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern p = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern q = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern r = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern s = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern t = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern u = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern v = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern w = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern x = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern y = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern z = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private final e a;

    /* access modifiers changed from: private */
    public static class a {
        private final BufferedReader a;
        private final Queue<String> b;
        private String c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.b = queue;
            this.a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean a() {
            String trim;
            if (this.c != null) {
                return true;
            }
            if (!this.b.isEmpty()) {
                String poll = this.b.poll();
                poll.getClass();
                this.c = poll;
                return true;
            }
            do {
                String readLine = this.a.readLine();
                this.c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() {
            if (a()) {
                String str = this.c;
                this.c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public h() {
        this.a = e.n;
    }

    private static Pattern b(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static l.b c(String str, String str2, Map<String, String> map) {
        String i2 = i(str, w, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String k2 = k(str, x, map);
            return new l.b(u.d, null, "video/mp4", Base64.decode(k2.substring(k2.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new l.b(u.d, null, "hls", f0.z(str));
        } else {
            if (!"com.microsoft.playready".equals(str2) || !"1".equals(i2)) {
                return null;
            }
            String k3 = k(str, x, map);
            byte[] decode = Base64.decode(k3.substring(k3.indexOf(44)), 0);
            UUID uuid = u.e;
            return new l.b(uuid, null, "video/mp4", vk.a(uuid, decode));
        }
    }

    private static String d(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int e(String str, Pattern pattern) {
        return Integer.parseInt(k(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.source.hls.playlist.e f(com.google.android.exoplayer2.source.hls.playlist.h.a r38, java.lang.String r39) {
        /*
        // Method dump skipped, instructions count: 1316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.h.f(com.google.android.exoplayer2.source.hls.playlist.h$a, java.lang.String):com.google.android.exoplayer2.source.hls.playlist.e");
    }

    private static f g(e eVar, a aVar, String str) {
        TreeMap treeMap;
        l lVar;
        long j2;
        e eVar2 = eVar;
        boolean z2 = eVar2.c;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TreeMap treeMap2 = new TreeMap();
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        boolean z3 = false;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        long j5 = 0;
        l lVar2 = null;
        int i3 = 0;
        long j6 = 0;
        int i4 = 1;
        boolean z4 = false;
        long j7 = 0;
        String str4 = null;
        int i5 = 0;
        long j8 = 0;
        l lVar3 = null;
        f.a aVar2 = null;
        long j9 = 0;
        while (true) {
            String str5 = "";
            String str6 = str3;
            long j10 = j5;
            int i6 = i3;
            long j11 = j6;
            int i7 = i4;
            boolean z5 = z4;
            String str7 = str4;
            int i8 = i5;
            long j12 = j8;
            l lVar4 = lVar3;
            f.a aVar3 = aVar2;
            long j13 = -1;
            boolean z6 = false;
            long j14 = 0;
            int i9 = i2;
            String str8 = str2;
            long j15 = j4;
            while (aVar.a()) {
                String b2 = aVar.b();
                if (b2.startsWith("#EXT")) {
                    arrayList2.add(b2);
                }
                if (b2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String k2 = k(b2, n, hashMap);
                    if ("VOD".equals(k2)) {
                        i9 = 1;
                    } else if ("EVENT".equals(k2)) {
                        i9 = 2;
                    }
                } else if (b2.startsWith("#EXT-X-START")) {
                    j3 = (long) (Double.parseDouble(k(b2, r, Collections.emptyMap())) * 1000000.0d);
                } else if (b2.startsWith("#EXT-X-MAP")) {
                    String k3 = k(b2, x, hashMap);
                    String j16 = j(b2, t, hashMap);
                    if (j16 != null) {
                        String[] split = j16.split("@");
                        long parseLong = Long.parseLong(split[0]);
                        if (split.length > 1) {
                            j7 = Long.parseLong(split[1]);
                        }
                        j2 = parseLong;
                    } else {
                        j2 = j13;
                    }
                    if (str8 == null || str7 != null) {
                        aVar3 = new f.a(k3, null, "", 0, -1, -9223372036854775807L, null, str8, str7, j7, j2, false);
                        j13 = -1;
                        z2 = z2;
                        z3 = z3;
                        j7 = 0;
                    } else {
                        throw new ParserException("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                    }
                } else {
                    if (b2.startsWith("#EXT-X-TARGETDURATION")) {
                        j15 = 1000000 * ((long) e(b2, l));
                    } else if (b2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        j11 = Long.parseLong(k(b2, o, Collections.emptyMap()));
                        j12 = j11;
                    } else if (b2.startsWith("#EXT-X-VERSION")) {
                        i7 = e(b2, m);
                    } else {
                        if (b2.startsWith("#EXT-X-DEFINE")) {
                            String j17 = j(b2, J, hashMap);
                            if (j17 != null) {
                                String str9 = eVar2.l.get(j17);
                                if (str9 != null) {
                                    hashMap.put(j17, str9);
                                }
                            } else {
                                hashMap.put(k(b2, B, hashMap), k(b2, I, hashMap));
                            }
                        } else if (b2.startsWith("#EXTINF")) {
                            str5 = i(b2, q, "", hashMap);
                            j14 = (long) (Double.parseDouble(k(b2, p, Collections.emptyMap())) * 1000000.0d);
                        } else if (b2.startsWith("#EXT-X-KEY")) {
                            String k4 = k(b2, u, hashMap);
                            String i10 = i(b2, v, "identity", hashMap);
                            if ("NONE".equals(k4)) {
                                treeMap2.clear();
                                str7 = null;
                            } else {
                                str7 = j(b2, y, hashMap);
                                if (!"identity".equals(i10)) {
                                    if (str6 == null) {
                                        str6 = d(k4);
                                    }
                                    l.b c2 = c(b2, i10, hashMap);
                                    if (c2 != null) {
                                        treeMap2.put(i10, c2);
                                    }
                                } else if ("AES-128".equals(k4)) {
                                    str8 = k(b2, x, hashMap);
                                }
                                z3 = z3;
                                str8 = null;
                                eVar2 = eVar;
                                z2 = z2;
                            }
                            z3 = z3;
                            str8 = null;
                            lVar4 = null;
                            eVar2 = eVar;
                            z2 = z2;
                        } else if (b2.startsWith("#EXT-X-BYTERANGE")) {
                            String[] split2 = k(b2, s, hashMap).split("@");
                            j13 = Long.parseLong(split2[0]);
                            if (split2.length > 1) {
                                j7 = Long.parseLong(split2[1]);
                            }
                        } else {
                            if (b2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                i6 = Integer.parseInt(b2.substring(b2.indexOf(58) + 1));
                                z3 = true;
                            } else if (b2.equals("#EXT-X-DISCONTINUITY")) {
                                i8++;
                            } else if (!b2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                z2 = true;
                                if (b2.equals("#EXT-X-GAP")) {
                                    eVar2 = eVar;
                                    z2 = z2;
                                    z3 = z3;
                                    z6 = true;
                                } else if (b2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                    eVar2 = eVar;
                                    z3 = z3;
                                } else if (b2.equals("#EXT-X-ENDLIST")) {
                                    eVar2 = eVar;
                                    z2 = z2;
                                    z3 = z3;
                                    z5 = true;
                                } else if (!b2.startsWith("#")) {
                                    String hexString = str8 == null ? null : str7 != null ? str7 : Long.toHexString(j12);
                                    long j18 = j12 + 1;
                                    if (j13 == -1) {
                                        j7 = 0;
                                    }
                                    if (lVar4 != null || treeMap2.isEmpty()) {
                                        treeMap = treeMap2;
                                        lVar = lVar4;
                                    } else {
                                        int i11 = 0;
                                        l.b[] bVarArr = (l.b[]) treeMap2.values().toArray(new l.b[0]);
                                        lVar = new l(str6, bVarArr);
                                        if (lVar2 == null) {
                                            l.b[] bVarArr2 = new l.b[bVarArr.length];
                                            treeMap = treeMap2;
                                            while (i11 < bVarArr.length) {
                                                bVarArr2[i11] = bVarArr[i11].b(null);
                                                i11++;
                                                bVarArr = bVarArr;
                                            }
                                            lVar2 = new l(str6, bVarArr2);
                                        } else {
                                            treeMap = treeMap2;
                                        }
                                    }
                                    arrayList.add(new f.a(l(b2, hashMap), aVar3, str5, j14, i8, j9, lVar, str8, hexString, j7, j13, z6));
                                    j9 += j14;
                                    if (j13 != -1) {
                                        j7 += j13;
                                    }
                                    eVar2 = eVar;
                                    str3 = str6;
                                    lVar3 = lVar;
                                    aVar2 = aVar3;
                                    j8 = j18;
                                    treeMap2 = treeMap;
                                    j6 = j11;
                                    i4 = i7;
                                    z4 = z5;
                                    i5 = i8;
                                    z2 = z2;
                                    z3 = z3;
                                    str4 = str7;
                                    i3 = i6;
                                    j5 = j10;
                                    i2 = i9;
                                    str2 = str8;
                                    j4 = j15;
                                }
                            } else if (j10 == 0) {
                                j10 = u.a(f0.H(b2.substring(b2.indexOf(58) + 1))) - j9;
                                z3 = z3;
                            }
                            eVar2 = eVar;
                            z2 = z2;
                        }
                        eVar2 = eVar;
                        treeMap2 = treeMap2;
                        z2 = z2;
                        z3 = z3;
                    }
                    z3 = z3;
                    eVar2 = eVar;
                    z2 = z2;
                }
            }
            return new f(i9, str, arrayList2, j3, j10, z3, i6, j11, i7, j15, z2, z5, j10 != 0, lVar2, arrayList);
        }
    }

    private static boolean h(String str, Pattern pattern, boolean z2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z2;
    }

    private static String i(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    private static String j(String str, Pattern pattern, Map<String, String> map) {
        return i(str, pattern, null, map);
    }

    private static String k(String str, Pattern pattern, Map<String, String> map) {
        String i2 = i(str, pattern, null, map);
        if (i2 != null) {
            return i2;
        }
        StringBuilder V0 = je.V0("Couldn't match ");
        V0.append(pattern.pattern());
        V0.append(" in ");
        V0.append(str);
        throw new ParserException(V0.toString());
    }

    private static String l(String str, Map<String, String> map) {
        Matcher matcher = K.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int m(BufferedReader bufferedReader, boolean z2, int i2) {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !f0.C(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050 A[Catch:{ all -> 0x00ed }, LOOP:1: B:18:0x0050->B:65:0x0050, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e5  */
    @Override // com.google.android.exoplayer2.upstream.x.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.source.hls.playlist.g a(android.net.Uri r7, java.io.InputStream r8) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.h.a(android.net.Uri, java.io.InputStream):java.lang.Object");
    }

    public h(e eVar) {
        this.a = eVar;
    }
}
