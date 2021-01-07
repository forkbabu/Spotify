package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.player.model.ContextTrack;
import java.util.HashMap;
import java.util.LinkedList;

public final class TracksAndRadioStationModel_Deserializer extends StdDeserializer<TracksAndRadioStationModel> {
    private static final long serialVersionUID = 1;

    TracksAndRadioStationModel_Deserializer() {
        super(TracksAndRadioStationModel.class);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:129:0x000d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:133:0x009a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:138:0x0193 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:131:0x000d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:135:0x009a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.spotify.music.spotlets.radio.model.RadioStationModel] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel a(com.fasterxml.jackson.core.JsonParser r28, com.fasterxml.jackson.databind.DeserializationContext r29) {
        /*
        // Method dump skipped, instructions count: 818
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel_Deserializer.a(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel");
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

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public PlayerTrack[] deserializePlayerTrackArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        PlayerTrack playerTrack;
        char c;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<PlayerTrack> linkedList = new LinkedList();
        while (true) {
            int i = 0;
            if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                    playerTrack = null;
                } else {
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    String str5 = null;
                    HashMap hashMap = null;
                    while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                        if (jsonParser.getCurrentToken().ordinal() == 5) {
                            String currentName = jsonParser.getCurrentName();
                            currentName.hashCode();
                            switch (currentName.hashCode()) {
                                case -987494927:
                                    if (currentName.equals(ContextTrack.Metadata.KEY_PROVIDER)) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -450004177:
                                    if (currentName.equals("metadata")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 115792:
                                    if (currentName.equals("uid")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 116076:
                                    if (currentName.equals("uri")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 249799580:
                                    if (currentName.equals("album_uri")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 630249588:
                                    if (currentName.equals("artist_uri")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                jsonParser.nextValue();
                                str5 = deserializeString(jsonParser, deserializationContext);
                            } else if (c == 1) {
                                jsonParser.nextValue();
                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                    hashMap = null;
                                } else {
                                    hashMap = new HashMap();
                                    while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                        String deserializeString = deserializeString(jsonParser, deserializationContext);
                                        jsonParser.nextValue();
                                        hashMap.put(deserializeString, deserializeString(jsonParser, deserializationContext));
                                    }
                                }
                            } else if (c == 2) {
                                jsonParser.nextValue();
                                str2 = deserializeString(jsonParser, deserializationContext);
                            } else if (c == 3) {
                                jsonParser.nextValue();
                                str = deserializeString(jsonParser, deserializationContext);
                            } else if (c == 4) {
                                jsonParser.nextValue();
                                str3 = deserializeString(jsonParser, deserializationContext);
                            } else if (c != 5) {
                                jsonParser.nextValue();
                                jsonParser.skipChildren();
                            } else {
                                jsonParser.nextValue();
                                str4 = deserializeString(jsonParser, deserializationContext);
                            }
                        }
                    }
                    playerTrack = new PlayerTrack(str, str2, str3, str4, str5, hashMap);
                }
                linkedList.add(playerTrack);
            } else {
                PlayerTrack[] playerTrackArr = new PlayerTrack[linkedList.size()];
                for (PlayerTrack playerTrack2 : linkedList) {
                    playerTrackArr[i] = playerTrack2;
                    i++;
                }
                return playerTrackArr;
            }
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
