package com.spotify.mobile.android.storylines.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.LinkedList;

public final class StorylinesCardContent_Deserializer extends StdDeserializer<StorylinesCardContent> {
    private static final long serialVersionUID = 1;

    StorylinesCardContent_Deserializer() {
        super(StorylinesCardContent.class);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public StorylinesCardContent a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        char c;
        StorylinesCardImageModel storylinesCardImageModel;
        char c2;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        LinkedList linkedList = null;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            int i = 5;
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                switch (currentName.hashCode()) {
                    case -1185250696:
                        if (currentName.equals("images")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -815585765:
                        if (currentName.equals("targetUri")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -740574583:
                        if (currentName.equals("entityUri")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -428646061:
                        if (currentName.equals("avatarUri")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 45673625:
                        if (currentName.equals("storylineGid")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 574510245:
                        if (currentName.equals("artistUri")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 629723762:
                        if (currentName.equals("artistName")) {
                            c = 6;
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
                            LinkedList linkedList2 = new LinkedList();
                            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                    storylinesCardImageModel = null;
                                } else {
                                    String str7 = null;
                                    String str8 = null;
                                    int i2 = 0;
                                    int i3 = 0;
                                    String str9 = null;
                                    while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                        if (jsonParser.getCurrentToken().ordinal() == i) {
                                            String currentName2 = jsonParser.getCurrentName();
                                            currentName2.hashCode();
                                            switch (currentName2.hashCode()) {
                                                case -1221029593:
                                                    if (currentName2.equals("height")) {
                                                        c2 = 0;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case 116076:
                                                    if (currentName2.equals("uri")) {
                                                        c2 = 1;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case 3575610:
                                                    if (currentName2.equals("type")) {
                                                        c2 = 2;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case 113126854:
                                                    if (currentName2.equals("width")) {
                                                        c2 = 3;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case 1911932886:
                                                    if (currentName2.equals("imageId")) {
                                                        c2 = 4;
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
                                                i3 = ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
                                            } else if (c2 == 1) {
                                                jsonParser.nextValue();
                                                str7 = deserializeString(jsonParser, deserializationContext);
                                            } else if (c2 == 2) {
                                                jsonParser.nextValue();
                                                str9 = deserializeString(jsonParser, deserializationContext);
                                            } else if (c2 == 3) {
                                                jsonParser.nextValue();
                                                i2 = ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
                                            } else if (c2 != 4) {
                                                jsonParser.nextValue();
                                                jsonParser.skipChildren();
                                            } else {
                                                jsonParser.nextValue();
                                                str8 = deserializeString(jsonParser, deserializationContext);
                                            }
                                        }
                                        i = 5;
                                    }
                                    storylinesCardImageModel = StorylinesCardImageModel.create(str7, str8, i2, i3, str9);
                                }
                                linkedList2.add(storylinesCardImageModel);
                                i = 5;
                            }
                            linkedList = linkedList2;
                            break;
                        } else {
                            linkedList = null;
                            break;
                        }
                    case 1:
                        jsonParser.nextValue();
                        str6 = deserializeString(jsonParser, deserializationContext);
                        break;
                    case 2:
                        jsonParser.nextValue();
                        str5 = deserializeString(jsonParser, deserializationContext);
                        break;
                    case 3:
                        jsonParser.nextValue();
                        str4 = deserializeString(jsonParser, deserializationContext);
                        break;
                    case 4:
                        jsonParser.nextValue();
                        str = deserializeString(jsonParser, deserializationContext);
                        break;
                    case 5:
                        jsonParser.nextValue();
                        str2 = deserializeString(jsonParser, deserializationContext);
                        break;
                    case 6:
                        jsonParser.nextValue();
                        str3 = deserializeString(jsonParser, deserializationContext);
                        break;
                    default:
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
        return StorylinesCardContent.create(str, str2, str3, str4, str5, str6, linkedList);
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
