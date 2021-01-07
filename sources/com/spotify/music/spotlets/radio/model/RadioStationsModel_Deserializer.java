package com.spotify.music.spotlets.radio.model;

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

public final class RadioStationsModel_Deserializer extends StdDeserializer<RadioStationsModel> {
    private static final long serialVersionUID = 1;

    RadioStationsModel_Deserializer() {
        super(RadioStationsModel.class);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:182:0x0030 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:211:0x039c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:184:0x0030 */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: java.lang.String[] */
    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] */
    /* JADX DEBUG: Multi-variable search result rejected for r15v1, resolved type: com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] */
    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: java.lang.String[] */
    /* JADX DEBUG: Multi-variable search result rejected for r15v2, resolved type: com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: java.lang.String[] */
    /* JADX DEBUG: Multi-variable search result rejected for r15v3, resolved type: com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] */
    /* JADX DEBUG: Multi-variable search result rejected for r13v3, resolved type: java.lang.String[] */
    /* JADX DEBUG: Multi-variable search result rejected for r15v5, resolved type: com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] */
    /* JADX DEBUG: Multi-variable search result rejected for r15v24, resolved type: com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] */
    /* JADX DEBUG: Multi-variable search result rejected for r13v4, resolved type: java.lang.String[] */
    /* JADX DEBUG: Multi-variable search result rejected for r13v5, resolved type: java.lang.String[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public RadioStationModel[] a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        char c;
        PlayerTrack playerTrack;
        char c2;
        RelatedArtistModel relatedArtistModel;
        String str = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<RadioStationModel> linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                obj = str;
            } else {
                String str2 = str;
                String str3 = str2;
                String str4 = str3;
                String str5 = str4;
                String str6 = str5;
                String str7 = str6;
                String str8 = str7;
                String[] strArr = str8;
                RelatedArtistModel[] relatedArtistModelArr = strArr;
                PlayerTrack[] playerTrackArr = relatedArtistModelArr;
                String str9 = playerTrackArr;
                boolean z = false;
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    if (jsonParser.getCurrentToken().ordinal() == 5) {
                        String currentName = jsonParser.getCurrentName();
                        currentName.hashCode();
                        char c3 = 1;
                        switch (currentName.hashCode()) {
                            case -2060497896:
                                if (currentName.equals(ContextTrack.Metadata.KEY_SUBTITLE)) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -2059492806:
                                if (currentName.equals("playlistUri")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1870009356:
                                if (currentName.equals("titleUri")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -865716088:
                                if (currentName.equals("tracks")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -859610607:
                                if (currentName.equals("imageUri")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -838143496:
                                if (currentName.equals("related_artists")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -620139980:
                                if (currentName.equals("subtitleUri")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 116076:
                                if (currentName.equals("uri")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 109314082:
                                if (currentName.equals("seeds")) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 110371416:
                                if (currentName.equals("title")) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 191193553:
                                if (currentName.equals("explicitSave")) {
                                    c = '\n';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 981647243:
                                if (currentName.equals("next_page_url")) {
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
                                jsonParser.nextValue();
                                str7 = deserializeString(jsonParser, deserializationContext);
                                break;
                            case 1:
                                jsonParser.nextValue();
                                str6 = deserializeString(jsonParser, deserializationContext);
                                break;
                            case 2:
                                jsonParser.nextValue();
                                str4 = deserializeString(jsonParser, deserializationContext);
                                break;
                            case 3:
                                jsonParser.nextValue();
                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                    playerTrackArr = 0;
                                    break;
                                } else {
                                    LinkedList<PlayerTrack> linkedList2 = new LinkedList();
                                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                            playerTrack = null;
                                        } else {
                                            String str10 = null;
                                            String str11 = null;
                                            String str12 = null;
                                            String str13 = null;
                                            String str14 = null;
                                            while (true) {
                                                String str15 = str10;
                                                String str16 = str11;
                                                String str17 = str12;
                                                String str18 = str13;
                                                String str19 = str14;
                                                HashMap hashMap = null;
                                                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                                    if (jsonParser.getCurrentToken().ordinal() == 5) {
                                                        String currentName2 = jsonParser.getCurrentName();
                                                        currentName2.hashCode();
                                                        switch (currentName2.hashCode()) {
                                                            case -987494927:
                                                                if (currentName2.equals(ContextTrack.Metadata.KEY_PROVIDER)) {
                                                                    c2 = 0;
                                                                    break;
                                                                }
                                                                c2 = 65535;
                                                                break;
                                                            case -450004177:
                                                                if (currentName2.equals("metadata")) {
                                                                    c2 = 1;
                                                                    break;
                                                                }
                                                                c2 = 65535;
                                                                break;
                                                            case 115792:
                                                                if (currentName2.equals("uid")) {
                                                                    c2 = 2;
                                                                    break;
                                                                }
                                                                c2 = 65535;
                                                                break;
                                                            case 116076:
                                                                if (currentName2.equals("uri")) {
                                                                    c2 = 3;
                                                                    break;
                                                                }
                                                                c2 = 65535;
                                                                break;
                                                            case 249799580:
                                                                if (currentName2.equals("album_uri")) {
                                                                    c2 = 4;
                                                                    break;
                                                                }
                                                                c2 = 65535;
                                                                break;
                                                            case 630249588:
                                                                if (currentName2.equals("artist_uri")) {
                                                                    c2 = 5;
                                                                    break;
                                                                }
                                                                c2 = 65535;
                                                                break;
                                                            default:
                                                                c2 = 65535;
                                                                break;
                                                        }
                                                        if (c2 == 0) {
                                                            jsonParser.nextValue();
                                                            str19 = deserializeString(jsonParser, deserializationContext);
                                                        } else if (c2 == c3) {
                                                            jsonParser.nextValue();
                                                            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                                                str10 = str15;
                                                                str11 = str16;
                                                                str12 = str17;
                                                                str13 = str18;
                                                                str14 = str19;
                                                                c3 = 1;
                                                            } else {
                                                                HashMap hashMap2 = new HashMap();
                                                                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                                                    String deserializeString = deserializeString(jsonParser, deserializationContext);
                                                                    jsonParser.nextValue();
                                                                    hashMap2.put(deserializeString, deserializeString(jsonParser, deserializationContext));
                                                                }
                                                                hashMap = hashMap2;
                                                            }
                                                        } else if (c2 == 2) {
                                                            jsonParser.nextValue();
                                                            str16 = deserializeString(jsonParser, deserializationContext);
                                                        } else if (c2 == 3) {
                                                            jsonParser.nextValue();
                                                            str15 = deserializeString(jsonParser, deserializationContext);
                                                        } else if (c2 == 4) {
                                                            jsonParser.nextValue();
                                                            str17 = deserializeString(jsonParser, deserializationContext);
                                                        } else if (c2 != 5) {
                                                            jsonParser.nextValue();
                                                            jsonParser.skipChildren();
                                                        } else {
                                                            jsonParser.nextValue();
                                                            str18 = deserializeString(jsonParser, deserializationContext);
                                                        }
                                                    }
                                                    c3 = 1;
                                                }
                                                playerTrack = new PlayerTrack(str15, str16, str17, str18, str19, hashMap);
                                            }
                                        }
                                        linkedList2.add(playerTrack);
                                        c3 = 1;
                                    }
                                    playerTrackArr = new PlayerTrack[linkedList2.size()];
                                    int i = 0;
                                    for (PlayerTrack playerTrack2 : linkedList2) {
                                        playerTrackArr[i] = playerTrack2;
                                        i++;
                                    }
                                    break;
                                }
                            case 4:
                                jsonParser.nextValue();
                                str5 = deserializeString(jsonParser, deserializationContext);
                                break;
                            case 5:
                                jsonParser.nextValue();
                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                    relatedArtistModelArr = null;
                                    break;
                                } else {
                                    LinkedList<RelatedArtistModel> linkedList3 = new LinkedList();
                                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                            relatedArtistModel = null;
                                        } else {
                                            String str20 = null;
                                            String str21 = null;
                                            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                                if (jsonParser.getCurrentToken().ordinal() == 5) {
                                                    String currentName3 = jsonParser.getCurrentName();
                                                    currentName3.hashCode();
                                                    if (currentName3.equals("artistUri")) {
                                                        jsonParser.nextValue();
                                                        str21 = deserializeString(jsonParser, deserializationContext);
                                                    } else if (!currentName3.equals("artistName")) {
                                                        jsonParser.nextValue();
                                                        jsonParser.skipChildren();
                                                    } else {
                                                        jsonParser.nextValue();
                                                        str20 = deserializeString(jsonParser, deserializationContext);
                                                    }
                                                }
                                            }
                                            relatedArtistModel = RelatedArtistModel.create(str20, str21);
                                        }
                                        linkedList3.add(relatedArtistModel);
                                    }
                                    relatedArtistModelArr = new RelatedArtistModel[linkedList3.size()];
                                    int i2 = 0;
                                    for (RelatedArtistModel relatedArtistModel2 : linkedList3) {
                                        relatedArtistModelArr[i2] = relatedArtistModel2;
                                        i2++;
                                    }
                                    break;
                                }
                            case 6:
                                jsonParser.nextValue();
                                str8 = deserializeString(jsonParser, deserializationContext);
                                break;
                            case 7:
                                jsonParser.nextValue();
                                str2 = deserializeString(jsonParser, deserializationContext);
                                break;
                            case '\b':
                                jsonParser.nextValue();
                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                    strArr = 0;
                                    break;
                                } else {
                                    LinkedList<String> linkedList4 = new LinkedList();
                                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                        linkedList4.add(deserializeString(jsonParser, deserializationContext));
                                    }
                                    strArr = new String[linkedList4.size()];
                                    int i3 = 0;
                                    for (String str22 : linkedList4) {
                                        strArr[i3] = str22;
                                        i3++;
                                    }
                                    break;
                                }
                            case '\t':
                                jsonParser.nextValue();
                                str3 = deserializeString(jsonParser, deserializationContext);
                                break;
                            case '\n':
                                jsonParser.nextValue();
                                z = ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
                                break;
                            case 11:
                                jsonParser.nextValue();
                                str9 = deserializeString(jsonParser, deserializationContext);
                                break;
                            default:
                                jsonParser.nextValue();
                                jsonParser.skipChildren();
                                break;
                        }
                    }
                }
                obj = new RadioStationModel(str2, str3, str4, str5, str6, str7, str8, strArr, relatedArtistModelArr, playerTrackArr, str9, z);
            }
            linkedList.add(obj);
            str = null;
        }
        RadioStationModel[] radioStationModelArr = new RadioStationModel[linkedList.size()];
        int i4 = 0;
        for (RadioStationModel radioStationModel : linkedList) {
            radioStationModelArr[i4] = radioStationModel;
            i4++;
        }
        return radioStationModelArr;
    }

    public RadioStationsModel b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        RadioStationModel[] radioStationModelArr = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        RadioStationModel[] radioStationModelArr2 = null;
        RadioStationModel[] radioStationModelArr3 = null;
        RadioStationModel[] radioStationModelArr4 = null;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1359384797:
                        if (currentName.equals("recommended_stations")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -519221129:
                        if (currentName.equals("saved_stations")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1259163899:
                        if (currentName.equals("genre_stations")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1368883123:
                        if (currentName.equals("user_stations")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        jsonParser.nextValue();
                        radioStationModelArr2 = a(jsonParser, deserializationContext);
                        continue;
                    case 1:
                        jsonParser.nextValue();
                        radioStationModelArr4 = a(jsonParser, deserializationContext);
                        continue;
                    case 2:
                        jsonParser.nextValue();
                        radioStationModelArr3 = a(jsonParser, deserializationContext);
                        continue;
                    case 3:
                        jsonParser.nextValue();
                        radioStationModelArr = a(jsonParser, deserializationContext);
                        continue;
                    default:
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                        continue;
                }
            }
        }
        return RadioStationsModel.create(radioStationModelArr, radioStationModelArr2, radioStationModelArr3, radioStationModelArr4);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            return b(jsonParser, deserializationContext);
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
