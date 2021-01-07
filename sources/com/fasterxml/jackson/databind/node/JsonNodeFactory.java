package com.fasterxml.jackson.databind.node;

import java.io.Serializable;
import java.math.BigDecimal;

public class JsonNodeFactory implements Serializable {
    private static final JsonNodeFactory decimalsNormalized;
    public static final JsonNodeFactory instance;
    private static final long serialVersionUID = 1;
    private final boolean _cfgBigDecimalExact;

    static {
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        decimalsNormalized = jsonNodeFactory;
        instance = jsonNodeFactory;
    }

    protected JsonNodeFactory() {
        this._cfgBigDecimalExact = false;
    }

    public BinaryNode binaryNode(byte[] bArr) {
        if (bArr.length == 0) {
            return BinaryNode.EMPTY_BINARY_NODE;
        }
        return new BinaryNode(bArr);
    }

    public BooleanNode booleanNode(boolean z) {
        return z ? BooleanNode.TRUE : BooleanNode.FALSE;
    }

    public ValueNode numberNode(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return NullNode.instance;
        }
        if (this._cfgBigDecimalExact) {
            return new DecimalNode(bigDecimal);
        }
        if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            return DecimalNode.ZERO;
        }
        return new DecimalNode(bigDecimal.stripTrailingZeros());
    }

    public TextNode textNode(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return TextNode.EMPTY_STRING_NODE;
        }
        return new TextNode(str);
    }

    public JsonNodeFactory(boolean z) {
        this._cfgBigDecimalExact = z;
    }
}
