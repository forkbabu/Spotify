package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class FilteringParserDelegate extends JsonParserDelegate {
    protected boolean _allowMultipleMatches;
    protected JsonToken _currToken;
    protected TokenFilterContext _exposedContext;
    protected TokenFilterContext _headContext;
    protected boolean _includePath;
    protected TokenFilter _itemFilter;
    protected int _matchCount;

    public FilteringParserDelegate(JsonParser jsonParser, TokenFilter tokenFilter, boolean z, boolean z2) {
        super(jsonParser);
        this._itemFilter = tokenFilter;
        this._headContext = new TokenFilterContext(0, null, tokenFilter, true);
        this._includePath = z;
        this._allowMultipleMatches = z2;
    }

    private JsonToken _nextBuffered(TokenFilterContext tokenFilterContext) {
        this._exposedContext = tokenFilterContext;
        JsonToken nextTokenToRead = tokenFilterContext.nextTokenToRead();
        if (nextTokenToRead != null) {
            return nextTokenToRead;
        }
        while (tokenFilterContext != this._headContext) {
            tokenFilterContext = this._exposedContext.findChildOf(tokenFilterContext);
            this._exposedContext = tokenFilterContext;
            if (tokenFilterContext != null) {
                JsonToken nextTokenToRead2 = tokenFilterContext.nextTokenToRead();
                if (nextTokenToRead2 != null) {
                    return nextTokenToRead2;
                }
            } else {
                throw _constructError("Unexpected problem: chain of filtered context broken");
            }
        }
        throw _constructError("Internal error: failed to locate expected buffered tokens");
    }

    private final boolean _verifyAllowedMatches() {
        int i = this._matchCount;
        if (i != 0 && !this._allowMultipleMatches) {
            return false;
        }
        this._matchCount = i + 1;
        return true;
    }

    /* access modifiers changed from: protected */
    public final JsonToken _nextTokenWithBuffering(TokenFilterContext tokenFilterContext) {
        TokenFilter checkValue;
        TokenFilter tokenFilter = TokenFilter.INCLUDE_ALL;
        while (true) {
            JsonToken nextToken = this.delegate.nextToken();
            if (nextToken == null) {
                return nextToken;
            }
            int id = nextToken.id();
            boolean z = false;
            if (id != 1) {
                if (id != 2) {
                    if (id == 3) {
                        TokenFilter checkValue2 = this._headContext.checkValue(this._itemFilter);
                        if (checkValue2 == null) {
                            this.delegate.skipChildren();
                        } else {
                            this._itemFilter = checkValue2;
                            if (checkValue2 == tokenFilter) {
                                this._headContext = this._headContext.createChildArrayContext(checkValue2, true);
                                return _nextBuffered(tokenFilterContext);
                            }
                            this._headContext = this._headContext.createChildArrayContext(checkValue2, false);
                        }
                    } else if (id != 4) {
                        if (id != 5) {
                            TokenFilter tokenFilter2 = this._itemFilter;
                            if (tokenFilter2 == tokenFilter) {
                                return _nextBuffered(tokenFilterContext);
                            }
                            if (tokenFilter2 != null && (((checkValue = this._headContext.checkValue(tokenFilter2)) == tokenFilter || checkValue != null) && _verifyAllowedMatches())) {
                                return _nextBuffered(tokenFilterContext);
                            }
                        } else {
                            String currentName = this.delegate.getCurrentName();
                            TokenFilter fieldName = this._headContext.setFieldName(currentName);
                            if (fieldName == tokenFilter) {
                                this._itemFilter = fieldName;
                                return _nextBuffered(tokenFilterContext);
                            } else if (fieldName == null) {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                            } else {
                                this._itemFilter = fieldName;
                                if (fieldName != tokenFilter) {
                                    continue;
                                } else if (_verifyAllowedMatches()) {
                                    return _nextBuffered(tokenFilterContext);
                                } else {
                                    this._itemFilter = this._headContext.setFieldName(currentName);
                                }
                            }
                        }
                    }
                }
                TokenFilterContext tokenFilterContext2 = this._headContext;
                TokenFilter tokenFilter3 = tokenFilterContext2._filter;
                if ((tokenFilterContext2 == tokenFilterContext) && tokenFilterContext2._startHandled) {
                    z = true;
                }
                TokenFilterContext tokenFilterContext3 = tokenFilterContext2._parent;
                this._headContext = tokenFilterContext3;
                this._itemFilter = tokenFilterContext3._filter;
                if (z) {
                    return nextToken;
                }
            } else {
                TokenFilter tokenFilter4 = this._itemFilter;
                if (tokenFilter4 == tokenFilter) {
                    this._headContext = this._headContext.createChildObjectContext(tokenFilter4, true);
                    return nextToken;
                } else if (tokenFilter4 == null) {
                    this.delegate.skipChildren();
                } else {
                    TokenFilter checkValue3 = this._headContext.checkValue(tokenFilter4);
                    if (checkValue3 == null) {
                        this.delegate.skipChildren();
                    } else {
                        this._itemFilter = checkValue3;
                        if (checkValue3 == tokenFilter) {
                            this._headContext = this._headContext.createChildObjectContext(checkValue3, true);
                            return _nextBuffered(tokenFilterContext);
                        }
                        this._headContext = this._headContext.createChildObjectContext(checkValue3, false);
                    }
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public void clearCurrentToken() {
        if (this._currToken != null) {
            this._currToken = null;
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonToken currentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() {
        return this.delegate.getBigIntegerValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) {
        return this.delegate.getBinaryValue(base64Variant);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean getBooleanValue() {
        return this.delegate.getBooleanValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public byte getByteValue() {
        return this.delegate.getByteValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return this.delegate.getCurrentLocation();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public String getCurrentName() {
        TokenFilterContext tokenFilterContext = this._exposedContext;
        if (tokenFilterContext == null) {
            tokenFilterContext = this._headContext;
        }
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return tokenFilterContext._currentName;
        }
        TokenFilterContext tokenFilterContext2 = tokenFilterContext._parent;
        if (tokenFilterContext2 == null) {
            return null;
        }
        return tokenFilterContext2._currentName;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final int getCurrentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() {
        return this.delegate.getDecimalValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() {
        return this.delegate.getDoubleValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public Object getEmbeddedObject() {
        return this.delegate.getEmbeddedObject();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() {
        return this.delegate.getFloatValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int getIntValue() {
        return this.delegate.getIntValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public long getLongValue() {
        return this.delegate.getLongValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() {
        return this.delegate.getNumberType();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() {
        return this.delegate.getNumberValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonStreamContext getParsingContext() {
        TokenFilterContext tokenFilterContext = this._exposedContext;
        return tokenFilterContext != null ? tokenFilterContext : this._headContext;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public short getShortValue() {
        return this.delegate.getShortValue();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public String getText() {
        return this.delegate.getText();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() {
        return this.delegate.getTextCharacters();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int getTextLength() {
        return this.delegate.getTextLength();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int getTextOffset() {
        return this.delegate.getTextOffset();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        return this.delegate.getTokenLocation();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() {
        return this.delegate.getValueAsInt();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong() {
        return this.delegate.getValueAsLong();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() {
        return this.delegate.getValueAsString();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        return this.delegate.hasTextCharacters();
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final boolean hasToken(JsonToken jsonToken) {
        return this._currToken == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean hasTokenId(int i) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return i == 0;
        }
        if (jsonToken.id() == i) {
            return true;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartArrayToken() {
        return this._currToken == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartObjectToken() {
        return this._currToken == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() {
        JsonToken nextToken;
        TokenFilter checkValue;
        JsonToken _nextTokenWithBuffering;
        JsonToken _nextTokenWithBuffering2;
        JsonToken _nextTokenWithBuffering3;
        TokenFilter checkValue2;
        JsonToken jsonToken;
        TokenFilter tokenFilter = TokenFilter.INCLUDE_ALL;
        if (this._allowMultipleMatches || (jsonToken = this._currToken) == null || this._exposedContext != null || !jsonToken.isScalarValue() || this._headContext._startHandled || this._includePath || this._itemFilter != tokenFilter) {
            TokenFilterContext tokenFilterContext = this._exposedContext;
            if (tokenFilterContext != null) {
                do {
                    JsonToken nextTokenToRead = tokenFilterContext.nextTokenToRead();
                    if (nextTokenToRead != null) {
                        this._currToken = nextTokenToRead;
                        return nextTokenToRead;
                    }
                    TokenFilterContext tokenFilterContext2 = this._headContext;
                    if (tokenFilterContext == tokenFilterContext2) {
                        this._exposedContext = null;
                        if (tokenFilterContext.inArray()) {
                            JsonToken currentToken = this.delegate.getCurrentToken();
                            this._currToken = currentToken;
                            return currentToken;
                        }
                    } else {
                        tokenFilterContext = tokenFilterContext2.findChildOf(tokenFilterContext);
                        this._exposedContext = tokenFilterContext;
                    }
                } while (tokenFilterContext != null);
                throw _constructError("Unexpected problem: chain of filtered context broken");
            }
            JsonToken nextToken2 = this.delegate.nextToken();
            if (nextToken2 == null) {
                this._currToken = nextToken2;
                return nextToken2;
            }
            int id = nextToken2.id();
            if (id != 1) {
                if (id != 2) {
                    if (id == 3) {
                        TokenFilter tokenFilter2 = this._itemFilter;
                        if (tokenFilter2 == tokenFilter) {
                            this._headContext = this._headContext.createChildArrayContext(tokenFilter2, true);
                            this._currToken = nextToken2;
                            return nextToken2;
                        } else if (tokenFilter2 == null) {
                            this.delegate.skipChildren();
                        } else {
                            TokenFilter checkValue3 = this._headContext.checkValue(tokenFilter2);
                            if (checkValue3 == null) {
                                this.delegate.skipChildren();
                            } else {
                                this._itemFilter = checkValue3;
                                if (checkValue3 == tokenFilter) {
                                    this._headContext = this._headContext.createChildArrayContext(checkValue3, true);
                                    this._currToken = nextToken2;
                                    return nextToken2;
                                }
                                TokenFilterContext createChildArrayContext = this._headContext.createChildArrayContext(checkValue3, false);
                                this._headContext = createChildArrayContext;
                                if (this._includePath && (_nextTokenWithBuffering2 = _nextTokenWithBuffering(createChildArrayContext)) != null) {
                                    this._currToken = _nextTokenWithBuffering2;
                                    return _nextTokenWithBuffering2;
                                }
                            }
                        }
                    } else if (id != 4) {
                        if (id != 5) {
                            TokenFilter tokenFilter3 = this._itemFilter;
                            if (tokenFilter3 == tokenFilter) {
                                this._currToken = nextToken2;
                                return nextToken2;
                            } else if (tokenFilter3 != null && (((checkValue2 = this._headContext.checkValue(tokenFilter3)) == tokenFilter || checkValue2 != null) && _verifyAllowedMatches())) {
                                this._currToken = nextToken2;
                                return nextToken2;
                            }
                        } else {
                            TokenFilter fieldName = this._headContext.setFieldName(this.delegate.getCurrentName());
                            if (fieldName == tokenFilter) {
                                this._itemFilter = fieldName;
                                boolean z = this._includePath;
                                this._currToken = nextToken2;
                                return nextToken2;
                            } else if (fieldName == null) {
                                this.delegate.nextToken();
                                this.delegate.skipChildren();
                            } else {
                                this._itemFilter = fieldName;
                                if (fieldName == tokenFilter) {
                                    if (!_verifyAllowedMatches()) {
                                        this.delegate.nextToken();
                                        this.delegate.skipChildren();
                                    } else if (this._includePath) {
                                        this._currToken = nextToken2;
                                        return nextToken2;
                                    }
                                }
                                if (this._includePath && (_nextTokenWithBuffering3 = _nextTokenWithBuffering(this._headContext)) != null) {
                                    this._currToken = _nextTokenWithBuffering3;
                                    return _nextTokenWithBuffering3;
                                }
                            }
                        }
                    }
                }
                TokenFilterContext tokenFilterContext3 = this._headContext;
                boolean z2 = tokenFilterContext3._startHandled;
                TokenFilter tokenFilter4 = tokenFilterContext3._filter;
                TokenFilterContext tokenFilterContext4 = tokenFilterContext3._parent;
                this._headContext = tokenFilterContext4;
                this._itemFilter = tokenFilterContext4._filter;
                if (z2) {
                    this._currToken = nextToken2;
                    return nextToken2;
                }
            } else {
                TokenFilter tokenFilter5 = this._itemFilter;
                if (tokenFilter5 == tokenFilter) {
                    this._headContext = this._headContext.createChildObjectContext(tokenFilter5, true);
                    this._currToken = nextToken2;
                    return nextToken2;
                } else if (tokenFilter5 == null) {
                    this.delegate.skipChildren();
                } else {
                    TokenFilter checkValue4 = this._headContext.checkValue(tokenFilter5);
                    if (checkValue4 == null) {
                        this.delegate.skipChildren();
                    } else {
                        this._itemFilter = checkValue4;
                        if (checkValue4 == tokenFilter) {
                            this._headContext = this._headContext.createChildObjectContext(checkValue4, true);
                            this._currToken = nextToken2;
                            return nextToken2;
                        }
                        TokenFilterContext createChildObjectContext = this._headContext.createChildObjectContext(checkValue4, false);
                        this._headContext = createChildObjectContext;
                        if (this._includePath && (_nextTokenWithBuffering = _nextTokenWithBuffering(createChildObjectContext)) != null) {
                            this._currToken = _nextTokenWithBuffering;
                            return _nextTokenWithBuffering;
                        }
                    }
                }
            }
            while (true) {
                nextToken = this.delegate.nextToken();
                if (nextToken != null) {
                    int id2 = nextToken.id();
                    if (id2 == 1) {
                        TokenFilter tokenFilter6 = this._itemFilter;
                        if (tokenFilter6 != tokenFilter) {
                            if (tokenFilter6 != null) {
                                TokenFilter checkValue5 = this._headContext.checkValue(tokenFilter6);
                                if (checkValue5 != null) {
                                    this._itemFilter = checkValue5;
                                    if (checkValue5 != tokenFilter) {
                                        TokenFilterContext createChildObjectContext2 = this._headContext.createChildObjectContext(checkValue5, false);
                                        this._headContext = createChildObjectContext2;
                                        if (this._includePath && (nextToken = _nextTokenWithBuffering(createChildObjectContext2)) != null) {
                                            this._currToken = nextToken;
                                            break;
                                        }
                                    } else {
                                        this._headContext = this._headContext.createChildObjectContext(checkValue5, true);
                                        this._currToken = nextToken;
                                        break;
                                    }
                                } else {
                                    this.delegate.skipChildren();
                                }
                            } else {
                                this.delegate.skipChildren();
                            }
                        } else {
                            this._headContext = this._headContext.createChildObjectContext(tokenFilter6, true);
                            this._currToken = nextToken;
                            break;
                        }
                    } else {
                        if (id2 != 2) {
                            if (id2 != 3) {
                                if (id2 != 4) {
                                    if (id2 == 5) {
                                        TokenFilter fieldName2 = this._headContext.setFieldName(this.delegate.getCurrentName());
                                        if (fieldName2 != tokenFilter) {
                                            if (fieldName2 != null) {
                                                this._itemFilter = fieldName2;
                                                if (fieldName2 != tokenFilter) {
                                                    if (this._includePath && (nextToken = _nextTokenWithBuffering(this._headContext)) != null) {
                                                        this._currToken = nextToken;
                                                        break;
                                                    }
                                                } else if (_verifyAllowedMatches() && this._includePath) {
                                                    this._currToken = nextToken;
                                                    break;
                                                }
                                            } else {
                                                this.delegate.nextToken();
                                                this.delegate.skipChildren();
                                            }
                                        } else {
                                            this._itemFilter = fieldName2;
                                            this._currToken = nextToken;
                                            break;
                                        }
                                    } else {
                                        TokenFilter tokenFilter7 = this._itemFilter;
                                        if (tokenFilter7 != tokenFilter) {
                                            if (tokenFilter7 != null && (((checkValue = this._headContext.checkValue(tokenFilter7)) == tokenFilter || checkValue != null) && _verifyAllowedMatches())) {
                                                this._currToken = nextToken;
                                                break;
                                            }
                                        } else {
                                            this._currToken = nextToken;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                TokenFilter tokenFilter8 = this._itemFilter;
                                if (tokenFilter8 != tokenFilter) {
                                    if (tokenFilter8 != null) {
                                        TokenFilter checkValue6 = this._headContext.checkValue(tokenFilter8);
                                        if (checkValue6 != null) {
                                            this._itemFilter = checkValue6;
                                            if (checkValue6 != tokenFilter) {
                                                TokenFilterContext createChildArrayContext2 = this._headContext.createChildArrayContext(checkValue6, false);
                                                this._headContext = createChildArrayContext2;
                                                if (this._includePath && (nextToken = _nextTokenWithBuffering(createChildArrayContext2)) != null) {
                                                    this._currToken = nextToken;
                                                    break;
                                                }
                                            } else {
                                                this._headContext = this._headContext.createChildArrayContext(checkValue6, true);
                                                this._currToken = nextToken;
                                                break;
                                            }
                                        } else {
                                            this.delegate.skipChildren();
                                        }
                                    } else {
                                        this.delegate.skipChildren();
                                    }
                                } else {
                                    this._headContext = this._headContext.createChildArrayContext(tokenFilter8, true);
                                    this._currToken = nextToken;
                                    break;
                                }
                            }
                        }
                        TokenFilterContext tokenFilterContext5 = this._headContext;
                        boolean z3 = tokenFilterContext5._startHandled;
                        TokenFilterContext tokenFilterContext6 = tokenFilterContext5._parent;
                        this._headContext = tokenFilterContext6;
                        this._itemFilter = tokenFilterContext6._filter;
                        if (z3) {
                            this._currToken = nextToken;
                            break;
                        }
                    }
                } else {
                    this._currToken = nextToken;
                    break;
                }
            }
            return nextToken;
        }
        this._currToken = null;
        return null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextValue() {
        JsonToken nextToken = nextToken();
        return nextToken == JsonToken.FIELD_NAME ? nextToken() : nextToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        return this.delegate.readBinaryValue(base64Variant, outputStream);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser skipChildren() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken nextToken = nextToken();
            if (nextToken == null) {
                return this;
            }
            if (nextToken.isStructStart()) {
                i++;
            } else if (nextToken.isStructEnd() && i - 1 == 0) {
                return this;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i) {
        return this.delegate.getValueAsInt(i);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong(long j) {
        return this.delegate.getValueAsLong(j);
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) {
        return this.delegate.getValueAsString(str);
    }
}
