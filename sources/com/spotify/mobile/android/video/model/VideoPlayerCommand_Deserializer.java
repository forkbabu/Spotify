package com.spotify.mobile.android.video.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.ContextTrack;
import java.util.HashMap;
import java.util.HashSet;

public final class VideoPlayerCommand_Deserializer extends StdDeserializer<VideoPlayerCommand> {
    private static final long serialVersionUID = 1;

    VideoPlayerCommand_Deserializer() {
        super(VideoPlayerCommand.class);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public TrackWithPlayOrigin a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        char c;
        char c2;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        PlayerTrack playerTrack = null;
        PlayOrigin playOrigin = null;
        String str = null;
        String str2 = null;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                switch (currentName.hashCode()) {
                    case -541598063:
                        if (currentName.equals("play_origin")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -102516004:
                        if (currentName.equals("context_uri")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 110621003:
                        if (currentName.equals(AppProtocol.TrackData.TYPE_TRACK)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1706303935:
                        if (currentName.equals(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY)) {
                            c = 3;
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
                    if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                        playOrigin = null;
                    } else {
                        String str3 = null;
                        String str4 = null;
                        String str5 = null;
                        String str6 = null;
                        String str7 = null;
                        String str8 = null;
                        HashSet hashSet = null;
                        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                            if (jsonParser.getCurrentToken().ordinal() == 5) {
                                String currentName2 = jsonParser.getCurrentName();
                                currentName2.hashCode();
                                switch (currentName2.hashCode()) {
                                    case -1358351982:
                                        if (currentName2.equals("feature_identifier")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -1238715854:
                                        if (currentName2.equals("device_identifier")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -1144002417:
                                        if (currentName2.equals("feature_version")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -641989667:
                                        if (currentName2.equals("feature_classes")) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 1006001683:
                                        if (currentName2.equals("external_referrer")) {
                                            c2 = 4;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 1163267273:
                                        if (currentName2.equals("referrer_identifier")) {
                                            c2 = 5;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 1196184786:
                                        if (currentName2.equals("view_uri")) {
                                            c2 = 6;
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
                                        str3 = deserializeString(jsonParser, deserializationContext);
                                        break;
                                    case 1:
                                        jsonParser.nextValue();
                                        str8 = deserializeString(jsonParser, deserializationContext);
                                        break;
                                    case 2:
                                        jsonParser.nextValue();
                                        str4 = deserializeString(jsonParser, deserializationContext);
                                        break;
                                    case 3:
                                        jsonParser.nextValue();
                                        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                                            HashSet hashSet2 = new HashSet();
                                            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                                hashSet2.add(deserializeString(jsonParser, deserializationContext));
                                            }
                                            hashSet = hashSet2;
                                            break;
                                        } else {
                                            hashSet = null;
                                            break;
                                        }
                                    case 4:
                                        jsonParser.nextValue();
                                        str6 = deserializeString(jsonParser, deserializationContext);
                                        break;
                                    case 5:
                                        jsonParser.nextValue();
                                        str7 = deserializeString(jsonParser, deserializationContext);
                                        break;
                                    case 6:
                                        jsonParser.nextValue();
                                        str5 = deserializeString(jsonParser, deserializationContext);
                                        break;
                                    default:
                                        jsonParser.nextValue();
                                        jsonParser.skipChildren();
                                        break;
                                }
                            }
                        }
                        playOrigin = new PlayOrigin(str3, str4, str5, str6, str7, str8, hashSet);
                    }
                } else if (c == 1) {
                    jsonParser.nextValue();
                    str2 = deserializeString(jsonParser, deserializationContext);
                } else if (c == 2) {
                    jsonParser.nextValue();
                    playerTrack = deserializePlayerTrack(jsonParser, deserializationContext);
                } else if (c != 3) {
                    jsonParser.nextValue();
                    jsonParser.skipChildren();
                } else {
                    jsonParser.nextValue();
                    str = deserializeString(jsonParser, deserializationContext);
                }
            }
        }
        return new TrackWithPlayOrigin(playerTrack, playOrigin, str, str2);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.video.model.VideoPlayerCommand b(com.fasterxml.jackson.core.JsonParser r27, com.fasterxml.jackson.databind.DeserializationContext r28) {
        /*
        // Method dump skipped, instructions count: 854
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.model.VideoPlayerCommand_Deserializer.b(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext):com.spotify.mobile.android.video.model.VideoPlayerCommand");
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

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public PlayerTrack deserializePlayerTrack(JsonParser jsonParser, DeserializationContext deserializationContext) {
        char c;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
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
        return new PlayerTrack(str, str2, str3, str4, str5, hashMap);
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
