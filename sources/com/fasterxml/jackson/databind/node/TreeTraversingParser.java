package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.NodeCursor;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TreeTraversingParser extends ParserMinimalBase {
    protected boolean _closed;
    protected JsonToken _nextToken;
    protected NodeCursor _nodeCursor;
    protected ObjectCodec _objectCodec;
    protected boolean _startContainer;

    public TreeTraversingParser(JsonNode jsonNode, ObjectCodec objectCodec) {
        super(0);
        this._objectCodec = objectCodec;
        if (jsonNode.isArray()) {
            this._nextToken = JsonToken.START_ARRAY;
            this._nodeCursor = new NodeCursor.ArrayCursor(jsonNode, null);
        } else if (jsonNode.isObject()) {
            this._nextToken = JsonToken.START_OBJECT;
            this._nodeCursor = new NodeCursor.ObjectCursor(jsonNode, null);
        } else {
            this._nodeCursor = new NodeCursor.RootCursor(jsonNode, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    public void _handleEOF() {
        VersionUtil.throwInternal();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this._closed) {
            this._closed = true;
            this._nodeCursor = null;
            this._currToken = null;
        }
    }

    /* access modifiers changed from: protected */
    public JsonNode currentNode() {
        NodeCursor nodeCursor;
        if (this._closed || (nodeCursor = this._nodeCursor) == null) {
            return null;
        }
        return nodeCursor.currentNode();
    }

    /* access modifiers changed from: protected */
    public JsonNode currentNumericNode() {
        JsonToken jsonToken;
        JsonNode currentNode = currentNode();
        if (currentNode != null) {
            if (currentNode.getNodeType() == JsonNodeType.NUMBER) {
                return currentNode;
            }
        }
        if (currentNode == null) {
            jsonToken = null;
        } else {
            jsonToken = currentNode.asToken();
        }
        throw _constructError("Current token (" + jsonToken + ") not numeric, cannot use numeric value accessors");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() {
        return currentNumericNode().bigIntegerValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) {
        JsonNode currentNode = currentNode();
        if (currentNode == null) {
            return null;
        }
        if (currentNode instanceof TextNode) {
            return ((TextNode) currentNode).getBinaryValue(base64Variant);
        }
        return currentNode.binaryValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return JsonLocation.NA;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getCurrentName() {
        NodeCursor nodeCursor = this._nodeCursor;
        if (nodeCursor == null) {
            return null;
        }
        return nodeCursor._currentName;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() {
        return currentNumericNode().decimalValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() {
        return currentNumericNode().doubleValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getEmbeddedObject() {
        JsonNode currentNode;
        if (this._closed || (currentNode = currentNode()) == null) {
            return null;
        }
        boolean z = false;
        if (currentNode.getNodeType() == JsonNodeType.POJO) {
            return ((POJONode) currentNode)._value;
        }
        if (currentNode.getNodeType() == JsonNodeType.BINARY) {
            z = true;
        }
        if (z) {
            return ((BinaryNode) currentNode)._data;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() {
        return (float) currentNumericNode().doubleValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getIntValue() {
        return currentNumericNode().intValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getLongValue() {
        return currentNumericNode().longValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() {
        return currentNumericNode().numberType();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() {
        return currentNumericNode().numberValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonStreamContext getParsingContext() {
        return this._nodeCursor;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fasterxml.jackson.core.JsonParser
    public String getText() {
        if (this._closed) {
            return null;
        }
        switch (this._currToken.ordinal()) {
            case 5:
                return this._nodeCursor._currentName;
            case 6:
                JsonNode currentNode = currentNode();
                if (currentNode != null) {
                    if (currentNode.getNodeType() == JsonNodeType.BINARY) {
                        return currentNode.asText();
                    }
                }
                break;
            case 7:
                return currentNode().textValue();
            case 8:
            case 9:
                return String.valueOf(currentNode().numberValue());
        }
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        return jsonToken.asString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() {
        return getText().toCharArray();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getTextLength() {
        return getText().length();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getTextOffset() {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        return JsonLocation.NA;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isNaN() {
        if (this._closed) {
            return false;
        }
        JsonNode currentNode = currentNode();
        if (currentNode instanceof NumericNode) {
            return ((NumericNode) currentNode).isNaN();
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() {
        NodeCursor nodeCursor;
        JsonToken jsonToken = this._nextToken;
        if (jsonToken != null) {
            this._currToken = jsonToken;
            this._nextToken = null;
            return jsonToken;
        } else if (this._startContainer) {
            this._startContainer = false;
            if (!this._nodeCursor.currentHasChildren()) {
                JsonToken jsonToken2 = this._currToken == JsonToken.START_OBJECT ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
                this._currToken = jsonToken2;
                return jsonToken2;
            }
            NodeCursor nodeCursor2 = this._nodeCursor;
            JsonNode currentNode = nodeCursor2.currentNode();
            if (currentNode != null) {
                if (currentNode.isArray()) {
                    nodeCursor = new NodeCursor.ArrayCursor(currentNode, nodeCursor2);
                } else if (currentNode.isObject()) {
                    nodeCursor = new NodeCursor.ObjectCursor(currentNode, nodeCursor2);
                } else {
                    StringBuilder V0 = je.V0("Current node of type ");
                    V0.append(currentNode.getClass().getName());
                    throw new IllegalStateException(V0.toString());
                }
                this._nodeCursor = nodeCursor;
                JsonToken nextToken = nodeCursor.nextToken();
                this._currToken = nextToken;
                if (nextToken == JsonToken.START_OBJECT || nextToken == JsonToken.START_ARRAY) {
                    this._startContainer = true;
                }
                return nextToken;
            }
            throw new IllegalStateException("No current node");
        } else {
            NodeCursor nodeCursor3 = this._nodeCursor;
            if (nodeCursor3 == null) {
                this._closed = true;
                return null;
            }
            JsonToken nextToken2 = nodeCursor3.nextToken();
            this._currToken = nextToken2;
            if (nextToken2 != null) {
                if (nextToken2 == JsonToken.START_OBJECT || nextToken2 == JsonToken.START_ARRAY) {
                    this._startContainer = true;
                }
                return nextToken2;
            }
            JsonToken endToken = this._nodeCursor.endToken();
            this._currToken = endToken;
            this._nodeCursor = this._nodeCursor._parent;
            return endToken;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        byte[] binaryValue = getBinaryValue(base64Variant);
        if (binaryValue == null) {
            return 0;
        }
        outputStream.write(binaryValue, 0, binaryValue.length);
        return binaryValue.length;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonParser skipChildren() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.START_OBJECT) {
            this._startContainer = false;
            this._currToken = JsonToken.END_OBJECT;
        } else if (jsonToken == JsonToken.START_ARRAY) {
            this._startContainer = false;
            this._currToken = JsonToken.END_ARRAY;
        }
        return this;
    }
}
