package com.spotify.mobile.android.video.exo;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.upstream.x;
import com.google.common.collect.Collections2;
import com.mp4parser.iso14496.part30.WebVTTSampleEntry;
import com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry;
import com.spotify.mobile.android.video.drm.DrmUtil;
import com.spotify.mobile.android.video.exo.model.Content;
import com.spotify.mobile.android.video.exo.model.Profile;
import com.spotify.mobile.android.video.exo.model.SpotifyJsonManifest;
import com.spotify.mobile.android.video.exo.model.SpriteMap;
import com.spotify.mobile.android.video.exo.r;
import com.spotify.mobile.android.video.i0;
import com.spotify.mobile.android.video.thumbnails.a;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class s implements x.a<r> {
    private static final Set<String> e;
    private final ObjectMapper a;
    private final String b;
    private final boolean c;
    private final HashMap<Integer, l> d = new HashMap<>();

    static {
        HashSet newHashSetWithExpectedSize = Collections2.newHashSetWithExpectedSize(2);
        Collections.addAll(newHashSetWithExpectedSize, "video/mp2t", "audio/mp2t");
        e = newHashSetWithExpectedSize;
    }

    public s(g gVar, String str, boolean z) {
        e b2 = gVar.b();
        b2.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.a = b2.build();
        this.b = str;
        this.c = z;
    }

    private static String b(String str, String str2) {
        if (com.google.android.exoplayer2.util.s.h(str)) {
            return com.google.android.exoplayer2.util.s.a(str2);
        }
        if (com.google.android.exoplayer2.util.s.j(str)) {
            return com.google.android.exoplayer2.util.s.g(str2);
        }
        if (c(str)) {
            return str;
        }
        if ("application/mp4".equals(str)) {
            if (XMLSubtitleSampleEntry.TYPE.equals(str2)) {
                return "application/ttml+xml";
            }
            if (WebVTTSampleEntry.TYPE.equals(str2)) {
                return "application/x-mp4-vtt";
            }
        } else if ("application/x-rawcc".equals(str) && str2 != null) {
            if (str2.contains("cea708")) {
                return "application/cea-708";
            }
            if (str2.contains("eia608") || str2.contains("cea608")) {
                return "application/cea-608";
            }
        }
        return null;
    }

    public static boolean c(String str) {
        return com.google.android.exoplayer2.util.s.i(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.exoplayer2.upstream.x.a
    public r a(Uri uri, InputStream inputStream) {
        r.b bVar;
        SpotifyJsonManifest spotifyJsonManifest;
        SpriteMap[] spriteMapArr;
        String[] strArr;
        int i;
        Profile[] profileArr;
        ArrayList arrayList;
        r.b bVar2;
        SpotifyJsonManifest spotifyJsonManifest2;
        ArrayList arrayList2;
        Integer num;
        int i2;
        ArrayList arrayList3;
        d0 d0Var;
        SpotifyJsonManifest spotifyJsonManifest3 = (SpotifyJsonManifest) this.a.readValue(inputStream, SpotifyJsonManifest.class);
        r.b bVar3 = new r.b();
        Content[] contentArr = spotifyJsonManifest3.contents;
        char c2 = 0;
        if (contentArr[0].encryptionInfos != null && contentArr[0].encryptionInfos.length != 0) {
            bVar3.c();
            int i3 = 0;
            while (true) {
                Content[] contentArr2 = spotifyJsonManifest3.contents;
                if (i3 >= contentArr2[0].encryptionInfos.length) {
                    break;
                }
                if ("widevine".equals(contentArr2[0].encryptionInfos[i3].keySystem)) {
                    this.d.put(Integer.valueOf(i3), new l("cenc", new l.b(DrmUtil.b, this.b, "video/mp4", Base64.decode(spotifyJsonManifest3.contents[0].encryptionInfos[i3].encryptionData, 0))));
                }
                i3++;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        List asList = Arrays.asList(spotifyJsonManifest3.baseUrls);
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Profile[] profileArr2 = spotifyJsonManifest3.contents[0].profiles;
        int length = profileArr2.length;
        int i4 = 0;
        while (i4 < length) {
            Profile profile = profileArr2[i4];
            if (!e.contains(profile.mimeType) && (!(profile.videoCodec == null && profile.audioCodec == null) && ((num = profile.encryptionIndex) == null || this.d.containsKey(num)))) {
                String str = profile.videoCodec;
                if (str != null) {
                    profileArr = profileArr2;
                    i = length;
                    d0Var = d0.x(String.valueOf(profile.id), profile.mimeType, b(profile.mimeType, str), profile.videoCodec, profile.videoBitrate, profile.videoWidth, profile.videoHeight, -1.0f, null, 0);
                    arrayList3 = arrayList6;
                    i2 = 2;
                } else {
                    profileArr = profileArr2;
                    i = length;
                    d0Var = d0.k(String.valueOf(profile.id), profile.mimeType, b(profile.mimeType, profile.audioCodec), profile.audioCodec, profile.audioBitrate, -1, -1, null, 0, null);
                    arrayList3 = arrayList5;
                    i2 = 1;
                }
                Integer num2 = profile.encryptionIndex;
                if (num2 != null) {
                    d0Var = d0Var.a(this.d.get(num2), d0Var.p);
                }
                String replace = spotifyJsonManifest3.initializationTemplate.replace("{{file_type}}", profile.fileType);
                String replace2 = spotifyJsonManifest3.segmentTemplate.replace("{{file_type}}", profile.fileType);
                long j = profile.id;
                Content[] contentArr3 = spotifyJsonManifest3.contents;
                spotifyJsonManifest2 = spotifyJsonManifest3;
                bVar2 = bVar3;
                long j2 = contentArr3[c2].segmentLength;
                arrayList = arrayList4;
                long j3 = contentArr3[c2].endTimeMs;
                Content content = contentArr3[c2];
                arrayList2 = arrayList5;
                arrayList3.add(new j(j, d0Var, i2, asList, replace, replace2, j2, j3 - content.startTimeMs));
            } else {
                spotifyJsonManifest2 = spotifyJsonManifest3;
                bVar2 = bVar3;
                arrayList2 = arrayList5;
                profileArr = profileArr2;
                i = length;
                arrayList = arrayList4;
            }
            i4++;
            c2 = 0;
            profileArr2 = profileArr;
            length = i;
            arrayList5 = arrayList2;
            spotifyJsonManifest3 = spotifyJsonManifest2;
            bVar3 = bVar2;
            arrayList4 = arrayList;
        }
        arrayList4.add(new k(2, arrayList6));
        arrayList4.add(new k(1, arrayList5));
        if (this.c) {
            ArrayList arrayList7 = new ArrayList();
            spotifyJsonManifest = spotifyJsonManifest3;
            String[] strArr2 = spotifyJsonManifest.subtitleLanguageCodes;
            if (strArr2 == null || strArr2.length == 0 || (strArr = spotifyJsonManifest.subtitleBaseUrls) == null || strArr.length == 0 || TextUtils.isEmpty(spotifyJsonManifest.subtitleTemplate)) {
                bVar = bVar3;
                bVar.d(null, Collections.emptyList());
            } else {
                bVar = bVar3;
                List asList2 = Arrays.asList(spotifyJsonManifest.subtitleBaseUrls);
                ArrayList arrayList8 = new ArrayList();
                int i5 = 0;
                while (true) {
                    String[] strArr3 = spotifyJsonManifest.subtitleLanguageCodes;
                    if (i5 >= strArr3.length) {
                        break;
                    }
                    i0 i0Var = new i0(strArr3[i5]);
                    arrayList8.add(i0Var);
                    d0 w = d0.w(i0Var.b(), "text/vtt", "", 0, 0, i0Var.b(), null, 0);
                    String replace3 = spotifyJsonManifest.subtitleTemplate.replace("{{language_code}}", i0Var.b());
                    Content[] contentArr4 = spotifyJsonManifest.contents;
                    arrayList7.add(new j((long) i5, w, 3, asList2, replace3, replace3, contentArr4[0].endTimeMs / 1000, contentArr4[0].endTimeMs));
                    i5++;
                }
                bVar.d(spotifyJsonManifest.subtitleTemplate, arrayList8);
            }
            if (!arrayList7.isEmpty()) {
                arrayList4.add(new k(3, arrayList7));
            }
        } else {
            spotifyJsonManifest = spotifyJsonManifest3;
            bVar = bVar3;
        }
        Content[] contentArr5 = spotifyJsonManifest.contents;
        bVar.b(Arrays.asList(new c(contentArr5[0].segmentLength, contentArr5[0].startTimeMs, contentArr5[0].endTimeMs, arrayList4)));
        String[] strArr4 = spotifyJsonManifest.spritemapBaseUrls;
        if (!(strArr4 == null || strArr4.length == 0 || (spriteMapArr = spotifyJsonManifest.spriteMaps) == null || spriteMapArr.length == 0 || TextUtils.isEmpty(spotifyJsonManifest.spritemapTemplate))) {
            String str2 = spotifyJsonManifest.spritemapBaseUrls[0];
            String str3 = spotifyJsonManifest.spritemapTemplate;
            int i6 = spotifyJsonManifest.spriteMaps[0].id;
            StringBuilder V0 = je.V0(str2);
            V0.append(str3.replace("{{spritemap_id}}", String.valueOf(i6)));
            String sb = V0.toString();
            SpriteMap[] spriteMapArr2 = spotifyJsonManifest.spriteMaps;
            bVar.e(new a(sb, spriteMapArr2[0].cellWidth, spriteMapArr2[0].cellHeight));
        }
        return bVar.a();
    }
}
