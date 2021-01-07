package com.spotify.mobile.android.video.exo.model;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.LinkedList;

public final class SpotifyJsonManifest_Deserializer extends StdDeserializer<SpotifyJsonManifest> {
    private static final long serialVersionUID = 1;

    SpotifyJsonManifest_Deserializer() {
        super(SpotifyJsonManifest.class);
    }

    public int _deserializeint(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    public long _deserializelong(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Long) NumberDeserializers.find(Long.TYPE, Constants.LONG).deserialize(jsonParser, deserializationContext)).longValue();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public SpotifyJsonManifest a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        char c;
        String[] strArr;
        String str;
        Content content;
        char c2;
        String str2;
        Profile profile;
        char c3;
        String str3;
        EncryptionInfo encryptionInfo;
        String[] strArr2;
        SpriteMap[] spriteMapArr;
        String[] strArr3;
        String[] strArr4;
        SpriteMap spriteMap;
        char c4;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        Content[] contentArr = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String[] strArr5 = null;
        String[] strArr6 = null;
        String[] strArr7 = null;
        SpriteMap[] spriteMapArr2 = null;
        String[] strArr8 = null;
        String str7 = null;
        long j = 0;
        long j2 = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                String str8 = "end_time_millis";
                SpriteMap[] spriteMapArr3 = spriteMapArr2;
                int i = 0;
                switch (currentName.hashCode()) {
                    case -1816382062:
                        if (currentName.equals("base_urls")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1632356039:
                        if (currentName.equals("initialization_template")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1609915582:
                        if (currentName.equals("spritemap_template")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1587558394:
                        if (currentName.equals("segment_template")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1357026668:
                        if (currentName.equals(str8)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -567321830:
                        if (currentName.equals("contents")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 700355483:
                        if (currentName.equals("start_time_millis")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 737033771:
                        if (currentName.equals("subtitle_base_urls")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1254673601:
                        if (currentName.equals("subtitle_template")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1532436188:
                        if (currentName.equals("spritemaps")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1747489670:
                        if (currentName.equals("subtitle_language_codes")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2129082314:
                        if (currentName.equals("spritemap_base_urls")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        strArr = strArr6;
                        jsonParser.nextValue();
                        strArr5 = b(jsonParser, deserializationContext);
                        break;
                    case 1:
                        strArr = strArr6;
                        jsonParser.nextValue();
                        str4 = deserializeString(jsonParser, deserializationContext);
                        break;
                    case 2:
                        strArr = strArr6;
                        jsonParser.nextValue();
                        str6 = deserializeString(jsonParser, deserializationContext);
                        break;
                    case 3:
                        strArr = strArr6;
                        jsonParser.nextValue();
                        str5 = deserializeString(jsonParser, deserializationContext);
                        break;
                    case 4:
                        strArr = strArr6;
                        jsonParser.nextValue();
                        j2 = _deserializelong(jsonParser, deserializationContext);
                        break;
                    case 5:
                        strArr = strArr6;
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            contentArr = null;
                        } else {
                            LinkedList<Content> linkedList = new LinkedList();
                            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                    str = str8;
                                    content = null;
                                } else {
                                    long j3 = 0;
                                    long j4 = 0;
                                    long j5 = 0;
                                    Profile[] profileArr = null;
                                    EncryptionInfo[] encryptionInfoArr = null;
                                    while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                        if (jsonParser.getCurrentToken().ordinal() == 5) {
                                            String currentName2 = jsonParser.getCurrentName();
                                            currentName2.hashCode();
                                            switch (currentName2.hashCode()) {
                                                case -1777030798:
                                                    if (currentName2.equals("segment_length")) {
                                                        c2 = 0;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case -1357026668:
                                                    if (currentName2.equals(str8)) {
                                                        c2 = 1;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case -1002263574:
                                                    if (currentName2.equals("profiles")) {
                                                        c2 = 2;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case -537414199:
                                                    if (currentName2.equals("encryption_infos")) {
                                                        c2 = 3;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case 700355483:
                                                    if (currentName2.equals("start_time_millis")) {
                                                        c2 = 4;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                default:
                                                    c2 = 65535;
                                                    break;
                                            }
                                            if (c2 == 0) {
                                                str2 = str8;
                                                jsonParser.nextValue();
                                                j3 = _deserializelong(jsonParser, deserializationContext);
                                            } else if (c2 == 1) {
                                                str2 = str8;
                                                jsonParser.nextValue();
                                                j5 = _deserializelong(jsonParser, deserializationContext);
                                            } else if (c2 == 2) {
                                                str2 = str8;
                                                jsonParser.nextValue();
                                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                                    str8 = str2;
                                                    profileArr = null;
                                                } else {
                                                    LinkedList<Profile> linkedList2 = new LinkedList();
                                                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                                            profile = null;
                                                        } else {
                                                            long j6 = 0;
                                                            int i2 = 0;
                                                            String str9 = null;
                                                            int i3 = 0;
                                                            int i4 = 0;
                                                            int i5 = 0;
                                                            int i6 = 0;
                                                            String str10 = null;
                                                            String str11 = null;
                                                            String str12 = null;
                                                            String str13 = null;
                                                            Integer num = null;
                                                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                                                if (jsonParser.getCurrentToken().ordinal() == 5) {
                                                                    String currentName3 = jsonParser.getCurrentName();
                                                                    currentName3.hashCode();
                                                                    switch (currentName3.hashCode()) {
                                                                        case -1316265955:
                                                                            if (currentName3.equals("file_type")) {
                                                                                c3 = 0;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -537416426:
                                                                            if (currentName3.equals("encryption_index")) {
                                                                                c3 = 1;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -324368021:
                                                                            if (currentName3.equals("video_height")) {
                                                                                c3 = 2;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -196041627:
                                                                            if (currentName3.equals("mime_type")) {
                                                                                c3 = 3;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -71359598:
                                                                            if (currentName3.equals("max_bitrate")) {
                                                                                c3 = 4;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 3355:
                                                                            if (currentName3.equals("id")) {
                                                                                c3 = 5;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 258902020:
                                                                            if (currentName3.equals("audio_bitrate")) {
                                                                                c3 = 6;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 770070125:
                                                                            if (currentName3.equals("audio_codec")) {
                                                                                c3 = 7;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 1370685266:
                                                                            if (currentName3.equals("video_codec")) {
                                                                                c3 = '\b';
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 1388977410:
                                                                            if (currentName3.equals("video_width")) {
                                                                                c3 = '\t';
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 1612033776:
                                                                            if (currentName3.equals("video_resolution")) {
                                                                                c3 = '\n';
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 1924434857:
                                                                            if (currentName3.equals("video_bitrate")) {
                                                                                c3 = 11;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        default:
                                                                            c3 = 65535;
                                                                            break;
                                                                    }
                                                                    switch (c3) {
                                                                        case 0:
                                                                            jsonParser.nextValue();
                                                                            str12 = deserializeString(jsonParser, deserializationContext);
                                                                            break;
                                                                        case 1:
                                                                            jsonParser.nextValue();
                                                                            num = (Integer) NumberDeserializers.find(Integer.class, "java.lang.Integer").deserialize(jsonParser, deserializationContext);
                                                                            break;
                                                                        case 2:
                                                                            jsonParser.nextValue();
                                                                            i5 = _deserializeint(jsonParser, deserializationContext);
                                                                            break;
                                                                        case 3:
                                                                            jsonParser.nextValue();
                                                                            str11 = deserializeString(jsonParser, deserializationContext);
                                                                            break;
                                                                        case 4:
                                                                            jsonParser.nextValue();
                                                                            str13 = deserializeString(jsonParser, deserializationContext);
                                                                            break;
                                                                        case 5:
                                                                            jsonParser.nextValue();
                                                                            j6 = _deserializelong(jsonParser, deserializationContext);
                                                                            break;
                                                                        case 6:
                                                                            jsonParser.nextValue();
                                                                            i6 = _deserializeint(jsonParser, deserializationContext);
                                                                            break;
                                                                        case 7:
                                                                            jsonParser.nextValue();
                                                                            str10 = deserializeString(jsonParser, deserializationContext);
                                                                            break;
                                                                        case '\b':
                                                                            jsonParser.nextValue();
                                                                            str9 = deserializeString(jsonParser, deserializationContext);
                                                                            break;
                                                                        case '\t':
                                                                            jsonParser.nextValue();
                                                                            i4 = _deserializeint(jsonParser, deserializationContext);
                                                                            break;
                                                                        case '\n':
                                                                            jsonParser.nextValue();
                                                                            i3 = _deserializeint(jsonParser, deserializationContext);
                                                                            break;
                                                                        case 11:
                                                                            jsonParser.nextValue();
                                                                            i2 = _deserializeint(jsonParser, deserializationContext);
                                                                            break;
                                                                        default:
                                                                            jsonParser.nextValue();
                                                                            jsonParser.skipChildren();
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                            profile = new Profile(j6, i2, str9, i3, i4, i5, i6, str10, str11, str12, str13, num);
                                                        }
                                                        linkedList2.add(profile);
                                                    }
                                                    Profile[] profileArr2 = new Profile[linkedList2.size()];
                                                    int i7 = 0;
                                                    for (Profile profile2 : linkedList2) {
                                                        profileArr2[i7] = profile2;
                                                        i7++;
                                                    }
                                                    profileArr = profileArr2;
                                                }
                                            } else if (c2 != 3) {
                                                if (c2 != 4) {
                                                    jsonParser.nextValue();
                                                    jsonParser.skipChildren();
                                                } else {
                                                    jsonParser.nextValue();
                                                    j4 = _deserializelong(jsonParser, deserializationContext);
                                                }
                                                str2 = str8;
                                            } else {
                                                jsonParser.nextValue();
                                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                                    str2 = str8;
                                                    encryptionInfoArr = null;
                                                } else {
                                                    LinkedList<EncryptionInfo> linkedList3 = new LinkedList();
                                                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                                            str3 = str8;
                                                            encryptionInfo = null;
                                                        } else {
                                                            String str14 = null;
                                                            String str15 = null;
                                                            while (true) {
                                                                str3 = str8;
                                                                if (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                                                    if (jsonParser.getCurrentToken().ordinal() == 5) {
                                                                        String currentName4 = jsonParser.getCurrentName();
                                                                        currentName4.hashCode();
                                                                        if (currentName4.equals("encryption_data")) {
                                                                            jsonParser.nextValue();
                                                                            str15 = deserializeString(jsonParser, deserializationContext);
                                                                        } else if (!currentName4.equals("key_system")) {
                                                                            jsonParser.nextValue();
                                                                            jsonParser.skipChildren();
                                                                        } else {
                                                                            jsonParser.nextValue();
                                                                            str14 = deserializeString(jsonParser, deserializationContext);
                                                                        }
                                                                    }
                                                                    str8 = str3;
                                                                } else {
                                                                    encryptionInfo = new EncryptionInfo(str14, str15);
                                                                }
                                                            }
                                                        }
                                                        linkedList3.add(encryptionInfo);
                                                        str8 = str3;
                                                    }
                                                    str2 = str8;
                                                    EncryptionInfo[] encryptionInfoArr2 = new EncryptionInfo[linkedList3.size()];
                                                    int i8 = 0;
                                                    for (EncryptionInfo encryptionInfo2 : linkedList3) {
                                                        encryptionInfoArr2[i8] = encryptionInfo2;
                                                        i8++;
                                                    }
                                                    encryptionInfoArr = encryptionInfoArr2;
                                                }
                                            }
                                            str8 = str2;
                                        }
                                    }
                                    str = str8;
                                    content = new Content(j3, j4, j5, profileArr, encryptionInfoArr);
                                }
                                linkedList.add(content);
                                str8 = str;
                            }
                            Content[] contentArr2 = new Content[linkedList.size()];
                            for (Content content2 : linkedList) {
                                contentArr2[i] = content2;
                                i++;
                            }
                            contentArr = contentArr2;
                        }
                        strArr7 = strArr7;
                        break;
                    case 6:
                        strArr = strArr6;
                        jsonParser.nextValue();
                        j = _deserializelong(jsonParser, deserializationContext);
                        break;
                    case 7:
                        strArr = strArr6;
                        jsonParser.nextValue();
                        strArr7 = b(jsonParser, deserializationContext);
                        break;
                    case '\b':
                        strArr = strArr6;
                        jsonParser.nextValue();
                        str7 = deserializeString(jsonParser, deserializationContext);
                        break;
                    case '\t':
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            strArr = strArr6;
                            strArr2 = strArr7;
                            spriteMapArr = null;
                        } else {
                            LinkedList<SpriteMap> linkedList4 = new LinkedList();
                            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                    strArr3 = strArr6;
                                    strArr4 = strArr7;
                                    spriteMap = null;
                                } else {
                                    strArr4 = strArr7;
                                    int i9 = 0;
                                    int i10 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        strArr3 = strArr6;
                                        if (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                            if (jsonParser.getCurrentToken().ordinal() == 5) {
                                                String currentName5 = jsonParser.getCurrentName();
                                                currentName5.hashCode();
                                                switch (currentName5.hashCode()) {
                                                    case -1221029593:
                                                        if (currentName5.equals("height")) {
                                                            c4 = 0;
                                                            break;
                                                        }
                                                        c4 = 65535;
                                                        break;
                                                    case 3355:
                                                        if (currentName5.equals("id")) {
                                                            c4 = 1;
                                                            break;
                                                        }
                                                        c4 = 65535;
                                                        break;
                                                    case 113126854:
                                                        if (currentName5.equals("width")) {
                                                            c4 = 2;
                                                            break;
                                                        }
                                                        c4 = 65535;
                                                        break;
                                                    default:
                                                        c4 = 65535;
                                                        break;
                                                }
                                                switch (c4) {
                                                    case 0:
                                                        jsonParser.nextValue();
                                                        i10 = _deserializeint(jsonParser, deserializationContext);
                                                        break;
                                                    case 1:
                                                        jsonParser.nextValue();
                                                        i9 = _deserializeint(jsonParser, deserializationContext);
                                                        break;
                                                    case 2:
                                                        jsonParser.nextValue();
                                                        i11 = _deserializeint(jsonParser, deserializationContext);
                                                        break;
                                                    default:
                                                        jsonParser.nextValue();
                                                        jsonParser.skipChildren();
                                                        break;
                                                }
                                            }
                                            strArr6 = strArr3;
                                        } else {
                                            spriteMap = new SpriteMap(i9, i10, i11);
                                        }
                                    }
                                }
                                linkedList4.add(spriteMap);
                                strArr7 = strArr4;
                                strArr6 = strArr3;
                            }
                            strArr = strArr6;
                            strArr2 = strArr7;
                            SpriteMap[] spriteMapArr4 = new SpriteMap[linkedList4.size()];
                            for (SpriteMap spriteMap2 : linkedList4) {
                                spriteMapArr4[i] = spriteMap2;
                                i++;
                            }
                            spriteMapArr = spriteMapArr4;
                        }
                        spriteMapArr3 = spriteMapArr;
                        strArr7 = strArr2;
                        break;
                    case '\n':
                        jsonParser.nextValue();
                        strArr8 = b(jsonParser, deserializationContext);
                        strArr = strArr6;
                        break;
                    case 11:
                        jsonParser.nextValue();
                        strArr6 = b(jsonParser, deserializationContext);
                        strArr = strArr6;
                        break;
                    default:
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                        strArr = strArr6;
                        break;
                }
                spriteMapArr2 = spriteMapArr3;
                strArr6 = strArr;
            }
        }
        return new SpotifyJsonManifest(contentArr, j, j2, str4, str5, str6, strArr5, strArr6, strArr7, spriteMapArr2, strArr8, str7);
    }

    public String[] b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<String> linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(deserializeString(jsonParser, deserializationContext));
        }
        int i = 0;
        String[] strArr = new String[linkedList.size()];
        for (String str : linkedList) {
            strArr[i] = str;
            i++;
        }
        return strArr;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            return a(jsonParser, deserializationContext);
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
    }

    public String deserializeString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        return _parseString(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }
}
