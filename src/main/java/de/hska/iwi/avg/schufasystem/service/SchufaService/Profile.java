/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package de.hska.iwi.avg.schufasystem.service.SchufaService;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-06-05")
public class Profile implements org.apache.thrift.TBase<Profile, Profile._Fields>, java.io.Serializable, Cloneable, Comparable<Profile> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Profile");

  private static final org.apache.thrift.protocol.TField P_FIELD_DESC = new org.apache.thrift.protocol.TField("p", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField DETAILS_FIELD_DESC = new org.apache.thrift.protocol.TField("details", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ProfileStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ProfileTupleSchemeFactory();

  public Person p; // required
  public java.util.Map<Business,java.lang.String> details; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    P((short)1, "p"),
    DETAILS((short)2, "details");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // P
          return P;
        case 2: // DETAILS
          return DETAILS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.P, new org.apache.thrift.meta_data.FieldMetaData("p", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Person.class)));
    tmpMap.put(_Fields.DETAILS, new org.apache.thrift.meta_data.FieldMetaData("details", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Business.class), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Profile.class, metaDataMap);
  }

  public Profile() {
  }

  public Profile(
    Person p,
    java.util.Map<Business,java.lang.String> details)
  {
    this();
    this.p = p;
    this.details = details;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Profile(Profile other) {
    if (other.isSetP()) {
      this.p = new Person(other.p);
    }
    if (other.isSetDetails()) {
      java.util.Map<Business,java.lang.String> __this__details = new java.util.EnumMap<Business,java.lang.String>(Business.class);
      for (java.util.Map.Entry<Business, java.lang.String> other_element : other.details.entrySet()) {

        Business other_element_key = other_element.getKey();
        java.lang.String other_element_value = other_element.getValue();

        Business __this__details_copy_key = other_element_key;

        java.lang.String __this__details_copy_value = other_element_value;

        __this__details.put(__this__details_copy_key, __this__details_copy_value);
      }
      this.details = __this__details;
    }
  }

  public Profile deepCopy() {
    return new Profile(this);
  }

  @Override
  public void clear() {
    this.p = null;
    this.details = null;
  }

  public Person getP() {
    return this.p;
  }

  public Profile setP(Person p) {
    this.p = p;
    return this;
  }

  public void unsetP() {
    this.p = null;
  }

  /** Returns true if field p is set (has been assigned a value) and false otherwise */
  public boolean isSetP() {
    return this.p != null;
  }

  public void setPIsSet(boolean value) {
    if (!value) {
      this.p = null;
    }
  }

  public int getDetailsSize() {
    return (this.details == null) ? 0 : this.details.size();
  }

  public void putToDetails(Business key, java.lang.String val) {
    if (this.details == null) {
      this.details = new java.util.EnumMap<Business,java.lang.String>(Business.class);
    }
    this.details.put(key, val);
  }

  public java.util.Map<Business,java.lang.String> getDetails() {
    return this.details;
  }

  public Profile setDetails(java.util.Map<Business,java.lang.String> details) {
    this.details = details;
    return this;
  }

  public void unsetDetails() {
    this.details = null;
  }

  /** Returns true if field details is set (has been assigned a value) and false otherwise */
  public boolean isSetDetails() {
    return this.details != null;
  }

  public void setDetailsIsSet(boolean value) {
    if (!value) {
      this.details = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case P:
      if (value == null) {
        unsetP();
      } else {
        setP((Person)value);
      }
      break;

    case DETAILS:
      if (value == null) {
        unsetDetails();
      } else {
        setDetails((java.util.Map<Business,java.lang.String>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case P:
      return getP();

    case DETAILS:
      return getDetails();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case P:
      return isSetP();
    case DETAILS:
      return isSetDetails();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Profile)
      return this.equals((Profile)that);
    return false;
  }

  public boolean equals(Profile that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_p = true && this.isSetP();
    boolean that_present_p = true && that.isSetP();
    if (this_present_p || that_present_p) {
      if (!(this_present_p && that_present_p))
        return false;
      if (!this.p.equals(that.p))
        return false;
    }

    boolean this_present_details = true && this.isSetDetails();
    boolean that_present_details = true && that.isSetDetails();
    if (this_present_details || that_present_details) {
      if (!(this_present_details && that_present_details))
        return false;
      if (!this.details.equals(that.details))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetP()) ? 131071 : 524287);
    if (isSetP())
      hashCode = hashCode * 8191 + p.hashCode();

    hashCode = hashCode * 8191 + ((isSetDetails()) ? 131071 : 524287);
    if (isSetDetails())
      hashCode = hashCode * 8191 + details.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Profile other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetP()).compareTo(other.isSetP());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetP()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.p, other.p);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDetails()).compareTo(other.isSetDetails());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDetails()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.details, other.details);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Profile(");
    boolean first = true;

    sb.append("p:");
    if (this.p == null) {
      sb.append("null");
    } else {
      sb.append(this.p);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("details:");
    if (this.details == null) {
      sb.append("null");
    } else {
      sb.append(this.details);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (p == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'p' was not present! Struct: " + toString());
    }
    if (details == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'details' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (p != null) {
      p.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProfileStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProfileStandardScheme getScheme() {
      return new ProfileStandardScheme();
    }
  }

  private static class ProfileStandardScheme extends org.apache.thrift.scheme.StandardScheme<Profile> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Profile struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // P
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.p = new Person();
              struct.p.read(iprot);
              struct.setPIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DETAILS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.details = new java.util.EnumMap<Business,java.lang.String>(Business.class);
                Business _key1;
                java.lang.String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = de.hska.iwi.avg.schufasystem.service.SchufaService.Business.findByValue(iprot.readI32());
                  _val2 = iprot.readString();
                  if (_key1 != null)
                  {
                    struct.details.put(_key1, _val2);
                  }
                }
                iprot.readMapEnd();
              }
              struct.setDetailsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Profile struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.p != null) {
        oprot.writeFieldBegin(P_FIELD_DESC);
        struct.p.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.details != null) {
        oprot.writeFieldBegin(DETAILS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, struct.details.size()));
          for (java.util.Map.Entry<Business, java.lang.String> _iter4 : struct.details.entrySet())
          {
            oprot.writeI32(_iter4.getKey().getValue());
            oprot.writeString(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProfileTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProfileTupleScheme getScheme() {
      return new ProfileTupleScheme();
    }
  }

  private static class ProfileTupleScheme extends org.apache.thrift.scheme.TupleScheme<Profile> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Profile struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.p.write(oprot);
      {
        oprot.writeI32(struct.details.size());
        for (java.util.Map.Entry<Business, java.lang.String> _iter5 : struct.details.entrySet())
        {
          oprot.writeI32(_iter5.getKey().getValue());
          oprot.writeString(_iter5.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Profile struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.p = new Person();
      struct.p.read(iprot);
      struct.setPIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.details = new java.util.EnumMap<Business,java.lang.String>(Business.class);
        Business _key7;
        java.lang.String _val8;
        for (int _i9 = 0; _i9 < _map6.size; ++_i9)
        {
          _key7 = de.hska.iwi.avg.schufasystem.service.SchufaService.Business.findByValue(iprot.readI32());
          _val8 = iprot.readString();
          if (_key7 != null)
          {
            struct.details.put(_key7, _val8);
          }
        }
      }
      struct.setDetailsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

