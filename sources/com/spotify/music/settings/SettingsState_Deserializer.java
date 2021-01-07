package com.spotify.music.settings;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public final class SettingsState_Deserializer extends StdDeserializer<SettingsState> {
    private static final long serialVersionUID = 1;

    SettingsState_Deserializer() {
        super(SettingsState.class);
    }

    public boolean _deserializeboolean(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
    }

    public int _deserializeint(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public SettingsState a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        char c;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i5 = 0;
        boolean z8 = false;
        int i6 = 0;
        boolean z9 = false;
        boolean z10 = false;
        int i7 = 0;
        boolean z11 = false;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                switch (currentName.hashCode()) {
                    case -1987172280:
                        if (currentName.equals("download_quality")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1822942593:
                        if (currentName.equals("offline_mode")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -766147693:
                        if (currentName.equals("seconds_to_offline_expiry")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -646302131:
                        if (currentName.equals("automix")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -500098086:
                        if (currentName.equals("private_session")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -192621201:
                        if (currentName.equals("gapless")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -116400606:
                        if (currentName.equals("local_devices_only")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -67167409:
                        if (currentName.equals("webgate_url")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -27526442:
                        if (currentName.equals("download_preferred_resource_type")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3119:
                        if (currentName.equals("ap")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 236609293:
                        if (currentName.equals("normalize")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 263664509:
                        if (currentName.equals("loudness_environment")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 430847808:
                        if (currentName.equals("stream_quality")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 565277992:
                        if (currentName.equals("download_over_3g")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 652463492:
                        if (currentName.equals("trim_silence")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 694817712:
                        if (currentName.equals("crossfade_time_seconds")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1149623543:
                        if (currentName.equals("stream_non_metered_quality")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1397903036:
                        if (currentName.equals("crossfade")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1602120665:
                        if (currentName.equals("show_unavailable_tracks")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1898574617:
                        if (currentName.equals("play_explicit_content")) {
                            c = 19;
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
                        i = _deserializeint(jsonParser, deserializationContext);
                        continue;
                    case 1:
                        jsonParser.nextValue();
                        z = _deserializeboolean(jsonParser, deserializationContext);
                        continue;
                    case 2:
                        jsonParser.nextValue();
                        i4 = _deserializeint(jsonParser, deserializationContext);
                        continue;
                    case 3:
                        jsonParser.nextValue();
                        z6 = _deserializeboolean(jsonParser, deserializationContext);
                        continue;
                    case 4:
                        jsonParser.nextValue();
                        z3 = _deserializeboolean(jsonParser, deserializationContext);
                        continue;
                    case 5:
                        jsonParser.nextValue();
                        z5 = _deserializeboolean(jsonParser, deserializationContext);
                        continue;
                    case 6:
                        jsonParser.nextValue();
                        z10 = _deserializeboolean(jsonParser, deserializationContext);
                        continue;
                    case 7:
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                            str2 = _parseString(jsonParser, deserializationContext);
                            break;
                        } else {
                            str2 = null;
                            continue;
                        }
                    case '\b':
                        jsonParser.nextValue();
                        i7 = _deserializeint(jsonParser, deserializationContext);
                        continue;
                    case '\t':
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                            str = _parseString(jsonParser, deserializationContext);
                            break;
                        } else {
                            str = null;
                            continue;
                        }
                    case '\n':
                        jsonParser.nextValue();
                        z7 = _deserializeboolean(jsonParser, deserializationContext);
                        continue;
                    case 11:
                        jsonParser.nextValue();
                        i5 = _deserializeint(jsonParser, deserializationContext);
                        continue;
                    case '\f':
                        jsonParser.nextValue();
                        i2 = _deserializeint(jsonParser, deserializationContext);
                        continue;
                    case '\r':
                        jsonParser.nextValue();
                        z4 = _deserializeboolean(jsonParser, deserializationContext);
                        continue;
                    case 14:
                        jsonParser.nextValue();
                        z11 = _deserializeboolean(jsonParser, deserializationContext);
                        continue;
                    case 15:
                        jsonParser.nextValue();
                        i6 = _deserializeint(jsonParser, deserializationContext);
                        continue;
                    case 16:
                        jsonParser.nextValue();
                        i3 = _deserializeint(jsonParser, deserializationContext);
                        continue;
                    case 17:
                        jsonParser.nextValue();
                        z8 = _deserializeboolean(jsonParser, deserializationContext);
                        continue;
                    case 18:
                        jsonParser.nextValue();
                        z9 = _deserializeboolean(jsonParser, deserializationContext);
                        continue;
                    case 19:
                        jsonParser.nextValue();
                        z2 = _deserializeboolean(jsonParser, deserializationContext);
                        continue;
                    default:
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                        continue;
                }
            }
        }
        return SettingsState.create(z, z2, z3, z4, i, i2, i3, str, i4, z5, z6, z7, i5, z8, i6, z9, z10, str2, i7, z11);
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

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }
}
