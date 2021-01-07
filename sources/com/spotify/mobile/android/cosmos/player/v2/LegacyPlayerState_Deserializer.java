package com.spotify.mobile.android.cosmos.player.v2;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class LegacyPlayerState_Deserializer extends StdDeserializer<LegacyPlayerState> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState_Deserializer$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken;

        static {
            JsonToken.values();
            int[] iArr = new int[13];
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = iArr;
            try {
                JsonToken jsonToken = JsonToken.FIELD_NAME;
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    LegacyPlayerState_Deserializer() {
        super(LegacyPlayerState.class);
    }

    public boolean _deserializeboolean(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    public float _deserializefloat(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Float) NumberDeserializers.find(Float.TYPE, "float").deserialize(jsonParser, deserializationContext)).floatValue();
    }

    public int _deserializeint(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    public long _deserializelong(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Long) NumberDeserializers.find(Long.TYPE, Constants.LONG).deserialize(jsonParser, deserializationContext)).longValue();
    }

    public PlayOptions.AudioStream deserializeAudioStreamEnum(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING) {
            return PlayOptions.AudioStream.fromString(jsonParser.getText());
        }
        deserializationContext.handleUnexpectedToken(PlayOptions.AudioStream.class, jsonParser);
        throw null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0100, code lost:
        if (r0.equals("context_metadata") == false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState deserializeLegacyPlayerState(com.fasterxml.jackson.core.JsonParser r29, com.fasterxml.jackson.databind.DeserializationContext r30) {
        /*
        // Method dump skipped, instructions count: 654
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState_Deserializer.deserializeLegacyPlayerState(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState");
    }

    public Map<String, String> deserializeMapStringString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String deserializeString = deserializeString(jsonParser, deserializationContext);
            jsonParser.nextValue();
            hashMap.put(deserializeString, deserializeString(jsonParser, deserializationContext));
        }
        return hashMap;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r0.equals("referrer_identifier") == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.cosmos.player.v2.PlayOrigin deserializePlayOrigin(com.fasterxml.jackson.core.JsonParser r12, com.fasterxml.jackson.databind.DeserializationContext r13) {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState_Deserializer.deserializePlayOrigin(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayOrigin");
    }

    public PlayerContextIndex deserializePlayerContextIndex(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                if (currentName.equals("page")) {
                    jsonParser.nextValue();
                    i = _deserializeint(jsonParser, deserializationContext);
                } else if (!currentName.equals(AppProtocol.TrackData.TYPE_TRACK)) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    i2 = _deserializeint(jsonParser, deserializationContext);
                }
            }
        }
        return new PlayerContextIndex(i, i2);
    }

    public PlayerOptions deserializePlayerOptions(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1459599913:
                        if (currentName.equals("repeating_context")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1400336410:
                        if (currentName.equals("shuffling_context")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 45542259:
                        if (currentName.equals("repeating_track")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        jsonParser.nextValue();
                        z2 = _deserializeboolean(jsonParser, deserializationContext);
                        continue;
                    case 1:
                        jsonParser.nextValue();
                        z = _deserializeboolean(jsonParser, deserializationContext);
                        continue;
                    case 2:
                        jsonParser.nextValue();
                        z3 = _deserializeboolean(jsonParser, deserializationContext);
                        continue;
                    default:
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                        continue;
                }
            }
        }
        return PlayerOptions.create(z, z2, z3);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0108, code lost:
        if (r0.equals("disallow_peeking_next_reasons") == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions deserializePlayerRestrictions(com.fasterxml.jackson.core.JsonParser r25, com.fasterxml.jackson.databind.DeserializationContext r26) {
        /*
        // Method dump skipped, instructions count: 680
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState_Deserializer.deserializePlayerRestrictions(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions");
    }

    public PlayerSuppressions deserializePlayerSuppressions(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Set<String> set = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                if (!currentName.equals("providers")) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    set = deserializeSetString(jsonParser, deserializationContext);
                }
            }
        }
        return new PlayerSuppressions(set);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r0.equals("artist_uri") == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.cosmos.player.v2.PlayerTrack deserializePlayerTrack(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12) {
        /*
            r10 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r11.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r2 = 0
            if (r0 != r1) goto L_0x000a
            return r2
        L_0x000a:
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0010:
            com.fasterxml.jackson.core.JsonToken r0 = r11.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 == r1) goto L_0x00b8
            com.fasterxml.jackson.core.JsonToken r0 = r11.getCurrentToken()
            int r0 = r0.ordinal()
            r1 = 5
            if (r0 == r1) goto L_0x0024
            goto L_0x0010
        L_0x0024:
            java.lang.String r0 = r11.getCurrentName()
            r0.hashCode()
            r2 = -1
            int r3 = r0.hashCode()
            switch(r3) {
                case -987494927: goto L_0x006a;
                case -450004177: goto L_0x005f;
                case 115792: goto L_0x0054;
                case 116076: goto L_0x0049;
                case 249799580: goto L_0x003e;
                case 630249588: goto L_0x0035;
                default: goto L_0x0033;
            }
        L_0x0033:
            r1 = -1
            goto L_0x0074
        L_0x0035:
            java.lang.String r3 = "artist_uri"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0074
            goto L_0x0033
        L_0x003e:
            java.lang.String r1 = "album_uri"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0047
            goto L_0x0033
        L_0x0047:
            r1 = 4
            goto L_0x0074
        L_0x0049:
            java.lang.String r1 = "uri"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0052
            goto L_0x0033
        L_0x0052:
            r1 = 3
            goto L_0x0074
        L_0x0054:
            java.lang.String r1 = "uid"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005d
            goto L_0x0033
        L_0x005d:
            r1 = 2
            goto L_0x0074
        L_0x005f:
            java.lang.String r1 = "metadata"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0068
            goto L_0x0033
        L_0x0068:
            r1 = 1
            goto L_0x0074
        L_0x006a:
            java.lang.String r1 = "provider"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0073
            goto L_0x0033
        L_0x0073:
            r1 = 0
        L_0x0074:
            switch(r1) {
                case 0: goto L_0x00ae;
                case 1: goto L_0x00a4;
                case 2: goto L_0x009a;
                case 3: goto L_0x0090;
                case 4: goto L_0x0087;
                case 5: goto L_0x007e;
                default: goto L_0x0077;
            }
        L_0x0077:
            r11.nextValue()
            r11.skipChildren()
            goto L_0x0010
        L_0x007e:
            r11.nextValue()
            java.lang.String r0 = r10.deserializeString(r11, r12)
            r7 = r0
            goto L_0x0010
        L_0x0087:
            r11.nextValue()
            java.lang.String r0 = r10.deserializeString(r11, r12)
            r6 = r0
            goto L_0x0010
        L_0x0090:
            r11.nextValue()
            java.lang.String r0 = r10.deserializeString(r11, r12)
            r4 = r0
            goto L_0x0010
        L_0x009a:
            r11.nextValue()
            java.lang.String r0 = r10.deserializeString(r11, r12)
            r5 = r0
            goto L_0x0010
        L_0x00a4:
            r11.nextValue()
            java.util.Map r0 = r10.deserializeMapStringString(r11, r12)
            r9 = r0
            goto L_0x0010
        L_0x00ae:
            r11.nextValue()
            java.lang.String r0 = r10.deserializeString(r11, r12)
            r8 = r0
            goto L_0x0010
        L_0x00b8:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack r11 = new com.spotify.mobile.android.cosmos.player.v2.PlayerTrack
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
            switch-data {-987494927->0x006a, -450004177->0x005f, 115792->0x0054, 116076->0x0049, 249799580->0x003e, 630249588->0x0035, }
            switch-data {0->0x00ae, 1->0x00a4, 2->0x009a, 3->0x0090, 4->0x0087, 5->0x007e, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState_Deserializer.deserializePlayerTrack(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.cosmos.player.v2.PlayerTrack");
    }

    public PlayerTrack[] deserializePlayerTrackArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList<PlayerTrack> linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(deserializePlayerTrack(jsonParser, deserializationContext));
        }
        int i = 0;
        PlayerTrack[] playerTrackArr = new PlayerTrack[linkedList.size()];
        for (PlayerTrack playerTrack : linkedList) {
            playerTrackArr[i] = playerTrack;
            i++;
        }
        return playerTrackArr;
    }

    public Set<String> deserializeSetString(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        HashSet hashSet = new HashSet();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            hashSet.add(deserializeString(jsonParser, deserializationContext));
        }
        return hashSet;
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

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LegacyPlayerState deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            return deserializeLegacyPlayerState(jsonParser, deserializationContext);
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
    }
}
