package se.fk.rimfrost.framework.regel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SpecVersion
{
   V1("1.0");

   private String value;

   private SpecVersion(String value)
   {
      this.value = value;
   }

   @JsonValue
   public String getValue()
   {
      return this.value;
   }

   @JsonCreator
   public static SpecVersion fromValue(String value)
   {
      for (SpecVersion e : values())
      {
         if (e.value.equals(value))
         {
            return e;
         }
      }

      throw new IllegalArgumentException("Unexpected value '" + value + "'");
   }

   public String toString()
   {
      return String.valueOf(this.value);
   }
}
