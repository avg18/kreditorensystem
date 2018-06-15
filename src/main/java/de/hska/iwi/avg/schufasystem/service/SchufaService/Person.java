/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package de.hska.iwi.avg.schufasystem.service.SchufaService;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-06-05")
public class Person implements org.apache.thrift.TBase<Person, Person._Fields>, java.io.Serializable, Cloneable, Comparable<Person> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Person");

  private static final org.apache.thrift.protocol.TField PRENAME_FIELD_DESC = new org.apache.thrift.protocol.TField("prename", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SURNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("surname", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField AGE_FIELD_DESC = new org.apache.thrift.protocol.TField("age", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PersonStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PersonTupleSchemeFactory();

  public java.lang.String prename; // required
  public java.lang.String surname; // required
  public Int age; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRENAME((short)1, "prename"),
    SURNAME((short)2, "surname"),
    AGE((short)3, "age");

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
        case 1: // PRENAME
          return PRENAME;
        case 2: // SURNAME
          return SURNAME;
        case 3: // AGE
          return AGE;
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
  private static final _Fields optionals[] = {_Fields.AGE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRENAME, new org.apache.thrift.meta_data.FieldMetaData("prename", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SURNAME, new org.apache.thrift.meta_data.FieldMetaData("surname", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AGE, new org.apache.thrift.meta_data.FieldMetaData("age", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Int.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Person.class, metaDataMap);
  }

  public Person() {
  }

  public Person(
    java.lang.String prename,
    java.lang.String surname)
  {
    this();
    this.prename = prename;
    this.surname = surname;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Person(Person other) {
    if (other.isSetPrename()) {
      this.prename = other.prename;
    }
    if (other.isSetSurname()) {
      this.surname = other.surname;
    }
    if (other.isSetAge()) {
      this.age = new Int(other.age);
    }
  }

  public Person deepCopy() {
    return new Person(this);
  }

  @Override
  public void clear() {
    this.prename = null;
    this.surname = null;
    this.age = null;
  }

  public java.lang.String getPrename() {
    return this.prename;
  }

  public Person setPrename(java.lang.String prename) {
    this.prename = prename;
    return this;
  }

  public void unsetPrename() {
    this.prename = null;
  }

  /** Returns true if field prename is set (has been assigned a value) and false otherwise */
  public boolean isSetPrename() {
    return this.prename != null;
  }

  public void setPrenameIsSet(boolean value) {
    if (!value) {
      this.prename = null;
    }
  }

  public java.lang.String getSurname() {
    return this.surname;
  }

  public Person setSurname(java.lang.String surname) {
    this.surname = surname;
    return this;
  }

  public void unsetSurname() {
    this.surname = null;
  }

  /** Returns true if field surname is set (has been assigned a value) and false otherwise */
  public boolean isSetSurname() {
    return this.surname != null;
  }

  public void setSurnameIsSet(boolean value) {
    if (!value) {
      this.surname = null;
    }
  }

  public Int getAge() {
    return this.age;
  }

  public Person setAge(Int age) {
    this.age = age;
    return this;
  }

  public void unsetAge() {
    this.age = null;
  }

  /** Returns true if field age is set (has been assigned a value) and false otherwise */
  public boolean isSetAge() {
    return this.age != null;
  }

  public void setAgeIsSet(boolean value) {
    if (!value) {
      this.age = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case PRENAME:
      if (value == null) {
        unsetPrename();
      } else {
        setPrename((java.lang.String)value);
      }
      break;

    case SURNAME:
      if (value == null) {
        unsetSurname();
      } else {
        setSurname((java.lang.String)value);
      }
      break;

    case AGE:
      if (value == null) {
        unsetAge();
      } else {
        setAge((Int)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PRENAME:
      return getPrename();

    case SURNAME:
      return getSurname();

    case AGE:
      return getAge();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PRENAME:
      return isSetPrename();
    case SURNAME:
      return isSetSurname();
    case AGE:
      return isSetAge();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Person)
      return this.equals((Person)that);
    return false;
  }

  public boolean equals(Person that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_prename = true && this.isSetPrename();
    boolean that_present_prename = true && that.isSetPrename();
    if (this_present_prename || that_present_prename) {
      if (!(this_present_prename && that_present_prename))
        return false;
      if (!this.prename.equals(that.prename))
        return false;
    }

    boolean this_present_surname = true && this.isSetSurname();
    boolean that_present_surname = true && that.isSetSurname();
    if (this_present_surname || that_present_surname) {
      if (!(this_present_surname && that_present_surname))
        return false;
      if (!this.surname.equals(that.surname))
        return false;
    }

    boolean this_present_age = true && this.isSetAge();
    boolean that_present_age = true && that.isSetAge();
    if (this_present_age || that_present_age) {
      if (!(this_present_age && that_present_age))
        return false;
      if (!this.age.equals(that.age))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPrename()) ? 131071 : 524287);
    if (isSetPrename())
      hashCode = hashCode * 8191 + prename.hashCode();

    hashCode = hashCode * 8191 + ((isSetSurname()) ? 131071 : 524287);
    if (isSetSurname())
      hashCode = hashCode * 8191 + surname.hashCode();

    hashCode = hashCode * 8191 + ((isSetAge()) ? 131071 : 524287);
    if (isSetAge())
      hashCode = hashCode * 8191 + age.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Person other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPrename()).compareTo(other.isSetPrename());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrename()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.prename, other.prename);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSurname()).compareTo(other.isSetSurname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSurname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.surname, other.surname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAge()).compareTo(other.isSetAge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAge()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.age, other.age);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Person(");
    boolean first = true;

    sb.append("prename:");
    if (this.prename == null) {
      sb.append("null");
    } else {
      sb.append(this.prename);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("surname:");
    if (this.surname == null) {
      sb.append("null");
    } else {
      sb.append(this.surname);
    }
    first = false;
    if (isSetAge()) {
      if (!first) sb.append(", ");
      sb.append("age:");
      if (this.age == null) {
        sb.append("null");
      } else {
        sb.append(this.age);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (prename == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'prename' was not present! Struct: " + toString());
    }
    if (surname == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'surname' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (age != null) {
      age.validate();
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

  private static class PersonStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PersonStandardScheme getScheme() {
      return new PersonStandardScheme();
    }
  }

  private static class PersonStandardScheme extends org.apache.thrift.scheme.StandardScheme<Person> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Person struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRENAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.prename = iprot.readString();
              struct.setPrenameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SURNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.surname = iprot.readString();
              struct.setSurnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.age = new Int();
              struct.age.read(iprot);
              struct.setAgeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Person struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.prename != null) {
        oprot.writeFieldBegin(PRENAME_FIELD_DESC);
        oprot.writeString(struct.prename);
        oprot.writeFieldEnd();
      }
      if (struct.surname != null) {
        oprot.writeFieldBegin(SURNAME_FIELD_DESC);
        oprot.writeString(struct.surname);
        oprot.writeFieldEnd();
      }
      if (struct.age != null) {
        if (struct.isSetAge()) {
          oprot.writeFieldBegin(AGE_FIELD_DESC);
          struct.age.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PersonTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PersonTupleScheme getScheme() {
      return new PersonTupleScheme();
    }
  }

  private static class PersonTupleScheme extends org.apache.thrift.scheme.TupleScheme<Person> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Person struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.prename);
      oprot.writeString(struct.surname);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAge()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAge()) {
        struct.age.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Person struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.prename = iprot.readString();
      struct.setPrenameIsSet(true);
      struct.surname = iprot.readString();
      struct.setSurnameIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.age = new Int();
        struct.age.read(iprot);
        struct.setAgeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

