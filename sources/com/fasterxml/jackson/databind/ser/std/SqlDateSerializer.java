package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.sql.Date;
import java.text.DateFormat;

@JacksonStdImpl
public class SqlDateSerializer extends DateTimeSerializerBase<Date> {
    public SqlDateSerializer() {
        super(Date.class, null, null);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        long j;
        Date date = (Date) obj;
        if (_asTimestamp(serializerProvider)) {
            if (date == null) {
                j = 0;
            } else {
                j = date.getTime();
            }
            jsonGenerator.writeNumber(j);
        } else if (this._customFormat == null) {
            jsonGenerator.writeString(date.toString());
        } else {
            _serializeAsString(date, jsonGenerator, serializerProvider);
        }
    }

    /* Return type fixed from 'com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase' to match base method */
    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    public DateTimeSerializerBase<Date> withFormat(Boolean bool, DateFormat dateFormat) {
        return new SqlDateSerializer(bool, dateFormat);
    }

    protected SqlDateSerializer(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }
}
