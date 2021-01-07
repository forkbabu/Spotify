package com.spotify.music.behindthelyrics.model.business;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.LinkedList;

public final class TrackAnnotationSet_Deserializer extends StdDeserializer<TrackAnnotationSet> {
    private static final long serialVersionUID = 1;

    TrackAnnotationSet_Deserializer() {
        super(TrackAnnotationSet.class);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:118:0x0013 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:125:0x00bb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:120:0x0013 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:127:0x00bb */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.spotify.music.behindthelyrics.model.business.TrackAnnotationAuthor] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public TrackAnnotationSet a(JsonParser jsonParser, DeserializationContext deserializationContext) {
        char c;
        String str;
        LinkedList linkedList;
        String str2;
        Object obj;
        char c2;
        TrackAnnotationAuthor trackAnnotationAuthor;
        char c3;
        String str3 = null;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        String str4 = null;
        String str5 = null;
        String str6 = null;
        LinkedList linkedList2 = null;
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            int i2 = 5;
            if (jsonParser.getCurrentToken().ordinal() == 5) {
                String currentName = jsonParser.getCurrentName();
                currentName.hashCode();
                char c4 = 1;
                switch (currentName.hashCode()) {
                    case -1409097913:
                        if (currentName.equals("artist")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1375522883:
                        if (currentName.equals("genius_song_id")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -961709276:
                        if (currentName.equals("annotations")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 110371416:
                        if (currentName.equals("title")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 918088224:
                        if (currentName.equals("spotify_uuid")) {
                            c = 4;
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
                        str5 = deserializeString(jsonParser, deserializationContext);
                        linkedList2 = linkedList2;
                        break;
                    case 1:
                        str = str4;
                        jsonParser.nextValue();
                        i = ((Integer) NumberDeserializers.find(Integer.TYPE, "int").deserialize(jsonParser, deserializationContext)).intValue();
                        linkedList = linkedList2;
                        str4 = str;
                        linkedList2 = linkedList;
                        break;
                    case 2:
                        jsonParser.nextValue();
                        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                            str = str4;
                            linkedList = str3;
                        } else {
                            LinkedList linkedList3 = new LinkedList();
                            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                    str2 = str4;
                                    obj = str3;
                                } else {
                                    str2 = str4;
                                    String str7 = str3;
                                    TrackAnnotationAuthor trackAnnotationAuthor2 = str7;
                                    double d = 0.0d;
                                    while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                        if (jsonParser.getCurrentToken().ordinal() == i2) {
                                            String currentName2 = jsonParser.getCurrentName();
                                            currentName2.hashCode();
                                            switch (currentName2.hashCode()) {
                                                case -1406328437:
                                                    if (currentName2.equals("author")) {
                                                        c2 = 0;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case -567321830:
                                                    if (currentName2.equals("contents")) {
                                                        c2 = 1;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case -389131437:
                                                    if (currentName2.equals("contentType")) {
                                                        c2 = 2;
                                                        break;
                                                    }
                                                    c2 = 65535;
                                                    break;
                                                case 55126294:
                                                    if (currentName2.equals("timestamp")) {
                                                        c2 = 3;
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
                                                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                                                    trackAnnotationAuthor = null;
                                                } else {
                                                    boolean z = false;
                                                    String str8 = null;
                                                    String str9 = null;
                                                    String str10 = null;
                                                    while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                                                        if (jsonParser.getCurrentToken().ordinal() == 5) {
                                                            String currentName3 = jsonParser.getCurrentName();
                                                            currentName3.hashCode();
                                                            switch (currentName3.hashCode()) {
                                                                case -1994383672:
                                                                    if (currentName3.equals("verified")) {
                                                                        c3 = 0;
                                                                        break;
                                                                    }
                                                                    c3 = 65535;
                                                                    break;
                                                                case -922801803:
                                                                    if (currentName3.equals("spotifyId")) {
                                                                        c3 = 1;
                                                                        break;
                                                                    }
                                                                    c3 = 65535;
                                                                    break;
                                                                case -428647082:
                                                                    if (currentName3.equals("avatarURL")) {
                                                                        c3 = 2;
                                                                        break;
                                                                    }
                                                                    c3 = 65535;
                                                                    break;
                                                                case 1714148973:
                                                                    if (currentName3.equals("displayName")) {
                                                                        c3 = 3;
                                                                        break;
                                                                    }
                                                                    c3 = 65535;
                                                                    break;
                                                                default:
                                                                    c3 = 65535;
                                                                    break;
                                                            }
                                                            if (c3 == 0) {
                                                                jsonParser.nextValue();
                                                                z = ((Boolean) NumberDeserializers.find(Boolean.TYPE, "boolean").deserialize(jsonParser, deserializationContext)).booleanValue();
                                                            } else if (c3 == 1) {
                                                                jsonParser.nextValue();
                                                                str8 = deserializeString(jsonParser, deserializationContext);
                                                            } else if (c3 == 2) {
                                                                jsonParser.nextValue();
                                                                str10 = deserializeString(jsonParser, deserializationContext);
                                                            } else if (c3 != 3) {
                                                                jsonParser.nextValue();
                                                                jsonParser.skipChildren();
                                                            } else {
                                                                jsonParser.nextValue();
                                                                str9 = deserializeString(jsonParser, deserializationContext);
                                                            }
                                                        }
                                                    }
                                                    trackAnnotationAuthor2 = TrackAnnotationAuthor.create(z, str8, str9, str10);
                                                    i2 = 5;
                                                    c4 = 1;
                                                }
                                            } else if (c2 == c4) {
                                                jsonParser.nextValue();
                                                str3 = deserializeString(jsonParser, deserializationContext);
                                                trackAnnotationAuthor = trackAnnotationAuthor2;
                                            } else if (c2 == 2) {
                                                jsonParser.nextValue();
                                                str7 = deserializeString(jsonParser, deserializationContext);
                                                trackAnnotationAuthor = trackAnnotationAuthor2;
                                            } else if (c2 != 3) {
                                                jsonParser.nextValue();
                                                jsonParser.skipChildren();
                                                trackAnnotationAuthor = trackAnnotationAuthor2;
                                            } else {
                                                jsonParser.nextValue();
                                                d = ((Double) NumberDeserializers.find(Double.TYPE, "double").deserialize(jsonParser, deserializationContext)).doubleValue();
                                                trackAnnotationAuthor = trackAnnotationAuthor2;
                                            }
                                            trackAnnotationAuthor2 = trackAnnotationAuthor;
                                            i2 = 5;
                                            c4 = 1;
                                        }
                                    }
                                    obj = TrackAnnotation.create(str3, str7, d, trackAnnotationAuthor2);
                                }
                                linkedList3.add(obj);
                                str4 = str2;
                                str3 = null;
                                i2 = 5;
                                c4 = 1;
                            }
                            str = str4;
                            linkedList = linkedList3;
                        }
                        str4 = str;
                        linkedList2 = linkedList;
                        break;
                    case 3:
                        jsonParser.nextValue();
                        str6 = deserializeString(jsonParser, deserializationContext);
                        linkedList2 = linkedList2;
                        break;
                    case 4:
                        jsonParser.nextValue();
                        str4 = deserializeString(jsonParser, deserializationContext);
                        linkedList2 = linkedList2;
                        break;
                    default:
                        jsonParser.nextValue();
                        jsonParser.skipChildren();
                        linkedList2 = linkedList2;
                        break;
                }
                str3 = null;
            }
        }
        return TrackAnnotationSet.create(str4, i, str5, str6, linkedList2);
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
