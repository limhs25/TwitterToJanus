/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package ch.trivadis.sample.twitter.avro.v1;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TwitterUserMentionEntity extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TwitterUserMentionEntity\",\"namespace\":\"ch.trivadis.sample.twitter.avro.v1\",\"fields\":[{\"name\":\"end\",\"type\":\"int\"},{\"name\":\"start\",\"type\":\"int\"},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"screenName\",\"type\":[\"string\",\"null\"]},{\"name\":\"id\",\"type\":\"long\"}],\"description\":\"A simpler representation of a Twitter4j UserMentionEntity object\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private int end;
   private int start;
   private java.lang.CharSequence name;
   private java.lang.CharSequence screenName;
   private long id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public TwitterUserMentionEntity() {}

  /**
   * All-args constructor.
   */
  public TwitterUserMentionEntity(java.lang.Integer end, java.lang.Integer start, java.lang.CharSequence name, java.lang.CharSequence screenName, java.lang.Long id) {
    this.end = end;
    this.start = start;
    this.name = name;
    this.screenName = screenName;
    this.id = id;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return end;
    case 1: return start;
    case 2: return name;
    case 3: return screenName;
    case 4: return id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: end = (java.lang.Integer)value$; break;
    case 1: start = (java.lang.Integer)value$; break;
    case 2: name = (java.lang.CharSequence)value$; break;
    case 3: screenName = (java.lang.CharSequence)value$; break;
    case 4: id = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'end' field.
   */
  public java.lang.Integer getEnd() {
    return end;
  }

  /**
   * Sets the value of the 'end' field.
   * @param value the value to set.
   */
  public void setEnd(java.lang.Integer value) {
    this.end = value;
  }

  /**
   * Gets the value of the 'start' field.
   */
  public java.lang.Integer getStart() {
    return start;
  }

  /**
   * Sets the value of the 'start' field.
   * @param value the value to set.
   */
  public void setStart(java.lang.Integer value) {
    this.start = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'screenName' field.
   */
  public java.lang.CharSequence getScreenName() {
    return screenName;
  }

  /**
   * Sets the value of the 'screenName' field.
   * @param value the value to set.
   */
  public void setScreenName(java.lang.CharSequence value) {
    this.screenName = value;
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.id = value;
  }

  /** Creates a new TwitterUserMentionEntity RecordBuilder */
  public static ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder newBuilder() {
    return new ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder();
  }
  
  /** Creates a new TwitterUserMentionEntity RecordBuilder by copying an existing Builder */
  public static ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder newBuilder(ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder other) {
    return new ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder(other);
  }
  
  /** Creates a new TwitterUserMentionEntity RecordBuilder by copying an existing TwitterUserMentionEntity instance */
  public static ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder newBuilder(ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity other) {
    return new ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder(other);
  }
  
  /**
   * RecordBuilder for TwitterUserMentionEntity instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TwitterUserMentionEntity>
    implements org.apache.avro.data.RecordBuilder<TwitterUserMentionEntity> {

    private int end;
    private int start;
    private java.lang.CharSequence name;
    private java.lang.CharSequence screenName;
    private long id;

    /** Creates a new Builder */
    private Builder() {
      super(ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.end)) {
        this.end = data().deepCopy(fields()[0].schema(), other.end);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.start)) {
        this.start = data().deepCopy(fields()[1].schema(), other.start);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.screenName)) {
        this.screenName = data().deepCopy(fields()[3].schema(), other.screenName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.id)) {
        this.id = data().deepCopy(fields()[4].schema(), other.id);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing TwitterUserMentionEntity instance */
    private Builder(ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity other) {
            super(ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.SCHEMA$);
      if (isValidValue(fields()[0], other.end)) {
        this.end = data().deepCopy(fields()[0].schema(), other.end);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.start)) {
        this.start = data().deepCopy(fields()[1].schema(), other.start);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.screenName)) {
        this.screenName = data().deepCopy(fields()[3].schema(), other.screenName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.id)) {
        this.id = data().deepCopy(fields()[4].schema(), other.id);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'end' field */
    public java.lang.Integer getEnd() {
      return end;
    }
    
    /** Sets the value of the 'end' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder setEnd(int value) {
      validate(fields()[0], value);
      this.end = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'end' field has been set */
    public boolean hasEnd() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'end' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder clearEnd() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'start' field */
    public java.lang.Integer getStart() {
      return start;
    }
    
    /** Sets the value of the 'start' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder setStart(int value) {
      validate(fields()[1], value);
      this.start = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'start' field has been set */
    public boolean hasStart() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'start' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder clearStart() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder setName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.name = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'name' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder clearName() {
      name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'screenName' field */
    public java.lang.CharSequence getScreenName() {
      return screenName;
    }
    
    /** Sets the value of the 'screenName' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder setScreenName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.screenName = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'screenName' field has been set */
    public boolean hasScreenName() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'screenName' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder clearScreenName() {
      screenName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'id' field */
    public java.lang.Long getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder setId(long value) {
      validate(fields()[4], value);
      this.id = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'id' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity.Builder clearId() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public TwitterUserMentionEntity build() {
      try {
        TwitterUserMentionEntity record = new TwitterUserMentionEntity();
        record.end = fieldSetFlags()[0] ? this.end : (java.lang.Integer) defaultValue(fields()[0]);
        record.start = fieldSetFlags()[1] ? this.start : (java.lang.Integer) defaultValue(fields()[1]);
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.screenName = fieldSetFlags()[3] ? this.screenName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.id = fieldSetFlags()[4] ? this.id : (java.lang.Long) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}