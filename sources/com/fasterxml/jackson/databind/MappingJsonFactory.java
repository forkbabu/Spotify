package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.ObjectCodec;

public class MappingJsonFactory extends JsonFactory {
    private static final long serialVersionUID = -1;

    public MappingJsonFactory() {
        super(null);
        setCodec(new ObjectMapper(this, null, null));
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public ObjectCodec getCodec() {
        return (ObjectMapper) this._objectCodec;
    }

    public MappingJsonFactory(ObjectMapper objectMapper) {
        super(objectMapper);
    }
}
