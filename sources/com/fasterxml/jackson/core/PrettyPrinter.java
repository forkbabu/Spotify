package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.Separators;

public interface PrettyPrinter {
    public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
    public static final Separators DEFAULT_SEPARATORS = new Separators();

    void beforeArrayValues(JsonGenerator jsonGenerator);

    void beforeObjectEntries(JsonGenerator jsonGenerator);

    void writeArrayValueSeparator(JsonGenerator jsonGenerator);

    void writeEndArray(JsonGenerator jsonGenerator, int i);

    void writeEndObject(JsonGenerator jsonGenerator, int i);

    void writeObjectEntrySeparator(JsonGenerator jsonGenerator);

    void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator);

    void writeRootValueSeparator(JsonGenerator jsonGenerator);

    void writeStartArray(JsonGenerator jsonGenerator);

    void writeStartObject(JsonGenerator jsonGenerator);
}
