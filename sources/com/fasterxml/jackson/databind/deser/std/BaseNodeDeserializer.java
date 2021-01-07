package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BigIntegerNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.FloatNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.util.RawValue;
import java.math.BigInteger;

/* access modifiers changed from: package-private */
public abstract class BaseNodeDeserializer<T extends JsonNode> extends StdDeserializer<T> {
    protected final Boolean _supportsUpdates;

    public BaseNodeDeserializer(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this._supportsUpdates = bool;
    }

    /* access modifiers changed from: protected */
    public final JsonNode _fromEmbedded(JsonParser jsonParser, JsonNodeFactory jsonNodeFactory) {
        Object embeddedObject = jsonParser.getEmbeddedObject();
        if (embeddedObject == null) {
            jsonNodeFactory.getClass();
            return NullNode.instance;
        } else if (embeddedObject.getClass() == byte[].class) {
            return jsonNodeFactory.binaryNode((byte[]) embeddedObject);
        } else {
            if (embeddedObject instanceof RawValue) {
                jsonNodeFactory.getClass();
                return new POJONode((RawValue) embeddedObject);
            } else if (embeddedObject instanceof JsonNode) {
                return (JsonNode) embeddedObject;
            } else {
                jsonNodeFactory.getClass();
                return new POJONode(embeddedObject);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final JsonNode _fromInt(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        JsonParser.NumberType numberType;
        JsonParser.NumberType numberType2 = JsonParser.NumberType.LONG;
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        if ((StdDeserializer.F_MASK_INT_COERCIONS & deserializationFeatures) == 0) {
            numberType = jsonParser.getNumberType();
        } else if (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures)) {
            numberType = JsonParser.NumberType.BIG_INTEGER;
        } else if (DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures)) {
            numberType = numberType2;
        } else {
            numberType = jsonParser.getNumberType();
        }
        if (numberType == JsonParser.NumberType.INT) {
            int intValue = jsonParser.getIntValue();
            jsonNodeFactory.getClass();
            return IntNode.valueOf(intValue);
        } else if (numberType == numberType2) {
            long longValue = jsonParser.getLongValue();
            jsonNodeFactory.getClass();
            return new LongNode(longValue);
        } else {
            BigInteger bigIntegerValue = jsonParser.getBigIntegerValue();
            jsonNodeFactory.getClass();
            if (bigIntegerValue == null) {
                return NullNode.instance;
            }
            return new BigIntegerNode(bigIntegerValue);
        }
    }

    /* access modifiers changed from: protected */
    public void _handleDuplicateField(DeserializationContext deserializationContext, String str) {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            deserializationContext.reportInputMismatch(JsonNode.class, "Duplicate field '%s' for ObjectNode: not allowed when FAIL_ON_READING_DUP_TREE_KEY enabled", str);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final JsonNode deserializeAny(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        DoubleNode doubleNode;
        int currentTokenId = jsonParser.getCurrentTokenId();
        if (currentTokenId != 2) {
            switch (currentTokenId) {
                case 5:
                    return deserializeObjectAtName(jsonParser, deserializationContext, jsonNodeFactory);
                case 6:
                    return jsonNodeFactory.textNode(jsonParser.getText());
                case 7:
                    return _fromInt(jsonParser, deserializationContext, jsonNodeFactory);
                case 8:
                    JsonParser.NumberType numberType = jsonParser.getNumberType();
                    if (numberType == JsonParser.NumberType.BIG_DECIMAL) {
                        return jsonNodeFactory.numberNode(jsonParser.getDecimalValue());
                    }
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        if (!jsonParser.isNaN()) {
                            return jsonNodeFactory.numberNode(jsonParser.getDecimalValue());
                        }
                        double doubleValue = jsonParser.getDoubleValue();
                        jsonNodeFactory.getClass();
                        doubleNode = new DoubleNode(doubleValue);
                    } else if (numberType == JsonParser.NumberType.FLOAT) {
                        float floatValue = jsonParser.getFloatValue();
                        jsonNodeFactory.getClass();
                        return new FloatNode(floatValue);
                    } else {
                        double doubleValue2 = jsonParser.getDoubleValue();
                        jsonNodeFactory.getClass();
                        doubleNode = new DoubleNode(doubleValue2);
                    }
                    return doubleNode;
                case 9:
                    return jsonNodeFactory.booleanNode(true);
                case 10:
                    return jsonNodeFactory.booleanNode(false);
                case 11:
                    jsonNodeFactory.getClass();
                    return NullNode.instance;
                case 12:
                    return _fromEmbedded(jsonParser, jsonNodeFactory);
                default:
                    deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
                    throw null;
            }
        } else {
            jsonNodeFactory.getClass();
            return new ObjectNode(jsonNodeFactory);
        }
    }

    /* access modifiers changed from: protected */
    public final ArrayNode deserializeArray(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        jsonNodeFactory.getClass();
        ArrayNode arrayNode = new ArrayNode(jsonNodeFactory);
        while (true) {
            switch (jsonParser.nextToken().id()) {
                case 1:
                    arrayNode.add(deserializeObject(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 2:
                case 5:
                case 8:
                default:
                    arrayNode.add(deserializeAny(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 3:
                    arrayNode.add(deserializeArray(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 4:
                    return arrayNode;
                case 6:
                    arrayNode.add(jsonNodeFactory.textNode(jsonParser.getText()));
                    break;
                case 7:
                    arrayNode.add(_fromInt(jsonParser, deserializationContext, jsonNodeFactory));
                    break;
                case 9:
                    arrayNode.add(jsonNodeFactory.booleanNode(true));
                    break;
                case 10:
                    arrayNode.add(jsonNodeFactory.booleanNode(false));
                    break;
                case 11:
                    arrayNode.add(NullNode.instance);
                    break;
                case 12:
                    arrayNode.add(_fromEmbedded(jsonParser, jsonNodeFactory));
                    break;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final ObjectNode deserializeObject(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        JsonNode jsonNode;
        jsonNodeFactory.getClass();
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        String nextFieldName = jsonParser.nextFieldName();
        while (nextFieldName != null) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            int id = nextToken.id();
            if (id == 1) {
                jsonNode = deserializeObject(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (id == 3) {
                jsonNode = deserializeArray(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (id == 6) {
                jsonNode = jsonNodeFactory.textNode(jsonParser.getText());
            } else if (id != 7) {
                switch (id) {
                    case 9:
                        jsonNode = jsonNodeFactory.booleanNode(true);
                        break;
                    case 10:
                        jsonNode = jsonNodeFactory.booleanNode(false);
                        break;
                    case 11:
                        jsonNode = NullNode.instance;
                        break;
                    case 12:
                        jsonNode = _fromEmbedded(jsonParser, jsonNodeFactory);
                        break;
                    default:
                        jsonNode = deserializeAny(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                }
            } else {
                jsonNode = _fromInt(jsonParser, deserializationContext, jsonNodeFactory);
            }
            if (objectNode.replace(nextFieldName, jsonNode) != null) {
                _handleDuplicateField(deserializationContext, nextFieldName);
            }
            nextFieldName = jsonParser.nextFieldName();
        }
        return objectNode;
    }

    /* access modifiers changed from: protected */
    public final ObjectNode deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        JsonNode jsonNode;
        jsonNodeFactory.getClass();
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        String currentName = jsonParser.getCurrentName();
        while (currentName != null) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            int id = nextToken.id();
            if (id == 1) {
                jsonNode = deserializeObject(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (id == 3) {
                jsonNode = deserializeArray(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (id == 6) {
                jsonNode = jsonNodeFactory.textNode(jsonParser.getText());
            } else if (id != 7) {
                switch (id) {
                    case 9:
                        jsonNode = jsonNodeFactory.booleanNode(true);
                        break;
                    case 10:
                        jsonNode = jsonNodeFactory.booleanNode(false);
                        break;
                    case 11:
                        jsonNode = NullNode.instance;
                        break;
                    case 12:
                        jsonNode = _fromEmbedded(jsonParser, jsonNodeFactory);
                        break;
                    default:
                        jsonNode = deserializeAny(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                }
            } else {
                jsonNode = _fromInt(jsonParser, deserializationContext, jsonNodeFactory);
            }
            if (objectNode.replace(currentName, jsonNode) != null) {
                _handleDuplicateField(deserializationContext, currentName);
            }
            currentName = jsonParser.nextFieldName();
        }
        return objectNode;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._supportsUpdates;
    }

    /* access modifiers changed from: protected */
    public final JsonNode updateArray(JsonParser jsonParser, DeserializationContext deserializationContext, ArrayNode arrayNode) {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        while (true) {
            switch (jsonParser.nextToken().id()) {
                case 1:
                    arrayNode.add(deserializeObject(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 2:
                case 5:
                case 8:
                default:
                    arrayNode.add(deserializeAny(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 3:
                    arrayNode.add(deserializeArray(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 4:
                    return arrayNode;
                case 6:
                    arrayNode.add(nodeFactory.textNode(jsonParser.getText()));
                    break;
                case 7:
                    arrayNode.add(_fromInt(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 9:
                    arrayNode.add(nodeFactory.booleanNode(true));
                    break;
                case 10:
                    arrayNode.add(nodeFactory.booleanNode(false));
                    break;
                case 11:
                    nodeFactory.getClass();
                    arrayNode.add(NullNode.instance);
                    break;
                case 12:
                    arrayNode.add(_fromEmbedded(jsonParser, nodeFactory));
                    break;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final JsonNode updateObject(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode) {
        String str;
        JsonNode jsonNode;
        if (jsonParser.isExpectedStartObjectToken()) {
            str = jsonParser.nextFieldName();
        } else if (!jsonParser.hasToken(JsonToken.FIELD_NAME)) {
            return (JsonNode) deserialize(jsonParser, deserializationContext);
        } else {
            str = jsonParser.getCurrentName();
        }
        while (str != null) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonNode jsonNode2 = objectNode.get(str);
            if (jsonNode2 != null) {
                if (jsonNode2 instanceof ObjectNode) {
                    JsonNode updateObject = updateObject(jsonParser, deserializationContext, (ObjectNode) jsonNode2);
                    if (updateObject != jsonNode2) {
                        objectNode.set(str, updateObject);
                    }
                } else if (jsonNode2 instanceof ArrayNode) {
                    ArrayNode arrayNode = (ArrayNode) jsonNode2;
                    updateArray(jsonParser, deserializationContext, arrayNode);
                    if (arrayNode != jsonNode2) {
                        objectNode.set(str, arrayNode);
                    }
                }
                str = jsonParser.nextFieldName();
            }
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
            int id = nextToken.id();
            if (id == 1) {
                jsonNode = deserializeObject(jsonParser, deserializationContext, nodeFactory);
            } else if (id == 3) {
                jsonNode = deserializeArray(jsonParser, deserializationContext, nodeFactory);
            } else if (id == 6) {
                jsonNode = nodeFactory.textNode(jsonParser.getText());
            } else if (id != 7) {
                switch (id) {
                    case 9:
                        jsonNode = nodeFactory.booleanNode(true);
                        break;
                    case 10:
                        jsonNode = nodeFactory.booleanNode(false);
                        break;
                    case 11:
                        nodeFactory.getClass();
                        jsonNode = NullNode.instance;
                        break;
                    case 12:
                        jsonNode = _fromEmbedded(jsonParser, nodeFactory);
                        break;
                    default:
                        jsonNode = deserializeAny(jsonParser, deserializationContext, nodeFactory);
                        break;
                }
            } else {
                jsonNode = _fromInt(jsonParser, deserializationContext, nodeFactory);
            }
            if (jsonNode2 != null) {
                _handleDuplicateField(deserializationContext, str);
            }
            objectNode.set(str, jsonNode);
            str = jsonParser.nextFieldName();
        }
        return objectNode;
    }
}
