package com.spotify.music.follow.resolver;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.spotify.music.follow.resolver.RxFollowersCountResolver;
import java.util.LinkedList;

public final class RxFollowersCountResolver_Counts_Deserializer extends StdDeserializer<RxFollowersCountResolver.Counts> {
    private static final long serialVersionUID = 1;

    RxFollowersCountResolver_Counts_Deserializer() {
        super(RxFollowersCountResolver.Counts.class);
    }

    public RxFollowersCountResolver.Counts a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int i;
        RxFollowersCountResolver.Count count;
        JsonToken currentToken = jsonParser.getCurrentToken();
        JsonToken jsonToken = JsonToken.VALUE_NULL;
        RxFollowersCountResolver.Count[] countArr = null;
        if (currentToken == jsonToken) {
            return null;
        }
        if (jsonParser.getCurrentToken() != jsonToken) {
            LinkedList<RxFollowersCountResolver.Count> linkedList = new LinkedList();
            while (true) {
                i = 0;
                if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                    break;
                }
                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                    count = null;
                } else {
                    int i2 = 0;
                    while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                        if (jsonParser.getCurrentToken().ordinal() == 5) {
                            String currentName = jsonParser.getCurrentName();
                            currentName.hashCode();
                            if (currentName.equals("followers_count")) {
                                jsonParser.nextValue();
                                i = ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
                            } else if (!currentName.equals("following_count")) {
                                jsonParser.nextValue();
                                jsonParser.skipChildren();
                            } else {
                                jsonParser.nextValue();
                                i2 = ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
                            }
                        }
                    }
                    count = new RxFollowersCountResolver.Count(i, i2);
                }
                linkedList.add(count);
            }
            countArr = new RxFollowersCountResolver.Count[linkedList.size()];
            for (RxFollowersCountResolver.Count count2 : linkedList) {
                countArr[i] = count2;
                i++;
            }
        }
        return new RxFollowersCountResolver.Counts(countArr);
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
