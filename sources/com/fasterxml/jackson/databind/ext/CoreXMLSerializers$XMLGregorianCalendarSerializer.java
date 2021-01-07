package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.Calendar;
import javax.xml.datatype.XMLGregorianCalendar;

public class CoreXMLSerializers$XMLGregorianCalendarSerializer extends StdSerializer<XMLGregorianCalendar> implements ContextualSerializer {
    final JsonSerializer<Object> _delegate;

    static {
        new CoreXMLSerializers$XMLGregorianCalendarSerializer();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreXMLSerializers$XMLGregorianCalendarSerializer() {
        super(XMLGregorianCalendar.class);
        CalendarSerializer calendarSerializer = CalendarSerializer.instance;
        this._delegate = calendarSerializer;
    }

    /* access modifiers changed from: protected */
    public Calendar _convert(XMLGregorianCalendar xMLGregorianCalendar) {
        if (xMLGregorianCalendar == null) {
            return null;
        }
        return xMLGregorianCalendar.toGregorianCalendar();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        this._delegate.acceptJsonFormatVisitor(jsonFormatVisitorWrapper, null);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer<?> handlePrimaryContextualization = serializerProvider.handlePrimaryContextualization(this._delegate, beanProperty);
        return handlePrimaryContextualization != this._delegate ? new CoreXMLSerializers$XMLGregorianCalendarSerializer(handlePrimaryContextualization) : this;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public JsonSerializer<?> getDelegatee() {
        return this._delegate;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        return this._delegate.isEmpty(serializerProvider, _convert((XMLGregorianCalendar) obj));
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        this._delegate.serialize(_convert((XMLGregorianCalendar) obj), jsonGenerator, serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        this._delegate.serializeWithType(_convert((XMLGregorianCalendar) obj), jsonGenerator, serializerProvider, typeSerializer);
    }

    protected CoreXMLSerializers$XMLGregorianCalendarSerializer(JsonSerializer<?> jsonSerializer) {
        super(XMLGregorianCalendar.class);
        this._delegate = jsonSerializer;
    }
}
