/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package ch.trivadis.sample.twitter.avro.v1;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TwitterStatusUpdate extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TwitterStatusUpdate\",\"namespace\":\"ch.trivadis.sample.twitter.avro.v1\",\"fields\":[{\"name\":\"createdAt\",\"type\":[\"string\",\"null\"]},{\"name\":\"createdAtAsLong\",\"type\":\"long\",\"default\":0},{\"name\":\"tweetId\",\"type\":\"long\",\"default\":-1},{\"name\":\"retweetCount\",\"type\":\"long\"},{\"name\":\"text\",\"type\":[\"string\",\"null\"]},{\"name\":\"isRetweet\",\"type\":\"boolean\"},{\"name\":\"coordinatesLatitude\",\"type\":\"double\"},{\"name\":\"coordinatesLongitude\",\"type\":\"double\"},{\"name\":\"hashtagEntities\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TwitterHashtagEntity\",\"fields\":[{\"name\":\"end\",\"type\":\"int\"},{\"name\":\"start\",\"type\":\"int\"},{\"name\":\"text\",\"type\":[\"string\",\"null\"]}],\"description\":\"A simpler representation of a Twitter4j HashtagEntity object\"}}},{\"name\":\"urlEntities\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TwitterURLEntity\",\"fields\":[{\"name\":\"displayURL\",\"type\":[\"string\",\"null\"]},{\"name\":\"end\",\"type\":\"int\"},{\"name\":\"start\",\"type\":\"int\"},{\"name\":\"URL\",\"type\":[\"string\",\"null\"]},{\"name\":\"expandedURL\",\"type\":[\"string\",\"null\"]}],\"description\":\"A simpler representation of a Twitter4j URLEntity object\"}}},{\"name\":\"userMentionEntities\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TwitterUserMentionEntity\",\"fields\":[{\"name\":\"end\",\"type\":\"int\"},{\"name\":\"start\",\"type\":\"int\"},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"screenName\",\"type\":[\"string\",\"null\"]},{\"name\":\"id\",\"type\":\"long\"}],\"description\":\"A simpler representation of a Twitter4j UserMentionEntity object\"}}},{\"name\":\"User\",\"type\":{\"type\":\"record\",\"name\":\"TwitterUser\",\"fields\":[{\"name\":\"id\",\"type\":\"long\",\"default\":-1},{\"name\":\"screenName\",\"type\":[\"string\",\"null\"]},{\"name\":\"followersCount\",\"type\":\"int\"},{\"name\":\"friendsCount\",\"type\":\"int\"},{\"name\":\"profileImageURL\",\"type\":[\"string\",\"null\"]}]},\"description\":\"A simpler representation of a Twitter4j User object\"}],\"description\":\"A simpler representation of a Twitter4j Status object\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.CharSequence createdAt;
   private long createdAtAsLong;
   private long tweetId;
   private long retweetCount;
   private java.lang.CharSequence text;
   private boolean isRetweet;
   private double coordinatesLatitude;
   private double coordinatesLongitude;
   private java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterHashtagEntity> hashtagEntities;
   private java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterURLEntity> urlEntities;
   private java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity> userMentionEntities;
   private ch.trivadis.sample.twitter.avro.v1.TwitterUser User;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public TwitterStatusUpdate() {}

  /**
   * All-args constructor.
   */
  public TwitterStatusUpdate(java.lang.CharSequence createdAt, java.lang.Long createdAtAsLong, java.lang.Long tweetId, java.lang.Long retweetCount, java.lang.CharSequence text, java.lang.Boolean isRetweet, java.lang.Double coordinatesLatitude, java.lang.Double coordinatesLongitude, java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterHashtagEntity> hashtagEntities, java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterURLEntity> urlEntities, java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity> userMentionEntities, ch.trivadis.sample.twitter.avro.v1.TwitterUser User) {
    this.createdAt = createdAt;
    this.createdAtAsLong = createdAtAsLong;
    this.tweetId = tweetId;
    this.retweetCount = retweetCount;
    this.text = text;
    this.isRetweet = isRetweet;
    this.coordinatesLatitude = coordinatesLatitude;
    this.coordinatesLongitude = coordinatesLongitude;
    this.hashtagEntities = hashtagEntities;
    this.urlEntities = urlEntities;
    this.userMentionEntities = userMentionEntities;
    this.User = User;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return createdAt;
    case 1: return createdAtAsLong;
    case 2: return tweetId;
    case 3: return retweetCount;
    case 4: return text;
    case 5: return isRetweet;
    case 6: return coordinatesLatitude;
    case 7: return coordinatesLongitude;
    case 8: return hashtagEntities;
    case 9: return urlEntities;
    case 10: return userMentionEntities;
    case 11: return User;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: createdAt = (java.lang.CharSequence)value$; break;
    case 1: createdAtAsLong = (java.lang.Long)value$; break;
    case 2: tweetId = (java.lang.Long)value$; break;
    case 3: retweetCount = (java.lang.Long)value$; break;
    case 4: text = (java.lang.CharSequence)value$; break;
    case 5: isRetweet = (java.lang.Boolean)value$; break;
    case 6: coordinatesLatitude = (java.lang.Double)value$; break;
    case 7: coordinatesLongitude = (java.lang.Double)value$; break;
    case 8: hashtagEntities = (java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterHashtagEntity>)value$; break;
    case 9: urlEntities = (java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterURLEntity>)value$; break;
    case 10: userMentionEntities = (java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity>)value$; break;
    case 11: User = (ch.trivadis.sample.twitter.avro.v1.TwitterUser)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'createdAt' field.
   */
  public java.lang.CharSequence getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the value of the 'createdAt' field.
   * @param value the value to set.
   */
  public void setCreatedAt(java.lang.CharSequence value) {
    this.createdAt = value;
  }

  /**
   * Gets the value of the 'createdAtAsLong' field.
   */
  public java.lang.Long getCreatedAtAsLong() {
    return createdAtAsLong;
  }

  /**
   * Sets the value of the 'createdAtAsLong' field.
   * @param value the value to set.
   */
  public void setCreatedAtAsLong(java.lang.Long value) {
    this.createdAtAsLong = value;
  }

  /**
   * Gets the value of the 'tweetId' field.
   */
  public java.lang.Long getTweetId() {
    return tweetId;
  }

  /**
   * Sets the value of the 'tweetId' field.
   * @param value the value to set.
   */
  public void setTweetId(java.lang.Long value) {
    this.tweetId = value;
  }

  /**
   * Gets the value of the 'retweetCount' field.
   */
  public java.lang.Long getRetweetCount() {
    return retweetCount;
  }

  /**
   * Sets the value of the 'retweetCount' field.
   * @param value the value to set.
   */
  public void setRetweetCount(java.lang.Long value) {
    this.retweetCount = value;
  }

  /**
   * Gets the value of the 'text' field.
   */
  public java.lang.CharSequence getText() {
    return text;
  }

  /**
   * Sets the value of the 'text' field.
   * @param value the value to set.
   */
  public void setText(java.lang.CharSequence value) {
    this.text = value;
  }

  /**
   * Gets the value of the 'isRetweet' field.
   */
  public java.lang.Boolean getIsRetweet() {
    return isRetweet;
  }

  /**
   * Sets the value of the 'isRetweet' field.
   * @param value the value to set.
   */
  public void setIsRetweet(java.lang.Boolean value) {
    this.isRetweet = value;
  }

  /**
   * Gets the value of the 'coordinatesLatitude' field.
   */
  public java.lang.Double getCoordinatesLatitude() {
    return coordinatesLatitude;
  }

  /**
   * Sets the value of the 'coordinatesLatitude' field.
   * @param value the value to set.
   */
  public void setCoordinatesLatitude(java.lang.Double value) {
    this.coordinatesLatitude = value;
  }

  /**
   * Gets the value of the 'coordinatesLongitude' field.
   */
  public java.lang.Double getCoordinatesLongitude() {
    return coordinatesLongitude;
  }

  /**
   * Sets the value of the 'coordinatesLongitude' field.
   * @param value the value to set.
   */
  public void setCoordinatesLongitude(java.lang.Double value) {
    this.coordinatesLongitude = value;
  }

  /**
   * Gets the value of the 'hashtagEntities' field.
   */
  public java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterHashtagEntity> getHashtagEntities() {
    return hashtagEntities;
  }

  /**
   * Sets the value of the 'hashtagEntities' field.
   * @param value the value to set.
   */
  public void setHashtagEntities(java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterHashtagEntity> value) {
    this.hashtagEntities = value;
  }

  /**
   * Gets the value of the 'urlEntities' field.
   */
  public java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterURLEntity> getUrlEntities() {
    return urlEntities;
  }

  /**
   * Sets the value of the 'urlEntities' field.
   * @param value the value to set.
   */
  public void setUrlEntities(java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterURLEntity> value) {
    this.urlEntities = value;
  }

  /**
   * Gets the value of the 'userMentionEntities' field.
   */
  public java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity> getUserMentionEntities() {
    return userMentionEntities;
  }

  /**
   * Sets the value of the 'userMentionEntities' field.
   * @param value the value to set.
   */
  public void setUserMentionEntities(java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity> value) {
    this.userMentionEntities = value;
  }

  /**
   * Gets the value of the 'User' field.
   */
  public ch.trivadis.sample.twitter.avro.v1.TwitterUser getUser() {
    return User;
  }

  /**
   * Sets the value of the 'User' field.
   * @param value the value to set.
   */
  public void setUser(ch.trivadis.sample.twitter.avro.v1.TwitterUser value) {
    this.User = value;
  }

  /** Creates a new TwitterStatusUpdate RecordBuilder */
  public static ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder newBuilder() {
    return new ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder();
  }
  
  /** Creates a new TwitterStatusUpdate RecordBuilder by copying an existing Builder */
  public static ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder newBuilder(ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder other) {
    return new ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder(other);
  }
  
  /** Creates a new TwitterStatusUpdate RecordBuilder by copying an existing TwitterStatusUpdate instance */
  public static ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder newBuilder(ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate other) {
    return new ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder(other);
  }
  
  /**
   * RecordBuilder for TwitterStatusUpdate instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TwitterStatusUpdate>
    implements org.apache.avro.data.RecordBuilder<TwitterStatusUpdate> {

    private java.lang.CharSequence createdAt;
    private long createdAtAsLong;
    private long tweetId;
    private long retweetCount;
    private java.lang.CharSequence text;
    private boolean isRetweet;
    private double coordinatesLatitude;
    private double coordinatesLongitude;
    private java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterHashtagEntity> hashtagEntities;
    private java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterURLEntity> urlEntities;
    private java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity> userMentionEntities;
    private ch.trivadis.sample.twitter.avro.v1.TwitterUser User;

    /** Creates a new Builder */
    private Builder() {
      super(ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[0].schema(), other.createdAt);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.createdAtAsLong)) {
        this.createdAtAsLong = data().deepCopy(fields()[1].schema(), other.createdAtAsLong);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tweetId)) {
        this.tweetId = data().deepCopy(fields()[2].schema(), other.tweetId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.retweetCount)) {
        this.retweetCount = data().deepCopy(fields()[3].schema(), other.retweetCount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.text)) {
        this.text = data().deepCopy(fields()[4].schema(), other.text);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.isRetweet)) {
        this.isRetweet = data().deepCopy(fields()[5].schema(), other.isRetweet);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.coordinatesLatitude)) {
        this.coordinatesLatitude = data().deepCopy(fields()[6].schema(), other.coordinatesLatitude);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.coordinatesLongitude)) {
        this.coordinatesLongitude = data().deepCopy(fields()[7].schema(), other.coordinatesLongitude);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.hashtagEntities)) {
        this.hashtagEntities = data().deepCopy(fields()[8].schema(), other.hashtagEntities);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.urlEntities)) {
        this.urlEntities = data().deepCopy(fields()[9].schema(), other.urlEntities);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.userMentionEntities)) {
        this.userMentionEntities = data().deepCopy(fields()[10].schema(), other.userMentionEntities);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.User)) {
        this.User = data().deepCopy(fields()[11].schema(), other.User);
        fieldSetFlags()[11] = true;
      }
    }
    
    /** Creates a Builder by copying an existing TwitterStatusUpdate instance */
    private Builder(ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate other) {
            super(ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.SCHEMA$);
      if (isValidValue(fields()[0], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[0].schema(), other.createdAt);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.createdAtAsLong)) {
        this.createdAtAsLong = data().deepCopy(fields()[1].schema(), other.createdAtAsLong);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tweetId)) {
        this.tweetId = data().deepCopy(fields()[2].schema(), other.tweetId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.retweetCount)) {
        this.retweetCount = data().deepCopy(fields()[3].schema(), other.retweetCount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.text)) {
        this.text = data().deepCopy(fields()[4].schema(), other.text);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.isRetweet)) {
        this.isRetweet = data().deepCopy(fields()[5].schema(), other.isRetweet);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.coordinatesLatitude)) {
        this.coordinatesLatitude = data().deepCopy(fields()[6].schema(), other.coordinatesLatitude);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.coordinatesLongitude)) {
        this.coordinatesLongitude = data().deepCopy(fields()[7].schema(), other.coordinatesLongitude);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.hashtagEntities)) {
        this.hashtagEntities = data().deepCopy(fields()[8].schema(), other.hashtagEntities);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.urlEntities)) {
        this.urlEntities = data().deepCopy(fields()[9].schema(), other.urlEntities);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.userMentionEntities)) {
        this.userMentionEntities = data().deepCopy(fields()[10].schema(), other.userMentionEntities);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.User)) {
        this.User = data().deepCopy(fields()[11].schema(), other.User);
        fieldSetFlags()[11] = true;
      }
    }

    /** Gets the value of the 'createdAt' field */
    public java.lang.CharSequence getCreatedAt() {
      return createdAt;
    }
    
    /** Sets the value of the 'createdAt' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder setCreatedAt(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.createdAt = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'createdAt' field has been set */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'createdAt' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder clearCreatedAt() {
      createdAt = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'createdAtAsLong' field */
    public java.lang.Long getCreatedAtAsLong() {
      return createdAtAsLong;
    }
    
    /** Sets the value of the 'createdAtAsLong' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder setCreatedAtAsLong(long value) {
      validate(fields()[1], value);
      this.createdAtAsLong = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'createdAtAsLong' field has been set */
    public boolean hasCreatedAtAsLong() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'createdAtAsLong' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder clearCreatedAtAsLong() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'tweetId' field */
    public java.lang.Long getTweetId() {
      return tweetId;
    }
    
    /** Sets the value of the 'tweetId' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder setTweetId(long value) {
      validate(fields()[2], value);
      this.tweetId = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'tweetId' field has been set */
    public boolean hasTweetId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'tweetId' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder clearTweetId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'retweetCount' field */
    public java.lang.Long getRetweetCount() {
      return retweetCount;
    }
    
    /** Sets the value of the 'retweetCount' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder setRetweetCount(long value) {
      validate(fields()[3], value);
      this.retweetCount = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'retweetCount' field has been set */
    public boolean hasRetweetCount() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'retweetCount' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder clearRetweetCount() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'text' field */
    public java.lang.CharSequence getText() {
      return text;
    }
    
    /** Sets the value of the 'text' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder setText(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.text = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'text' field has been set */
    public boolean hasText() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'text' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder clearText() {
      text = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'isRetweet' field */
    public java.lang.Boolean getIsRetweet() {
      return isRetweet;
    }
    
    /** Sets the value of the 'isRetweet' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder setIsRetweet(boolean value) {
      validate(fields()[5], value);
      this.isRetweet = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'isRetweet' field has been set */
    public boolean hasIsRetweet() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'isRetweet' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder clearIsRetweet() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'coordinatesLatitude' field */
    public java.lang.Double getCoordinatesLatitude() {
      return coordinatesLatitude;
    }
    
    /** Sets the value of the 'coordinatesLatitude' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder setCoordinatesLatitude(double value) {
      validate(fields()[6], value);
      this.coordinatesLatitude = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'coordinatesLatitude' field has been set */
    public boolean hasCoordinatesLatitude() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'coordinatesLatitude' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder clearCoordinatesLatitude() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'coordinatesLongitude' field */
    public java.lang.Double getCoordinatesLongitude() {
      return coordinatesLongitude;
    }
    
    /** Sets the value of the 'coordinatesLongitude' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder setCoordinatesLongitude(double value) {
      validate(fields()[7], value);
      this.coordinatesLongitude = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'coordinatesLongitude' field has been set */
    public boolean hasCoordinatesLongitude() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'coordinatesLongitude' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder clearCoordinatesLongitude() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'hashtagEntities' field */
    public java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterHashtagEntity> getHashtagEntities() {
      return hashtagEntities;
    }
    
    /** Sets the value of the 'hashtagEntities' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder setHashtagEntities(java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterHashtagEntity> value) {
      validate(fields()[8], value);
      this.hashtagEntities = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'hashtagEntities' field has been set */
    public boolean hasHashtagEntities() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'hashtagEntities' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder clearHashtagEntities() {
      hashtagEntities = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'urlEntities' field */
    public java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterURLEntity> getUrlEntities() {
      return urlEntities;
    }
    
    /** Sets the value of the 'urlEntities' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder setUrlEntities(java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterURLEntity> value) {
      validate(fields()[9], value);
      this.urlEntities = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'urlEntities' field has been set */
    public boolean hasUrlEntities() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'urlEntities' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder clearUrlEntities() {
      urlEntities = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'userMentionEntities' field */
    public java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity> getUserMentionEntities() {
      return userMentionEntities;
    }
    
    /** Sets the value of the 'userMentionEntities' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder setUserMentionEntities(java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity> value) {
      validate(fields()[10], value);
      this.userMentionEntities = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'userMentionEntities' field has been set */
    public boolean hasUserMentionEntities() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'userMentionEntities' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder clearUserMentionEntities() {
      userMentionEntities = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'User' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterUser getUser() {
      return User;
    }
    
    /** Sets the value of the 'User' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder setUser(ch.trivadis.sample.twitter.avro.v1.TwitterUser value) {
      validate(fields()[11], value);
      this.User = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'User' field has been set */
    public boolean hasUser() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'User' field */
    public ch.trivadis.sample.twitter.avro.v1.TwitterStatusUpdate.Builder clearUser() {
      User = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    public TwitterStatusUpdate build() {
      try {
        TwitterStatusUpdate record = new TwitterStatusUpdate();
        record.createdAt = fieldSetFlags()[0] ? this.createdAt : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.createdAtAsLong = fieldSetFlags()[1] ? this.createdAtAsLong : (java.lang.Long) defaultValue(fields()[1]);
        record.tweetId = fieldSetFlags()[2] ? this.tweetId : (java.lang.Long) defaultValue(fields()[2]);
        record.retweetCount = fieldSetFlags()[3] ? this.retweetCount : (java.lang.Long) defaultValue(fields()[3]);
        record.text = fieldSetFlags()[4] ? this.text : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.isRetweet = fieldSetFlags()[5] ? this.isRetweet : (java.lang.Boolean) defaultValue(fields()[5]);
        record.coordinatesLatitude = fieldSetFlags()[6] ? this.coordinatesLatitude : (java.lang.Double) defaultValue(fields()[6]);
        record.coordinatesLongitude = fieldSetFlags()[7] ? this.coordinatesLongitude : (java.lang.Double) defaultValue(fields()[7]);
        record.hashtagEntities = fieldSetFlags()[8] ? this.hashtagEntities : (java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterHashtagEntity>) defaultValue(fields()[8]);
        record.urlEntities = fieldSetFlags()[9] ? this.urlEntities : (java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterURLEntity>) defaultValue(fields()[9]);
        record.userMentionEntities = fieldSetFlags()[10] ? this.userMentionEntities : (java.util.List<ch.trivadis.sample.twitter.avro.v1.TwitterUserMentionEntity>) defaultValue(fields()[10]);
        record.User = fieldSetFlags()[11] ? this.User : (ch.trivadis.sample.twitter.avro.v1.TwitterUser) defaultValue(fields()[11]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
