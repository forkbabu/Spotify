package com.spotify.music.spotlets.radio.model;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.player.model.ContextTrack;
import java.util.HashMap;
import java.util.LinkedList;

public final class StationEntitySession_Deserializer extends StdDeserializer<StationEntitySession> {
    private static final long serialVersionUID = 1;

    StationEntitySession_Deserializer() {
        super(StationEntitySession.class);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:191:0x0012 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:195:0x00b7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:197:0x00b7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[]] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v11 */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v15 */
    /* JADX WARN: Type inference failed for: r24v16 */
    /* JADX WARN: Type inference failed for: r24v17 */
    /* JADX WARN: Type inference failed for: r24v18 */
    /* JADX WARN: Type inference failed for: r24v19 */
    /* JADX WARN: Type inference failed for: r24v20 */
    /* JADX WARN: Type inference failed for: r24v21 */
    /* JADX WARN: Type inference failed for: r24v22 */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public StationEntitySession a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        char c;
        char c2;
        PlayerTrack playerTrack;
        char c3;
        RelatedArtistModel relatedArtistModel;
        RadioStationModel radioStationModel = 0;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        long j = 0;
        RadioStationModel radioStationModel2 = null;
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                switch (currentName.hashCode()) {
                    case -1932791312:
                        if (currentName.equals("radioStationModel")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -86827412:
                        if (currentName.equals("lastUpdateTime")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 100346066:
                        if (currentName.equals("index")) {
                            c = 2;
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
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                            String str = radioStationModel;
                            String str2 = str;
                            String str3 = str2;
                            String str4 = str3;
                            String str5 = str4;
                            String str6 = str5;
                            String str7 = str6;
                            String[] strArr = str7;
                            RelatedArtistModel[] relatedArtistModelArr = strArr;
                            PlayerTrack[] playerTrackArr = relatedArtistModelArr;
                            String str8 = playerTrackArr;
                            boolean z = false;
                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                if (jsonParser.getCurrentToken().ordinal() == 5) {
                                    String currentName2 = jsonParser.getCurrentName();
                                    currentName2.hashCode();
                                    char c4 = 3;
                                    switch (currentName2.hashCode()) {
                                        case -2060497896:
                                            if (currentName2.equals(ContextTrack.Metadata.KEY_SUBTITLE)) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -2059492806:
                                            if (currentName2.equals("playlistUri")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1870009356:
                                            if (currentName2.equals("titleUri")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -865716088:
                                            if (currentName2.equals("tracks")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -859610607:
                                            if (currentName2.equals("imageUri")) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -838143496:
                                            if (currentName2.equals("related_artists")) {
                                                c2 = 5;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -620139980:
                                            if (currentName2.equals("subtitleUri")) {
                                                c2 = 6;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 116076:
                                            if (currentName2.equals("uri")) {
                                                c2 = 7;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 109314082:
                                            if (currentName2.equals("seeds")) {
                                                c2 = '\b';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 110371416:
                                            if (currentName2.equals("title")) {
                                                c2 = '\t';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 191193553:
                                            if (currentName2.equals("explicitSave")) {
                                                c2 = '\n';
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 981647243:
                                            if (currentName2.equals("next_page_url")) {
                                                c2 = 11;
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
                                            jsonParser.nextValue();
                                            str6 = deserializeString(jsonParser, deserializationContext);
                                            strArr = strArr;
                                            playerTrackArr = playerTrackArr;
                                            break;
                                        case 1:
                                            jsonParser.nextValue();
                                            str5 = deserializeString(jsonParser, deserializationContext);
                                            strArr = strArr;
                                            playerTrackArr = playerTrackArr;
                                            break;
                                        case 2:
                                            jsonParser.nextValue();
                                            str3 = deserializeString(jsonParser, deserializationContext);
                                            strArr = strArr;
                                            playerTrackArr = playerTrackArr;
                                            break;
                                        case 3:
                                            jsonParser.nextValue();
                                            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                                playerTrackArr = 0;
                                                strArr = strArr;
                                                break;
                                            } else {
                                                LinkedList<PlayerTrack> linkedList = new LinkedList();
                                                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                                    if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                                        playerTrack = null;
                                                    } else {
                                                        String str9 = null;
                                                        String str10 = null;
                                                        String str11 = null;
                                                        String str12 = null;
                                                        String str13 = null;
                                                        while (true) {
                                                            String str14 = str9;
                                                            String str15 = str10;
                                                            String str16 = str11;
                                                            String str17 = str12;
                                                            String str18 = str13;
                                                            HashMap hashMap = null;
                                                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                                                if (jsonParser.getCurrentToken().ordinal() == 5) {
                                                                    String currentName3 = jsonParser.getCurrentName();
                                                                    currentName3.hashCode();
                                                                    switch (currentName3.hashCode()) {
                                                                        case -987494927:
                                                                            if (currentName3.equals(ContextTrack.Metadata.KEY_PROVIDER)) {
                                                                                c3 = 0;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case -450004177:
                                                                            if (currentName3.equals("metadata")) {
                                                                                c3 = 1;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 115792:
                                                                            if (currentName3.equals("uid")) {
                                                                                c3 = 2;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 116076:
                                                                            if (currentName3.equals("uri")) {
                                                                                c3 = 3;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 249799580:
                                                                            if (currentName3.equals("album_uri")) {
                                                                                c3 = 4;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        case 630249588:
                                                                            if (currentName3.equals("artist_uri")) {
                                                                                c3 = 5;
                                                                                break;
                                                                            }
                                                                            c3 = 65535;
                                                                            break;
                                                                        default:
                                                                            c3 = 65535;
                                                                            break;
                                                                    }
                                                                    if (c3 == 0) {
                                                                        jsonParser.nextValue();
                                                                        str18 = deserializeString(jsonParser, deserializationContext);
                                                                    } else if (c3 == 1) {
                                                                        jsonParser.nextValue();
                                                                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                                                            str9 = str14;
                                                                            str10 = str15;
                                                                            str11 = str16;
                                                                            str12 = str17;
                                                                            str13 = str18;
                                                                        } else {
                                                                            HashMap hashMap2 = new HashMap();
                                                                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                                                                String deserializeString = deserializeString(jsonParser, deserializationContext);
                                                                                jsonParser.nextValue();
                                                                                hashMap2.put(deserializeString, deserializeString(jsonParser, deserializationContext));
                                                                            }
                                                                            hashMap = hashMap2;
                                                                        }
                                                                    } else if (c3 == 2) {
                                                                        jsonParser.nextValue();
                                                                        str15 = deserializeString(jsonParser, deserializationContext);
                                                                    } else if (c3 == c4) {
                                                                        jsonParser.nextValue();
                                                                        str14 = deserializeString(jsonParser, deserializationContext);
                                                                    } else if (c3 == 4) {
                                                                        jsonParser.nextValue();
                                                                        str16 = deserializeString(jsonParser, deserializationContext);
                                                                    } else if (c3 != 5) {
                                                                        jsonParser.nextValue();
                                                                        jsonParser.skipChildren();
                                                                    } else {
                                                                        jsonParser.nextValue();
                                                                        str17 = deserializeString(jsonParser, deserializationContext);
                                                                    }
                                                                    c4 = 3;
                                                                }
                                                            }
                                                            playerTrack = new PlayerTrack(str14, str15, str16, str17, str18, hashMap);
                                                        }
                                                    }
                                                    linkedList.add(playerTrack);
                                                    c4 = 3;
                                                }
                                                PlayerTrack[] playerTrackArr2 = new PlayerTrack[linkedList.size()];
                                                int i2 = 0;
                                                for (PlayerTrack playerTrack2 : linkedList) {
                                                    playerTrackArr2[i2] = playerTrack2;
                                                    i2++;
                                                }
                                                playerTrackArr = playerTrackArr2;
                                                strArr = strArr;
                                                break;
                                            }
                                        case 4:
                                            jsonParser.nextValue();
                                            str4 = deserializeString(jsonParser, deserializationContext);
                                            strArr = strArr;
                                            playerTrackArr = playerTrackArr;
                                            break;
                                        case 5:
                                            jsonParser.nextValue();
                                            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                                relatedArtistModelArr = null;
                                                strArr = strArr;
                                                playerTrackArr = playerTrackArr;
                                                break;
                                            } else {
                                                LinkedList<RelatedArtistModel> linkedList2 = new LinkedList();
                                                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                                    if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                                        relatedArtistModel = null;
                                                    } else {
                                                        String str19 = null;
                                                        String str20 = null;
                                                        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                                            if (jsonParser.getCurrentToken().ordinal() == 5) {
                                                                String currentName4 = jsonParser.getCurrentName();
                                                                currentName4.hashCode();
                                                                if (currentName4.equals("artistUri")) {
                                                                    jsonParser.nextValue();
                                                                    str20 = deserializeString(jsonParser, deserializationContext);
                                                                } else if (!currentName4.equals("artistName")) {
                                                                    jsonParser.nextValue();
                                                                    jsonParser.skipChildren();
                                                                } else {
                                                                    jsonParser.nextValue();
                                                                    str19 = deserializeString(jsonParser, deserializationContext);
                                                                }
                                                            }
                                                        }
                                                        relatedArtistModel = RelatedArtistModel.create(str19, str20);
                                                    }
                                                    linkedList2.add(relatedArtistModel);
                                                }
                                                RelatedArtistModel[] relatedArtistModelArr2 = new RelatedArtistModel[linkedList2.size()];
                                                int i3 = 0;
                                                for (RelatedArtistModel relatedArtistModel2 : linkedList2) {
                                                    relatedArtistModelArr2[i3] = relatedArtistModel2;
                                                    i3++;
                                                }
                                                relatedArtistModelArr = relatedArtistModelArr2;
                                                strArr = strArr;
                                                playerTrackArr = playerTrackArr;
                                                break;
                                            }
                                        case 6:
                                            jsonParser.nextValue();
                                            str7 = deserializeString(jsonParser, deserializationContext);
                                            strArr = strArr;
                                            playerTrackArr = playerTrackArr;
                                            break;
                                        case 7:
                                            jsonParser.nextValue();
                                            str = deserializeString(jsonParser, deserializationContext);
                                            strArr = strArr;
                                            playerTrackArr = playerTrackArr;
                                            break;
                                        case '\b':
                                            jsonParser.nextValue();
                                            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                                strArr = 0;
                                                playerTrackArr = playerTrackArr;
                                                break;
                                            } else {
                                                LinkedList<String> linkedList3 = new LinkedList();
                                                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                                    linkedList3.add(deserializeString(jsonParser, deserializationContext));
                                                }
                                                String[] strArr2 = new String[linkedList3.size()];
                                                int i4 = 0;
                                                for (String str21 : linkedList3) {
                                                    strArr2[i4] = str21;
                                                    i4++;
                                                }
                                                strArr = strArr2;
                                                playerTrackArr = playerTrackArr;
                                                break;
                                            }
                                        case '\t':
                                            jsonParser.nextValue();
                                            str2 = deserializeString(jsonParser, deserializationContext);
                                            strArr = strArr;
                                            playerTrackArr = playerTrackArr;
                                            break;
                                        case '\n':
                                            jsonParser.nextValue();
                                            z = ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
                                            strArr = strArr;
                                            playerTrackArr = playerTrackArr;
                                            break;
                                        case 11:
                                            jsonParser.nextValue();
                                            str8 = deserializeString(jsonParser, deserializationContext);
                                            strArr = strArr;
                                            playerTrackArr = playerTrackArr;
                                            break;
                                        default:
                                            jsonParser.nextValue();
                                            jsonParser.skipChildren();
                                            strArr = strArr;
                                            playerTrackArr = playerTrackArr;
                                            break;
                                    }
                                }
                            }
                            radioStationModel = new RadioStationModel(str, str2, str3, str4, str5, str6, str7, strArr, relatedArtistModelArr, playerTrackArr, str8, z);
                        }
                        radioStationModel2 = radioStationModel;
                        break;
                    case 1:
                        jsonParser.nextValue();
                        j = ((Long) NumberDeserializers.find(Long.TYPE, Constants.LONG).deserialize(jsonParser, deserializationContext)).longValue();
                        break;
                    case 2:
                        jsonParser.nextValue();
                        i = ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
                        break;
                    default:
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                        break;
                }
                radioStationModel = null;
            }
        }
        return new StationEntitySession(radioStationModel2, i, j);
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
