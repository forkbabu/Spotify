package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationContext;

public interface NullValueProvider {
    Object getNullValue(DeserializationContext deserializationContext);
}
