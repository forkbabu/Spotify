package com.spotify.player.model;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlaybackQuality;
import com.spotify.player.model.PlayerOptions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PlayerState_Deserializer extends StdDeserializer<PlayerState> {
    private static final long serialVersionUID = 1;

    /* renamed from: com.spotify.player.model.PlayerState_Deserializer$1  reason: invalid class name */
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

    PlayerState_Deserializer() {
        super(PlayerState.class);
    }

    public Double _deserializeDouble(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return (Double) NumberDeserializers.find(Double.class, "java.lang.Double").deserialize(jsonParser, deserializationContext);
    }

    public Long _deserializeLong(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return (Long) NumberDeserializers.find(Long.class, "java.lang.Long").deserialize(jsonParser, deserializationContext);
    }

    public boolean _deserializeboolean(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    public long _deserializelong(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Long) NumberDeserializers.find(Long.TYPE, Constants.LONG).deserialize(jsonParser, deserializationContext)).longValue();
    }

    public AudioStream deserializeAudioStreamEnum(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING) {
            String text = jsonParser.getText();
            text.hashCode();
            if (text.equals("alarm")) {
                return AudioStream.ALARM;
            }
            if (!text.equals("default")) {
                return AudioStream.valueOf(text);
            }
            return AudioStream.DEFAULT;
        }
        deserializationContext.handleUnexpectedToken(AudioStream.class, jsonParser);
        throw null;
    }

    public BitrateLevel deserializeBitrateLevelEnum(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING) {
            String text = jsonParser.getText();
            text.hashCode();
            char c = 65535;
            switch (text.hashCode()) {
                case -1979547688:
                    if (text.equals("veryhigh")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1255046409:
                    if (text.equals("normalized")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1039745817:
                    if (text.equals("normal")) {
                        c = 2;
                        break;
                    }
                    break;
                case -284840886:
                    if (text.equals("unknown")) {
                        c = 3;
                        break;
                    }
                    break;
                case 107348:
                    if (text.equals(Constants.LOW)) {
                        c = 4;
                        break;
                    }
                    break;
                case 3202466:
                    if (text.equals(Constants.HIGH)) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return BitrateLevel.VERYHIGH;
                case 1:
                    return BitrateLevel.NORMALIZED;
                case 2:
                    return BitrateLevel.NORMAL;
                case 3:
                    return BitrateLevel.UNKNOWN;
                case 4:
                    return BitrateLevel.LOW;
                case 5:
                    return BitrateLevel.HIGH;
                default:
                    return BitrateLevel.valueOf(text);
            }
        } else {
            deserializationContext.handleUnexpectedToken(BitrateLevel.class, jsonParser);
            throw null;
        }
    }

    public ContextIndex deserializeContextIndex(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        long j = 0;
        long j2 = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                if (currentName.equals("page")) {
                    jsonParser.nextValue();
                    j = _deserializelong(jsonParser, deserializationContext);
                } else if (!currentName.equals(AppProtocol.TrackData.TYPE_TRACK)) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    j2 = _deserializelong(jsonParser, deserializationContext);
                }
            }
        }
        return ContextIndex.create(j, j2);
    }

    public ContextTrack deserializeContextTrack(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        ContextTrack.Builder builder = ContextTrack.Builder.builder();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -987494927:
                        if (currentName.equals(ContextTrack.Metadata.KEY_PROVIDER)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -450004177:
                        if (currentName.equals("metadata")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 115792:
                        if (currentName.equals("uid")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 116076:
                        if (currentName.equals("uri")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        jsonParser.nextValue();
                        builder.provider(deserializeString(jsonParser, deserializationContext));
                        continue;
                    case 1:
                        jsonParser.nextValue();
                        builder.metadata(deserializeMapStringString(jsonParser, deserializationContext));
                        continue;
                    case 2:
                        jsonParser.nextValue();
                        builder.uid(deserializeString(jsonParser, deserializationContext));
                        continue;
                    case 3:
                        jsonParser.nextValue();
                        builder.uri(deserializeString(jsonParser, deserializationContext));
                        continue;
                    default:
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                        continue;
                }
            }
        }
        return builder.build();
    }

    public List<ContextTrack> deserializeListContextTrack(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            linkedList.add(deserializeContextTrack(jsonParser, deserializationContext));
        }
        return linkedList;
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
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r1.equals("referrer_identifier") == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.player.model.PlayOrigin deserializePlayOrigin(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.DeserializationContext r7) {
        /*
            r5 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r6.getCurrentToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r1) goto L_0x000a
            r6 = 0
            return r6
        L_0x000a:
            com.spotify.player.model.PlayOrigin$Builder r0 = com.spotify.player.model.PlayOrigin.Builder.builder()
        L_0x000e:
            com.fasterxml.jackson.core.JsonToken r1 = r6.nextToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r1 == r2) goto L_0x00db
            com.fasterxml.jackson.core.JsonToken r1 = r6.getCurrentToken()
            int r1 = r1.ordinal()
            r2 = 5
            if (r1 == r2) goto L_0x0022
            goto L_0x000e
        L_0x0022:
            java.lang.String r1 = r6.getCurrentName()
            r1.hashCode()
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -1358351982: goto L_0x0073;
                case -1238715854: goto L_0x0068;
                case -1144002417: goto L_0x005d;
                case -641989667: goto L_0x0052;
                case 1006001683: goto L_0x0047;
                case 1163267273: goto L_0x003e;
                case 1196184786: goto L_0x0033;
                default: goto L_0x0031;
            }
        L_0x0031:
            r2 = -1
            goto L_0x007d
        L_0x0033:
            java.lang.String r2 = "view_uri"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x003c
            goto L_0x0031
        L_0x003c:
            r2 = 6
            goto L_0x007d
        L_0x003e:
            java.lang.String r4 = "referrer_identifier"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x007d
            goto L_0x0031
        L_0x0047:
            java.lang.String r2 = "external_referrer"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0050
            goto L_0x0031
        L_0x0050:
            r2 = 4
            goto L_0x007d
        L_0x0052:
            java.lang.String r2 = "feature_classes"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x005b
            goto L_0x0031
        L_0x005b:
            r2 = 3
            goto L_0x007d
        L_0x005d:
            java.lang.String r2 = "feature_version"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0066
            goto L_0x0031
        L_0x0066:
            r2 = 2
            goto L_0x007d
        L_0x0068:
            java.lang.String r2 = "device_identifier"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0071
            goto L_0x0031
        L_0x0071:
            r2 = 1
            goto L_0x007d
        L_0x0073:
            java.lang.String r2 = "feature_identifier"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x007c
            goto L_0x0031
        L_0x007c:
            r2 = 0
        L_0x007d:
            switch(r2) {
                case 0: goto L_0x00cf;
                case 1: goto L_0x00c3;
                case 2: goto L_0x00b7;
                case 3: goto L_0x00ab;
                case 4: goto L_0x009f;
                case 5: goto L_0x0093;
                case 6: goto L_0x0087;
                default: goto L_0x0080;
            }
        L_0x0080:
            r6.nextValue()
            r6.skipChildren()
            goto L_0x000e
        L_0x0087:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.viewUri(r1)
            goto L_0x000e
        L_0x0093:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.referrerIdentifier(r1)
            goto L_0x000e
        L_0x009f:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.externalReferrer(r1)
            goto L_0x000e
        L_0x00ab:
            r6.nextValue()
            java.util.Set r1 = r5.deserializeSetString(r6, r7)
            r0.featureClasses(r1)
            goto L_0x000e
        L_0x00b7:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.featureVersion(r1)
            goto L_0x000e
        L_0x00c3:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.deviceIdentifier(r1)
            goto L_0x000e
        L_0x00cf:
            r6.nextValue()
            java.lang.String r1 = r5.deserializeString(r6, r7)
            r0.featureIdentifier(r1)
            goto L_0x000e
        L_0x00db:
            com.spotify.player.model.PlayOrigin r6 = r0.build()
            return r6
            switch-data {-1358351982->0x0073, -1238715854->0x0068, -1144002417->0x005d, -641989667->0x0052, 1006001683->0x0047, 1163267273->0x003e, 1196184786->0x0033, }
            switch-data {0->0x00cf, 1->0x00c3, 2->0x00b7, 3->0x00ab, 4->0x009f, 5->0x0093, 6->0x0087, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.model.PlayerState_Deserializer.deserializePlayOrigin(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.player.model.PlayOrigin");
    }

    public PlaybackQuality deserializePlaybackQuality(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        PlaybackQuality.Builder builder = PlaybackQuality.Builder.builder();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                if (!currentName.equals("bitrate_level")) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    builder.bitrateLevel(deserializeBitrateLevelEnum(jsonParser, deserializationContext));
                }
            }
        }
        return builder.build();
    }

    public PlayerOptions deserializePlayerOptions(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        PlayerOptions.Builder builder = PlayerOptions.Builder.builder();
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
                        builder.repeatingContext(_deserializeboolean(jsonParser, deserializationContext));
                        continue;
                    case 1:
                        jsonParser.nextValue();
                        builder.shufflingContext(_deserializeboolean(jsonParser, deserializationContext));
                        continue;
                    case 2:
                        jsonParser.nextValue();
                        builder.repeatingTrack(_deserializeboolean(jsonParser, deserializationContext));
                        continue;
                    default:
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                        continue;
                }
            }
        }
        return builder.build();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0144, code lost:
        if (r1.equals("restrictions") == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.player.model.PlayerState deserializePlayerState(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.DeserializationContext r7) {
        /*
        // Method dump skipped, instructions count: 878
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.model.PlayerState_Deserializer.deserializePlayerState(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.player.model.PlayerState");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fe, code lost:
        if (r1.equals("disallow_peeking_next_reasons") == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.player.model.Restrictions deserializeRestrictions(com.fasterxml.jackson.core.JsonParser r6, com.fasterxml.jackson.databind.DeserializationContext r7) {
        /*
        // Method dump skipped, instructions count: 718
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.model.PlayerState_Deserializer.deserializeRestrictions(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.player.model.Restrictions");
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

    public Suppressions deserializeSuppressions(JsonParser jsonParser, DeserializationContext deserializationContext) {
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
        return Suppressions.create(set);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public PlayerState deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            return deserializePlayerState(jsonParser, deserializationContext);
        } catch (RuntimeException e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            throw JsonMappingException.from(deserializationContext, e.getMessage(), e);
        }
    }
}
