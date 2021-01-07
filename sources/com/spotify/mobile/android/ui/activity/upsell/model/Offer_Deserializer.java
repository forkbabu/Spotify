package com.spotify.mobile.android.ui.activity.upsell.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public final class Offer_Deserializer extends StdDeserializer<Offer> {
    private static final long serialVersionUID = 1;

    Offer_Deserializer() {
        super(Offer.class);
    }

    public Offer a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Period period = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        Period period2 = null;
        String str = null;
        boolean z = false;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -44113227:
                        if (currentName.equals("ad_targeting_key")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 125597633:
                        if (currentName.equals("is_trial")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 361988451:
                        if (currentName.equals("recurring_period")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1495410460:
                        if (currentName.equals("initial_period")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        jsonParser.nextValue();
                        str = deserializeString(jsonParser, deserializationContext);
                        continue;
                    case 1:
                        jsonParser.nextValue();
                        z = ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
                        continue;
                    case 2:
                        jsonParser.nextValue();
                        period2 = b(jsonParser, deserializationContext);
                        continue;
                    case 3:
                        jsonParser.nextValue();
                        period = b(jsonParser, deserializationContext);
                        continue;
                    default:
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                        continue;
                }
            }
        }
        return Offer.create(z, period, period2, str);
    }

    public Period b(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        String str2 = null;
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -1992012396:
                        if (currentName.equals("duration")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -758757370:
                        if (currentName.equals("formatted_price")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 140662533:
                        if (currentName.equals("duration_type")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        jsonParser.nextValue();
                        i = ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
                        continue;
                    case 1:
                        jsonParser.nextValue();
                        str = deserializeString(jsonParser, deserializationContext);
                        continue;
                    case 2:
                        jsonParser.nextValue();
                        str2 = deserializeString(jsonParser, deserializationContext);
                        continue;
                    default:
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                        continue;
                }
            }
        }
        return Period.create(str, i, str2);
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
