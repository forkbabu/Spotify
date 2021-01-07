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

public final class RadioStationModel_Deserializer extends StdDeserializer<RadioStationModel> {
    private static final long serialVersionUID = 1;

    RadioStationModel_Deserializer() {
        super(RadioStationModel.class);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public RadioStationModel a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        char c;
        PlayerTrack playerTrack;
        char c2;
        RelatedArtistModel relatedArtistModel;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String[] strArr = null;
        RelatedArtistModel[] relatedArtistModelArr = null;
        PlayerTrack[] playerTrackArr = null;
        String str8 = null;
        boolean z = false;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
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
                        str6 = deserializeString(jsonParser, deserializationContext);
                        break;
                    case 1:
                        jsonParser.nextValue();
                        str5 = deserializeString(jsonParser, deserializationContext);
                        break;
                    case 2:
                        jsonParser.nextValue();
                        str3 = deserializeString(jsonParser, deserializationContext);
                        break;
                    case 3:
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            playerTrackArr = null;
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
                                        HashMap hashMap = null;
                                        while (true) {
                                            if (jsonParser.nextToken() == JsonToken.END_OBJECT) {
                                                playerTrack = new PlayerTrack(str9, str10, str11, str12, str13, hashMap);
                                            } else if (jsonParser.getCurrentToken().ordinal() == 5) {
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
                                                    str13 = deserializeString(jsonParser, deserializationContext);
                                                } else if (c2 == 1) {
                                                    jsonParser.nextValue();
                                                    if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
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
                                                    str10 = deserializeString(jsonParser, deserializationContext);
                                                } else if (c2 == 3) {
                                                    jsonParser.nextValue();
                                                    str9 = deserializeString(jsonParser, deserializationContext);
                                                } else if (c2 == 4) {
                                                    jsonParser.nextValue();
                                                    str11 = deserializeString(jsonParser, deserializationContext);
                                                } else if (c2 != 5) {
                                                    jsonParser.nextValue();
                                                    jsonParser.skipChildren();
                                                } else {
                                                    jsonParser.nextValue();
                                                    str12 = deserializeString(jsonParser, deserializationContext);
                                                }
                                            }
                                        }
                                    }
                                }
                                linkedList.add(playerTrack);
                            }
                            PlayerTrack[] playerTrackArr2 = new PlayerTrack[linkedList.size()];
                            int i = 0;
                            for (PlayerTrack playerTrack2 : linkedList) {
                                playerTrackArr2[i] = playerTrack2;
                                i++;
                            }
                            playerTrackArr = playerTrackArr2;
                            break;
                        }
                    case 4:
                        jsonParser.nextValue();
                        str4 = deserializeString(jsonParser, deserializationContext);
                        break;
                    case 5:
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            relatedArtistModelArr = null;
                            break;
                        } else {
                            LinkedList<RelatedArtistModel> linkedList2 = new LinkedList();
                            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                    relatedArtistModel = null;
                                } else {
                                    String str14 = null;
                                    String str15 = null;
                                    while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                        if (jsonParser.getCurrentToken().ordinal() == 5) {
                                            String currentName3 = jsonParser.getCurrentName();
                                            currentName3.hashCode();
                                            if (currentName3.equals("artistUri")) {
                                                jsonParser.nextValue();
                                                str15 = deserializeString(jsonParser, deserializationContext);
                                            } else if (!currentName3.equals("artistName")) {
                                                jsonParser.nextValue();
                                                jsonParser.skipChildren();
                                            } else {
                                                jsonParser.nextValue();
                                                str14 = deserializeString(jsonParser, deserializationContext);
                                            }
                                        }
                                    }
                                    relatedArtistModel = RelatedArtistModel.create(str14, str15);
                                }
                                linkedList2.add(relatedArtistModel);
                            }
                            RelatedArtistModel[] relatedArtistModelArr2 = new RelatedArtistModel[linkedList2.size()];
                            int i2 = 0;
                            for (RelatedArtistModel relatedArtistModel2 : linkedList2) {
                                relatedArtistModelArr2[i2] = relatedArtistModel2;
                                i2++;
                            }
                            relatedArtistModelArr = relatedArtistModelArr2;
                            break;
                        }
                    case 6:
                        jsonParser.nextValue();
                        str7 = deserializeString(jsonParser, deserializationContext);
                        break;
                    case 7:
                        jsonParser.nextValue();
                        str = deserializeString(jsonParser, deserializationContext);
                        break;
                    case '\b':
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            strArr = null;
                            break;
                        } else {
                            LinkedList<String> linkedList3 = new LinkedList();
                            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                linkedList3.add(deserializeString(jsonParser, deserializationContext));
                            }
                            String[] strArr2 = new String[linkedList3.size()];
                            int i3 = 0;
                            for (String str16 : linkedList3) {
                                strArr2[i3] = str16;
                                i3++;
                            }
                            strArr = strArr2;
                            break;
                        }
                    case '\t':
                        jsonParser.nextValue();
                        str2 = deserializeString(jsonParser, deserializationContext);
                        break;
                    case '\n':
                        jsonParser.nextValue();
                        z = ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
                        break;
                    case 11:
                        jsonParser.nextValue();
                        str8 = deserializeString(jsonParser, deserializationContext);
                        break;
                    default:
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
        return new RadioStationModel(str, str2, str3, str4, str5, str6, str7, strArr, relatedArtistModelArr, playerTrackArr, str8, z);
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
